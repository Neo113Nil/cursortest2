package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public interface ContractDeserializer {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion Companion = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion.getHighSpeedVideoFpsRanges;

    kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> deserializeContractFromFunction(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer);

    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion();
        private static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer$Companion$DEFAULT$1
            @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
            public final kotlin.Pair deserializeContractFromFunction(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeDeserializer, "");
                return null;
            }
        };

        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer getDEFAULT() {
            return getHighSpeedVideoSizes;
        }
    }
}
