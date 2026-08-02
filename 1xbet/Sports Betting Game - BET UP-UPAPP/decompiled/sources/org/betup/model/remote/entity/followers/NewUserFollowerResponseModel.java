package org.betup.model.remote.entity.followers;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserFollowerResponseModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lorg/betup/model/remote/entity/followers/NewUserFollowerResponseModel;", "", "userId", "", "photoUrl", "", "username", "following", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getUserId", "()J", "getPhotoUrl", "()Ljava/lang/String;", "getUsername", "getFollowing", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/betup/model/remote/entity/followers/NewUserFollowerResponseModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserFollowerResponseModel {
    public static final int $stable = 0;

    @SerializedName("following")
    private final Integer following;

    @SerializedName("photoUrl")
    private final String photoUrl;

    @SerializedName("userId")
    private final long userId;

    @SerializedName("username")
    private final String username;

    public static /* synthetic */ NewUserFollowerResponseModel copy$default(NewUserFollowerResponseModel newUserFollowerResponseModel, long j, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = newUserFollowerResponseModel.userId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = newUserFollowerResponseModel.photoUrl;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = newUserFollowerResponseModel.username;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num = newUserFollowerResponseModel.following;
        }
        return newUserFollowerResponseModel.copy(j2, str3, str4, num);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUserId() {
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

    /* renamed from: component4, reason: from getter */
    public final Integer getFollowing() {
        return this.following;
    }

    public final NewUserFollowerResponseModel copy(long userId, String photoUrl, String username, Integer following) {
        Intrinsics.checkNotNullParameter(username, "username");
        return new NewUserFollowerResponseModel(userId, photoUrl, username, following);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserFollowerResponseModel)) {
            return false;
        }
        NewUserFollowerResponseModel newUserFollowerResponseModel = (NewUserFollowerResponseModel) other;
        return this.userId == newUserFollowerResponseModel.userId && Intrinsics.areEqual(this.photoUrl, newUserFollowerResponseModel.photoUrl) && Intrinsics.areEqual(this.username, newUserFollowerResponseModel.username) && Intrinsics.areEqual(this.following, newUserFollowerResponseModel.following);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.userId) * 31;
        String str = this.photoUrl;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.username.hashCode()) * 31;
        Integer num = this.following;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "NewUserFollowerResponseModel(userId=" + this.userId + ", photoUrl=" + this.photoUrl + ", username=" + this.username + ", following=" + this.following + ")";
    }

    public NewUserFollowerResponseModel(long j, String str, String username, Integer num) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.userId = j;
        this.photoUrl = str;
        this.username = username;
        this.following = num;
    }

    public /* synthetic */ NewUserFollowerResponseModel(long j, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? null : num);
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getUsername() {
        return this.username;
    }

    public final Integer getFollowing() {
        return this.following;
    }
}
