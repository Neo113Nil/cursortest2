package p010b0;

import j6.a;
import kotlin.jvm.functions.Function1;
import p065i6.d;
import p077k6.i;

/* JADX INFO: renamed from: b0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0750v extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f10106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0750v(F f7, d dVar) {
        super(1, dVar);
        this.f10106b = f7;
    }

    @Override // p077k6.a
    public final d create(d dVar) {
        return new C0750v(this.f10106b, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0750v) create((d) obj)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.f10105a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            this.f10105a = 1;
            obj = this.f10106b.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return obj;
    }
}
