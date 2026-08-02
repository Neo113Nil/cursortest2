package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.y6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4779y6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32537d;

    /* renamed from: e, reason: collision with root package name */
    public int f32538e;

    /* renamed from: f, reason: collision with root package name */
    public int f32539f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f32540g;

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4779y6 c4779y6 = new C4779y6(2, dVar);
        c4779y6.f32540g = obj;
        return c4779y6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4779y6 c4779y6 = new C4779y6(2, (kotlin.coroutines.d) obj2);
        c4779y6.f32540g = (InterfaceC2397i) obj;
        return c4779y6.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0039 -> B:5:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i11;
        int i12;
        InterfaceC2397i interfaceC2397i;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.f32539f;
        if (i13 == 0) {
            Sc.s.b(obj);
            i11 = 2;
            i12 = 0;
            interfaceC2397i = (InterfaceC2397i) this.f32540g;
            if (i12 < i11) {
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = this.f32538e;
            i11 = this.f32537d;
            interfaceC2397i = (InterfaceC2397i) this.f32540g;
            Sc.s.b(obj);
            i12++;
            if (i12 < i11) {
                this.f32540g = interfaceC2397i;
                this.f32537d = i11;
                this.f32538e = i12;
                this.f32539f = 1;
                if (interfaceC2397i.emit(null, this) == aVar) {
                    return aVar;
                }
                i12++;
                if (i12 < i11) {
                    return Unit.f71690a;
                }
            }
        }
    }
}
