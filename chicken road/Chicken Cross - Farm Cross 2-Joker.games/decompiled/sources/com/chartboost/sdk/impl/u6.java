package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class u6 {
    public static final t6 a(Download download) {
        Intrinsics.checkNotNullParameter(download, "<this>");
        return new t6(download);
    }

    public static final String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? "UNKNOWN STATE " + i : "STATE_RESTARTING" : "STATE_REMOVING" : "STATE_FAILED" : "STATE_COMPLETED" : "STATE_DOWNLOADING" : "STATE_STOPPED" : "STATE_QUEUED";
    }

    public static final File a(t6 t6Var, File file) {
        Intrinsics.checkNotNullParameter(t6Var, "<this>");
        return new File(file, t6Var.b());
    }
}
