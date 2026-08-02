package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserFavouritesModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/user/NewLeagueSimple;", "", "id", "", "photoUrl", "", "name", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getPhotoUrl", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewLeagueSimple {
    public static final int $stable = 0;

    @SerializedName("id")
    private final int id;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    public NewLeagueSimple() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ NewLeagueSimple copy$default(NewLeagueSimple newLeagueSimple, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newLeagueSimple.id;
        }
        if ((i2 & 2) != 0) {
            str = newLeagueSimple.photoUrl;
        }
        if ((i2 & 4) != 0) {
            str2 = newLeagueSimple.name;
        }
        return newLeagueSimple.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
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

    public final NewLeagueSimple copy(int id, String photoUrl, String name) {
        return new NewLeagueSimple(id, photoUrl, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewLeagueSimple)) {
            return false;
        }
        NewLeagueSimple newLeagueSimple = (NewLeagueSimple) other;
        return this.id == newLeagueSimple.id && Intrinsics.areEqual(this.photoUrl, newLeagueSimple.photoUrl) && Intrinsics.areEqual(this.name, newLeagueSimple.name);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NewLeagueSimple(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ")";
    }

    public NewLeagueSimple(int i, String str, String str2) {
        this.id = i;
        this.photoUrl = str;
        this.name = str2;
    }

    public /* synthetic */ NewLeagueSimple(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    public final int getId() {
        return this.id;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getName() {
        return this.name;
    }
}
