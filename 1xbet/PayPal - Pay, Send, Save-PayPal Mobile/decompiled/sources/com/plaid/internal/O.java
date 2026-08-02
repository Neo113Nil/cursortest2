package com.plaid.internal;

/* loaded from: classes16.dex */
public final class O implements com.plaid.internal.X3 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5866a;

        static {
            int[] iArr = new int[com.plaid.internal.W3.values().length];
            f5866a = iArr;
            try {
                iArr[com.plaid.internal.W3.TRACE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f5866a[com.plaid.internal.W3.DEBUG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f5866a[com.plaid.internal.W3.WARN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f5866a[com.plaid.internal.W3.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.plaid.internal.X3
    public final void a(com.plaid.internal.W3 w3, java.lang.String str) {
        int i = com.plaid.internal.O.a.f5866a[w3.ordinal()];
    }

    @Override // com.plaid.internal.X3
    public final void a(com.plaid.internal.W3 w3, java.lang.String str, java.lang.Exception exc) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('\n');
        sb.append(android.util.Log.getStackTraceString(exc));
        a(w3, sb.toString());
    }
}
