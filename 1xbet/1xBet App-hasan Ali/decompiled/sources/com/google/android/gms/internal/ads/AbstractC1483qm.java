package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import m3.InterfaceC2092b;
import m3.InterfaceC2093c;

/* renamed from: com.google.android.gms.internal.ads.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1483qm implements InterfaceC2092b, InterfaceC2093c {

    /* renamed from: k, reason: collision with root package name */
    public final C0634Ld f15168k = new C0634Ld();

    /* renamed from: l, reason: collision with root package name */
    public final Object f15169l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public boolean f15170m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15171n = false;

    /* renamed from: o, reason: collision with root package name */
    public C1428pc f15172o;

    /* renamed from: p, reason: collision with root package name */
    public C1414p6 f15173p;

    public static void b(Context context, C0634Ld c0634Ld, Qw qw) {
        if (((Boolean) AbstractC0790b8.f12772j.s()).booleanValue() || ((Boolean) AbstractC0790b8.f12771h.s()).booleanValue()) {
            c0634Ld.a(new Kw(0, c0634Ld, new Ms(context, 2)), qw);
        }
    }

    @Override // m3.InterfaceC2092b
    public final void L(int i) {
        U2.j.d("Cannot connect to remote service, fallback to local instance.");
    }

    public void Y(j3.b bVar) {
        U2.j.d("Disconnected from remote ad request service.");
        this.f15168k.c(new C1797xm(1));
    }

    public final void a() {
        synchronized (this.f15169l) {
            try {
                this.f15171n = true;
                if (!this.f15173p.a()) {
                    if (this.f15173p.h()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f15173p.l();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
