package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;

@WorkerThread
/* loaded from: classes.dex */
public interface b {

    public interface a<T> {
        T execute();
    }

    <T> T l(a<T> aVar);
}
