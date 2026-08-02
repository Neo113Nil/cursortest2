package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TierModelShort.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/TierModelShort;", "", "id", "", "oddsBoost", "", "fee", "name", "", "imgUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IDDLjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getOddsBoost", "()D", "getFee", "getName", "()Ljava/lang/String;", "getImgUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TierModelShort {
    public static final int $stable = 0;

    @SerializedName("fee")
    private final double fee;

    @SerializedName("id")
    private final int id;

    @SerializedName("imgUrl")
    private final String imgUrl;

    @SerializedName("name")
    private final String name;

    @SerializedName("oddsBoost")
    private final double oddsBoost;

    public TierModelShort() {
        this(0, 0.0d, 0.0d, null, null, 31, null);
    }

    public static /* synthetic */ TierModelShort copy$default(TierModelShort tierModelShort, int i, double d, double d2, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tierModelShort.id;
        }
        if ((i2 & 2) != 0) {
            d = tierModelShort.oddsBoost;
        }
        double d3 = d;
        if ((i2 & 4) != 0) {
            d2 = tierModelShort.fee;
        }
        double d4 = d2;
        if ((i2 & 8) != 0) {
            str = tierModelShort.name;
        }
        String str3 = str;
        if ((i2 & 16) != 0) {
            str2 = tierModelShort.imgUrl;
        }
        return tierModelShort.copy(i, d3, d4, str3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getOddsBoost() {
        return this.oddsBoost;
    }

    /* renamed from: component3, reason: from getter */
    public final double getFee() {
        return this.fee;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final TierModelShort copy(int id, double oddsBoost, double fee, String name, String imgUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        return new TierModelShort(id, oddsBoost, fee, name, imgUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TierModelShort)) {
            return false;
        }
        TierModelShort tierModelShort = (TierModelShort) other;
        return this.id == tierModelShort.id && Double.compare(this.oddsBoost, tierModelShort.oddsBoost) == 0 && Double.compare(this.fee, tierModelShort.fee) == 0 && Intrinsics.areEqual(this.name, tierModelShort.name) && Intrinsics.areEqual(this.imgUrl, tierModelShort.imgUrl);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + Double.hashCode(this.oddsBoost)) * 31) + Double.hashCode(this.fee)) * 31) + this.name.hashCode()) * 31) + this.imgUrl.hashCode();
    }

    public String toString() {
        return "TierModelShort(id=" + this.id + ", oddsBoost=" + this.oddsBoost + ", fee=" + this.fee + ", name=" + this.name + ", imgUrl=" + this.imgUrl + ")";
    }

    public TierModelShort(int i, double d, double d2, String name, String imgUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        this.id = i;
        this.oddsBoost = d;
        this.fee = d2;
        this.name = name;
        this.imgUrl = imgUrl;
    }

    public /* synthetic */ TierModelShort(int i, double d, double d2, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) == 0 ? d2 : 0.0d, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2);
    }

    public final int getId() {
        return this.id;
    }

    public final double getOddsBoost() {
        return this.oddsBoost;
    }

    public final double getFee() {
        return this.fee;
    }

    public final String getName() {
        return this.name;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }
}
