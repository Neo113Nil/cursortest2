package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.hk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4305hk implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f31201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4699va f31202b;

    public C4305hk(C4699va c4699va, S0 s02) {
        this.f31201a = s02;
        this.f31202b = c4699va;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Set set = (Set) obj;
        RecyclerView observeViewModel$lambda$28$lambda$25$lambda$24 = this.f31201a.f29933i;
        Intrinsics.checkNotNullExpressionValue(observeViewModel$lambda$28$lambda$25$lambda$24, "observeViewModel$lambda$28$lambda$25$lambda$24");
        observeViewModel$lambda$28$lambda$25$lambda$24.setVisibility(set.isEmpty() ? 4 : 0);
        C4665u5 c4665u5 = this.f31202b.f32268e;
        if (c4665u5 != null) {
            c4665u5.submitList(C7714v.W0(set));
            return Unit.f71690a;
        }
        Intrinsics.n("hintsAdapter");
        throw null;
    }
}
