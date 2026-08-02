package org.betup.utils;

import android.os.Bundle;
import androidx.collection.SieveCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.services.user.UserService;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NavigationHelper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\tJ \u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\tJ,\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\tJ,\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\t¨\u0006\u0016"}, d2 = {"Lorg/betup/utils/NavigationHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "navigateToCurrentUser", "", "userService", "Lorg/betup/services/user/UserService;", "returnAvatar", "", "navigateToForeignUser", "userId", "", "navigateToUser", "currentUserId", "navigateToLeagueMatches", "leagueId", "isLive", "filter", "", "isFavorite", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationHelper {
    public static final int $stable = 0;
    public static final NavigationHelper INSTANCE = new NavigationHelper();

    private NavigationHelper() {
    }

    public static /* synthetic */ void navigateToCurrentUser$default(NavigationHelper navigationHelper, UserService userService, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        navigationHelper.navigateToCurrentUser(userService, z);
    }

    public final void navigateToCurrentUser(UserService userService, boolean returnAvatar) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Bundle bundle = new Bundle();
        Integer id = userService.getShortProfile().getUserModel().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        bundle.putInt("id", id.intValue());
        bundle.putBoolean("return", returnAvatar);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
    }

    public static /* synthetic */ void navigateToForeignUser$default(NavigationHelper navigationHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        navigationHelper.navigateToForeignUser(i, z);
    }

    public final void navigateToForeignUser(int userId, boolean returnAvatar) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", userId);
        bundle.putBoolean("return", returnAvatar);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
    }

    public static /* synthetic */ void navigateToUser$default(NavigationHelper navigationHelper, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        navigationHelper.navigateToUser(i, i2, z);
    }

    public final void navigateToUser(int userId, int currentUserId, boolean returnAvatar) {
        if (userId == currentUserId) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", userId);
            bundle.putBoolean("return", returnAvatar);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
            return;
        }
        navigateToForeignUser(userId, returnAvatar);
    }

    public static /* synthetic */ void navigateToLeagueMatches$default(NavigationHelper navigationHelper, int i, boolean z, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            str = "All";
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        navigationHelper.navigateToLeagueMatches(i, z, str, z2);
    }

    public final void navigateToLeagueMatches(int leagueId, boolean isLive, String filter, boolean isFavorite) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (leagueId <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", leagueId);
        bundle.putBoolean("isLive", isLive);
        bundle.putString("filter", filter);
        bundle.putBoolean("isFavorite", isFavorite);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.LEAGUE_MATCHES, bundle));
    }

    public static /* synthetic */ void navigateToLeagueMatches$default(NavigationHelper navigationHelper, long j, boolean z, String str, boolean z2, int i, Object obj) {
        boolean z3 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            str = "All";
        }
        navigationHelper.navigateToLeagueMatches(j, z3, str, (i & 8) != 0 ? false : z2);
    }

    public final void navigateToLeagueMatches(long leagueId, boolean isLive, String filter, boolean isFavorite) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (leagueId <= 0 || leagueId > SieveCacheKt.NodeLinkMask) {
            return;
        }
        navigateToLeagueMatches((int) leagueId, isLive, filter, isFavorite);
    }
}
