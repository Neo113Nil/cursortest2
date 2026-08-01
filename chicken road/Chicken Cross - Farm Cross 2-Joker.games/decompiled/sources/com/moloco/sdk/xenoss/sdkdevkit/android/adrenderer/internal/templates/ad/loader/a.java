package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class a implements InterfaceC4812b {
    public static final C1546a f = new C1546a(null);
    public static final int g = 8;
    public static final String h = "WebViewAdLoad";

    /* renamed from: a, reason: collision with root package name */
    public final String f11080a;
    public final CoroutineScope b;
    public final c c;
    public final MutableStateFlow<Boolean> d;
    public final StateFlow<Boolean> e;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a$a, reason: collision with other inner class name */
    public static final class C1546a {
        public /* synthetic */ C1546a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1546a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.WebViewAdLoad$load$1", f = "WebviewAdLoad.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11081a;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC4812b.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, InterfaceC4812b.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11081a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                c a2 = a.this.a();
                String str = a.this.f11080a;
                long j = this.c;
                this.f11081a = 1;
                obj = a2.a(str, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            x xVar = (x) obj;
            if (xVar instanceof x.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.h, "WebViewAdLoad: load success", null, false, 12, null);
                a.this.d.setValue(Boxing.boxBoolean(true));
                InterfaceC4812b.a aVar = this.d;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                if (!(xVar instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.h, "WebViewAdLoad: load failure", null, false, 12, null);
                a.this.d.setValue(Boxing.boxBoolean(false));
                InterfaceC4812b.a aVar2 = this.d;
                if (aVar2 != null) {
                    aVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar).a());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public a(String adm, CoroutineScope scope, c webView) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f11080a = adm;
        this.b = scope;
        this.c = webView;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.d = MutableStateFlow;
        this.e = MutableStateFlow;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return this.e;
    }

    public final c a() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new b(j, aVar, null), 3, null);
    }
}
