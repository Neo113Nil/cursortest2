package com.instagram.common.viewpoint.core;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.6G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6G extends C1332gH {
    public static String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ C6F A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.C1332gH
    public final int A0O(View view, int i) {
        int i2;
        QO A08 = A08();
        if (!A08.A22()) {
            return 0;
        }
        QP qp = (QP) view.getLayoutParams();
        int A0N = A0N(A08.A0m(view) - qp.leftMargin, A08.A0p(view) + qp.rightMargin, A08.A0g(), A08.A0j() - A08.A0h(), i);
        i2 = this.A00.A02;
        int i3 = A0N + i2;
        if (A01[0].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6G(C6F c6f, C1153dL c1153dL) {
        super(c1153dL);
        this.A00 = c6f;
    }

    @Override // com.instagram.common.viewpoint.core.C1332gH
    public final float A0J(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.instagram.common.viewpoint.core.C1332gH
    public final int A0K() {
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.C1332gH
    public final PointF A0P(int i) {
        return this.A00.A4y(i);
    }
}
