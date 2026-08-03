package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7N, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7N extends com.facebook.ads.redexgen.core.AbstractC1684hU {
    public static java.lang.String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public com.facebook.ads.redexgen.core.AbstractC0980Qm A00;
    public com.facebook.ads.redexgen.core.AbstractC0980Qm A01;

    private int A00(com.facebook.ads.redexgen.core.R2 r2, android.view.View view, com.facebook.ads.redexgen.core.AbstractC0980Qm abstractC0980Qm) {
        int containerCenter;
        int A0F = abstractC0980Qm.A0F(view) + (abstractC0980Qm.A0D(view) / 2);
        if (r2.A1V()) {
            int A0A = abstractC0980Qm.A0A();
            int childCenter = abstractC0980Qm.A0B();
            containerCenter = A0A + (childCenter / 2);
        } else {
            int childCenter2 = abstractC0980Qm.A06();
            containerCenter = childCenter2 / 2;
        }
        return A0F - containerCenter;
    }

    private android.view.View A01(com.facebook.ads.redexgen.core.R2 r2, com.facebook.ads.redexgen.core.AbstractC0980Qm abstractC0980Qm) {
        int i;
        int A0Y = r2.A0Y();
        if (A0Y == 0) {
            return null;
        }
        android.view.View view = null;
        if (r2.A1V()) {
            int A0A = abstractC0980Qm.A0A();
            int childCount = abstractC0980Qm.A0B();
            i = A0A + (childCount / 2);
        } else {
            int childCount2 = abstractC0980Qm.A06();
            i = childCount2 / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < A0Y; i3++) {
            android.view.View A0v = r2.A0v(i3);
            int A0F = abstractC0980Qm.A0F(A0v);
            int childCount3 = abstractC0980Qm.A0D(A0v);
            int childCount4 = java.lang.Math.abs((A0F + (childCount3 / 2)) - i);
            if (childCount4 < i2) {
                i2 = childCount4;
                java.lang.String[] strArr = A02;
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[1];
                int length = str.length();
                int childCount5 = str2.length();
                if (length != childCount5) {
                    throw new java.lang.RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = A0v;
            }
        }
        return view;
    }

    private android.view.View A02(com.facebook.ads.redexgen.core.R2 r2, com.facebook.ads.redexgen.core.AbstractC0980Qm abstractC0980Qm) {
        int A0Y = r2.A0Y();
        if (A0Y == 0) {
            return null;
        }
        android.view.View view = null;
        int i = Integer.MAX_VALUE;
        if (A02[7].charAt(21) == '9') {
            throw new java.lang.RuntimeException();
        }
        A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
        for (int childCount = 0; childCount < A0Y; childCount++) {
            android.view.View A0v = r2.A0v(childCount);
            int A0F = abstractC0980Qm.A0F(A0v);
            if (A0F < i) {
                i = A0F;
                view = A0v;
            }
        }
        return view;
    }

    private com.facebook.ads.redexgen.core.AbstractC0980Qm A03(com.facebook.ads.redexgen.core.R2 r2) {
        if (this.A00 == null || this.A00.A02 != r2) {
            this.A00 = com.facebook.ads.redexgen.core.AbstractC0980Qm.A00(r2);
        }
        return this.A00;
    }

    private com.facebook.ads.redexgen.core.AbstractC0980Qm A04(com.facebook.ads.redexgen.core.R2 r2) {
        if (this.A01 == null || this.A01.A02 != r2) {
            this.A01 = com.facebook.ads.redexgen.core.AbstractC0980Qm.A01(r2);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.AbstractC1684hU
    public final int A0C(com.facebook.ads.redexgen.core.R2 r2, int i, int i2) {
        int A0r;
        int centerPosition;
        int A0b = r2.A0b();
        if (A0b == 0) {
            return -1;
        }
        android.view.View view = null;
        if (r2.A23()) {
            view = A02(r2, A04(r2));
        } else if (r2.A22()) {
            view = A02(r2, A03(r2));
        }
        if (view == null || (A0r = r2.A0r(view)) == -1) {
            return -1;
        }
        if (r2.A22()) {
            centerPosition = i > 0 ? 1 : 0;
        } else {
            centerPosition = i2 > 0 ? 1 : 0;
        }
        boolean z = false;
        if (r2 instanceof com.facebook.ads.redexgen.core.RE) {
            int itemCount = A0b - 1;
            android.graphics.PointF A56 = ((com.facebook.ads.redexgen.core.RE) r2).A56(itemCount);
            if (A56 != null) {
                z = A56.x < 0.0f || A56.y < 0.0f;
            }
        }
        return z ? centerPosition != 0 ? A0r - 1 : A0r : centerPosition != 0 ? A0r + 1 : A0r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1684hU
    public final android.view.View A0D(com.facebook.ads.redexgen.core.R2 r2) {
        if (r2.A23()) {
            return A01(r2, A04(r2));
        }
        if (r2.A22()) {
            android.view.View A01 = A01(r2, A03(r2));
            if (A02[4].charAt(24) != 'v') {
                throw new java.lang.RuntimeException();
            }
            A02[5] = "ku3zp";
            return A01;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1684hU
    public final com.facebook.ads.redexgen.core.C1705hq A0E(com.facebook.ads.redexgen.core.R2 r2) {
        if (!(r2 instanceof com.facebook.ads.redexgen.core.RE)) {
            return null;
        }
        final android.content.Context context = super.A00.getContext();
        return new com.facebook.ads.redexgen.core.C1705hq(context) { // from class: com.facebook.ads.redexgen.X.7O
            @Override // com.facebook.ads.redexgen.core.C1705hq, com.facebook.ads.redexgen.core.RF
            public final void A0I(android.view.View view, com.facebook.ads.redexgen.core.RH rh, com.facebook.ads.redexgen.core.RD rd) {
                int[] A0H = com.facebook.ads.redexgen.core.C7N.this.A0H(((com.facebook.ads.redexgen.core.AbstractC1684hU) com.facebook.ads.redexgen.core.C7N.this).A00.getLayoutManager(), view);
                int time = A0H[0];
                int dy = A0H[1];
                int dx = A0M(java.lang.Math.max(java.lang.Math.abs(time), java.lang.Math.abs(dy)));
                if (dx > 0) {
                    rd.A04(time, dy, dx, ((com.facebook.ads.redexgen.core.C1705hq) this).A04);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C1705hq
            public final float A0J(android.util.DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // com.facebook.ads.redexgen.core.C1705hq
            public final int A0L(int i) {
                return java.lang.Math.min(100, super.A0L(i));
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1684hU
    public final int[] A0H(com.facebook.ads.redexgen.core.R2 r2, android.view.View view) {
        int[] iArr = new int[2];
        if (r2.A22()) {
            iArr[0] = A00(r2, view, A03(r2));
        } else {
            iArr[0] = 0;
        }
        if (r2.A23()) {
            iArr[1] = A00(r2, view, A04(r2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
