package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class du extends com.ironsource.adqualitysdk.sdk.i.dy {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1842 = {56641, '-', 4914, 9933, 14749, 19754, 24816, 29573, 34627, 39655, 44459, 49412, 54289, 59327, 64370, 3584};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1843 = 7388672903279874897L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1844 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1845 = 1;

    public du(java.lang.String str, java.lang.String str2, com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        super(str, str2);
        m7603(str, str2, eeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001f, code lost:
    
        r12 = r12.m7713().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r12.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r3 = r12.next();
        r4 = new java.lang.StringBuilder();
        r4.append(r10);
        r4.append(m7602((char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 56687), android.view.View.MeasureSpec.getSize(0), (android.os.Process.myPid() >> 22) + 1).intern());
        r4.append(r11);
        m7661(new com.ironsource.adqualitysdk.sdk.i.dw(r4.toString(), r3.m7708().m7669(), r1, r3.m7711()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:
    
        if (r12 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r12 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0077, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append(r10);
        r1.append(m7602((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", 0) + 15).intern());
        m7661(new com.ironsource.adqualitysdk.sdk.i.dw(r10, r11, r1.toString()));
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m7603(java.lang.String str, java.lang.String str2, com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        java.lang.String m7662;
        int i = 2 % 2;
        int i2 = f1844 + 47;
        f1845 = i2 % 128;
        if (i2 % 2 == 0) {
            m7662 = m7662();
            int i3 = 33 / 0;
        } else {
            m7662 = m7662();
        }
        java.lang.StackTraceElement[] stackTrace = new java.lang.Exception().getStackTrace();
        java.util.ArrayList<java.lang.StackTraceElement> arrayList = new java.util.ArrayList();
        java.lang.String name = com.ironsource.adqualitysdk.sdk.i.dz.class.getName();
        int i4 = f1845 + 117;
        f1844 = i4 % 128;
        int i5 = i4 % 2;
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[length];
            if (stackTraceElement.getClassName().equals(name)) {
                break;
            }
            arrayList.add(0, stackTraceElement);
        }
        for (java.lang.StackTraceElement stackTraceElement2 : arrayList) {
            m7661(new com.ironsource.adqualitysdk.sdk.i.dw(stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), stackTraceElement2.getLineNumber()));
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7602(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f1842[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f1843)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
