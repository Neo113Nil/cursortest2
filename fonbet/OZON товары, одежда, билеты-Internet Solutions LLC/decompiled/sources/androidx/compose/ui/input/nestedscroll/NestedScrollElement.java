package androidx.compose.ui.input.nestedscroll;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w1.C10407b;
import w1.InterfaceC10406a;
import w1.e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "LD1/c0;", "Lw1/e;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class NestedScrollElement extends AbstractC2794c0<e> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10406a f40470a;

    /* renamed from: b, reason: collision with root package name */
    private final C10407b f40471b;

    public NestedScrollElement(@NotNull InterfaceC10406a interfaceC10406a, C10407b c10407b) {
        this.f40470a = interfaceC10406a;
        this.f40471b = c10407b;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final e getF41119a() {
        return new e(this.f40470a, this.f40471b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.d(nestedScrollElement.f40470a, this.f40470a) && Intrinsics.d(nestedScrollElement.f40471b, this.f40471b);
    }

    public final int hashCode() {
        int hashCode = this.f40470a.hashCode() * 31;
        C10407b c10407b = this.f40471b;
        return hashCode + (c10407b != null ? c10407b.hashCode() : 0);
    }

    @Override // D1.AbstractC2794c0
    public final void update(e eVar) {
        eVar.K1(this.f40470a, this.f40471b);
    }
}
