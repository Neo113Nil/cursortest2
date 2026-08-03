package com.ironsource;

/* loaded from: classes5.dex */
public interface B4 {

    /* renamed from: com.ironsource.B4$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ java.lang.String a(com.ironsource.B4 b4, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return b4.a(str, str2);
        }
    }

    java.lang.String a(java.lang.String str, java.lang.String str2);

    void a(java.lang.String str);

    java.util.Map<java.lang.String, ?> allData();

    void b(java.lang.String str, java.lang.String str2);
}
