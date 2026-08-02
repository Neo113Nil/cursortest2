package Cd0;

import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.data.InAppPushRepository$callPixelUrl$2", f = "InAppPushRepository.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f4797d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f4798e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f4799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar, String str, kotlin.coroutines.d<? super c> dVar) {
        super(1, dVar);
        this.f4798e = fVar;
        this.f4799f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new c(this.f4798e, this.f4799f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f4797d;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.f4798e.f4806a;
            this.f4797d = 1;
            if (aVar.callPixelUrl(this.f4799f, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
