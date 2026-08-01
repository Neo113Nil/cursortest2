package com.chartboost.sdk.ads;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.impl.b4;
import com.chartboost.sdk.impl.i5;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.ya;
import com.chartboost.sdk.impl.z8;
import com.chartboost.sdk.impl.za;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/chartboost/sdk/ads/Interstitial;", "Lcom/chartboost/sdk/ads/Ad;", "", FirebaseAnalytics.Param.LOCATION, "Lcom/chartboost/sdk/callbacks/InterstitialCallback;", "callback", "Lcom/chartboost/sdk/Mediation;", "mediation", "<init>", "(Ljava/lang/String;Lcom/chartboost/sdk/callbacks/InterstitialCallback;Lcom/chartboost/sdk/Mediation;)V", "", "postSessionNotStartedInMainThread", "()V", "cache", "bidResponse", "(Ljava/lang/String;)V", "show", "clearCache", "destroy", "", "isCached", "()Z", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "Lcom/chartboost/sdk/callbacks/InterstitialCallback;", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "Lcom/chartboost/sdk/impl/ya;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/chartboost/sdk/impl/ya;", "api", "Lcom/chartboost/sdk/impl/z8;", "adController", "Lcom/chartboost/sdk/impl/z8;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Interstitial implements Ad {
    private final z8 adController;

    /* renamed from: api$delegate, reason: from kotlin metadata */
    private final Lazy api;
    private final InterstitialCallback callback;
    private final String location;
    private final Mediation mediation;
    private final CoroutineScope scope;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.d = context;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Interstitial.this.new a(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                z8 z8Var = Interstitial.this.adController;
                Context context = this.d;
                String str = this.e;
                this.b = 1;
                if (z8.a.a(z8Var, context, str, null, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Continuation continuation) {
            super(2, continuation);
            this.d = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Interstitial.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                z8 z8Var = Interstitial.this.adController;
                Context context = this.d;
                this.b = 1;
                if (z8Var.a(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    public Interstitial(String location, InterstitialCallback callback, Mediation mediation) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.location = location;
        this.callback = callback;
        this.mediation = mediation;
        this.api = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.ads.Interstitial$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ya api_delegate$lambda$0;
                api_delegate$lambda$0 = Interstitial.api_delegate$lambda$0(Interstitial.this);
                return api_delegate$lambda$0;
            }
        });
        this.adController = new za(getApi(), callback, this, b4.b, null, 16, null);
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya api_delegate$lambda$0(Interstitial interstitial) {
        return k.b(interstitial.getMediation());
    }

    private final ya getApi() {
        return (ya) this.api.getValue();
    }

    private final void postSessionNotStartedInMainThread() {
        try {
            b4.b.a().i().a(new Function0() { // from class: com.chartboost.sdk.ads.Interstitial$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit postSessionNotStartedInMainThread$lambda$1;
                    postSessionNotStartedInMainThread$lambda$1 = Interstitial.postSessionNotStartedInMainThread$lambda$1(Interstitial.this);
                    return postSessionNotStartedInMainThread$lambda$1;
                }
            });
        } catch (Exception e) {
            mb.b("Interstitial ad cannot post session not started callback " + e, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postSessionNotStartedInMainThread$lambda$1(Interstitial interstitial) {
        interstitial.callback.onAdLoaded(new CacheEvent(null, interstitial), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache() {
        if (Chartboost.isSdkStarted()) {
            getApi().a(this, this.callback);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void clearCache() {
        this.adController.a();
    }

    public final void destroy() {
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        if (Chartboost.isSdkStarted()) {
            this.adController.destroy();
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public String getLocation() {
        return this.location;
    }

    @Override // com.chartboost.sdk.ads.Ad
    public Mediation getMediation() {
        return this.mediation;
    }

    @Override // com.chartboost.sdk.ads.Ad
    @Deprecated(message = "The isCached() API will be removed in a future SDK release. Additional condition checks have been added to cache() and show() calls making this API redundant.")
    public boolean isCached() {
        return this.adController.b();
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void show() {
        Context a2 = i5.f4802a.a();
        if (a2 == null) {
            postSessionNotStartedInMainThread();
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new b(a2, null), 3, null);
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache(String bidResponse) {
        Context a2 = i5.f4802a.a();
        if (a2 != null) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new a(a2, bidResponse, null), 3, null);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    public /* synthetic */ Interstitial(String str, InterstitialCallback interstitialCallback, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interstitialCallback, (i & 4) != 0 ? null : mediation);
    }
}
