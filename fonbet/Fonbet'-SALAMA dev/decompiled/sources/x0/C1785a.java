package x0;

import D6.C;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import z0.AbstractC1813f;
import z0.C1808a;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785a extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1786b f18081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1808a f18082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785a(C1786b c1786b, C1808a c1808a, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f18081b = c1786b;
        this.f18082c = c1808a;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new C1785a(this.f18081b, this.f18082c, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1785a) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f18080a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            AbstractC1813f abstractC1813f = this.f18081b.f18083a;
            this.f18080a = 1;
            obj = abstractC1813f.b(this.f18082c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return obj;
    }
}
