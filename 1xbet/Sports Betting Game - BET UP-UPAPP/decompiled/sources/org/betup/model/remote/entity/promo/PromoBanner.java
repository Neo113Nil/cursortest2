package org.betup.model.remote.entity.promo;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PromoBanner.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lorg/betup/model/remote/entity/promo/PromoBanner;", "", "matchId", "", "title", "", "description", "bannerUrl", "callToAction", UnifiedMediationParams.KEY_CLICK_URL, FirebaseAnalytics.Param.LOCATION, "Lorg/betup/model/remote/entity/promo/PromoLocation;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/betup/model/remote/entity/promo/PromoLocation;)V", "getMatchId", "()J", "getTitle", "()Ljava/lang/String;", "getDescription", "getBannerUrl", "getCallToAction", "getClickUrl", "getLocation", "()Lorg/betup/model/remote/entity/promo/PromoLocation;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoBanner {
    public static final int $stable = 0;
    private final String bannerUrl;
    private final String callToAction;
    private final String clickUrl;
    private final String description;
    private final PromoLocation location;
    private final long matchId;
    private final String title;

    /* renamed from: component1, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCallToAction() {
        return this.callToAction;
    }

    /* renamed from: component6, reason: from getter */
    public final String getClickUrl() {
        return this.clickUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final PromoLocation getLocation() {
        return this.location;
    }

    public final PromoBanner copy(long matchId, String title, String description, String bannerUrl, String callToAction, String clickUrl, PromoLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return new PromoBanner(matchId, title, description, bannerUrl, callToAction, clickUrl, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBanner)) {
            return false;
        }
        PromoBanner promoBanner = (PromoBanner) other;
        return this.matchId == promoBanner.matchId && Intrinsics.areEqual(this.title, promoBanner.title) && Intrinsics.areEqual(this.description, promoBanner.description) && Intrinsics.areEqual(this.bannerUrl, promoBanner.bannerUrl) && Intrinsics.areEqual(this.callToAction, promoBanner.callToAction) && Intrinsics.areEqual(this.clickUrl, promoBanner.clickUrl) && this.location == promoBanner.location;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.matchId) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bannerUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.callToAction;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.clickUrl;
        return ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.location.hashCode();
    }

    public String toString() {
        return "PromoBanner(matchId=" + this.matchId + ", title=" + this.title + ", description=" + this.description + ", bannerUrl=" + this.bannerUrl + ", callToAction=" + this.callToAction + ", clickUrl=" + this.clickUrl + ", location=" + this.location + ")";
    }

    public PromoBanner(long j, String str, String str2, String str3, String str4, String str5, PromoLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.matchId = j;
        this.title = str;
        this.description = str2;
        this.bannerUrl = str3;
        this.callToAction = str4;
        this.clickUrl = str5;
        this.location = location;
    }

    public final long getMatchId() {
        return this.matchId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final PromoLocation getLocation() {
        return this.location;
    }
}
