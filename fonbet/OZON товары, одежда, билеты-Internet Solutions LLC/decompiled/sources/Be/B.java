package Be;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.E0;
import xe.InterfaceC10746s;

/* loaded from: classes.dex */
public final class B<T> extends kotlin.coroutines.jvm.internal.c implements InterfaceC2397i<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC2397i<T> f3549d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f3550e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3551f;

    /* renamed from: g, reason: collision with root package name */
    private CoroutineContext f3552g;

    /* renamed from: h, reason: collision with root package name */
    private kotlin.coroutines.d<? super Unit> f3553h;

    /* JADX WARN: Multi-variable type inference failed */
    public B(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull CoroutineContext coroutineContext) {
        super(x.f3693a, kotlin.coroutines.g.f71771a);
        this.f3549d = interfaceC2397i;
        this.f3550e = coroutineContext;
        this.f3551f = ((Number) coroutineContext.fold(0, new C2628A())).intValue();
    }

    private final Object a(kotlin.coroutines.d<? super Unit> dVar, T t2) {
        InterfaceC6511n interfaceC6511n;
        CoroutineContext context = dVar.getContext();
        E0.f(context);
        CoroutineContext coroutineContext = this.f3552g;
        if (coroutineContext != context) {
            if (coroutineContext instanceof s) {
                throw new IllegalStateException(kotlin.text.h.E0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((s) coroutineContext).f3687b + ", but then emission attempt of value '" + t2 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Function2() { // from class: Be.D
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
                
                    if (r1 == null) goto L17;
                 */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
                    int intValue = ((Integer) obj).intValue();
                    CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                    CoroutineContext.a<?> key = element.getKey();
                    CoroutineContext.Element element2 = B.this.f3550e.get(key);
                    if (key != B0.f105374o0) {
                        if (element != element2) {
                            intValue = LinearLayoutManager.INVALID_OFFSET;
                        }
                        intValue++;
                    } else {
                        B0 b02 = (B0) element2;
                        B0 b03 = (B0) element;
                        while (true) {
                            if (b03 != null) {
                                if (b03 == b02 || !(b03 instanceof De.w)) {
                                    break;
                                }
                                InterfaceC10746s T11 = ((De.w) b03).T();
                                b03 = T11 != null ? T11.getParent() : null;
                            } else {
                                b03 = null;
                                break;
                            }
                        }
                        if (b03 != b02) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b03 + ", expected child of " + b02 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue);
                }
            })).intValue() != this.f3551f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3550e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3552g = context;
        }
        this.f3553h = dVar;
        interfaceC6511n = C.f3554a;
        InterfaceC2397i<T> interfaceC2397i = this.f3549d;
        Intrinsics.g(interfaceC2397i, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object invoke = interfaceC6511n.invoke(interfaceC2397i, t2, this);
        if (!Intrinsics.d(invoke, Wc.a.COROUTINE_SUSPENDED)) {
            this.f3553h = null;
        }
        return invoke;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> frame) {
        try {
            Object a11 = a(frame, t2);
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (a11 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return a11 == aVar ? a11 : Unit.f71690a;
        } catch (Throwable th2) {
            this.f3552g = new s(frame.getContext(), th2);
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.d
    public final kotlin.coroutines.jvm.internal.d getCallerFrame() {
        kotlin.coroutines.d<? super Unit> dVar = this.f3553h;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.c, kotlin.coroutines.d
    @NotNull
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f3552g;
        return coroutineContext == null ? kotlin.coroutines.g.f71771a : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    protected final Object invokeSuspend(@NotNull Object obj) {
        Throwable b11 = Sc.r.b(obj);
        if (b11 != null) {
            this.f3552g = new s(getContext(), b11);
        }
        kotlin.coroutines.d<? super Unit> dVar = this.f3553h;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return Wc.a.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.c, kotlin.coroutines.jvm.internal.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
