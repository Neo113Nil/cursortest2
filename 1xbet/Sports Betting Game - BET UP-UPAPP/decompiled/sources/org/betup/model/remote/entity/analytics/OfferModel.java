package org.betup.model.remote.entity.analytics;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.annotation.Annotation;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonClassDiscriminator;
import org.betup.ui.dialogs.offer.BetcoinContent;
import org.betup.ui.dialogs.offer.BetcoinContent$$serializer;
import org.betup.ui.dialogs.offer.ButtonContent;
import org.betup.ui.dialogs.offer.ButtonContent$$serializer;
import org.betup.ui.dialogs.offer.OfferItemContent;
import org.betup.ui.dialogs.offer.PriceContent;
import org.betup.ui.dialogs.offer.PriceContent$$serializer;
import org.betup.ui.dialogs.offer.TimerContent;
import org.betup.ui.dialogs.offer.TimerContent$$serializer;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferModel.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002MNB\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0013HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0095\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0006HÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001J%\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\bLR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006O"}, d2 = {"Lorg/betup/model/remote/entity/analytics/OfferModel;", "Ljava/io/Serializable;", "signature", "", "id", "betcoins", "", UnifiedMediationParams.KEY_ICON_URL, "newStoreCode", "oldStoreCode", "subtitle", "tickets", "title", "expiresAt", "Ljava/util/Date;", "elements", "", "Lorg/betup/ui/dialogs/offer/OfferItemContent;", "offerType", "Lorg/betup/model/remote/entity/analytics/OfferType;", "htmlTemplateData", "Lorg/betup/model/remote/entity/analytics/OfferHtmlTemplateData;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Ljava/util/List;Lorg/betup/model/remote/entity/analytics/OfferType;Lorg/betup/model/remote/entity/analytics/OfferHtmlTemplateData;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Ljava/util/List;Lorg/betup/model/remote/entity/analytics/OfferType;Lorg/betup/model/remote/entity/analytics/OfferHtmlTemplateData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSignature", "()Ljava/lang/String;", "getId", "getBetcoins", "()I", "getIconUrl", "getNewStoreCode", "getOldStoreCode", "getSubtitle", "getTickets", "getTitle", "getExpiresAt$annotations", "()V", "getExpiresAt", "()Ljava/util/Date;", "getElements", "()Ljava/util/List;", "getOfferType", "()Lorg/betup/model/remote/entity/analytics/OfferType;", "getHtmlTemplateData", "()Lorg/betup/model/remote/entity/analytics/OfferHtmlTemplateData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class OfferModel implements java.io.Serializable {

    @SerializedName("betcoins")
    private final int betcoins;

    @SerializedName("elements")
    private final List<OfferItemContent> elements;

    @SerializedName("expiresAt")
    private final Date expiresAt;

    @SerializedName("htmlTemplateData")
    private final OfferHtmlTemplateData htmlTemplateData;

    @SerializedName(UnifiedMediationParams.KEY_ICON_URL)
    private final String iconUrl;

    @SerializedName("id")
    private final String id;

    @SerializedName("newStoreCode")
    private final String newStoreCode;

    @SerializedName("offerType")
    private final OfferType offerType;

    @SerializedName("oldStoreCode")
    private final String oldStoreCode;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("tickets")
    private final int tickets;

    @SerializedName("title")
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: org.betup.model.remote.entity.analytics.OfferModel$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KSerializer _childSerializers$_anonymous_;
            _childSerializers$_anonymous_ = OfferModel._childSerializers$_anonymous_();
            return _childSerializers$_anonymous_;
        }
    }), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: org.betup.model.remote.entity.analytics.OfferModel$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KSerializer _childSerializers$_anonymous_$0;
            _childSerializers$_anonymous_$0 = OfferModel._childSerializers$_anonymous_$0();
            return _childSerializers$_anonymous_$0;
        }
    }), null};

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return OfferType.INSTANCE.serializer();
    }

    @Serializable(with = DateSerializer.class)
    public static /* synthetic */ void getExpiresAt$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* renamed from: component10, reason: from getter */
    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    public final List<OfferItemContent> component11() {
        return this.elements;
    }

    /* renamed from: component12, reason: from getter */
    public final OfferType getOfferType() {
        return this.offerType;
    }

    /* renamed from: component13, reason: from getter */
    public final OfferHtmlTemplateData getHtmlTemplateData() {
        return this.htmlTemplateData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBetcoins() {
        return this.betcoins;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNewStoreCode() {
        return this.newStoreCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOldStoreCode() {
        return this.oldStoreCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTickets() {
        return this.tickets;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final OfferModel copy(String signature, String id, int betcoins, String iconUrl, String newStoreCode, String oldStoreCode, String subtitle, int tickets, String title, Date expiresAt, List<? extends OfferItemContent> elements, OfferType offerType, OfferHtmlTemplateData htmlTemplateData) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(newStoreCode, "newStoreCode");
        Intrinsics.checkNotNullParameter(oldStoreCode, "oldStoreCode");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        return new OfferModel(signature, id, betcoins, iconUrl, newStoreCode, oldStoreCode, subtitle, tickets, title, expiresAt, elements, offerType, htmlTemplateData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferModel)) {
            return false;
        }
        OfferModel offerModel = (OfferModel) other;
        return Intrinsics.areEqual(this.signature, offerModel.signature) && Intrinsics.areEqual(this.id, offerModel.id) && this.betcoins == offerModel.betcoins && Intrinsics.areEqual(this.iconUrl, offerModel.iconUrl) && Intrinsics.areEqual(this.newStoreCode, offerModel.newStoreCode) && Intrinsics.areEqual(this.oldStoreCode, offerModel.oldStoreCode) && Intrinsics.areEqual(this.subtitle, offerModel.subtitle) && this.tickets == offerModel.tickets && Intrinsics.areEqual(this.title, offerModel.title) && Intrinsics.areEqual(this.expiresAt, offerModel.expiresAt) && Intrinsics.areEqual(this.elements, offerModel.elements) && this.offerType == offerModel.offerType && Intrinsics.areEqual(this.htmlTemplateData, offerModel.htmlTemplateData);
    }

    public int hashCode() {
        String str = this.signature;
        int hashCode = (((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.id.hashCode()) * 31) + Integer.hashCode(this.betcoins)) * 31) + this.iconUrl.hashCode()) * 31) + this.newStoreCode.hashCode()) * 31) + this.oldStoreCode.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.tickets)) * 31) + this.title.hashCode()) * 31) + this.expiresAt.hashCode()) * 31) + this.elements.hashCode()) * 31) + this.offerType.hashCode()) * 31;
        OfferHtmlTemplateData offerHtmlTemplateData = this.htmlTemplateData;
        return hashCode + (offerHtmlTemplateData != null ? offerHtmlTemplateData.hashCode() : 0);
    }

    public String toString() {
        return "OfferModel(signature=" + this.signature + ", id=" + this.id + ", betcoins=" + this.betcoins + ", iconUrl=" + this.iconUrl + ", newStoreCode=" + this.newStoreCode + ", oldStoreCode=" + this.oldStoreCode + ", subtitle=" + this.subtitle + ", tickets=" + this.tickets + ", title=" + this.title + ", expiresAt=" + this.expiresAt + ", elements=" + this.elements + ", offerType=" + this.offerType + ", htmlTemplateData=" + this.htmlTemplateData + ")";
    }

    /* compiled from: OfferModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/analytics/OfferModel$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OfferModel> serializer() {
            return OfferModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OfferModel(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, Date date, List list, OfferType offerType, OfferHtmlTemplateData offerHtmlTemplateData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1718 != (i & 1718)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1718, OfferModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.signature = null;
        } else {
            this.signature = str;
        }
        this.id = str2;
        this.betcoins = i2;
        if ((i & 8) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str3;
        }
        this.newStoreCode = str4;
        this.oldStoreCode = str5;
        if ((i & 64) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str6;
        }
        this.tickets = i3;
        if ((i & 256) == 0) {
            this.title = "";
        } else {
            this.title = str7;
        }
        this.expiresAt = date;
        this.elements = list;
        this.offerType = (i & 2048) == 0 ? OfferType.NONE : offerType;
        if ((i & 4096) == 0) {
            this.htmlTemplateData = null;
        } else {
            this.htmlTemplateData = offerHtmlTemplateData;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(OfferModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.signature != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.signature);
        }
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeIntElement(serialDesc, 2, self.betcoins);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.iconUrl, "")) {
            output.encodeStringElement(serialDesc, 3, self.iconUrl);
        }
        output.encodeStringElement(serialDesc, 4, self.newStoreCode);
        output.encodeStringElement(serialDesc, 5, self.oldStoreCode);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.subtitle, "")) {
            output.encodeStringElement(serialDesc, 6, self.subtitle);
        }
        output.encodeIntElement(serialDesc, 7, self.tickets);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual(self.title, "")) {
            output.encodeStringElement(serialDesc, 8, self.title);
        }
        output.encodeSerializableElement(serialDesc, 9, DateSerializer.INSTANCE, self.expiresAt);
        output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.elements);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.offerType != OfferType.NONE) {
            output.encodeSerializableElement(serialDesc, 11, lazyArr[11].getValue(), self.offerType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.htmlTemplateData == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, OfferHtmlTemplateData$$serializer.INSTANCE, self.htmlTemplateData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfferModel(String str, String id, int i, String iconUrl, String newStoreCode, String oldStoreCode, String subtitle, int i2, String title, Date expiresAt, List<? extends OfferItemContent> elements, OfferType offerType, OfferHtmlTemplateData offerHtmlTemplateData) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(newStoreCode, "newStoreCode");
        Intrinsics.checkNotNullParameter(oldStoreCode, "oldStoreCode");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        this.signature = str;
        this.id = id;
        this.betcoins = i;
        this.iconUrl = iconUrl;
        this.newStoreCode = newStoreCode;
        this.oldStoreCode = oldStoreCode;
        this.subtitle = subtitle;
        this.tickets = i2;
        this.title = title;
        this.expiresAt = expiresAt;
        this.elements = elements;
        this.offerType = offerType;
        this.htmlTemplateData = offerHtmlTemplateData;
    }

    public /* synthetic */ OfferModel(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, String str7, Date date, List list, OfferType offerType, OfferHtmlTemplateData offerHtmlTemplateData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, str2, i, (i3 & 8) != 0 ? "" : str3, str4, str5, (i3 & 64) != 0 ? "" : str6, i2, (i3 & 256) != 0 ? "" : str7, date, list, (i3 & 2048) != 0 ? OfferType.NONE : offerType, (i3 & 4096) != 0 ? null : offerHtmlTemplateData);
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getId() {
        return this.id;
    }

    public final int getBetcoins() {
        return this.betcoins;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getNewStoreCode() {
        return this.newStoreCode;
    }

    public final String getOldStoreCode() {
        return this.oldStoreCode;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int getTickets() {
        return this.tickets;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    public final List<OfferItemContent> getElements() {
        return this.elements;
    }

    public final OfferType getOfferType() {
        return this.offerType;
    }

    public final OfferHtmlTemplateData getHtmlTemplateData() {
        return this.htmlTemplateData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        final String str = "type";
        return new ArrayListSerializer(new SealedClassSerializer("org.betup.ui.dialogs.offer.OfferItemContent", Reflection.getOrCreateKotlinClass(OfferItemContent.class), new KClass[]{Reflection.getOrCreateKotlinClass(BetcoinContent.class), Reflection.getOrCreateKotlinClass(ButtonContent.class), Reflection.getOrCreateKotlinClass(PriceContent.class), Reflection.getOrCreateKotlinClass(TimerContent.class)}, new KSerializer[]{BetcoinContent$$serializer.INSTANCE, ButtonContent$$serializer.INSTANCE, PriceContent$$serializer.INSTANCE, TimerContent$$serializer.INSTANCE}, new Annotation[]{new JsonClassDiscriminator(str) { // from class: org.betup.model.remote.entity.analytics.OfferModel$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0
            private final /* synthetic */ String discriminator;

            {
                Intrinsics.checkNotNullParameter(str, "discriminator");
                this.discriminator = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonClassDiscriminator.class;
            }

            @Override // kotlinx.serialization.json.JsonClassDiscriminator
            public final /* synthetic */ String discriminator() {
                return this.discriminator;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof JsonClassDiscriminator) && Intrinsics.areEqual(discriminator(), ((JsonClassDiscriminator) obj).discriminator());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return ("discriminator".hashCode() * 127) ^ this.discriminator.hashCode();
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
            }
        }}));
    }
}
