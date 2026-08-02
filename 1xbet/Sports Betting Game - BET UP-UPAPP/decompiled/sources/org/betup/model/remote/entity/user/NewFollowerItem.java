package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserFollowersModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/user/NewFollowerItem;", "", "userId", "", "photoUrl", "", "username", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;)V", "getUserId", "()I", "getPhotoUrl", "()Ljava/lang/String;", "getUsername", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewFollowerItem {
    public static final int $stable = 0;

    @SerializedName("photoUrl")
    private final String photoUrl;

    @SerializedName("userId")
    private final int userId;

    @SerializedName("username")
    private final String username;

    public static /* synthetic */ NewFollowerItem copy$default(NewFollowerItem newFollowerItem, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newFollowerItem.userId;
        }
        if ((i2 & 2) != 0) {
            str = newFollowerItem.photoUrl;
        }
        if ((i2 & 4) != 0) {
            str2 = newFollowerItem.username;
        }
        return newFollowerItem.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final NewFollowerItem copy(int userId, String photoUrl, String username) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(username, "username");
        return new NewFollowerItem(userId, photoUrl, username);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewFollowerItem)) {
            return false;
        }
        NewFollowerItem newFollowerItem = (NewFollowerItem) other;
        return this.userId == newFollowerItem.userId && Intrinsics.areEqual(this.photoUrl, newFollowerItem.photoUrl) && Intrinsics.areEqual(this.username, newFollowerItem.username);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.userId) * 31) + this.photoUrl.hashCode()) * 31) + this.username.hashCode();
    }

    public String toString() {
        return "NewFollowerItem(userId=" + this.userId + ", photoUrl=" + this.photoUrl + ", username=" + this.username + ")";
    }

    public NewFollowerItem(int i, String photoUrl, String username) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(username, "username");
        this.userId = i;
        this.photoUrl = photoUrl;
        this.username = username;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getUsername() {
        return this.username;
    }
}
