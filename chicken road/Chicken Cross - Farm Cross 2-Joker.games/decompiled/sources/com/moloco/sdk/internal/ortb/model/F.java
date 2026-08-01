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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0001\u0018\u0000 52\u00020\u0001:\u0002\u001a!BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001c\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010'\u0012\u0004\b*\u0010 \u001a\u0004\b(\u0010)R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010+\u0012\u0004\b.\u0010 \u001a\u0004\b,\u0010-R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010/\u0012\u0004\b2\u0010 \u001a\u0004\b0\u00101R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00103\u0012\u0004\b$\u0010 \u001a\u0004\b!\u00104¨\u00066"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/F;", "", "Lkotlin/UInt;", "delaySeconds", "padding", "controlSize", "Lcom/moloco/sdk/internal/ortb/model/w;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/H;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "backgroundColor", "<init>", "(IIILcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/H;JLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlin/UInt;Lkotlin/UInt;Lkotlin/UInt;Lcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/H;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/F;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", "f", "()I", "g", "()V", "b", CmcdData.Factory.STREAM_TYPE_LIVE, InneractiveMediationDefs.GENDER_MALE, "c", "d", "e", "Lcom/moloco/sdk/internal/ortb/model/w;", com.mbridge.msdk.foundation.same.report.j.b, "()Lcom/moloco/sdk/internal/ortb/model/w;", CampaignEx.JSON_KEY_AD_K, "Lcom/moloco/sdk/internal/ortb/model/H;", C4761z5.q, "()Lcom/moloco/sdk/internal/ortb/model/H;", "o", "J", "h", "()J", "i", "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class F {
    public static final int h = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int delaySeconds;

    /* renamed from: b, reason: from kotlin metadata */
    public final int padding;

    /* renamed from: c, reason: from kotlin metadata */
    public final int controlSize;

    /* renamed from: d, reason: from kotlin metadata */
    public final w horizontalAlignment;

    /* renamed from: e, reason: from kotlin metadata */
    public final H verticalAlignment;

    /* renamed from: f, reason: from kotlin metadata */
    public final long foregroundColor;

    /* renamed from: g, reason: from kotlin metadata */
    public final Color backgroundColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer<Object>[] i = {null, null, null, w.INSTANCE.serializer(), H.INSTANCE.serializer(), null, null};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<F> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10528a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10528a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.SkipClose", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("delay_seconds", false);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement("control_size", false);
            pluginGeneratedSerialDescriptor.addElement(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT, false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F deserialize(Decoder decoder) {
            int i;
            Color color;
            UInt uInt;
            UInt uInt2;
            H h;
            Color color2;
            UInt uInt3;
            w wVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = F.i;
            int i2 = 6;
            UInt uInt4 = null;
            if (beginStructure.decodeSequentially()) {
                UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
                UInt uInt5 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 0, uIntSerializer, null);
                UInt uInt6 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 1, uIntSerializer, null);
                UInt uInt7 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 2, uIntSerializer, null);
                w wVar2 = (w) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
                H h2 = (H) beginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
                j jVar = j.f10549a;
                Color color3 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 5, jVar, null);
                h = h2;
                uInt2 = uInt7;
                color = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, jVar, null);
                color2 = color3;
                wVar = wVar2;
                i = 127;
                uInt3 = uInt6;
                uInt = uInt5;
            } else {
                boolean z = true;
                int i3 = 0;
                Color color4 = null;
                Color color5 = null;
                UInt uInt8 = null;
                UInt uInt9 = null;
                w wVar3 = null;
                H h3 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 6;
                        case 0:
                            uInt4 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, uInt4);
                            i3 |= 1;
                            i2 = 6;
                        case 1:
                            uInt8 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 1, UIntSerializer.INSTANCE, uInt8);
                            i3 |= 2;
                            i2 = 6;
                        case 2:
                            uInt9 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 2, UIntSerializer.INSTANCE, uInt9);
                            i3 |= 4;
                            i2 = 6;
                        case 3:
                            wVar3 = (w) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], wVar3);
                            i3 |= 8;
                        case 4:
                            h3 = (H) beginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], h3);
                            i3 |= 16;
                        case 5:
                            color5 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 5, j.f10549a, color5);
                            i3 |= 32;
                        case 6:
                            color4 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, j.f10549a, color4);
                            i3 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i3;
                H h4 = h3;
                color = color4;
                uInt = uInt4;
                uInt2 = uInt9;
                h = h4;
                w wVar4 = wVar3;
                color2 = color5;
                uInt3 = uInt8;
                wVar = wVar4;
            }
            beginStructure.endStructure(serialDescriptor);
            return new F(i, uInt, uInt3, uInt2, wVar, h, color2, color, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = F.i;
            KSerializer<?> kSerializer = kSerializerArr[3];
            KSerializer<?> kSerializer2 = kSerializerArr[4];
            j jVar = j.f10549a;
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(jVar);
            UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
            return new KSerializer[]{uIntSerializer, uIntSerializer, uIntSerializer, kSerializer, kSerializer2, jVar, nullable};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, F value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            F.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.F$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<F> serializer() {
            return a.f10528a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ F(int i2, int i3, int i4, w wVar, H h2, long j, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, wVar, h2, j, color);
    }

    @SerialName("background_color")
    @Serializable(with = j.class)
    public static /* synthetic */ void c() {
    }

    @SerialName("control_size")
    public static /* synthetic */ void e() {
    }

    @SerialName("delay_seconds")
    public static /* synthetic */ void g() {
    }

    @SerialName("foreground_color")
    @Serializable(with = j.class)
    public static /* synthetic */ void i() {
    }

    @SerialName(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT)
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
    public final int getControlSize() {
        return this.controlSize;
    }

    /* renamed from: f, reason: from getter */
    public final int getDelaySeconds() {
        return this.delaySeconds;
    }

    /* renamed from: h, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: j, reason: from getter */
    public final w getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: l, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* renamed from: n, reason: from getter */
    public final H getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ F(int i2, UInt uInt, UInt uInt2, UInt uInt3, w wVar, H h2, Color color, Color color2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, uInt, uInt2, uInt3, wVar, h2, color, color2, serializationConstructorMarker);
    }

    @JvmStatic
    public static final /* synthetic */ void a(F self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = i;
        UIntSerializer uIntSerializer = UIntSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, uIntSerializer, UInt.m8170boximpl(self.delaySeconds));
        output.encodeSerializableElement(serialDesc, 1, uIntSerializer, UInt.m8170boximpl(self.padding));
        output.encodeSerializableElement(serialDesc, 2, uIntSerializer, UInt.m8170boximpl(self.controlSize));
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.horizontalAlignment);
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.verticalAlignment);
        j jVar = j.f10549a;
        output.encodeSerializableElement(serialDesc, 5, jVar, Color.m1618boximpl(self.foregroundColor));
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.backgroundColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, jVar, self.backgroundColor);
    }

    public /* synthetic */ F(int i2, UInt uInt, UInt uInt2, UInt uInt3, w wVar, H h2, Color color, Color color2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i2 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 63, a.f10528a.getDescriptor());
        }
        this.delaySeconds = uInt.getData();
        this.padding = uInt2.getData();
        this.controlSize = uInt3.getData();
        this.horizontalAlignment = wVar;
        this.verticalAlignment = h2;
        this.foregroundColor = color.m1638unboximpl();
        if ((i2 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color2;
        }
    }

    public F(int i2, int i3, int i4, w horizontalAlignment, H verticalAlignment, long j, Color color) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.delaySeconds = i2;
        this.padding = i3;
        this.controlSize = i4;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j;
        this.backgroundColor = color;
    }

    public /* synthetic */ F(int i2, int i3, int i4, w wVar, H h2, long j, Color color, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, wVar, h2, j, (i5 & 64) != 0 ? null : color, null);
    }
}
