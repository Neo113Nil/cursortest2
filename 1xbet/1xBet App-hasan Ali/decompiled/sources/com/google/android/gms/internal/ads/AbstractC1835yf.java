package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1835yf implements InterfaceC1431pf {

    /* renamed from: b, reason: collision with root package name */
    public C0684Se f16441b;

    /* renamed from: c, reason: collision with root package name */
    public C0684Se f16442c;

    /* renamed from: d, reason: collision with root package name */
    public C0684Se f16443d;

    /* renamed from: e, reason: collision with root package name */
    public C0684Se f16444e;
    public ByteBuffer f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f16445g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16446h;

    public AbstractC1835yf() {
        ByteBuffer byteBuffer = InterfaceC1431pf.f15014a;
        this.f = byteBuffer;
        this.f16445g = byteBuffer;
        C0684Se c0684Se = C0684Se.f11554e;
        this.f16443d = c0684Se;
        this.f16444e = c0684Se;
        this.f16441b = c0684Se;
        this.f16442c = c0684Se;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final C0684Se a(C0684Se c0684Se) {
        this.f16443d = c0684Se;
        this.f16444e = e(c0684Se);
        return f() ? this.f16444e : C0684Se.f11554e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void c() {
        i();
        this.f = InterfaceC1431pf.f15014a;
        C0684Se c0684Se = C0684Se.f11554e;
        this.f16443d = c0684Se;
        this.f16444e = c0684Se;
        this.f16441b = c0684Se;
        this.f16442c = c0684Se;
        m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f16445g;
        this.f16445g = InterfaceC1431pf.f15014a;
        return byteBuffer;
    }

    public abstract C0684Se e(C0684Se c0684Se);

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public boolean f() {
        return this.f16444e != C0684Se.f11554e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public boolean g() {
        return this.f16446h && this.f16445g == InterfaceC1431pf.f15014a;
    }

    public final ByteBuffer h(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.f16445g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void i() {
        this.f16445g = InterfaceC1431pf.f15014a;
        this.f16446h = false;
        this.f16441b = this.f16443d;
        this.f16442c = this.f16444e;
        k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void j() {
        this.f16446h = true;
        l();
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }
}
