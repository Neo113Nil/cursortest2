package com.baseflow.permissionhandler;

/* loaded from: classes3.dex */
public final class a implements com.google.android.datatransport.runtime.time.a {
    public static boolean b(int i) {
        return i >= 2;
    }

    public static int c(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long a() {
        return System.currentTimeMillis();
    }
}
