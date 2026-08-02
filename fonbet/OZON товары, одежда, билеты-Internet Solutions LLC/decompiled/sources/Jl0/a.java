package Jl0;

import Sc.s;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@e(c = "ru.rustore.sdk.pushclient.internal.analytics.utils.ClickNotificationUtils$getClickEventRequestCode$2", f = "ClickNotificationUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends j implements Function2<M, d<? super Integer>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f14829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bundle bundle, d<? super a> dVar) {
        super(2, dVar);
        this.f14829d = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f14829d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Integer> dVar) {
        return new a(this.f14829d, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Bundle bundle = this.f14829d;
        if (bundle != null) {
            return new Integer(bundle.getInt("vkpns.click_event_marker.request_code"));
        }
        return null;
    }
}
