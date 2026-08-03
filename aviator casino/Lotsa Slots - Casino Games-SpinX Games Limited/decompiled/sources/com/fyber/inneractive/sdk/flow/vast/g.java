package com.fyber.inneractive.sdk.flow.vast;

/* loaded from: classes3.dex */
public final class g implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3764a;
    public final int b;
    public final int c;

    public g(int i, int i2, int i3) {
        this.f3764a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.model.vast.r rVar = (com.fyber.inneractive.sdk.model.vast.r) obj;
        com.fyber.inneractive.sdk.model.vast.r rVar2 = (com.fyber.inneractive.sdk.model.vast.r) obj2;
        int i = -1;
        if (android.text.TextUtils.equals("VPAID", rVar2.f)) {
            return -1;
        }
        if (!android.text.TextUtils.equals("VPAID", rVar.f)) {
            java.lang.Integer num = rVar.e;
            int intValue = num == null ? 0 : num.intValue();
            java.lang.Integer num2 = rVar2.e;
            int intValue2 = num2 == null ? 0 : num2.intValue();
            int i2 = this.f3764a;
            if (intValue2 > i2 && intValue <= i2) {
                return -1;
            }
            if (intValue <= i2 || intValue2 > i2) {
                com.fyber.inneractive.sdk.model.vast.t a2 = com.fyber.inneractive.sdk.model.vast.t.a(rVar2.d);
                com.fyber.inneractive.sdk.model.vast.t tVar = com.fyber.inneractive.sdk.model.vast.t.MEDIA_TYPE_MP4;
                java.lang.Integer num3 = a2 == tVar ? 3 : a2 == com.fyber.inneractive.sdk.model.vast.t.MEDIA_TYPE_3GPP ? 2 : a2 == com.fyber.inneractive.sdk.model.vast.t.MEDIA_TYPE_WEBM ? 1 : -1;
                com.fyber.inneractive.sdk.model.vast.t a3 = com.fyber.inneractive.sdk.model.vast.t.a(rVar.d);
                if (a3 == tVar) {
                    i = 3;
                } else if (a3 == com.fyber.inneractive.sdk.model.vast.t.MEDIA_TYPE_3GPP) {
                    i = 2;
                } else if (a3 == com.fyber.inneractive.sdk.model.vast.t.MEDIA_TYPE_WEBM) {
                    i = 1;
                }
                int compareTo = num3.compareTo(i);
                if (compareTo != 0) {
                    return compareTo;
                }
                if (intValue >= intValue2) {
                    if (intValue > intValue2) {
                        return -1;
                    }
                    java.lang.Integer num4 = rVar.b;
                    int intValue3 = num4 == null ? 0 : num4.intValue();
                    java.lang.Integer num5 = rVar.c;
                    int intValue4 = num5 == null ? 0 : num5.intValue();
                    java.lang.Integer num6 = rVar2.b;
                    int intValue5 = num6 == null ? 0 : num6.intValue();
                    java.lang.Integer num7 = rVar2.c;
                    int i3 = intValue3 * intValue4;
                    int intValue6 = intValue5 * (num7 == null ? 0 : num7.intValue());
                    int i4 = this.b * this.c;
                    int abs = java.lang.Math.abs(i3 - i4);
                    int abs2 = java.lang.Math.abs(intValue6 - i4);
                    if (abs < abs2) {
                        return -1;
                    }
                    if (abs <= abs2) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
