package Dd;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;

/* loaded from: classes10.dex */
final class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final m f6584a;

    public l(m mVar) {
        this.f6584a = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = g.f6578c;
        Xd.k a11 = g.a(this.f6584a.f());
        Map i12 = a11 != null ? U.i(new Pair(e.c(), a11)) : null;
        return i12 == null ? U.c() : i12;
    }
}
