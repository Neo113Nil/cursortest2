package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.publisher.C4786a;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.internal.publisher.p;
import com.moloco.sdk.internal.publisher.z;
import com.moloco.sdk.internal.scheduling.DispatcherProvider;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.t;
import com.moloco.sdk.internal.u;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes7.dex */
public final class c {
    public static final a k = new a(null);
    public static final int l = 8;
    public static final String m = "NativeAdLoader";

    /* renamed from: a, reason: collision with root package name */
    public final Context f10636a;
    public final String b;
    public final p c;
    public final com.moloco.sdk.internal.publisher.nativead.parser.a d;
    public final C4786a e;
    public final MetricsRecorder f;
    public final I g;
    public final AdFormatType h;
    public final TimerEvent i;
    public final DispatcherProvider j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {
        public static final int d = 8;

        /* renamed from: a, reason: collision with root package name */
        public final C4782e f10637a;
        public final com.moloco.sdk.internal.publisher.nativead.model.b b;
        public final com.moloco.sdk.internal.publisher.nativead.model.d c;

        public b(C4782e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.d preparedAssets) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
            Intrinsics.checkNotNullParameter(preparedAssets, "preparedAssets");
            this.f10637a = bid;
            this.b = ortbResponse;
            this.c = preparedAssets;
        }

