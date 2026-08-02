package ak0;

import Sc.k;
import Sc.n;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import li0.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.UserData;

/* loaded from: classes7.dex */
public final class b implements InterfaceC5031a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f36837a;

    /* synthetic */ class a extends C7735q implements Function0<m> {
        @Override // kotlin.jvm.functions.Function0
        public final m invoke() {
            return (m) ((Ib.a) this.receiver).get();
        }
    }

    public b(@NotNull Ib.a<m> userDataLazy) {
        Intrinsics.checkNotNullParameter(userDataLazy, "userDataLazy");
        this.f36837a = k.a(n.NONE, new a(0, userDataLazy, Ib.a.class, "get", "get()Ljava/lang/Object;", 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ak0.InterfaceC5031a
    public final Object a(@NotNull UserData userData, @NotNull j jVar) {
        Object a11 = ((m) this.f36837a.getValue()).a(userData, jVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ak0.InterfaceC5031a
    public final Object b(@NotNull d<? super UserData> dVar) {
        return ((m) this.f36837a.getValue()).b(dVar);
    }
}
