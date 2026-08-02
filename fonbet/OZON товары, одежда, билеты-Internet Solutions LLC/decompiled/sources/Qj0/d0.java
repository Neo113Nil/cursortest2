package Qj0;

import Je.InterfaceC3394a;
import Sc.r;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$saveTracesAndSendIfNeeded$2", f = "TraceController.kt", l = {434, 520, 444, 450, 452, 456, 459}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f23621d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3394a f23622e;

    /* renamed from: f, reason: collision with root package name */
    Y f23623f;

    /* renamed from: g, reason: collision with root package name */
    kotlin.jvm.internal.M f23624g;

    /* renamed from: h, reason: collision with root package name */
    int f23625h;

    /* renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f23626i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Y f23627j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ boolean f23628k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(Y y11, boolean z11, kotlin.coroutines.d<? super d0> dVar) {
        super(2, dVar);
        this.f23627j = y11;
        this.f23628k = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        d0 d0Var = new d0(this.f23627j, this.f23628k, dVar);
        d0Var.f23626i = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0177, code lost:
    
        if (Qj0.Y.r(r2, r10, r1, r9) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x014e, code lost:
    
        if (bk0.d.a(r10) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0163, code lost:
    
        if (r10.a(r4, r9) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
    
        if (Qj0.Y.g(r2, r9) == r0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Type inference failed for: r10v25, types: [T] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ?? r12;
        Throwable b11;
        List list;
        xe.M m11;
        Je.d dVar;
        xe.M m12;
        InterfaceC3394a interfaceC3394a;
        kotlin.jvm.internal.M m13;
        Y y11;
        LinkedBlockingQueue linkedBlockingQueue;
        List list2;
        LinkedBlockingQueue linkedBlockingQueue2;
        List list3;
        Object t2;
        kotlin.jvm.internal.M m14;
        ?? r102;
        List list4;
        LinkedBlockingQueue linkedBlockingQueue3;
        kotlin.jvm.internal.M m15;
        Object obj2;
        Object x11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23625h;
        Y y12 = this.f23627j;
        try {
            try {
            } catch (Throwable th2) {
                interfaceC3394a.c(null);
                throw th2;
            }
        } catch (Throwable th3) {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = Sc.s.a(th3);
            r12 = i11;
        }
        switch (i11) {
            case 0:
                Sc.s.b(obj);
                m11 = (xe.M) this.f23626i;
                this.f23626i = m11;
                this.f23625h = 1;
                break;
            case 1:
                m11 = (xe.M) this.f23626i;
                Sc.s.b(obj);
                kotlin.jvm.internal.M m16 = new kotlin.jvm.internal.M();
                dVar = y12.f23560k;
                this.f23626i = m11;
                this.f23621d = m16;
                this.f23622e = dVar;
                this.f23623f = y12;
                this.f23625h = 2;
                if (dVar.a(this) != aVar) {
                    m12 = m11;
                    interfaceC3394a = dVar;
                    m13 = m16;
                    y11 = y12;
                    linkedBlockingQueue = y11.f23561l;
                    int size = linkedBlockingQueue.size();
                    list2 = y11.f23562m;
                    Tc.b builder = new Tc.b(size + list2.size());
                    linkedBlockingQueue2 = y11.f23561l;
                    builder.addAll(linkedBlockingQueue2);
                    list3 = y11.f23562m;
                    Intrinsics.checkNotNullExpressionValue(list3, "access$getFailedTraces$p(...)");
                    builder.addAll(list3);
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    Tc.b B11 = builder.B();
                    this.f23626i = m12;
                    this.f23621d = m13;
                    this.f23622e = interfaceC3394a;
                    this.f23623f = y11;
                    this.f23624g = m13;
                    this.f23625h = 3;
                    t2 = Y.t(y11, B11, this);
                    if (t2 == aVar) {
                        m14 = m13;
                        r102 = t2;
                        m13.f71787a = r102;
                        list4 = y11.f23562m;
                        list4.clear();
                        linkedBlockingQueue3 = y11.f23561l;
                        linkedBlockingQueue3.clear();
                        Unit unit = Unit.f71690a;
                        interfaceC3394a.c(null);
                        if (this.f23628k) {
                            l0 l0Var = y12.f23552c;
                            List list5 = (List) m14.f71787a;
                            this.f23626i = m12;
                            this.f23621d = m14;
                            this.f23622e = null;
                            this.f23623f = null;
                            this.f23624g = null;
                            this.f23625h = 4;
                            Serializable f7 = l0Var.f(list5, this);
                            if (f7 != aVar) {
                                m15 = m14;
                                obj2 = f7;
                                ?? r13 = (List) obj2;
                                r.Companion companion2 = Sc.r.INSTANCE;
                                this.f23626i = m15;
                                this.f23621d = r13;
                                this.f23625h = 5;
                                x11 = Y.x(y12, r13, this);
                                i11 = r13;
                                if (x11 == aVar) {
                                }
                                a11 = Unit.f71690a;
                                r.Companion companion3 = Sc.r.INSTANCE;
                                r12 = i11;
                                b11 = Sc.r.b(a11);
                                if (b11 != null) {
                                    list = r12;
                                    break;
                                }
                                l0 l0Var2 = y12.f23552c;
                                List<Long> list6 = (List) m15.f71787a;
                                this.f23626i = r12;
                                this.f23621d = null;
                                this.f23625h = 6;
                                list = r12;
                                break;
                            }
                        }
                        return Unit.f71690a;
                    }
                }
                return aVar;
            case 2:
                Y y13 = this.f23623f;
                InterfaceC3394a interfaceC3394a2 = this.f23622e;
                kotlin.jvm.internal.M m17 = (kotlin.jvm.internal.M) this.f23621d;
                xe.M m18 = (xe.M) this.f23626i;
                Sc.s.b(obj);
                y11 = y13;
                m13 = m17;
                interfaceC3394a = interfaceC3394a2;
                m12 = m18;
                linkedBlockingQueue = y11.f23561l;
                int size2 = linkedBlockingQueue.size();
                list2 = y11.f23562m;
                Tc.b builder2 = new Tc.b(size2 + list2.size());
                linkedBlockingQueue2 = y11.f23561l;
                builder2.addAll(linkedBlockingQueue2);
                list3 = y11.f23562m;
                Intrinsics.checkNotNullExpressionValue(list3, "access$getFailedTraces$p(...)");
                builder2.addAll(list3);
                Intrinsics.checkNotNullParameter(builder2, "builder");
                Tc.b B112 = builder2.B();
                this.f23626i = m12;
                this.f23621d = m13;
                this.f23622e = interfaceC3394a;
                this.f23623f = y11;
                this.f23624g = m13;
                this.f23625h = 3;
                t2 = Y.t(y11, B112, this);
                if (t2 == aVar) {
                }
                break;
            case 3:
                m13 = this.f23624g;
                y11 = this.f23623f;
                interfaceC3394a = this.f23622e;
                m14 = (kotlin.jvm.internal.M) this.f23621d;
                m12 = (xe.M) this.f23626i;
                Sc.s.b(obj);
                r102 = obj;
                m13.f71787a = r102;
                list4 = y11.f23562m;
                list4.clear();
                linkedBlockingQueue3 = y11.f23561l;
                linkedBlockingQueue3.clear();
                Unit unit2 = Unit.f71690a;
                interfaceC3394a.c(null);
                if (this.f23628k) {
                }
                return Unit.f71690a;
            case 4:
                kotlin.jvm.internal.M m19 = (kotlin.jvm.internal.M) this.f23621d;
                Sc.s.b(obj);
                m15 = m19;
                obj2 = obj;
                ?? r132 = (List) obj2;
                r.Companion companion22 = Sc.r.INSTANCE;
                this.f23626i = m15;
                this.f23621d = r132;
                this.f23625h = 5;
                x11 = Y.x(y12, r132, this);
                i11 = r132;
                if (x11 == aVar) {
                }
                a11 = Unit.f71690a;
                r.Companion companion32 = Sc.r.INSTANCE;
                r12 = i11;
                b11 = Sc.r.b(a11);
                if (b11 != null) {
                }
                l0 l0Var22 = y12.f23552c;
                List<Long> list62 = (List) m15.f71787a;
                this.f23626i = r12;
                this.f23621d = null;
                this.f23625h = 6;
                list = r12;
                break;
            case 5:
                ?? r14 = (List) this.f23621d;
                m15 = (kotlin.jvm.internal.M) this.f23626i;
                Sc.s.b(obj);
                i11 = r14;
                a11 = Unit.f71690a;
                r.Companion companion322 = Sc.r.INSTANCE;
                r12 = i11;
                b11 = Sc.r.b(a11);
                if (b11 != null) {
                }
                l0 l0Var222 = y12.f23552c;
                List<Long> list622 = (List) m15.f71787a;
                this.f23626i = r12;
                this.f23621d = null;
                this.f23625h = 6;
                list = r12;
                break;
            case 6:
                List list7 = (List) this.f23626i;
                Sc.s.b(obj);
                list = list7;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.BACKGROUND;
                int size3 = list.size();
                this.f23626i = null;
                this.f23621d = null;
                this.f23625h = 7;
                break;
            case 7:
                Sc.s.b(obj);
                return Unit.f71690a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
