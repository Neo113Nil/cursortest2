package Bl0;

import android.view.KeyEvent;
import com.google.mlkit.common.sdkinternal.C5945a;
import n8.InterfaceC8452b;

/* renamed from: Bl0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2645f implements n8.e {
    public static String b(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    public static void c(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return C5945a.a();
    }
}
