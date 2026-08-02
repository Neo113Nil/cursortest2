package Gf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Gf0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3115s extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f10215b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Xc.a<Object> f10216c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Object, String> f10217d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f10218e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f10219f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f10220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3115s(Object obj, Xc.a<Object> aVar, Function1<Object, String> function1, String str, Function1<Object, Unit> function12, int i11) {
        super(2);
        this.f10215b = obj;
        this.f10216c = aVar;
        this.f10217d = function1;
        this.f10218e = str;
        this.f10219f = function12;
        this.f10220g = i11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f10220g | 1);
        String str = this.f10218e;
        Function1<Object, Unit> function1 = this.f10219f;
        C3105h.h(this.f10215b, this.f10216c, this.f10217d, str, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
