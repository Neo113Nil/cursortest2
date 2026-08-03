package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4907a;
    public boolean b;
    public java.lang.ref.WeakReference c;
    public final android.media.AudioAttributes d;
    public android.media.AudioFocusRequest e;
    public android.media.AudioManager.OnAudioFocusChangeListener f;

    public Q1(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f4907a = applicationContext;
        android.media.AudioAttributes build = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.d = build;
    }

    public final void a() {
        this.b = false;
        try {
            java.lang.Object systemService = this.f4907a.getSystemService("audio");
            android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
            if (audioManager != null) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    android.media.AudioFocusRequest audioFocusRequest = this.e;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        return;
                    }
                    return;
                }
                android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f;
                if (onAudioFocusChangeListener != null) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final android.media.AudioManager.OnAudioFocusChangeListener b() {
        return new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: com.inmobi.media.Q1$$ExternalSyntheticLambda0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                com.inmobi.media.Q1.a(com.inmobi.media.Q1.this, i);
            }
        };
    }

    public final android.media.AudioFocusRequest c() {
        android.media.AudioFocusRequest.Builder audioAttributes = new android.media.AudioFocusRequest.Builder(2).setAudioAttributes(this.d);
        android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNull(onAudioFocusChangeListener);
        kotlin.Lazy lazy = com.inmobi.media.AbstractC2740s6.f5441a;
        android.media.AudioFocusRequest build = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, ((com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue()).f5177a).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final void d() {
        java.lang.ref.WeakReference weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.c = null;
        a();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.e = null;
        }
        this.f = null;
    }

    public final boolean e() {
        int requestAudioFocus;
        try {
            java.lang.Object systemService = this.f4907a.getSystemService("audio");
            android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
            if (audioManager != null) {
                if (this.f == null) {
                    this.f = b();
                }
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    if (this.e == null) {
                        this.e = c();
                    }
                    android.media.AudioFocusRequest audioFocusRequest = this.e;
                    if (audioFocusRequest != null) {
                        requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                    }
                } else {
                    requestAudioFocus = audioManager.requestAudioFocus(this.f, 3, 2);
                }
                if (requestAudioFocus == 1) {
                    return true;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static final void a(com.inmobi.media.Q1 q1, int i) {
        com.inmobi.media.P1 p1;
        com.inmobi.media.P1 p12;
        java.lang.ref.WeakReference weakReference;
        com.inmobi.media.P1 p13;
        if (i == -2) {
            q1.b = true;
            java.lang.ref.WeakReference weakReference2 = q1.c;
            if (weakReference2 == null || (p1 = (com.inmobi.media.P1) weakReference2.get()) == null) {
                return;
            }
            p1.a();
            return;
        }
        if (i == -1) {
            q1.b = false;
            java.lang.ref.WeakReference weakReference3 = q1.c;
            if (weakReference3 == null || (p12 = (com.inmobi.media.P1) weakReference3.get()) == null) {
                return;
            }
            p12.a();
            return;
        }
        if (i != 1) {
            return;
        }
        if (q1.b && (weakReference = q1.c) != null && (p13 = (com.inmobi.media.P1) weakReference.get()) != null) {
            p13.b();
        }
        q1.b = false;
    }
}
