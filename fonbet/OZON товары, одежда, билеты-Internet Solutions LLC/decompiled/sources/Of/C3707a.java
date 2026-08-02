package Of;

import java.util.Locale;

/* renamed from: Of.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3707a {
    public static String a(String str) {
        return str != null ? str.toLowerCase(Locale.ROOT) : "";
    }

    public static String b(String str) {
        return a(str).trim();
    }
}
