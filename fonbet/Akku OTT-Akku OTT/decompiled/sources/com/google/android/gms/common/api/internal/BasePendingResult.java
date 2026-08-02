package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.InterfaceC0870l;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes4.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.l> extends com.google.android.gms.common.api.i<R> {
    static final ThreadLocal zaa = new s0();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private t0 resultGuardian;

    @NonNull
    protected final a zab;

    @NonNull
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;

    @Nullable
    private com.google.android.gms.common.api.m zah;
    private final AtomicReference zai;

    @Nullable
    private com.google.android.gms.common.api.l zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;

    @Nullable
    private InterfaceC0870l zao;
    private volatile h0 zap;
    private boolean zaq;

    @VisibleForTesting
    public static class a<R extends com.google.android.gms.common.api.l> extends zau {
        public final void a(@NonNull com.google.android.gms.common.api.m mVar, @NonNull com.google.android.gms.common.api.l lVar) {
            int i = BasePendingResult.zad;
            C0875q.g(mVar);
            sendMessage(obtainMessage(1, new Pair(mVar, lVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    new Exception();
                    return;
                } else {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.j);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.m mVar = (com.google.android.gms.common.api.m) pair.first;
            com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) pair.second;
            try {
                mVar.a(lVar);
            } catch (RuntimeException e) {
                BasePendingResult.zal(lVar);
                throw e;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    private final com.google.android.gms.common.api.l zaa() {
        com.google.android.gms.common.api.l lVar;
        synchronized (this.zae) {
            C0875q.i(!this.zal, "Result has already been consumed.");
            C0875q.i(isReady(), "Result is not ready.");
            lVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (((i0) this.zai.getAndSet(null)) != null) {
            throw null;
        }
        C0875q.g(lVar);
        return lVar;
    }

    private final void zab(com.google.android.gms.common.api.l lVar) {
        this.zaj = lVar;
        this.zak = lVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.m mVar = this.zah;
            if (mVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(mVar, zaa());
            } else if (this.zaj instanceof com.google.android.gms.common.api.j) {
                this.resultGuardian = new t0(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i.a) arrayList.get(i)).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(@Nullable com.google.android.gms.common.api.l lVar) {
        if (lVar instanceof com.google.android.gms.common.api.j) {
            try {
                ((com.google.android.gms.common.api.j) lVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(lVar));
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void addStatusListener(@NonNull i.a aVar) {
        C0875q.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R await() {
        C0875q.f("await must not be called on the UI thread");
        C0875q.i(!this.zal, "Result has already been consumed");
        C0875q.i(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f);
        }
        C0875q.i(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.i
    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    zab(createFailedResult(Status.k));
                }
            } finally {
            }
        }
    }

    @NonNull
    public abstract R createFailedResult(@NonNull Status status);

    @Deprecated
    public final void forceFailureUnlessReady(@NonNull Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean isCanceled() {
        boolean z;
        synchronized (this.zae) {
            z = this.zam;
        }
        return z;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(@NonNull InterfaceC0870l interfaceC0870l) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(@NonNull R r) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r);
                    return;
                }
                isReady();
                C0875q.i(!isReady(), "Results have already been set");
                C0875q.i(!this.zal, "Result has already been consumed");
                zab(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void setResultCallback(@Nullable com.google.android.gms.common.api.m<? super R> mVar) {
        synchronized (this.zae) {
            try {
                if (mVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                C0875q.i(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                C0875q.i(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(mVar, zaa());
                } else {
                    this.zah = mVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    @NonNull
    public final <S extends com.google.android.gms.common.api.l> com.google.android.gms.common.api.o<S> then(@NonNull com.google.android.gms.common.api.n<? super R, ? extends S> nVar) {
        h0 h0Var;
        C0875q.i(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                C0875q.i(this.zap == null, "Cannot call then() twice.");
                C0875q.i(this.zah == null, "Cannot call then() if callbacks are set.");
                C0875q.i(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new h0(this.zac);
                h0 h0Var2 = this.zap;
                synchronized (h0Var2.c) {
                    C0875q.i(true, "Cannot call then() twice.");
                    h0Var = new h0(h0Var2.e);
                    h0Var2.a = h0Var;
                    h0Var2.c();
                }
                if (isReady()) {
                    this.zab.a(this.zap, zaa());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h0Var;
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.h) this.zac.get()) != null) {
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

    public final void zan(@Nullable i0 i0Var) {
        this.zai.set(i0Var);
    }

    @Deprecated
    public BasePendingResult(@NonNull Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(looper);
        this.zac = new WeakReference(null);
    }

    @Override // com.google.android.gms.common.api.i
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R await(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            C0875q.f("await must not be called on the UI thread when time is greater than zero.");
        }
        C0875q.i(!this.zal, "Result has already been consumed.");
        C0875q.i(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.j);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f);
        }
        C0875q.i(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.i
    public final void setResultCallback(@NonNull com.google.android.gms.common.api.m<? super R> mVar, long j, @NonNull TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (mVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                C0875q.i(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                C0875q.i(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(mVar, zaa());
                } else {
                    this.zah = mVar;
                    a aVar = this.zab;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public BasePendingResult(@Nullable com.google.android.gms.common.api.h hVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(hVar != null ? hVar.c() : Looper.getMainLooper());
        this.zac = new WeakReference(hVar);
    }

    @VisibleForTesting
    public BasePendingResult(@NonNull a<R> aVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        C0875q.h(aVar, "CallbackHandler must not be null");
        this.zab = aVar;
        this.zac = new WeakReference(null);
    }
}
