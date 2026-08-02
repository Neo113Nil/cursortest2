package org.modelmapper.internal.bytebuddy.matcher;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

/* loaded from: classes4.dex */
public interface LatentMatcher<T> {
    ElementMatcher<? super T> resolve(TypeDescription typeDescription);

    public enum ForSelfDeclaredMethod implements LatentMatcher<MethodDescription> {
        DECLARED(false),
        NOT_DECLARED(true);

        private final boolean inverted;

        ForSelfDeclaredMethod(boolean z) {
            this.inverted = z;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
        public ElementMatcher<? super MethodDescription> resolve(TypeDescription typeDescription) {
            if (this.inverted) {
                return ElementMatchers.not(ElementMatchers.isDeclaredBy(typeDescription));
            }
            return ElementMatchers.isDeclaredBy(typeDescription);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Resolved<S> implements LatentMatcher<S> {
        private final ElementMatcher<? super S> matcher;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.matcher.equals(((Resolved) obj).matcher);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
        }

        public Resolved(ElementMatcher<? super S> elementMatcher) {
            this.matcher = elementMatcher;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
        public ElementMatcher<? super S> resolve(TypeDescription typeDescription) {
            return this.matcher;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForFieldToken implements LatentMatcher<FieldDescription> {
        private final FieldDescription.Token token;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.token.equals(((ForFieldToken) obj).token);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode();
        }

        public ForFieldToken(FieldDescription.Token token) {
            this.token = token;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
        public ElementMatcher<? super FieldDescription> resolve(TypeDescription typeDescription) {
            return new ResolvedMatcher(this.token.asSignatureToken(typeDescription));
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class ResolvedMatcher implements ElementMatcher<FieldDescription> {
            private final FieldDescription.SignatureToken signatureToken;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.signatureToken.equals(((ResolvedMatcher) obj).signatureToken);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.signatureToken.hashCode();
            }

            protected ResolvedMatcher(FieldDescription.SignatureToken signatureToken) {
                this.signatureToken = signatureToken;
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
            public boolean matches(FieldDescription fieldDescription) {
                return fieldDescription.asSignatureToken().equals(this.signatureToken);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForMethodToken implements LatentMatcher<MethodDescription> {
        private final MethodDescription.Token token;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.token.equals(((ForMethodToken) obj).token);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode();
        }

        public ForMethodToken(MethodDescription.Token token) {
            this.token = token;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
        public ElementMatcher<? super MethodDescription> resolve(TypeDescription typeDescription) {
            return new ResolvedMatcher(this.token.asSignatureToken(typeDescription));
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class ResolvedMatcher implements ElementMatcher<MethodDescription> {
            private final MethodDescription.SignatureToken signatureToken;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.signatureToken.equals(((ResolvedMatcher) obj).signatureToken);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.signatureToken.hashCode();
            }

            protected ResolvedMatcher(MethodDescription.SignatureToken signatureToken) {
                this.signatureToken = signatureToken;
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
            public boolean matches(MethodDescription methodDescription) {
                return methodDescription.asSignatureToken().equals(this.signatureToken);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Conjunction<S> implements LatentMatcher<S> {
        private final List<? extends LatentMatcher<? super S>> matchers;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Conjunction) obj).matchers);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matchers.hashCode();
        }

        public Conjunction(LatentMatcher<? super S>... latentMatcherArr) {
            this(Arrays.asList(latentMatcherArr));
        }

        public Conjunction(List<? extends LatentMatcher<? super S>> list) {
            this.matchers = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
        public ElementMatcher<? super S> resolve(TypeDescription typeDescription) {
            ElementMatcher.Junction any = ElementMatchers.any();
            Iterator<? extends LatentMatcher<? super S>> it = this.matchers.iterator();
            while (it.hasNext()) {
                any = any.and(it.next().resolve(typeDescription));
            }
            return any;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Disjunction<S> implements LatentMatcher<S> {
        private final List<? extends LatentMatcher<? super S>> matchers;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Disjunction) obj).matchers);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matchers.hashCode();
        }

        public Disjunction(LatentMatcher<? super S>... latentMatcherArr) {
            this(Arrays.asList(latentMatcherArr));
        }

        public Disjunction(List<? extends LatentMatcher<? super S>> list) {
            this.matchers = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
        public ElementMatcher<? super S> resolve(TypeDescription typeDescription) {
            ElementMatcher.Junction none = ElementMatchers.none();
            Iterator<? extends LatentMatcher<? super S>> it = this.matchers.iterator();
            while (it.hasNext()) {
                none = none.or(it.next().resolve(typeDescription));
            }
            return none;
        }
    }
}
