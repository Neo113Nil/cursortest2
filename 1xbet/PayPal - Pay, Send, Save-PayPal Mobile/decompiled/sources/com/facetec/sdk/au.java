package com.facetec.sdk;

/* loaded from: classes8.dex */
abstract class au extends android.app.Fragment {
    au() {
    }

    final class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.Runnable f3401a;

        b(java.lang.Runnable runnable) {
            this.f3401a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.app.Activity activity;
            com.facetec.sdk.au auVar = com.facetec.sdk.au.this;
            if (auVar == null || !auVar.isAdded() || (activity = auVar.getActivity()) == null || activity.isFinishing()) {
                return;
            }
            this.f3401a.run();
        }
    }

    final void e(java.lang.Runnable runnable) {
        if (getActivity() == null) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facetec.sdk.au.b(runnable));
    }

    final void d(java.lang.Runnable runnable, long j) {
        a(new com.facetec.sdk.au.b(runnable), j);
    }

    static void a(com.facetec.sdk.au.b bVar, long j) {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(bVar, j);
    }

    final void a(java.lang.Runnable runnable, long j) {
        new android.os.Handler().postDelayed(new com.facetec.sdk.au.b(runnable), j);
    }

    final boolean c() {
        return isAdded() && !isRemoving();
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
