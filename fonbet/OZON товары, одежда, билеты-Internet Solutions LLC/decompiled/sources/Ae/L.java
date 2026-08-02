package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class L<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f837a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<T> f838b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f839c;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {33, 34, DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "emit")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Object f840d;

        /* renamed from: e, reason: collision with root package name */
        Object f841e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f842f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L<T> f843g;

        /* renamed from: h, reason: collision with root package name */
        int f844h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(L<? super T> l11, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f843g = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f842f = obj;
            this.f844h |= LinearLayoutManager.INVALID_OFFSET;
            return this.f843g.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    L(kotlin.jvm.internal.I i11, InterfaceC2397i<? super T> interfaceC2397i, Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        this.f837a = i11;
        this.f838b = interfaceC2397i;
        this.f839c = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r2.f838b.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r6.f838b.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        L<T> l11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f844h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f844h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f842f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f844h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (this.f837a.f71783a) {
                        aVar.f844h = 1;
                    } else {
                        aVar.f840d = this;
                        aVar.f841e = t2;
                        aVar.f844h = 2;
                        obj = this.f839c.invoke(t2, aVar);
                        if (obj != aVar2) {
                            l11 = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    return aVar2;
                }
                if (i11 == 1) {
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                t2 = (T) aVar.f841e;
                l11 = (L) aVar.f840d;
                Sc.s.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f71690a;
                }
                l11.f837a.f71783a = true;
                aVar.f840d = null;
                aVar.f841e = null;
                aVar.f844h = 3;
            }
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f842f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f844h;
        if (i11 != 0) {
        }
    }
}
