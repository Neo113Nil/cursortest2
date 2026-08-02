package kotlinx.serialization.internal;

/* renamed from: kotlinx.serialization.internal.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1153o {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
