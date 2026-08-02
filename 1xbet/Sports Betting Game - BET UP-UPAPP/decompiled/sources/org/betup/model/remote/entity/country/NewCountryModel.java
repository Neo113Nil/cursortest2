package org.betup.model.remote.entity.country;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewCountryModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/entity/country/NewCountryModel;", "", "id", "", "iso", "", "niceName", "photoUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getIso", "()Ljava/lang/String;", "getNiceName", "getPhotoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewCountryModel {
    public static final int $stable = 0;

    @SerializedName("id")
    private final int id;

    @SerializedName("iso")
    private final String iso;

    @SerializedName("nice_name")
    private final String niceName;

    @SerializedName("photo")
    private final String photoUrl;

    public static /* synthetic */ NewCountryModel copy$default(NewCountryModel newCountryModel, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newCountryModel.id;
        }
        if ((i2 & 2) != 0) {
            str = newCountryModel.iso;
        }
        if ((i2 & 4) != 0) {
            str2 = newCountryModel.niceName;
        }
        if ((i2 & 8) != 0) {
            str3 = newCountryModel.photoUrl;
        }
        return newCountryModel.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
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
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final NewCountryModel copy(int id, String iso, String niceName, String photoUrl) {
        Intrinsics.checkNotNullParameter(iso, "iso");
        Intrinsics.checkNotNullParameter(niceName, "niceName");
        return new NewCountryModel(id, iso, niceName, photoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCountryModel)) {
            return false;
        }
        NewCountryModel newCountryModel = (NewCountryModel) other;
        return this.id == newCountryModel.id && Intrinsics.areEqual(this.iso, newCountryModel.iso) && Intrinsics.areEqual(this.niceName, newCountryModel.niceName) && Intrinsics.areEqual(this.photoUrl, newCountryModel.photoUrl);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.id) * 31) + this.iso.hashCode()) * 31) + this.niceName.hashCode()) * 31;
        String str = this.photoUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NewCountryModel(id=" + this.id + ", iso=" + this.iso + ", niceName=" + this.niceName + ", photoUrl=" + this.photoUrl + ")";
    }

    public NewCountryModel(int i, String iso, String niceName, String str) {
        Intrinsics.checkNotNullParameter(iso, "iso");
        Intrinsics.checkNotNullParameter(niceName, "niceName");
        this.id = i;
        this.iso = iso;
        this.niceName = niceName;
        this.photoUrl = str;
    }

    public final int getId() {
        return this.id;
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getNiceName() {
        return this.niceName;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }
}
