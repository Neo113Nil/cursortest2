package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.Closeable;
import java.util.List;

@WorkerThread
/* loaded from: classes.dex */
public interface d extends Closeable {
    Iterable F(com.google.android.datatransport.runtime.d dVar);

    @Nullable
    b K(com.google.android.datatransport.runtime.d dVar, com.google.android.datatransport.runtime.i iVar);

    boolean M(com.google.android.datatransport.runtime.d dVar);

    int b();

    void c(Iterable<g> iterable);

    List g();

    void h(long j, com.google.android.datatransport.runtime.d dVar);

    long w(com.google.android.datatransport.runtime.n nVar);

    void z(Iterable<g> iterable);
}
