package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* renamed from: com.inmobi.media.uj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4139uj extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7418a;
    public final /* synthetic */ Ej b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4139uj(Ej ej, String str, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.b = ej;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4139uj c4139uj = new C4139uj(this.b, this.c, this.d, this.e, continuation);
        c4139uj.f7418a = obj;
        return c4139uj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4139uj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f7418a;
        if (this.b.O.get() || !CoroutineScopeKt.isActive(coroutineScope)) {
            Y9 y9 = this.b.i;
            if (y9 != null) {
                String str = Ej.j1;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                ((Z9) y9).a(str, "Skipping loadHtmlUrl, RenderView destroyed");
            }
            return Unit.INSTANCE;
        }
        String str2 = this.c;
        if (str2 == null || str2.length() == 0) {
            Y9 y92 = this.b.i;
            if (y92 != null) {
                String str3 = Ej.j1;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                ((Z9) y92).a(str3, "Prefetch empty/failed, signaling ad load failure");
            }
            Oj renderViewTelemetry = this.b.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(this.d, Boxing.boxShort((short) this.e));
            }
            Ej ej = this.b;
            int i = this.e;
            ej.getClass();
            ej.d(Ej.d(i));
        } else {
            Y9 y93 = this.b.i;
            if (y93 != null) {
                String str4 = Ej.j1;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
                ((Z9) y93).a(str4, "Prefetch succeeded, loading HTML content in WebView");
            }
            Oj renderViewTelemetry2 = this.b.getRenderViewTelemetry();
            if (renderViewTelemetry2 != null) {
                renderViewTelemetry2.a(this.d, (Short) null);
            }
            this.b.i(this.c);
        }
        return Unit.INSTANCE;
    }
}
