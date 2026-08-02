package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: I0.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3208t extends AbstractC7737t implements Function1<C3218y, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3206s f11601b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.collection.F<C3220z> f11602c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3220z f11603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3208t(C3206s c3206s, androidx.collection.F<C3220z> f7, C3220z c3220z) {
        super(1);
        this.f11601b = c3206s;
        this.f11602c = f7;
        this.f11603d = c3220z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C3218y c3218y) {
        C3218y c3218y2 = c3218y;
        int length = c3218y2.b().length();
        C3206s.m(this.f11601b, this.f11602c, this.f11603d, c3218y2, length);
        return Unit.f71690a;
    }
}
