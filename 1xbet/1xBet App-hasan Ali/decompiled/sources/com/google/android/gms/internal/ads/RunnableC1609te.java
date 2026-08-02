package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1609te implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15690k = 2;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15691l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f15692m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f15693n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f15694o;

    public RunnableC1609te(AbstractC1744we abstractC1744we, String str, String str2, int i) {
        this.f15692m = str;
        this.f15693n = str2;
        this.f15691l = i;
        this.f15694o = abstractC1744we;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        Object obj = this.f15692m;
        Object obj2 = this.f15694o;
        int i5 = this.f15691l;
        Object obj3 = this.f15693n;
        switch (this.f15690k) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) obj);
                hashMap.put("cachedSrc", (String) obj3);
                hashMap.put("totalBytes", Integer.toString(i5));
                AbstractC1744we.j((AbstractC1744we) obj2, hashMap);
                return;
            case 1:
                ((C1028gf) obj).Q((View) obj3, (InterfaceC0758ad) obj2, i5 - 1);
                return;
            default:
                C0775au c0775au = (C0775au) obj3;
                A0.J0 j02 = (A0.J0) obj2;
                C0908du c0908du = (C0908du) obj;
                String str = c0908du.f13201b;
                try {
                    C0802bc c0802bc = c0908du.f13200a;
                    if (c0802bc == null) {
                        throw null;
                    }
                    Vt vt = (Vt) c0802bc.f12830t;
                    if (vt == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i5);
                    C0908du.b(c0775au.f12728a, new C0820bu(i, bundle));
                    C0908du.b(c0775au.f12729b, new C0820bu(5, bundle));
                    BinderC0864cu binderC0864cu = new BinderC0864cu(c0908du, j02);
                    Tt tt = (Tt) vt;
                    Parcel N5 = tt.N();
                    F5.c(N5, bundle);
                    F5.e(N5, binderC0864cu);
                    tt.h1(N5, 3);
                    return;
                } catch (RemoteException e3) {
                    C0908du.f13198c.b(e3, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i5), str);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC1609te(C1028gf c1028gf, View view, InterfaceC0758ad interfaceC0758ad, int i) {
        this.f15692m = c1028gf;
        this.f15693n = view;
        this.f15694o = interfaceC0758ad;
        this.f15691l = i;
    }

    public /* synthetic */ RunnableC1609te(C0908du c0908du, C0775au c0775au, int i, A0.J0 j02) {
        this.f15692m = c0908du;
        this.f15693n = c0775au;
        this.f15691l = i;
        this.f15694o = j02;
    }
}
