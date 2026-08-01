package com.chartboost.sdk.ads;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.impl.b4;
import com.chartboost.sdk.impl.d2;
import com.chartboost.sdk.impl.e2;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.v;
import com.chartboost.sdk.impl.z8;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.j;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.ContentDisposition;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00013B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/chartboost/sdk/ads/Banner;", "Landroid/widget/FrameLayout;", "Lcom/chartboost/sdk/ads/Ad;", "Landroid/content/Context;", "context", "", FirebaseAnalytics.Param.LOCATION, "Lcom/chartboost/sdk/ads/Banner$BannerSize;", ContentDisposition.Parameters.Size, "Lcom/chartboost/sdk/callbacks/BannerCallback;", "callback", "Lcom/chartboost/sdk/Mediation;", "mediation", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/chartboost/sdk/ads/Banner$BannerSize;Lcom/chartboost/sdk/callbacks/BannerCallback;Lcom/chartboost/sdk/Mediation;)V", "", "postSessionNotStartedInMainThread", "()V", "cache", "bidResponse", "(Ljava/lang/String;)V", "show", "clearCache", "", "isCached", "()Z", "", "getBannerWidth", "()I", "getBannerHeight", "detach", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "Lcom/chartboost/sdk/ads/Banner$BannerSize;", "Lcom/chartboost/sdk/callbacks/BannerCallback;", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "Lcom/chartboost/sdk/impl/d2;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/chartboost/sdk/impl/d2;", "api", "Lcom/chartboost/sdk/impl/z8;", "adController", "Lcom/chartboost/sdk/impl/z8;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "BannerSize", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Banner extends FrameLayout implements Ad {
    private final z8 adController;

    /* renamed from: api$delegate, reason: from kotlin metadata */
    private final Lazy api;
    private final BannerCallback callback;
    private final String location;
    private final Mediation mediation;
    private final CoroutineScope scope;
    private final BannerSize size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/chartboost/sdk/ads/Banner$BannerSize;", "", "width", "", "height", "<init>", "(Ljava/lang/String;III)V", "getWidth", "()I", "getHeight", "STANDARD", "MEDIUM", j.d, "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerSize {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BannerSize[] $VALUES;
        private final int height;
        private final int width;
        public static final BannerSize STANDARD = new BannerSize("STANDARD", 0, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
        public static final BannerSize MEDIUM = new BannerSize("MEDIUM", 1, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        public static final BannerSize LEADERBOARD = new BannerSize(j.d, 2, 728, 90);

        private static final /* synthetic */ BannerSize[] $values() {
            return new BannerSize[]{STANDARD, MEDIUM, LEADERBOARD};
        }

        static {
            BannerSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private BannerSize(String str, int i, int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }

        public static EnumEntries<BannerSize> getEntries() {
            return $ENTRIES;
        }

        public static BannerSize valueOf(String str) {
            return (BannerSize) Enum.valueOf(BannerSize.class, str);
        }

        public static BannerSize[] values() {
            return (BannerSize[]) $VALUES.clone();
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Banner.this.new a(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                v vVar = new v(Boxing.boxInt(Banner.this.size.getWidth()), Boxing.boxInt(Banner.this.size.getHeight()));
                z8 z8Var = Banner.this.adController;
                Context context = Banner.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String str = this.d;
                this.b = 1;
                if (z8Var.a(context, str, vVar, this) == coroutine_suspended) {
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

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Banner.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                z8 z8Var = Banner.this.adController;
                Context context = Banner.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
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

    public /* synthetic */ Banner(Context context, String str, BannerSize bannerSize, BannerCallback bannerCallback, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bannerSize, bannerCallback, (i & 16) != 0 ? null : mediation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d2 api_delegate$lambda$0(Banner banner) {
        return k.a(banner.getMediation());
    }

    private final d2 getApi() {
        return (d2) this.api.getValue();
    }

    private final void postSessionNotStartedInMainThread() {
        try {
            b4.b.a().i().a(new Function0() { // from class: com.chartboost.sdk.ads.Banner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit postSessionNotStartedInMainThread$lambda$1;
                    postSessionNotStartedInMainThread$lambda$1 = Banner.postSessionNotStartedInMainThread$lambda$1(Banner.this);
                    return postSessionNotStartedInMainThread$lambda$1;
                }
            });
        } catch (Exception e) {
            mb.b("Banner ad cannot post session not started callback " + e, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postSessionNotStartedInMainThread$lambda$1(Banner banner) {
        banner.callback.onAdLoaded(new CacheEvent(null, banner), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
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

    public final void detach() {
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        if (Chartboost.isSdkStarted()) {
            this.adController.destroy();
        }
    }

    public final int getBannerHeight() {
        return this.size.getHeight();
    }

    public final int getBannerWidth() {
        return this.size.getWidth();
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
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new b(null), 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(Context context, String location, BannerSize size, BannerCallback callback, Mediation mediation) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.location = location;
        this.size = size;
        this.callback = callback;
        this.mediation = mediation;
        this.api = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.ads.Banner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d2 api_delegate$lambda$0;
                api_delegate$lambda$0 = Banner.api_delegate$lambda$0(Banner.this);
                return api_delegate$lambda$0;
            }
        });
        this.adController = new e2(getApi(), callback, this, b4.b);
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache(String bidResponse) {
        if (Chartboost.isSdkStarted()) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new a(bidResponse, null), 3, null);
        } else {
            postSessionNotStartedInMainThread();
        }
    }
}
