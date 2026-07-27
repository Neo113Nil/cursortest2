package com.chartboost.sdk.internal.Model.openrtb26;

import com.chartboost.sdk.internal.Model.openrtb26.BannerExt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001a¨\u00061"}, d2 = {"Lcom/chartboost/sdk/internal/Model/openrtb26/Banner;", "", "", "w", "h", "Lcom/chartboost/sdk/internal/Model/openrtb26/BannerExt;", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/chartboost/sdk/internal/Model/openrtb26/BannerExt;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lcom/chartboost/sdk/internal/Model/openrtb26/BannerExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/internal/Model/openrtb26/Banner;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Lcom/chartboost/sdk/internal/Model/openrtb26/BannerExt;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/chartboost/sdk/internal/Model/openrtb26/BannerExt;)Lcom/chartboost/sdk/internal/Model/openrtb26/Banner;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getW", "getW$annotations", "()V", "getH", "getH$annotations", "Lcom/chartboost/sdk/internal/Model/openrtb26/BannerExt;", "getExt", "getExt$annotations", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class Banner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BannerExt ext;
    private final Integer h;
    private final Integer w;

    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Banner> serializer() {
            return a.f5110a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5110a;
        public static final SerialDescriptor b;

        static {
            a aVar = new a();
            f5110a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Banner", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement("h", true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Banner deserialize(Decoder decoder) {
            int i;
            Integer num;
            Integer num2;
            BannerExt bannerExt;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            Integer num3 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
                num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
                bannerExt = (BannerExt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BannerExt.a.f5111a, null);
                i = 7;
                num = num4;
            } else {
                boolean z = true;
                int i2 = 0;
                Integer num5 = null;
                BannerExt bannerExt2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num5);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        bannerExt2 = (BannerExt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BannerExt.a.f5111a, bannerExt2);
                        i2 |= 4;
                    }
                }
                i = i2;
                num = num3;
                num2 = num5;
                bannerExt = bannerExt2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new Banner(i, num, num2, bannerExt, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(BannerExt.a.f5111a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, Banner value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            Banner.write$Self$ChartboostMonetization_9_13_0_release(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    public Banner() {
        this((Integer) null, (Integer) null, (BannerExt) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Banner copy$default(Banner banner, Integer num, Integer num2, BannerExt bannerExt, int i, Object obj) {
        if ((i & 1) != 0) {
            num = banner.w;
        }
        if ((i & 2) != 0) {
            num2 = banner.h;
        }
        if ((i & 4) != 0) {
            bannerExt = banner.ext;
        }
        return banner.copy(num, num2, bannerExt);
    }

    @SerialName("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @SerialName("h")
    public static /* synthetic */ void getH$annotations() {
    }

    @SerialName("w")
    public static /* synthetic */ void getW$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(Banner self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.h);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, BannerExt.a.f5111a, self.ext);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getW() {
        return this.w;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getH() {
        return this.h;
    }

    /* renamed from: component3, reason: from getter */
    public final BannerExt getExt() {
        return this.ext;
    }

    public final Banner copy(Integer w, Integer h, BannerExt ext) {
        return new Banner(w, h, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) other;
        return Intrinsics.areEqual(this.w, banner.w) && Intrinsics.areEqual(this.h, banner.h) && Intrinsics.areEqual(this.ext, banner.ext);
    }

    public final BannerExt getExt() {
        return this.ext;
    }

    public final Integer getH() {
        return this.h;
    }

    public final Integer getW() {
        return this.w;
    }

    public int hashCode() {
        Integer num = this.w;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.h;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        BannerExt bannerExt = this.ext;
        return hashCode2 + (bannerExt != null ? bannerExt.hashCode() : 0);
    }

    public String toString() {
        return "Banner(w=" + this.w + ", h=" + this.h + ", ext=" + this.ext + ")";
    }

    public /* synthetic */ Banner(int i, Integer num, Integer num2, BannerExt bannerExt, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.w = null;
        } else {
            this.w = num;
        }
        if ((i & 2) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = bannerExt;
        }
    }

    public Banner(Integer num, Integer num2, BannerExt bannerExt) {
        this.w = num;
        this.h = num2;
        this.ext = bannerExt;
    }

    public /* synthetic */ Banner(Integer num, Integer num2, BannerExt bannerExt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bannerExt);
    }
}
