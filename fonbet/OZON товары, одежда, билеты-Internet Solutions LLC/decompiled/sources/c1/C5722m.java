package c1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: c1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5722m extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f56264b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f56265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5722m(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(1);
        this.f56264b = function1;
        this.f56265c = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f56264b.invoke(obj);
        this.f56265c.invoke(obj);
        return Unit.f71690a;
    }
}
