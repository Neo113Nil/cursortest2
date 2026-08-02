package F0;

import B0.EnumC2526y0;
import F0.E;
import I0.C3196m0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import x1.C10638m;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", l = {33, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* renamed from: F0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2981b extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    x1.x f8212d;

    /* renamed from: e, reason: collision with root package name */
    int f8213e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f8214f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2982c f8215g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f8216h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2981b(InterfaceC2982c interfaceC2982c, Function0<Unit> function0, kotlin.coroutines.d<? super C2981b> dVar) {
        super(2, dVar);
        this.f8215g = interfaceC2982c;
        this.f8216h = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C2981b c2981b = new C2981b(this.f8215g, this.f8216h, dVar);
        c2981b.f8214f = obj;
        return c2981b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2981b) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r13 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
    
        if (r13 == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006c -> B:6:0x006f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10628c interfaceC10628c;
        long P11;
        InterfaceC10628c interfaceC10628c2;
        x1.x xVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f8213e;
        Function0<Unit> function0 = this.f8216h;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC10628c = (InterfaceC10628c) this.f8214f;
            this.f8214f = interfaceC10628c;
            this.f8213e = 1;
            obj = C9115P.d(interfaceC10628c, null, this, 2);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = this.f8212d;
                interfaceC10628c2 = (InterfaceC10628c) this.f8214f;
                Sc.s.b(obj);
                List<x1.x> b11 = ((C10638m) obj).b();
                int size = b11.size();
                for (int i12 = 0; i12 < size; i12++) {
                    x1.x xVar2 = b11.get(i12);
                    if (x1.w.c(xVar2.d(), xVar.d()) && xVar2.g()) {
                        this.f8214f = interfaceC10628c2;
                        this.f8212d = xVar;
                        this.f8213e = 2;
                        obj = interfaceC10628c2.i0(EnumC10640o.Main, this);
                    }
                }
                ((E.b.C0181b) function0).invoke();
                return Unit.f71690a;
            }
            interfaceC10628c = (InterfaceC10628c) this.f8214f;
            Sc.s.b(obj);
        }
        x1.x xVar3 = (x1.x) obj;
        xVar3.getClass();
        E.b.a aVar2 = (E.b.a) this.f8215g;
        C2990k c2990k = aVar2.f8182a;
        C2990k.o(c2990k);
        boolean z11 = aVar2.f8183b;
        EnumC2526y0 enumC2526y0 = z11 ? EnumC2526y0.SelectionStart : EnumC2526y0.SelectionEnd;
        P11 = c2990k.P(z11);
        c2990k.f0(enumC2526y0, C3196m0.a(P11));
        interfaceC10628c2 = interfaceC10628c;
        xVar = xVar3;
        this.f8214f = interfaceC10628c2;
        this.f8212d = xVar;
        this.f8213e = 2;
        obj = interfaceC10628c2.i0(EnumC10640o.Main, this);
    }
}
