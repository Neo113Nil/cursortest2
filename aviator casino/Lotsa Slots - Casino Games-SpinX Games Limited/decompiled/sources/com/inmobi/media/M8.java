package com.inmobi.media;

/* loaded from: classes5.dex */
public final class M8 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4832a;
    public final java.util.ArrayList b;
    public final java.lang.ref.WeakReference c;

    public M8(com.inmobi.media.N8 impressionTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionTracker, "impressionTracker");
        this.f4832a = "M8";
        this.b = new java.util.ArrayList();
        this.c = new java.lang.ref.WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String TAG = this.f4832a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        com.inmobi.media.N8 n8 = (com.inmobi.media.N8) this.c.get();
        if (n8 != null) {
            for (java.util.Map.Entry entry : n8.b.entrySet()) {
                android.view.View view = (android.view.View) entry.getKey();
                com.inmobi.media.L8 l8 = (com.inmobi.media.L8) entry.getValue();
                java.lang.String TAG2 = this.f4832a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                java.util.Objects.toString(l8);
                if (android.os.SystemClock.uptimeMillis() - l8.d >= l8.c) {
                    java.lang.String TAG3 = this.f4832a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    java.util.Objects.toString(l8);
                    com.inmobi.media.C2741s7 c2741s7 = n8.h;
                    c2741s7.getClass();
                    if (view instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2741s7.f5442a.f;
                        if (interfaceC2772t9 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) view).u();
                    }
                    this.b.add(view);
                }
            }
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                n8.a((android.view.View) it.next());
            }
            this.b.clear();
            if (n8.b.isEmpty() || n8.e.hasMessages(0)) {
                return;
            }
            n8.e.postDelayed(n8.f, n8.g);
        }
    }
}
