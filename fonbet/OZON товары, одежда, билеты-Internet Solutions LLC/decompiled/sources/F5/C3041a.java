package F5;

import S0.InterfaceC3978p0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {ModuleDescriptor.MODULE_VERSION, 78}, m = "invokeSuspend")
/* renamed from: F5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3041a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f9001d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f9002e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3043c f9003f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ B5.g f9004g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f9005h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ n f9006i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f9007j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3041a(boolean z11, InterfaceC3043c interfaceC3043c, B5.g gVar, float f7, n nVar, InterfaceC3978p0 interfaceC3978p0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f9002e = z11;
        this.f9003f = interfaceC3043c;
        this.f9004g = gVar;
        this.f9005h = f7;
        this.f9006i = nVar;
        this.f9007j = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3041a(this.f9002e, this.f9003f, this.f9004g, this.f9005h, this.f9006i, this.f9007j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3041a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        if (r2.l(r9.f9004g, r2.p(), r9.f9005h, r6, r9.f9006i, r9) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r10 != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object q11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f9001d;
        InterfaceC3043c interfaceC3043c = this.f9003f;
        InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f9007j;
        boolean z11 = this.f9002e;
        if (i11 == 0) {
            Sc.s.b(obj);
            if (z11 && !interfaceC3978p0.getValue().booleanValue()) {
                this.f9001d = 1;
                B5.g j11 = interfaceC3043c.j();
                o r11 = interfaceC3043c.r();
                float speed = interfaceC3043c.getSpeed();
                float f7 = 0.0f;
                if (speed >= 0.0f || j11 != null) {
                    if (j11 != null) {
                        if (speed < 0.0f) {
                            if (r11 != null) {
                                f7 = r11.a();
                            }
                        } else if (r11 != null) {
                            f7 = r11.b();
                        }
                    }
                    q11 = interfaceC3043c.q(interfaceC3043c.j(), f7, !(f7 != interfaceC3043c.i()), this);
                    if (q11 != aVar) {
                        q11 = Unit.f71690a;
                    }
                }
                f7 = 1.0f;
                q11 = interfaceC3043c.q(interfaceC3043c.j(), f7, !(f7 != interfaceC3043c.i()), this);
                if (q11 != aVar) {
                }
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
        if (!z11) {
            return Unit.f71690a;
        }
        float i12 = interfaceC3043c.i();
        this.f9001d = 2;
    }
}
