package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f42232a;

    static class a {
        static PointerIcon a(Bitmap bitmap, float f7, float f11) {
            return PointerIcon.create(bitmap, f7, f11);
        }

        static PointerIcon b(Context context, int i11) {
            return PointerIcon.getSystemIcon(context, i11);
        }

        static PointerIcon c(Resources resources, int i11) {
            return PointerIcon.load(resources, i11);
        }
    }

    private H(PointerIcon pointerIcon) {
        this.f42232a = pointerIcon;
    }

    @NonNull
    public static H b(@NonNull Context context) {
        return new H(a.b(context, 1002));
    }

    public final PointerIcon a() {
        return this.f42232a;
    }
}
