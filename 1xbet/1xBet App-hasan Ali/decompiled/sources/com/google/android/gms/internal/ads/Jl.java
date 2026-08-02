package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class Jl extends E5 implements S9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f10045k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10046l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f10047m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Jr f10048n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0634Ld f10049o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Kl f10050p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jl(long j5, C0634Ld c0634Ld, Kl kl, Jr jr, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f10045k = obj;
        this.f10046l = str;
        this.f10047m = j5;
        this.f10048n = jr;
        this.f10049o = c0634Ld;
        this.f10050p = kl;
    }

    public final void c() {
        synchronized (this.f10045k) {
            Kl kl = this.f10050p;
            String str = this.f10046l;
            P2.o.f4767B.f4776j.getClass();
            kl.d(str, (int) (SystemClock.elapsedRealtime() - this.f10047m), "", true);
            this.f10050p.f10237l.c(this.f10046l);
            this.f10050p.f10240o.H(this.f10046l);
            Nr nr = this.f10050p.f10241p;
            Jr jr = this.f10048n;
            jr.g(true);
            nr.b(jr.l());
            this.f10049o.b(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            c();
        } else {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            F5.b(parcel);
            u3(readString);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void u3(String str) {
        synchronized (this.f10045k) {
            Kl kl = this.f10050p;
            String str2 = this.f10046l;
            P2.o.f4767B.f4776j.getClass();
            kl.d(str2, (int) (SystemClock.elapsedRealtime() - this.f10047m), str, false);
            this.f10050p.f10237l.a(this.f10046l, "error");
            this.f10050p.f10240o.j(this.f10046l, "error");
            Nr nr = this.f10050p.f10241p;
            Jr jr = this.f10048n;
            jr.C(str);
            jr.g(false);
            nr.b(jr.l());
            this.f10049o.b(Boolean.FALSE);
        }
    }
}
