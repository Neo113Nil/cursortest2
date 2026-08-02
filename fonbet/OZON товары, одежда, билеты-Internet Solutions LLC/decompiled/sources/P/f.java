package P;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.UUID;

/* loaded from: classes8.dex */
public abstract class f {
    @NonNull
    public static f h(int i11, int i12, @NonNull Rect rect, @NonNull Size size, int i13, boolean z11) {
        return new b(UUID.randomUUID(), i11, i12, rect, size, i13, z11);
    }

    @NonNull
    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    @NonNull
    public abstract Size d();

    public abstract int e();

    @NonNull
    abstract UUID f();

    public abstract boolean g();

    public abstract boolean i();
}
