package Rh0;

import android.os.DeadSystemException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {
    public static final boolean a(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        boolean z11 = th2 instanceof DeadSystemException;
        Boolean valueOf = Boolean.valueOf(z11);
        if (!z11) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        Throwable cause = th2.getCause();
        Boolean valueOf2 = cause != null ? Boolean.valueOf(a(cause)) : null;
        if (valueOf2 != null) {
            return valueOf2.booleanValue();
        }
        return false;
    }
}
