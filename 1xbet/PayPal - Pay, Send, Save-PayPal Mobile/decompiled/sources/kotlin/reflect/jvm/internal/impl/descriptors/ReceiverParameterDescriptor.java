package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface ReceiverParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor {
    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue getValue();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor);
}
