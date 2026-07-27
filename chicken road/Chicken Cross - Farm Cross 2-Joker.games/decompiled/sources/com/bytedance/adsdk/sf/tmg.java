package com.bytedance.adsdk.sf;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class tmg<V> {
    private final V pcc;
    private final Throwable sf;

    public tmg(V v) {
        this.pcc = v;
        this.sf = null;
    }

    public tmg(Throwable th) {
        this.sf = th;
        this.pcc = null;
    }

    public V pcc() {
        return this.pcc;
    }

    public Throwable sf() {
        return this.sf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmg)) {
            return false;
        }
        tmg tmgVar = (tmg) obj;
        if (pcc() != null && pcc().equals(tmgVar.pcc())) {
            return true;
        }
        if (sf() == null || tmgVar.sf() == null) {
            return false;
        }
        return sf().toString().equals(sf().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{pcc(), sf()});
    }
}
