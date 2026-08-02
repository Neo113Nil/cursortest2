package El0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import yl0.C10923h;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$getToken$1", f = "VkpnsClientSdk.kt", l = {190, 195}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f8103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f8104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C10923h<String>.a f8105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, C10923h<String>.a aVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f8104e = iVar;
        this.f8105f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f8104e, this.f8105f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return new j(this.f8104e, this.f8105f, dVar).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r5 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002f, code lost:
    
        if (r5 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f8103d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = (a) this.f8104e.f8084j.getValue();
            this.f8103d = 1;
            obj = aVar2.b(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        String str = (String) obj;
        C10923h<String>.a aVar3 = this.f8105f;
        if (str != null && !kotlin.text.h.K(str)) {
            aVar3.b(str);
            return Unit.f71690a;
        }
        this.f8103d = 2;
        i iVar = i.f8074r;
        if (iVar == null) {
            throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
        }
        Object f7 = ((a) iVar.f8084j.getValue()).f(aVar3, this);
        if (f7 != aVar) {
            f7 = Unit.f71690a;
        }
    }
}
