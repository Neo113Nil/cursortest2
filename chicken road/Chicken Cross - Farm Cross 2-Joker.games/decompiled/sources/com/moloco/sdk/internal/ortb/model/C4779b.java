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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 %2\u00020\u0001:\u0002\u0015\u001cB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u0012\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0015\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001b\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/b;", "", "", "onSkip", "", "eventLink", "clickthroughUrl", "forceFullScreen", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "g", "()Z", "h", "()V", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "f", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4779b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean onSkip;

    /* renamed from: b, reason: from kotlin metadata */
    public final String eventLink;

    /* renamed from: c, reason: from kotlin metadata */
    public final String clickthroughUrl;

    /* renamed from: d, reason: from kotlin metadata */
    public final Boolean forceFullScreen;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.moloco.sdk.internal.ortb.model.b$a */
    public /* synthetic */ class a implements GeneratedSerializer<C4779b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10535a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10535a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.AutoInline", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("on_skip", false);
            pluginGeneratedSerialDescriptor.addElement("event_link", false);
            pluginGeneratedSerialDescriptor.addElement("click_through", true);
            pluginGeneratedSerialDescriptor.addElement("force_fullscreen", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4779b deserialize(Decoder decoder) {
            boolean z;
            int i;
            String str;
            String str2;
            Boolean bool;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            if (beginStructure.decodeSequentially()) {
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
                String str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
                z = decodeBooleanElement;
                bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, null);
                str2 = str3;
                str = decodeStringElement;
                i = 15;
            } else {
                boolean z2 = true;
                boolean z3 = false;
                String str4 = null;
                String str5 = null;
                Boolean bool2 = null;
                int i2 = 0;
                while (z2) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z2 = false;
                    } else if (decodeElementIndex == 0) {
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str4 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str5);
                        i2 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool2);
                        i2 |= 8;
                    }
                }
                z = z3;
                i = i2;
                str = str4;
                str2 = str5;
                bool = bool2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new C4779b(i, z, str, str2, bool, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{booleanSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C4779b value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            C4779b.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<C4779b> serializer() {
            return a.f10535a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C4779b(int i, boolean z, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, a.f10535a.getDescriptor());
        }
        this.onSkip = z;
        this.eventLink = str;
        if ((i & 4) == 0) {
            this.clickthroughUrl = null;
        } else {
            this.clickthroughUrl = str2;
        }
        if ((i & 8) == 0) {
            this.forceFullScreen = Boolean.FALSE;
        } else {
            this.forceFullScreen = bool;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void a(C4779b self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.onSkip);
        output.encodeStringElement(serialDesc, 1, self.eventLink);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.clickthroughUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.clickthroughUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && Intrinsics.areEqual(self.forceFullScreen, Boolean.FALSE)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.forceFullScreen);
    }

    @SerialName("click_through")
    public static /* synthetic */ void b() {
    }

    @SerialName("event_link")
    public static /* synthetic */ void d() {
    }

    @SerialName("force_fullscreen")
    public static /* synthetic */ void f() {
    }

    @SerialName("on_skip")
    public static /* synthetic */ void h() {
    }

    /* renamed from: c, reason: from getter */
    public final String getEventLink() {
        return this.eventLink;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getForceFullScreen() {
        return this.forceFullScreen;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getOnSkip() {
        return this.onSkip;
    }

    /* renamed from: a, reason: from getter */
    public final String getClickthroughUrl() {
        return this.clickthroughUrl;
    }

    public C4779b(boolean z, String eventLink, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventLink, "eventLink");
        this.onSkip = z;
        this.eventLink = eventLink;
        this.clickthroughUrl = str;
        this.forceFullScreen = bool;
    }

    public /* synthetic */ C4779b(boolean z, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
