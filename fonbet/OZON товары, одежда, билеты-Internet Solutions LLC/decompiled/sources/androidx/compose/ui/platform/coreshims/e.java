package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final ViewStructure f40830a;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void d(ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
            viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
        }

        static void e(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void f(ViewStructure viewStructure, float f7, int i11, int i12, int i13) {
            viewStructure.setTextStyle(f7, i11, i12, i13);
        }
    }

    private e(@NonNull ViewStructure viewStructure) {
        this.f40830a = viewStructure;
    }

    @NonNull
    public static e i(@NonNull ViewStructure viewStructure) {
        return new e(viewStructure);
    }

    public final Bundle a() {
        return a.a(this.f40830a);
    }

    public final void b(@NonNull String str) {
        a.b(this.f40830a, str);
    }

    public final void c(@NonNull String str) {
        a.c(this.f40830a, str);
    }

    public final void d(int i11, int i12, int i13, int i14) {
        a.d(this.f40830a, i11, i12, 0, 0, i13, i14);
    }

    public final void e(int i11, String str) {
        this.f40830a.setId(i11, null, null, str);
    }

    public final void f(@NonNull CharSequence charSequence) {
        a.e(this.f40830a, charSequence);
    }

    public final void g(float f7) {
        a.f(this.f40830a, f7, 0, 0, 0);
    }

    @NonNull
    public final ViewStructure h() {
        return this.f40830a;
    }
}
