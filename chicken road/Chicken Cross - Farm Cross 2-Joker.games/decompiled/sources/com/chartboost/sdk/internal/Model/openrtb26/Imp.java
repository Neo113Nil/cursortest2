package com.chartboost.sdk.internal.Model.openrtb26;

import com.chartboost.sdk.internal.Model.openrtb26.Banner;
import com.chartboost.sdk.internal.Model.openrtb26.Video;
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
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010$Jd\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b9\u00103\u001a\u0004\b8\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b;\u00103\u001a\u0004\b:\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\b>\u00103\u001a\u0004\b=\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b@\u00103\u001a\u0004\b?\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010<\u0012\u0004\bB\u00103\u001a\u0004\bA\u0010$¨\u0006E"}, d2 = {"Lcom/chartboost/sdk/internal/Model/openrtb26/Imp;", "", "Lcom/chartboost/sdk/internal/Model/openrtb26/Banner;", "banner", "Lcom/chartboost/sdk/internal/Model/openrtb26/Video;", "video", "", "displayManager", "displayManagerVer", "", "instl", "tagId", "secure", "<init>", "(Lcom/chartboost/sdk/internal/Model/openrtb26/Banner;Lcom/chartboost/sdk/internal/Model/openrtb26/Video;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/chartboost/sdk/internal/Model/openrtb26/Banner;Lcom/chartboost/sdk/internal/Model/openrtb26/Video;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/internal/Model/openrtb26/Imp;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/chartboost/sdk/internal/Model/openrtb26/Banner;", "component2", "()Lcom/chartboost/sdk/internal/Model/openrtb26/Video;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "copy", "(Lcom/chartboost/sdk/internal/Model/openrtb26/Banner;Lcom/chartboost/sdk/internal/Model/openrtb26/Video;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/chartboost/sdk/internal/Model/openrtb26/Imp;", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/chartboost/sdk/internal/Model/openrtb26/Banner;", "getBanner", "getBanner$annotations", "()V", "Lcom/chartboost/sdk/internal/Model/openrtb26/Video;", "getVideo", "getVideo$annotations", "Ljava/lang/String;", "getDisplayManager", "getDisplayManager$annotations", "getDisplayManagerVer", "getDisplayManagerVer$annotations", "Ljava/lang/Integer;", "getInstl", "getInstl$annotations", "getTagId", "getTagId$annotations", "getSecure", "getSecure$annotations", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class Imp {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Banner banner;
    private final String displayManager;
    private final String displayManagerVer;
    private final Integer instl;
    private final Integer secure;
    private final String tagId;
    private final Video video;

    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Imp> serializer() {
            return a.f5116a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5116a;
        public static final SerialDescriptor b;

        static {
            a aVar = new a();
            f5116a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Imp", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("banner", true);
            pluginGeneratedSerialDescriptor.addElement("video", true);
            pluginGeneratedSerialDescriptor.addElement("displaymanager", true);
            pluginGeneratedSerialDescriptor.addElement("displaymanagerver", true);
            pluginGeneratedSerialDescriptor.addElement("instl", true);
            pluginGeneratedSerialDescriptor.addElement("tagid", true);
            pluginGeneratedSerialDescriptor.addElement("secure", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Imp deserialize(Decoder decoder) {
            Integer num;
            String str;
            Integer num2;
            String str2;
            String str3;
            Video video;
            Banner banner;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i2 = 6;
            Banner banner2 = null;
            if (beginStructure.decodeSequentially()) {
                Banner banner3 = (Banner) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, Banner.a.f5110a, null);
                Video video2 = (Video) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Video.a.f5120a, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                String str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
                String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
                Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
                banner = banner3;
                num = num4;
                str = str6;
                str2 = str5;
                num2 = num3;
                str3 = str4;
                video = video2;
                i = 127;
            } else {
                boolean z = true;
                int i3 = 0;
                Integer num5 = null;
                Video video3 = null;
                String str7 = null;
                String str8 = null;
                Integer num6 = null;
                String str9 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 6;
                        case 0:
                            banner2 = (Banner) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, Banner.a.f5110a, banner2);
                            i3 |= 1;
                            i2 = 6;
                        case 1:
                            video3 = (Video) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Video.a.f5120a, video3);
                            i3 |= 2;
                            i2 = 6;
                        case 2:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str7);
                            i3 |= 4;
                        case 3:
                            str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str8);
                            i3 |= 8;
                        case 4:
                            num6 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num6);
                            i3 |= 16;
                        case 5:
                            str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str9);
                            i3 |= 32;
                        case 6:
                            num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num5);
                            i3 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                num = num5;
                str = str9;
                num2 = num6;
                str2 = str8;
                str3 = str7;
                video = video3;
                banner = banner2;
                i = i3;
            }
            beginStructure.endStructure(serialDescriptor);
            return new Imp(i, banner, video, str3, str2, num2, str, num, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            KSerializer nullable = BuiltinSerializersKt.getNullable(Banner.a.f5110a);
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(Video.a.f5120a);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
            KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
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
        public final void serialize(Encoder encoder, Imp value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            Imp.write$Self$ChartboostMonetization_9_13_0_release(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    public Imp() {
        this((Banner) null, (Video) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Imp copy$default(Imp imp, Banner banner, Video video, String str, String str2, Integer num, String str3, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            banner = imp.banner;
        }
        if ((i & 2) != 0) {
            video = imp.video;
        }
        Video video2 = video;
        if ((i & 4) != 0) {
            str = imp.displayManager;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = imp.displayManagerVer;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            num = imp.instl;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            str3 = imp.tagId;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            num2 = imp.secure;
        }
        return imp.copy(banner, video2, str4, str5, num3, str6, num2);
    }

    @SerialName("banner")
    public static /* synthetic */ void getBanner$annotations() {
    }

    @SerialName("displaymanager")
    public static /* synthetic */ void getDisplayManager$annotations() {
    }

    @SerialName("displaymanagerver")
    public static /* synthetic */ void getDisplayManagerVer$annotations() {
    }

    @SerialName("instl")
    public static /* synthetic */ void getInstl$annotations() {
    }

    @SerialName("secure")
    public static /* synthetic */ void getSecure$annotations() {
    }

    @SerialName("tagid")
    public static /* synthetic */ void getTagId$annotations() {
    }

    @SerialName("video")
    public static /* synthetic */ void getVideo$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(Imp self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.banner != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, Banner.a.f5110a, self.banner);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.video != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, Video.a.f5120a, self.video);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.displayManager != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.displayManager);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.displayManagerVer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.displayManagerVer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.instl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.instl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.tagId != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.tagId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.secure == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.secure);
    }

    /* renamed from: component1, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    /* renamed from: component2, reason: from getter */
    public final Video getVideo() {
        return this.video;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayManager() {
        return this.displayManager;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayManagerVer() {
        return this.displayManagerVer;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getInstl() {
        return this.instl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getSecure() {
        return this.secure;
    }

    public final Imp copy(Banner banner, Video video, String displayManager, String displayManagerVer, Integer instl, String tagId, Integer secure) {
        return new Imp(banner, video, displayManager, displayManagerVer, instl, tagId, secure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Imp)) {
            return false;
        }
        Imp imp = (Imp) other;
        return Intrinsics.areEqual(this.banner, imp.banner) && Intrinsics.areEqual(this.video, imp.video) && Intrinsics.areEqual(this.displayManager, imp.displayManager) && Intrinsics.areEqual(this.displayManagerVer, imp.displayManagerVer) && Intrinsics.areEqual(this.instl, imp.instl) && Intrinsics.areEqual(this.tagId, imp.tagId) && Intrinsics.areEqual(this.secure, imp.secure);
    }

    public final Banner getBanner() {
        return this.banner;
    }

    public final String getDisplayManager() {
        return this.displayManager;
    }

    public final String getDisplayManagerVer() {
        return this.displayManagerVer;
    }

    public final Integer getInstl() {
        return this.instl;
    }

    public final Integer getSecure() {
        return this.secure;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        Banner banner = this.banner;
        int hashCode = (banner == null ? 0 : banner.hashCode()) * 31;
        Video video = this.video;
        int hashCode2 = (hashCode + (video == null ? 0 : video.hashCode())) * 31;
        String str = this.displayManager;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayManagerVer;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.instl;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.tagId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.secure;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Imp(banner=" + this.banner + ", video=" + this.video + ", displayManager=" + this.displayManager + ", displayManagerVer=" + this.displayManagerVer + ", instl=" + this.instl + ", tagId=" + this.tagId + ", secure=" + this.secure + ")";
    }

    public /* synthetic */ Imp(int i, Banner banner, Video video, String str, String str2, Integer num, String str3, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.banner = null;
        } else {
            this.banner = banner;
        }
        if ((i & 2) == 0) {
            this.video = null;
        } else {
            this.video = video;
        }
        if ((i & 4) == 0) {
            this.displayManager = null;
        } else {
            this.displayManager = str;
        }
        if ((i & 8) == 0) {
            this.displayManagerVer = null;
        } else {
            this.displayManagerVer = str2;
        }
        if ((i & 16) == 0) {
            this.instl = null;
        } else {
            this.instl = num;
        }
        if ((i & 32) == 0) {
            this.tagId = null;
        } else {
            this.tagId = str3;
        }
        if ((i & 64) == 0) {
            this.secure = null;
        } else {
            this.secure = num2;
        }
    }

    public Imp(Banner banner, Video video, String str, String str2, Integer num, String str3, Integer num2) {
        this.banner = banner;
        this.video = video;
        this.displayManager = str;
        this.displayManagerVer = str2;
        this.instl = num;
        this.tagId = str3;
        this.secure = num2;
    }

    public /* synthetic */ Imp(Banner banner, Video video, String str, String str2, Integer num, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : banner, (i & 2) != 0 ? null : video, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num2);
    }
}
