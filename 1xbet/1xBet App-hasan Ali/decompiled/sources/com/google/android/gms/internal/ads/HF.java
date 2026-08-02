package com.google.android.gms.internal.ads;

import I.C0160m;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class HF extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f9344b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f9345c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f9349h;
    public MediaFormat i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f9350j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f9351k;

    /* renamed from: l, reason: collision with root package name */
    public long f9352l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9353m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f9354n;

    /* renamed from: o, reason: collision with root package name */
    public Qs f9355o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9343a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C0160m f9346d = new C0160m();

    /* renamed from: e, reason: collision with root package name */
    public final C0160m f9347e = new C0160m();
    public final ArrayDeque f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f9348g = new ArrayDeque();

    public HF(HandlerThread handlerThread) {
        this.f9344b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f9348g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        C0160m c0160m = this.f9346d;
        c0160m.f2499c = c0160m.f2498b;
        C0160m c0160m2 = this.f9347e;
        c0160m2.f2499c = c0160m2.f2498b;
        this.f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f9343a) {
            this.f9351k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f9343a) {
            this.f9350j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C1152jE c1152jE;
        synchronized (this.f9343a) {
            try {
                this.f9346d.a(i);
                Qs qs = this.f9355o;
                if (qs != null && (c1152jE = ((RF) qs.f11279l).f11365N) != null) {
                    c1152jE.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f9343a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f9347e.a(-2);
                    this.f9348g.add(mediaFormat);
                    this.i = null;
                }
                this.f9347e.a(i);
                this.f.add(bufferInfo);
                Qs qs = this.f9355o;
                if (qs != null) {
                    C1152jE c1152jE = ((RF) qs.f11279l).f11365N;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f9343a) {
            this.f9347e.a(-2);
            this.f9348g.add(mediaFormat);
            this.i = null;
        }
    }
}
