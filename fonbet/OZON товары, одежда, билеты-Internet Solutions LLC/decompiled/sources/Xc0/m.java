package Xc0;

import Sc.s;
import android.os.SystemClock;
import androidx.lifecycle.C5418g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import ve.EnumC10311b;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$startTimer$1", f = "OtpViewModel.kt", l = {436, 437, 439}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f34375d;

    /* renamed from: e, reason: collision with root package name */
    int f34376e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f34377f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f34378g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f34379h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> f34380i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f34381j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    m(d dVar, String str, int i11, Function2<? super Integer, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super m> dVar2) {
        super(2, dVar2);
        this.f34377f = dVar;
        this.f34378g = str;
        this.f34379h = i11;
        this.f34380i = function2;
        this.f34381j = (kotlin.coroutines.jvm.internal.j) function1;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f34380i;
        ?? r52 = this.f34381j;
        return new m(this.f34377f, this.f34378g, this.f34379h, function2, r52, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (((Xc0.q) r12).invoke(r5, r11) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (xe.Y.c(r5, r11) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r11.f34381j.invoke(r11) == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Type inference failed for: r12v10, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009a -> B:13:0x009d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5418g0 c5418g0;
        C5418g0 c5418g02;
        long j11;
        int o11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f34376e;
        if (i11 == 0) {
            s.b(obj);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d dVar = this.f34377f;
            c5418g0 = dVar.f34304c;
            String str = this.f34378g;
            Long l11 = (Long) c5418g0.c(str);
            if (l11 != null) {
                j11 = l11.longValue();
            } else {
                c5418g02 = dVar.f34304c;
                c5418g02.g(new Long(elapsedRealtime), str);
                j11 = elapsedRealtime;
            }
            b.Companion companion = kotlin.time.b.INSTANCE;
            EnumC10311b enumC10311b = EnumC10311b.SECONDS;
            o11 = ((int) kotlin.time.b.o(kotlin.time.b.l(kotlin.time.c.g(this.f34379h, enumC10311b), kotlin.time.b.q(kotlin.time.c.h(elapsedRealtime - j11, EnumC10311b.MILLISECONDS))), enumC10311b)) - 1;
            if (o11 <= 0) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            o11 = this.f34375d;
            s.b(obj);
            o11--;
            if (o11 <= 0) {
                this.f34376e = 3;
            } else {
                Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f34380i;
                if (function2 != null) {
                    Integer num = new Integer(o11);
                    this.f34375d = o11;
                    this.f34376e = 1;
                }
                b.Companion companion2 = kotlin.time.b.INSTANCE;
                long g10 = kotlin.time.c.g(1, EnumC10311b.SECONDS);
                this.f34375d = o11;
                this.f34376e = 2;
            }
            return aVar;
        }
        o11 = this.f34375d;
        s.b(obj);
        b.Companion companion22 = kotlin.time.b.INSTANCE;
        long g102 = kotlin.time.c.g(1, EnumC10311b.SECONDS);
        this.f34375d = o11;
        this.f34376e = 2;
    }
}
