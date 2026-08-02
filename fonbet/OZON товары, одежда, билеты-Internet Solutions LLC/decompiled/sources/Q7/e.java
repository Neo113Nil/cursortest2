package Q7;

/* loaded from: classes.dex */
final class e {
    static void a(long j11, String str) {
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j11 + ") must be >= 0");
    }
}
