package A20;

import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i f309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f310b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.core.ui.utils.InteractionSourceExtKt$rememberIndicationTransition$1$1$invokeSuspend$$inlined$filter$1$2", f = "InteractionSourceExt.kt", l = {223}, m = "emit")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f311d;

        /* renamed from: e, reason: collision with root package name */
        int f312e;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f311d = obj;
            this.f312e |= LinearLayoutManager.INVALID_OFFSET;
            return d.this.emit(null, this);
        }
    }

    public d(InterfaceC2397i interfaceC2397i, InterfaceC3978p0 interfaceC3978p0) {
        this.f309a = interfaceC2397i;
        this.f310b = interfaceC3978p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f312e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f312e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = aVar.f311d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f312e;
                if (i11 != 0) {
                    s.b(obj2);
                    if (((Boolean) obj).booleanValue() && ((Boolean) this.f310b.getValue()).booleanValue()) {
                        aVar.f312e = 1;
                        if (this.f309a.emit(obj, aVar) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj22 = aVar.f311d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f312e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
