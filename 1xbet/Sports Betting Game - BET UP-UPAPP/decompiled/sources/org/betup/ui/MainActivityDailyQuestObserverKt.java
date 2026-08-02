package org.betup.ui;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;

/* compiled from: MainActivityDailyQuestObserver.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"bindDailyQuestEvents", "", "Lorg/betup/ui/MainActivity;", "homeDailyQuestController", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestController;", "userService", "Lorg/betup/services/user/UserService;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainActivityDailyQuestObserverKt {
    public static final void bindDailyQuestEvents(MainActivity mainActivity, HomeDailyQuestController homeDailyQuestController, UserService userService) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        Intrinsics.checkNotNullParameter(homeDailyQuestController, "homeDailyQuestController");
        Intrinsics.checkNotNullParameter(userService, "userService");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), null, null, new MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1(mainActivity, homeDailyQuestController, userService, null), 3, null);
    }
}
