package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SpayBnplGraphCompositeView;

/* renamed from: Ve.a7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4090a7 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4699va f30640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S0 f30641b;

    public C4090a7(C4699va c4699va, S0 s02) {
        this.f30640a = c4699va;
        this.f30641b = s02;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        List list = (List) obj;
        C4699va c4699va = this.f30640a;
        Dm dm = c4699va.f32267d;
        if (dm == null) {
            Intrinsics.n("amountAdapter");
            throw null;
        }
        dm.f(list);
        boolean z11 = C7714v.K(list) instanceof C4789yg;
        S0 s02 = this.f30641b;
        if (z11) {
            RecyclerView recyclerView = s02.f29932h;
            L8 l82 = c4699va.f32269f;
            if (l82 == null) {
                Intrinsics.n("disabledScrollOnItemTouchListener");
                throw null;
            }
            recyclerView.addOnItemTouchListener(l82);
            SpayBnplGraphCompositeView spaySloSbgcvGraph = s02.f29934j;
            Intrinsics.checkNotNullExpressionValue(spaySloSbgcvGraph, "spaySloSbgcvGraph");
            spaySloSbgcvGraph.setVisibility(8);
        } else {
            RecyclerView recyclerView2 = s02.f29932h;
            L8 l83 = c4699va.f32269f;
            if (l83 == null) {
                Intrinsics.n("disabledScrollOnItemTouchListener");
                throw null;
            }
            recyclerView2.removeOnItemTouchListener(l83);
            SpayBnplGraphCompositeView spaySloSbgcvGraph2 = s02.f29934j;
            Intrinsics.checkNotNullExpressionValue(spaySloSbgcvGraph2, "spaySloSbgcvGraph");
            spaySloSbgcvGraph2.setVisibility(0);
            SpayBnplGraphCompositeView spaySloSbgcvGraph3 = s02.f29934j;
            Intrinsics.checkNotNullExpressionValue(spaySloSbgcvGraph3, "spaySloSbgcvGraph");
            int size = list.size();
            int i11 = SpayBnplGraphCompositeView.f98877d;
            spaySloSbgcvGraph3.a(size, 0);
        }
        return Unit.f71690a;
    }
}
