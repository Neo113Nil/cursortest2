package Qi0;

import Kk.C3532b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f23491b;

    public f(boolean z11, @NotNull Function1 onDataChanged) {
        Intrinsics.checkNotNullParameter("Is Fast Event", "label");
        Intrinsics.checkNotNullParameter(onDataChanged, "onDataChanged");
        Intrinsics.checkNotNullParameter("TrinityEvent.Toggle", "locator");
        this.f23490a = z11;
        this.f23491b = onDataChanged;
    }

    public static f a(f fVar, boolean z11) {
        fVar.getClass();
        Function1<Boolean, Unit> onDataChanged = fVar.f23491b;
        fVar.getClass();
        fVar.getClass();
        Intrinsics.checkNotNullParameter("Is Fast Event", "label");
        Intrinsics.checkNotNullParameter(onDataChanged, "onDataChanged");
        Intrinsics.checkNotNullParameter("TrinityEvent.Toggle", "locator");
        return new f(z11, onDataChanged);
    }

    @NotNull
    public final Function1<Boolean, Unit> b() {
        return this.f23491b;
    }

    public final boolean c() {
        return this.f23490a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        return this.f23490a == fVar.f23490a && this.f23491b.equals(fVar.f23491b);
    }

    public final int hashCode() {
        return ((this.f23491b.hashCode() + C3532b.a(-1884931308, 31, this.f23490a)) * 31) - 363062669;
    }

    @NotNull
    public final String toString() {
        return "ToggleInputVO(label=Is Fast Event, isChecked=" + this.f23490a + ", onDataChanged=" + this.f23491b + ", locator=TrinityEvent.Toggle)";
    }
}
