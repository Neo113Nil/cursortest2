package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class SuperTypeMatcher<T extends TypeDescription> extends ElementMatcher.Junction.AbstractBase<T> {
    private final TypeDescription typeDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((SuperTypeMatcher) obj).typeDescription);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
    }

    public SuperTypeMatcher(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        return t.isAssignableFrom(this.typeDescription);
    }

    public String toString() {
        return "isSuperTypeOf(" + this.typeDescription + ')';
    }
}
