package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lorg/betup/ui/dialogs/events/FollowerSelectedForBattleEvent;", "", "followerId", "", "followerName", "", "followerPhotoUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;)V", "getFollowerId", "()J", "getFollowerName", "()Ljava/lang/String;", "getFollowerPhotoUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FollowerSelectedForBattleEvent {
    public static final int $stable = 0;
    private final long followerId;
    private final String followerName;
    private final String followerPhotoUrl;

    public static /* synthetic */ FollowerSelectedForBattleEvent copy$default(FollowerSelectedForBattleEvent followerSelectedForBattleEvent, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = followerSelectedForBattleEvent.followerId;
        }
        if ((i & 2) != 0) {
            str = followerSelectedForBattleEvent.followerName;
        }
        if ((i & 4) != 0) {
            str2 = followerSelectedForBattleEvent.followerPhotoUrl;
        }
        return followerSelectedForBattleEvent.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFollowerId() {
        return this.followerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFollowerName() {
        return this.followerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFollowerPhotoUrl() {
        return this.followerPhotoUrl;
    }

    public final FollowerSelectedForBattleEvent copy(long followerId, String followerName, String followerPhotoUrl) {
        Intrinsics.checkNotNullParameter(followerName, "followerName");
        Intrinsics.checkNotNullParameter(followerPhotoUrl, "followerPhotoUrl");
        return new FollowerSelectedForBattleEvent(followerId, followerName, followerPhotoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowerSelectedForBattleEvent)) {
            return false;
        }
        FollowerSelectedForBattleEvent followerSelectedForBattleEvent = (FollowerSelectedForBattleEvent) other;
        return this.followerId == followerSelectedForBattleEvent.followerId && Intrinsics.areEqual(this.followerName, followerSelectedForBattleEvent.followerName) && Intrinsics.areEqual(this.followerPhotoUrl, followerSelectedForBattleEvent.followerPhotoUrl);
    }

    public int hashCode() {
        return (((Long.hashCode(this.followerId) * 31) + this.followerName.hashCode()) * 31) + this.followerPhotoUrl.hashCode();
    }

    public String toString() {
        return "FollowerSelectedForBattleEvent(followerId=" + this.followerId + ", followerName=" + this.followerName + ", followerPhotoUrl=" + this.followerPhotoUrl + ")";
    }

    public FollowerSelectedForBattleEvent(long j, String followerName, String followerPhotoUrl) {
        Intrinsics.checkNotNullParameter(followerName, "followerName");
        Intrinsics.checkNotNullParameter(followerPhotoUrl, "followerPhotoUrl");
        this.followerId = j;
        this.followerName = followerName;
        this.followerPhotoUrl = followerPhotoUrl;
    }

    public final long getFollowerId() {
        return this.followerId;
    }

    public final String getFollowerName() {
        return this.followerName;
    }

    public final String getFollowerPhotoUrl() {
        return this.followerPhotoUrl;
    }
}
