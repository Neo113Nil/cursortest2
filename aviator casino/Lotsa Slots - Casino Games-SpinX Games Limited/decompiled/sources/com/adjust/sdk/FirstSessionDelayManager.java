package com.adjust.sdk;

/* loaded from: classes2.dex */
class FirstSessionDelayManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.adjust.sdk.ActivityHandler f3422a;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public int c = 0;

    public FirstSessionDelayManager(com.adjust.sdk.ActivityHandler activityHandler) {
        this.f3422a = activityHandler;
    }

    public final void a(java.lang.Runnable runnable, java.lang.String str) {
        if (this.c != 3) {
            runnable.run();
            return;
        }
        this.f3422a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new java.lang.Object[0]);
        this.b.add(runnable);
    }

    public final void a(java.lang.String str, com.adjust.sdk.IRunActivityHandler iRunActivityHandler) {
        if (this.c == 3) {
            this.f3422a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new java.lang.Object[0]);
            this.f3422a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
            return;
        }
        iRunActivityHandler.run(this.f3422a);
    }
}
