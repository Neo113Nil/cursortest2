package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.InterfaceC0861m;
import com.google.android.gms.internal.ads.zzcci;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.s> extends com.google.android.gms.common.api.q {
    static final ThreadLocal zaa = new L3.b(6);
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private Y mResultGuardian;
    protected final HandlerC0829f zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.t zah;
    private com.google.android.gms.common.api.s zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC0861m zao;
    private volatile P zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public BasePendingResult(com.google.android.gms.common.api.o oVar) {
        this.zab = new HandlerC0829f(oVar != null ? ((F) oVar).f11115b.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zal(com.google.android.gms.common.api.s sVar) {
        if (sVar instanceof zzcci) {
            try {
                ((zzcci) sVar).release();
            } catch (RuntimeException e7) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(sVar)), e7);
            }
        }
    }

    public final com.google.android.gms.common.api.s a() {
        com.google.android.gms.common.api.s sVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.D.k("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.D.k("Result is not ready.", isReady());
            sVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.common.internal.D.i(sVar);
        return sVar;
    }

    public final void addStatusListener(com.google.android.gms.common.api.p pVar) {
        com.google.android.gms.common.internal.D.a("Callback cannot be null.", pVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    pVar.a(this.zak);
                } else {
                    this.zag.add(pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final R await() {
        com.google.android.gms.common.internal.D.h("await must not be called on the UI thread");
        com.google.android.gms.common.internal.D.k("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.D.k("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f11078f);
        }
        com.google.android.gms.common.internal.D.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.s sVar) {
        this.zaj = sVar;
        this.zak = sVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.t tVar = this.zah;
            if (tVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(tVar, a());
            } else if (this.zaj instanceof zzcci) {
                this.mResultGuardian = new Y(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((com.google.android.gms.common.api.p) arrayList.get(i7)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f11081z));
                }
            } finally {
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult((BasePendingResult<R>) createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z4;
        synchronized (this.zae) {
            z4 = this.zam;
        }
        return z4;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(InterfaceC0861m interfaceC0861m) {
        synchronized (this.zae) {
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.t tVar) {
        synchronized (this.zae) {
            try {
                if (tVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                com.google.android.gms.common.internal.D.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z4 = false;
                }
                com.google.android.gms.common.internal.D.k("Cannot set callbacks if then() has been called.", z4);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(tVar, a());
                } else {
                    this.zah = tVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.s> com.google.android.gms.common.api.v then(com.google.android.gms.common.api.u uVar) {
        P p5;
        com.google.android.gms.common.internal.D.k("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.D.k("Cannot call then() twice.", this.zap == null);
                com.google.android.gms.common.internal.D.k("Cannot call then() if callbacks are set.", this.zah == null);
                com.google.android.gms.common.internal.D.k("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new P(this.zac);
                P p7 = this.zap;
                synchronized (p7.f11142b) {
                    p5 = new P(p7.f11143c);
                    p7.f11141a = p5;
                }
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p5;
    }

    public final void zak() {
        boolean z4 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z4 = false;
        }
        this.zaq = z4;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.o) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(Q q7) {
        this.zai.set(q7);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0828e
    public final void setResult(R r7) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r7);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.D.k("Results have already been set", !isReady());
                com.google.android.gms.common.internal.D.k("Result has already been consumed", !this.zal);
                b(r7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            com.google.android.gms.common.internal.D.h("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.D.k("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.D.k("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.f11080y);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f11078f);
        }
        com.google.android.gms.common.internal.D.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.t tVar, long j, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (tVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                com.google.android.gms.common.internal.D.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z4 = false;
                }
                com.google.android.gms.common.internal.D.k("Cannot set callbacks if then() has been called.", z4);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(tVar, a());
                } else {
                    this.zah = tVar;
                    HandlerC0829f handlerC0829f = this.zab;
                    handlerC0829f.sendMessageDelayed(handlerC0829f.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
