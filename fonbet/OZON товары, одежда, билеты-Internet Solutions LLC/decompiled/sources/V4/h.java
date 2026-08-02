package V4;

import V4.l;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class h implements l.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f28035a;

    h(Runnable runnable) {
        this.f28035a = runnable;
    }

    @Override // V4.l.f
    public final void onTransitionCancel(@NonNull l lVar) {
    }

    @Override // V4.l.f
    public final void onTransitionEnd(@NonNull l lVar) {
        this.f28035a.run();
    }

    @Override // V4.l.f
    public final void onTransitionPause(@NonNull l lVar) {
    }

    @Override // V4.l.f
    public final void onTransitionResume(@NonNull l lVar) {
    }

    @Override // V4.l.f
    public final void onTransitionStart(@NonNull l lVar) {
    }
}
