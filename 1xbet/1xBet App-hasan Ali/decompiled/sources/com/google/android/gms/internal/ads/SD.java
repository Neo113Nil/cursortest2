package com.google.android.gms.internal.ads;

import java.util.Locale;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class SD {

    /* renamed from: a, reason: collision with root package name */
    public int f11511a;

    /* renamed from: b, reason: collision with root package name */
    public int f11512b;

    /* renamed from: c, reason: collision with root package name */
    public int f11513c;

    /* renamed from: d, reason: collision with root package name */
    public int f11514d;

    /* renamed from: e, reason: collision with root package name */
    public int f11515e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f11516g;

    /* renamed from: h, reason: collision with root package name */
    public int f11517h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f11518j;

    /* renamed from: k, reason: collision with root package name */
    public long f11519k;

    /* renamed from: l, reason: collision with root package name */
    public int f11520l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i = this.f11511a;
        int i5 = this.f11512b;
        int i6 = this.f11513c;
        int i7 = this.f11514d;
        int i8 = this.f11515e;
        int i9 = this.f;
        int i10 = this.f11516g;
        int i11 = this.f11517h;
        int i12 = this.i;
        int i13 = this.f11518j;
        long j5 = this.f11519k;
        int i14 = this.f11520l;
        Locale locale = Locale.US;
        StringBuilder w5 = AbstractC2107A.w("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i5, "\n queuedInputBuffers=");
        w5.append(i6);
        w5.append("\n skippedInputBuffers=");
        w5.append(i7);
        w5.append("\n renderedOutputBuffers=");
        w5.append(i8);
        w5.append("\n skippedOutputBuffers=");
        w5.append(i9);
        w5.append("\n droppedBuffers=");
        w5.append(i10);
        w5.append("\n droppedInputBuffers=");
        w5.append(i11);
        w5.append("\n maxConsecutiveDroppedBuffers=");
        w5.append(i12);
        w5.append("\n droppedToKeyframeEvents=");
        w5.append(i13);
        w5.append("\n totalVideoFrameProcessingOffsetUs=");
        w5.append(j5);
        w5.append("\n videoFrameProcessingOffsetCount=");
        w5.append(i14);
        w5.append("\n}");
        return w5.toString();
    }
}
