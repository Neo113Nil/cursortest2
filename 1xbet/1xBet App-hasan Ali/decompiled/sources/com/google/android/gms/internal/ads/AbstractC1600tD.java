package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.tD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1600tD implements P3 {

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC1400ot f15643r = AbstractC1400ot.y(AbstractC1600tD.class);

    /* renamed from: k, reason: collision with root package name */
    public final String f15644k;

    /* renamed from: n, reason: collision with root package name */
    public ByteBuffer f15647n;

    /* renamed from: o, reason: collision with root package name */
    public long f15648o;

    /* renamed from: q, reason: collision with root package name */
    public C1205ke f15650q;

    /* renamed from: p, reason: collision with root package name */
    public long f15649p = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15646m = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15645l = true;

    public AbstractC1600tD(String str) {
        this.f15644k = str;
    }

    public final synchronized void a() {
        try {
            if (this.f15646m) {
                return;
            }
            try {
                AbstractC1400ot abstractC1400ot = f15643r;
                String str = this.f15644k;
                abstractC1400ot.k(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                C1205ke c1205ke = this.f15650q;
                long j5 = this.f15648o;
                long j6 = this.f15649p;
                ByteBuffer byteBuffer = c1205ke.f14251k;
                int position = byteBuffer.position();
                byteBuffer.position((int) j5);
                ByteBuffer slice = byteBuffer.slice();
                slice.limit((int) j6);
                byteBuffer.position(position);
                this.f15647n = slice;
                this.f15646m = true;
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.P3
    public final void b(C1205ke c1205ke, ByteBuffer byteBuffer, long j5, N3 n32) {
        this.f15648o = c1205ke.d();
        byteBuffer.remaining();
        this.f15649p = j5;
        this.f15650q = c1205ke;
        c1205ke.f14251k.position((int) (c1205ke.d() + j5));
        this.f15646m = false;
        this.f15645l = false;
        d();
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            a();
            AbstractC1400ot abstractC1400ot = f15643r;
            String str = this.f15644k;
            abstractC1400ot.k(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f15647n;
            if (byteBuffer != null) {
                this.f15645l = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f15647n = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
