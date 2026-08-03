package com.moloco.sdk.internal.ortb.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0013\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/a;", "", "", "enabled", "", "url", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/a;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "()Z", "b", "()V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@kotlinx.serialization.Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3411a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.moloco.sdk.internal.ortb.model.C3411a.Companion INSTANCE = new com.moloco.sdk.internal.ortb.model.C3411a.Companion(null);
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    public final java.lang.String url;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.moloco.sdk.internal.ortb.model.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0185a implements kotlinx.serialization.internal.GeneratedSerializer<com.moloco.sdk.internal.ortb.model.C3411a> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.internal.ortb.model.C3411a.C0185a f7022a;
        public static final int b;
        private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

        static {
            com.moloco.sdk.internal.ortb.model.C3411a.C0185a c0185a = new com.moloco.sdk.internal.ortb.model.C3411a.C0185a();
            f7022a = c0185a;
            b = 8;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.AndroidInline", c0185a, 2);
            pluginGeneratedSerialDescriptor.addElement("enabled", false);
            pluginGeneratedSerialDescriptor.addElement("url", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.internal.ortb.model.C3411a deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            boolean z;
            java.lang.String str;
            int i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                str = beginStructure.decodeStringElement(serialDescriptor, 1);
                i = 3;
            } else {
                java.lang.String str2 = null;
                z = false;
                int i2 = 0;
                boolean z2 = true;
                while (z2) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z2 = false;
                    } else if (decodeElementIndex == 0) {
                        z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                    }
                }
                str = str2;
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new com.moloco.sdk.internal.ortb.model.C3411a(i, z, str, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
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
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.moloco.sdk.internal.ortb.model.C3411a value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            com.moloco.sdk.internal.ortb.model.C3411a.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ortb.model.C3411a> serializer() {
            return com.moloco.sdk.internal.ortb.model.C3411a.C0185a.f7022a;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C3411a(int i, boolean z, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.moloco.sdk.internal.ortb.model.C3411a.C0185a.f7022a.getDescriptor());
        }
        this.enabled = z;
        this.url = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void a(com.moloco.sdk.internal.ortb.model.C3411a self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
        output.encodeStringElement(serialDesc, 1, self.url);
    }

    @kotlinx.serialization.SerialName("enabled")
    public static /* synthetic */ void b() {
    }

    @kotlinx.serialization.SerialName("url")
    public static /* synthetic */ void d() {
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public C3411a(boolean z, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.enabled = z;
        this.url = url;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }
}
