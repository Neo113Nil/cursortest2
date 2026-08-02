package org.modelmapper.internal.bytebuddy.implementation.auxiliary;

import com.google.firebase.dynamiclinks.DynamicLink;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import org.modelmapper.internal.bytebuddy.implementation.FieldAccessor;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.implementation.MethodCall;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;

/* loaded from: classes4.dex */
public enum PrivilegedMemberLookupAction implements AuxiliaryType {
    FOR_PUBLIC_METHOD("getMethod", "name", String.class, DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, Class[].class),
    FOR_DECLARED_METHOD("getDeclaredMethod", "name", String.class, DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, Class[].class),
    FOR_PUBLIC_CONSTRUCTOR("getConstructor", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, Class[].class),
    FOR_DECLARED_CONSTRUCTOR(TypeProxy.SilentConstruction.Appender.GET_DECLARED_CONSTRUCTOR_METHOD_NAME, DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, Class[].class);

    private static final MethodDescription.InDefinedShape DEFAULT_CONSTRUCTOR = (MethodDescription.InDefinedShape) TypeDescription.OBJECT.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();
    private static final String TYPE_FIELD = "type";
    private final Map<String, Class<?>> fields;
    private final MethodDescription.InDefinedShape methodDescription;

    PrivilegedMemberLookupAction(String str, String str2, Class cls) {
        try {
            this.methodDescription = new MethodDescription.ForLoadedMethod(Class.class.getMethod(str, cls));
            this.fields = Collections.singletonMap(str2, cls);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Could not locate method: " + str, e);
        }
    }

    PrivilegedMemberLookupAction(String str, String str2, Class cls, String str3, Class cls2) {
        try {
            this.methodDescription = new MethodDescription.ForLoadedMethod(Class.class.getMethod(str, cls, cls2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.fields = linkedHashMap;
            linkedHashMap.put(str2, cls);
            linkedHashMap.put(str3, cls2);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Could not locate method: " + str, e);
        }
    }

    public static AuxiliaryType of(MethodDescription methodDescription) {
        if (methodDescription.isConstructor()) {
            return methodDescription.isPublic() ? FOR_PUBLIC_CONSTRUCTOR : FOR_DECLARED_CONSTRUCTOR;
        }
        if (methodDescription.isMethod()) {
            return methodDescription.isPublic() ? FOR_PUBLIC_METHOD : FOR_DECLARED_METHOD;
        }
        throw new IllegalStateException("Cannot load constant for type initializer: " + methodDescription);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType
    public DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
        Implementation.Composable andThen = MethodCall.invoke(DEFAULT_CONSTRUCTOR).andThen(FieldAccessor.ofField("type").setsArgumentAt(0));
        Iterator<String> it = this.fields.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            andThen = andThen.andThen(FieldAccessor.ofField(it.next()).setsArgumentAt(i));
            i++;
        }
        DynamicType.Builder defineField = new ByteBuddy(classFileVersion).with(TypeValidation.DISABLED).subclass(PrivilegedExceptionAction.class, (ConstructorStrategy) ConstructorStrategy.Default.NO_CONSTRUCTORS).name(str).modifiers(DEFAULT_TYPE_MODIFIER).defineConstructor(Visibility.PUBLIC).withParameters(CompoundList.of(Class.class, new ArrayList(this.fields.values()))).intercept(andThen).method(ElementMatchers.named("run")).intercept(MethodCall.invoke(this.methodDescription).onField("type").withField((String[]) this.fields.keySet().toArray(new String[this.fields.size()]))).defineField("type", Class.class, Visibility.PRIVATE);
        for (Map.Entry<String, Class<?>> entry : this.fields.entrySet()) {
            defineField = defineField.defineField(entry.getKey(), entry.getValue(), Visibility.PRIVATE);
        }
        return defineField.make();
    }
}
