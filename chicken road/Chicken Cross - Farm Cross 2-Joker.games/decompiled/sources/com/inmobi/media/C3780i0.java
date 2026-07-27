package com.inmobi.media;

import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3780i0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f7155a;
    public final /* synthetic */ C3922n0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3780i0(C3922n0 c3922n0, Map map, Continuation continuation) {
        super(2, continuation);
        this.f7155a = map;
        this.b = c3922n0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3780i0(this.b, this.f7155a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map map = this.f7155a;
        return new C3780i0(this.b, map, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        long elapsedRealtime;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.f7155a.get(IronSourceConstants.EVENTS_ERROR_CODE);
        Short sh = obj2 instanceof Short ? (Short) obj2 : null;
        Map a2 = AbstractC4169vm.a(this.b.b);
        C3922n0 c3922n0 = this.b;
        if (sh != null && sh.shortValue() == 2138) {
            j = c3922n0.c.c;
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else if ((sh == null || sh.shortValue() != 2139) && (sh == null || sh.shortValue() != 2203)) {
            j = c3922n0.c.f7058a;
            CoroutineScope coroutineScope2 = AbstractC4143un.f7420a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = c3922n0.c.e;
            CoroutineScope coroutineScope3 = AbstractC4143un.f7420a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        a2.put("latency", Boxing.boxLong(elapsedRealtime - j));
        a2.putAll(this.f7155a);
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AdLoadFailed", a2, EnumC3944nm.f7271a);
        return Unit.INSTANCE;
    }
}
