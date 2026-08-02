package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Ou implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC1400ot.q(getKey(), entry.getKey()) && AbstractC1400ot.q(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC0467k.v(String.valueOf(getKey()), "=", String.valueOf(getValue()));
    }
}
