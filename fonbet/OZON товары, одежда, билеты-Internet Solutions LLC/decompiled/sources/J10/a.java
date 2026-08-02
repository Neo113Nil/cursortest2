package J10;

import androidx.core.view.C5353y0;
import ed.InterfaceC6346b;
import i10.InterfaceC6995a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes7.dex */
public final class a implements InterfaceC6995a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5353y0 f13665a;

    private /* synthetic */ a(C5353y0 c5353y0) {
        this.f13665a = c5353y0;
    }

    public static final /* synthetic */ a a(C5353y0 c5353y0) {
        return new a(c5353y0);
    }

    public final /* synthetic */ C5353y0 b() {
        return this.f13665a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.d(this.f13665a, ((a) obj).f13665a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13665a.hashCode();
    }

    public final String toString() {
        return "ComposerWindowInsets(insets=" + this.f13665a + ")";
    }
}
