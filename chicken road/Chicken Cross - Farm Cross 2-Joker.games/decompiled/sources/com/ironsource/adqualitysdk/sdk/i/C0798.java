package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒷ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0798 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2309;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2310;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0982 f2311;

    public C0798(C0682 c0682, C0982 c0982, Context context) {
        this.f2309 = c0682;
        this.f2311 = c0982;
        this.f2310 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean mo5398;
        AbstractC1145.m5891(new C0801(this));
        C0682 c0682 = this.f2309;
        Context context = this.f2310;
        synchronized (c0682) {
            mo5398 = AbstractC0398.m5397().mo5398();
        }
        if (!mo5398) {
            AbstractC1145.m5896(new C0776(c0682), AbstractC0398.m5397().mo5409());
        }
        String str = AbstractC0978.f2894;
        ArrayList arrayList = new ArrayList(AbstractC0978.f2892.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            List<AbstractC0830> list = (List) AbstractC0978.f2892.get(str2);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC0830 abstractC0830 : list) {
                    if (AbstractC0978.m5792(abstractC0830)) {
                        arrayList2.add(abstractC0830);
                    }
                }
                linkedHashMap.put(str2, arrayList2);
            }
        }
        AbstractC1145.m5891(new C0761(c0682, context, linkedHashMap));
    }
}
