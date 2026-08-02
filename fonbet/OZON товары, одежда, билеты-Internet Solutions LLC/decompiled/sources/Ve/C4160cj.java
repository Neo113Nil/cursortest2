package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;

/* renamed from: Ve.cj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4160cj implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bc f30817b;

    public /* synthetic */ C4160cj(Bc bc2, int i11) {
        this.f30816a = i11;
        this.f30817b = bc2;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f30816a) {
            case 0:
                ((L5) obj).a(new Ci((Hk) this.f30817b));
                return Unit.f71690a;
            default:
                C1 c12 = (C1) this.f30817b;
                c12.getClass();
                C4777y4 c4777y4 = new C4777y4((List) obj);
                X4.a aVar = c12.f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                RecyclerView recyclerView = ((C4746x1) aVar).f32447i;
                recyclerView.setAdapter(c4777y4);
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                return Unit.f71690a;
        }
    }
}
