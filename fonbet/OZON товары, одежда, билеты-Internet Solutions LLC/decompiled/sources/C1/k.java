package C1;

import S0.A1;
import S0.n1;
import androidx.compose.ui.platform.AbstractC5245f1;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends AbstractC5245f1 implements j<T> {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final m<T> f4308b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final A1 f4309c;

        a(m<T> mVar, Function0<? extends T> function0, Function1<? super C5242e1, Unit> function1) {
            super(function1);
            this.f4308b = mVar;
            this.f4309c = n1.e(function0);
        }

        @Override // C1.j
        @NotNull
        public final m<T> getKey() {
            return this.f4308b;
        }

        @Override // C1.j
        public final T getValue() {
            return (T) this.f4309c.getValue();
        }
    }

    @NotNull
    public static final <T> androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull m<T> mVar, @NotNull Function0<? extends T> function0) {
        return eVar.l0(new a(mVar, function0, C5236c1.a()));
    }
}
