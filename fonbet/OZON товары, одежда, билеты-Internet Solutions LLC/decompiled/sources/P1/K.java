package P1;

import P1.Z;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M f21520a;

    public K() {
        this.f21520a = Build.VERSION.SDK_INT >= 28 ? new O() : new P();
    }

    public final Z.b a(@NotNull W w11) {
        Typeface a11;
        AbstractC3809p b11 = w11.b();
        boolean z11 = b11 == null ? true : b11 instanceof C3807n;
        M m11 = this.f21520a;
        if (z11) {
            a11 = m11.b(w11.e(), w11.c());
        } else {
            if (!(b11 instanceof I)) {
                if (!(b11 instanceof J)) {
                    return null;
                }
                ((J) w11.b()).getClass();
                Intrinsics.g(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                throw null;
            }
            a11 = m11.a((I) w11.b(), w11.e(), w11.c());
        }
        return new Z.b(a11, true);
    }
}
