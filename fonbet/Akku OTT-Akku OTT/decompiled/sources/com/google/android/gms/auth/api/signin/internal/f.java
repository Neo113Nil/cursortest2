package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.content.AsyncTaskLoader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class f extends AsyncTaskLoader {
    public final Semaphore a;
    public final Set b;

    public f(Context context, Set set) {
        super(context);
        this.a = new Semaphore(0);
        this.b = set;
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final Object loadInBackground() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            ((com.google.android.gms.common.api.h) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.a.tryAcquire(0, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        this.a.drainPermits();
        forceLoad();
    }
}
