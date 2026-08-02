package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import g3.C1984b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1364o1 implements InterfaceC1311mu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14745a;

    public /* synthetic */ C1364o1(int i) {
        this.f14745a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
    public final Object apply(Object obj) {
        int i = 4;
        switch (this.f14745a) {
            case 0:
                return (C1768x1) obj;
            case 1:
                return (C1768x1) obj;
            case 2:
                Throwable th = (Throwable) obj;
                C1551s9 c1551s9 = AbstractC1776x9.f16242a;
                if (((Boolean) AbstractC1013g8.i.s()).booleanValue()) {
                    P2.o.f4767B.f4774g.i("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 3:
                List list = C0724Yc.f12336l;
                return null;
            case 4:
                return "failure_click_attok";
            case 5:
                return new C0940eh((List) obj);
            case 6:
                return new C0940eh((AbstractC0762ah) obj);
            case 7:
                ArrayList arrayList = new ArrayList();
                for (BinderC1865z8 binderC1865z8 : (List) obj) {
                    if (binderC1865z8 != null) {
                        arrayList.add(binderC1865z8);
                    }
                }
                return arrayList;
            case 8:
                ArrayList arrayList2 = new ArrayList();
                for (C1481qk c1481qk : (List) obj) {
                    if (c1481qk != null) {
                        arrayList2.add(c1481qk);
                    }
                }
                return arrayList2;
            case 9:
                return Collections.singletonList(AbstractC1400ot.c0((Cj) obj));
            case 10:
                ArrayList arrayList3 = (ArrayList) obj;
                return new Xo(1, true != arrayList3.isEmpty() ? arrayList3 : null);
            case 11:
                C1984b c1984b = (C1984b) obj;
                return new C0993fp(c1984b.f17158b, 0, c1984b.f17157a);
            case 12:
                return new To((String) obj, i);
            case 13:
                return new Yo(4, (Bundle) obj);
            case 14:
                return new To((String) obj, 5);
            case 15:
                return null;
            case 16:
                return (C1397oq) obj;
            case 17:
                String str = ((Tq) obj).f11693a;
                return TextUtils.isEmpty(str) ? "" : U2.g.c() ? "fakeForAdDebugLog" : str;
            case 18:
                String str2 = ((Tq) obj).f11694b;
                return TextUtils.isEmpty(str2) ? "" : U2.g.c() ? "fakeForAdDebugLog" : str2;
            case 19:
                return new SE((Nm) obj);
            case 20:
                F f = (F) obj;
                f.getClass();
                return f.getClass().getSimpleName();
            case C1639u7.zzm /* 21 */:
                return AbstractC1044gv.l(AbstractC1400ot.z(((InterfaceC1558sG) obj).g().f11647b, new C1364o1(22)));
            case 22:
                TG tg = TG.f11645d;
                return Integer.valueOf(((C1292mb) obj).f14497c);
            default:
                L l5 = (L) obj;
                int i5 = C1407p.K;
                return l5.f10289a + ": " + l5.f10290b;
        }
    }
}
