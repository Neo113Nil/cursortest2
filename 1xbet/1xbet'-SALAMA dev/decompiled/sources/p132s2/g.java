package p132s2;

import android.text.Layout;
import p068j2.a;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f16136c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16134a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16135b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16137d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16138e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16139f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16140g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16141h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16142i = Integer.MIN_VALUE;
    public float j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16143k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    public final a a() {
        Layout.Alignment alignment;
        float f7 = this.f16141h;
        float f8 = -3.4028235E38f;
        if (f7 == -3.4028235E38f) {
            int i7 = this.f16137d;
            if (i7 != 4) {
                f7 = i7 != 5 ? 0.5f : 1.0f;
            } else {
                f7 = 0.0f;
            }
        }
        int i8 = this.f16142i;
        if (i8 == Integer.MIN_VALUE) {
            int i9 = this.f16137d;
            if (i9 == 1) {
                i8 = 0;
            } else if (i9 == 3) {
                i8 = 2;
            } else if (i9 == 4) {
                i8 = 0;
            } else if (i9 != 5) {
                i8 = 1;
            } else {
                i8 = 2;
            }
        }
        a aVar = new a();
        int i10 = this.f16137d;
        if (i10 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i10 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i10 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i10 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i10 != 5) {
            p150v0.a.j(i10, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        aVar.f14559c = alignment;
        float f9 = this.f16138e;
        int i11 = this.f16139f;
        if (f9 != -3.4028235E38f && i11 == 0 && (f9 < 0.0f || f9 > 1.0f)) {
            f8 = 1.0f;
        } else if (f9 != -3.4028235E38f) {
            f8 = f9;
        } else if (i11 == 0) {
            f8 = 1.0f;
        }
        aVar.f14561e = f8;
        aVar.f14562f = i11;
        aVar.f14563g = this.f16140g;
        aVar.f14564h = f7;
        aVar.f14565i = i8;
        float f10 = this.j;
        if (i8 == 0) {
            f7 = 1.0f - f7;
        } else if (i8 == 1) {
            f7 = f7 <= 0.5f ? f7 * 2.0f : (1.0f - f7) * 2.0f;
        } else if (i8 != 2) {
            throw new IllegalStateException(String.valueOf(i8));
        }
        aVar.f14567l = Math.min(f10, f7);
        aVar.f14571p = this.f16143k;
        CharSequence charSequence = this.f16136c;
        if (charSequence != null) {
            aVar.f14557a = charSequence;
        }
        return aVar;
    }
}
