package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m3.InterfaceC2092b;
import m3.InterfaceC2093c;

/* renamed from: com.google.android.gms.internal.ads.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1414p6 extends P2.b {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f14969y = 1;

    public /* synthetic */ C1414p6(int i, Context context, Looper looper, InterfaceC2092b interfaceC2092b, InterfaceC2093c interfaceC2093c) {
        super(i, context, looper, interfaceC2092b, interfaceC2093c);
    }

    public boolean A() {
        j3.d[] i = i();
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue()) {
            j3.d dVar = J2.u.f2734a;
            int length = i != null ? i.length : 0;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (!m3.v.g(i[i5], dVar)) {
                    i5++;
                } else if (i5 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m3.AbstractC2095e
    public final IInterface o(IBinder iBinder) {
        switch (this.f14969y) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return queryLocalInterface instanceof C1503r6 ? (C1503r6) queryLocalInterface : new C1503r6(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 0);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return queryLocalInterface2 instanceof L9 ? (L9) queryLocalInterface2 : new L9(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 0);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return queryLocalInterface3 instanceof InterfaceC1115ic ? (InterfaceC1115ic) queryLocalInterface3 : new C1070hc(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 0);
        }
    }

    @Override // m3.AbstractC2095e
    public j3.d[] q() {
        switch (this.f14969y) {
            case 0:
                return J2.u.f2735b;
            default:
                return super.q();
        }
    }

    @Override // m3.AbstractC2095e
    public final String u() {
        switch (this.f14969y) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // m3.AbstractC2095e
    public final String v() {
        switch (this.f14969y) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1414p6(Context context, Looper looper, AbstractC1483qm abstractC1483qm, AbstractC1483qm abstractC1483qm2) {
        super(8, r0 == null ? context : r0, looper, abstractC1483qm, abstractC1483qm2);
        int i = AbstractC1697vc.f16009a;
        Context applicationContext = context.getApplicationContext();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1414p6(Context context, Looper looper, InterfaceC2092b interfaceC2092b, InterfaceC2093c interfaceC2093c) {
        super(123, r0 == null ? context : r0, looper, interfaceC2092b, interfaceC2093c);
        int i = AbstractC1697vc.f16009a;
        Context applicationContext = context.getApplicationContext();
    }
}
