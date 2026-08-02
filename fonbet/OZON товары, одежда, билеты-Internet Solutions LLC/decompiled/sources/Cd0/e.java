package Cd0;

import Sc.s;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessRequest;
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessResponse;
import zd0.C11110a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.data.InAppPushRepository$receiveInAppPush$2", f = "InAppPushRepository.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function1<kotlin.coroutines.d<? super ActionProcessResponse>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f4803d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f4804e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f4805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, String str, kotlin.coroutines.d<? super e> dVar) {
        super(1, dVar);
        this.f4804e = fVar;
        this.f4805f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new e(this.f4804e, this.f4805f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super ActionProcessResponse> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        zd0.b bVar;
        Object obj2;
        Object obj3;
        zd0.b bVar2;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f4803d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        f fVar = this.f4804e;
        aVar = fVar.f4806a;
        bVar = fVar.f4807b;
        C11110a.b b11 = bVar.a().b();
        Intrinsics.checkNotNullParameter(b11, "<this>");
        Iterator<E> it = ActionProcessRequest.Application.BuildType.getEntries().iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it.next();
            if (Intrinsics.d(((ActionProcessRequest.Application.BuildType) obj3).name(), b11.name())) {
                break;
            }
        }
        ActionProcessRequest.Application.BuildType buildType = (ActionProcessRequest.Application.BuildType) obj3;
        if (buildType == null) {
            throw new IllegalArgumentException(Nk.a.b("Unsupported build type - ", b11.name()));
        }
        bVar2 = fVar.f4807b;
        C11110a.EnumC2347a a11 = bVar2.a().a();
        Intrinsics.checkNotNullParameter(a11, "<this>");
        Iterator<E> it2 = ActionProcessRequest.Application.ApplicationName.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.d(((ActionProcessRequest.Application.ApplicationName) next).name(), a11.name())) {
                obj2 = next;
                break;
            }
        }
        ActionProcessRequest.Application.ApplicationName applicationName = (ActionProcessRequest.Application.ApplicationName) obj2;
        if (applicationName == null) {
            throw new IllegalArgumentException(Nk.a.b("Unsupported application name - ", a11.name()));
        }
        ActionProcessRequest actionProcessRequest = new ActionProcessRequest(new ActionProcessRequest.Application("ANDROID", buildType, applicationName), this.f4805f);
        this.f4803d = 1;
        Object actionProcess = aVar.actionProcess(actionProcessRequest, this);
        return actionProcess == aVar2 ? aVar2 : actionProcess;
    }
}
