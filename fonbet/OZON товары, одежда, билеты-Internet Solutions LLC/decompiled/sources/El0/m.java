package El0;

import Sc.r;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import xe.B0;
import xe.H0;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$pushTestComponent$2$1", f = "VkpnsClientSdk.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class m extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super r<? extends String>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f8113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f8114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, kotlin.coroutines.d<? super m> dVar) {
        super(1, dVar);
        this.f8114e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new m(this.f8114e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super r<? extends String>> dVar) {
        return new m(this.f8114e, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f8113d;
        i iVar = this.f8114e;
        if (i11 == 0) {
            s.b(obj);
            B0 b02 = iVar.f8090p;
            if (b02 != null) {
                this.f8113d = 1;
                if (((H0) b02).r0(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        try {
            r.Companion companion = r.INSTANCE;
            a11 = iVar.c().j();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return r.a(a11);
    }
}
