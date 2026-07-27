package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3809j2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7172a;
    public boolean b;
    public WeakReference c;
    public final AudioAttributes d;
    public AudioFocusRequest e;
    public AudioManager.OnAudioFocusChangeListener f;

    public C3809j2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f7172a = applicationContext;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.d = build;
    }

    public final void a() {
        this.b = false;
        try {
            Object systemService = this.f7172a.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest = this.e;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        return;
                    }
                    return;
                }
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f;
                if (onAudioFocusChangeListener != null) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: com.inmobi.media.j2$$ExternalSyntheticLambda0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                C3809j2.a(C3809j2.this, i);
            }
        };
    }

    public final AudioFocusRequest c() {
        AudioFocusRequest.Builder audioAttributes = new AudioFocusRequest.Builder(2).setAudioAttributes(this.d);
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f;
        Intrinsics.checkNotNull(onAudioFocusChangeListener);
        Lazy lazy = P6.f6777a;
        AudioFocusRequest build = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, ((Wc) P6.e.getValue()).f6931a).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final void d() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.c = null;
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = null;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        AudioManager audioManager;
        int i;
        try {
            Object systemService = this.f7172a.getSystemService("audio");
            audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        } catch (Throwable unused) {
        }
        if (audioManager != null) {
            if (this.f == null) {
                this.f = b();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (this.e == null) {
                    this.e = c();
                }
                AudioFocusRequest audioFocusRequest = this.e;
                if (audioFocusRequest != null) {
                    i = audioManager.requestAudioFocus(audioFocusRequest);
                }
            } else {
                i = audioManager.requestAudioFocus(this.f, 3, 2);
            }
            return i != 1;
        }
        i = 0;
        if (i != 1) {
        }
    }

    public static final void a(C3809j2 c3809j2, int i) {
        InterfaceC3782i2 interfaceC3782i2;
        InterfaceC3782i2 interfaceC3782i22;
        WeakReference weakReference;
        InterfaceC3782i2 interfaceC3782i23;
        if (i == -2) {
            c3809j2.b = true;
            WeakReference weakReference2 = c3809j2.c;
            if (weakReference2 == null || (interfaceC3782i2 = (InterfaceC3782i2) weakReference2.get()) == null) {
                return;
            }
            interfaceC3782i2.a();
            return;
        }
        if (i == -1) {
            c3809j2.b = false;
            WeakReference weakReference3 = c3809j2.c;
            if (weakReference3 == null || (interfaceC3782i22 = (InterfaceC3782i2) weakReference3.get()) == null) {
                return;
            }
            interfaceC3782i22.a();
            return;
        }
        if (i != 1) {
            return;
        }
        if (c3809j2.b && (weakReference = c3809j2.c) != null && (interfaceC3782i23 = (InterfaceC3782i2) weakReference.get()) != null) {
            interfaceC3782i23.b();
        }
        c3809j2.b = false;
    }
}
