package E;

import E.O;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.T;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class F implements N.o<O.b, N.p<androidx.camera.core.p>> {
    @NonNull
    public final Object a(@NonNull Object obj) throws C.K {
        G.h c11;
        O.b bVar = (O.b) obj;
        androidx.camera.core.p a11 = bVar.a();
        P b11 = bVar.b();
        if (M.b.b(a11.g())) {
            try {
                int i11 = G.h.f9610g;
                ByteBuffer f7 = a11.c0()[0].f();
                f7.rewind();
                byte[] bArr = new byte[f7.capacity()];
                f7.get(bArr);
                c11 = G.h.c(new ByteArrayInputStream(bArr));
                a11.c0()[0].f().rewind();
            } catch (IOException e11) {
                throw new C.K("Failed to extract EXIF data.", e11);
            }
        } else {
            c11 = null;
        }
        if (((ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            T.a<Integer> aVar = androidx.camera.core.impl.Q.f38177i;
        } else if (M.b.b(a11.g())) {
            x2.i.e(c11, "JPEG image must have exif.");
            Size size = new Size(a11.getWidth(), a11.getHeight());
            int e12 = b11.e() - c11.e();
            Size size2 = G.r.c(G.r.h(e12)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix a12 = G.r.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), e12, false);
            RectF rectF = new RectF(b11.a());
            a12.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int e13 = c11.e();
            Size size3 = size2;
            Matrix matrix = new Matrix(b11.f());
            matrix.postConcat(a12);
            return N.p.j(a11, c11, size3, rect, e13, matrix, a11.x0() instanceof J.c ? ((J.c) a11.x0()).d() : new InterfaceC5130z.a());
        }
        return N.p.j(a11, c11, new Size(a11.getWidth(), a11.getHeight()), b11.a(), b11.e(), b11.f(), a11.x0() instanceof J.c ? ((J.c) a11.x0()).d() : new InterfaceC5130z.a());
    }
}
