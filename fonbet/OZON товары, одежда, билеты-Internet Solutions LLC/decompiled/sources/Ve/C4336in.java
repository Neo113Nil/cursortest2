package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* renamed from: Ve.in, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4336in extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31319d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4395ko f31321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Hn f31322g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4336in(C4395ko c4395ko, Hn hn, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31321f = c4395ko;
        this.f31322g = hn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4336in c4336in = new C4336in(this.f31321f, this.f31322g, dVar);
        c4336in.f31320e = obj;
        return c4336in;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4336in) create((InterfaceC2397i) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1.emit((Ve.AbstractC4245fi) r7, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r1.emit(null, r6) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31319d;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.f31320e;
            SdkAuthRequestBody sdkAuthRequestBody = this.f31321f.f31472d;
            if (sdkAuthRequestBody != null) {
                Ef ef2 = this.f31322g.f29172d;
                this.f31320e = interfaceC2397i;
                this.f31319d = 1;
                obj = ef2.a(sdkAuthRequestBody, this);
            } else {
                this.f31319d = 3;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
        interfaceC2397i = (InterfaceC2397i) this.f31320e;
        Sc.s.b(obj);
        this.f31320e = null;
        this.f31319d = 2;
    }
}
