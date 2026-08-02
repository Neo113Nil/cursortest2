package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import r.C2327e;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Ck extends E5 implements U8 {

    /* renamed from: k, reason: collision with root package name */
    public final Context f8075k;

    /* renamed from: l, reason: collision with root package name */
    public final Gj f8076l;

    /* renamed from: m, reason: collision with root package name */
    public Pj f8077m;

    /* renamed from: n, reason: collision with root package name */
    public Cj f8078n;

    public Ck(Context context, Gj gj, Pj pj, Cj cj) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f8075k = context;
        this.f8076l = gj;
        this.f8077m = pj;
        this.f8078n = cj;
    }

    @Override // com.google.android.gms.internal.ads.U8
    public final boolean O(InterfaceC2360a interfaceC2360a) {
        Pj pj;
        Object t12 = BinderC2361b.t1(interfaceC2360a);
        if (!(t12 instanceof ViewGroup) || (pj = this.f8077m) == null || !pj.c((ViewGroup) t12, false)) {
            return false;
        }
        this.f8076l.P().a0(new U4(18, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.U8
    public final boolean T(InterfaceC2360a interfaceC2360a) {
        Pj pj;
        Object t12 = BinderC2361b.t1(interfaceC2360a);
        if (!(t12 instanceof ViewGroup) || (pj = this.f8077m) == null || !pj.c((ViewGroup) t12, true)) {
            return false;
        }
        this.f8076l.R().a0(new U4(18, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.U8
    public final String e() {
        return this.f8076l.a();
    }

    @Override // com.google.android.gms.internal.ads.U8
    public final InterfaceC2360a g() {
        return new BinderC2361b(this.f8075k);
    }

    public final void n() {
        Cj cj = this.f8078n;
        if (cj != null) {
            synchronized (cj) {
                if (cj.f8071w) {
                    return;
                }
                cj.f8060l.A();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        String str;
        List<String> arrayList;
        Cj cj;
        G8 g8 = null;
        int i5 = 0;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                F5.b(parcel);
                String str2 = (String) this.f8076l.I().get(readString);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String readString2 = parcel.readString();
                F5.b(parcel);
                I8 i8 = (I8) this.f8076l.H().get(readString2);
                parcel2.writeNoException();
                F5.e(parcel2, i8);
                return true;
            case 3:
                Gj gj = this.f8076l;
                try {
                    r.Q H5 = gj.H();
                    r.Q I5 = gj.I();
                    String[] strArr = new String[H5.f18961m + I5.f18961m];
                    int i6 = 0;
                    for (int i7 = 0; i7 < H5.f18961m; i7++) {
                        strArr[i6] = (String) H5.f(i7);
                        i6++;
                    }
                    while (i5 < I5.f18961m) {
                        strArr[i6] = (String) I5.f(i5);
                        i6++;
                        i5++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e3) {
                    P2.o.f4767B.f4774g.i("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e3);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String a5 = this.f8076l.a();
                parcel2.writeNoException();
                parcel2.writeString(a5);
                return true;
            case 5:
                String readString3 = parcel.readString();
                F5.b(parcel);
                Cj cj2 = this.f8078n;
                if (cj2 != null) {
                    cj2.e(readString3);
                }
                parcel2.writeNoException();
                return true;
            case 6:
                n();
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC0391w0 J = this.f8076l.J();
                parcel2.writeNoException();
                F5.e(parcel2, J);
                return true;
            case 8:
                Cj cj3 = this.f8078n;
                if (cj3 != null) {
                    cj3.x();
                }
                this.f8078n = null;
                this.f8077m = null;
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC2360a g5 = g();
                parcel2.writeNoException();
                F5.e(parcel2, g5);
                return true;
            case 10:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                boolean T4 = T(h1);
                parcel2.writeNoException();
                parcel2.writeInt(T4 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                Cj cj4 = this.f8078n;
                if (cj4 == null || cj4.f8062n.c()) {
                    Gj gj2 = this.f8076l;
                    if (gj2.Q() != null && gj2.R() == null) {
                        i5 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = F5.f8654a;
                parcel2.writeInt(i5);
                return true;
            case 13:
                Gj gj3 = this.f8076l;
                C1169jn T5 = gj3.T();
                if (T5 != null) {
                    Oi oi = P2.o.f4767B.f4789w;
                    C1893zs c1893zs = T5.f14142a;
                    oi.getClass();
                    Oi.i(c1893zs);
                    if (gj3.Q() != null) {
                        gj3.Q().a("onSdkLoaded", new C2327e(0));
                    }
                    i5 = 1;
                } else {
                    U2.j.i("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = F5.f8654a;
                parcel2.writeInt(i5);
                return true;
            case 14:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                Object t12 = BinderC2361b.t1(h12);
                if ((t12 instanceof View) && this.f8076l.T() != null && (cj = this.f8078n) != null) {
                    cj.g((View) t12);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    Gj gj4 = this.f8076l;
                    synchronized (gj4) {
                        str = gj4.f9248y;
                    }
                    if (Objects.equals(str, "Google")) {
                        U2.j.i("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        U2.j.i("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        Cj cj5 = this.f8078n;
                        if (cj5 != null) {
                            cj5.y(str, false);
                        }
                    }
                } catch (NullPointerException e5) {
                    P2.o.f4767B.f4774g.i("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e5);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    g8 = this.f8078n.f8054C.a();
                } catch (NullPointerException e6) {
                    P2.o.f4767B.f4774g.i("InternalNativeCustomTemplateAdShim.getMediaContent", e6);
                }
                parcel2.writeNoException();
                F5.e(parcel2, g8);
                return true;
            case 17:
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                boolean O5 = O(h13);
                parcel2.writeNoException();
                parcel2.writeInt(O5 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
