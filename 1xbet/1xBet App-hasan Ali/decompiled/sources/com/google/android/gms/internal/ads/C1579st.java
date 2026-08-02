package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m3.InterfaceC2092b;
import m3.InterfaceC2093c;

/* renamed from: com.google.android.gms.internal.ads.st, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579st extends P2.b {

    /* renamed from: y, reason: collision with root package name */
    public final int f15610y;

    public C1579st(int i, Context context, Looper looper, InterfaceC2092b interfaceC2092b, InterfaceC2093c interfaceC2093c) {
        super(116, context, looper, interfaceC2092b, interfaceC2093c);
        this.f15610y = i;
    }

    @Override // m3.AbstractC2095e, k3.InterfaceC2035c
    public final int g() {
        return this.f15610y;
    }

    @Override // m3.AbstractC2095e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof C1714vt ? (C1714vt) queryLocalInterface : new C1714vt(iBinder, "com.google.android.gms.gass.internal.IGassService", 0);
    }

    @Override // m3.AbstractC2095e
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // m3.AbstractC2095e
    public final String v() {
        return "com.google.android.gms.gass.START";
    }
}
