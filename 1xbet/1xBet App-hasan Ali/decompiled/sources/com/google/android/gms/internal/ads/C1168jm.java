package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168jm implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14140a;

    /* renamed from: b, reason: collision with root package name */
    public ID f14141b;

    public /* synthetic */ C1168jm() {
        this.f14140a = 2;
    }

    public static void a(C1168jm c1168jm, ID id) {
        if (c1168jm.f14141b != null) {
            throw new IllegalStateException();
        }
        c1168jm.f14141b = id;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f14140a) {
            case 0:
                String packageName = ((C1565sf) this.f14141b).a().getPackageName();
                AbstractC1400ot.D(packageName);
                return packageName;
            case 1:
                return new Mo(1, (Set) this.f14141b.d());
            default:
                ID id = this.f14141b;
                if (id != null) {
                    return id.d();
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ C1168jm(ID id, int i) {
        this.f14140a = i;
        this.f14141b = id;
    }
}
