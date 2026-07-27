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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 #2\u00020\u0001:\u0002\u0015\u001cB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u0012\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0015\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b \u0010\u001b\u001a\u0004\b\u001f\u0010\"¨\u0006$"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/u;", "", "", "serverRenderingIgnoreNetErrFailed", "composeRemovalEnabled", "adaptiveBannerBlurBgEnabled", "", "adaptiveBannerBlurGapThreshold", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/u;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "h", "()V", "b", "e", "f", "c", "d", "Ljava/lang/Float;", "()Ljava/lang/Float;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Boolean serverRenderingIgnoreNetErrFailed;

    /* renamed from: b, reason: from kotlin metadata */
    public final Boolean composeRemovalEnabled;

    /* renamed from: c, reason: from kotlin metadata */
    public final Boolean adaptiveBannerBlurBgEnabled;

    /* renamed from: d, reason: from kotlin metadata */
    public final Float adaptiveBannerBlurGapThreshold;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<u> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10571a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10571a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.ExperimentalConfigs", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("server_rendering_ignore_net_err_failed", true);
            pluginGeneratedSerialDescriptor.addElement("compose_removal_enabled", true);
            pluginGeneratedSerialDescriptor.addElement("adaptive_banner_blur_bg_enabled", true);
            pluginGeneratedSerialDescriptor.addElement("adaptive_banner_blur_gap_threshold", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u deserialize(Decoder decoder) {
            int i;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Float f;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            Boolean bool4 = null;
            if (beginStructure.decodeSequentially()) {
                BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
                Boolean bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
                Boolean bool6 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
                bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
                f = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FloatSerializer.INSTANCE, null);
                i = 15;
                bool2 = bool6;
                bool = bool5;
            } else {
                boolean z = true;
                int i2 = 0;
                Boolean bool7 = null;
                Boolean bool8 = null;
                Float f2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool4);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        bool7 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool7);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        bool8 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool8);
                        i2 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        f2 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FloatSerializer.INSTANCE, f2);
                        i2 |= 8;
                    }
                }
                i = i2;
                bool = bool4;
                bool2 = bool7;
                bool3 = bool8;
                f = f2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new u(i, bool, bool2, bool3, f, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, u value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            u.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.u$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<u> serializer() {
            return a.f10571a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Float) null, 15, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final /* synthetic */ void a(u self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.serverRenderingIgnoreNetErrFailed != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.serverRenderingIgnoreNetErrFailed);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.composeRemovalEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.composeRemovalEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.adaptiveBannerBlurBgEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.adaptiveBannerBlurBgEnabled);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.adaptiveBannerBlurGapThreshold == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, FloatSerializer.INSTANCE, self.adaptiveBannerBlurGapThreshold);
    }

    @SerialName("adaptive_banner_blur_bg_enabled")
    public static /* synthetic */ void b() {
    }

    @SerialName("adaptive_banner_blur_gap_threshold")
    public static /* synthetic */ void d() {
    }

    @SerialName("compose_removal_enabled")
    public static /* synthetic */ void f() {
    }

    @SerialName("server_rendering_ignore_net_err_failed")
    public static /* synthetic */ void h() {
    }

    /* renamed from: c, reason: from getter */
    public final Float getAdaptiveBannerBlurGapThreshold() {
        return this.adaptiveBannerBlurGapThreshold;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getComposeRemovalEnabled() {
        return this.composeRemovalEnabled;
    }

    /* renamed from: g, reason: from getter */
    public final Boolean getServerRenderingIgnoreNetErrFailed() {
        return this.serverRenderingIgnoreNetErrFailed;
    }

    public /* synthetic */ u(int i, Boolean bool, Boolean bool2, Boolean bool3, Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serverRenderingIgnoreNetErrFailed = null;
        } else {
            this.serverRenderingIgnoreNetErrFailed = bool;
        }
        if ((i & 2) == 0) {
            this.composeRemovalEnabled = null;
        } else {
            this.composeRemovalEnabled = bool2;
        }
        if ((i & 4) == 0) {
            this.adaptiveBannerBlurBgEnabled = null;
        } else {
            this.adaptiveBannerBlurBgEnabled = bool3;
        }
        if ((i & 8) == 0) {
            this.adaptiveBannerBlurGapThreshold = null;
        } else {
            this.adaptiveBannerBlurGapThreshold = f;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getAdaptiveBannerBlurBgEnabled() {
        return this.adaptiveBannerBlurBgEnabled;
    }

    public u(Boolean bool, Boolean bool2, Boolean bool3, Float f) {
        this.serverRenderingIgnoreNetErrFailed = bool;
        this.composeRemovalEnabled = bool2;
        this.adaptiveBannerBlurBgEnabled = bool3;
        this.adaptiveBannerBlurGapThreshold = f;
    }

    public /* synthetic */ u(Boolean bool, Boolean bool2, Boolean bool3, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : f);
    }
}
