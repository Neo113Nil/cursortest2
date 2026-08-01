package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˮ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0460 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public volatile C1236 f851;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public C1262 f852;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public Context f853;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final C0864 f854;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final C0510 f855;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0589 f856;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0630 f857;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0972 f858;

    public C0460(C0972 c0972) {
        C0630 c0630 = new C0630();
        this.f851 = new C1236(new C1245());
        this.f858 = c0972;
        this.f857 = c0630;
        C0589 c0589 = new C0589();
        this.f856 = c0589;
        this.f855 = new C0510(c0630, c0589, c0972);
        this.f854 = new C0864();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5451(Context context) {
        this.f853 = context.getApplicationContext();
        Context context2 = this.f853;
        C0576 c0576 = new C0576(this.f853);
        C1179 c1179 = new C1179(this.f853);
        Context context3 = this.f853;
        this.f852 = new C1262(context2, Arrays.asList(c0576, c1179, new C0508(context3), new C0690(context3)));
        m5450();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1236 m5450() {
        C1166 c1166;
        C1300 c1300;
        C1262 c1262 = this.f852;
        if (c1262 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                C1158 c1158 = c1262.f3571;
                Context context = c1262.f3572;
                c1158.getClass();
                c1166 = C1158.m5898(context);
            } catch (Exception e) {
                arrayList.add(StringFog.decrypt("XVA6Ta921+ZmTCFQhGCYtA==\n", "Dz9VOecTopQ=\n") + e.getMessage());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(7);
                c1166 = new C1166(true, true, arrayList3);
            }
            arrayList2.addAll(c1166.f3343);
            try {
                C1298 c1298 = c1262.f3570;
                Context context2 = c1262.f3572;
                c1298.getClass();
                c1300 = C1298.m5942(context2);
            } catch (Exception e2) {
                arrayList.add(StringFog.decrypt("DyWlv5+hX0AoP7e/hLtcbSM+pKKeoFtGNXH2\n", "RkvWy+3UMiU=\n") + e2.getMessage());
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(21);
                c1300 = new C1300(true, true, true, true, arrayList4);
            }
            arrayList2.addAll(c1300.f3689);
            HashMap hashMap = new HashMap();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            for (InterfaceC1253 interfaceC1253 : c1262.f3569) {
                try {
                    C0474 mo5481 = interfaceC1253.mo5481();
                    arrayList7.add(new C1278(interfaceC1253.getName(), mo5481));
                    arrayList2.addAll(mo5481.f917);
                    if (!mo5481.f918 && mo5481.f915 != null) {
                        arrayList.add(interfaceC1253.getName() + StringFog.decrypt("JQM=\n", "HyNZY8HigFM=\n") + mo5481.f915);
                    }
                    if (mo5481.f916 != null) {
                        hashMap.put(interfaceC1253.getName(), mo5481.f916);
                    }
                    interfaceC1253.getName();
                    for (Integer num : mo5481.f917) {
                        int intValue = num.intValue();
                        if (intValue != 30 && intValue != 31 && intValue != 33 && intValue != 32 && intValue != 40 && intValue != 42 && intValue != 44 && intValue != 41) {
                            if (intValue != 63 && intValue != 64 && intValue != 61 && intValue != 62 && intValue != 60) {
                                if (intValue >= 50 && intValue <= 56) {
                                    arrayList6.add(num);
                                }
                            }
                            arrayList5.add(num);
                        }
                    }
                } catch (Exception e3) {
                    arrayList.add(interfaceC1253.getName() + StringFog.decrypt("rko=\n", "lGo+DMsp39s=\n") + e3.getMessage());
                    arrayList7.add(new C1278(interfaceC1253.getName(), new C0474(false, Collections.emptyList(), null, null)));
                }
            }
            boolean z = c1166.f3345;
            boolean z2 = c1166.f3344;
            boolean z3 = c1300.f3693;
            boolean z4 = c1300.f3692;
            boolean z5 = c1300.f3691;
            boolean z6 = c1300.f3690;
            int i = !z ? 1 : 0;
            if (!z2) {
                i++;
            }
            if (!z3 && !z4 && !z5 && !z6) {
                i += 2;
            }
            Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                C1278 c1278 = (C1278) it.next();
                if (c1278.f3661.f918) {
                    Integer num2 = (Integer) C1262.f3567.get(c1278.f3662);
                    i += num2 != null ? num2.intValue() : 1;
                }
            }
            C1245 c1245 = new C1245();
            c1245.f3534 = i;
            c1245.f3533 = arrayList5;
            c1245.f3532 = arrayList6;
            c1245.f3531 = hashMap;
            c1245.f3530 = arrayList2;
            c1245.f3529 = arrayList;
            C1236 c1236 = new C1236(c1245);
            this.f851 = c1236;
            return c1236;
        }
        throw new IllegalStateException(StringFog.decrypt("WPZU0MLfJSMt2X/1odk5L3nece3oyjIiI5dT4O3cdy9j3mTo4Nw+PGifc+7vxDI+eZ4w5+jCJDIj\n", "DbcQgYGwV0Y=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m5452(byte[] bArr, String str) {
        C0864 c0864 = this.f854;
        C1199 c1199 = (C1199) c0864.f2482.remove(str);
        if (c1199 == null || System.currentTimeMillis() - c1199.f3396 > c0864.f2483) {
            c1199 = null;
        }
        if (c1199 != null) {
            return AbstractC1193.m5919(bArr, c1199, this.f857);
        }
        throw new IllegalStateException(AbstractC0548.m5514("TwzG3HqcKIVuDcbJcJo1iCEFid0/nT6ddAaV21aLYcw=\n", "AWPmrx/vW+w=\n", new StringBuilder(), str));
    }
}