        public final C4782e a() {
            return this.f10637a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.b b() {
            return this.b;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.d c() {
            return this.c;
        }

        public final C4782e d() {
            return this.f10637a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.b e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f10637a, bVar.f10637a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c);
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.d f() {
            return this.c;
        }

        public int hashCode() {
            return (((this.f10637a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "LoadedNativeAd(bid=" + this.f10637a + ", ortbResponse=" + this.b + ", preparedAssets=" + this.c + ')';
        }

        public final b a(C4782e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.d preparedAssets) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
            Intrinsics.checkNotNullParameter(preparedAssets, "preparedAssets");
            return new b(bid, ortbResponse, preparedAssets);
        }

        public static /* synthetic */ b a(b bVar, C4782e c4782e, com.moloco.sdk.internal.publisher.nativead.model.b bVar2, com.moloco.sdk.internal.publisher.nativead.model.d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                c4782e = bVar.f10637a;
            }
            if ((i & 2) != 0) {
                bVar2 = bVar.b;
            }
            if ((i & 4) != 0) {
                dVar = bVar.c;
            }
            return bVar.a(c4782e, bVar2, dVar);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0}, l = {242}, m = "fetchAssets-8Mi8wO0", n = {"this", "adType", "nativeAdPrepareTime"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.c$c, reason: collision with other inner class name */
    public static final class C1489c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10638a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public C1489c(Continuation<? super C1489c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return c.this.a((com.moloco.sdk.internal.publisher.nativead.model.b) null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$fireAdLoadFailedEventOnUiThread$2", f = "NativeAdLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10639a;
        public final /* synthetic */ z b;
        public final /* synthetic */ t c;
        public final /* synthetic */ D d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(z zVar, t tVar, D d, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = zVar;
            this.c = tVar;
            this.d = d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10639a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.a(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0, 1, 2}, l = {192, 205, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m = "handleAssetsFetching-yxL6bBk", n = {"this", "sdkEvents", "adLoadTracker", "timeoutError", "error"}, s = {"L$0", "L$1", "L$2", "L$0", "L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10640a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a2 = c.this.a((D) null, (com.moloco.sdk.internal.publisher.nativead.model.b) null, (z) null, 0L, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$handleAssetsFetching$result$1", f = "NativeAdLoader.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super x<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10641a;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.b c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.internal.publisher.nativead.model.b bVar, long j, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = bVar;
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super x<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new f(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10641a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = c.this;
                com.moloco.sdk.internal.publisher.nativead.model.b bVar = this.c;
                long j = this.d;
                this.f10641a = 1;
                obj = cVar.a(bVar, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0, 0, 0, 1}, l = {143, 159}, m = "handleBidParsing-BWLJW6A", n = {"this", "acmLoadTimerEvent", "adLoadTracker", "it"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10642a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a2 = c.this.a((String) null, (TimerEvent) null, (z) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {0}, l = {175}, m = "handleOrtbParsing-BWLJW6A", n = {"result"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10643a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a2 = c.this.a((String) null, (D) null, (z) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {}, l = {99}, m = "load-BWLJW6A", n = {}, s = {})
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f10644a;
        public int c;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10644a = obj;
            this.c |= Integer.MIN_VALUE;
            Object b = c.this.b(null, null, null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8078boximpl(b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$load$2", f = "NativeAdLoader.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {111, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 126, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend", n = {"adLoadStartTimeMs", "bid", "adLoadStartTimeMs", "bid", "adLoadStartTimeMs", "bid", "ortbResponse"}, s = {"J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "L$1"})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends b>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f10645a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ TimerEvent f;
        public final /* synthetic */ String g;
        public final /* synthetic */ z h;

        @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader$load$2$1", f = "NativeAdLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10646a;
            public final /* synthetic */ z b;
            public final /* synthetic */ c c;
            public final /* synthetic */ C4782e d;
            public final /* synthetic */ long e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z zVar, c cVar, C4782e c4782e, long j, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = zVar;
                this.c = cVar;
                this.d = c4782e;
                this.e = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10646a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.a(MolocoAdKt.createAdInfo(this.c.b, Boxing.boxFloat(this.d.getPrice()), this.d.getCrid()), this.e, this.d.getExt().getSdkEvents());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TimerEvent timerEvent, String str, z zVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f = timerEvent;
            this.g = str;
            this.h = zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<b>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new j(this.f, this.g, this.h, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0116 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a2;
            long j;
            C4782e c4782e;
            long j2;
            Object a3;
            C4782e c4782e2;
            long j3;
            Object obj2;
            Throwable m8082exceptionOrNullimpl;
            Object a4;
            C4782e c4782e3;
            com.moloco.sdk.internal.publisher.nativead.model.b bVar;
            Throwable m8082exceptionOrNullimpl2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long a5 = c.this.g.a();
                this.f.startTimer();
                c.this.f.recordTimerEvent(c.this.i);
                MetricsRecorder metricsRecorder = c.this.f;
                CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.k.c());
                String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                String lowerCase = c.this.h.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
                c cVar = c.this;
                String str = this.g;
                TimerEvent timerEvent = this.f;
                z zVar = this.h;
                this.f10645a = a5;
                this.d = 1;
                a2 = cVar.a(str, timerEvent, zVar, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = a5;
            } else if (i == 1) {
                j = this.f10645a;
                ResultKt.throwOnFailure(obj);
                a2 = ((Result) obj).getValue();
            } else if (i == 2) {
                j2 = this.f10645a;
                c4782e = (C4782e) this.b;
                ResultKt.throwOnFailure(obj);
                c cVar2 = c.this;
                String adm = c4782e.getAdm();
                D sdkEvents = c4782e.getExt().getSdkEvents();
                z zVar2 = this.h;
                this.b = c4782e;
                this.f10645a = j2;
                this.d = 3;
                a3 = cVar2.a(adm, sdkEvents, zVar2, this);
                if (a3 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                c4782e2 = c4782e;
                j3 = j2;
                obj2 = a3;
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj2);
                if (m8082exceptionOrNullimpl == null) {
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (com.moloco.sdk.internal.publisher.nativead.model.b) this.c;
                    c4782e3 = (C4782e) this.b;
                    ResultKt.throwOnFailure(obj);
                    a4 = ((Result) obj).getValue();
                    m8082exceptionOrNullimpl2 = Result.m8082exceptionOrNullimpl(a4);
                    if (m8082exceptionOrNullimpl2 != null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8078boximpl(Result.m8079constructorimpl(new b(c4782e3, bVar, (com.moloco.sdk.internal.publisher.nativead.model.d) a4)));
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl2)));
                }
                long j4 = this.f10645a;
                C4782e c4782e4 = (C4782e) this.b;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).getValue();
                c4782e2 = c4782e4;
                j3 = j4;
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj2);
                if (m8082exceptionOrNullimpl == null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl)));
                }
                com.moloco.sdk.internal.publisher.nativead.model.b bVar2 = (com.moloco.sdk.internal.publisher.nativead.model.b) obj2;
                c cVar3 = c.this;
                D sdkEvents2 = c4782e2.getExt().getSdkEvents();
                z zVar3 = this.h;
                this.b = c4782e2;
                this.c = bVar2;
                this.d = 4;
                a4 = cVar3.a(sdkEvents2, bVar2, zVar3, j3, this);
                if (a4 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c4782e3 = c4782e2;
                bVar = bVar2;
                m8082exceptionOrNullimpl2 = Result.m8082exceptionOrNullimpl(a4);
                if (m8082exceptionOrNullimpl2 != null) {
                }
            }
            Throwable m8082exceptionOrNullimpl3 = Result.m8082exceptionOrNullimpl(a2);
            if (m8082exceptionOrNullimpl3 != null) {
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl3)));
            }
            c4782e = (C4782e) a2;
            CoroutineContext main = c.this.j.getMain();
            a aVar = new a(this.h, c.this, c4782e, j, null);
            this.b = c4782e;
            this.f10645a = j;
            this.d = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = j;
            c cVar22 = c.this;
            String adm2 = c4782e.getAdm();
            D sdkEvents3 = c4782e.getExt().getSdkEvents();
            z zVar22 = this.h;
            this.b = c4782e;
            this.f10645a = j2;
            this.d = 3;
            a3 = cVar22.a(adm2, sdkEvents3, zVar22, this);
            if (a3 != coroutine_suspended) {
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdLoader", f = "NativeAdLoader.kt", i = {}, l = {289}, m = "prepareAssets-8Mi8wO0", n = {}, s = {})
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f10647a;
        public int c;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10647a = obj;
            this.c |= Integer.MIN_VALUE;
            return c.this.a((List<? extends b.a>) null, 0L, this);
        }
    }

    public c(Context context, String adUnitId, p bidLoader, com.moloco.sdk.internal.publisher.nativead.parser.a ortbResponseParser, C4786a createLoadTimeoutManager, MetricsRecorder metricsRecorder, I timeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bidLoader, "bidLoader");
        Intrinsics.checkNotNullParameter(ortbResponseParser, "ortbResponseParser");
        Intrinsics.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f10636a = context;
        this.b = adUnitId;
        this.c = bidLoader;
        this.d = ortbResponseParser;
        this.e = createLoadTimeoutManager;
        this.f = metricsRecorder;
        this.g = timeProvider;
        AdFormatType adFormatType = AdFormatType.NATIVE;
        this.h = adFormatType;
        TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.i = startTimerEvent.withTag(c, lowerCase);
        this.j = com.moloco.sdk.internal.scheduling.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, TimerEvent timerEvent, z zVar, Continuation<? super Result<b>> continuation) {
        i iVar;
        int i2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.c = i3 - Integer.MIN_VALUE;
                Object obj = iVar.f10644a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = iVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.j.getDefault();
                    j jVar = new j(timerEvent, str, zVar, null);
                    iVar.c = 1;
                    obj = BuildersKt.withContext(coroutineContext, jVar, iVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.f10644a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = iVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, TimerEvent timerEvent, z zVar, Continuation<? super Result<C4782e>> continuation) {
        g gVar;
        int i2;
        c cVar;
        x xVar;
        x xVar2;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.f = i3 - Integer.MIN_VALUE;
                Object obj = gVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = gVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    p pVar = this.c;
                    String str2 = this.b;
                    gVar.f10642a = this;
                    gVar.b = timerEvent;
                    gVar.c = zVar;
                    gVar.f = 1;
                    obj = pVar.a(str2, str, gVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar2 = (x) gVar.f10642a;
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(new Exception(((t) ((x.a) xVar2).a()).toString())));
                    }
                    zVar = (z) gVar.c;
                    timerEvent = (TimerEvent) gVar.b;
                    cVar = (c) gVar.f10642a;
                    ResultKt.throwOnFailure(obj);
                }
                xVar = (x) obj;
                if (!(xVar instanceof x.a)) {
                    MetricsRecorder metricsRecorder = cVar.f;
                    TimerEvent withTag = timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
                    String c = dVar.c();
                    MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                    TimerEvent withTag2 = withTag.withTag(c, String.valueOf(errorType.getErrorCode()));
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    String c2 = dVar2.c();
                    String name = cVar.h.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = name.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(withTag2.withTag(c2, lowerCase));
                    MetricsRecorder metricsRecorder2 = cVar.f;
                    CountEvent withTag3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag(dVar.c(), String.valueOf(errorType.getErrorCode()));
                    String c3 = dVar2.c();
                    String lowerCase2 = cVar.h.name().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder2.recordCountEvent(withTag3.withTag(c3, lowerCase2));
                    t tVar = (t) ((x.a) xVar).a();
                    gVar.f10642a = xVar;
                    gVar.b = null;
                    gVar.c = null;
                    gVar.f = 2;
                    if (cVar.a(zVar, tVar, (D) null, gVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    xVar2 = xVar;
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m8079constructorimpl(ResultKt.createFailure(new Exception(((t) ((x.a) xVar2).a()).toString())));
                }
                if (!(xVar instanceof x.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m8079constructorimpl(((x.b) xVar).a());
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar.f;
        if (i2 != 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof x.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, D d2, z zVar, Continuation<? super Result<com.moloco.sdk.internal.publisher.nativead.model.b>> continuation) {
        h hVar;
        int i2;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i3 = hVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.e = i3 - Integer.MIN_VALUE;
                Object obj = hVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = hVar.e;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = hVar.f10643a;
                    ResultKt.throwOnFailure(obj);
                    return obj2;
                }
                ResultKt.throwOnFailure(obj);
                Object a2 = this.d.a(str);
                Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
                if (m8082exceptionOrNullimpl != null) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, m, "handleOrtbParsing", m8082exceptionOrNullimpl, false, 8, null);
                    t a3 = u.a(this.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f10971a, null, 8, null);
                    hVar.f10643a = a2;
                    hVar.b = a2;
                    hVar.e = 1;
                    if (a(zVar, a3, d2, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return a2;
            }
        }
        hVar = new h(continuation);
        Object obj3 = hVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = hVar.e;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(D d2, com.moloco.sdk.internal.publisher.nativead.model.b bVar, z zVar, long j2, Continuation<? super Result<com.moloco.sdk.internal.publisher.nativead.model.d>> continuation) {
        e eVar;
        int i2;
        D d3;
        z zVar2;
        Object m9582withTimeoutOrNullKLykuaI;
        c cVar;
        x xVar;
        t tVar;
        t tVar2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i3 = eVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f = i3 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = eVar2.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long a2 = this.e.a();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "Native ad load startTimestampMs=" + j2 + ", remainingTimeoutMs=" + Duration.m9437getInWholeMillisecondsimpl(a2), null, false, 12, null);
                    f fVar = new f(bVar, a2, null);
                    eVar2.f10640a = this;
                    d3 = d2;
                    eVar2.b = d3;
                    zVar2 = zVar;
                    eVar2.c = zVar2;
                    eVar2.f = 1;
                    m9582withTimeoutOrNullKLykuaI = TimeoutKt.m9582withTimeoutOrNullKLykuaI(a2, fVar, eVar2);
                    if (m9582withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            tVar2 = (t) eVar2.f10640a;
                            ResultKt.throwOnFailure(obj);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(new Exception(tVar2.toString())));
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tVar = (t) eVar2.f10640a;
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(new Exception(tVar.toString())));
                    }
                    zVar2 = (z) eVar2.c;
                    D d4 = (D) eVar2.b;
                    cVar = (c) eVar2.f10640a;
                    ResultKt.throwOnFailure(obj);
                    m9582withTimeoutOrNullKLykuaI = obj;
                    d3 = d4;
                }
                xVar = (x) m9582withTimeoutOrNullKLykuaI;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, m, "Handling native ad load result: " + xVar, null, false, 12, null);
                if (xVar != null) {
                    MolocoLogger.warn$default(molocoLogger, m, "Native ad load timeout", null, false, 12, null);
                    t a3 = u.a(cVar.b, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.d, null, 8, null);
                    eVar2.f10640a = a3;
                    eVar2.b = null;
                    eVar2.c = null;
                    eVar2.f = 2;
                    if (cVar.a(zVar2, a3, d3, eVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tVar2 = a3;
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m8079constructorimpl(ResultKt.createFailure(new Exception(tVar2.toString())));
                }
                if (xVar instanceof x.a) {
                    t a4 = u.a(cVar.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar).a(), null, 8, null);
                    eVar2.f10640a = a4;
                    eVar2.b = null;
                    eVar2.c = null;
                    eVar2.f = 3;
                    if (cVar.a(zVar2, a4, d3, eVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tVar = a4;
                    Result.Companion companion22 = Result.INSTANCE;
                    return Result.m8079constructorimpl(ResultKt.createFailure(new Exception(tVar.toString())));
                }
                if (xVar instanceof x.b) {
                    Result.Companion companion4 = Result.INSTANCE;
                    return Result.m8079constructorimpl(((x.b) xVar).a());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        eVar = new e(continuation);
        e eVar22 = eVar;
        Object obj2 = eVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar22.f;
        if (i2 != 0) {
        }
        xVar = (x) m9582withTimeoutOrNullKLykuaI;
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, m, "Handling native ad load result: " + xVar, null, false, 12, null);
        if (xVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.internal.publisher.nativead.model.b bVar, long j2, Continuation<? super x<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c>> continuation) {
        C1489c c1489c;
        int i2;
        String str;
        TimerEvent timerEvent;
        c cVar;
        x xVar;
        if (continuation instanceof C1489c) {
            c1489c = (C1489c) continuation;
            int i3 = c1489c.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1489c.f = i3 - Integer.MIN_VALUE;
                Object obj = c1489c.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c1489c.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long duration = DurationKt.toDuration(RangesKt.coerceAtLeast(Duration.m9437getInWholeMillisecondsimpl(j2) - (this.g.a() - this.g.a()), 0L), DurationUnit.MILLISECONDS);
                    List<b.a> a2 = bVar.a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : a2) {
                        if (obj2 instanceof b.a.d) {
                            arrayList.add(obj2);
                        }
                    }
                    str = !arrayList.isEmpty() ? "video" : "image";
                    TimerEvent startTimerEvent = this.f.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.k.c());
                    MetricsRecorder metricsRecorder = this.f;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.n.c());
                    String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
                    List<b.a> a3 = bVar.a();
                    c1489c.f10638a = this;
                    c1489c.b = str;
                    c1489c.c = startTimerEvent;
                    c1489c.f = 1;
                    Object a4 = a(a3, duration, c1489c);
                    if (a4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    timerEvent = startTimerEvent;
                    obj = a4;
                    cVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    timerEvent = (TimerEvent) c1489c.c;
                    str = (String) c1489c.b;
                    cVar = (c) c1489c.f10638a;
                    ResultKt.throwOnFailure(obj);
                }
                xVar = (x) obj;
                if (!(xVar instanceof x.a)) {
                    x.a aVar = (x.a) xVar;
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "NativeAd load failed: " + ((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b(), null, false, 12, null);
                    MetricsRecorder metricsRecorder2 = cVar.f;
                    CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.o.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    CountEvent withTag = countEvent2.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    String c2 = dVar2.c();
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    CountEvent withTag2 = withTag.withTag(c2, lowerCase2);
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    metricsRecorder2.recordCountEvent(withTag2.withTag(dVar3.c(), ((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b().a()).withTag("asset_id", String.valueOf(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).a())));
                    MetricsRecorder metricsRecorder3 = cVar.f;
                    TimerEvent withTag3 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    String c3 = dVar2.c();
                    String lowerCase3 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    metricsRecorder3.recordTimerEvent(withTag3.withTag(c3, lowerCase3).withTag(dVar3.c(), ((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b().a()).withTag("asset_id", String.valueOf(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).a())));
                    return new x.a(((com.moloco.sdk.internal.publisher.nativead.parser.b) aVar.a()).b());
                }
                if (xVar instanceof x.b) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "NativeAd load successfully parsed and loaded all assets", null, false, 12, null);
                    MetricsRecorder metricsRecorder4 = cVar.f;
                    CountEvent countEvent3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.o.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    CountEvent withTag4 = countEvent3.withTag(dVar4.c(), "success");
                    com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.c;
                    String c4 = dVar5.c();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase4 = str.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                    metricsRecorder4.recordCountEvent(withTag4.withTag(c4, lowerCase4));
                    MetricsRecorder metricsRecorder5 = cVar.f;
                    TimerEvent withTag5 = timerEvent.withTag(dVar4.c(), "success");
                    String c5 = dVar5.c();
                    String lowerCase5 = str.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                    metricsRecorder5.recordTimerEvent(withTag5.withTag(c5, lowerCase5));
                    return new x.b(((x.b) xVar).a());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        c1489c = new C1489c(continuation);
        Object obj3 = c1489c.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c1489c.f;
        if (i2 != 0) {
        }
        xVar = (x) obj3;
        if (!(xVar instanceof x.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List<? extends b.a> list, long j2, Continuation<? super x<com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.internal.publisher.nativead.parser.b>> continuation) {
        k kVar;
        int i2;
        x xVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i3 = kVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.c = i3 - Integer.MIN_VALUE;
                Object obj = kVar.f10647a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = kVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Context context = this.f10636a;
                    kVar.c = 1;
                    obj = com.moloco.sdk.internal.publisher.nativead.parser.c.a(context, list, j2, kVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                xVar = (x) obj;
                if (!(xVar instanceof x.b)) {
                    return new x.b(((x.b) xVar).a());
                }
                if (xVar instanceof x.a) {
                    x.a aVar = (x.a) xVar;
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, m, "NativeAd prepareAssets failed", (Throwable) aVar.a(), false, 8, null);
                    return new x.a(aVar.a());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f10647a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.c;
        if (i2 != 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof x.b)) {
        }
    }

    public final Object a(z zVar, t tVar, D d2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.j.getMain(), new d(zVar, tVar, d2, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
