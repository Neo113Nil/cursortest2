package androidx.camera.core;

import C.L;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.Image;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public interface p extends AutoCloseable {

    public interface a {
        @NonNull
        ByteBuffer f();

        int g();

        int h();
    }

    @NonNull
    default Bitmap B0() {
        return M.b.a(this);
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    a[] c0();

    int g();

    int getHeight();

    Image getImage();

    int getWidth();

    @NonNull
    L x0();
}
