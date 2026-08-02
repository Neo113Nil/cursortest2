package kotlinx.coroutines.android;

import android.os.Looper;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes5.dex */
public final class a implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final e a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(g.a(mainLooper), false);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
