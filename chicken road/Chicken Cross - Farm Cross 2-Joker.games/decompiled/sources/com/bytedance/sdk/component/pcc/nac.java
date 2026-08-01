package com.bytedance.sdk.component.pcc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class nac<K, V> {
    private final Map<K, V> pcc = new HashMap();
    private final Map<V, Set<K>> sf = new HashMap();

    public void pcc(Set<K> set, V v) {
        for (K k : set) {
            if (this.pcc.containsKey(k)) {
                sf(k);
            }
        }
        Set<K> set2 = this.sf.get(v);
        if (set2 == null) {
            set2 = new HashSet<>();
            this.sf.put(v, set2);
        }
        set2.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.pcc.put(it.next(), v);
        }
    }

    public V pcc(K k) {
        return this.pcc.get(k);
    }

    public void sf(K k) {
        Set<K> set;
        V remove = this.pcc.remove(k);
        if (remove == null || (set = this.sf.get(remove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.sf.remove(remove);
        }
    }

    public void pcc() {
        this.pcc.clear();
        this.sf.clear();
    }
}
