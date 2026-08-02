package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ClassLoader;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class ClassLoaderParentMatcher<T extends ClassLoader> extends ElementMatcher.Junction.AbstractBase<T> {
    private final ClassLoader classLoader;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.classLoader.equals(((ClassLoaderParentMatcher) obj).classLoader);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classLoader.hashCode();
    }

    public ClassLoaderParentMatcher(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        for (ClassLoader classLoader = this.classLoader; classLoader != null; classLoader = classLoader.getParent()) {
            if (classLoader == t) {
                return true;
            }
        }
        return t == null;
    }

    public String toString() {
        return "isParentOf(" + this.classLoader + ')';
    }
}
