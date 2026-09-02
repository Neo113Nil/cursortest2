package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PrimarySampler {
    public static final PrimarySampler evictLayout = new PrimarySampler();

    public final LongPressDispatcher evictLayout(SessionRelay storage, SnackbarTree snackbarTree, List migrations, ProgressValve scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new SingletonMigration(storage, DefaultBenchmark.releaseHeader(RotateQueue.evictLayout.growPayload(migrations)), new HoverRollback(), scope);
    }
}
