package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class MethodSortMatcher<T extends MethodDescription> extends ElementMatcher.Junction.AbstractBase<T> {
    private final Sort sort;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.sort.equals(((MethodSortMatcher) obj).sort);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.sort.hashCode();
    }

    public MethodSortMatcher(Sort sort) {
        this.sort = sort;
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
    public boolean matches(T t) {
        return this.sort.isSort(t);
    }

    public String toString() {
        return this.sort.getDescription();
    }

    public enum Sort {
        METHOD("isMethod()") { // from class: org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort.1
            @Override // org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort
            protected boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isMethod();
            }
        },
        CONSTRUCTOR("isConstructor()") { // from class: org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort.2
            @Override // org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort
            protected boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isConstructor();
            }
        },
        TYPE_INITIALIZER("isTypeInitializer()") { // from class: org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort.3
            @Override // org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort
            protected boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isTypeInitializer();
            }
        },
        VIRTUAL("isVirtual()") { // from class: org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort.4
            @Override // org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort
            protected boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isVirtual();
            }
        },
        DEFAULT_METHOD("isDefaultMethod()") { // from class: org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort.5
            @Override // org.modelmapper.internal.bytebuddy.matcher.MethodSortMatcher.Sort
            protected boolean isSort(MethodDescription methodDescription) {
                return methodDescription.isDefaultMethod();
            }
        };

        private final String description;

        protected abstract boolean isSort(MethodDescription methodDescription);

        Sort(String str) {
            this.description = str;
        }

        protected String getDescription() {
            return this.description;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "MethodSortMatcher.Sort." + name();
        }
    }
}
