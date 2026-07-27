package com.bytedance.adsdk.sf;

import com.ironsource.U3;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class gbb<K, V> {
    private int gm;
    private int kj;
    private int oo;
    private final LinkedHashMap<K, V> pcc;
    private int qf;
    private int sf;
    private int vj;
    private int wh;

    protected int sf(K k, V v) {
        return 1;
    }

    protected V sf(K k) {
        return null;
    }

    public gbb(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.gm = i;
        this.pcc = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V pcc(K k) {
        V put;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.pcc.get(k);
            if (v != null) {
                this.qf++;
                return v;
            }
            this.kj++;
            V sf = sf(k);
            if (sf == null) {
                return null;
            }
            synchronized (this) {
                this.vj++;
                put = this.pcc.put(k, sf);
                if (put != null) {
                    this.pcc.put(k, put);
                } else {
                    this.sf += gm(k, sf);
                }
            }
            if (put != null) {
                return put;
            }
            pcc(this.gm);
            return sf;
        }
    }

    public final V pcc(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.oo++;
            this.sf += gm(k, v);
            put = this.pcc.put(k, v);
            if (put != null) {
                this.sf -= gm(k, put);
            }
        }
        pcc(this.gm);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(int i) {
        while (true) {
            synchronized (this) {
                if (this.sf >= 0 && (!this.pcc.isEmpty() || this.sf == 0)) {
                    if (this.sf <= i || this.pcc.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.pcc.entrySet().iterator().next();
                    K key = next.getKey();
                    V value = next.getValue();
                    this.pcc.remove(key);
                    this.sf -= gm(key, value);
                    this.wh++;
                } else {
                    break;
                }
            }
        }
    }

    private int gm(K k, V v) {
        int sf = sf(k, v);
        if (sf >= 0) {
            return sf;
        }
        throw new IllegalStateException("Negative size: " + k + U3.j.b + v);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.qf;
        i2 = this.kj + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.gm), Integer.valueOf(this.qf), Integer.valueOf(this.kj), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
