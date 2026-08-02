package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* loaded from: classes10.dex */
public final class J implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29253b;

    public /* synthetic */ J(Object obj, int i11) {
        this.f29252a = i11;
        this.f29253b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4140c c4140c;
        int i11;
        switch (this.f29252a) {
            case 0:
                if (dVar instanceof C4140c) {
                    c4140c = (C4140c) dVar;
                    int i12 = c4140c.f30760e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c4140c.f30760e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c4140c.f30759d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c4140c.f30760e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) obj;
                            Eh eh2 = (orderScreenDataResponse == null || !orderScreenDataResponse.getMoreThanOneCard()) ? Eh.f28933a : Eh.f28934b;
                            c4140c.f30760e = 1;
                            if (((InterfaceC2397i) this.f29253b).emit(eh2, c4140c) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c4140c = new C4140c(this, dVar);
                Object obj22 = c4140c.f30759d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4140c.f30760e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            default:
                C4192dm c4192dm = (C4192dm) this.f29253b;
                c4192dm.getClass();
                C4777y4 c4777y4 = new C4777y4((List) obj);
                X4.a aVar3 = c4192dm.f28693b;
                if (aVar3 == null) {
                    throw M7.f29463a;
                }
                RecyclerView recyclerView = ((H2) aVar3).f29107f;
                recyclerView.setAdapter(c4777y4);
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                return Unit.f71690a;
        }
    }
}
