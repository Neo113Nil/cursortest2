package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.th, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1612th implements InterfaceC1434pi, InterfaceC0764aj {

    /* renamed from: k, reason: collision with root package name */
    public C0375o f15702k;

    /* renamed from: m, reason: collision with root package name */
    public final Context f15704m;

    /* renamed from: n, reason: collision with root package name */
    public final Nr f15705n;

    /* renamed from: o, reason: collision with root package name */
    public final U2.a f15706o;

    /* renamed from: p, reason: collision with root package name */
    public final Qw f15707p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15708q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15709r = false;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f15703l = new AtomicBoolean();

    public C1612th(Context context, Nr nr, U2.a aVar, Qw qw) {
        this.f15704m = context;
        this.f15705n = nr;
        this.f15706o = aVar;
        this.f15707p = qw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void a(String str) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void b(a3.u uVar) {
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (android.text.TextUtils.equals(r0, "service") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        C0375o c0375o;
        int i;
        int i5;
        C1875za m5;
        if (!this.f15703l.getAndSet(true)) {
            if (!((Boolean) AbstractC1058h8.f13718j.s()).booleanValue()) {
                i = 3;
                if (!((Boolean) AbstractC1058h8.f13719k.s()).booleanValue()) {
                    if (((Boolean) AbstractC1058h8.i.s()).booleanValue()) {
                        try {
                            String optString = new JSONObject(P2.o.f4767B.f4774g.d().t().f7598e).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i5 = i - 1;
                Nr nr = this.f15705n;
                Context context = this.f15704m;
                if (i5 != 1) {
                    m5 = P2.o.f4767B.f4783q.m(context, U2.a.a(), nr);
                } else if (i5 == 2) {
                    m5 = P2.o.f4767B.f4783q.s(context, U2.a.a(), nr);
                }
                V9 v9 = AbstractC1830ya.f16434b;
                this.f15702k = new C0375o(context, m5.a("google.afma.sdkConstants.getSdkConstants", v9, v9), this.f15706o);
                this.f15708q = true;
            }
            i = 2;
            i5 = i - 1;
            Nr nr2 = this.f15705n;
            Context context2 = this.f15704m;
            if (i5 != 1) {
            }
            V9 v92 = AbstractC1830ya.f16434b;
            this.f15702k = new C0375o(context2, m5.a("google.afma.sdkConstants.getSdkConstants", v92, v92), this.f15706o);
            this.f15708q = true;
        }
        if (this.f15708q && (c0375o = this.f15702k) != null) {
            E3.a E5 = c0375o.E();
            if (!this.f15709r && ((Boolean) AbstractC0790b8.i.s()).booleanValue()) {
                E5.a(new K4(23, this), this.f15707p);
            }
            AbstractC1803xs.k(E5, "persistFlagsClient");
        }
    }
}
