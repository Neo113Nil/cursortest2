package Ve;

import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.v7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4696v7 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4091a8 f32261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D8 f32262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f32263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4696v7(C4091a8 c4091a8, D8 d82, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32261e = c4091a8;
        this.f32262f = d82;
        this.f32263g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4696v7(this.f32261e, this.f32262f, this.f32263g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4696v7) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (xe.Y.a(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r6.k(r5.f32262f, r5.f32263g, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32260d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4091a8 c4091a8 = this.f32261e;
            int i12 = c4091a8.f30645d;
            if (i12 >= 3) {
                return new C4085a2(C4731we.f32365a);
            }
            c4091a8.f30645d = i12 + 1;
            this.f32260d = 1;
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
        this.f32260d = 2;
    }
}
