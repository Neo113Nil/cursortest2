package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class HasSuperTypeMatcher<T extends TypeDescription> extends ElementMatcher.Junction.AbstractBase<T> {
    private final ElementMatcher<? super TypeDescription.Generic> matcher;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.matcher.equals(((HasSuperTypeMatcher) obj).matcher);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
    }

    public HasSuperTypeMatcher(ElementMatcher<? super TypeDescription.Generic> elementMatcher) {
        this.matcher = elementMatcher;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        HashSet hashSet = new HashSet();
        Iterator it = t.iterator();
        while (it.hasNext()) {
            TypeDefinition typeDefinition = (TypeDefinition) it.next();
            if (this.matcher.matches(typeDefinition.asGenericType()) || hasInterface(typeDefinition, hashSet)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasInterface(TypeDefinition typeDefinition, Set<TypeDescription> set) {
        for (TypeDefinition typeDefinition2 : typeDefinition.getInterfaces()) {
            if (set.add(typeDefinition2.asErasure()) && (this.matcher.matches(typeDefinition2.asGenericType()) || hasInterface(typeDefinition2, set))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "hasSuperType(" + this.matcher + ")";
    }
}
