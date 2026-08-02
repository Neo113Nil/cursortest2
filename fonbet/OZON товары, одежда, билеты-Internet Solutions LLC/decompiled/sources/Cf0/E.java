package Cf0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class E extends AbstractC7737t implements Function0<K> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(J j11) {
        super(0);
        this.f4839b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final K invoke() {
        Ld0.c cVar;
        List list;
        J j11 = this.f4839b;
        C2761b k11 = j11.k();
        cVar = j11.f4844a;
        list = j11.f4845b;
        return new K(k11, cVar, list, j11.p());
    }
}
