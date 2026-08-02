package s2;

import android.text.Layout;
import j2.C1304a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f16130c;

    /* renamed from: a, reason: collision with root package name */
    public long f16128a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f16129b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f16131d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f16132e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f16133f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f16134g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f16135h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public int f16136i = Integer.MIN_VALUE;
    public float j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f16137k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0071, code lost:
    
        if (r7 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1304a a() {
        Layout.Alignment alignment;
        float f7;
        CharSequence charSequence;
        float f8 = this.f16135h;
        float f9 = -3.4028235E38f;
        if (f8 == -3.4028235E38f) {
            int i7 = this.f16131d;
            f8 = i7 != 4 ? i7 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i8 = this.f16136i;
        if (i8 == Integer.MIN_VALUE) {
            int i9 = this.f16131d;
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            i8 = 1;
                        }
                    }
                }
                i8 = 2;
            }
            i8 = 0;
        }
        C1304a c1304a = new C1304a();
        int i10 = this.f16131d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            AbstractC1663a.j(i10, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            c1304a.f14553c = alignment;
            f7 = this.f16132e;
            int i11 = this.f16133f;
            if (f7 != -3.4028235E38f || i11 != 0 || (f7 >= 0.0f && f7 <= 1.0f)) {
                if (f7 == -3.4028235E38f) {
                    f9 = f7;
                }
                c1304a.f14555e = f9;
                c1304a.f14556f = i11;
                c1304a.f14557g = this.f16134g;
                c1304a.f14558h = f8;
                c1304a.f14559i = i8;
                float f10 = this.j;
                if (i8 == 0) {
                    f8 = 1.0f - f8;
                } else if (i8 == 1) {
                    f8 = f8 <= 0.5f ? f8 * 2.0f : (1.0f - f8) * 2.0f;
                } else if (i8 != 2) {
                    throw new IllegalStateException(String.valueOf(i8));
                }
                c1304a.f14561l = Math.min(f10, f8);
                c1304a.f14565p = this.f16137k;
                charSequence = this.f16130c;
                if (charSequence != null) {
                    c1304a.f14551a = charSequence;
                }
                return c1304a;
            }
            f9 = 1.0f;
            c1304a.f14555e = f9;
            c1304a.f14556f = i11;
            c1304a.f14557g = this.f16134g;
            c1304a.f14558h = f8;
            c1304a.f14559i = i8;
            float f102 = this.j;
            if (i8 == 0) {
            }
            c1304a.f14561l = Math.min(f102, f8);
            c1304a.f14565p = this.f16137k;
            charSequence = this.f16130c;
            if (charSequence != null) {
            }
            return c1304a;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        c1304a.f14553c = alignment;
        f7 = this.f16132e;
        int i112 = this.f16133f;
        if (f7 != -3.4028235E38f) {
        }
        if (f7 == -3.4028235E38f) {
        }
        c1304a.f14555e = f9;
        c1304a.f14556f = i112;
        c1304a.f14557g = this.f16134g;
        c1304a.f14558h = f8;
        c1304a.f14559i = i8;
        float f1022 = this.j;
        if (i8 == 0) {
        }
        c1304a.f14561l = Math.min(f1022, f8);
        c1304a.f14565p = this.f16137k;
        charSequence = this.f16130c;
        if (charSequence != null) {
        }
        return c1304a;
    }
}
