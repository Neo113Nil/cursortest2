package B0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2476h0 extends AbstractC7737t implements Function1<List<K1.K>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2476h0(O0 o02) {
        super(1);
        this.f1785b = o02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<K1.K> list) {
        boolean z11;
        List<K1.K> list2 = list;
        O0 o02 = this.f1785b;
        if (o02.j() != null) {
            R1 j11 = o02.j();
            Intrinsics.f(j11);
            list2.add(j11.e());
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
