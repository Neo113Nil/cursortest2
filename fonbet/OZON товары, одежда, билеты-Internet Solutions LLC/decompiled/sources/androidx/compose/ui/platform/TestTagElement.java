package androidx.compose.ui.platform;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "LD1/c0;", "Landroidx/compose/ui/platform/R1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TestTagElement extends AbstractC2794c0<R1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f40740a;

    public TestTagElement(@NotNull String str) {
        this.f40740a = str;
    }

    @Override // D1.AbstractC2794c0
    public final R1 create() {
        return new R1(this.f40740a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.d(this.f40740a, ((TestTagElement) obj).f40740a);
    }

    public final int hashCode() {
        return this.f40740a.hashCode();
    }

    @Override // D1.AbstractC2794c0
    public final void update(R1 r12) {
        r12.I1(this.f40740a);
    }
}
