package com.google.android.gms.internal.ads;

import Q2.InterfaceC0347a;
import android.os.Bundle;

/* loaded from: classes.dex */
public class Ek implements InterfaceC0347a, InterfaceC1462q9, S2.m, InterfaceC1506r9, S2.c {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0347a f8580k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1462q9 f8581l;

    /* renamed from: m, reason: collision with root package name */
    public S2.m f8582m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC1506r9 f8583n;

    /* renamed from: o, reason: collision with root package name */
    public S2.c f8584o;

    @Override // S2.m
    public final synchronized void N2() {
        S2.m mVar = this.f8582m;
        if (mVar != null) {
            mVar.N2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1462q9
    public final synchronized void Q(String str, Bundle bundle) {
        InterfaceC1462q9 interfaceC1462q9 = this.f8581l;
        if (interfaceC1462q9 != null) {
            interfaceC1462q9.Q(str, bundle);
        }
    }

    @Override // S2.m
    public final synchronized void Q1() {
        S2.m mVar = this.f8582m;
        if (mVar != null) {
            mVar.Q1();
        }
    }

    @Override // S2.m
    public final synchronized void Z2() {
        S2.m mVar = this.f8582m;
        if (mVar != null) {
            mVar.Z2();
        }
    }

    public final synchronized void a(InterfaceC0347a interfaceC0347a, InterfaceC1462q9 interfaceC1462q9, S2.m mVar, InterfaceC1506r9 interfaceC1506r9, S2.c cVar) {
        this.f8580k = interfaceC0347a;
        this.f8581l = interfaceC1462q9;
        this.f8582m = mVar;
        this.f8583n = interfaceC1506r9;
        this.f8584o = cVar;
    }

    @Override // S2.m
    public final synchronized void d1(int i) {
        S2.m mVar = this.f8582m;
        if (mVar != null) {
            mVar.d1(i);
        }
    }

    @Override // S2.c
    public final synchronized void f() {
        S2.c cVar = this.f8584o;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // S2.m
    public final synchronized void h1() {
        S2.m mVar = this.f8582m;
        if (mVar != null) {
            mVar.h1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1506r9
    public final synchronized void j(String str, String str2) {
        InterfaceC1506r9 interfaceC1506r9 = this.f8583n;
        if (interfaceC1506r9 != null) {
            interfaceC1506r9.j(str, str2);
        }
    }

    @Override // S2.m
    public final synchronized void t1() {
        S2.m mVar = this.f8582m;
        if (mVar != null) {
            mVar.t1();
        }
    }

    @Override // Q2.InterfaceC0347a
    public final synchronized void z() {
        InterfaceC0347a interfaceC0347a = this.f8580k;
        if (interfaceC0347a != null) {
            interfaceC0347a.z();
        }
    }
}
