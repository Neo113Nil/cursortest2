package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class U7 implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11738a;

    /* renamed from: b, reason: collision with root package name */
    public final C1565sf f11739b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f11740c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f11741d;

    public /* synthetic */ U7(C1565sf c1565sf, CD cd, CD cd2, int i) {
        this.f11738a = i;
        this.f11739b = c1565sf;
        this.f11740c = cd;
        this.f11741d = cd2;
    }

    public Vo a() {
        return new Vo((ApplicationInfo) this.f11740c.d(), (PackageInfo) this.f11741d.d(), this.f11739b.a(), 2);
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f11738a) {
            case 0:
                this.f11739b.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11740c.d();
                return new T7(scheduledExecutorService);
            case 1:
                Context a5 = this.f11739b.a();
                C0568Cd c0568Cd = (C0568Cd) this.f11740c.d();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f11741d.d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C0948ep(a5, c0568Cd, scheduledExecutorService2, c0606Hd);
            default:
                return a();
        }
    }

    public U7(CD cd, CD cd2, C1565sf c1565sf) {
        this.f11738a = 2;
        this.f11740c = cd;
        this.f11741d = cd2;
        this.f11739b = c1565sf;
    }
}
