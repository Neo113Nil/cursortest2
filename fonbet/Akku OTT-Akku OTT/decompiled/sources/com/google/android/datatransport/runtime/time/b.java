package com.google.android.datatransport.runtime.time;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class b implements a {
    @Override // com.google.android.datatransport.runtime.time.a
    public final long a() {
        return SystemClock.elapsedRealtime();
    }
}
