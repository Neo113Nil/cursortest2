package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class Jn {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static In a(Throwable th, int i3, int i4) {
        StackTraceElement[] stackTraceElementArr;
        In in;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(new Hl(stackTraceElement));
        }
        Throwable cause = th.getCause();
        ArrayList arrayList2 = null;
        if (cause != null) {
            if (i4 >= i3) {
                cause = null;
            }
            if (cause != null) {
                in = a(cause, 30, i4 + 1);
                if (i4 < i3) {
                    Throwable[] suppressed = th.getSuppressed();
                    arrayList2 = new ArrayList(suppressed.length);
                    for (Throwable th2 : suppressed) {
                        arrayList2.add(a(th2, 1, i4));
                    }
                }
                return new In(name, message, arrayList, in, arrayList2);
            }
        }
        in = null;
        if (i4 < i3) {
        }
        return new In(name, message, arrayList, in, arrayList2);
    }
}
