package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.6h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02016h extends AbstractC1314fy {
    public static String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public Q8 A00;
    public Q8 A01;

    private int A00(QO qo, View view, Q8 q8) {
        int containerCenter;
        int A0F = q8.A0F(view) + (q8.A0D(view) / 2);
        if (qo.A1V()) {
            int A0A = q8.A0A();
            int childCenter = q8.A0B();
            containerCenter = A0A + (childCenter / 2);
        } else {
            int childCenter2 = q8.A06();
            containerCenter = childCenter2 / 2;
        }
        return A0F - containerCenter;
    }

    private View A01(QO qo, Q8 q8) {
        int i;
        int A0Y = qo.A0Y();
        if (A0Y == 0) {
            return null;
        }
        View view = null;
        if (qo.A1V()) {
            int A0A = q8.A0A();
            int childCount = q8.A0B();
            i = A0A + (childCount / 2);
        } else {
            int childCount2 = q8.A06();
            i = childCount2 / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < A0Y; i3++) {
            View A0v = qo.A0v(i3);
            int A0F = q8.A0F(A0v);
            int childCount3 = q8.A0D(A0v);
            int childCount4 = Math.abs((A0F + (childCount3 / 2)) - i);
            if (childCount4 < i2) {
                i2 = childCount4;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[1];
                int length = str.length();
                int childCount5 = str2.length();
                if (length != childCount5) {
                    throw new RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = A0v;
            }
        }
        return view;
    }

    private View A02(QO qo, Q8 q8) {
        int A0Y = qo.A0Y();
        if (A0Y == 0) {
            return null;
        }
        View view = null;
        int i = Integer.MAX_VALUE;
        if (A02[7].charAt(21) == '9') {
            throw new RuntimeException();
        }
        A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
        for (int childCount = 0; childCount < A0Y; childCount++) {
            View A0v = qo.A0v(childCount);
            int A0F = q8.A0F(A0v);
            if (A0F < i) {
                i = A0F;
                view = A0v;
            }
        }
        return view;
    }

    private Q8 A03(QO qo) {
        if (this.A00 == null || this.A00.A02 != qo) {
            this.A00 = Q8.A00(qo);
        }
        return this.A00;
    }

    private Q8 A04(QO qo) {
        if (this.A01 == null || this.A01.A02 != qo) {
            this.A01 = Q8.A01(qo);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.common.viewpoint.core.AbstractC1314fy
    public final int A0C(QO qo, int i, int i2) {
        int A0r;
        int centerPosition;
        int A0b = qo.A0b();
        if (A0b == 0) {
            return -1;
        }
        View view = null;
        if (qo.A23()) {
            view = A02(qo, A04(qo));
        } else if (qo.A22()) {
            view = A02(qo, A03(qo));
        }
        if (view == null || (A0r = qo.A0r(view)) == -1) {
            return -1;
        }
        if (qo.A22()) {
            centerPosition = i > 0 ? 1 : 0;
        } else {
            centerPosition = i2 > 0 ? 1 : 0;
        }
        boolean z = false;
        if (qo instanceof InterfaceC0694Qa) {
            int itemCount = A0b - 1;
            PointF A4y = ((InterfaceC0694Qa) qo).A4y(itemCount);
            if (A4y != null) {
                z = A4y.x < 0.0f || A4y.y < 0.0f;
            }
        }
        return z ? centerPosition != 0 ? A0r - 1 : A0r : centerPosition != 0 ? A0r + 1 : A0r;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1314fy
    public final View A0D(QO qo) {
        if (qo.A23()) {
            return A01(qo, A04(qo));
        }
        if (qo.A22()) {
            View A01 = A01(qo, A03(qo));
            if (A02[4].charAt(24) != 'v') {
                throw new RuntimeException();
            }
            A02[5] = "ku3zp";
            return A01;
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1314fy
    public final C1332gH A0E(QO qo) {
        if (!(qo instanceof InterfaceC0694Qa)) {
            return null;
        }
        final Context context = super.A00.getContext();
        return new C1332gH(context) { // from class: com.facebook.ads.redexgen.X.6i
            @Override // com.instagram.common.viewpoint.core.C1332gH, com.instagram.common.viewpoint.core.AbstractC0695Qb
            public final void A0I(View view, C0697Qd c0697Qd, QZ qz) {
                int[] A0H = C02016h.this.A0H(((AbstractC1314fy) C02016h.this).A00.getLayoutManager(), view);
                int time = A0H[0];
                int dy = A0H[1];
                int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
                if (dx > 0) {
                    qz.A04(time, dy, dx, ((C1332gH) this).A04);
                }
            }

            @Override // com.instagram.common.viewpoint.core.C1332gH
            public final float A0J(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // com.instagram.common.viewpoint.core.C1332gH
            public final int A0L(int i) {
                return Math.min(100, super.A0L(i));
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1314fy
    public final int[] A0H(QO qo, View view) {
        int[] iArr = new int[2];
        if (qo.A22()) {
            iArr[0] = A00(qo, view, A03(qo));
        } else {
            iArr[0] = 0;
        }
        if (qo.A23()) {
            iArr[1] = A00(qo, view, A04(qo));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
