package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes.dex */
public final class BH extends HandlerThread implements Handler.Callback {

    /* renamed from: k, reason: collision with root package name */
    public Mi f7808k;

    /* renamed from: l, reason: collision with root package name */
    public Handler f7809l;

    /* renamed from: m, reason: collision with root package name */
    public Error f7810m;

    /* renamed from: n, reason: collision with root package name */
    public RuntimeException f7811n;

    /* renamed from: o, reason: collision with root package name */
    public CH f7812o;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Mi mi;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        int i5 = message.arg1;
                        Mi mi2 = this.f7808k;
                        if (mi2 == null) {
                            throw null;
                        }
                        mi2.a(i5);
                        SurfaceTexture surfaceTexture = this.f7808k.f10695p;
                        surfaceTexture.getClass();
                        this.f7812o = new CH(this, surfaceTexture, i5 != 0);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (Yi e3) {
                        JB.g("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                        this.f7811n = new IllegalStateException(e3);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e5) {
                    JB.g("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                    this.f7810m = e5;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e6) {
                    JB.g("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f7811n = e6;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    mi = this.f7808k;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (mi == null) {
                    throw null;
                }
                mi.b();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
