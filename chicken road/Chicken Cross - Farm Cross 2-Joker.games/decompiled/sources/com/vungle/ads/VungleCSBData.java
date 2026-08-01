package com.vungle.ads;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001)J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/vungle/ads/VungleCSBData;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "a", "D", "getBidFloor", "()D", "bidFloor", "", "b", "Ljava/lang/String;", "getAuctionId", "()Ljava/lang/String;", "auctionId", "c", "getCreativeId", "creativeId", "d", "getAdUnitId", "adUnitId", "e", "I", "getPhase", "()I", "phase", "f", "Z", "isVXWinner", "()Z", "", "g", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "extras", "Builder", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class VungleCSBData implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double bidFloor;

    /* renamed from: b, reason: from kotlin metadata */
    public final String auctionId;

    /* renamed from: c, reason: from kotlin metadata */
    public final String creativeId;

    /* renamed from: d, reason: from kotlin metadata */
    public final String adUnitId;

    /* renamed from: e, reason: from kotlin metadata */
    public final int phase;

    /* renamed from: f, reason: from kotlin metadata */
    public final boolean isVXWinner;

    /* renamed from: g, reason: from kotlin metadata */
    public final Map extras;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\u001c\u0010\u000b\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/VungleCSBData$Builder;", "", "", "auctionId", "creativeId", "adUnitId", "", "isPriorityAccess", "isVXWinner", "", "extras", "putExtras", "Lcom/vungle/ads/VungleCSBData;", InAppPurchaseConstants.METHOD_BUILD, "", "bidFloor", "<init>", "(D)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final double f11873a;
        public String b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
        public Map g;

        public Builder(double d) {
            this.f11873a = d;
        }

        public final Builder adUnitId(String adUnitId) {
            this.d = adUnitId;
            return this;
        }

        public final Builder auctionId(String auctionId) {
            this.b = auctionId;
            return this;
        }

        public final VungleCSBData build() {
            double d = this.f11873a;
            String str = this.b;
            String str2 = str == null ? "" : str;
            String str3 = this.c;
            String str4 = str3 == null ? "" : str3;
            String str5 = this.d;
            return new VungleCSBData(d, str2, str4, str5 == null ? "" : str5, this.f ? 2 : 1, this.e, this.g, null);
        }

        public final Builder creativeId(String creativeId) {
            this.c = creativeId;
            return this;
        }

        public final Builder isPriorityAccess(boolean isPriorityAccess) {
            this.f = isPriorityAccess;
            return this;
        }

        public final Builder isVXWinner(boolean isVXWinner) {
            this.e = isVXWinner;
            return this;
        }

        public final Builder putExtras(Map<String, String> extras) {
            this.g = extras;
            return this;
        }
    }

    public VungleCSBData(double d, String str, String str2, String str3, int i, boolean z, Map map) {
        this.bidFloor = d;
        this.auctionId = str;
        this.creativeId = str2;
        this.adUnitId = str3;
        this.phase = i;
        this.isVXWinner = z;
        this.extras = map;
    }

    public /* synthetic */ VungleCSBData(double d, String str, String str2, String str3, int i, boolean z, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, i, z, map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VungleCSBData)) {
            return false;
        }
        VungleCSBData vungleCSBData = (VungleCSBData) other;
        return Double.compare(this.bidFloor, vungleCSBData.bidFloor) == 0 && Intrinsics.areEqual(this.auctionId, vungleCSBData.auctionId) && Intrinsics.areEqual(this.creativeId, vungleCSBData.creativeId) && Intrinsics.areEqual(this.adUnitId, vungleCSBData.adUnitId) && this.phase == vungleCSBData.phase && this.isVXWinner == vungleCSBData.isVXWinner && Intrinsics.areEqual(this.extras, vungleCSBData.extras);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final double getBidFloor() {
        return this.bidFloor;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final int getPhase() {
        return this.phase;
    }

    public int hashCode() {
        int hashCode = (Boolean.hashCode(this.isVXWinner) + ((((this.adUnitId.hashCode() + ((this.creativeId.hashCode() + ((this.auctionId.hashCode() + (Double.hashCode(this.bidFloor) * 31)) * 31)) * 31)) * 31) + this.phase) * 31)) * 31;
        Map map = this.extras;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isVXWinner, reason: from getter */
    public final boolean getIsVXWinner() {
        return this.isVXWinner;
    }
}
