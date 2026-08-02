package Ve;

import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class T2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4748x3 f30007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4087a4 f30008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f30009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(C4748x3 c4748x3, C4087a4 c4087a4, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30007e = c4748x3;
        this.f30008f = c4087a4;
        this.f30009g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new T2(this.f30007e, this.f30008f, this.f30009g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T2) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (xe.Y.a(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r6.k(r5.f30008f, r5.f30009g, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30006d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4748x3 c4748x3 = this.f30007e;
            int i12 = c4748x3.f32457g;
            if (i12 >= 3) {
                return new C4085a2(C4731we.f32365a);
            }
            c4748x3.f32457g = i12 + 1;
            this.f30006d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                throw new C4005g();
            }
            Sc.s.b(obj);
        }
        this.f30006d = 2;
    }
}
