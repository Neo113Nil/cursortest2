package com.moloco.sdk.internal.ortb.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000  2\u00020\u0001:\u0002\u0014\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0016\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001e¨\u0006!"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/c;", "", "", "enabled", "onSkip", "", "eventLink", "<init>", "(ZZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "()Z", "b", "()V", "e", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "c", "Ljava/lang/String;", "()Ljava/lang/String;", "d", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@kotlinx.serialization.Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3413c {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.moloco.sdk.internal.ortb.model.C3413c.Companion INSTANCE = new com.moloco.sdk.internal.ortb.model.C3413c.Companion(null);
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean onSkip;

    /* renamed from: c, reason: from kotlin metadata */
    public final java.lang.String eventLink;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.moloco.sdk.internal.ortb.model.c$a */
    public /* synthetic */ class a implements kotlinx.serialization.internal.GeneratedSerializer<com.moloco.sdk.internal.ortb.model.C3413c> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.internal.ortb.model.C3413c.a f7026a;
        public static final int b;
        private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

        static {
            com.moloco.sdk.internal.ortb.model.C3413c.a aVar = new com.moloco.sdk.internal.ortb.model.C3413c.a();
            f7026a = aVar;
            b = 8;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.AutoStore", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("enabled", false);
            pluginGeneratedSerialDescriptor.addElement("on_skip", true);
            pluginGeneratedSerialDescriptor.addElement("event_link", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.internal.ortb.model.C3413c deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            boolean z;
            boolean z2;
            int i;
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            if (beginStructure.decodeSequentially()) {
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                z = decodeBooleanElement;
                str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
                z2 = decodeBooleanElement2;
                i = 7;
            } else {
                java.lang.String str2 = null;
                boolean z3 = false;
                boolean z4 = false;
                int i2 = 0;
                boolean z5 = true;
                while (z5) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z5 = false;
                    } else if (decodeElementIndex == 0) {
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str2);
                        i2 |= 4;
                    }
                }
                z = z3;
                z2 = z4;
                i = i2;
                str = str2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new com.moloco.sdk.internal.ortb.model.C3413c(i, z, z2, str, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            kotlinx.serialization.KSerializer<?> nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE);
            kotlinx.serialization.internal.BooleanSerializer booleanSerializer = kotlinx.serialization.internal.BooleanSerializer.INSTANCE;
            return new kotlinx.serialization.KSerializer[]{booleanSerializer, booleanSerializer, nullable};
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
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.moloco.sdk.internal.ortb.model.C3413c value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            com.moloco.sdk.internal.ortb.model.C3413c.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ortb.model.C3413c> serializer() {
            return com.moloco.sdk.internal.ortb.model.C3413c.a.f7026a;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C3413c(int i, boolean z, boolean z2, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.moloco.sdk.internal.ortb.model.C3413c.a.f7026a.getDescriptor());
        }
        this.enabled = z;
        if ((i & 2) == 0) {
            this.onSkip = true;
        } else {
            this.onSkip = z2;
        }
        if ((i & 4) == 0) {
            this.eventLink = null;
        } else {
            this.eventLink = str;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void a(com.moloco.sdk.internal.ortb.model.C3413c self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.onSkip) {
            output.encodeBooleanElement(serialDesc, 1, self.onSkip);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.eventLink == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.eventLink);
    }

    @kotlinx.serialization.SerialName("enabled")
    public static /* synthetic */ void b() {
    }

    @kotlinx.serialization.SerialName("event_link")
    public static /* synthetic */ void d() {
    }

    @kotlinx.serialization.SerialName("on_skip")
    public static /* synthetic */ void f() {
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.String getEventLink() {
        return this.eventLink;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getOnSkip() {
        return this.onSkip;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public C3413c(boolean z, boolean z2, java.lang.String str) {
        this.enabled = z;
        this.onSkip = z2;
        this.eventLink = str;
    }

    public /* synthetic */ C3413c(boolean z, boolean z2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : str);
    }
}
