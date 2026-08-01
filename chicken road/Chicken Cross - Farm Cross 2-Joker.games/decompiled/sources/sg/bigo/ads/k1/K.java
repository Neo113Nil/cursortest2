package sg.bigo.ads.k1;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public final class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AsyncTask f13017a;
    public final /* synthetic */ Object[] b;

    public K(M m, Object[] objArr) {
        this.f13017a = m;
        this.b = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13017a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.b);
    }
}
