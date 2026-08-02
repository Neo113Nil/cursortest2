package n1;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: n1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2171l implements InterfaceC2172m {

    /* renamed from: k, reason: collision with root package name */
    public final ScrollFeedbackProvider f18443k;

    public C2171l(NestedScrollView nestedScrollView) {
        this.f18443k = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // n1.InterfaceC2172m
    public final void b(int i, int i5, int i6, boolean z3) {
        this.f18443k.onScrollLimit(i, i5, i6, z3);
    }

    @Override // n1.InterfaceC2172m
    public final void e(int i, int i5, int i6, int i7) {
        this.f18443k.onScrollProgress(i, i5, i6, i7);
    }
}
