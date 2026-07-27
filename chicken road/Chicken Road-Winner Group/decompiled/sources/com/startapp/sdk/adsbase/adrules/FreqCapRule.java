package com.startapp.sdk.adsbase.adrules;

import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FreqCapRule extends AdRule implements Serializable {
    private static final long serialVersionUID = 1214675798271840648L;
    private int cap;
    private int time;

    public FreqCapRule() {
        super(true);
    }

    @Override // com.startapp.sdk.adsbase.adrules.AdRule
    public final boolean a(List list) {
        int i3;
        if (list == null && this.cap > 0) {
            return true;
        }
        if (this.cap <= 0) {
            return false;
        }
        int i4 = this.time;
        if (i4 == 0) {
            return true;
        }
        if (i4 < 0) {
            i3 = list.size();
        } else {
            Iterator it = list.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                if (System.currentTimeMillis() - ((s) it.next()).f4307a <= TimeUnit.SECONDS.toMillis(this.time)) {
                    i5++;
                }
            }
            i3 = i5;
        }
        return i3 < this.cap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FreqCapRule freqCapRule = (FreqCapRule) obj;
            if (this.time == freqCapRule.time && this.cap == freqCapRule.cap) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.time), Integer.valueOf(this.cap)};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }
}
