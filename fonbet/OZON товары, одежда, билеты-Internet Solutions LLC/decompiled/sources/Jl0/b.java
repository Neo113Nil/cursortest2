package Jl0;

import Sc.s;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@e(c = "ru.rustore.sdk.pushclient.internal.analytics.utils.ClickNotificationUtils$isClickSDKNotificationEventHappen$2", f = "ClickNotificationUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class b extends j implements Function2<M, d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f14830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Bundle bundle, d<? super b> dVar) {
        super(2, dVar);
        this.f14830d = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f14830d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return new b(this.f14830d, dVar).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r2.containsKey("vkpns.click_event_marker") == true) goto L8;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Bundle bundle = this.f14830d;
        boolean z11 = bundle != null;
        return Boolean.valueOf(z11);
    }
}
