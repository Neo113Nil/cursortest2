package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import com.moloco.sdk.IlrdRequest;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.ilrd.g;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class b implements c {
    public static final a h = new a(null);
    public static final int i = 8;
    public static final String j = "IronsourceIlrd";

    /* renamed from: a, reason: collision with root package name */
    public final Context f10505a;
    public final CoroutineScope b;
    public final com.moloco.sdk.internal.ilrd.model.a c;
    public final Lazy d;
    public final Lazy e;
    public final MutableStateFlow<g> f;
    public final MutableSharedFlow<c.a.C1475a> g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.moloco.sdk.internal.ilrd.provider.b$b, reason: collision with other inner class name */
    public static final class C1478b implements LevelPlayImpressionDataListener {

        @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.provider.IronsourceIlrd$createCallback$1$onImpressionSuccess$1", f = "IronsourceIlrd.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.internal.ilrd.provider.b$b$a */
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10507a;
            public final /* synthetic */ b b;
            public final /* synthetic */ c.a.C1475a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, c.a.C1475a c1475a, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = bVar;
                this.c = c1475a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10507a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.b.g;
                    c.a.C1475a c1475a = this.c;
                    this.f10507a = 1;
                    if (mutableSharedFlow.emit(c1475a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public C1478b() {
        }

        @Override // com.unity3d.mediation.impression.LevelPlayImpressionDataListener
        public void onImpressionSuccess(LevelPlayImpressionData impressionData) {
            Intrinsics.checkNotNullParameter(impressionData, "impressionData");
            if (CoroutineScopeKt.isActive(b.this.b)) {
                BuildersKt__Builders_commonKt.launch$default(b.this.b, null, null, new a(b.this, b.this.a(impressionData), null), 3, null);
            }
        }
    }

    public b(Context context, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f10505a = context;
        this.b = scope;
        this.c = com.moloco.sdk.internal.ilrd.model.a.b;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.d(b.this);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.c(b.this);
            }
        });
        this.f = StateFlowKt.MutableStateFlow(g.c.b);
        this.g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final SharedFlow c(b bVar) {
        return FlowKt.asSharedFlow(bVar.g);
    }

    public static final StateFlow d(b bVar) {
        return FlowKt.asStateFlow(bVar.f);
    }

    private final Object e() {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class.forName("com.unity3d.mediation.LevelPlay");
            Class.forName("com.unity3d.mediation.impression.LevelPlayImpressionData");
            LevelPlay.addImpressionDataListener(d());
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl == null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8079constructorimpl(Unit.INSTANCE);
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    public StateFlow<g> getState() {
        return (StateFlow) this.d.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    public synchronized Object b() {
        Object e;
        e = e();
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(e);
        if (m8082exceptionOrNullimpl != null) {
            this.f.setValue(new g.a(m8082exceptionOrNullimpl.toString()));
        }
        if (Result.m8086isSuccessimpl(e)) {
            this.f.setValue(g.b.b);
        }
        return e;
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    public SharedFlow<c.a.C1475a> c() {
        return (SharedFlow) this.e.getValue();
    }

    public final C1478b d() {
        return new C1478b();
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.c;
    }

    public final c.a.C1475a a(LevelPlayImpressionData levelPlayImpressionData) {
        IlrdRequest.LevelPlayImpression.Builder newBuilder = IlrdRequest.LevelPlayImpression.newBuilder();
        try {
            Result.Companion companion = Result.INSTANCE;
            String auctionId = levelPlayImpressionData.getAuctionId();
            Result.m8079constructorimpl(auctionId != null ? newBuilder.setAuctionId(auctionId) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            String adFormat = levelPlayImpressionData.getAdFormat();
            Result.m8079constructorimpl(adFormat != null ? newBuilder.setAdFormat(adFormat) : null);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            String adNetwork = levelPlayImpressionData.getAdNetwork();
            Result.m8079constructorimpl(adNetwork != null ? newBuilder.setNetworkName(adNetwork) : null);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th3));
        }
        try {
            Result.Companion companion7 = Result.INSTANCE;
            String instanceName = levelPlayImpressionData.getInstanceName();
            Result.m8079constructorimpl(instanceName != null ? newBuilder.setInstanceName(instanceName) : null);
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th4));
        }
        try {
            Result.Companion companion9 = Result.INSTANCE;
            String instanceId = levelPlayImpressionData.getInstanceId();
            Result.m8079constructorimpl(instanceId != null ? newBuilder.setInstanceId(instanceId) : null);
        } catch (Throwable th5) {
            Result.Companion companion10 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th5));
        }
        try {
            Result.Companion companion11 = Result.INSTANCE;
            String country = levelPlayImpressionData.getCountry();
            Result.m8079constructorimpl(country != null ? newBuilder.setCountryCode(country) : null);
        } catch (Throwable th6) {
            Result.Companion companion12 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th6));
        }
        try {
            Result.Companion companion13 = Result.INSTANCE;
            String placement = levelPlayImpressionData.getPlacement();
            Result.m8079constructorimpl(placement != null ? newBuilder.setPlacement(placement) : null);
        } catch (Throwable th7) {
            Result.Companion companion14 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th7));
        }
        try {
            Result.Companion companion15 = Result.INSTANCE;
            Double revenue = levelPlayImpressionData.getRevenue();
            Result.m8079constructorimpl(revenue != null ? newBuilder.setRevenue(revenue.doubleValue()) : null);
        } catch (Throwable th8) {
            Result.Companion companion16 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th8));
        }
        try {
            Result.Companion companion17 = Result.INSTANCE;
            String precision = levelPlayImpressionData.getPrecision();
            Result.m8079constructorimpl(precision != null ? newBuilder.setPrecision(precision) : null);
        } catch (Throwable th9) {
            Result.Companion companion18 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th9));
        }
        try {
            Result.Companion companion19 = Result.INSTANCE;
            String ab = levelPlayImpressionData.getAb();
            Result.m8079constructorimpl(ab != null ? newBuilder.setAb(ab) : null);
        } catch (Throwable th10) {
            Result.Companion companion20 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th10));
        }
        try {
            Result.Companion companion21 = Result.INSTANCE;
            String segmentName = levelPlayImpressionData.getSegmentName();
            Result.m8079constructorimpl(segmentName != null ? newBuilder.setSegmentName(segmentName) : null);
        } catch (Throwable th11) {
            Result.Companion companion22 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th11));
        }
        try {
            Result.Companion companion23 = Result.INSTANCE;
            String encryptedCPM = levelPlayImpressionData.getEncryptedCPM();
            Result.m8079constructorimpl(encryptedCPM != null ? newBuilder.setEncryptedCpm(encryptedCPM) : null);
        } catch (Throwable th12) {
            Result.Companion companion24 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th12));
        }
        try {
            Result.Companion companion25 = Result.INSTANCE;
            String creativeId = levelPlayImpressionData.getCreativeId();
            Result.m8079constructorimpl(creativeId != null ? newBuilder.setCreativeId(creativeId) : null);
        } catch (Throwable th13) {
            Result.Companion companion26 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th13));
        }
        IlrdRequest.LevelPlayImpression build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new c.a.C1475a(build);
    }
}
