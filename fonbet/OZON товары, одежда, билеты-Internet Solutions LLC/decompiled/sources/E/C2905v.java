package E;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* renamed from: E.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2905v implements N.o<N.p<androidx.camera.core.p>, Bitmap> {
    @NonNull
    public final Object a(@NonNull Object obj) throws C.K {
        Throwable th2;
        Bitmap createBitmap;
        N.p pVar = (N.p) obj;
        androidx.camera.core.u uVar = null;
        try {
            try {
                if (pVar.e() == 35) {
                    androidx.camera.core.p pVar2 = (androidx.camera.core.p) pVar.c();
                    boolean z11 = pVar.f() % 180 != 0;
                    androidx.camera.core.u uVar2 = new androidx.camera.core.u(androidx.camera.core.q.a(z11 ? pVar2.getHeight() : pVar2.getWidth(), z11 ? pVar2.getWidth() : pVar2.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.p d11 = ImageProcessingUtil.d(pVar2, uVar2, ByteBuffer.allocateDirect(pVar2.getWidth() * pVar2.getHeight() * 4), pVar.f(), false);
                        pVar2.close();
                        if (d11 == null) {
                            throw new C.K("Can't covert YUV to RGB", null);
                        }
                        createBitmap = M.b.a(d11);
                        d11.close();
                        uVar = uVar2;
                    } catch (UnsupportedOperationException e11) {
                        e = e11;
                        throw new C.K("Can't convert " + (pVar.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th3) {
                        th2 = th3;
                        uVar = uVar2;
                        if (uVar == null) {
                            throw th2;
                        }
                        uVar.close();
                        throw th2;
                    }
                } else {
                    if (pVar.e() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + pVar.e());
                    }
                    androidx.camera.core.p pVar3 = (androidx.camera.core.p) pVar.c();
                    Bitmap a11 = M.b.a(pVar3);
                    pVar3.close();
                    int f7 = pVar.f();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(f7);
                    createBitmap = Bitmap.createBitmap(a11, 0, 0, a11.getWidth(), a11.getHeight(), matrix, true);
                }
                if (uVar != null) {
                    uVar.close();
                }
                return createBitmap;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (UnsupportedOperationException e12) {
            e = e12;
        }
    }
}
