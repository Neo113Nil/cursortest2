package com.payair.hce;

/* loaded from: classes4.dex */
public final class setHeaderDividersEnabled implements com.payair.hce.setSelectedGroup {
    private static int valueOf = 1;
    private static int values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Object obj = objArr[2];
        int i4 = (valueOf + 115) % 128;
        values = i4;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        valueOf = (((i4 & 72) + (i4 | 72)) - 1) % 128;
        return bool;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return writeReplace(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 1864654348, -1864654348, java.lang.System.identityHashCode(this));
    }
}
