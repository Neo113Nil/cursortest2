package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class yb {
    public static final String a(Locale locale, Collection collection, char c3) {
        boolean z3;
        StringBuilder sb;
        if (locale != null) {
            sb = new StringBuilder();
            sb.append(locale);
            z3 = true;
        } else {
            z3 = false;
            sb = null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            if (locale2 != null) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                if (z3) {
                    sb.append(c3);
                }
                sb.append(locale2);
                z3 = true;
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }
}
