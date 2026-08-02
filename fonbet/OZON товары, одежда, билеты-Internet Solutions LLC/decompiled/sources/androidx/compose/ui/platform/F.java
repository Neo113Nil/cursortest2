package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class F extends AbstractC7737t implements Function2<I1.r, I1.r, Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final F f40642b = new F(2);

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(I1.r rVar, I1.r rVar2) {
        I1.l q11 = rVar.q();
        int i11 = I1.u.f11751H;
        return Integer.valueOf(Float.compare(((Number) q11.l(I1.u.F(), D.f40617b)).floatValue(), ((Number) rVar2.q().l(I1.u.F(), E.f40633b)).floatValue()));
    }
}
