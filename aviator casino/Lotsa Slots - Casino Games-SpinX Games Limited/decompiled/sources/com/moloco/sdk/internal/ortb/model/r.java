package com.moloco.sdk.internal.ortb.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0011\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/r;", "", "Lkotlin/UInt;", "delaySeconds", "<init>", "(Lkotlin/UInt;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlin/UInt;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/r;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlin/UInt;", "()Lkotlin/UInt;", "b", "()V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.moloco.sdk.internal.ortb.model.r.Companion INSTANCE = new com.moloco.sdk.internal.ortb.model.r.Companion(null);
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final kotlin.UInt delaySeconds;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements kotlinx.serialization.internal.GeneratedSerializer<com.moloco.sdk.internal.ortb.model.r> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.internal.ortb.model.r.a f7053a;
        public static final int b;
        private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

        static {
            com.moloco.sdk.internal.ortb.model.r.a aVar = new com.moloco.sdk.internal.ortb.model.r.a();
            f7053a = aVar;
            b = 8;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECSkipClose", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("delay_seconds", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.internal.ortb.model.r deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            kotlin.UInt uInt;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i = 1;
            kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker = null;
            java.lang.Object[] objArr = 0;
            if (beginStructure.decodeSequentially()) {
                uInt = (kotlin.UInt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.UIntSerializer.INSTANCE, null);
            } else {
                uInt = null;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        uInt = (kotlin.UInt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.UIntSerializer.INSTANCE, uInt);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new com.moloco.sdk.internal.ortb.model.r(i, uInt, serializationConstructorMarker, objArr == true ? 1 : 0);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.UIntSerializer.INSTANCE)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.CC.$default$typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.moloco.sdk.internal.ortb.model.r value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            com.moloco.sdk.internal.ortb.model.r.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.r$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ortb.model.r> serializer() {
            return com.moloco.sdk.internal.ortb.model.r.a.f7053a;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ r(int i, kotlin.UInt uInt, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, uInt, serializationConstructorMarker);
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void a(com.moloco.sdk.internal.ortb.model.r self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.delaySeconds == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.UIntSerializer.INSTANCE, self.delaySeconds);
    }

    @kotlinx.serialization.SerialName("delay_seconds")
    public static /* synthetic */ void b() {
    }

    public /* synthetic */ r(kotlin.UInt uInt, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uInt);
    }

    /* renamed from: a, reason: from getter */
    public final kotlin.UInt getDelaySeconds() {
        return this.delaySeconds;
    }

    public /* synthetic */ r(int i, kotlin.UInt uInt, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.delaySeconds = null;
        } else {
            this.delaySeconds = uInt;
        }
    }

    public r(kotlin.UInt uInt) {
        this.delaySeconds = uInt;
    }

    public /* synthetic */ r(kotlin.UInt uInt, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uInt, null);
    }
}
