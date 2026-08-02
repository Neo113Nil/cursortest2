package Nf;

/* loaded from: classes10.dex */
public final class b {
    private b() {
    }

    public static void a(boolean z11) {
        if (!z11) {
            throw new c("Must be true");
        }
    }

    public static void b(String str) {
        if (str == null || str.length() == 0) {
            throw new c("String must not be empty");
        }
    }

    public static void c(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new c(str2);
        }
    }

    public static void d(Object obj) {
        if (obj == null) {
            throw new c("Object must not be null");
        }
    }
}
