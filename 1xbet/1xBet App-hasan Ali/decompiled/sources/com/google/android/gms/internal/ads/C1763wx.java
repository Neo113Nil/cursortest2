package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763wx implements InterfaceC1093hz {

    /* renamed from: b, reason: collision with root package name */
    public static final C1763wx f16187b = new C1763wx(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0824bz f16188c = new C0824bz(Ky.class, InterfaceC0911dx.class, new Aq(8, (byte) 0));

    /* renamed from: d, reason: collision with root package name */
    public static final C1763wx f16189d = new C1763wx(1);

    /* renamed from: e, reason: collision with root package name */
    public static final C1763wx f16190e = new C1763wx(2);
    public static final C0824bz f = new C0824bz(Ky.class, InterfaceC1269lx.class, new C1225ky(29));

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16191a;

    public /* synthetic */ C1763wx(int i) {
        this.f16191a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1093hz
    public final Class a() {
        switch (this.f16191a) {
            case 0:
                return InterfaceC0911dx.class;
            case 1:
                return C1675uz.class;
            default:
                return InterfaceC1269lx.class;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1093hz
    public final Object b(Fx fx) {
        switch (this.f16191a) {
            case 0:
                return new C1718vx(fx);
            case 1:
                if (((C1048gz) fx.f9143k) == null) {
                    throw new GeneralSecurityException("no primary in primitive set");
                }
                Iterator it = ((HashMap) fx.f9145m).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                    }
                }
                return new C1675uz();
            default:
                Dz dz = new Dz();
                if (!((My) fx.f9144l).f10756a.isEmpty()) {
                    Ry ry = (Ry) Sy.f11604b.f11606a.get();
                    if (ry == null) {
                        ry = Sy.f11605c;
                    }
                    AbstractC1400ot.j(fx);
                    ry.getClass();
                }
                return dz;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1093hz
    public final Class d() {
        switch (this.f16191a) {
            case 0:
                return InterfaceC0911dx.class;
            case 1:
                return C1675uz.class;
            default:
                return InterfaceC1269lx.class;
        }
    }
}
