package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class a3 {

    /* renamed from: a, reason: collision with root package name */
    private final r4 f4107a = new r4();
    private final TreeSet b = new TreeSet();
    private final Map c = new HashMap();
    private int d;
    private int e;

    public a3(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.p.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f4107a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f4107a.isEmpty()) {
            this.f4107a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = ((Integer) this.f4107a.a()).intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.f4107a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f4107a.add(Integer.valueOf(intValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.b);
    }

    public int c() {
        int i = this.d;
        if (i != -1 && this.e != -1) {
            while (i <= this.e) {
                if (g(i) && !h(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int d(int i) {
        if (g(i)) {
            return -1;
        }
        return i - a(i, true);
    }

    public Collection e(int i) {
        return new TreeSet((SortedSet) this.b.tailSet(Integer.valueOf(i), false));
    }

    public void f(int i) {
        int b = this.f4107a.b(Integer.valueOf(i));
        for (int size = this.f4107a.size() - 1; size >= b; size--) {
            Integer num = (Integer) this.f4107a.a(size);
            int intValue = num.intValue() + 1;
            a(num.intValue(), intValue);
            this.f4107a.a(size, Integer.valueOf(intValue));
        }
    }

    public boolean g(int i) {
        return this.f4107a.contains(Integer.valueOf(i));
    }

    public boolean h(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    public void i(int i) {
        int b = this.f4107a.b(Integer.valueOf(i));
        if (g(i)) {
            this.c.remove(Integer.valueOf(i));
            this.b.remove(Integer.valueOf(i));
            this.f4107a.b(b);
        }
        while (b < this.f4107a.size()) {
            Integer num = (Integer) this.f4107a.a(b);
            int intValue = num.intValue() - 1;
            a(num.intValue(), intValue);
            this.f4107a.a(b, Integer.valueOf(intValue));
            b++;
        }
    }

    public int b(int i) {
        if (i == 0) {
            return 0;
        }
        return i + a(i - 1, false);
    }

    public void b(int i, int i2) {
        i(i);
        f(i2);
    }

    public void c(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public int c(int i) {
        return i + a(i, false);
    }

    public MaxAd a(int i) {
        return (MaxAd) this.c.get(Integer.valueOf(i));
    }

    public void a(MaxAd maxAd, int i) {
        this.c.put(Integer.valueOf(i), maxAd);
        this.b.add(Integer.valueOf(i));
    }

    public void a() {
        this.c.clear();
        this.b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.c.remove(num);
            this.b.remove(num);
        }
    }

    private void a(int i, int i2) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i2), (MaxAd) this.c.get(Integer.valueOf(i)));
            this.b.add(Integer.valueOf(i2));
            this.c.remove(Integer.valueOf(i));
            this.b.remove(Integer.valueOf(i));
        }
    }

    private int a(int i, boolean z) {
        int c = this.f4107a.c(Integer.valueOf(i));
        if (!z) {
            int i2 = i + c;
            while (c < this.f4107a.size() && i2 >= ((Integer) this.f4107a.a(c)).intValue()) {
                i2++;
                c++;
            }
        }
        return c;
    }
}
