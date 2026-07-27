package com.adjust.sdk;

import java.util.ArrayList;

/* loaded from: classes5.dex */
class FirstSessionDelayManager {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityHandler f3904a;
    public final ArrayList b = new ArrayList();
    public int c = 0;

    public FirstSessionDelayManager(ActivityHandler activityHandler) {
        this.f3904a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.c != 3) {
            runnable.run();
        } else {
            this.f3904a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
            this.b.add(runnable);
        }
    }

    public final void a(String str, IRunActivityHandler iRunActivityHandler) {
        if (this.c == 3) {
            this.f3904a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
            this.f3904a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        } else {
            iRunActivityHandler.run(this.f3904a);
        }
    }
}
