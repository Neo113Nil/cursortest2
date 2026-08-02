package b9;

import a9.C4962a;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.nio.ByteBuffer;

@KeepForSdk
/* renamed from: b9.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5589d {

    /* renamed from: a, reason: collision with root package name */
    private static final C5589d f55728a;

    static {
        new GmsLogger("MLKitImageUtils", "");
        f55728a = new C5589d();
    }

    @NonNull
    @KeepForSdk
    public static IObjectWrapper a(@NonNull C4962a c4962a) throws R8.a {
        int c11 = c4962a.c();
        if (c11 == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(c4962a.b()));
        }
        if (c11 != 17) {
            if (c11 == 35) {
                return ObjectWrapper.wrap(null);
            }
            if (c11 != 842094169) {
                throw new R8.a(Ej.b.a(c4962a.c(), "Unsupported image format: "), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(null));
    }

    @NonNull
    @KeepForSdk
    public static C5589d b() {
        return f55728a;
    }

    @KeepForSdk
    public static int c(@NonNull C4962a c4962a) {
        if (c4962a.c() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(c4962a.b())).getAllocationByteCount();
        }
        if (c4962a.c() == 17 || c4962a.c() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(null)).limit();
        }
        if (c4962a.c() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(null))[0].getBuffer().limit() * 3) / 2;
    }

    @KeepForSdk
    public static Matrix d(int i11, int i12, int i13) {
        if (i13 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i11) / 2.0f, (-i12) / 2.0f);
        matrix.postRotate(i13 * 90);
        int i14 = i13 % 2;
        int i15 = i14 != 0 ? i12 : i11;
        if (i14 == 0) {
            i11 = i12;
        }
        matrix.postTranslate(i15 / 2.0f, i11 / 2.0f);
        return matrix;
    }
}
