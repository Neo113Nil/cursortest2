package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.ScheduledExecutorService;
import r3.C2350b;

/* renamed from: com.google.android.gms.internal.ads.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1655uf implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15874a;

    /* renamed from: b, reason: collision with root package name */
    public final C1565sf f15875b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f15876c;

    public /* synthetic */ C1655uf(C1565sf c1565sf, CD cd, int i) {
        this.f15874a = i;
        this.f15875b = c1565sf;
        this.f15876c = cd;
    }

    public C0375o a() {
        Context a5 = this.f15875b.a();
        Nr nr = (Nr) this.f15876c.d();
        P2.o oVar = P2.o.f4767B;
        C1875za s2 = oVar.f4783q.s(a5, U2.a.a(), nr);
        V9 v9 = AbstractC1830ya.f16434b;
        s2.getClass();
        return new C0375o(a5, oVar.f4783q.s(a5, U2.a.a(), nr).a("google.afma.sdkConstants.getSdkConstants", v9, v9), U2.a.a());
    }

    public Qo b() {
        return new Qo(3, this.f15875b.a(), (Intent) this.f15876c.d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15874a) {
            case 0:
                try {
                    return C2350b.a(this.f15875b.a()).c(((ApplicationInfo) this.f15876c.d()).packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return a();
            case 2:
                return new C1521rg(this.f15875b.a(), (J5) this.f15876c.d());
            case 3:
                return new C0945em(this.f15875b.a(), (C1482ql) this.f15876c.d());
            case 4:
                return new C1662um(this.f15875b.a(), (C1204kd) this.f15876c.d());
            case 5:
                return b();
            case 6:
                C1204kd c1204kd = (C1204kd) this.f15876c.d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new Vo(c1204kd, c0606Hd, this.f15875b.a(), 3);
            case 7:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15876c.d();
                this.f15875b.a();
                return new Mo(6, scheduledExecutorService);
            default:
                return new Ir(this.f15875b.a(), (Mr) this.f15876c.d());
        }
    }

    public /* synthetic */ C1655uf(CD cd, C1565sf c1565sf, int i) {
        this.f15874a = i;
        this.f15876c = cd;
        this.f15875b = c1565sf;
    }
}
