package Tg0;

import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27172a;

    public c(@NotNull InterfaceC4008j<? extends Sg0.a> dialogStateRepositoryLazy) {
        Intrinsics.checkNotNullParameter(dialogStateRepositoryLazy, "dialogStateRepositoryLazy");
        this.f27172a = dialogStateRepositoryLazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        c cVar2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f27171g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f27171g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f27169e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f27171g;
                if (i11 != 0) {
                    s.b(obj);
                    Sg0.a aVar2 = (Sg0.a) this.f27172a.getValue();
                    bVar.f27168d = this;
                    bVar.f27171g = 1;
                    obj = aVar2.c(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = bVar.f27168d;
                    s.b(obj);
                }
                return Boolean.valueOf(((Boolean) obj).booleanValue() && !((Sg0.a) cVar2.f27172a.getValue()).d());
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f27169e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f27171g;
        if (i11 != 0) {
        }
        return Boolean.valueOf(((Boolean) obj2).booleanValue() && !((Sg0.a) cVar2.f27172a.getValue()).d());
    }
}
