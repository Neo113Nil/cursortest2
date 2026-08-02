package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class O5 implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10933a;

    public /* synthetic */ O5(int i) {
        this.f10933a = i;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f10933a) {
            case 0:
                return new N5();
            case 1:
                return P2.o.f4767B.f4774g;
            case 2:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 3:
                String str = C0379q.f.f5050c;
                AbstractC1400ot.D(str);
                return str;
            case 4:
                return new ArrayDeque();
            case 5:
                return new C1543s1(29);
            case 6:
                return new V9(12);
            case 7:
                return new V9(15);
            case 8:
                return P2.o.f4767B.f4790x;
            case 9:
                return new C0806bg();
            case 10:
                return EnumC1818y6.f16407v;
            case 11:
                return "app_open_ad";
            case 12:
                return EnumC1818y6.f16398m;
            case 13:
                return "banner";
            case 14:
                return new C1567sh();
            case 15:
                return new C1523ri();
            case 16:
                C1838yi c1838yi = new C1838yi();
                A7 a7 = F7.f8830g1;
                Q2.r rVar = Q2.r.f5053d;
                c1838yi.f16461k = ((Integer) rVar.f5056c.a(a7)).intValue();
                c1838yi.f16462l = ((Integer) rVar.f5056c.a(F7.tc)).intValue();
                return c1838yi;
            case 17:
                Set set = Collections.EMPTY_SET;
                AbstractC1400ot.D(set);
                return set;
            case 18:
                Set set2 = Collections.EMPTY_SET;
                AbstractC1400ot.D(set2);
                return set2;
            case 19:
                Set set3 = Collections.EMPTY_SET;
                AbstractC1400ot.D(set3);
                return set3;
            case 20:
                Set set4 = Collections.EMPTY_SET;
                AbstractC1400ot.D(set4);
                return set4;
            case C1639u7.zzm /* 21 */:
                Set set5 = Collections.EMPTY_SET;
                AbstractC1400ot.D(set5);
                return set5;
            case 22:
                Set set6 = Collections.EMPTY_SET;
                AbstractC1400ot.D(set6);
                return set6;
            case 23:
                Set set7 = Collections.EMPTY_SET;
                AbstractC1400ot.D(set7);
                return set7;
            case 24:
                return new Li();
            case 25:
                return EnumC1818y6.f16400o;
            case 26:
                return "interstitial";
            case 27:
                return EnumC1818y6.f16403r;
            case 28:
                return "native";
            default:
                return null;
        }
    }

    public /* synthetic */ O5(int i, boolean z3) {
        this.f10933a = i;
    }

    public O5(Gi gi) {
        this.f10933a = 18;
    }
}
