package com.inmobi.media;

/* renamed from: com.inmobi.media.ui, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2808ui {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5490a;
    public final long b;

    public C2808ui(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi view, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.f5490a = view;
        this.b = j;
    }

    public final void a() {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.inmobi.media.ui$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2808ui.a(com.inmobi.media.C2808ui.this);
            }
        }, this.b);
    }

    public static final void a(com.inmobi.media.C2808ui c2808ui) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = c2808ui.f5490a;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.j();
        }
        c2808ui.f5490a = null;
    }
}
