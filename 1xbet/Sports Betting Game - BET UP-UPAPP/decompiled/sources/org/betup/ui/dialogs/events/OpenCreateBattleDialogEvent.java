package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/dialogs/events/OpenCreateBattleDialogEvent;", "", "userId", "", "followerPhotoUrl", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFollowerPhotoUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lorg/betup/ui/dialogs/events/OpenCreateBattleDialogEvent;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpenCreateBattleDialogEvent {
    public static final int $stable = 0;
    private final String followerPhotoUrl;
    private final Long userId;

    /* JADX WARN: Multi-variable type inference failed */
    public OpenCreateBattleDialogEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OpenCreateBattleDialogEvent copy$default(OpenCreateBattleDialogEvent openCreateBattleDialogEvent, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = openCreateBattleDialogEvent.userId;
        }
        if ((i & 2) != 0) {
            str = openCreateBattleDialogEvent.followerPhotoUrl;
        }
        return openCreateBattleDialogEvent.copy(l, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFollowerPhotoUrl() {
        return this.followerPhotoUrl;
    }

    public final OpenCreateBattleDialogEvent copy(Long userId, String followerPhotoUrl) {
        return new OpenCreateBattleDialogEvent(userId, followerPhotoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenCreateBattleDialogEvent)) {
            return false;
        }
        OpenCreateBattleDialogEvent openCreateBattleDialogEvent = (OpenCreateBattleDialogEvent) other;
        return Intrinsics.areEqual(this.userId, openCreateBattleDialogEvent.userId) && Intrinsics.areEqual(this.followerPhotoUrl, openCreateBattleDialogEvent.followerPhotoUrl);
    }

    public int hashCode() {
        Long l = this.userId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.followerPhotoUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "OpenCreateBattleDialogEvent(userId=" + this.userId + ", followerPhotoUrl=" + this.followerPhotoUrl + ")";
    }

    public OpenCreateBattleDialogEvent(Long l, String str) {
        this.userId = l;
        this.followerPhotoUrl = str;
    }

    public /* synthetic */ OpenCreateBattleDialogEvent(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final String getFollowerPhotoUrl() {
        return this.followerPhotoUrl;
    }
}
