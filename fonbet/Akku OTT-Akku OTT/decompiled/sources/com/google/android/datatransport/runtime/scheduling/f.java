package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.bbflight.background_downloader.C0670t0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;

/* loaded from: classes.dex */
public final class f implements com.google.android.datatransport.runtime.dagger.internal.b<q> {
    public final javax.inject.a<Context> a;
    public final javax.inject.a<com.google.android.datatransport.runtime.scheduling.persistence.d> b;
    public final C0670t0 c;

    public f(javax.inject.a aVar, javax.inject.a aVar2, C0670t0 c0670t0) {
        this.a = aVar;
        this.b = aVar2;
        this.c = c0670t0;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.d(this.a.get(), this.b.get(), (com.google.android.datatransport.runtime.scheduling.jobscheduling.f) this.c.get());
    }
}
