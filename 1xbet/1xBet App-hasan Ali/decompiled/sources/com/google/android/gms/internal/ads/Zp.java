package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Zp implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12527a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.h f12528b;

    public /* synthetic */ Zp(int i, C2.h hVar) {
        this.f12527a = i;
        this.f12528b = hVar;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f12527a) {
            case 0:
                String str = ((C1428pc) this.f12528b.f834m).f14998n;
                AbstractC1400ot.D(str);
                return str;
            case 1:
                return Integer.valueOf(this.f12528b.f833l);
            case 2:
                return Boolean.valueOf(((C1428pc) this.f12528b.f834m).f15006v);
            case 3:
                return Boolean.valueOf(((C1428pc) this.f12528b.f834m).f14995k.getBoolean("is_gbid"));
            case 4:
                return Boolean.valueOf(((C1428pc) this.f12528b.f834m).f15005u);
            default:
                String str2 = ((C1428pc) this.f12528b.f834m).f15002r;
                AbstractC1400ot.D(str2);
                return str2;
        }
    }
}
