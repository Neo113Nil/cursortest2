package Z;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public interface o {

    public interface a {
    }

    public static class b extends Exception {
    }

    public static abstract class c {
        public abstract int a();

        public abstract long b();
    }

    @NonNull
    c read(@NonNull ByteBuffer byteBuffer);
}
