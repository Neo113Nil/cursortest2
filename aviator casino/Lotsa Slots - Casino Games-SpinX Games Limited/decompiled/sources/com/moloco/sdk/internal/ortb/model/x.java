package com.moloco.sdk.internal.ortb.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0013\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/x;", "", "", "serverRenderingEnabled", "Lcom/moloco/sdk/internal/ortb/model/s;", "experimental", "<init>", "(Ljava/lang/Boolean;Lcom/moloco/sdk/internal/ortb/model/s;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/moloco/sdk/internal/ortb/model/s;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/x;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "d", "()V", "b", "Lcom/moloco/sdk/internal/ortb/model/s;", "()Lcom/moloco/sdk/internal/ortb/model/s;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.moloco.sdk.internal.ortb.model.x.Companion INSTANCE = new com.moloco.sdk.internal.ortb.model.x.Companion(null);
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final java.lang.Boolean serverRenderingEnabled;

    /* renamed from: b, reason: from kotlin metadata */
    public final com.moloco.sdk.internal.ortb.model.s experimental;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements kotlinx.serialization.internal.GeneratedSerializer<com.moloco.sdk.internal.ortb.model.x> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.internal.ortb.model.x.a f7064a;
        public static final int b;
        private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

        static {
            com.moloco.sdk.internal.ortb.model.x.a aVar = new com.moloco.sdk.internal.ortb.model.x.a();
            f7064a = aVar;
            b = 8;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.MolocoSDKConfigs", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("server_rendering_enabled", true);
            pluginGeneratedSerialDescriptor.addElement("experimental", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.internal.ortb.model.x deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            java.lang.Boolean bool;
            com.moloco.sdk.internal.ortb.model.s sVar;
            int i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                bool = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
                sVar = (com.moloco.sdk.internal.ortb.model.s) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.moloco.sdk.internal.ortb.model.s.a.f7055a, null);
                i = 3;
            } else {
                bool = null;
                com.moloco.sdk.internal.ortb.model.s sVar2 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        bool = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        sVar2 = (com.moloco.sdk.internal.ortb.model.s) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.moloco.sdk.internal.ortb.model.s.a.f7055a, sVar2);
                        i2 |= 2;
                    }
                }
                sVar = sVar2;
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new com.moloco.sdk.internal.ortb.model.x(i, bool, sVar, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.moloco.sdk.internal.ortb.model.s.a.f7055a)};
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
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.moloco.sdk.internal.ortb.model.x value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            com.moloco.sdk.internal.ortb.model.x.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.x$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ortb.model.x> serializer() {
            return com.moloco.sdk.internal.ortb.model.x.a.f7064a;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x() {
        this((java.lang.Boolean) null, (com.moloco.sdk.internal.ortb.model.s) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void a(com.moloco.sdk.internal.ortb.model.x self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.serverRenderingEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.serverRenderingEnabled);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.experimental == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, com.moloco.sdk.internal.ortb.model.s.a.f7055a, self.experimental);
    }

    @kotlinx.serialization.SerialName("experimental")
    public static /* synthetic */ void b() {
    }

    @kotlinx.serialization.SerialName("server_rendering_enabled")
    public static /* synthetic */ void d() {
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.Boolean getServerRenderingEnabled() {
        return this.serverRenderingEnabled;
    }

    public /* synthetic */ x(int i, java.lang.Boolean bool, com.moloco.sdk.internal.ortb.model.s sVar, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serverRenderingEnabled = null;
        } else {
            this.serverRenderingEnabled = bool;
        }
        if ((i & 2) == 0) {
            this.experimental = null;
        } else {
            this.experimental = sVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final com.moloco.sdk.internal.ortb.model.s getExperimental() {
        return this.experimental;
    }

    public x(java.lang.Boolean bool, com.moloco.sdk.internal.ortb.model.s sVar) {
        this.serverRenderingEnabled = bool;
        this.experimental = sVar;
    }

    public /* synthetic */ x(java.lang.Boolean bool, com.moloco.sdk.internal.ortb.model.s sVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : sVar);
    }
}
