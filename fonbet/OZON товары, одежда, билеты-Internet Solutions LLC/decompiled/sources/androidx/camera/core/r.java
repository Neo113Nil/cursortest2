package androidx.camera.core;

import C.L;
import G.j;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.X0;

/* loaded from: classes8.dex */
public abstract class r implements L {
    @NonNull
    public static L d(@NonNull X0 x02, long j11, int i11, @NonNull Matrix matrix) {
        return new e(x02, j11, i11, matrix);
    }

    @Override // C.L
    public final void b(@NonNull j.b bVar) {
        bVar.m(((e) this).c());
    }

    @NonNull
    public abstract Matrix e();
}
