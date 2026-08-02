package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class FB implements InterfaceC1402ov {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1402ov f8941k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f8942l = Uri.EMPTY;

    public FB(InterfaceC1402ov interfaceC1402ov) {
        this.f8941k = interfaceC1402ov;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        InterfaceC1402ov interfaceC1402ov = this.f8941k;
        this.f8942l = ww.f12125a;
        Map map = Collections.EMPTY_MAP;
        try {
            long a5 = interfaceC1402ov.a(ww);
            Uri i = interfaceC1402ov.i();
            if (i != null) {
                this.f8942l = i;
            }
            interfaceC1402ov.b();
            return a5;
        } catch (Throwable th) {
            Uri i5 = interfaceC1402ov.i();
            if (i5 != null) {
                this.f8942l = i5;
            }
            interfaceC1402ov.b();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Map b() {
        return this.f8941k.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void d(RB rb) {
        rb.getClass();
        this.f8941k.d(rb);
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        return this.f8941k.e(bArr, i, i5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f8941k.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        this.f8941k.j();
    }
}
