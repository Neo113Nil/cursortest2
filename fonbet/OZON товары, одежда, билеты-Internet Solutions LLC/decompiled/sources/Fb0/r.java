package Fb0;

import B0.A0;
import Kb0.K;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt$startAsyncWork$1$1", f = "OzonIdInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f9315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(K k11, kotlin.coroutines.d<? super r> dVar) {
        super(2, dVar);
        this.f9315d = k11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new r(this.f9315d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        List<String> mobileIdHosts = this.f9315d.N().getMobileIdHosts$ozon_id_sdk_release();
        Intrinsics.checkNotNullParameter(mobileIdHosts, "mobileIdHosts");
        System.currentTimeMillis();
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : mobileIdHosts) {
            if (!networkSecurityPolicy.isCleartextTrafficPermitted((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (!arrayList.isEmpty()) {
            throw new AssertionError(A0.b("Clear text traffic not permitted for Mobile ID hosts: ", C7714v.V(arrayList, ",\n\t", "[\n\t", "\n]", null, 56), "\nREADME: https://gitlab.ozon.ru/mobileapps/android-libs/-/tree/master/ozon-id-sdk#mobile-id"));
        }
        System.currentTimeMillis();
        return Unit.f71690a;
    }
}
