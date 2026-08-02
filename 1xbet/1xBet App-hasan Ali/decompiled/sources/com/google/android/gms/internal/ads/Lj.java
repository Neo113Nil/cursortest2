package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Lj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10456a;

    public /* synthetic */ Lj(int i) {
        this.f10456a = i;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f10456a) {
            case 0:
                return new Fo();
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return new Nk();
            case 5:
                return new C0766al();
            case 6:
                return new C0855cl();
            case 7:
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C0989fl(c0606Hd);
            case 8:
                return new C1079hl(11, 12, 1007);
            case 9:
                return new C1079hl(19, 20, 1008);
            case 10:
                return new C1079hl(13, 14, 1004);
            case 11:
                return new C1079hl(1001, 1002, 1003);
            case 12:
                return new C1079hl(15, 16, 1005);
            case 13:
                return new C1079hl(17, 18, 1006);
            case 14:
                return new C1526rl(Dr.f8388l, "ttc");
            case 15:
                return new C1526rl(Dr.f8386H, "t_load_as");
            case 16:
                return new Ll();
            case 17:
                T2.L l5 = P2.o.f4767B.f4771c;
                String uuid = UUID.randomUUID().toString();
                AbstractC1400ot.D(uuid);
                return uuid;
            case 18:
                return new Qm();
            case 19:
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                return new C1754wo(c0606Hd2);
            case 20:
                return new Go();
            case C1639u7.zzm /* 21 */:
                return new Zo();
            case 22:
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new C1441pp(c0606Hd3, 0);
            case 23:
                Object arrayList = new ArrayList();
                A7 a7 = F7.ob;
                Q2.r rVar = Q2.r.f5053d;
                if (!((String) rVar.f5056c.a(a7)).isEmpty()) {
                    arrayList = Arrays.asList(((String) rVar.f5056c.a(a7)).split(","));
                }
                AbstractC1400ot.D(arrayList);
                return arrayList;
            case 24:
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                return new C1441pp(c0606Hd4, 1);
            case 25:
                C0606Hd c0606Hd5 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd5);
                return new C1441pp(c0606Hd5, 2);
            case 26:
                C0606Hd c0606Hd6 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd6);
                return new C1441pp(c0606Hd6, 4);
            case 27:
                return new Uq();
            case 28:
                return new Tq();
            default:
                C0772ar c0772ar = new C0772ar();
                try {
                    AbstractC1583sx.a();
                } catch (GeneralSecurityException e3) {
                    T2.G.m("Failed to Configure Aead. ".concat(e3.toString()));
                    P2.o.f4767B.f4774g.i("CryptoUtils.registerAead", e3);
                }
                return c0772ar;
        }
    }
}
