package I0;

import i1.C6987g;
import i1.C6992l;
import k1.C7464j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7809a0;

/* renamed from: I0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3185h extends AbstractC7737t implements Function1<C6987g, C6992l> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f11523b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Boolean> f11524c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f11525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3185h(Function0 function0, long j11, boolean z11) {
        super(1);
        this.f11523b = j11;
        this.f11524c = function0;
        this.f11525d = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C6992l invoke(C6987g c6987g) {
        C6987g c6987g2 = c6987g;
        return c6987g2.t(new C3183g(this.f11524c, this.f11525d, C3181f.d(c6987g2, C7464j.f(c6987g2.i()) / 2.0f), C7809a0.a.a(5, this.f11523b)));
    }
}
