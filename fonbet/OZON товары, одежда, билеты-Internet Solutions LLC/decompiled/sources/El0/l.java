package El0;

import Sc.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;
import yl0.C10923h;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onUpdate$1", f = "VkpnsClientSdk.kt", l = {142, 144, 146}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f8110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f8111e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onUpdate$1$1", f = "VkpnsClientSdk.kt", l = {150}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public int f8112d;

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(1, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return new a(1, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8112d;
            if (i11 == 0) {
                s.b(obj);
                C10923h c10923h = new C10923h(0);
                C10923h.a aVar2 = (C10923h.a) new Pair(c10923h, new C10923h.a()).b();
                this.f8112d = 1;
                i iVar = i.f8074r;
                if (iVar == null) {
                    throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
                }
                Object f7 = ((El0.a) iVar.f8084j.getValue()).f(aVar2, this);
                if (f7 != aVar) {
                    f7 = Unit.f71690a;
                }
                if (f7 == aVar) {
                    return aVar;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f8111e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f8111e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return new l(this.f8111e, dVar).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (r8.a(r5.f8075a, r1, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (xe.N.d(new Ol0.r(r8.f35157a.f19639a, true, null), r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r8.b(r7) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f8110d;
        i iVar = this.f8111e;
        if (i11 == 0) {
            s.b(obj);
            Nl0.e eVar = (Nl0.e) iVar.f8082h.getValue();
            this.f8110d = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            h hVar = (h) iVar.f8085k.getValue();
            a aVar2 = new a(1, null);
            this.f8110d = 3;
        }
        Yl0.e eVar2 = (Yl0.e) iVar.f8083i.getValue();
        this.f8110d = 2;
    }
}
