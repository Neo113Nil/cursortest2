package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.PayBindingRequestBody;
import xe.C10720e0;

/* renamed from: Ve.nk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4478nk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4744x f31666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4478nk(C4744x c4744x, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31666e = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4478nk(this.f31666e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4478nk(this.f31666e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r7.f32396A.f(r4, He.b.f10879b, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.f32437z.f(r4, He.b.f10879b, r6) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31665d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4744x c4744x = this.f31666e;
            PayStrategy j11 = ((C4654tn) c4744x.f32413b).j();
            if (j11 instanceof PayStrategy.PayWithBinding) {
                PayBindingRequestBody payBindingRequestBody = new PayBindingRequestBody(((C4654tn) c4744x.f32413b).k());
                int i12 = Mj.f29480a[((PayStrategy.PayWithBinding) j11).getVersion().ordinal()];
                if (i12 == 1) {
                    this.f31665d = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                } else if (i12 == 2) {
                    this.f31665d = 2;
                    C10720e0 c10720e02 = C10720e0.f105451a;
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
