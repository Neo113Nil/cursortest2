package s2;

import A1.C0045t0;
import C1.C0095a;
import java.util.regex.Pattern;
import v2.t;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16144a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(C0095a c0095a) {
        String h6 = c0095a.h();
        return h6 != null && h6.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i7 = t.f17153a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j3 = j * 1000;
        if (split.length == 2) {
            j3 += Long.parseLong(split[1]);
        }
        return j3 * 1000;
    }

    public static void d(C0095a c0095a) {
        int i7 = c0095a.f1463a;
        if (a(c0095a)) {
            return;
        }
        c0095a.D(i7);
        throw C0045t0.a(null, "Expected WEBVTT. Got " + c0095a.h());
    }
}
