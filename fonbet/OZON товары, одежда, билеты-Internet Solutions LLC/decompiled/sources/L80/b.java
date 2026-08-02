package L80;

import Ae.C0;
import Ae.InterfaceC2397i;
import L80.c;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@e(c = "ru.ozon.fintech.logger.LogFile$1", f = "LogFile.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f16603d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f16604e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f16605a;

        a(c cVar) {
            this.f16605a = cVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, d dVar) {
            c.a aVar = (c.a) obj;
            boolean z11 = aVar instanceof c.a.b;
            c cVar = this.f16605a;
            if (z11) {
                if (c.c(cVar)) {
                    c.a(cVar);
                }
                String format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS").format(Long.valueOf(Calendar.getInstance(Locale.getDefault()).getTimeInMillis()));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                c.d(cVar, format + ": " + ((c.a.b) aVar).a() + "\n");
            } else {
                if (!Intrinsics.d(aVar, c.a.C0316a.f16609a)) {
                    throw new o();
                }
                c.a(cVar);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, d<? super b> dVar) {
        super(2, dVar);
        this.f16604e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f16604e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f16603d;
        if (i11 == 0) {
            s.b(obj);
            c cVar = this.f16604e;
            c02 = cVar.f16607a;
            a aVar2 = new a(cVar);
            this.f16603d = 1;
            if (c02.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
