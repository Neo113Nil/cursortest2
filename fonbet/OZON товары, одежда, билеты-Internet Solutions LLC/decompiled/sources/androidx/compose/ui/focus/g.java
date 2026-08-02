package androidx.compose.ui.focus;

import Sc.InterfaceC4003e;
import j1.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {

    static final class a implements p, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f40401a;

        a(Function1 function1) {
            this.f40401a = function1;
        }

        public final /* synthetic */ void a(j1.m mVar) {
            this.f40401a.invoke(mVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(this.f40401a, ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f40401a;
        }

        public final int hashCode() {
            return this.f40401a.hashCode();
        }
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super j1.m, Unit> function1) {
        return eVar.l0(new FocusPropertiesElement(new a(function1)));
    }
}
