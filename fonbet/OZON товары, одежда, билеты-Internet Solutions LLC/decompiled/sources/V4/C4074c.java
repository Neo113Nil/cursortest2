package V4;

import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: V4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4074c extends m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f28024a;

    C4074c(View view) {
        this.f28024a = view;
    }

    @Override // V4.l.f
    public final void onTransitionEnd(@NonNull l lVar) {
        y.e(this.f28024a, 1.0f);
        y.a();
        lVar.removeListener(this);
    }
}
