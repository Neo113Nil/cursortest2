package com.nimbusds.jose.crypto.opts;

/* loaded from: classes4.dex */
public class OptionUtils {
    public static <T extends com.nimbusds.jose.JWSSignerOption> boolean optionIsPresent(java.util.Set<com.nimbusds.jose.JWSSignerOption> set, java.lang.Class<T> cls) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        java.util.Iterator<com.nimbusds.jose.JWSSignerOption> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
