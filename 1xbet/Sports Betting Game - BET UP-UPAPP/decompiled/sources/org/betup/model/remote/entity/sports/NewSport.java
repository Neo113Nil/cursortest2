package org.betup.model.remote.entity.sports;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewSport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006 "}, d2 = {"Lorg/betup/model/remote/entity/sports/NewSport;", "", "id", "", "photoUrl", "", "name", TypedValues.CycleType.S_WAVE_PERIOD, "photoBackground", "isFavorite", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "getPhotoUrl", "()Ljava/lang/String;", "getName", "getPeriod", "getPhotoBackground", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewSport {
    public static final int $stable = 0;

    @SerializedName("id")
    private final int id;

    @SerializedName("is_favorite")
    private final boolean isFavorite;

    @SerializedName("name")
    private final String name;

    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private final String period;

    @SerializedName("photo_background")
    private final String photoBackground;

    @SerializedName("photo_url")
    private final String photoUrl;

    public NewSport() {
        this(0, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ NewSport copy$default(NewSport newSport, int i, String str, String str2, String str3, String str4, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newSport.id;
        }
        if ((i2 & 2) != 0) {
            str = newSport.photoUrl;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = newSport.name;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = newSport.period;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = newSport.photoBackground;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            z = newSport.isFavorite;
        }
        return newSport.copy(i, str5, str6, str7, str8, z);
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

    /* renamed from: component4, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPhotoBackground() {
        return this.photoBackground;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final NewSport copy(int id, String photoUrl, String name, String period, String photoBackground, boolean isFavorite) {
        return new NewSport(id, photoUrl, name, period, photoBackground, isFavorite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewSport)) {
            return false;
        }
        NewSport newSport = (NewSport) other;
        return this.id == newSport.id && Intrinsics.areEqual(this.photoUrl, newSport.photoUrl) && Intrinsics.areEqual(this.name, newSport.name) && Intrinsics.areEqual(this.period, newSport.period) && Intrinsics.areEqual(this.photoBackground, newSport.photoBackground) && this.isFavorite == newSport.isFavorite;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBackground;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFavorite);
    }

    public String toString() {
        return "NewSport(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ", period=" + this.period + ", photoBackground=" + this.photoBackground + ", isFavorite=" + this.isFavorite + ")";
    }

    public NewSport(int i, String str, String str2, String str3, String str4, boolean z) {
        this.id = i;
        this.photoUrl = str;
        this.name = str2;
        this.period = str3;
        this.photoBackground = str4;
        this.isFavorite = z;
    }

    public /* synthetic */ NewSport(int i, String str, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) == 0 ? str4 : null, (i2 & 32) != 0 ? false : z);
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

    public final String getPeriod() {
        return this.period;
    }

    public final String getPhotoBackground() {
        return this.photoBackground;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }
}
