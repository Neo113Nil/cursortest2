package Ge;

import io.reactivex.InterfaceC7095c;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import vc.C10298c;
import xe.B0;
import xe.C10749t0;
import xe.G;
import xe.L0;
import xe.O;

/* loaded from: classes10.dex */
public final class k {
    @NotNull
    public static final C10298c a(@NotNull final L0 l02, @NotNull final Function2 function2) {
        if (l02.get(B0.f105374o0) == null) {
            return new C10298c(new io.reactivex.e(function2) { // from class: Ge.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ kotlin.coroutines.jvm.internal.j f10093b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f10093b = (kotlin.coroutines.jvm.internal.j) function2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
                @Override // io.reactivex.e
                public final void a(InterfaceC7095c interfaceC7095c) {
                    i iVar = new i(G.c(C10749t0.f105499a, L0.this), interfaceC7095c);
                    interfaceC7095c.a(new g(iVar));
                    iVar.y0(O.DEFAULT, iVar, this.f10093b);
                }
            });
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + l02).toString());
    }
}
