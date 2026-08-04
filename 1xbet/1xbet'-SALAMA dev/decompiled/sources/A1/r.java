package A1;

import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Exception implements InterfaceC0027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X f540f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p018c2.C f542y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f543z;

    public r(int i7, Exception exc, int i8) {
        this(i7, exc, i8, null, -1, null, 4, false);
    }

    public final r a(p018c2.C c3) {
        String message = getMessage();
        int i7 = p151v2.t.f17159a;
        return new r(message, getCause(), this.f535a, this.f537c, this.f538d, this.f539e, this.f540f, this.f541x, c3, this.f536b, this.f543z);
    }

    public r(String str, Throwable th, int i7, int i8, String str2, int i9, X x4, int i10, p018c2.C c3, long j, boolean z4) {
        super(str, th);
        this.f535a = i7;
        this.f536b = j;
        p151v2.a.f(!z4 || i8 == 1);
        p151v2.a.f(th != null || i8 == 3);
        this.f537c = i8;
        this.f538d = str2;
        this.f539e = i9;
        this.f540f = x4;
        this.f541x = i10;
        this.f542y = c3;
        this.f543z = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(int i7, Exception exc, int i8, String str, int i9, X x4, int i10, boolean z4) {
        String string;
        String str2;
        if (i7 == 0) {
            string = "Source error";
        } else if (i7 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i9);
            sb.append(", format=");
            sb.append(x4);
            sb.append(", format_supported=");
            int i11 = p151v2.t.f17159a;
            if (i10 == 0) {
                str2 = "NO";
            } else if (i10 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i10 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i10 == 4) {
                str2 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str2);
            string = sb.toString();
        } else if (i7 != 3) {
            string = "Unexpected runtime error";
        } else {
            string = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? string : p031e1.k.e(string, ": null"), exc, i8, i7, str, i9, x4, i10, null, SystemClock.elapsedRealtime(), z4);
    }
}
