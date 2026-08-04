package p062i3;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13988c;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f13987b = string;
        this.f13986a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i7 = 2;
        while (i7 <= 7 && !Log.isLoggable(this.f13986a, i7)) {
            i7++;
        }
        this.f13988c = i7;
    }

    public final void a(String str, Object... objArr) {
        if (this.f13988c <= 3) {
            Log.d(this.f13986a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f13986a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f13986a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f13987b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f13988c <= 2) {
            Log.v(this.f13986a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f13986a, d(str, objArr));
    }
}
