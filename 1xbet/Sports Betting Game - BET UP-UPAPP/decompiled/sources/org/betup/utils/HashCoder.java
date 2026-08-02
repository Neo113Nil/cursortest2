package org.betup.utils;

/* loaded from: classes4.dex */
public final class HashCoder {
    private HashCoder() {
    }

    public static int hashCode(Object o, Object... objects) {
        int hashCode = o != null ? 7 + (o.hashCode() * 31) : 7;
        for (Object obj : objects) {
            if (obj != null) {
                hashCode += obj.hashCode() * 13;
            }
        }
        return hashCode;
    }
}
