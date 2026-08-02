package org.modelmapper.internal;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.ConfigurationException;
import org.modelmapper.MappingException;
import org.modelmapper.TypeMap;
import org.modelmapper.ValidationException;
import org.modelmapper.internal.util.Strings;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.ErrorMessage;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyMapping;

/* loaded from: classes4.dex */
public final class Errors {
    private static final Converter<?>[] converters = {new Converter<Class>(Class.class) { // from class: org.modelmapper.internal.Errors.1
        @Override // org.modelmapper.internal.Errors.Converter
        public String toString(Class cls) {
            return cls.getName();
        }
    }, new Converter<Member>(Member.class) { // from class: org.modelmapper.internal.Errors.2
        @Override // org.modelmapper.internal.Errors.Converter
        public String toString(Member member) {
            return Types.toString(member);
        }
    }, new Converter<PropertyInfo>(PropertyInfo.class) { // from class: org.modelmapper.internal.Errors.3
        @Override // org.modelmapper.internal.Errors.Converter
        public String toString(PropertyInfo propertyInfo) {
            return Types.toString(propertyInfo.getMember());
        }
    }, new Converter<Collection>(Collection.class) { // from class: org.modelmapper.internal.Errors.4
        @Override // org.modelmapper.internal.Errors.Converter
        public String toString(Collection collection) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Object obj : collection) {
                if (z) {
                    z = false;
                } else {
                    sb.append("\n");
                }
                sb.append("\t").append(Errors.convert(obj));
            }
            return sb.toString();
        }
    }};
    private List<ErrorMessage> errors;

    private static abstract class Converter<T> {
        final Class<T> type;

        abstract String toString(T t);

        Converter(Class<T> cls) {
            this.type = cls;
        }

        boolean appliesTo(Object obj) {
            return obj != null && this.type.isAssignableFrom(obj.getClass());
        }

        String convert(Object obj) {
            return toString(this.type.cast(obj));
        }
    }

    public static String format(String str, Collection<ErrorMessage> collection) {
        Formatter format = new Formatter().format(str, new Object[0]).format(":%n%n", new Object[0]);
        boolean z = getOnlyCause(collection) == null;
        int i = 1;
        for (ErrorMessage errorMessage : collection) {
            int i2 = i + 1;
            format.format("%s) %s%n", Integer.valueOf(i), errorMessage.getMessage());
            Throwable cause = errorMessage.getCause();
            if (z && cause != null) {
                StringWriter stringWriter = new StringWriter();
                cause.printStackTrace(new PrintWriter(stringWriter));
                format.format("Caused by: %s", stringWriter.getBuffer());
            }
            format.format("%n", new Object[0]);
            i = i2;
        }
        if (collection.size() == 1) {
            format.format("1 error", new Object[0]);
        } else {
            format.format("%s errors", Integer.valueOf(collection.size()));
        }
        return format.toString();
    }

    public static String format(String str, Object... objArr) {
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = convert(objArr[i]);
        }
        return String.format(str, objArr);
    }

    public static Throwable getOnlyCause(Collection<ErrorMessage> collection) {
        Iterator<ErrorMessage> it = collection.iterator();
        Throwable th = null;
        while (it.hasNext()) {
            Throwable cause = it.next().getCause();
            if (cause != null) {
                if (th != null) {
                    return null;
                }
                th = cause;
            }
        }
        return th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object convert(Object obj) {
        for (Converter<?> converter : converters) {
            if (converter.appliesTo(obj)) {
                return converter.convert(obj);
            }
        }
        return obj;
    }

    public Errors addMessage(Throwable th, String str, Object... objArr) {
        addMessage(new ErrorMessage(format(str, objArr), th));
        return this;
    }

    public Errors addMessage(ErrorMessage errorMessage) {
        if (this.errors == null) {
            this.errors = new ArrayList();
        }
        this.errors.add(errorMessage);
        return this;
    }

    public Errors addMessage(String str, Object... objArr) {
        return addMessage(null, str, objArr);
    }

    public Errors errorGettingValue(Member member, Throwable th) {
        return addMessage(th, "Failed to get value from %s", member);
    }

    public Errors errorInstantiatingDestination(Class<?> cls, Throwable th) {
        return addMessage(th, "Failed to instantiate instance of destination %s. Ensure that %s has a non-private no-argument constructor.", cls, cls);
    }

    public Errors errorMapping(Object obj, Class<?> cls) {
        return addMessage("Error mapping %s to %s", obj, Types.toString(cls));
    }

    public Errors errorMapping(Object obj, Type type, Throwable th) {
        return addMessage(th, "Error mapping %s to %s", obj, Types.toString(type));
    }

    public Errors errorSettingValue(Member member, Object obj, Throwable th) {
        return addMessage(th, "Failed to set value '%s' on %s", obj, member);
    }

    public Errors errorTooLarge(Object obj, Class<?> cls) {
        return addMessage("Value '%s' is too large for %s", obj, Types.toString(cls));
    }

    public Errors errorTooSmall(Object obj, Class<?> cls) {
        return addMessage("Value '%s' is too small for %s", obj, Types.toString(cls));
    }

    public Errors errorUnmappedProperties(TypeMap<?, ?> typeMap, List<PropertyInfo> list) {
        return addMessage("Unmapped destination properties found in %s:\n\n%s", typeMap, list);
    }

    public Errors errorUnsupportedMapping(Class<?> cls, Class<?> cls2) {
        return addMessage("Missing type map configuration or unsupported mapping for %s to %s.", cls, cls2);
    }

    public List<ErrorMessage> getMessages() {
        List<ErrorMessage> list = this.errors;
        return list == null ? Collections.emptyList() : list;
    }

    public boolean hasErrors() {
        return this.errors != null;
    }

    public Errors invalidProvidedDestinationInstance(Object obj, Class<?> cls) {
        return addMessage("The provided destination instance %s is not of the required type %s.", obj, cls);
    }

    public Errors merge(Collection<ErrorMessage> collection) {
        Iterator<ErrorMessage> it = collection.iterator();
        while (it.hasNext()) {
            addMessage(it.next());
        }
        return this;
    }

    public Errors merge(Errors errors) {
        Iterator<ErrorMessage> it = errors.getMessages().iterator();
        while (it.hasNext()) {
            addMessage(it.next());
        }
        return this;
    }

    public void throwConfigurationExceptionIfErrorsExist() {
        if (hasErrors()) {
            throw new ConfigurationException(getMessages());
        }
    }

    public void throwValidationExceptionIfErrorsExist() {
        if (hasErrors()) {
            throw new ValidationException(getMessages());
        }
    }

    public ConfigurationException toConfigurationException() {
        return new ConfigurationException(getMessages());
    }

    public ErrorsException toException() {
        return new ErrorsException(this);
    }

    public MappingException toMappingException() {
        return new MappingException(getMessages());
    }

    Errors ambiguousDestination(List<? extends PropertyMapping> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends PropertyMapping> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Strings.joinMembers(it.next().getSourceProperties()));
        }
        return addMessage("The destination property %s matches multiple source property hierarchies:\n\n%s", Strings.joinMembers(list.get(0).getDestinationProperties()), arrayList);
    }

    Errors conditionalSkipWithoutSource() {
        return addMessage("A conditional skip can only be used with skip(Object, Object).", new Object[0]);
    }

    Errors duplicateMapping(PropertyInfo propertyInfo) {
        return addMessage("A mapping already exists for %s.", propertyInfo);
    }

    Errors errorAccessingConfigure(Throwable th) {
        return addMessage(th, "Failed to access PropertyMap.configure().", new Object[0]);
    }

    Errors errorAccessingProperty(PropertyInfo propertyInfo) {
        return addMessage("Failed to access %s.", propertyInfo);
    }

    Errors errorConverting(org.modelmapper.Converter<?, ?> converter, Class<?> cls, Class<?> cls2, Throwable th) {
        return addMessage(th, "Converter %s failed to convert %s to %s.", converter, cls, cls2);
    }

    Errors errorEnhancingClass(Class<?> cls, Throwable th) {
        return addMessage(th, "Failed to generate proxy class for %s. Ensure that %s has a non-private constructor.", cls, cls);
    }

    Errors errorInstantiatingProxy(Class<?> cls, Throwable th) {
        return addMessage(th, "Failed to instantiate proxied instance of %s. Ensure that %s has a non-private constructor.", cls, cls);
    }

    Errors errorResolvingClass(Throwable th, String str) {
        return addMessage("Error resolving class %s", str);
    }

    Errors errorReadingClass(Throwable th, String str) {
        return addMessage("Error reading class %s", str);
    }

    Errors errorInvalidSourcePath(String str, Class<?> cls, String str2) {
        return addMessage("The source path %s is invalid: %s.%s cannot be resolved.", str, cls, str2);
    }

    Errors errorInvalidDestinationPath(String str, Class<?> cls, String str2) {
        return addMessage("The destination path %s is invalid: %s.%s cannot be resolved.", str, cls, str2);
    }

    Errors errorNullArgument(String str) {
        return addMessage("The %s cannot be null", str);
    }

    Errors invalidDestinationMethod(Method method) {
        return addMessage("Invalid destination method %s. Ensure that method has one parameter and returns void.", method);
    }

    Errors invalidDestinationField(Field field) {
        return addMessage("Invalid destination field %s. Ensure that field is not static.", field);
    }

    Errors invalidSourceMethod(Method method) {
        return addMessage("Invalid source method %s. Ensure that method has zero parameters and does not return void.", method);
    }

    Errors invalidSourceField(Field field) {
        return addMessage("Invalid source field %s. Ensure that field is not static.", field);
    }

    Errors invocationAgainstFinalClass(Class<?> cls) {
        return addMessage("Cannot map final type %s.", cls);
    }

    Errors invocationAgainstFinalMethod(Member member) {
        return addMessage("Cannot map final method %s.", member);
    }

    Errors mappingForEnum() {
        return addMessage("Cannot create mapping for enum.", new Object[0]);
    }

    Errors missingDestination() {
        return addMessage("A mapping is missing a required destination member.", new Object[0]);
    }

    Errors missingMutatorForAccessor(Method method) {
        return addMessage("No corresponding mutator was found for %s.", method);
    }

    Errors missingSource() {
        return addMessage("A mapping is missing a required source member.", new Object[0]);
    }

    Errors sourceOutsideOfMap() {
        return addMessage("'source' cannot be used outside of a map statement.", new Object[0]);
    }

    void throwMappingExceptionIfErrorsExist() {
        if (hasErrors()) {
            throw new MappingException(getMessages());
        }
    }
}
