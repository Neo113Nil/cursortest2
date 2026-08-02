package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.Sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685Sf implements InterfaceC1431pf {

    /* renamed from: b, reason: collision with root package name */
    public int f11559b;

    /* renamed from: c, reason: collision with root package name */
    public float f11560c;

    /* renamed from: d, reason: collision with root package name */
    public float f11561d;

    /* renamed from: e, reason: collision with root package name */
    public C0684Se f11562e;
    public C0684Se f;

    /* renamed from: g, reason: collision with root package name */
    public C0684Se f11563g;

    /* renamed from: h, reason: collision with root package name */
    public C0684Se f11564h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public C0615If f11565j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f11566k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f11567l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f11568m;

    /* renamed from: n, reason: collision with root package name */
    public long f11569n;

    /* renamed from: o, reason: collision with root package name */
    public long f11570o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11571p;

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final C0684Se a(C0684Se c0684Se) {
        if (c0684Se.f11557c != 2) {
            throw new C0938ef(c0684Se);
        }
        int i = this.f11559b;
        if (i == -1) {
            i = c0684Se.f11555a;
        }
        this.f11562e = c0684Se;
        C0684Se c0684Se2 = new C0684Se(i, c0684Se.f11556b, 2);
        this.f = c0684Se2;
        this.i = true;
        return c0684Se2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C0615If c0615If = this.f11565j;
            c0615If.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f11569n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = c0615If.f9568b;
            int i5 = remaining2 / i;
            int i6 = i5 * i;
            short[] f = c0615If.f(c0615If.f9574j, c0615If.f9575k, i5);
            c0615If.f9574j = f;
            asShortBuffer.get(f, c0615If.f9575k * i, (i6 + i6) / 2);
            c0615If.f9575k += i5;
            c0615If.e();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void c() {
        this.f11560c = 1.0f;
        this.f11561d = 1.0f;
        C0684Se c0684Se = C0684Se.f11554e;
        this.f11562e = c0684Se;
        this.f = c0684Se;
        this.f11563g = c0684Se;
        this.f11564h = c0684Se;
        ByteBuffer byteBuffer = InterfaceC1431pf.f15014a;
        this.f11566k = byteBuffer;
        this.f11567l = byteBuffer.asShortBuffer();
        this.f11568m = byteBuffer;
        this.f11559b = -1;
        this.i = false;
        this.f11565j = null;
        this.f11569n = 0L;
        this.f11570o = 0L;
        this.f11571p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final ByteBuffer d() {
        C0615If c0615If = this.f11565j;
        if (c0615If != null) {
            int i = c0615If.f9577m;
            int i5 = c0615If.f9568b;
            int i6 = i * i5;
            int i7 = i6 + i6;
            if (i7 > 0) {
                if (this.f11566k.capacity() < i7) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
                    this.f11566k = order;
                    this.f11567l = order.asShortBuffer();
                } else {
                    this.f11566k.clear();
                    this.f11567l.clear();
                }
                ShortBuffer shortBuffer = this.f11567l;
                int min = Math.min(shortBuffer.remaining() / i5, c0615If.f9577m);
                int i8 = min * i5;
                shortBuffer.put(c0615If.f9576l, 0, i8);
                int i9 = c0615If.f9577m - min;
                c0615If.f9577m = i9;
                short[] sArr = c0615If.f9576l;
                System.arraycopy(sArr, i8, sArr, 0, i9 * i5);
                this.f11570o += i7;
                this.f11566k.limit(i7);
                this.f11568m = this.f11566k;
            }
        }
        ByteBuffer byteBuffer = this.f11568m;
        this.f11568m = InterfaceC1431pf.f15014a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final boolean f() {
        if (this.f.f11555a != -1) {
            return Math.abs(this.f11560c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f11561d + (-1.0f)) >= 1.0E-4f || this.f.f11555a != this.f11562e.f11555a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final boolean g() {
        if (!this.f11571p) {
            return false;
        }
        C0615If c0615If = this.f11565j;
        if (c0615If == null) {
            return true;
        }
        int i = c0615If.f9577m * c0615If.f9568b;
        return i + i == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void i() {
        if (f()) {
            C0684Se c0684Se = this.f11562e;
            this.f11563g = c0684Se;
            C0684Se c0684Se2 = this.f;
            this.f11564h = c0684Se2;
            if (this.i) {
                int i = c0684Se.f11555a;
                this.f11565j = new C0615If(this.f11560c, this.f11561d, i, c0684Se.f11556b, c0684Se2.f11555a);
            } else {
                C0615If c0615If = this.f11565j;
                if (c0615If != null) {
                    c0615If.f9575k = 0;
                    c0615If.f9577m = 0;
                    c0615If.f9579o = 0;
                    c0615If.f9580p = 0;
                    c0615If.f9581q = 0;
                    c0615If.f9582r = 0;
                    c0615If.f9583s = 0;
                    c0615If.f9584t = 0;
                    c0615If.f9585u = 0;
                    c0615If.f9586v = 0;
                    c0615If.f9587w = 0.0d;
                }
            }
        }
        this.f11568m = InterfaceC1431pf.f15014a;
        this.f11569n = 0L;
        this.f11570o = 0L;
        this.f11571p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void j() {
        C0615If c0615If = this.f11565j;
        if (c0615If != null) {
            int i = c0615If.f9575k;
            int i5 = c0615If.f9582r;
            int i6 = c0615If.f9577m;
            float f = c0615If.f9569c;
            float f5 = c0615If.f9570d;
            int i7 = i6 + ((int) (((((((i - i5) / (f / f5)) + i5) + c0615If.f9587w) + c0615If.f9579o) / (c0615If.f9571e * f5)) + 0.5d));
            c0615If.f9587w = 0.0d;
            int i8 = c0615If.f9573h;
            int i9 = i8 + i8;
            c0615If.f9574j = c0615If.f(c0615If.f9574j, i, i9 + i);
            int i10 = 0;
            while (true) {
                int i11 = c0615If.f9568b;
                if (i10 >= i9 * i11) {
                    break;
                }
                c0615If.f9574j[(i11 * i) + i10] = 0;
                i10++;
            }
            c0615If.f9575k += i9;
            c0615If.e();
            if (c0615If.f9577m > i7) {
                c0615If.f9577m = i7;
            }
            c0615If.f9575k = 0;
            c0615If.f9582r = 0;
            c0615If.f9579o = 0;
        }
        this.f11571p = true;
    }
}
