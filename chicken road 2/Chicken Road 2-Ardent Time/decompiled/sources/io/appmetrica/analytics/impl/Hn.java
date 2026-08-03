package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Hn {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.appmetrica.analytics.impl.Gn a(java.lang.Throwable th, int i2, int i3) {
        java.lang.StackTraceElement[] stackTraceElementArr;
        io.appmetrica.analytics.impl.Gn gn;
        java.util.ArrayList arrayList;
        java.lang.String name = th.getClass().getName();
        java.lang.String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (java.lang.Throwable unused) {
            stackTraceElementArr = new java.lang.StackTraceElement[0];
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(stackTraceElementArr.length);
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList2.add(new io.appmetrica.analytics.impl.Dl(stackTraceElement));
        }
        java.lang.Throwable cause = th.getCause();
        if (cause != null) {
            if (i3 >= i2) {
                cause = null;
            }
            if (cause != null) {
                gn = a(cause, 30, i3 + 1);
                if (i3 >= i2) {
                    java.lang.Throwable[] suppressed = th.getSuppressed();
                    arrayList = new java.util.ArrayList(suppressed.length);
                    for (java.lang.Throwable th2 : suppressed) {
                        arrayList.add(a(th2, 1, i3));
                    }
                } else {
                    arrayList = null;
                }
                return new io.appmetrica.analytics.impl.Gn(name, message, arrayList2, gn, arrayList);
            }
        }
        gn = null;
        if (i3 >= i2) {
        }
        return new io.appmetrica.analytics.impl.Gn(name, message, arrayList2, gn, arrayList);
    }
}
