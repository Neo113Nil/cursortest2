package Yl0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Nl0.r f35195a;

    public r(@NotNull Nl0.r vkpnsTopicRepository) {
        Intrinsics.checkNotNullParameter(vkpnsTopicRepository, "vkpnsTopicRepository");
        this.f35195a = vkpnsTopicRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        int i11;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i12 = qVar.f35194f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                qVar.f35194f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = qVar.f35192d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = qVar.f35194f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((Sc.r) obj).getF26106a();
                }
                s.b(obj);
                qVar.f35194f = 1;
                Object a11 = this.f35195a.a(str, qVar);
                return a11 == aVar ? aVar : a11;
            }
        }
        qVar = new q(this, cVar);
        Object obj2 = qVar.f35192d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = qVar.f35194f;
        if (i11 == 0) {
        }
    }
}
