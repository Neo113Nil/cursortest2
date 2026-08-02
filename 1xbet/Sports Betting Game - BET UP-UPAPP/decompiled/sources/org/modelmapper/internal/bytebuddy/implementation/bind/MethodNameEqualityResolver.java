package org.modelmapper.internal.bytebuddy.implementation.bind;

import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;

/* loaded from: classes4.dex */
public enum MethodNameEqualityResolver implements MethodDelegationBinder.AmbiguityResolver {
    INSTANCE;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public MethodDelegationBinder.AmbiguityResolver.Resolution resolve(MethodDescription methodDescription, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
        boolean equals = methodBinding.getTarget().getName().equals(methodDescription.getName());
        if (methodBinding2.getTarget().getName().equals(methodDescription.getName()) ^ equals) {
            return equals ? MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT : MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT;
        }
        return MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS;
    }
}
