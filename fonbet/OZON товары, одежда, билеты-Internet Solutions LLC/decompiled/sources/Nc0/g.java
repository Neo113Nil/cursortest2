package Nc0;

import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface g {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f18992a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f18993b;

        public a(boolean z11, boolean z12) {
            this.f18992a = z11;
            this.f18993b = z12;
        }

        public final boolean a() {
            return this.f18992a;
        }

        public final boolean b() {
            return this.f18993b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18992a == aVar.f18992a && this.f18993b == aVar.f18993b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f18993b) + (Boolean.hashCode(this.f18992a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavButtonsState(backVisible=");
            sb2.append(this.f18992a);
            sb2.append(", closeVisible=");
            return Pk0.a.a(")", sb2, this.f18993b);
        }
    }

    void f(Function1<? super Function1<? super Boolean, Unit>, Unit> function1);

    Function0<Boolean> l();

    Function1<Function1<? super Boolean, Unit>, Unit> n();

    void o(Function1<? super Function1<? super Boolean, Unit>, Unit> function1);

    void r(a aVar);

    @NotNull
    InterfaceC2395h<a> s();

    Function1<Function1<? super Boolean, Unit>, Unit> w();

    Function0<Boolean> x();
}
