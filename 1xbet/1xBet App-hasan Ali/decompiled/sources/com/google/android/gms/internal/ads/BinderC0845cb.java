package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0845cb extends E5 implements InterfaceC0694Ua {

    /* renamed from: k, reason: collision with root package name */
    public final com.google.ads.mediation.a f13001k;

    public BinderC0845cb(com.google.ads.mediation.a aVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f13001k = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String A() {
        return this.f13001k.f7414a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final void C1(InterfaceC2360a interfaceC2360a) {
        this.f13001k.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final boolean D() {
        return this.f13001k.f7424m;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final void S0(InterfaceC2360a interfaceC2360a) {
        this.f13001k.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final double b() {
        Double d5 = this.f13001k.f7419g;
        if (d5 != null) {
            return d5.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final float c() {
        this.f13001k.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final Bundle e() {
        return this.f13001k.f7423l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final boolean e0() {
        return this.f13001k.f7425n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final float f() {
        this.f13001k.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final float g() {
        this.f13001k.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final InterfaceC0391w0 h() {
        InterfaceC0391w0 interfaceC0391w0;
        v3.g gVar = this.f13001k.f7421j;
        if (gVar == null) {
            return null;
        }
        synchronized (gVar.f20439l) {
            interfaceC0391w0 = (InterfaceC0391w0) gVar.f20440m;
        }
        return interfaceC0391w0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final E8 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final InterfaceC2360a l() {
        this.f13001k.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final InterfaceC2360a m() {
        this.f13001k.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final InterfaceC2360a n() {
        Object obj = this.f13001k.f7422k;
        if (obj == null) {
            return null;
        }
        return new BinderC2361b(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final I8 o() {
        J8 j8 = this.f13001k.f7417d;
        if (j8 != null) {
            return new BinderC1865z8(j8.f9867b, j8.f9868c, j8.f9869d, j8.f9870e, j8.f);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String r() {
        return this.f13001k.f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String s() {
        return this.f13001k.f7416c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String t() {
        return this.f13001k.f7418e;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String str = this.f13001k.f7414a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List y5 = y();
                parcel2.writeNoException();
                parcel2.writeList(y5);
                return true;
            case 4:
                String str2 = this.f13001k.f7416c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                I8 o5 = o();
                parcel2.writeNoException();
                F5.e(parcel2, o5);
                return true;
            case 6:
                String str3 = this.f13001k.f7418e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.f13001k.f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double b3 = b();
                parcel2.writeNoException();
                parcel2.writeDouble(b3);
                return true;
            case 9:
                String str5 = this.f13001k.f7420h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.f13001k.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                InterfaceC0391w0 h3 = h();
                parcel2.writeNoException();
                F5.e(parcel2, h3);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                l();
                parcel2.writeNoException();
                ClassLoader classLoader2 = F5.f8654a;
                parcel2.writeStrongBinder(null);
                return true;
            case 14:
                m();
                parcel2.writeNoException();
                ClassLoader classLoader3 = F5.f8654a;
                parcel2.writeStrongBinder(null);
                return true;
            case 15:
                InterfaceC2360a n5 = n();
                parcel2.writeNoException();
                F5.e(parcel2, n5);
                return true;
            case 16:
                Bundle bundle = this.f13001k.f7423l;
                parcel2.writeNoException();
                F5.d(parcel2, bundle);
                return true;
            case 17:
                boolean z3 = this.f13001k.f7424m;
                parcel2.writeNoException();
                ClassLoader classLoader4 = F5.f8654a;
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 18:
                boolean z5 = this.f13001k.f7425n;
                parcel2.writeNoException();
                ClassLoader classLoader5 = F5.f8654a;
                parcel2.writeInt(z5 ? 1 : 0);
                return true;
            case 19:
                v();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                C1(h1);
                parcel2.writeNoException();
                return true;
            case C1639u7.zzm /* 21 */:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                x0(h12, h13, h14);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC2360a h15 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                S0(h15);
                parcel2.writeNoException();
                return true;
            case 23:
                c();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                g();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                f();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String u() {
        return this.f13001k.f7420h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final void v() {
        this.f13001k.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String w() {
        return this.f13001k.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final void x0(InterfaceC2360a interfaceC2360a, InterfaceC2360a interfaceC2360a2, InterfaceC2360a interfaceC2360a3) {
        View view = (View) BinderC2361b.t1(interfaceC2360a);
        this.f13001k.getClass();
        if (M2.f.f3615a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final List y() {
        ArrayList arrayList = this.f13001k.f7415b;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                J8 j8 = (J8) obj;
                arrayList2.add(new BinderC1865z8(j8.f9867b, j8.f9868c, j8.f9869d, j8.f9870e, j8.f));
            }
        }
        return arrayList2;
    }
}
