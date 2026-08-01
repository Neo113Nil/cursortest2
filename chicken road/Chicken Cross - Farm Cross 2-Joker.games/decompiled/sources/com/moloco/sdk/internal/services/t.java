package com.moloco.sdk.internal.services;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes7.dex */
public final class t implements s {
    public static final a c = new a(null);
    public static final int d = 0;
    public static final String e = "ClickthroughService";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f10832a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.ClickthroughServiceImpl", f = "ClickthroughService.kt", i = {0, 0}, l = {73, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "runClickThrough", n = {"this", "clickthroughEvent"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10833a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return t.this.a(null, null, null, null, this);
        }
    }

    public t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        this.f10832a = externalLinkHandler;
        this.b = customUserEventBuilderService;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.moloco.sdk.internal.services.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, MutableSharedFlow<Unit> mutableSharedFlow, Continuation<? super Unit> continuation) {
        b bVar;
        int i;
        MutableSharedFlow mutableSharedFlow2;
        Object a2;
        t tVar;
        String str2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                Object obj = bVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f11199a;
                    a.AbstractC1622a.d dVar = new a.AbstractC1622a.d(new a.AbstractC1622a.f(cVar.a(aVar.g()), cVar.a(aVar.h())), new a.AbstractC1622a.f(cVar.a(aVar.i()), cVar.a(aVar.j())), new a.AbstractC1622a.g(cVar.a(aVar.l()), cVar.a(aVar.k())), hVar.q());
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2 = this.b;
                    bVar.f10833a = this;
                    mutableSharedFlow2 = mutableSharedFlow;
                    bVar.b = mutableSharedFlow2;
                    bVar.e = 1;
                    a2 = aVar2.a(currentTimeMillis, dVar, str, bVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    MutableSharedFlow mutableSharedFlow3 = (MutableSharedFlow) bVar.b;
                    tVar = (t) bVar.f10833a;
                    ResultKt.throwOnFailure(obj);
                    a2 = obj;
                    mutableSharedFlow2 = mutableSharedFlow3;
                }
                str2 = (String) a2;
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, e, "Launching url: " + str2, false, 4, null);
                rVar = tVar.f10832a;
                if (str2 == null) {
                    str2 = "";
                }
                if (rVar.a(str2) || mutableSharedFlow2 == null) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                bVar.f10833a = null;
                bVar.b = null;
                bVar.e = 2;
                if (mutableSharedFlow2.emit(unit, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        str2 = (String) a2;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, e, "Launching url: " + str2, false, 4, null);
        rVar = tVar.f10832a;
        if (str2 == null) {
        }
        if (rVar.a(str2)) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.s
    public Object a(String str, MutableSharedFlow<Unit> mutableSharedFlow, Continuation<? super Unit> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar = this.f10832a;
        if (str == null) {
            str = "";
        }
        if (rVar.a(str) && mutableSharedFlow != null) {
            Unit unit = Unit.INSTANCE;
            Object emit = mutableSharedFlow.emit(unit, continuation);
            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : unit;
        }
        return Unit.INSTANCE;
    }
}
