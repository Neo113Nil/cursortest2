package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.Y;

/* loaded from: classes.dex */
final class W extends Y.b<CharSequence> {
    @Override // androidx.core.view.Y.b
    final CharSequence a(View view) {
        return Y.j.b(view);
    }

    @Override // androidx.core.view.Y.b
    final void b(View view, CharSequence charSequence) {
        Y.j.e(view, charSequence);
    }

    @Override // androidx.core.view.Y.b
    final boolean e(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
