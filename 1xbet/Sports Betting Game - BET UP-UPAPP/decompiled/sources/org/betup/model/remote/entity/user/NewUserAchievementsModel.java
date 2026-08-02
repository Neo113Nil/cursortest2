package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserAchievementsModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserAchievementsModel;", "", "id", "", "photoUrl", "", "price", "name", "description", "isOpened", "", "progress", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZI)V", "getId", "()I", "getPhotoUrl", "()Ljava/lang/String;", "getPrice", "getName", "getDescription", "()Z", "getProgress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserAchievementsModel {
    public static final int $stable = 0;

    @SerializedName("descr")
    private final String description;

    @SerializedName("id")
    private final int id;

    @SerializedName("is_opened")
    private final boolean isOpened;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    @SerializedName("price")
    private final int price;

    @SerializedName("progress")
    private final int progress;

    public static /* synthetic */ NewUserAchievementsModel copy$default(NewUserAchievementsModel newUserAchievementsModel, int i, String str, int i2, String str2, String str3, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = newUserAchievementsModel.id;
        }
        if ((i4 & 2) != 0) {
            str = newUserAchievementsModel.photoUrl;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            i2 = newUserAchievementsModel.price;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            str2 = newUserAchievementsModel.name;
        }
        String str5 = str2;
        if ((i4 & 16) != 0) {
            str3 = newUserAchievementsModel.description;
        }
        String str6 = str3;
        if ((i4 & 32) != 0) {
            z = newUserAchievementsModel.isOpened;
        }
        boolean z2 = z;
        if ((i4 & 64) != 0) {
            i3 = newUserAchievementsModel.progress;
        }
        return newUserAchievementsModel.copy(i, str4, i5, str5, str6, z2, i3);
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
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsOpened() {
        return this.isOpened;
    }

    /* renamed from: component7, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public final NewUserAchievementsModel copy(int id, String photoUrl, int price, String name, String description, boolean isOpened, int progress) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        return new NewUserAchievementsModel(id, photoUrl, price, name, description, isOpened, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserAchievementsModel)) {
            return false;
        }
        NewUserAchievementsModel newUserAchievementsModel = (NewUserAchievementsModel) other;
        return this.id == newUserAchievementsModel.id && Intrinsics.areEqual(this.photoUrl, newUserAchievementsModel.photoUrl) && this.price == newUserAchievementsModel.price && Intrinsics.areEqual(this.name, newUserAchievementsModel.name) && Intrinsics.areEqual(this.description, newUserAchievementsModel.description) && this.isOpened == newUserAchievementsModel.isOpened && this.progress == newUserAchievementsModel.progress;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.isOpened)) * 31) + Integer.hashCode(this.progress);
    }

    public String toString() {
        return "NewUserAchievementsModel(id=" + this.id + ", photoUrl=" + this.photoUrl + ", price=" + this.price + ", name=" + this.name + ", description=" + this.description + ", isOpened=" + this.isOpened + ", progress=" + this.progress + ")";
    }

    public NewUserAchievementsModel(int i, String photoUrl, int i2, String name, String description, boolean z, int i3) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = i;
        this.photoUrl = photoUrl;
        this.price = i2;
        this.name = name;
        this.description = description;
        this.isOpened = z;
        this.progress = i3;
    }

    public final int getId() {
        return this.id;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isOpened() {
        return this.isOpened;
    }

    public final int getProgress() {
        return this.progress;
    }
}
