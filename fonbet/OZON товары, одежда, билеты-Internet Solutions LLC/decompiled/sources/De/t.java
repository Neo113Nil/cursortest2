package De;

/* loaded from: classes.dex */
public final class t {
    static void a(int i11, Throwable th2) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        if (th2 == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        throw th2;
    }
}
