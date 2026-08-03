package com.inmobi.media;

/* renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2668pc extends android.widget.VideoView implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnErrorListener, android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.InterfaceC2772t9 f5389a;
    public com.inmobi.media.C2616nc b;
    public android.view.ViewGroup c;
    public com.inmobi.media.InterfaceC2642oc d;
    public boolean e;
    public final java.lang.ref.WeakReference f;
    public int g;
    public java.lang.String h;
    public java.lang.String i;
    public int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2668pc(android.app.Activity activity, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f5389a = interfaceC2772t9;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.g = 100;
        this.j = -1;
        this.k = 0;
        this.f = new java.lang.ref.WeakReference(activity);
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "lifecycleCallbacks");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public static final void a(com.inmobi.media.C2668pc c2668pc, android.media.MediaPlayer mediaPlayer, int i, int i2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2668pc.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (c2668pc.b == null) {
            com.inmobi.media.C2616nc c2616nc = new com.inmobi.media.C2616nc(c2668pc.getContext());
            c2668pc.b = c2616nc;
            c2616nc.setAnchorView(c2668pc);
            c2668pc.setMediaController(c2668pc.b);
            c2668pc.requestLayout();
            c2668pc.requestFocus();
        }
    }

    public final void b() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        android.view.ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            android.view.ViewParent parent = viewGroup.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.c);
            }
            android.view.ViewParent parent2 = getParent();
            android.view.ViewGroup viewGroup3 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.c = null;
        }
        setMediaController(null);
        this.b = null;
        com.inmobi.media.InterfaceC2642oc interfaceC2642oc = this.d;
        if (interfaceC2642oc != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "mp");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = ((com.inmobi.media.Dc) interfaceC2642oc).f4660a.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            android.view.ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                android.view.ViewParent parent3 = viewContainer.getParent();
                android.view.ViewGroup viewGroup4 = parent3 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.g;
    }

    @Override // android.view.View
    public final java.lang.String getId() {
        return this.h;
    }

    public final com.inmobi.media.InterfaceC2642oc getListener() {
        return this.d;
    }

    public final int getMCurrentPosition() {
        return this.k;
    }

    public final java.lang.String getPlaybackUrl() {
        return this.i;
    }

    public final int getPreviousPosition() {
        return this.j;
    }

    public final android.view.ViewGroup getViewContainer() {
        return this.c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f.get() == null || !kotlin.jvm.internal.Intrinsics.areEqual(this.f.get(), activity)) {
            return;
        }
        this.e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.app.Activity activity2 = (android.app.Activity) this.f.get();
        if (activity2 == null || !kotlin.jvm.internal.Intrinsics.areEqual(activity2, activity)) {
            return;
        }
        this.e = true;
        if (getCurrentPosition() != 0) {
            this.k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mp, "mp");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mp, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mp, "mp");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("MediaRenderView", ">>> onError (" + i + ", " + i2 + ")");
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mp, "mp");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MediaRenderView", ">>> onPrepared");
        }
        mp.setOnVideoSizeChangedListener(new android.media.MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.pc$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                com.inmobi.media.C2668pc.a(com.inmobi.media.C2668pc.this, mediaPlayer, i, i2);
            }
        });
        int i = this.k;
        if (i < getDuration()) {
            this.k = i;
            seekTo(i);
        }
        com.inmobi.media.InterfaceC2642oc interfaceC2642oc = this.d;
        if (interfaceC2642oc != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "mp");
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = ((com.inmobi.media.Dc) interfaceC2642oc).f4660a.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        android.content.Context context;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onVisibilityChanged(view, i);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MediaRenderView", ">>> onVisibilityChanged (" + i + ")");
        }
        if (i != 0 || (context = com.inmobi.media.Xi.f5051a) == null) {
            return;
        }
        setBackground(new android.graphics.drawable.BitmapDrawable(context.getResources(), (android.graphics.Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i + ")");
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setAudioMuted(boolean z) {
    }

    public final void setCurrentAudioVolume(int i) {
        this.g = i;
    }

    public final void setId(java.lang.String str) {
        this.h = str;
    }

    public final void setListener(com.inmobi.media.InterfaceC2642oc interfaceC2642oc) {
        this.d = interfaceC2642oc;
    }

    public final void setMCurrentPosition(int i) {
        this.k = i;
    }

    public final void setPlaybackUrl(java.lang.String str) {
        this.i = str;
    }

    public final void setPlayerPrepared(boolean z) {
    }

    public final void setPreviousPosition(int i) {
        this.j = i;
    }

    public final void setViewContainer(android.view.ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.e) {
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5389a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void setPlaybackData(java.lang.String url) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bytes) {
            if (((byte) (b & Byte.MIN_VALUE)) > 0) {
                sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
                sb.append(new java.lang.String(new char[]{cArr[(b >> 4) & 15], cArr[(byte) (b & com.google.common.base.Ascii.SI)]}));
            } else {
                sb.append((char) b);
            }
        }
        try {
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            byte[] bytes2 = sb2.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            str = new java.lang.String(bytes2, kotlin.text.Charsets.ISO_8859_1);
        } catch (java.io.UnsupportedEncodingException unused) {
            str = "";
        }
        this.i = str;
        this.h = "anonymous";
    }

    public final void a() {
        setVideoPath(this.i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.b == null) {
            com.inmobi.media.C2616nc c2616nc = new com.inmobi.media.C2616nc(getContext());
            this.b = c2616nc;
            c2616nc.setAnchorView(this);
            setMediaController(this.b);
        }
    }
}
