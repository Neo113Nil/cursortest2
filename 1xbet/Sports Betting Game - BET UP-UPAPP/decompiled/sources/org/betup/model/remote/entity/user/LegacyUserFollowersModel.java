package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserFollowersModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/entity/user/LegacyUserFollowersModel;", "", "followers", "", "Lorg/betup/model/remote/entity/user/FollowerModel;", "totalCount", "", "hasMore", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;IZ)V", "getFollowers", "()Ljava/util/List;", "getTotalCount", "()I", "getHasMore", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LegacyUserFollowersModel {
    public static final int $stable = 8;

    @SerializedName("followers")
    private final List<FollowerModel> followers;

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName("total_count")
    private final int totalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegacyUserFollowersModel copy$default(LegacyUserFollowersModel legacyUserFollowersModel, List list, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = legacyUserFollowersModel.followers;
        }
        if ((i2 & 2) != 0) {
            i = legacyUserFollowersModel.totalCount;
        }
        if ((i2 & 4) != 0) {
            z = legacyUserFollowersModel.hasMore;
        }
        return legacyUserFollowersModel.copy(list, i, z);
    }

    public final List<FollowerModel> component1() {
        return this.followers;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LegacyUserFollowersModel copy(List<FollowerModel> followers, int totalCount, boolean hasMore) {
        Intrinsics.checkNotNullParameter(followers, "followers");
        return new LegacyUserFollowersModel(followers, totalCount, hasMore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyUserFollowersModel)) {
            return false;
        }
        LegacyUserFollowersModel legacyUserFollowersModel = (LegacyUserFollowersModel) other;
        return Intrinsics.areEqual(this.followers, legacyUserFollowersModel.followers) && this.totalCount == legacyUserFollowersModel.totalCount && this.hasMore == legacyUserFollowersModel.hasMore;
    }

    public int hashCode() {
        return (((this.followers.hashCode() * 31) + Integer.hashCode(this.totalCount)) * 31) + Boolean.hashCode(this.hasMore);
    }

    public String toString() {
        return "LegacyUserFollowersModel(followers=" + this.followers + ", totalCount=" + this.totalCount + ", hasMore=" + this.hasMore + ")";
    }

    public LegacyUserFollowersModel(List<FollowerModel> followers, int i, boolean z) {
        Intrinsics.checkNotNullParameter(followers, "followers");
        this.followers = followers;
        this.totalCount = i;
        this.hasMore = z;
    }

    public final List<FollowerModel> getFollowers() {
        return this.followers;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }
}
