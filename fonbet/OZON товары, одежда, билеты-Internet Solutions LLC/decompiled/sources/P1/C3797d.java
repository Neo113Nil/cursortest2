package P1;

import Sc.r;
import android.graphics.Typeface;
import androidx.core.content.res.g;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* renamed from: P1.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3797d extends g.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f21546a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q f21547b;

    C3797d(C10737n c10737n, Q q11) {
        this.f21546a = c10737n;
        this.f21547b = q11;
    }

    @Override // androidx.core.content.res.g.e
    public final void b(int i11) {
        this.f21546a.A(new IllegalStateException("Unable to load font " + this.f21547b + " (reason=" + i11 + ')'));
    }

    @Override // androidx.core.content.res.g.e
    public final void c(@NotNull Typeface typeface) {
        r.Companion companion = Sc.r.INSTANCE;
        this.f21546a.resumeWith(typeface);
    }
}
