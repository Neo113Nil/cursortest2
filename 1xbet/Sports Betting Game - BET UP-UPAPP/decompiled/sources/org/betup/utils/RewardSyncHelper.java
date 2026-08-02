package org.betup.utils;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.services.user.UserService;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardSyncHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/betup/utils/RewardSyncHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "mainHandler", "Landroid/os/Handler;", "syncProfileAndNotify", "", "userService", "Lorg/betup/services/user/UserService;", "delayMs", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardSyncHelper {
    public static final RewardSyncHelper INSTANCE = new RewardSyncHelper();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    public static final int $stable = 8;

    private RewardSyncHelper() {
    }

    public static /* synthetic */ void syncProfileAndNotify$default(RewardSyncHelper rewardSyncHelper, UserService userService, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        rewardSyncHelper.syncProfileAndNotify(userService, j);
    }

    public final void syncProfileAndNotify(final UserService userService, long delayMs) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Runnable runnable = new Runnable() { // from class: org.betup.utils.RewardSyncHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RewardSyncHelper.syncProfileAndNotify$lambda$0(UserService.this);
            }
        };
        if (delayMs > 0) {
            mainHandler.postDelayed(runnable, delayMs);
        } else {
            mainHandler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncProfileAndNotify$lambda$0(UserService userService) {
        userService.invalidate(UserService.InfoKind.PROGRESS);
        userService.getProfile(null, UserService.InfoKind.PROGRESS);
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }
}
