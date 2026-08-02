package N;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5130z;

/* loaded from: classes8.dex */
public abstract class p<T> {
    @NonNull
    public static p<Bitmap> i(@NonNull Bitmap bitmap, @NonNull G.h hVar, @NonNull Rect rect, int i11, @NonNull Matrix matrix, @NonNull InterfaceC5130z interfaceC5130z) {
        return new C3644b(bitmap, hVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i11, matrix, interfaceC5130z);
    }

    @NonNull
    public static p<androidx.camera.core.p> j(@NonNull androidx.camera.core.p pVar, G.h hVar, @NonNull Size size, @NonNull Rect rect, int i11, @NonNull Matrix matrix, @NonNull InterfaceC5130z interfaceC5130z) {
        if (M.b.b(pVar.g())) {
            x2.i.e(hVar, "JPEG image must have Exif.");
        }
        return new C3644b(pVar, hVar, pVar.g(), size, rect, i11, matrix, interfaceC5130z);
    }

    @NonNull
    public static p<byte[]> k(@NonNull byte[] bArr, @NonNull G.h hVar, int i11, @NonNull Size size, @NonNull Rect rect, int i12, @NonNull Matrix matrix, @NonNull InterfaceC5130z interfaceC5130z) {
        return new C3644b(bArr, hVar, i11, size, rect, i12, matrix, interfaceC5130z);
    }

    @NonNull
    public abstract InterfaceC5130z a();

    @NonNull
    public abstract Rect b();

    @NonNull
    public abstract T c();

    public abstract G.h d();

    public abstract int e();

    public abstract int f();

    @NonNull
    public abstract Matrix g();

    @NonNull
    public abstract Size h();
}
