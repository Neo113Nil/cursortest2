package org.betup.model.remote.entity.matches;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchSocialModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006!"}, d2 = {"Lorg/betup/model/remote/entity/matches/NewMatchSocialModel;", "", "id", "", "betsCount", "", "likesCount", "viewsCount", "commentsCount", "isLiked", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIIIIZ)V", "getId", "()J", "getBetsCount", "()I", "getLikesCount", "getViewsCount", "getCommentsCount", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchSocialModel {
    public static final int $stable = 0;

    @SerializedName("betsCount")
    private final int betsCount;

    @SerializedName("commentsCount")
    private final int commentsCount;

    @SerializedName("id")
    private final long id;

    @SerializedName("isLiked")
    private final boolean isLiked;

    @SerializedName("likesCount")
    private final int likesCount;

    @SerializedName("viewsCount")
    private final int viewsCount;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBetsCount() {
        return this.betsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLikesCount() {
        return this.likesCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getViewsCount() {
        return this.viewsCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCommentsCount() {
        return this.commentsCount;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLiked() {
        return this.isLiked;
    }

    public final NewMatchSocialModel copy(long id, int betsCount, int likesCount, int viewsCount, int commentsCount, boolean isLiked) {
        return new NewMatchSocialModel(id, betsCount, likesCount, viewsCount, commentsCount, isLiked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchSocialModel)) {
            return false;
        }
        NewMatchSocialModel newMatchSocialModel = (NewMatchSocialModel) other;
        return this.id == newMatchSocialModel.id && this.betsCount == newMatchSocialModel.betsCount && this.likesCount == newMatchSocialModel.likesCount && this.viewsCount == newMatchSocialModel.viewsCount && this.commentsCount == newMatchSocialModel.commentsCount && this.isLiked == newMatchSocialModel.isLiked;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.betsCount)) * 31) + Integer.hashCode(this.likesCount)) * 31) + Integer.hashCode(this.viewsCount)) * 31) + Integer.hashCode(this.commentsCount)) * 31) + Boolean.hashCode(this.isLiked);
    }

    public String toString() {
        return "NewMatchSocialModel(id=" + this.id + ", betsCount=" + this.betsCount + ", likesCount=" + this.likesCount + ", viewsCount=" + this.viewsCount + ", commentsCount=" + this.commentsCount + ", isLiked=" + this.isLiked + ")";
    }

    public NewMatchSocialModel(long j, int i, int i2, int i3, int i4, boolean z) {
        this.id = j;
        this.betsCount = i;
        this.likesCount = i2;
        this.viewsCount = i3;
        this.commentsCount = i4;
        this.isLiked = z;
    }

    public final long getId() {
        return this.id;
    }

    public final int getBetsCount() {
        return this.betsCount;
    }

    public final int getLikesCount() {
        return this.likesCount;
    }

    public final int getViewsCount() {
        return this.viewsCount;
    }

    public final int getCommentsCount() {
        return this.commentsCount;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }
}
