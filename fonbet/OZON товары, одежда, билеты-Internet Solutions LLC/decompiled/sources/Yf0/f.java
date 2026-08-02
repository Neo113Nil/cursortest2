package Yf0;

import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.mockServer.MockServerInterceptor$shouldRewriteUrl$mockPathsList$1", f = "MockServerInterceptor.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f35011d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f35012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f35012e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f35012e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super a> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35011d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        h a11 = e.a(this.f35012e);
        this.f35011d = 1;
        Object a12 = a11.a(this);
        return a12 == aVar ? aVar : a12;
    }
}
