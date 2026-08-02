package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.xv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1806xv extends IOException {

    /* renamed from: k, reason: collision with root package name */
    public final int f16348k;

    public C1806xv() {
        this.f16348k = 2008;
    }

    public C1806xv(String str, int i) {
        super(str);
        this.f16348k = i;
    }

    public C1806xv(String str, Exception exc, int i) {
        super(str, exc);
        this.f16348k = i;
    }

    public C1806xv(int i, Exception exc) {
        super(exc);
        this.f16348k = i;
    }
}
