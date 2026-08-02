package org.betup.ui.fragment.home.compose;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.entity.analytics.HomeMatchAd;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchNavigation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeMatchNavigation;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "navigateToTopMatches", "", "liveTab", "", "navigateToMatchDetails", "matchId", "", "isLive", "navigateFromMatchAd", "ad", "Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", "MATCH_LINK_TYPE", "", "LEAGUE_LINK_TYPE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchNavigation {
    public static final int $stable = 0;
    public static final HomeMatchNavigation INSTANCE = new HomeMatchNavigation();
    private static final int LEAGUE_LINK_TYPE = 2;
    private static final int MATCH_LINK_TYPE = 1;

    private HomeMatchNavigation() {
    }

    public static /* synthetic */ void navigateToTopMatches$default(HomeMatchNavigation homeMatchNavigation, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        homeMatchNavigation.navigateToTopMatches(z);
    }

    public final void navigateToTopMatches(boolean liveTab) {
        EventBus eventBus = EventBus.getDefault();
        NavigateMessage.Target target = NavigateMessage.Target.TOP_MATCHES;
        Bundle bundle = new Bundle();
        bundle.putInt("initialTab", liveTab ? 1 : 0);
        Unit unit = Unit.INSTANCE;
        eventBus.post(new NavigateMessage(target, bundle));
    }

    public static /* synthetic */ void navigateToMatchDetails$default(HomeMatchNavigation homeMatchNavigation, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        homeMatchNavigation.navigateToMatchDetails(j, z);
    }

    public final void navigateToMatchDetails(long matchId, boolean isLive) {
        EventBus eventBus = EventBus.getDefault();
        NavigateMessage.Target target = NavigateMessage.Target.MATCH_DETAILS;
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", (int) matchId);
        bundle.putBoolean("isLive", isLive);
        Unit unit = Unit.INSTANCE;
        eventBus.post(new NavigateMessage(target, bundle));
    }

    public final void navigateFromMatchAd(HomeMatchAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        int linkType = ad.getLinkType();
        if (linkType == 1) {
            navigateToMatchDetails$default(this, ad.getLinkId(), false, 2, null);
            return;
        }
        if (linkType != 2) {
            return;
        }
        EventBus eventBus = EventBus.getDefault();
        NavigateMessage.Target target = NavigateMessage.Target.LEAGUE_MATCHES;
        Bundle bundle = new Bundle();
        bundle.putInt("id", ad.getLinkId());
        bundle.putBoolean("isLive", false);
        bundle.putString("filter", "All");
        bundle.putBoolean("isFavorite", false);
        Unit unit = Unit.INSTANCE;
        eventBus.post(new NavigateMessage(target, bundle));
    }
}
