package org.modelmapper.internal.bytebuddy.implementation.bind;

import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;

/* loaded from: classes4.dex */
public enum DeclaringTypeResolver implements MethodDelegationBinder.AmbiguityResolver {
    INSTANCE;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public MethodDelegationBinder.AmbiguityResolver.Resolution resolve(MethodDescription methodDescription, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
        TypeDescription asErasure = methodBinding.getTarget().getDeclaringType().asErasure();
        TypeDescription asErasure2 = methodBinding2.getTarget().getDeclaringType().asErasure();
        if (asErasure.equals(asErasure2)) {
            return MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS;
        }
        if (asErasure.isAssignableFrom(asErasure2)) {
            return MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT;
        }
        if (asErasure.isAssignableTo(asErasure2)) {
            return MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT;
        }
        return MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS;
    }
}
