package Bi;

import Bi.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;

/* loaded from: classes6.dex */
final /* synthetic */ class n extends C7735q implements Function1<Function1<? super Hi.g, ? extends Unit>, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M<Function1<Hi.g, Unit>> f3837a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<k.a.EnumC0102a> f3838b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M<Function1<List<? extends Hi.l>, Unit>> f3839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(M<Function1<Hi.g, Unit>> m11, M<k.a.EnumC0102a> m12, M<Function1<List<? extends Hi.l>, Unit>> m13) {
        super(1, Intrinsics.a.class, "setListener", "register$setListener(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function1;)V", 0);
        this.f3837a = m11;
        this.f3838b = m12;
        this.f3839c = m13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super Hi.g, ? extends Unit> function1) {
        Function1<? super Hi.g, ? extends Unit> function12 = function1;
        this.f3837a.f71787a = function12;
        this.f3838b.f71787a = function12 != 0 ? k.a.EnumC0102a.WITH_STATE : this.f3839c.f71787a != null ? k.a.EnumC0102a.WITHOUT_STATE : k.a.EnumC0102a.NONE;
        return Unit.f71690a;
    }
}
