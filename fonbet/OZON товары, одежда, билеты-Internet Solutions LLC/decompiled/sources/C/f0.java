package C;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.util.concurrent.Executor;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public interface f0 extends Closeable {

    public static abstract class a {
        @NonNull
        public static a f(@NonNull Size size, @NonNull Rect rect, androidx.camera.core.impl.I i11, int i12, boolean z11) {
            return new C2684d(size, rect, i11, i12, z11);
        }

        public abstract androidx.camera.core.impl.I a();

        @NonNull
        public abstract Rect b();

        @NonNull
        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        b() {
        }

        @NonNull
        public static b c(@NonNull f0 f0Var) {
            return new C2685e(f0Var);
        }

        public abstract int a();

        @NonNull
        public abstract f0 b();
    }

    @NonNull
    Surface I1(@NonNull Executor executor, @NonNull InterfaceC10646a<b> interfaceC10646a);

    void f0(@NonNull float[] fArr, @NonNull float[] fArr2);

    default int g() {
        return 34;
    }

    @NonNull
    Size getSize();

    default void i0(@NonNull float[] fArr, @NonNull float[] fArr2) {
    }
}
