package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.vp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1710vp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16050a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f16051b;

    public /* synthetic */ C1710vp(Boolean bool, int i) {
        this.f16050a = i;
        this.f16051b = bool;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        int i = this.f16050a;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f16050a) {
            case 0:
                C0572Ch c0572Ch = (C0572Ch) obj;
                Boolean bool = this.f16051b;
                if (bool != null) {
                    c0572Ch.f8049a.putBoolean("hw_accel", bool.booleanValue());
                    break;
                }
                break;
            default:
                Bundle bundle = ((C0572Ch) obj).f8049a;
                Boolean bool2 = this.f16051b;
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        bundle.putInt("lft", 0);
                        break;
                    } else {
                        bundle.putInt("lft", 1);
                        break;
                    }
                } else {
                    bundle.putInt("lft", -1);
                    break;
                }
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
