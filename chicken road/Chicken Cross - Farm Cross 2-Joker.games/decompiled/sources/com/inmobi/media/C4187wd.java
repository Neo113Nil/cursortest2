package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4187wd {

    /* renamed from: a, reason: collision with root package name */
    public final Ej f7458a;
    public final Y9 b;
    public C3764hd c;
    public C3567ad d;
    public C3567ad e;
    public C3567ad f;

    public C4187wd(Ej ej, Y9 y9) {
        this.f7458a = ej;
        this.b = y9;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return false;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(Activity activity, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C3764hd c3764hd = new C3764hd(activity, this.b);
        this.c = c3764hd;
        c3764hd.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C3764hd c3764hd2 = this.c;
        if (c3764hd2 != null) {
            c3764hd2.setLayoutParams(layoutParams);
        }
        C3793id c3793id = new C3793id(activity);
        c3793id.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.wd$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4187wd.a(view, motionEvent);
            }
        });
        c3793id.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        c3793id.addView(this.c);
        Y9 y92 = this.b;
        if (y92 != null) {
            ((Z9) y92).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c3793id, new ViewGroup.LayoutParams(-1, -1));
        C3764hd c3764hd3 = this.c;
        if (c3764hd3 != null) {
            c3764hd3.setViewContainer(c3793id);
        }
        C3764hd c3764hd4 = this.c;
        if (c3764hd4 != null) {
            c3764hd4.requestFocus();
        }
        C3764hd c3764hd5 = this.c;
        if (c3764hd5 != null) {
            c3764hd5.setOnKeyListener(new View.OnKeyListener() { // from class: com.inmobi.media.wd$$ExternalSyntheticLambda1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return C4187wd.a(C4187wd.this, view, i, keyEvent);
                }
            });
        }
        C3764hd c3764hd6 = this.c;
        if (c3764hd6 != null) {
            c3764hd6.setListener(new C4160vd(this));
        }
        C3764hd c3764hd7 = this.c;
        if (c3764hd7 != null) {
            c3764hd7.a();
        }
    }

    public static final boolean a(C4187wd c4187wd, View view, int i, KeyEvent keyEvent) {
        if (4 != i || keyEvent.getAction() != 0) {
            return false;
        }
        C3764hd c3764hd = c4187wd.c;
        if (c3764hd == null) {
            return true;
        }
        c3764hd.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", U3.j.P);
        }
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return -1;
        }
        Ej ej = this.f7458a;
        if (((ej == null || (renderingConfig = ej.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && AbstractC3914mk.g) {
            return 0;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void b(String str, boolean z) {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        Ej ej = this.f7458a;
        if (ej != null) {
            ej.a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    public final void a(String str, boolean z) {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        Ej ej = this.f7458a;
        if (ej != null) {
            ej.a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    public final void a(String str, int i) {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        Ej ej = this.f7458a;
        if (ej != null) {
            ej.a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
