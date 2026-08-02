package Ve;

import Je.InterfaceC3394a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;

/* renamed from: Ve.n0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4458n0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3394a f31615d;

    /* renamed from: e, reason: collision with root package name */
    public Context f31616e;

    /* renamed from: f, reason: collision with root package name */
    public int f31617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f31618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4458n0(Context context, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31618g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4458n0(this.f31618g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4458n0(this.f31618g, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (xe.C10727i.f(r3, r5, r7) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if (r8.a(r7) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v5, types: [Je.a] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Je.d dVar;
        Context context;
        ?? r02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31617f;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                dVar = U0.f30087b;
                this.f31615d = dVar;
                context = this.f31618g;
                this.f31616e = context;
                this.f31617f = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r02 = this.f31615d;
                    try {
                        Sc.s.b(obj);
                        r02 = r02;
                        Unit unit = Unit.f71690a;
                        r02.c(null);
                        return unit;
                    } catch (Throwable th2) {
                        Je.d dVar2 = r02;
                        th = th2;
                        dVar = dVar2;
                        dVar.c(null);
                        throw th;
                    }
                }
                context = this.f31616e;
                ?? r32 = this.f31615d;
                Sc.s.b(obj);
                dVar = r32;
            }
            if (U0.f30088c == null) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                He.b bVar = He.b.f10879b;
                F f7 = new F(context, null);
                this.f31615d = dVar;
                this.f31616e = null;
                this.f31617f = 2;
            }
            r02 = dVar;
            Unit unit2 = Unit.f71690a;
            r02.c(null);
            return unit2;
        } catch (Throwable th3) {
            th = th3;
            dVar.c(null);
            throw th;
        }
    }
}
