package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserFollowersModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006#"}, d2 = {"Lorg/betup/model/remote/entity/user/FollowerModel;", "", "id", "", "name", "", "photoUrl", "rank", "level", "isFollowing", "", "followedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPhotoUrl", "getRank", "getLevel", "()Z", "getFollowedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FollowerModel {
    public static final int $stable = 0;

    @SerializedName("followed_at")
    private final String followedAt;

    @SerializedName("id")
    private final int id;

    @SerializedName("is_following")
    private final boolean isFollowing;

    @SerializedName("level")
    private final int level;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    @SerializedName("rank")
    private final int rank;

    public static /* synthetic */ FollowerModel copy$default(FollowerModel followerModel, int i, String str, String str2, int i2, int i3, boolean z, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = followerModel.id;
        }
        if ((i4 & 2) != 0) {
            str = followerModel.name;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = followerModel.photoUrl;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            i2 = followerModel.rank;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = followerModel.level;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            z = followerModel.isFollowing;
        }
        boolean z2 = z;
        if ((i4 & 64) != 0) {
            str3 = followerModel.followedAt;
        }
        return followerModel.copy(i, str4, str5, i5, i6, z2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
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
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFollowedAt() {
        return this.followedAt;
    }

    public final FollowerModel copy(int id, String name, String photoUrl, int rank, int level, boolean isFollowing, String followedAt) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        return new FollowerModel(id, name, photoUrl, rank, level, isFollowing, followedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowerModel)) {
            return false;
        }
        FollowerModel followerModel = (FollowerModel) other;
        return this.id == followerModel.id && Intrinsics.areEqual(this.name, followerModel.name) && Intrinsics.areEqual(this.photoUrl, followerModel.photoUrl) && this.rank == followerModel.rank && this.level == followerModel.level && this.isFollowing == followerModel.isFollowing && Intrinsics.areEqual(this.followedAt, followerModel.followedAt);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.level)) * 31) + Boolean.hashCode(this.isFollowing)) * 31;
        String str = this.followedAt;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FollowerModel(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", rank=" + this.rank + ", level=" + this.level + ", isFollowing=" + this.isFollowing + ", followedAt=" + this.followedAt + ")";
    }

    public FollowerModel(int i, String name, String photoUrl, int i2, int i3, boolean z, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        this.id = i;
        this.name = name;
        this.photoUrl = photoUrl;
        this.rank = i2;
        this.level = i3;
        this.isFollowing = z;
        this.followedAt = str;
    }

    public final int getId() {
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

    public final int getLevel() {
        return this.level;
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public final String getFollowedAt() {
        return this.followedAt;
    }
}
