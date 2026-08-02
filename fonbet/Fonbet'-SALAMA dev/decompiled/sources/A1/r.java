package A1;

import android.os.SystemClock;
import android.text.TextUtils;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class r extends Exception implements InterfaceC0027k {

    /* renamed from: a, reason: collision with root package name */
    public final int f535a;

    /* renamed from: b, reason: collision with root package name */
    public final long f536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f537c;

    /* renamed from: d, reason: collision with root package name */
    public final String f538d;

    /* renamed from: e, reason: collision with root package name */
    public final int f539e;

    /* renamed from: f, reason: collision with root package name */
    public final X f540f;

    /* renamed from: x, reason: collision with root package name */
    public final int f541x;

    /* renamed from: y, reason: collision with root package name */
    public final c2.C f542y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f543z;

    public r(int i7, Exception exc, int i8) {
        this(i7, exc, i8, null, -1, null, 4, false);
    }

    public final r a(c2.C c3) {
        String message = getMessage();
        int i7 = v2.t.f17153a;
        return new r(message, getCause(), this.f535a, this.f537c, this.f538d, this.f539e, this.f540f, this.f541x, c3, this.f536b, this.f543z);
    }

    public r(String str, Throwable th, int i7, int i8, String str2, int i9, X x4, int i10, c2.C c3, long j, boolean z4) {
        super(str, th);
        this.f535a = i7;
        this.f536b = j;
        AbstractC1664a.f(!z4 || i8 == 1);
        AbstractC1664a.f(th != null || i8 == 3);
        this.f537c = i8;
        this.f538d = str2;
        this.f539e = i9;
        this.f540f = x4;
        this.f541x = i10;
        this.f542y = c3;
        this.f543z = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(int i7, Exception exc, int i8, String str, int i9, X x4, int i10, boolean z4) {
        this(TextUtils.isEmpty(null) ? r0 : e1.k.e(r0, ": null"), exc, i8, i7, str, i9, x4, i10, null, SystemClock.elapsedRealtime(), z4);
        String str2;
        String str3;
        if (i7 == 0) {
            str2 = "Source error";
        } else if (i7 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i9);
            sb.append(", format=");
            sb.append(x4);
            sb.append(", format_supported=");
            int i11 = v2.t.f17153a;
            if (i10 == 0) {
                str3 = "NO";
            } else if (i10 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i10 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i10 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str3);
            str2 = sb.toString();
        } else if (i7 != 3) {
            str2 = "Unexpected runtime error";
        } else {
            str2 = "Remote error";
        }
    }
}
