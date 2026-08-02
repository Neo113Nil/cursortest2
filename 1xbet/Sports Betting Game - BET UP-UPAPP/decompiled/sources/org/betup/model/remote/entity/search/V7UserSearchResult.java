package org.betup.model.remote.entity.search;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7SearchResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001eJb\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lorg/betup/model/remote/entity/search/V7UserSearchResult;", "", "id", "", "name", "", "photoUrl", "rank", "", "country", "Lorg/betup/model/remote/entity/search/V7UserCountry;", "level", "vip", "", "following", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;ILorg/betup/model/remote/entity/search/V7UserCountry;JZLjava/lang/Integer;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getPhotoUrl", "getRank", "()I", "getCountry", "()Lorg/betup/model/remote/entity/search/V7UserCountry;", "getLevel", "getVip", "()Z", "getFollowing", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/String;Ljava/lang/String;ILorg/betup/model/remote/entity/search/V7UserCountry;JZLjava/lang/Integer;)Lorg/betup/model/remote/entity/search/V7UserSearchResult;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7UserSearchResult {
    public static final int $stable = 0;

    @SerializedName("country")
    private final V7UserCountry country;

    @SerializedName("following")
    private final Integer following;

    @SerializedName("id")
    private final long id;

    @SerializedName("level")
    private final long level;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    @SerializedName("rank")
    private final int rank;

    @SerializedName("vip")
    private final boolean vip;

    public V7UserSearchResult() {
        this(0L, null, null, 0, null, 0L, false, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component5, reason: from getter */
    public final V7UserCountry getCountry() {
        return this.country;
    }

    /* renamed from: component6, reason: from getter */
    public final long getLevel() {
        return this.level;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getVip() {
        return this.vip;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getFollowing() {
        return this.following;
    }

    public final V7UserSearchResult copy(long id, String name, String photoUrl, int rank, V7UserCountry country, long level, boolean vip, Integer following) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        return new V7UserSearchResult(id, name, photoUrl, rank, country, level, vip, following);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7UserSearchResult)) {
            return false;
        }
        V7UserSearchResult v7UserSearchResult = (V7UserSearchResult) other;
        return this.id == v7UserSearchResult.id && Intrinsics.areEqual(this.name, v7UserSearchResult.name) && Intrinsics.areEqual(this.photoUrl, v7UserSearchResult.photoUrl) && this.rank == v7UserSearchResult.rank && Intrinsics.areEqual(this.country, v7UserSearchResult.country) && this.level == v7UserSearchResult.level && this.vip == v7UserSearchResult.vip && Intrinsics.areEqual(this.following, v7UserSearchResult.following);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31;
        V7UserCountry v7UserCountry = this.country;
        int hashCode2 = (((((hashCode + (v7UserCountry == null ? 0 : v7UserCountry.hashCode())) * 31) + Long.hashCode(this.level)) * 31) + Boolean.hashCode(this.vip)) * 31;
        Integer num = this.following;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "V7UserSearchResult(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", rank=" + this.rank + ", country=" + this.country + ", level=" + this.level + ", vip=" + this.vip + ", following=" + this.following + ")";
    }

    public V7UserSearchResult(long j, String name, String photoUrl, int i, V7UserCountry v7UserCountry, long j2, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        this.id = j;
        this.name = name;
        this.photoUrl = photoUrl;
        this.rank = i;
        this.country = v7UserCountry;
        this.level = j2;
        this.vip = z;
        this.following = num;
    }

    public /* synthetic */ V7UserSearchResult(long j, String str, String str2, int i, V7UserCountry v7UserCountry, long j2, boolean z, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : v7UserCountry, (i2 & 32) == 0 ? j2 : 0L, (i2 & 64) == 0 ? z : false, (i2 & 128) == 0 ? num : null);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getRank() {
        return this.rank;
    }

    public final V7UserCountry getCountry() {
        return this.country;
    }

    public final long getLevel() {
        return this.level;
    }

    public final boolean getVip() {
        return this.vip;
    }

    public final Integer getFollowing() {
        return this.following;
    }
}
