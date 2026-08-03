package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ec {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f4682a;
    public final com.inmobi.media.InterfaceC2772t9 b;
    public com.inmobi.media.C2668pc c;
    public com.inmobi.media.C2484ic d;
    public com.inmobi.media.C2484ic e;
    public com.inmobi.media.C2484ic f;

    public Ec(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        this.f4682a = gestureDetectorOnGestureListenerC2675pi;
        this.b = interfaceC2772t9;
    }

    public static final boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return false;
        }
        android.media.AudioManager audioManager = null;
        try {
            java.lang.Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof android.media.AudioManager)) {
                systemService = null;
            }
            audioManager = (android.media.AudioManager) systemService;
        } catch (java.lang.Throwable unused) {
        }
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(java.lang.String url, android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("MraidMediaProcessor", "doPlayMedia");
        }
        com.inmobi.media.C2668pc c2668pc = new com.inmobi.media.C2668pc(activity, this.b);
        this.c = c2668pc;
        c2668pc.setPlaybackData(url);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        com.inmobi.media.C2668pc c2668pc2 = this.c;
        if (c2668pc2 != null) {
            c2668pc2.setLayoutParams(layoutParams);
        }
        com.inmobi.media.C2695qc c2695qc = new com.inmobi.media.C2695qc(activity);
        c2695qc.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.media.Ec$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.media.Ec.a(view, motionEvent);
            }
        });
        c2695qc.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        c2695qc.addView(this.c);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c2695qc, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.inmobi.media.C2668pc c2668pc3 = this.c;
        if (c2668pc3 != null) {
            c2668pc3.setViewContainer(c2695qc);
        }
        com.inmobi.media.C2668pc c2668pc4 = this.c;
        if (c2668pc4 != null) {
            c2668pc4.requestFocus();
        }
        com.inmobi.media.C2668pc c2668pc5 = this.c;
        if (c2668pc5 != null) {
            c2668pc5.setOnKeyListener(new android.view.View.OnKeyListener() { // from class: com.inmobi.media.Ec$$ExternalSyntheticLambda1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
                    return com.inmobi.media.Ec.a(com.inmobi.media.Ec.this, view, i, keyEvent);
                }
            });
        }
        com.inmobi.media.C2668pc c2668pc6 = this.c;
        if (c2668pc6 != null) {
            c2668pc6.setListener(new com.inmobi.media.Dc(this));
        }
        com.inmobi.media.C2668pc c2668pc7 = this.c;
        if (c2668pc7 != null) {
            c2668pc7.a();
        }
    }

    public static final boolean a(com.inmobi.media.Ec ec, android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (4 != i || keyEvent.getAction() != 0) {
            return false;
        }
        com.inmobi.media.C2668pc c2668pc = ec.c;
        if (c2668pc == null) {
            return true;
        }
        c2668pc.b();
        return true;
    }

    public final int a() {
        com.inmobi.media.core.config.models.AdConfig.RenderingConfig renderingConfig;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("MraidMediaProcessor", com.ironsource.X3.j.P);
        }
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return -1;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4682a;
        if (gestureDetectorOnGestureListenerC2675pi != null && (renderingConfig = gestureDetectorOnGestureListenerC2675pi.getRenderingConfig()) != null && renderingConfig.getEnablePubMuteControl() && com.inmobi.media.Xi.f) {
            return 0;
        }
        android.media.AudioManager audioManager = null;
        try {
            java.lang.Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof android.media.AudioManager)) {
                systemService = null;
            }
            audioManager = (android.media.AudioManager) systemService;
        } catch (java.lang.Throwable unused) {
        }
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void b(java.lang.String str, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4682a;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    public final void a(java.lang.String str, boolean z) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4682a;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    public final void a(java.lang.String str, int i) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f4682a;
        if (gestureDetectorOnGestureListenerC2675pi != null) {
            gestureDetectorOnGestureListenerC2675pi.a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
