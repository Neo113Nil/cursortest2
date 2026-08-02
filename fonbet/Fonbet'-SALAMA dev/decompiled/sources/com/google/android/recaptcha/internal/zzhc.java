package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zzhc implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z4 = true;
        while (it.hasNext()) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(it.next());
            z4 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
