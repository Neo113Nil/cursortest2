package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moloco.sdk.IlrdRequest;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.ilrd.g;
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
public final class a implements c {
    public static final C1476a h = new C1476a(null);
    public static final int i = 8;
    public static volatile AppLovinCommunicatorSubscriber j = null;
    public static final String k = "max_revenue_events";
    public static final String l = "ApplovinIlrd";

    /* renamed from: a, reason: collision with root package name */
    public final Context f10502a;
    public final CoroutineScope b;
    public final com.moloco.sdk.internal.ilrd.model.a c;
    public final Lazy d;
    public final Lazy e;
    public final MutableStateFlow<g> f;
    public final MutableSharedFlow<c.a.b> g;

    /* renamed from: com.moloco.sdk.internal.ilrd.provider.a$a, reason: collision with other inner class name */
    public static final class C1476a {
        public /* synthetic */ C1476a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1476a() {
        }
    }

    public static final class b implements AppLovinCommunicatorSubscriber {

        @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.provider.ApplovinIlrd$createCallback$1$onMessageReceived$1", f = "ApplovinIlrd.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.internal.ilrd.provider.a$b$a, reason: collision with other inner class name */
        public static final class C1477a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10504a;
            public final /* synthetic */ a b;
            public final /* synthetic */ c.a.b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1477a(a aVar, c.a.b bVar, Continuation<? super C1477a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C1477a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1477a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10504a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.b.g;
                    c.a.b bVar = this.c;
                    this.f10504a = 1;
                    if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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

        public b() {
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "Moloco";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (CoroutineScopeKt.isActive(a.this.b) && Intrinsics.areEqual(a.k, message.getTopic())) {
                Bundle messageData = message.getMessageData();
                Intrinsics.checkNotNullExpressionValue(messageData, "getMessageData(...)");
                BuildersKt__Builders_commonKt.launch$default(a.this.b, null, null, new C1477a(a.this, a.this.a(messageData), null), 3, null);
            }
        }
    }

    public a(Context context, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f10502a = context;
        this.b = scope;
        this.c = com.moloco.sdk.internal.ilrd.model.a.f10501a;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.d(a.this);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.c(a.this);
            }
        });
        this.f = StateFlowKt.MutableStateFlow(g.c.b);
        this.g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final SharedFlow c(a aVar) {
        return FlowKt.asSharedFlow(aVar.g);
    }

    public static final StateFlow d(a aVar) {
        return FlowKt.asStateFlow(aVar.f);
    }

    public final Object e() {
        Object m8079constructorimpl;
        AppLovinCommunicator appLovinCommunicator;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class.forName("com.applovin.communicator.AppLovinCommunicator");
            Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage");
            try {
                appLovinCommunicator = AppLovinCommunicator.getInstance();
            } catch (Throwable unused) {
                appLovinCommunicator = AppLovinCommunicator.getInstance(this.f10502a);
            }
            m8079constructorimpl = Result.m8079constructorimpl(appLovinCommunicator);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        b d = d();
        j = d;
        ((AppLovinCommunicator) m8079constructorimpl).subscribe(d, k);
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m8079constructorimpl(Unit.INSTANCE);
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
    public SharedFlow<c.a.b> c() {
        return (SharedFlow) this.e.getValue();
    }

    public final b d() {
        return new b();
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.c;
    }

    public final c.a.b a(Bundle bundle) {
        double d = bundle.getDouble("revenue");
        String string = bundle.getString("country_code");
        String string2 = bundle.getString("network_name");
        String string3 = bundle.getString("max_ad_unit_id");
        String string4 = bundle.getString("third_party_ad_placement_id");
        String string5 = bundle.getString(FirebaseAnalytics.Param.AD_FORMAT);
        String string6 = bundle.getString("user_segment");
        String string7 = bundle.getString("id");
        IlrdRequest.MaxImpression.Builder newBuilder = IlrdRequest.MaxImpression.newBuilder();
        newBuilder.setRevenue(d);
        if (string != null) {
            newBuilder.setCountryCode(string);
        }
        if (string2 != null) {
            newBuilder.setNetworkName(string2);
        }
        if (string3 != null) {
            newBuilder.setMaxAdUnitId(string3);
        }
        if (string4 != null) {
            newBuilder.setThirdPartyAdPlacementId(string4);
        }
        if (string5 != null) {
            newBuilder.setAdFormat(string5);
        }
        if (string6 != null) {
            newBuilder.setUserSegment(string6);
        }
        if (string7 != null) {
            newBuilder.setId(string7);
        }
        IlrdRequest.MaxImpression build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new c.a.b(build);
    }
}
