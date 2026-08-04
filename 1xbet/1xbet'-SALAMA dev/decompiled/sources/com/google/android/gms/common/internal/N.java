package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0814j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11285d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile zzi f11287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p082l3.a f11288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11290i;

    public N(Context context, Looper looper) {
        M m7 = new M(this);
        this.f11286e = context.getApplicationContext();
        this.f11287f = new zzi(looper, m7);
        this.f11288g = p082l3.a.a();
        this.f11289h = 5000L;
        this.f11290i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0814j
    public final boolean c(K k7, H h6, String str, Executor executor) {
        boolean z4;
        synchronized (this.f11285d) {
            try {
                L l7 = (L) this.f11285d.get(k7);
                if (executor == null) {
                    executor = null;
                }
                if (l7 == null) {
                    l7 = new L(this, k7);
                    l7.f11268a.put(h6, h6);
                    l7.a(str, executor);
                    this.f11285d.put(k7, l7);
                } else {
                    this.f11287f.removeMessages(0, k7);
                    if (l7.f11268a.containsKey(h6)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(k7.toString()));
                    }
                    l7.f11268a.put(h6, h6);
                    int i7 = l7.f11269b;
                    if (i7 == 1) {
                        h6.onServiceConnected(l7.f11273f, l7.f11271d);
                    } else if (i7 == 2) {
                        l7.a(str, executor);
                    }
                }
                z4 = l7.f11270c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
