package F5;

import S0.InterfaceC3978p0;
import android.content.Context;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {91, 93}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class E extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Throwable f8994d;

    /* renamed from: e, reason: collision with root package name */
    int f8995e;

    /* renamed from: f, reason: collision with root package name */
    int f8996f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<Integer, Throwable, kotlin.coroutines.d<? super Boolean>, Object> f8997g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Context f8998h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ v f8999i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<q> f9000j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(InterfaceC6511n interfaceC6511n, Context context, v vVar, InterfaceC3978p0 interfaceC3978p0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f8997g = interfaceC6511n;
        this.f8998h = context;
        this.f8999i = vVar;
        this.f9000j = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new E(this.f8997g, this.f8998h, this.f8999i, this.f9000j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((E) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(3:6|7|8)|9|10|11|12|(10:(1:15)|21|22|(3:35|(1:38)|37)(1:24)|25|(1:34)|28|29|(6:31|9|10|11|12|(0))|19)|39|(1:42)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r2 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b2 -> B:9:0x00b3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable th2;
        int i11;
        int i12;
        String concat;
        Object a11;
        Object obj2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.f8996f;
        InterfaceC3978p0<q> interfaceC3978p0 = this.f9000j;
        if (i13 == 0) {
            Sc.s.b(obj);
            th2 = null;
            i11 = 0;
            if (!interfaceC3978p0.getValue().v()) {
            }
            if (!interfaceC3978p0.getValue().s()) {
                interfaceC3978p0.getValue().k(th2);
            }
            return Unit.f71690a;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = this.f8995e;
            Throwable th3 = this.f8994d;
            try {
                Sc.s.b(obj);
                i12 = i14;
                th2 = th3;
                a11 = obj;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                i12 = i14;
                th2 = th5;
                i11 = i12 + 1;
                if (!interfaceC3978p0.getValue().v()) {
                }
                if (!interfaceC3978p0.getValue().s()) {
                }
                return Unit.f71690a;
            }
            interfaceC3978p0.getValue().b((B5.g) a11);
            i11 = i12;
            if (!interfaceC3978p0.getValue().v()) {
                if (i11 != 0) {
                    Integer num = new Integer(i11);
                    Intrinsics.f(th2);
                    this.f8994d = th2;
                    this.f8995e = i11;
                    this.f8996f = 1;
                    obj2 = ((D) this.f8997g).invoke(num, th2, this);
                }
                i12 = i11;
                Throwable th6 = th2;
                Context context = this.f8998h;
                v vVar = this.f8999i;
                if (kotlin.text.h.K("fonts/")) {
                    concat = null;
                } else {
                    concat = kotlin.text.h.C("fonts/", '/') ? "fonts/" : "fonts/".concat("/");
                }
                String str = ".ttf";
                if (!kotlin.text.h.K(".ttf") && !kotlin.text.h.e0(".ttf", ".", false)) {
                    str = ".".concat(".ttf");
                }
                String str2 = str;
                this.f8994d = th6;
                this.f8995e = i12;
                this.f8996f = 2;
                a11 = F.a(context, vVar, null, concat, str2, "__LottieInternalDefaultCacheKey__", this);
                if (a11 != aVar) {
                    th2 = th6;
                    interfaceC3978p0.getValue().b((B5.g) a11);
                    i11 = i12;
                    if (!interfaceC3978p0.getValue().v()) {
                    }
                }
                return aVar;
            }
            if (!interfaceC3978p0.getValue().s() && th2 != null) {
                interfaceC3978p0.getValue().k(th2);
            }
            return Unit.f71690a;
        }
        i11 = this.f8995e;
        th2 = this.f8994d;
        Sc.s.b(obj);
        obj2 = obj;
    }
}
