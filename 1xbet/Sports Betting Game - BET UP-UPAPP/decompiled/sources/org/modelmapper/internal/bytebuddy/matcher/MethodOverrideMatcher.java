package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class MethodOverrideMatcher<T extends MethodDescription> extends ElementMatcher.Junction.AbstractBase<T> {
    private final ElementMatcher<? super TypeDescription.Generic> matcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((MethodOverrideMatcher) obj).matcher);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
    }

    public MethodOverrideMatcher(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        HashSet hashSet = new HashSet();
        for (TypeDefinition typeDefinition : t.getDeclaringType()) {
            if (matches(t, typeDefinition) || matches(t, typeDefinition.getInterfaces(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    private boolean matches(MethodDescription methodDescription, List<? extends TypeDefinition> list, Set<TypeDescription> set) {
        for (TypeDefinition typeDefinition : list) {
            if (set.add(typeDefinition.asErasure()) && (matches(methodDescription, typeDefinition) || matches(methodDescription, typeDefinition.getInterfaces(), set))) {
                return true;
            }
        }
        return false;
    }

    private boolean matches(MethodDescription methodDescription, TypeDefinition typeDefinition) {
        Iterator it = typeDefinition.getDeclaredMethods().filter(ElementMatchers.isVirtual()).iterator();
        while (it.hasNext()) {
            if (((MethodDescription) it.next()).asSignatureToken().equals(methodDescription.asSignatureToken())) {
                return this.matcher.matches(typeDefinition.asGenericType());
            }
        }
        return false;
    }

    public String toString() {
        return "isOverriddenFrom(" + this.matcher + ")";
    }
}
