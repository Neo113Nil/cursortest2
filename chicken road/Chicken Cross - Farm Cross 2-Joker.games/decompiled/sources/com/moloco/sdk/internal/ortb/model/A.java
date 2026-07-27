package com.moloco.sdk.internal.ortb.model;

import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.AnalyticsEvents;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4761z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UInt;
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
import kotlinx.serialization.internal.UIntSerializer;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0001\u0018\u0000 :2\u00020\u0001:\u0002\u001b\"BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010!\u001a\u0004\b)\u0010*R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010!\u001a\u0004\b.\u0010/R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010!\u001a\u0004\b3\u00104R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00106\u0012\u0004\b1\u0010!\u001a\u0004\b,\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00108\u0012\u0004\b'\u0010!\u001a\u0004\b\"\u00109¨\u0006;"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/A;", "", "", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "Lkotlin/UInt;", "padding", "Lcom/moloco/sdk/internal/ortb/model/w;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/H;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "controlSize", "backgroundColor", "<init>", "(ZILcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/H;JLkotlin/UInt;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlin/UInt;Lcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/H;Landroidx/compose/ui/graphics/Color;Lkotlin/UInt;Landroidx/compose/ui/graphics/Color;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/A;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", com.mbridge.msdk.foundation.same.report.j.b, "()Z", CampaignEx.JSON_KEY_AD_K, "()V", "b", "I", CmcdData.Factory.STREAM_TYPE_LIVE, "()I", InneractiveMediationDefs.GENDER_MALE, "c", "Lcom/moloco/sdk/internal/ortb/model/w;", "h", "()Lcom/moloco/sdk/internal/ortb/model/w;", "i", "d", "Lcom/moloco/sdk/internal/ortb/model/H;", C4761z5.q, "()Lcom/moloco/sdk/internal/ortb/model/H;", "o", "e", "J", "f", "()J", "g", "Lkotlin/UInt;", "()Lkotlin/UInt;", "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class A {
    public static final int h = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean mute;

    /* renamed from: b, reason: from kotlin metadata */
    public final int padding;

    /* renamed from: c, reason: from kotlin metadata */
    public final w horizontalAlignment;

    /* renamed from: d, reason: from kotlin metadata */
    public final H verticalAlignment;

    /* renamed from: e, reason: from kotlin metadata */
    public final long foregroundColor;

    /* renamed from: f, reason: from kotlin metadata */
    public final UInt controlSize;

    /* renamed from: g, reason: from kotlin metadata */
    public final Color backgroundColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer<Object>[] i = {null, null, w.INSTANCE.serializer(), H.INSTANCE.serializer(), null, null, null};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<A> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10518a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10518a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Mute", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT, false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            pluginGeneratedSerialDescriptor.addElement("control_size", true);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A deserialize(Decoder decoder) {
            UInt uInt;
            w wVar;
            H h;
            Color color;
            Color color2;
            UInt uInt2;
            int i;
            boolean z;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = A.i;
            int i2 = 6;
            int i3 = 5;
            if (beginStructure.decodeSequentially()) {
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
                UInt uInt3 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 1, uIntSerializer, null);
                w wVar2 = (w) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
                H h2 = (H) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
                j jVar = j.f10549a;
                Color color3 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 4, jVar, null);
                UInt uInt4 = (UInt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, uIntSerializer, null);
                h = h2;
                z = decodeBooleanElement;
                color2 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, jVar, null);
                uInt2 = uInt4;
                color = color3;
                i = 127;
                wVar = wVar2;
                uInt = uInt3;
            } else {
                boolean z2 = true;
                boolean z3 = false;
                Color color4 = null;
                uInt = null;
                wVar = null;
                h = null;
                color = null;
                UInt uInt5 = null;
                int i4 = 0;
                while (z2) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z2 = false;
                            i2 = 6;
                        case 0:
                            z3 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                            i4 |= 1;
                            i2 = 6;
                            i3 = 5;
                        case 1:
                            uInt = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 1, UIntSerializer.INSTANCE, uInt);
                            i4 |= 2;
                            i2 = 6;
                            i3 = 5;
                        case 2:
                            wVar = (w) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], wVar);
                            i4 |= 4;
                            i2 = 6;
                        case 3:
                            h = (H) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], h);
                            i4 |= 8;
                        case 4:
                            color = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 4, j.f10549a, color);
                            i4 |= 16;
                        case 5:
                            uInt5 = (UInt) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, UIntSerializer.INSTANCE, uInt5);
                            i4 |= 32;
                        case 6:
                            color4 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, j.f10549a, color4);
                            i4 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                color2 = color4;
                uInt2 = uInt5;
                i = i4;
                z = z3;
            }
            beginStructure.endStructure(serialDescriptor);
            return new A(i, z, uInt, wVar, h, color, uInt2, color2, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = A.i;
            UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
            KSerializer<?> kSerializer = kSerializerArr[2];
            KSerializer<?> kSerializer2 = kSerializerArr[3];
            j jVar = j.f10549a;
            return new KSerializer[]{BooleanSerializer.INSTANCE, uIntSerializer, kSerializer, kSerializer2, jVar, BuiltinSerializersKt.getNullable(uIntSerializer), BuiltinSerializersKt.getNullable(jVar)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, A value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            A.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.A$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<A> serializer() {
            return a.f10518a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ A(int i2, boolean z, UInt uInt, w wVar, H h2, Color color, UInt uInt2, Color color2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z, uInt, wVar, h2, color, uInt2, color2, serializationConstructorMarker);
    }

    @SerialName("background_color")
    @Serializable(with = j.class)
    public static /* synthetic */ void c() {
    }

    @SerialName("control_size")
    public static /* synthetic */ void e() {
    }

    @SerialName("foreground_color")
    @Serializable(with = j.class)
    public static /* synthetic */ void g() {
    }

    @SerialName(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT)
    public static /* synthetic */ void i() {
    }

    @SerialName(CampaignEx.JSON_NATIVE_VIDEO_MUTE)
    public static /* synthetic */ void k() {
    }

    @SerialName("padding")
    public static /* synthetic */ void m() {
    }

    @SerialName("vertical_alignment")
    public static /* synthetic */ void o() {
    }

    /* renamed from: b, reason: from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: d, reason: from getter */
    public final UInt getControlSize() {
        return this.controlSize;
    }

    /* renamed from: f, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: h, reason: from getter */
    public final w getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getMute() {
        return this.mute;
    }

    /* renamed from: l, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* renamed from: n, reason: from getter */
    public final H getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ A(boolean z, int i2, w wVar, H h2, long j, UInt uInt, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i2, wVar, h2, j, uInt, color);
    }

    @JvmStatic
    public static final /* synthetic */ void a(A self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = i;
        output.encodeBooleanElement(serialDesc, 0, self.mute);
        UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, uIntSerializer, UInt.m8170boximpl(self.padding));
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.horizontalAlignment);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.verticalAlignment);
        j jVar = j.f10549a;
        output.encodeSerializableElement(serialDesc, 4, jVar, Color.m1618boximpl(self.foregroundColor));
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.controlSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, uIntSerializer, self.controlSize);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.backgroundColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, jVar, self.backgroundColor);
    }

    public /* synthetic */ A(int i2, boolean z, UInt uInt, w wVar, H h2, Color color, UInt uInt2, Color color2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i2 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 31, a.f10518a.getDescriptor());
        }
        this.mute = z;
        this.padding = uInt.getData();
        this.horizontalAlignment = wVar;
        this.verticalAlignment = h2;
        this.foregroundColor = color.m1638unboximpl();
        if ((i2 & 32) == 0) {
            this.controlSize = null;
        } else {
            this.controlSize = uInt2;
        }
        if ((i2 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color2;
        }
    }

    public A(boolean z, int i2, w horizontalAlignment, H verticalAlignment, long j, UInt uInt, Color color) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.mute = z;
        this.padding = i2;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j;
        this.controlSize = uInt;
        this.backgroundColor = color;
    }

    public /* synthetic */ A(boolean z, int i2, w wVar, H h2, long j, UInt uInt, Color color, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i2, wVar, h2, j, (i3 & 32) != 0 ? null : uInt, (i3 & 64) != 0 ? null : color, null);
    }
}
