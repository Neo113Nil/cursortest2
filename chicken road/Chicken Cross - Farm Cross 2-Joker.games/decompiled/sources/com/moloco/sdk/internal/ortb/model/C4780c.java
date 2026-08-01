package com.moloco.sdk.internal.ortb.model;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000  2\u00020\u0001:\u0002\u0014\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0016\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001e¨\u0006!"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/c;", "", "", "enabled", "onSkip", "", "eventLink", "<init>", "(ZZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "()Z", "b", "()V", "e", "f", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "d", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4780c {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean onSkip;

    /* renamed from: c, reason: from kotlin metadata */
    public final String eventLink;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.moloco.sdk.internal.ortb.model.c$a */
    public /* synthetic */ class a implements GeneratedSerializer<C4780c> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10537a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10537a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.AutoStore", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("enabled", false);
            pluginGeneratedSerialDescriptor.addElement("on_skip", true);
            pluginGeneratedSerialDescriptor.addElement("event_link", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4780c deserialize(Decoder decoder) {
            boolean z;
            boolean z2;
            int i;
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            if (beginStructure.decodeSequentially()) {
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                z = decodeBooleanElement;
                str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
                z2 = decodeBooleanElement2;
                i = 7;
            } else {
                boolean z3 = true;
                boolean z4 = false;
                int i2 = 0;
                String str2 = null;
                boolean z5 = false;
                while (z3) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z3 = false;
                    } else if (decodeElementIndex == 0) {
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str2);
                        i2 |= 4;
                    }
                }
                z = z4;
                z2 = z5;
                i = i2;
                str = str2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new C4780c(i, z, z2, str, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            return new KSerializer[]{booleanSerializer, booleanSerializer, nullable};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C4780c value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            C4780c.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<C4780c> serializer() {
            return a.f10537a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C4780c(int i, boolean z, boolean z2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, a.f10537a.getDescriptor());
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

    @JvmStatic
    public static final /* synthetic */ void a(C4780c self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.enabled);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.onSkip) {
            output.encodeBooleanElement(serialDesc, 1, self.onSkip);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.eventLink == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.eventLink);
    }

    @SerialName("enabled")
    public static /* synthetic */ void b() {
    }

    @SerialName("event_link")
    public static /* synthetic */ void d() {
    }

    @SerialName("on_skip")
    public static /* synthetic */ void f() {
    }

    /* renamed from: c, reason: from getter */
    public final String getEventLink() {
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

    public C4780c(boolean z, boolean z2, String str) {
        this.enabled = z;
        this.onSkip = z2;
        this.eventLink = str;
    }

    public /* synthetic */ C4780c(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : str);
    }
}
