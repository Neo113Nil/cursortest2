package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final int c;

    public a(@NonNull String str, @NonNull String... strArr) {
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
        this.b = sb;
        this.a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public final void a(@NonNull String str, @NonNull Object... objArr) {
        if (this.c <= 3) {
            b(str, objArr);
        }
    }

    @NonNull
    public final void b(@NonNull String str, @NonNull Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        this.b.concat(str);
    }

    public final void c(@NonNull String str, @NonNull Object... objArr) {
        if (this.c <= 2) {
            b(str, objArr);
        }
    }
}
