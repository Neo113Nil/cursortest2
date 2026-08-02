package org.modelmapper.internal.bytebuddy.implementation.bind;

import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;

/* loaded from: classes4.dex */
public enum ParameterLengthResolver implements MethodDelegationBinder.AmbiguityResolver {
    INSTANCE;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public MethodDelegationBinder.AmbiguityResolver.Resolution resolve(MethodDescription methodDescription, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
        int size = methodBinding.getTarget().getParameters().size();
        int size2 = methodBinding2.getTarget().getParameters().size();
        if (size == size2) {
            return MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS;
        }
        if (size < size2) {
            return MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT;
        }
        return MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT;
    }
}
