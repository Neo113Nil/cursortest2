package c1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: c1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5723n extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f56266b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f56267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5723n(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(1);
        this.f56266b = function1;
        this.f56267c = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f56266b.invoke(obj);
        this.f56267c.invoke(obj);
        return Unit.f71690a;
    }
}
