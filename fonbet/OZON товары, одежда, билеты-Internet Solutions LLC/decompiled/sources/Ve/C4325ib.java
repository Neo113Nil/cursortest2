package Ve;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: Ve.ib, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4325ib implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f31279a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f31280b;

    public C4325ib(FrameLayout frameLayout, AppCompatImageView appCompatImageView) {
        this.f31279a = frameLayout;
        this.f31280b = appCompatImageView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31279a;
    }
}
