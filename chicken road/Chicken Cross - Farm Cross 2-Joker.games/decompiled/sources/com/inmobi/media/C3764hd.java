package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.hd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3764hd extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Y9 f7141a;
    public C3708fd b;
    public ViewGroup c;
    public InterfaceC3736gd d;
    public boolean e;
    public final WeakReference f;
    public int g;
    public String h;
    public String i;
    public int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3764hd(Activity activity, Y9 y9) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7141a = y9;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.g = 100;
        this.j = -1;
        this.k = 0;
        this.f = new WeakReference(activity);
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(this, "lifecycleCallbacks");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public static final void a(C3764hd c3764hd, MediaPlayer mediaPlayer, int i, int i2) {
        Y9 y9 = c3764hd.f7141a;
        if (y9 != null) {
            ((Z9) y9).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (c3764hd.b == null) {
            C3708fd c3708fd = new C3708fd(c3764hd.getContext());
            c3764hd.b = c3708fd;
            c3708fd.setAnchorView(c3764hd);
            c3764hd.setMediaController(c3764hd.b);
            c3764hd.requestLayout();
            c3764hd.requestFocus();
        }
    }

    public final void b() {
        Y9 y9 = this.f7141a;
        if (y9 != null) {
            ((Z9) y9).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.c = null;
        }
        setMediaController(null);
        this.b = null;
        InterfaceC3736gd interfaceC3736gd = this.d;
        if (interfaceC3736gd != null) {
            Intrinsics.checkNotNullParameter(this, "mp");
            Y9 y92 = ((C4160vd) interfaceC3736gd).f7436a.b;
            if (y92 != null) {
                ((Z9) y92).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
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
    public final String getId() {
        return this.h;
    }

    public final InterfaceC3736gd getListener() {
        return this.d;
    }

    public final int getMCurrentPosition() {
        return this.k;
    }

    public final String getPlaybackUrl() {
        return this.i;
    }

    public final int getPreviousPosition() {
        return this.j;
    }

    public final ViewGroup getViewContainer() {
        return this.c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f.get() == null || !Intrinsics.areEqual(this.f.get(), activity)) {
            return;
        }
        this.e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity activity2 = (Activity) this.f.get();
        if (activity2 == null || !Intrinsics.areEqual(activity2, activity)) {
            return;
        }
        this.e = true;
        if (getCurrentPosition() != 0) {
            this.k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        Y9 y9 = this.f7141a;
        if (y9 != null) {
            ((Z9) y9).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp, int i, int i2) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        Y9 y9 = this.f7141a;
        if (y9 != null) {
            ((Z9) y9).b("MediaRenderView", ">>> onError (" + i + ", " + i2 + ")");
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
    public final void onPrepared(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        Y9 y9 = this.f7141a;
        if (y9 != null) {
            ((Z9) y9).a("MediaRenderView", ">>> onPrepared");
        }
        mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.hd$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                C3764hd.a(C3764hd.this, mediaPlayer, i, i2);
            }
        });
        int i = this.k;
        if (i < getDuration()) {
            this.k = i;
            seekTo(i);
        }
        InterfaceC3736gd interfaceC3736gd = this.d;
        if (interfaceC3736gd != null) {
            Intrinsics.checkNotNullParameter(this, "mp");
            Y9 y92 = ((C4160vd) interfaceC3736gd).f7436a.b;
            if (y92 != null) {
                ((Z9) y92).a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        Context context;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onVisibilityChanged(view, i);
        Y9 y9 = this.f7141a;
        if (y9 != null) {
            ((Z9) y9).a("MediaRenderView", ">>> onVisibilityChanged (" + i + ")");
        }
        if (i != 0 || (context = AbstractC3914mk.f7252a) == null) {
            return;
        }
        setBackground(new BitmapDrawable(context.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        Y9 y9 = this.f7141a;
        if (y9 != null) {
            ((Z9) y9).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i + ")");
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        Y9 y9 = this.f7141a;
        if (y9 != null) {
            ((Z9) y9).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setAudioMuted(boolean z) {
    }

    public final void setCurrentAudioVolume(int i) {
        this.g = i;
    }

    public final void setId(String str) {
        this.h = str;
    }

    public final void setListener(InterfaceC3736gd interfaceC3736gd) {
        this.d = interfaceC3736gd;
    }

    public final void setMCurrentPosition(int i) {
        this.k = i;
    }

    public final void setPlaybackUrl(String str) {
        this.i = str;
    }

    public final void setPlayerPrepared(boolean z) {
    }

    public final void setPreviousPosition(int i) {
        this.j = i;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.e) {
            return;
        }
        Y9 y9 = this.f7141a;
        if (y9 != null) {
            ((Z9) y9).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void setPlaybackData(String url) {
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            if (((byte) (b & Byte.MIN_VALUE)) > 0) {
                StringBuilder append = sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
                append.append(new String(new char[]{cArr[(b >> 4) & 15], cArr[(byte) (b & Ascii.SI)]}));
            } else {
                sb.append((char) b);
            }
        }
        try {
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            byte[] bytes2 = sb2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            str = new String(bytes2, Charsets.ISO_8859_1);
        } catch (UnsupportedEncodingException unused) {
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
            C3708fd c3708fd = new C3708fd(getContext());
            this.b = c3708fd;
            c3708fd.setAnchorView(this);
            setMediaController(this.b);
        }
    }
}
