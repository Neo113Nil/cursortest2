package L;

import C.Y;
import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.W;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16063a;

    public e() {
        this.f16063a = androidx.camera.core.internal.compat.quirk.a.b(SurfaceOrderQuirk.class) != null;
    }

    public final void a(@NonNull ArrayList arrayList) {
        if (this.f16063a) {
            Collections.sort(arrayList, new Comparator() { // from class: L.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    O0.f fVar = (O0.f) obj2;
                    e.this.getClass();
                    W f7 = ((O0.f) obj).f();
                    int i11 = 1;
                    int i12 = f7.g() == MediaCodec.class ? 2 : f7.g() == Y.class ? 0 : 1;
                    W f11 = fVar.f();
                    if (f11.g() == MediaCodec.class) {
                        i11 = 2;
                    } else if (f11.g() == Y.class) {
                        i11 = 0;
                    }
                    return i12 - i11;
                }
            });
        }
    }
}
