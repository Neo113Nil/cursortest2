package i3;

import android.util.Log;
import java.util.Locale;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13980a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13982c;

    public C1263a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f13981b = sb;
        this.f13980a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i7 = 2;
        while (i7 <= 7 && !Log.isLoggable(this.f13980a, i7)) {
            i7++;
        }
        this.f13982c = i7;
    }

    public final void a(String str, Object... objArr) {
        if (this.f13982c <= 3) {
            Log.d(this.f13980a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f13980a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f13980a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f13981b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f13982c <= 2) {
            Log.v(this.f13980a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f13980a, d(str, objArr));
    }
}
