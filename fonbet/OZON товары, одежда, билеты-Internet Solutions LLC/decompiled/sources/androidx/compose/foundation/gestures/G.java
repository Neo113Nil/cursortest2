package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC5172o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class G extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.M f39006d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.M f39007e;

    /* renamed from: f, reason: collision with root package name */
    int f39008f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f39009g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ B f39010h;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {438}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<Function1<? super AbstractC5172o.b, ? extends Unit>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        kotlin.jvm.internal.M f39011d;

        /* renamed from: e, reason: collision with root package name */
        int f39012e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39013f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<AbstractC5172o> f39014g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ B f39015h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.M<AbstractC5172o> m11, B b11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f39014g = m11;
            this.f39015h = b11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f39014g, this.f39015h, dVar);
            aVar.f39013f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Function1<? super AbstractC5172o.b, ? extends Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(function1, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:6:0x0057). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:5:0x0054). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            AbstractC5172o abstractC5172o;
            ze.h hVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39012e;
            if (i11 == 0) {
                Sc.s.b(obj);
                function1 = (Function1) this.f39013f;
                r1 = this.f39014g;
                abstractC5172o = r1.f71787a;
                if (abstractC5172o instanceof AbstractC5172o.d) {
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.M<AbstractC5172o> m11 = this.f39011d;
            function1 = (Function1) this.f39013f;
            Sc.s.b(obj);
            T t2 = (AbstractC5172o) obj;
            m11.f71787a = t2;
            m11 = this.f39014g;
            abstractC5172o = m11.f71787a;
            if (!(abstractC5172o instanceof AbstractC5172o.d) || (abstractC5172o instanceof AbstractC5172o.a)) {
                return Unit.f71690a;
            }
            t2 = 0;
            AbstractC5172o.b bVar = abstractC5172o instanceof AbstractC5172o.b ? (AbstractC5172o.b) abstractC5172o : null;
            if (bVar != null) {
                function1.invoke(bVar);
            }
            hVar = this.f39015h.f38956h;
            if (hVar != null) {
                this.f39013f = function1;
                this.f39011d = m11;
                this.f39012e = 1;
                obj = ((C11115c) hVar).i(this);
                if (obj == aVar) {
                    return aVar;
                }
                T t22 = (AbstractC5172o) obj;
            }
            m11.f71787a = t22;
            m11 = this.f39014g;
            abstractC5172o = m11.f71787a;
            if (abstractC5172o instanceof AbstractC5172o.d) {
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(B b11, kotlin.coroutines.d<? super G> dVar) {
        super(2, dVar);
        this.f39010h = b11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        G g10 = new G(this.f39010h, dVar);
        g10.f39009g = obj;
        return g10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        if (r3.W1(r7, r6) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        if (androidx.compose.foundation.gestures.B.Q1(r3, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        if (androidx.compose.foundation.gestures.B.Q1(r3, r6) != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:30:0x00cc, B:27:0x00b5], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0086 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c7 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ce -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00db -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e9 -> B:7:0x0027). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        xe.M m11;
        kotlin.jvm.internal.M m12;
        kotlin.jvm.internal.M m13;
        kotlin.jvm.internal.M m14;
        xe.M m15;
        xe.M m16;
        T t2;
        T t11;
        ze.h hVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39008f;
        B b11 = this.f39010h;
        switch (i11) {
            case 0:
                Sc.s.b(obj);
                m11 = (xe.M) this.f39009g;
                if (xe.N.f(m11)) {
                    m12 = new kotlin.jvm.internal.M();
                    hVar = b11.f38956h;
                    if (hVar != null) {
                        this.f39009g = m11;
                        this.f39006d = m12;
                        this.f39007e = m12;
                        this.f39008f = 1;
                        obj = ((C11115c) hVar).i(this);
                        if (obj != aVar) {
                            m13 = m12;
                            t2 = (AbstractC5172o) obj;
                            m12.f71787a = t2;
                            t11 = m13.f71787a;
                            if (t11 instanceof AbstractC5172o.c) {
                                this.f39009g = m11;
                                this.f39006d = m13;
                                this.f39007e = null;
                                this.f39008f = 2;
                                if (B.R1(b11, (AbstractC5172o.c) t11, this) != aVar) {
                                    m14 = m13;
                                    m15 = m11;
                                    a aVar2 = new a(m14, b11, null);
                                    this.f39009g = m15;
                                    this.f39006d = m14;
                                    this.f39008f = 3;
                                    break;
                                }
                            }
                            if (xe.N.f(m11)) {
                                return Unit.f71690a;
                            }
                        }
                        return aVar;
                    }
                    m13 = m12;
                    t2 = 0;
                    m12.f71787a = t2;
                    t11 = m13.f71787a;
                    if (t11 instanceof AbstractC5172o.c) {
                    }
                    if (xe.N.f(m11)) {
                    }
                }
            case 1:
                m12 = this.f39007e;
                m13 = this.f39006d;
                m11 = (xe.M) this.f39009g;
                Sc.s.b(obj);
                t2 = (AbstractC5172o) obj;
                m12.f71787a = t2;
                t11 = m13.f71787a;
                if (t11 instanceof AbstractC5172o.c) {
                }
                if (xe.N.f(m11)) {
                }
                break;
            case 2:
                m14 = this.f39006d;
                m15 = (xe.M) this.f39009g;
                Sc.s.b(obj);
                a aVar22 = new a(m14, b11, null);
                this.f39009g = m15;
                this.f39006d = m14;
                this.f39008f = 3;
                break;
            case 3:
                m14 = this.f39006d;
                m15 = (xe.M) this.f39009g;
                try {
                    Sc.s.b(obj);
                } catch (CancellationException unused) {
                    m16 = m15;
                    this.f39009g = m16;
                    this.f39006d = null;
                    this.f39008f = 6;
                    break;
                }
                m11 = m15;
                try {
                } catch (CancellationException unused2) {
                    m16 = m11;
                    this.f39009g = m16;
                    this.f39006d = null;
                    this.f39008f = 6;
                }
                T t12 = m14.f71787a;
                if (t12 instanceof AbstractC5172o.d) {
                    Intrinsics.g(t12, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                    this.f39009g = m11;
                    this.f39006d = null;
                    this.f39008f = 4;
                    if (B.S1(b11, (AbstractC5172o.d) t12, this) == aVar) {
                        return aVar;
                    }
                    if (xe.N.f(m11)) {
                    }
                } else {
                    if (t12 instanceof AbstractC5172o.a) {
                        this.f39009g = m11;
                        this.f39006d = null;
                        this.f39008f = 5;
                        break;
                    }
                    if (xe.N.f(m11)) {
                    }
                }
                break;
            case 4:
                m16 = (xe.M) this.f39009g;
                try {
                    Sc.s.b(obj);
                } catch (CancellationException unused3) {
                    this.f39009g = m16;
                    this.f39006d = null;
                    this.f39008f = 6;
                    break;
                }
                m11 = m16;
                if (xe.N.f(m11)) {
                }
                break;
            case 5:
                m16 = (xe.M) this.f39009g;
                Sc.s.b(obj);
                m11 = m16;
                if (xe.N.f(m11)) {
                }
                break;
            case 6:
                m16 = (xe.M) this.f39009g;
                Sc.s.b(obj);
                m11 = m16;
                if (xe.N.f(m11)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
