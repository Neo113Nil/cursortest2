package B1;

import android.view.View;
import android.view.ViewGroup;
import k1.C7464j;
import n8.InterfaceC8452b;

/* renamed from: B1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2548q implements n8.e {
    public static final float b(long j11, long j12) {
        return C7464j.d(j12) / C7464j.d(j11);
    }

    public static final float c(long j11, long j12) {
        return Math.min(C7464j.f(j12) / C7464j.f(j11), C7464j.d(j12) / C7464j.d(j11));
    }

    public static View d(int i11, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View findViewById = viewGroup.getChildAt(i12).findViewById(i11);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return new Z8.h((com.google.mlkit.common.sdkinternal.h) interfaceC8452b.a(com.google.mlkit.common.sdkinternal.h.class));
    }
}
