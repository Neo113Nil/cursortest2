package com.google.android.gms.internal.ads;

import T2.C0432j;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.xh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1792xh implements InterfaceC1311mu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16319d;

    public /* synthetic */ C1792xh(Object obj, Object obj2, Object obj3, int i) {
        this.f16316a = i;
        this.f16317b = obj;
        this.f16318c = obj2;
        this.f16319d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
    public final Object apply(Object obj) {
        switch (this.f16316a) {
            case 0:
                Lq lq = (Lq) obj;
                C0432j c0432j = new C0432j((Context) this.f16317b);
                c0432j.f5708c = lq.f10466B;
                c0432j.f = lq.f10467C.toString();
                c0432j.f5710e = ((U2.a) this.f16318c).f5852k;
                c0432j.f5709d = ((Wq) this.f16319d).f;
                return c0432j;
            case 1:
                Lq lq2 = (Lq) this.f16318c;
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f16317b;
                if (lq2.f10475M) {
                    interfaceC0677Re.t0();
                }
                interfaceC0677Re.N0();
                interfaceC0677Re.onPause();
                return ((C0562Bf) this.f16319d).q0();
            case 2:
                Lq lq3 = (Lq) this.f16318c;
                InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) this.f16317b;
                if (lq3.f10475M) {
                    interfaceC0677Re2.t0();
                }
                interfaceC0677Re2.N0();
                interfaceC0677Re2.onPause();
                return ((C0608Hf) this.f16319d).q0();
            default:
                Lq lq4 = (Lq) this.f16318c;
                InterfaceC0677Re interfaceC0677Re3 = (InterfaceC0677Re) this.f16317b;
                if (lq4.f10475M) {
                    interfaceC0677Re3.t0();
                }
                interfaceC0677Re3.N0();
                interfaceC0677Re3.onPause();
                return ((C0629Kf) this.f16319d).q0();
        }
    }
}
