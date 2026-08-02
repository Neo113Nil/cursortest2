package C1;

import androidx.compose.ui.platform.AbstractC5245f1;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class e extends AbstractC5245f1 implements d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<l, Unit> f4300b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull Function1<? super l, Unit> function1, @NotNull Function1<? super C5242e1, Unit> function12) {
        super(function12);
        this.f4300b = function1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && ((e) obj).f4300b == this.f4300b;
    }

    public final int hashCode() {
        return this.f4300b.hashCode();
    }

    @Override // C1.d
    public final void w1(@NotNull l lVar) {
        this.f4300b.invoke(lVar);
    }
}
