package com.google.android.gms.internal.ads;

import Q2.C0381r0;
import Q2.InterfaceC0383s0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class Ih extends E5 implements InterfaceC0383s0 {

    /* renamed from: k, reason: collision with root package name */
    public final String f9590k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9591l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9592m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9593n;

    /* renamed from: o, reason: collision with root package name */
    public final List f9594o;

    /* renamed from: p, reason: collision with root package name */
    public final long f9595p;

    /* renamed from: q, reason: collision with root package name */
    public final String f9596q;

    /* renamed from: r, reason: collision with root package name */
    public final C1528rn f9597r;

    /* renamed from: s, reason: collision with root package name */
    public final Bundle f9598s;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Ih(Lq lq, String str, C1528rn c1528rn, Nq nq, String str2) {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        String str3;
        String str4 = null;
        this.f9591l = lq == null ? null : lq.f10492b0;
        this.f9592m = str2;
        this.f9593n = nq == null ? null : nq.f10823b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && lq != null) {
            try {
                str4 = lq.f10529v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f9590k = str4 != null ? str4 : str;
        this.f9594o = c1528rn.f15375a;
        this.f9597r = c1528rn;
        P2.o.f4767B.f4776j.getClass();
        this.f9595p = System.currentTimeMillis() / 1000;
        A7 a7 = F7.s6;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue() || nq == null) {
            this.f9598s = new Bundle();
        } else {
            this.f9598s = nq.f10830k;
        }
        if (((Boolean) rVar.f5056c.a(F7.Q8)).booleanValue() && nq != null) {
            str3 = nq.i;
        }
        str3 = "";
        this.f9596q = str3;
    }

    public static InterfaceC0383s0 u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof InterfaceC0383s0 ? (InterfaceC0383s0) queryLocalInterface : new C0381r0(iBinder);
    }

    @Override // Q2.InterfaceC0383s0
    public final Bundle b() {
        return this.f9598s;
    }

    @Override // Q2.InterfaceC0383s0
    public final Q2.c1 c() {
        C1528rn c1528rn = this.f9597r;
        if (c1528rn != null) {
            return c1528rn.f;
        }
        return null;
    }

    @Override // Q2.InterfaceC0383s0
    public final String e() {
        return this.f9591l;
    }

    @Override // Q2.InterfaceC0383s0
    public final String f() {
        return this.f9590k;
    }

    @Override // Q2.InterfaceC0383s0
    public final String g() {
        return this.f9592m;
    }

    @Override // Q2.InterfaceC0383s0
    public final List h() {
        return this.f9594o;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f9590k);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f9591l);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f9594o);
                return true;
            case 4:
                Q2.c1 c5 = c();
                parcel2.writeNoException();
                F5.d(parcel2, c5);
                return true;
            case 5:
                parcel2.writeNoException();
                F5.d(parcel2, this.f9598s);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f9592m);
                return true;
            default:
                return false;
        }
    }
}
