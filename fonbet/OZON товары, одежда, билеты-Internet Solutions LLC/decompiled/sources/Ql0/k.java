package Ql0;

import Sc.r;
import Sc.s;
import Yl0.r;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import yl0.C10923h;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.domain.component.TopicComponentImpl$unsubscribeFromTopic$$inlined$wrapInTask$1$1", f = "TopicComponentImpl.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f23814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C10923h.a f23815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f23816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C10923h.a aVar, kotlin.coroutines.d dVar, j jVar) {
        super(2, dVar);
        this.f23815e = aVar;
        this.f23816f = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f23815e, dVar, this.f23816f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23814d;
        if (i11 == 0) {
            s.b(obj);
            r rVar = this.f23816f.f23812b;
            this.f23814d = 1;
            a11 = rVar.a("ru.vk.store_ads", this);
            if (a11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            a11 = ((Sc.r) obj).getF26106a();
        }
        r.Companion companion = Sc.r.INSTANCE;
        boolean z11 = a11 instanceof r.b;
        C10923h.a aVar2 = this.f23815e;
        if (!z11) {
            aVar2.b(a11);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            aVar2.a(b11);
        }
        return Unit.f71690a;
    }
}
