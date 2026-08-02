package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "jsonCachedSerialNames", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Set;", "Lkotlinx/serialization/MissingFieldException;", "exception", "message", "missingFieldExceptionWithNewMessage", "(Lkotlinx/serialization/MissingFieldException;Ljava/lang/String;)Lkotlinx/serialization/MissingFieldException;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonInternalDependenciesKt {
    @kotlinx.serialization.internal.CoreFriendModuleApi
    public static final java.util.Set<java.lang.String> jsonCachedSerialNames(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return kotlinx.serialization.internal.Platform_commonKt.cachedSerialNames(serialDescriptor);
    }

    @kotlinx.serialization.internal.CoreFriendModuleApi
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.MissingFieldException missingFieldExceptionWithNewMessage(kotlinx.serialization.MissingFieldException missingFieldException, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingFieldException, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return missingFieldException.withNewMessageInternal$kotlinx_serialization_core(str);
    }
}
