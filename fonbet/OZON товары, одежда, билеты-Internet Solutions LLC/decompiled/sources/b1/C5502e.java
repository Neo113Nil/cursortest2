package b1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5502e extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5504g<Object> f55424b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC5515r<Object, ? extends Object> f55425c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC5512o f55426d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f55427e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f55428f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object[] f55429g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5502e(C5504g<Object> c5504g, InterfaceC5515r<Object, ? extends Object> interfaceC5515r, InterfaceC5512o interfaceC5512o, String str, Object obj, Object[] objArr) {
        super(0);
        this.f55424b = c5504g;
        this.f55425c = interfaceC5515r;
        this.f55426d = interfaceC5512o;
        this.f55427e = str;
        this.f55428f = obj;
        this.f55429g = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55424b.i(this.f55425c, this.f55426d, this.f55427e, this.f55428f, this.f55429g);
        return Unit.f71690a;
    }
}
