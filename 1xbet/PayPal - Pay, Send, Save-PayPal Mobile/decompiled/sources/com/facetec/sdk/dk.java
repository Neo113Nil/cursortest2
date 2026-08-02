package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class dk extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {

    /* renamed from: a, reason: collision with root package name */
    private static java.util.concurrent.Executor f3513a;
    private static java.util.concurrent.Executor b;
    private java.lang.Runnable d = null;
    private final java.lang.Runnable e;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] voidArr) {
        this.e.run();
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(java.lang.Void r1) {
        super.onPostExecute(r1);
        java.lang.Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    private dk(java.lang.Runnable runnable) {
        this.e = runnable;
    }

    private static java.util.concurrent.Executor d() {
        java.util.concurrent.Executor executor;
        synchronized (com.facetec.sdk.dk.class) {
            if (b == null) {
                b = java.util.concurrent.Executors.newCachedThreadPool();
            }
            executor = b;
        }
        return executor;
    }

    private static java.util.concurrent.Executor e() {
        java.util.concurrent.Executor executor;
        synchronized (com.facetec.sdk.dk.class) {
            if (f3513a == null) {
                f3513a = java.util.concurrent.Executors.newSingleThreadExecutor();
            }
            executor = f3513a;
        }
        return executor;
    }

    final com.facetec.sdk.dk d(java.lang.Runnable runnable) {
        this.d = runnable;
        return this;
    }

    static com.facetec.sdk.dk b(java.lang.Runnable runnable) {
        com.facetec.sdk.dk dkVar = new com.facetec.sdk.dk(runnable);
        dkVar.executeOnExecutor(e(), new java.lang.Void[0]);
        return dkVar;
    }

    public static com.facetec.sdk.dk e(java.lang.Runnable runnable) {
        com.facetec.sdk.dk dkVar = new com.facetec.sdk.dk(runnable);
        dkVar.executeOnExecutor(d(), new java.lang.Void[0]);
        return dkVar;
    }
}
