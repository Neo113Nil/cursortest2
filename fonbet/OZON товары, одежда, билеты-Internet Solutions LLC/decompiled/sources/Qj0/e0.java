package Qj0;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.performance.model.TraceEntity;
import ru.ozon.tracker.process.lifecycle.a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$sendBatchedTraceOnForeground$2", f = "TraceController.kt", l = {254, 522, 267}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Throwable f23630d;

    /* renamed from: e, reason: collision with root package name */
    Y f23631e;

    /* renamed from: f, reason: collision with root package name */
    List f23632f;

    /* renamed from: g, reason: collision with root package name */
    Je.d f23633g;

    /* renamed from: h, reason: collision with root package name */
    int f23634h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ List<TraceEntity> f23635i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Y f23636j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(Y y11, List list, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f23635i = list;
        this.f23636j = y11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e0(this.f23636j, this.f23635i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (Qj0.Y.y(r3, r4, r8) == r0) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Je.d dVar;
        Je.d dVar2;
        Throwable th2;
        Throwable th3;
        List list;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23634h;
        Y y11 = this.f23636j;
        List<TraceEntity> list2 = this.f23635i;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th4) {
            if (bk0.d.a(th4)) {
                throw th4;
            }
            int i12 = a.C2149a.f97837a[ru.ozon.tracker.process.lifecycle.a.b(y11.f23556g).b().ordinal()];
            if (i12 == 1) {
                dVar = y11.f23560k;
                this.f23630d = th4;
                this.f23631e = y11;
                this.f23632f = list2;
                this.f23633g = dVar;
                this.f23634h = 2;
                if (dVar.a(this) != aVar) {
                    dVar2 = dVar;
                    th2 = th4;
                }
            } else {
                if (i12 != 2) {
                    throw new Sc.o();
                }
                this.f23630d = th4;
                this.f23634h = 3;
                if (Y.t(y11, list2, this) != aVar) {
                    th3 = th4;
                }
            }
            return aVar;
        }
        if (i11 == 0) {
            Sc.s.b(obj);
            if (list2.isEmpty()) {
                return Unit.f71690a;
            }
            this.f23634h = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th3 = this.f23630d;
                    Sc.s.b(obj);
                    throw th3;
                }
                dVar2 = this.f23633g;
                list2 = this.f23632f;
                y11 = this.f23631e;
                th2 = this.f23630d;
                Sc.s.b(obj);
                try {
                    list = y11.f23562m;
                    list.addAll(list2);
                    Unit unit = Unit.f71690a;
                    dVar2.c(null);
                    throw th2;
                } catch (Throwable th5) {
                    dVar2.c(null);
                    throw th5;
                }
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
