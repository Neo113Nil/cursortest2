package B0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;
import r0.C9115P;
import x1.C10638m;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {Logger.NONE, 103}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class X0 extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    x1.x f1618d;

    /* renamed from: e, reason: collision with root package name */
    int f1619e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f1620f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2477h1 f1621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X0(InterfaceC2477h1 interfaceC2477h1, kotlin.coroutines.d<? super X0> dVar) {
        super(2, dVar);
        this.f1621g = interfaceC2477h1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        X0 x02 = new X0(this.f1621g, dVar);
        x02.f1620f = obj;
        return x02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((X0) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:6:0x0055). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10628c interfaceC10628c;
        InterfaceC10628c interfaceC10628c2;
        x1.x xVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1619e;
        InterfaceC2477h1 interfaceC2477h1 = this.f1621g;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC10628c = (InterfaceC10628c) this.f1620f;
            this.f1620f = interfaceC10628c;
            this.f1619e = 1;
            obj = C9115P.d(interfaceC10628c, null, this, 2);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = this.f1618d;
                interfaceC10628c2 = (InterfaceC10628c) this.f1620f;
                Sc.s.b(obj);
                List<x1.x> b11 = ((C10638m) obj).b();
                int size = b11.size();
                for (int i12 = 0; i12 < size; i12++) {
                    x1.x xVar2 = b11.get(i12);
                    if (x1.w.c(xVar2.d(), xVar.d()) && xVar2.g()) {
                        this.f1620f = interfaceC10628c2;
                        this.f1618d = xVar;
                        this.f1619e = 2;
                        obj = interfaceC10628c2.i0(EnumC10640o.Main, this);
                    }
                }
                interfaceC2477h1.d();
                return Unit.f71690a;
            }
            interfaceC10628c = (InterfaceC10628c) this.f1620f;
            Sc.s.b(obj);
        }
        x1.x xVar3 = (x1.x) obj;
        xVar3.getClass();
        interfaceC2477h1.a();
        interfaceC10628c2 = interfaceC10628c;
        xVar = xVar3;
        this.f1620f = interfaceC10628c2;
        this.f1618d = xVar;
        this.f1619e = 2;
        obj = interfaceC10628c2.i0(EnumC10640o.Main, this);
    }
}
