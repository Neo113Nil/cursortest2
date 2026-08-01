package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1239 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1050 f3521;

    public C1239(C1050 c1050) {
        this.f3521 = c1050;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5938(ArrayList arrayList) {
        JSONObject jSONObject;
        C1033 c1033;
        try {
            if (arrayList.isEmpty()) {
                C1050.m5816(this.f3521);
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                priorityQueue.add(new C1035((C0414) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (C1035 c1035 = (C1035) priorityQueue.poll(); c1035 != null; c1035 = (C1035) priorityQueue.poll()) {
                C1050 c1050 = this.f3521;
                c1050.getClass();
                AbstractC0398 m5397 = AbstractC0398.m5397();
                synchronized (c1035) {
                    jSONObject = c1035.f3075.f546;
                }
                String optString = jSONObject.optString(StringFog.decrypt("8K+y7A==\n", "gMPVgsL8sm4=\n"));
                String str = c1050.f3119;
                C0470 c0470 = (C0470) m5397;
                if (optString != null) {
                    c1033 = (C1033) c0470.mo5407().get(optString);
                } else {
                    c0470.getClass();
                    c1033 = null;
                }
                if (c1033 != null && c1033.m5807(str)) {
                    C0357 c0357 = this.f3521.f3131;
                    C0414 c0414 = c1035.f3075;
                    c0357.getClass();
                    C0482.m5466().post(new C0359(c0357, c0414));
                }
                if (TextUtils.isEmpty(c1035.m5808())) {
                    c1035.m5813(this.f3521.f3130.f1205.m5441());
                }
                arrayList2.add(c1035);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            C1050.m5818(this.f3521, arrayList2, new C1240(this));
        } catch (Exception unused) {
            C1050.m5816(this.f3521);
        }
    }
}
