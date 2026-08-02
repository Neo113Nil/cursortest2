package B0;

import I0.C3181f;
import i1.C6987g;
import i1.C6992l;
import k1.C7464j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7809a0;

/* renamed from: B0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2466e extends AbstractC7737t implements Function1<C6987g, C6992l> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f1701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2466e(long j11) {
        super(1);
        this.f1701b = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g c6987g) {
        C6987g c6987g2 = c6987g;
        float f7 = C7464j.f(c6987g2.i()) / 2.0f;
        return c6987g2.t(new C2463d(f7, C3181f.d(c6987g2, f7), C7809a0.a.a(5, this.f1701b)));
    }
}
