package org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class InliningImplementationMatcher implements LatentMatcher<MethodDescription> {
    private final LatentMatcher<? super MethodDescription> ignoredMethods;
    private final ElementMatcher<? super MethodDescription> predefinedMethodSignatures;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InliningImplementationMatcher inliningImplementationMatcher = (InliningImplementationMatcher) obj;
        return this.ignoredMethods.equals(inliningImplementationMatcher.ignoredMethods) && this.predefinedMethodSignatures.equals(inliningImplementationMatcher.predefinedMethodSignatures);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.ignoredMethods.hashCode()) * 31) + this.predefinedMethodSignatures.hashCode();
    }

    protected InliningImplementationMatcher(LatentMatcher<? super MethodDescription> latentMatcher, ElementMatcher<? super MethodDescription> elementMatcher) {
        this.ignoredMethods = latentMatcher;
        this.predefinedMethodSignatures = elementMatcher;
    }

    protected static LatentMatcher<MethodDescription> of(LatentMatcher<? super MethodDescription> latentMatcher, TypeDescription typeDescription) {
        ElementMatcher.Junction named;
        ElementMatcher.Junction none = ElementMatchers.none();
        for (MethodDescription methodDescription : typeDescription.getDeclaredMethods()) {
            if (methodDescription.isConstructor()) {
                named = ElementMatchers.isConstructor();
            } else {
                named = ElementMatchers.named(methodDescription.getName());
            }
            none = none.or(named.and(ElementMatchers.returns(methodDescription.getReturnType().asErasure())).and(ElementMatchers.takesArguments(methodDescription.getParameters().asTypeList().asErasures())));
        }
        return new InliningImplementationMatcher(latentMatcher, none);
    }

    @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
    public ElementMatcher<? super MethodDescription> resolve(TypeDescription typeDescription) {
        return ElementMatchers.not(this.ignoredMethods.resolve(typeDescription)).and(ElementMatchers.isVirtual().and(ElementMatchers.not(ElementMatchers.isFinal())).or(ElementMatchers.isDeclaredBy(typeDescription))).or(ElementMatchers.isDeclaredBy(typeDescription).and(ElementMatchers.not(this.predefinedMethodSignatures)));
    }
}
