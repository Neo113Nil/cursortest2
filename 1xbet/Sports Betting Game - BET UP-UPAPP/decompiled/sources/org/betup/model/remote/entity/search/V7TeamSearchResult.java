package org.betup.model.remote.entity.search;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7SearchResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lorg/betup/model/remote/entity/search/V7TeamSearchResult;", "", "id", "", "photoUrl", "", "name", "sport", "Lorg/betup/model/remote/entity/search/V7SearchSportData;", "interestFactor", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Lorg/betup/model/remote/entity/search/V7SearchSportData;I)V", "getId", "()J", "getPhotoUrl", "()Ljava/lang/String;", "getName", "getSport", "()Lorg/betup/model/remote/entity/search/V7SearchSportData;", "getInterestFactor", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7TeamSearchResult {
    public static final int $stable = 0;

    @SerializedName("id")
    private final long id;

    @SerializedName("interest_factor")
    private final int interestFactor;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    @SerializedName("sport")
    private final V7SearchSportData sport;

    public V7TeamSearchResult() {
        this(0L, null, null, null, 0, 31, null);
    }

    public static /* synthetic */ V7TeamSearchResult copy$default(V7TeamSearchResult v7TeamSearchResult, long j, String str, String str2, V7SearchSportData v7SearchSportData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = v7TeamSearchResult.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = v7TeamSearchResult.photoUrl;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = v7TeamSearchResult.name;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            v7SearchSportData = v7TeamSearchResult.sport;
        }
        V7SearchSportData v7SearchSportData2 = v7SearchSportData;
        if ((i2 & 16) != 0) {
            i = v7TeamSearchResult.interestFactor;
        }
        return v7TeamSearchResult.copy(j2, str3, str4, v7SearchSportData2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final V7SearchSportData getSport() {
        return this.sport;
    }

    /* renamed from: component5, reason: from getter */
    public final int getInterestFactor() {
        return this.interestFactor;
    }

    public final V7TeamSearchResult copy(long id, String photoUrl, String name, V7SearchSportData sport, int interestFactor) {
        return new V7TeamSearchResult(id, photoUrl, name, sport, interestFactor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7TeamSearchResult)) {
            return false;
        }
        V7TeamSearchResult v7TeamSearchResult = (V7TeamSearchResult) other;
        return this.id == v7TeamSearchResult.id && Intrinsics.areEqual(this.photoUrl, v7TeamSearchResult.photoUrl) && Intrinsics.areEqual(this.name, v7TeamSearchResult.name) && Intrinsics.areEqual(this.sport, v7TeamSearchResult.sport) && this.interestFactor == v7TeamSearchResult.interestFactor;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        V7SearchSportData v7SearchSportData = this.sport;
        return ((hashCode3 + (v7SearchSportData != null ? v7SearchSportData.hashCode() : 0)) * 31) + Integer.hashCode(this.interestFactor);
    }

    public String toString() {
        return "V7TeamSearchResult(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ", sport=" + this.sport + ", interestFactor=" + this.interestFactor + ")";
    }

    public V7TeamSearchResult(long j, String str, String str2, V7SearchSportData v7SearchSportData, int i) {
        this.id = j;
        this.photoUrl = str;
        this.name = str2;
        this.sport = v7SearchSportData;
        this.interestFactor = i;
    }

    public /* synthetic */ V7TeamSearchResult(long j, String str, String str2, V7SearchSportData v7SearchSportData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : v7SearchSportData, (i2 & 16) != 0 ? 0 : i);
    }

    public final long getId() {
        return this.id;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final V7SearchSportData getSport() {
        return this.sport;
    }

    public final int getInterestFactor() {
        return this.interestFactor;
    }
}
