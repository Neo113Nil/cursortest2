package com.chartboost.sdk.internal.Model.openrtb26;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J^\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010\u001fR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\b>\u00101\u001a\u0004\b=\u0010$¨\u0006A"}, d2 = {"Lcom/chartboost/sdk/internal/Model/openrtb26/Regs;", "", "", COPPA.COPPA_STANDARD, "gdpr", "", "usPrivacy", "gpp", "", "gppSid", "Lkotlinx/serialization/json/JsonObject;", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/internal/Model/openrtb26/Regs;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;)Lcom/chartboost/sdk/internal/Model/openrtb26/Regs;", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCoppa", "getCoppa$annotations", "()V", "getGdpr", "getGdpr$annotations", "Ljava/lang/String;", "getUsPrivacy", "getUsPrivacy$annotations", "getGpp", "getGpp$annotations", "Ljava/util/List;", "getGppSid", "getGppSid$annotations", "Lkotlinx/serialization/json/JsonObject;", "getExt", "getExt$annotations", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class Regs {
    private final Integer coppa;
    private final JsonObject ext;
    private final Integer gdpr;
    private final String gpp;
    private final List<Integer> gppSid;
    private final String usPrivacy;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Regs> serializer() {
            return a.f5117a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5117a;
        public static final SerialDescriptor b;

        static {
            a aVar = new a();
            f5117a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Regs", aVar, 6);
            pluginGeneratedSerialDescriptor.addElement(COPPA.COPPA_STANDARD, true);
            pluginGeneratedSerialDescriptor.addElement("gdpr", true);
            pluginGeneratedSerialDescriptor.addElement(CCPA.CCPA_STANDARD, true);
            pluginGeneratedSerialDescriptor.addElement("gpp", true);
            pluginGeneratedSerialDescriptor.addElement("gpp_sid", true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Regs deserialize(Decoder decoder) {
            List list;
            JsonObject jsonObject;
            String str;
            String str2;
            Integer num;
            Integer num2;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = Regs.$childSerializers;
            int i2 = 5;
            Integer num3 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
                Integer num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                String str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
                list = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
                num2 = num5;
                jsonObject = (JsonObject) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, JsonObjectSerializer.INSTANCE, null);
                str2 = str4;
                str = str3;
                i = 63;
                num = num4;
            } else {
                boolean z = true;
                int i3 = 0;
                Integer num6 = null;
                String str5 = null;
                String str6 = null;
                List list2 = null;
                JsonObject jsonObject2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 5;
                        case 0:
                            num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                            i3 |= 1;
                            i2 = 5;
                        case 1:
                            num6 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num6);
                            i3 |= 2;
                        case 2:
                            str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str5);
                            i3 |= 4;
                        case 3:
                            str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str6);
                            i3 |= 8;
                        case 4:
                            list2 = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list2);
                            i3 |= 16;
                        case 5:
                            jsonObject2 = (JsonObject) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, JsonObjectSerializer.INSTANCE, jsonObject2);
                            i3 |= 32;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                list = list2;
                jsonObject = jsonObject2;
                str = str5;
                str2 = str6;
                num = num3;
                num2 = num6;
                i = i3;
            }
            beginStructure.endStructure(serialDescriptor);
            return new Regs(i, num, num2, str, str2, list, jsonObject, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = Regs.$childSerializers;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE)};
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
        public final void serialize(Encoder encoder, Regs value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            Regs.write$Self$ChartboostMonetization_9_13_0_release(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    public Regs() {
        this((Integer) null, (Integer) null, (String) null, (String) null, (List) null, (JsonObject) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Regs copy$default(Regs regs, Integer num, Integer num2, String str, String str2, List list, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            num = regs.coppa;
        }
        if ((i & 2) != 0) {
            num2 = regs.gdpr;
        }
        Integer num3 = num2;
        if ((i & 4) != 0) {
            str = regs.usPrivacy;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = regs.gpp;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list = regs.gppSid;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            jsonObject = regs.ext;
        }
        return regs.copy(num, num3, str3, str4, list2, jsonObject);
    }

    @SerialName(COPPA.COPPA_STANDARD)
    public static /* synthetic */ void getCoppa$annotations() {
    }

    @SerialName("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @SerialName("gdpr")
    public static /* synthetic */ void getGdpr$annotations() {
    }

    @SerialName("gpp")
    public static /* synthetic */ void getGpp$annotations() {
    }

    @SerialName("gpp_sid")
    public static /* synthetic */ void getGppSid$annotations() {
    }

    @SerialName(CCPA.CCPA_STANDARD)
    public static /* synthetic */ void getUsPrivacy$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(Regs self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.coppa != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.coppa);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.gdpr != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.gdpr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.usPrivacy != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.usPrivacy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.gpp != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.gpp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.gppSid != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kSerializerArr[4], self.gppSid);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, JsonObjectSerializer.INSTANCE, self.ext);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getCoppa() {
        return this.coppa;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getGdpr() {
        return this.gdpr;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGpp() {
        return this.gpp;
    }

    public final List<Integer> component5() {
        return this.gppSid;
    }

    /* renamed from: component6, reason: from getter */
    public final JsonObject getExt() {
        return this.ext;
    }

    public final Regs copy(Integer coppa, Integer gdpr, String usPrivacy, String gpp, List<Integer> gppSid, JsonObject ext) {
        return new Regs(coppa, gdpr, usPrivacy, gpp, gppSid, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Regs)) {
            return false;
        }
        Regs regs = (Regs) other;
        return Intrinsics.areEqual(this.coppa, regs.coppa) && Intrinsics.areEqual(this.gdpr, regs.gdpr) && Intrinsics.areEqual(this.usPrivacy, regs.usPrivacy) && Intrinsics.areEqual(this.gpp, regs.gpp) && Intrinsics.areEqual(this.gppSid, regs.gppSid) && Intrinsics.areEqual(this.ext, regs.ext);
    }

    public final Integer getCoppa() {
        return this.coppa;
    }

    public final JsonObject getExt() {
        return this.ext;
    }

    public final Integer getGdpr() {
        return this.gdpr;
    }

    public final String getGpp() {
        return this.gpp;
    }

    public final List<Integer> getGppSid() {
        return this.gppSid;
    }

    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    public int hashCode() {
        Integer num = this.coppa;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.gdpr;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.usPrivacy;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gpp;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.gppSid;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        JsonObject jsonObject = this.ext;
        return hashCode5 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        return "Regs(coppa=" + this.coppa + ", gdpr=" + this.gdpr + ", usPrivacy=" + this.usPrivacy + ", gpp=" + this.gpp + ", gppSid=" + this.gppSid + ", ext=" + this.ext + ")";
    }

    public /* synthetic */ Regs(int i, Integer num, Integer num2, String str, String str2, List list, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coppa = null;
        } else {
            this.coppa = num;
        }
        if ((i & 2) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = num2;
        }
        if ((i & 4) == 0) {
            this.usPrivacy = null;
        } else {
            this.usPrivacy = str;
        }
        if ((i & 8) == 0) {
            this.gpp = null;
        } else {
            this.gpp = str2;
        }
        if ((i & 16) == 0) {
            this.gppSid = null;
        } else {
            this.gppSid = list;
        }
        if ((i & 32) == 0) {
            this.ext = null;
        } else {
            this.ext = jsonObject;
        }
    }

    public Regs(Integer num, Integer num2, String str, String str2, List<Integer> list, JsonObject jsonObject) {
        this.coppa = num;
        this.gdpr = num2;
        this.usPrivacy = str;
        this.gpp = str2;
        this.gppSid = list;
        this.ext = jsonObject;
    }

    public /* synthetic */ Regs(Integer num, Integer num2, String str, String str2, List list, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : jsonObject);
    }
}
