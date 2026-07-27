package com.chartboost.sdk.internal.Model.openrtb26;

import com.chartboost.sdk.internal.Model.openrtb26.CompanionAd;
import com.chartboost.sdk.internal.Model.openrtb26.VideoExt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JR\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001bR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00108\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010!¨\u0006="}, d2 = {"Lcom/chartboost/sdk/internal/Model/openrtb26/Video;", "", "", "w", "h", "placement", "", "Lcom/chartboost/sdk/internal/Model/openrtb26/CompanionAd;", "companionAd", "Lcom/chartboost/sdk/internal/Model/openrtb26/VideoExt;", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/chartboost/sdk/internal/Model/openrtb26/VideoExt;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/chartboost/sdk/internal/Model/openrtb26/VideoExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/internal/Model/openrtb26/Video;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/chartboost/sdk/internal/Model/openrtb26/VideoExt;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/chartboost/sdk/internal/Model/openrtb26/VideoExt;)Lcom/chartboost/sdk/internal/Model/openrtb26/Video;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getW", "getW$annotations", "()V", "getH", "getH$annotations", "getPlacement", "getPlacement$annotations", "Ljava/util/List;", "getCompanionAd", "getCompanionAd$annotations", "Lcom/chartboost/sdk/internal/Model/openrtb26/VideoExt;", "getExt", "getExt$annotations", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class Video {
    private final List<CompanionAd> companionAd;
    private final VideoExt ext;
    private final Integer h;
    private final Integer placement;
    private final Integer w;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(CompanionAd.a.f5113a), null};

    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Video> serializer() {
            return a.f5120a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5120a;
        public static final SerialDescriptor b;

        static {
            a aVar = new a();
            f5120a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Video", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement("h", true);
            pluginGeneratedSerialDescriptor.addElement("placement", true);
            pluginGeneratedSerialDescriptor.addElement("companionad", true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Video deserialize(Decoder decoder) {
            int i;
            Integer num;
            Integer num2;
            Integer num3;
            List list;
            VideoExt videoExt;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = Video.$childSerializers;
            Integer num4 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
                Integer num6 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
                Integer num7 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
                list = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
                num3 = num7;
                videoExt = (VideoExt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, VideoExt.a.f5121a, null);
                i = 31;
                num2 = num6;
                num = num5;
            } else {
                boolean z = true;
                int i2 = 0;
                Integer num8 = null;
                Integer num9 = null;
                List list2 = null;
                VideoExt videoExt2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num4);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        num8 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num8);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        num9 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num9);
                        i2 |= 4;
                    } else if (decodeElementIndex == 3) {
                        list2 = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list2);
                        i2 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        videoExt2 = (VideoExt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, VideoExt.a.f5121a, videoExt2);
                        i2 |= 16;
                    }
                }
                i = i2;
                num = num4;
                num2 = num8;
                num3 = num9;
                list = list2;
                videoExt = videoExt2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new Video(i, num, num2, num3, list, videoExt, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = Video.$childSerializers;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(VideoExt.a.f5121a)};
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
        public final void serialize(Encoder encoder, Video value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            Video.write$Self$ChartboostMonetization_9_13_0_release(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    public Video() {
        this((Integer) null, (Integer) null, (Integer) null, (List) null, (VideoExt) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Video copy$default(Video video, Integer num, Integer num2, Integer num3, List list, VideoExt videoExt, int i, Object obj) {
        if ((i & 1) != 0) {
            num = video.w;
        }
        if ((i & 2) != 0) {
            num2 = video.h;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            num3 = video.placement;
        }
        Integer num5 = num3;
        if ((i & 8) != 0) {
            list = video.companionAd;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            videoExt = video.ext;
        }
        return video.copy(num, num4, num5, list2, videoExt);
    }

    @SerialName("companionad")
    public static /* synthetic */ void getCompanionAd$annotations() {
    }

    @SerialName("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @SerialName("h")
    public static /* synthetic */ void getH$annotations() {
    }

    @SerialName("placement")
    public static /* synthetic */ void getPlacement$annotations() {
    }

    @SerialName("w")
    public static /* synthetic */ void getW$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(Video self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.placement != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.placement);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.companionAd != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.companionAd);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, VideoExt.a.f5121a, self.ext);
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
    public final Integer getPlacement() {
        return this.placement;
    }

    public final List<CompanionAd> component4() {
        return this.companionAd;
    }

    /* renamed from: component5, reason: from getter */
    public final VideoExt getExt() {
        return this.ext;
    }

    public final Video copy(Integer w, Integer h, Integer placement, List<CompanionAd> companionAd, VideoExt ext) {
        return new Video(w, h, placement, companionAd, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Video)) {
            return false;
        }
        Video video = (Video) other;
        return Intrinsics.areEqual(this.w, video.w) && Intrinsics.areEqual(this.h, video.h) && Intrinsics.areEqual(this.placement, video.placement) && Intrinsics.areEqual(this.companionAd, video.companionAd) && Intrinsics.areEqual(this.ext, video.ext);
    }

    public final List<CompanionAd> getCompanionAd() {
        return this.companionAd;
    }

    public final VideoExt getExt() {
        return this.ext;
    }

    public final Integer getH() {
        return this.h;
    }

    public final Integer getPlacement() {
        return this.placement;
    }

    public final Integer getW() {
        return this.w;
    }

    public int hashCode() {
        Integer num = this.w;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.h;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.placement;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<CompanionAd> list = this.companionAd;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        VideoExt videoExt = this.ext;
        return hashCode4 + (videoExt != null ? videoExt.hashCode() : 0);
    }

    public String toString() {
        return "Video(w=" + this.w + ", h=" + this.h + ", placement=" + this.placement + ", companionAd=" + this.companionAd + ", ext=" + this.ext + ")";
    }

    public /* synthetic */ Video(int i, Integer num, Integer num2, Integer num3, List list, VideoExt videoExt, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.placement = null;
        } else {
            this.placement = num3;
        }
        if ((i & 8) == 0) {
            this.companionAd = null;
        } else {
            this.companionAd = list;
        }
        if ((i & 16) == 0) {
            this.ext = null;
        } else {
            this.ext = videoExt;
        }
    }

    public Video(Integer num, Integer num2, Integer num3, List<CompanionAd> list, VideoExt videoExt) {
        this.w = num;
        this.h = num2;
        this.placement = num3;
        this.companionAd = list;
        this.ext = videoExt;
    }

    public /* synthetic */ Video(Integer num, Integer num2, Integer num3, List list, VideoExt videoExt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : videoExt);
    }
}
