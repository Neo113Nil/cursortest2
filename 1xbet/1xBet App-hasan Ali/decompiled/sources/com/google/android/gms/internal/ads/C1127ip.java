package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127ip implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13994a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13995b;

    public /* synthetic */ C1127ip(int i, Integer num) {
        this.f13994a = i;
        this.f13995b = num;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        int i = this.f13994a;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f13994a) {
            case 0:
                C0572Ch c0572Ch = (C0572Ch) obj;
                Integer num = this.f13995b;
                if (num != null) {
                    c0572Ch.f8049a.putInt("aos", num.intValue());
                    break;
                }
                break;
            default:
                C0572Ch c0572Ch2 = (C0572Ch) obj;
                Integer num2 = this.f13995b;
                if (num2 != null) {
                    c0572Ch2.f8049a.putInt("dspct", Math.min(num2.intValue(), 20));
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
