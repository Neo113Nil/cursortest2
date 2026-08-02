package androidx.core.view;

import android.os.Build;

/* renamed from: androidx.core.view.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5335p {
    static int a() {
        int i11 = Build.VERSION.SDK_INT;
        int i12 = i11 < 30 ? 1 : 16;
        if (i11 >= 27 || !(i12 == 7 || i12 == 8 || i12 == 9)) {
            return i12;
        }
        return -1;
    }
}
