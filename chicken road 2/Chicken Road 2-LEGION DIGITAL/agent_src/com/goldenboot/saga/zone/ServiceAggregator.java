package com.goldenboot.saga.zone;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.goldenboot.saga.zone.AttrSemaphore;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ServiceAggregator {
    private static volatile Choreographer choreographer;
    public static final IconAdministrator evictLayout;

    static {
        Object growPayload;
        try {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            growPayload = AttrSemaphore.growPayload(new RegionStreamer(evictLayout(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            AttrSemaphore.ActivityMutator activityMutator2 = AttrSemaphore.notifyMessage;
            growPayload = AttrSemaphore.growPayload(ColumnForger.evictLayout(th));
        }
        evictLayout = (IconAdministrator) (AttrSemaphore.clipOrigin(growPayload) ? null : growPayload);
    }

    public static final Handler evictLayout(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }

    public static final IconAdministrator growPayload(Handler handler, String str) {
        return new RegionStreamer(handler, str);
    }
}
