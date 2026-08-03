package com.moloco.sdk.internal.ortb.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0011\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/s;", "", "", "serverRenderingIgnoreNetErrFailed", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/s;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "b", "()V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.moloco.sdk.internal.ortb.model.s.Companion INSTANCE = new com.moloco.sdk.internal.ortb.model.s.Companion(null);
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final java.lang.Boolean serverRenderingIgnoreNetErrFailed;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements kotlinx.serialization.internal.GeneratedSerializer<com.moloco.sdk.internal.ortb.model.s> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.internal.ortb.model.s.a f7055a;
        public static final int b;
        private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

        static {
            com.moloco.sdk.internal.ortb.model.s.a aVar = new com.moloco.sdk.internal.ortb.model.s.a();
            f7055a = aVar;
            b = 8;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.ExperimentalConfigs", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("server_rendering_ignore_net_err_failed", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.internal.ortb.model.s deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            java.lang.Boolean bool;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i = 1;
            kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                bool = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            } else {
                bool = null;
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
                        bool = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new com.moloco.sdk.internal.ortb.model.s(i, bool, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE)};
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
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.moloco.sdk.internal.ortb.model.s value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            com.moloco.sdk.internal.ortb.model.s.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.s$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ortb.model.s> serializer() {
            return com.moloco.sdk.internal.ortb.model.s.a.f7055a;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s() {
        this((java.lang.Boolean) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void a(com.moloco.sdk.internal.ortb.model.s self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.serverRenderingIgnoreNetErrFailed == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.serverRenderingIgnoreNetErrFailed);
    }

    @kotlinx.serialization.SerialName("server_rendering_ignore_net_err_failed")
    public static /* synthetic */ void b() {
    }

    public /* synthetic */ s(int i, java.lang.Boolean bool, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serverRenderingIgnoreNetErrFailed = null;
        } else {
            this.serverRenderingIgnoreNetErrFailed = bool;
        }
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.Boolean getServerRenderingIgnoreNetErrFailed() {
        return this.serverRenderingIgnoreNetErrFailed;
    }

    public s(java.lang.Boolean bool) {
        this.serverRenderingIgnoreNetErrFailed = bool;
    }

    public /* synthetic */ s(java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
