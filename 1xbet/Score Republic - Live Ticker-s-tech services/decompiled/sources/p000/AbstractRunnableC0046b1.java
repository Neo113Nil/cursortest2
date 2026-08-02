package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: b1 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0046b1 extends a40 implements Runnable {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f667t = 0;

    /* JADX INFO: renamed from: r */
    public ListenableFuture f668r;

    /* JADX INFO: renamed from: s */
    public Object f669s;

    public AbstractRunnableC0046b1(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f668r = listenableFuture;
        obj.getClass();
        this.f669s = obj;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: b */
    public final void mo549b() {
        ListenableFuture listenableFuture = this.f668r;
        if ((listenableFuture != null) & (this.f2977j instanceof C0674s)) {
            listenableFuture.cancel(m2181p());
        }
        this.f668r = null;
        this.f669s = null;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: j */
    public final String mo550j() {
        String str;
        ListenableFuture listenableFuture = this.f668r;
        Object obj = this.f669s;
        String strMo550j = super.mo550j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strMo550j != null) {
                return str.concat(strMo550j);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    /* JADX INFO: renamed from: q */
    public abstract Object mo12q(Object obj, Object obj2);

    /* JADX INFO: renamed from: r */
    public abstract void mo13r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f668r;
        Object obj = this.f669s;
        if (((this.f2977j instanceof C0674s) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f668r = null;
        if (listenableFuture.isCancelled()) {
            m2179n(listenableFuture);
            return;
        }
        try {
            try {
                Object objMo12q = mo12q(obj, k70.m2991b(listenableFuture));
                this.f669s = null;
                mo13r(objMo12q);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m2178m(th);
                } finally {
                    this.f669s = null;
                }
            }
        } catch (Error e) {
            m2178m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            m2178m(e2);
        } catch (ExecutionException e3) {
            m2178m(e3.getCause());
        }
    }
}
