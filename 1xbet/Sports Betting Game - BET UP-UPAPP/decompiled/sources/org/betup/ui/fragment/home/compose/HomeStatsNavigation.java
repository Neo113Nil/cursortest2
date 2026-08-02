package org.betup.ui.fragment.home.compose;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import org.betup.bus.NavigateMessage;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeStatsNavigation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeStatsNavigation;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_OPEN_TO_RANKINGS", "", "navigateToOwnProfile", "", HomeStatsNavigation.ARG_OPEN_TO_RANKINGS, "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeStatsNavigation {
    public static final int $stable = 0;
    private static final String ARG_OPEN_TO_RANKINGS = "openToRankings";
    public static final HomeStatsNavigation INSTANCE = new HomeStatsNavigation();

    private HomeStatsNavigation() {
    }

    public static /* synthetic */ void navigateToOwnProfile$default(HomeStatsNavigation homeStatsNavigation, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        homeStatsNavigation.navigateToOwnProfile(z);
    }

    public final void navigateToOwnProfile(boolean openToRankings) {
        EventBus eventBus = EventBus.getDefault();
        NavigateMessage.Target target = NavigateMessage.Target.USER_DETAILS;
        Bundle bundle = new Bundle();
        bundle.putInt("id", 0);
        bundle.putBoolean("return", true);
        bundle.putBoolean(ARG_OPEN_TO_RANKINGS, openToRankings);
        Unit unit = Unit.INSTANCE;
        eventBus.post(new NavigateMessage(target, bundle));
    }
}
