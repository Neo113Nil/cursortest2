package androidx.compose.foundation.lazy;

import S0.C3956f1;
import S0.C3987u0;
import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;
import v0.InterfaceC10165e;

/* loaded from: classes.dex */
public final class a implements InterfaceC10165e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C3987u0 f39573a = C3956f1.a(Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C3987u0 f39574b = C3956f1.a(Integer.MAX_VALUE);

    @Override // v0.InterfaceC10165e
    @NotNull
    public final e a(@NotNull e.a aVar) {
        return new ParentSizeElement(this.f39573a);
    }

    public final void b(int i11, int i12) {
        this.f39573a.d(i11);
        this.f39574b.d(i12);
    }
}
