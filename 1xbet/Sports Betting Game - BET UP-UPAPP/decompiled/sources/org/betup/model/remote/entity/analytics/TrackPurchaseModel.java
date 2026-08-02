package org.betup.model.remote.entity.analytics;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.Language;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TrackPurchaseModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\fHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006,"}, d2 = {"Lorg/betup/model/remote/entity/analytics/TrackPurchaseModel;", "Ljava/io/Serializable;", "productId", "", "placement", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "purchaseType", "Lorg/betup/model/remote/entity/analytics/PurchaseType;", "lang", "osType", "Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;", "buildNumber", "", "buildVersion", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/model/remote/entity/analytics/PurchasePlacement;Lorg/betup/model/remote/entity/analytics/PurchaseType;Ljava/lang/String;Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;Ljava/lang/Integer;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getPlacement", "()Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "getPurchaseType", "()Lorg/betup/model/remote/entity/analytics/PurchaseType;", "getLang", "getOsType", "()Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;", "getBuildNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBuildVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lorg/betup/model/remote/entity/analytics/PurchasePlacement;Lorg/betup/model/remote/entity/analytics/PurchaseType;Ljava/lang/String;Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;Ljava/lang/Integer;Ljava/lang/String;)Lorg/betup/model/remote/entity/analytics/TrackPurchaseModel;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TrackPurchaseModel implements Serializable {
    public static final int $stable = 0;
    private final Integer buildNumber;
    private final String buildVersion;
    private final String lang;
    private final TrackRequestOsType osType;
    private final PurchasePlacement placement;
    private final String productId;
    private final PurchaseType purchaseType;

    public static /* synthetic */ TrackPurchaseModel copy$default(TrackPurchaseModel trackPurchaseModel, String str, PurchasePlacement purchasePlacement, PurchaseType purchaseType, String str2, TrackRequestOsType trackRequestOsType, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackPurchaseModel.productId;
        }
        if ((i & 2) != 0) {
            purchasePlacement = trackPurchaseModel.placement;
        }
        PurchasePlacement purchasePlacement2 = purchasePlacement;
        if ((i & 4) != 0) {
            purchaseType = trackPurchaseModel.purchaseType;
        }
        PurchaseType purchaseType2 = purchaseType;
        if ((i & 8) != 0) {
            str2 = trackPurchaseModel.lang;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            trackRequestOsType = trackPurchaseModel.osType;
        }
        TrackRequestOsType trackRequestOsType2 = trackRequestOsType;
        if ((i & 32) != 0) {
            num = trackPurchaseModel.buildNumber;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            str3 = trackPurchaseModel.buildVersion;
        }
        return trackPurchaseModel.copy(str, purchasePlacement2, purchaseType2, str4, trackRequestOsType2, num2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final PurchasePlacement getPlacement() {
        return this.placement;
    }

    /* renamed from: component3, reason: from getter */
    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    /* renamed from: component5, reason: from getter */
    public final TrackRequestOsType getOsType() {
        return this.osType;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getBuildNumber() {
        return this.buildNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBuildVersion() {
        return this.buildVersion;
    }

    public final TrackPurchaseModel copy(String productId, PurchasePlacement placement, PurchaseType purchaseType, String lang, TrackRequestOsType osType, Integer buildNumber, String buildVersion) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(osType, "osType");
        return new TrackPurchaseModel(productId, placement, purchaseType, lang, osType, buildNumber, buildVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackPurchaseModel)) {
            return false;
        }
        TrackPurchaseModel trackPurchaseModel = (TrackPurchaseModel) other;
        return Intrinsics.areEqual(this.productId, trackPurchaseModel.productId) && this.placement == trackPurchaseModel.placement && this.purchaseType == trackPurchaseModel.purchaseType && Intrinsics.areEqual(this.lang, trackPurchaseModel.lang) && this.osType == trackPurchaseModel.osType && Intrinsics.areEqual(this.buildNumber, trackPurchaseModel.buildNumber) && Intrinsics.areEqual(this.buildVersion, trackPurchaseModel.buildVersion);
    }

    public int hashCode() {
        int hashCode = ((((((((this.productId.hashCode() * 31) + this.placement.hashCode()) * 31) + this.purchaseType.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.osType.hashCode()) * 31;
        Integer num = this.buildNumber;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.buildVersion;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TrackPurchaseModel(productId=" + this.productId + ", placement=" + this.placement + ", purchaseType=" + this.purchaseType + ", lang=" + this.lang + ", osType=" + this.osType + ", buildNumber=" + this.buildNumber + ", buildVersion=" + this.buildVersion + ")";
    }

    public TrackPurchaseModel(String productId, PurchasePlacement placement, PurchaseType purchaseType, String lang, TrackRequestOsType osType, Integer num, String str) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(osType, "osType");
        this.productId = productId;
        this.placement = placement;
        this.purchaseType = purchaseType;
        this.lang = lang;
        this.osType = osType;
        this.buildNumber = num;
        this.buildVersion = str;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final PurchasePlacement getPlacement() {
        return this.placement;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public /* synthetic */ TrackPurchaseModel(String str, PurchasePlacement purchasePlacement, PurchaseType purchaseType, String str2, TrackRequestOsType trackRequestOsType, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, purchasePlacement, purchaseType, (i & 8) != 0 ? Language.getCurrent().getCode() : str2, (i & 16) != 0 ? TrackRequestOsType.ANDROID : trackRequestOsType, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str3);
    }

    public final String getLang() {
        return this.lang;
    }

    public final TrackRequestOsType getOsType() {
        return this.osType;
    }

    public final Integer getBuildNumber() {
        return this.buildNumber;
    }

    public final String getBuildVersion() {
        return this.buildVersion;
    }
}
