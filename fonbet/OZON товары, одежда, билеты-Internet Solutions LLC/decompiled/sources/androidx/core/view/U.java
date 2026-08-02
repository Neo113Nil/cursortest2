package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.Y;

/* loaded from: classes.dex */
final class U extends Y.b<Boolean> {
    @Override // androidx.core.view.Y.b
    final Boolean a(@NonNull View view) {
        return Boolean.valueOf(Y.h.d(view));
    }

    @Override // androidx.core.view.Y.b
    final void b(@NonNull View view, Boolean bool) {
        Y.h.j(view, bool.booleanValue());
    }

    @Override // androidx.core.view.Y.b
    final boolean e(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
