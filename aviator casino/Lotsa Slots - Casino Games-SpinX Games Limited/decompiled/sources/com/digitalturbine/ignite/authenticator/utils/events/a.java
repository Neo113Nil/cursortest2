package com.digitalturbine.ignite.authenticator.utils.events;

/* loaded from: classes2.dex */
public abstract class a {
    public static java.lang.Object[] a(java.lang.Throwable th, com.digitalturbine.ignite.authenticator.events.c cVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(new android.util.Pair("exception_name", th.getClass().getSimpleName()));
        arrayList.add(new android.util.Pair("description", th.getMessage()));
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.lang.String stringBuffer = stringWriter.getBuffer().toString();
        if (!android.text.TextUtils.isEmpty(stringBuffer)) {
            arrayList.add(new android.util.Pair("stack_trace", stringBuffer));
        }
        if (cVar != null) {
            arrayList.add(new android.util.Pair(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, cVar.a()));
        }
        java.lang.Object[] objArr = new java.lang.Object[arrayList.size() * 2];
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            android.util.Pair pair = (android.util.Pair) arrayList.get(i3);
            objArr[i2] = pair.first;
            objArr[i] = pair.second;
            i2 += 2;
            i += 2;
        }
        return objArr;
    }
}
