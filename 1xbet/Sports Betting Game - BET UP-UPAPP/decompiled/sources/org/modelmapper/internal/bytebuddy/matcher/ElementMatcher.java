package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;

/* loaded from: classes4.dex */
public interface ElementMatcher<T> {
    boolean matches(T t);

    public interface Junction<S> extends ElementMatcher<S> {
        <U extends S> Junction<U> and(ElementMatcher<? super U> elementMatcher);

        <U extends S> Junction<U> or(ElementMatcher<? super U> elementMatcher);

        public static abstract class AbstractBase<V> implements Junction<V> {
            @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher.Junction
            public <U extends V> Junction<U> and(ElementMatcher<? super U> elementMatcher) {
                return new Conjunction(this, elementMatcher);
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher.Junction
            public <U extends V> Junction<U> or(ElementMatcher<? super U> elementMatcher) {
                return new Disjunction(this, elementMatcher);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Conjunction<W> extends AbstractBase<W> {
            private final ElementMatcher<? super W> left;
            private final ElementMatcher<? super W> right;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Conjunction conjunction = (Conjunction) obj;
                return this.left.equals(conjunction.left) && this.right.equals(conjunction.right);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.left.hashCode()) * 31) + this.right.hashCode();
            }

            public Conjunction(ElementMatcher<? super W> elementMatcher, ElementMatcher<? super W> elementMatcher2) {
                this.left = elementMatcher;
                this.right = elementMatcher2;
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
            public boolean matches(W w) {
                return this.left.matches(w) && this.right.matches(w);
            }

            public String toString() {
                return "(" + this.left + " and " + this.right + ')';
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Disjunction<W> extends AbstractBase<W> {
            private final ElementMatcher<? super W> left;
            private final ElementMatcher<? super W> right;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Disjunction disjunction = (Disjunction) obj;
                return this.left.equals(disjunction.left) && this.right.equals(disjunction.right);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.left.hashCode()) * 31) + this.right.hashCode();
            }

            public Disjunction(ElementMatcher<? super W> elementMatcher, ElementMatcher<? super W> elementMatcher2) {
                this.left = elementMatcher;
                this.right = elementMatcher2;
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
            public boolean matches(W w) {
                return this.left.matches(w) || this.right.matches(w);
            }

            public String toString() {
                return "(" + this.left + " or " + this.right + ')';
            }
        }
    }
}
