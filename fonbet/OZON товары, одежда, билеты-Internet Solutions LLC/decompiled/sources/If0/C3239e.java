package If0;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gf0.C6730b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf0.C8143e;
import mf0.InterfaceC8142d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityScreen$Content$1$1", f = "DomainReachabilityScreen.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* renamed from: If0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3239e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12435d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K f12436e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f12437f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f12438g;

    /* renamed from: If0.e$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f12439a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8142d f12440b;

        a(Context context, InterfaceC8142d interfaceC8142d) {
            this.f12439a = context;
            this.f12440b = interfaceC8142d;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ComponentName component;
            H h11 = (H) obj;
            if (Intrinsics.d(h11, X.f12413a)) {
                Ff0.a aVar = Ff0.a.f9452d;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                this.f12440b.c(new C6730b(aVar), C8143e.f74843b);
            } else {
                if (!Intrinsics.d(h11, d0.f12434a)) {
                    throw new Sc.o();
                }
                Context context = this.f12439a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null) {
                    Intent makeRestartActivityTask = Intent.makeRestartActivityTask(component);
                    makeRestartActivityTask.setPackage(context.getPackageName());
                    context.startActivity(makeRestartActivityTask);
                    Runtime.getRuntime().exit(0);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3239e(K k11, Context context, InterfaceC8142d interfaceC8142d, kotlin.coroutines.d<? super C3239e> dVar) {
        super(2, dVar);
        this.f12436e = k11;
        this.f12437f = context;
        this.f12438g = interfaceC8142d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C3239e(this.f12436e, this.f12437f, this.f12438g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3239e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12435d;
        if (i11 == 0) {
            Sc.s.b(obj);
            B0<H> eventsFlow = this.f12436e.getEventsFlow();
            a aVar2 = new a(this.f12437f, this.f12438g);
            this.f12435d = 1;
            if (eventsFlow.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
