package androidx.camera.core.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.I0;
import java.util.Iterator;

/* loaded from: classes8.dex */
public interface SurfaceProcessingQuirk extends E0 {
    static boolean d(@NonNull I0 i02) {
        Iterator it = i02.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    default boolean b() {
        return true;
    }
}
