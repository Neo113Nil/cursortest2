package E;

import M.b;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: E.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2906w implements N.o<a, N.p<byte[]>> {

    /* renamed from: a, reason: collision with root package name */
    private final L.c f6931a;

    /* renamed from: E.w$a */
    static abstract class a {
        a() {
        }

        abstract int a();

        abstract N.p<androidx.camera.core.p> b();
    }

    C2906w(@NonNull I0 i02) {
        this.f6931a = new L.c(i02);
    }

    private static N.p b(@NonNull a aVar) throws C.K {
        N.p<androidx.camera.core.p> b11 = aVar.b();
        androidx.camera.core.p c11 = b11.c();
        Rect b12 = b11.b();
        try {
            byte[] c12 = M.b.c(c11, b12, aVar.a(), b11.f());
            try {
                G.h c13 = G.h.c(new ByteArrayInputStream(c12));
                Size size = new Size(b12.width(), b12.height());
                Rect rect = new Rect(0, 0, b12.width(), b12.height());
                int f7 = b11.f();
                Matrix g10 = b11.g();
                RectF rectF = G.r.f9647a;
                Matrix matrix = new Matrix(g10);
                matrix.postTranslate(-b12.left, -b12.top);
                return N.p.k(c12, c13, 256, size, rect, f7, matrix, b11.a());
            } catch (IOException e11) {
                throw new C.K("Failed to extract Exif from YUV-generated JPEG", e11);
            }
        } catch (b.a e12) {
            throw new C.K("Failed to encode the image to JPEG.", e12);
        }
    }

    @NonNull
    public final Object a(@NonNull Object obj) throws C.K {
        N.p<byte[]> b11;
        a aVar = (a) obj;
        try {
            int e11 = aVar.b().e();
            if (e11 != 35) {
                if (e11 != 256 && e11 != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + e11);
                }
                N.p<androidx.camera.core.p> b12 = aVar.b();
                byte[] a11 = this.f6931a.a(b12.c());
                G.h d11 = b12.d();
                Objects.requireNonNull(d11);
                b11 = N.p.k(a11, d11, e11, b12.h(), b12.b(), b12.f(), b12.g(), b12.a());
            } else {
                b11 = b(aVar);
            }
            aVar.b().c().close();
            return b11;
        } catch (Throwable th2) {
            aVar.b().c().close();
            throw th2;
        }
    }
}
