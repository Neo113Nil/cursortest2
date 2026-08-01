package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class h implements m {
    public final int a(e jobInfo) {
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.e() - 2)) + 10);
    }
}
