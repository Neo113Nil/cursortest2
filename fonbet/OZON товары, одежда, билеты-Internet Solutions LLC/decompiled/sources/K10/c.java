package K10;

import A00.a;
import h10.AbstractC6779a;
import i10.C6997c;
import i10.InterfaceC6995a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class c extends AbstractC6779a<l, a> {

    public static final class a implements InterfaceC6995a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final a f15107c = new a(true, true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f15108a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f15109b;

        public a(boolean z11, boolean z12) {
            this.f15108a = z11;
            this.f15109b = z12;
        }

        public final boolean b() {
            return this.f15108a;
        }

        public final boolean c() {
            return this.f15109b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15108a == aVar.f15108a && this.f15109b == aVar.f15109b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f15109b) + (Boolean.hashCode(this.f15108a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VisibleOffsetState(isTakenAppBar=");
            sb2.append(this.f15108a);
            sb2.append(", isTakenTopContainer=");
            return Pk0.a.a(")", sb2, this.f15109b);
        }
    }

    public c() {
        super(a.f15107c);
    }

    @Override // h10.AbstractC6779a
    public final a d(A00.a event, C6997c<l> state, a aVar) {
        a additionalState = aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(additionalState, "additionalState");
        if (!(event instanceof a.C2367h)) {
            return additionalState;
        }
        a.C2367h c2367h = (a.C2367h) event;
        return new a(c2367h.d(), c2367h.e());
    }
}
