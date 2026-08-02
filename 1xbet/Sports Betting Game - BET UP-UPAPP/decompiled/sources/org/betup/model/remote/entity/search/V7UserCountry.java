package org.betup.model.remote.entity.search;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7SearchResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/entity/search/V7UserCountry;", "", "id", "", "iso", "", "niceName", "photo", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getIso", "()Ljava/lang/String;", "getNiceName", "getPhoto", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7UserCountry {
    public static final int $stable = 0;

    @SerializedName("id")
    private final long id;

    @SerializedName("iso")
    private final String iso;

    @SerializedName("nice_name")
    private final String niceName;

    @SerializedName("photo")
    private final String photo;

    public V7UserCountry() {
        this(0L, null, null, null, 15, null);
    }

    public static /* synthetic */ V7UserCountry copy$default(V7UserCountry v7UserCountry, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = v7UserCountry.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = v7UserCountry.iso;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = v7UserCountry.niceName;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = v7UserCountry.photo;
        }
        return v7UserCountry.copy(j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIso() {
        return this.iso;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNiceName() {
        return this.niceName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    public final V7UserCountry copy(long id, String iso, String niceName, String photo) {
        Intrinsics.checkNotNullParameter(iso, "iso");
        Intrinsics.checkNotNullParameter(niceName, "niceName");
        return new V7UserCountry(id, iso, niceName, photo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7UserCountry)) {
            return false;
        }
        V7UserCountry v7UserCountry = (V7UserCountry) other;
        return this.id == v7UserCountry.id && Intrinsics.areEqual(this.iso, v7UserCountry.iso) && Intrinsics.areEqual(this.niceName, v7UserCountry.niceName) && Intrinsics.areEqual(this.photo, v7UserCountry.photo);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.id) * 31) + this.iso.hashCode()) * 31) + this.niceName.hashCode()) * 31;
        String str = this.photo;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "V7UserCountry(id=" + this.id + ", iso=" + this.iso + ", niceName=" + this.niceName + ", photo=" + this.photo + ")";
    }

    public V7UserCountry(long j, String iso, String niceName, String str) {
        Intrinsics.checkNotNullParameter(iso, "iso");
        Intrinsics.checkNotNullParameter(niceName, "niceName");
        this.id = j;
        this.iso = iso;
        this.niceName = niceName;
        this.photo = str;
    }

    public /* synthetic */ V7UserCountry(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3);
    }

    public final long getId() {
        return this.id;
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getNiceName() {
        return this.niceName;
    }

    public final String getPhoto() {
        return this.photo;
    }
}
