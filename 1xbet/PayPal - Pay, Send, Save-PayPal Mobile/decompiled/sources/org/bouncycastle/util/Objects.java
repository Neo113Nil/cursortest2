package org.bouncycastle.util;

/* loaded from: classes17.dex */
public class Objects {
    public static int hashCode(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean areEqual(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }
}
