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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UIntSerializer;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0001\u0018\u0000 82\u00020\u0001:\u0002\u001b\"BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010!\u001a\u0004\b'\u0010(R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010!\u001a\u0004\b,\u0010-R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010!\u001a\u0004\b1\u00102R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u00104\u0012\u0004\b/\u0010!\u001a\u0004\b*\u00105R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u00106\u0012\u0004\b%\u0010!\u001a\u0004\b\"\u00107¨\u00069"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/i;", "", "", "text", "imageUrl", "Lkotlin/UInt;", "padding", "Lcom/moloco/sdk/internal/ortb/model/w;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/H;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/H;JLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/UInt;Lcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/H;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/i;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Ljava/lang/String;", InneractiveMediationDefs.GENDER_MALE, "()V", "b", "h", "i", "c", "I", com.mbridge.msdk.foundation.same.report.j.b, "()I", CampaignEx.JSON_KEY_AD_K, "d", "Lcom/moloco/sdk/internal/ortb/model/w;", "f", "()Lcom/moloco/sdk/internal/ortb/model/w;", "g", "e", "Lcom/moloco/sdk/internal/ortb/model/H;", C4761z5.q, "()Lcom/moloco/sdk/internal/ortb/model/H;", "o", "J", "()J", "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class i {
    public static final int h = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String text;

    /* renamed from: b, reason: from kotlin metadata */
    public final String imageUrl;

    /* renamed from: c, reason: from kotlin metadata */
    public final int padding;

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
    public /* synthetic */ class a implements GeneratedSerializer<i> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10548a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10548a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.CTA", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("text", false);
            pluginGeneratedSerialDescriptor.addElement(CampaignEx.JSON_KEY_IMAGE_URL, true);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT, false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i deserialize(Decoder decoder) {
            int i;
            Color color;
            String str;
            UInt uInt;
            H h;
            Color color2;
            String str2;
            w wVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = i.i;
            int i2 = 6;
            String str3 = null;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
                String str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
                UInt uInt2 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 2, UIntSerializer.INSTANCE, null);
                w wVar2 = (w) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
                H h2 = (H) beginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
                j jVar = j.f10549a;
                Color color3 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 5, jVar, null);
                Color color4 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, jVar, null);
                i = 127;
                h = h2;
                color = color4;
                color2 = color3;
                uInt = uInt2;
                wVar = wVar2;
                str2 = str4;
                str = decodeStringElement;
            } else {
                boolean z = true;
                int i3 = 0;
                Color color5 = null;
                Color color6 = null;
                String str5 = null;
                UInt uInt3 = null;
                w wVar3 = null;
                H h3 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                        case 0:
                            str3 = beginStructure.decodeStringElement(serialDescriptor, 0);
                            i3 |= 1;
                            i2 = 6;
                        case 1:
                            str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                            i3 |= 2;
                            i2 = 6;
                        case 2:
                            uInt3 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 2, UIntSerializer.INSTANCE, uInt3);
                            i3 |= 4;
                            i2 = 6;
                        case 3:
                            wVar3 = (w) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], wVar3);
                            i3 |= 8;
                        case 4:
                            h3 = (H) beginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], h3);
                            i3 |= 16;
                        case 5:
                            color6 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 5, j.f10549a, color6);
                            i3 |= 32;
                        case 6:
                            color5 = (Color) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, j.f10549a, color5);
                            i3 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i3;
                H h4 = h3;
                color = color5;
                str = str3;
                uInt = uInt3;
                h = h4;
                w wVar4 = wVar3;
                color2 = color6;
                str2 = str5;
                wVar = wVar4;
            }
            beginStructure.endStructure(serialDescriptor);
            return new i(i, str, str2, uInt, wVar, h, color2, color, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = i.i;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
            KSerializer<?> kSerializer = kSerializerArr[3];
            KSerializer<?> kSerializer2 = kSerializerArr[4];
            j jVar = j.f10549a;
            return new KSerializer[]{stringSerializer, nullable, UIntSerializer.INSTANCE, kSerializer, kSerializer2, jVar, BuiltinSerializersKt.getNullable(jVar)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, i value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            i.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.i$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<i> serializer() {
            return a.f10548a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ i(int i2, String str, String str2, UInt uInt, w wVar, H h2, Color color, Color color2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, uInt, wVar, h2, color, color2, serializationConstructorMarker);
    }

    @SerialName("background_color")
    @Serializable(with = j.class)
    public static /* synthetic */ void c() {
    }

    @SerialName("foreground_color")
    @Serializable(with = j.class)
    public static /* synthetic */ void e() {
    }

    @SerialName(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT)
    public static /* synthetic */ void g() {
    }

    @SerialName(CampaignEx.JSON_KEY_IMAGE_URL)
    public static /* synthetic */ void i() {
    }

    @SerialName("padding")
    public static /* synthetic */ void k() {
    }

    @SerialName("text")
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
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: f, reason: from getter */
    public final w getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: h, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: j, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* renamed from: l, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: n, reason: from getter */
    public final H getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ i(String str, String str2, int i2, w wVar, H h2, long j, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i2, wVar, h2, j, color);
    }

    @JvmStatic
    public static final /* synthetic */ void a(i self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = i;
        output.encodeStringElement(serialDesc, 0, self.text);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.imageUrl);
        }
        output.encodeSerializableElement(serialDesc, 2, UIntSerializer.INSTANCE, UInt.m8170boximpl(self.padding));
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.horizontalAlignment);
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.verticalAlignment);
        j jVar = j.f10549a;
        output.encodeSerializableElement(serialDesc, 5, jVar, Color.m1618boximpl(self.foregroundColor));
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.backgroundColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, jVar, self.backgroundColor);
    }

    public /* synthetic */ i(int i2, String str, String str2, UInt uInt, w wVar, H h2, Color color, Color color2, SerializationConstructorMarker serializationConstructorMarker) {
        if (61 != (i2 & 61)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 61, a.f10548a.getDescriptor());
        }
        this.text = str;
        if ((i2 & 2) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str2;
        }
        this.padding = uInt.getData();
        this.horizontalAlignment = wVar;
        this.verticalAlignment = h2;
        this.foregroundColor = color.m1638unboximpl();
        if ((i2 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = color2;
        }
    }

    public i(String text, String str, int i2, w horizontalAlignment, H verticalAlignment, long j, Color color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.text = text;
        this.imageUrl = str;
        this.padding = i2;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j;
        this.backgroundColor = color;
    }

    public /* synthetic */ i(String str, String str2, int i2, w wVar, H h2, long j, Color color, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, i2, wVar, h2, j, (i3 & 64) != 0 ? null : color, null);
    }
}
