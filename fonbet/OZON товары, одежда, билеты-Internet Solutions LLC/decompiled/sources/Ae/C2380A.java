package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ae.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2380A implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f752a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f753b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
    /* renamed from: Ae.A$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f754d;

        /* renamed from: e, reason: collision with root package name */
        int f755e;

        /* renamed from: g, reason: collision with root package name */
        C2380A f757g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC2397i f758h;

        /* renamed from: i, reason: collision with root package name */
        Be.B f759i;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f754d = obj;
            this.f755e |= LinearLayoutManager.INVALID_OFFSET;
            return C2380A.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2380A(InterfaceC2395h interfaceC2395h, Function2 function2) {
        this.f752a = (kotlin.coroutines.jvm.internal.j) function2;
        this.f753b = interfaceC2395h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r7.collect(r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        Throwable th2;
        Be.B b11;
        C2380A c2380a;
        InterfaceC2397i<? super Object> interfaceC2397i2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f755e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f755e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f754d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f755e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Be.B b12 = new Be.B(interfaceC2397i, aVar.getContext());
                    try {
                        ?? r22 = this.f752a;
                        aVar.f757g = this;
                        aVar.f758h = interfaceC2397i;
                        aVar.f759i = b12;
                        aVar.f755e = 1;
                        if (r22.invoke(b12, aVar) != aVar2) {
                            c2380a = this;
                            interfaceC2397i2 = interfaceC2397i;
                            b11 = b12;
                        }
                        return aVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        b11 = b12;
                        b11.releaseIntercepted();
                        throw th2;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                b11 = aVar.f759i;
                interfaceC2397i2 = aVar.f758h;
                c2380a = aVar.f757g;
                try {
                    Sc.s.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    b11.releaseIntercepted();
                    throw th2;
                }
                b11.releaseIntercepted();
                InterfaceC2395h interfaceC2395h = c2380a.f753b;
                aVar.f757g = null;
                aVar.f758h = null;
                aVar.f759i = null;
                aVar.f755e = 2;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f754d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f755e;
        if (i11 != 0) {
        }
        b11.releaseIntercepted();
        InterfaceC2395h interfaceC2395h2 = c2380a.f753b;
        aVar.f757g = null;
        aVar.f758h = null;
        aVar.f759i = null;
        aVar.f755e = 2;
    }
}
