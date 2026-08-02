package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: k */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0378k extends a40 implements Runnable {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f4237u = 0;

    /* JADX INFO: renamed from: r */
    public ListenableFuture f4238r;

    /* JADX INFO: renamed from: s */
    public Class f4239s;

    /* JADX INFO: renamed from: t */
    public Object f4240t;

    public AbstractRunnableC0378k(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f4238r = listenableFuture;
        this.f4239s = cls;
        this.f4240t = obj;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: b */
    public final void mo549b() {
        ListenableFuture listenableFuture = this.f4238r;
        if ((listenableFuture != null) & (this.f2977j instanceof C0674s)) {
            listenableFuture.cancel(m2181p());
        }
        this.f4238r = null;
        this.f4239s = null;
        this.f4240t = null;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: j */
    public final String mo550j() {
        String str;
        ListenableFuture listenableFuture = this.f4238r;
        Class cls = this.f4239s;
        Object obj = this.f4240t;
        String strMo550j = super.mo550j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strMo550j != null) {
                return str.concat(strMo550j);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    /* JADX INFO: renamed from: q */
    public abstract Object mo2355q(Object obj, Throwable th);

    /* JADX INFO: renamed from: r */
    public abstract void mo2356r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        Object objM2991b;
        ListenableFuture listenableFuture = this.f4238r;
        Class cls = this.f4239s;
        Object obj = this.f4240t;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.f2977j instanceof C0674s)) {
            return;
        }
        this.f4238r = null;
        try {
            e = listenableFuture instanceof AbstractC0269h0 ? ((AbstractC0269h0) listenableFuture).m2180o() : null;
            objM2991b = e == null ? k70.m2991b(listenableFuture) : null;
        } catch (Error | RuntimeException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e3.getClass() + " without a cause");
            }
            e = cause;
        }
        if (e == null) {
            m2177l(objM2991b);
            return;
        }
        if (!cls.isInstance(e)) {
            m2179n(listenableFuture);
            return;
        }
        try {
            Object objMo2355q = mo2355q(obj, e);
            this.f4239s = null;
            this.f4240t = null;
            mo2356r(objMo2355q);
        } catch (Throwable th) {
            try {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m2178m(th);
            } finally {
                this.f4239s = null;
                this.f4240t = null;
            }
        }
    }
}
