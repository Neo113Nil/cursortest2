package K10;

import A00.a;
import h10.AbstractC6779a;
import i10.C6997c;
import i10.InterfaceC6995a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class a extends AbstractC6779a<l, C0289a> {

    /* renamed from: K10.a$a, reason: collision with other inner class name */
    public static final class C0289a implements InterfaceC6995a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f15105a;

        public C0289a(boolean z11) {
            this.f15105a = z11;
        }

        public final boolean a() {
            return this.f15105a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0289a) && this.f15105a == ((C0289a) obj).f15105a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f15105a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("TopSpacerState(isEnabled="), this.f15105a);
        }
    }

    @Override // h10.AbstractC6779a
    public final C0289a d(A00.a event, C6997c<l> state, C0289a c0289a) {
        C0289a additionalState = c0289a;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(additionalState, "additionalState");
        return event instanceof a.A ? new C0289a(false) : additionalState;
    }
}
