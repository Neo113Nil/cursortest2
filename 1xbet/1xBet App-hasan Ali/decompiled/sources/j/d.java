package j;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f17382a;

    /* renamed from: b, reason: collision with root package name */
    public int f17383b;

    /* renamed from: c, reason: collision with root package name */
    public int f17384c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.f17384c) + 0.5f);
        int i5 = this.f17383b;
        int[] iArr = this.f17382a;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = iArr[i6];
            if (i < i7) {
                break;
            }
            i -= i7;
            i6++;
        }
        return (i6 / i5) + (i6 < i5 ? i / this.f17384c : 0.0f);
    }
}
