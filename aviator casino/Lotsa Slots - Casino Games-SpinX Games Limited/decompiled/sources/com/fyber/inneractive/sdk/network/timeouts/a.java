package com.fyber.inneractive.sdk.network.timeouts;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3858a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public boolean g = false;

    public final int a() {
        int max;
        int i = this.c;
        int i2 = this.d;
        if (i2 <= 0) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s Unable resolve retries because of invalid ILAT: %d, will set retries to 0", com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.network.timeouts.content.a.class), java.lang.Integer.valueOf(i2));
            max = 0;
        } else {
            int i3 = i / i2;
            int i4 = i3 - 1;
            if (i4 > 3) {
                i4 = i3 - 2;
            }
            max = java.lang.Math.max(i4, 0);
        }
        int i5 = this.c;
        int i6 = this.d;
        int i7 = this.e;
        int i8 = this.f;
        int max2 = java.lang.Math.max(0, i5);
        int max3 = java.lang.Math.max(0, i6);
        int max4 = java.lang.Math.max(0, max);
        int max5 = java.lang.Math.max(0, (max2 - (java.lang.Math.max(0, i7) * max4)) - (java.lang.Math.max(0, i8) * max4));
        int max6 = java.lang.Math.max(0, max3);
        if (max4 > 0) {
            max5 %= max6;
        }
        int max7 = java.lang.Math.max(max5, 0);
        if (max7 == 0 && max > 2) {
            max--;
            max7 = this.d;
        }
        int i9 = max + 1;
        int max8 = java.lang.Math.max(0, max7);
        if (i9 > 0) {
            max8 /= i9;
        }
        this.b = max8;
        return java.lang.Math.max(0, a(this.c, this.d, max8, 0) - 1);
    }

    public static int a(int i, int i2, int i3, int i4) {
        int max = java.lang.Math.max(0, i);
        if (i2 <= 0) {
            i2 = max;
        }
        int max2 = java.lang.Math.max(0, i3);
        int max3 = java.lang.Math.max(0, i4);
        int i5 = max3 + 1;
        int i6 = max - ((max2 * max3) + i2);
        if (i6 < 0) {
            return java.lang.Math.max(max3, 0);
        }
        if (i6 == 0) {
            return java.lang.Math.max(i5, 0);
        }
        return a(i6, i2, max2, i5);
    }
}
