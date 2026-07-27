package com.bytedance.adsdk.sf;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class lu {
    private boolean pcc = false;
    private final Set<Object> sf = new pcc();
    private final Map<String, com.bytedance.adsdk.sf.wh.oo> gm = new HashMap();
    private final Comparator<Pair<String, Float>> oo = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.sf.lu.1
        @Override // java.util.Comparator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    void pcc(boolean z) {
        this.pcc = z;
    }

    public void pcc(String str, float f) {
        if (this.pcc) {
            com.bytedance.adsdk.sf.wh.oo ooVar = this.gm.get(str);
            if (ooVar == null) {
                ooVar = new com.bytedance.adsdk.sf.wh.oo();
                this.gm.put(str, ooVar);
            }
            ooVar.pcc(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.sf.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
