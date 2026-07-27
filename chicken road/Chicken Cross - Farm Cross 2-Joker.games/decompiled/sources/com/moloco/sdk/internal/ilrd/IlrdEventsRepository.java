package com.moloco.sdk.internal.ilrd;

import android.util.Base64;
import androidx.compose.material.TextFieldImplKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4761z5;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.IlrdRequest;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.services.AbstractC4802c;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.services.InterfaceC4803d;
import com.moloco.sdk.internal.services.w;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.ContentType;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u0000 W2\u00020\u0001:\u0001,B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b!\u0010 J\u001f\u0010!\u001a\n %*\u0004\u0018\u00010$0$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b!\u0010&J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010(J\u000f\u0010)\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b,\u0010 J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b-\u0010*J\u0015\u0010+\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010.J\u0017\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001eH\u0001¢\u0006\u0004\b3\u0010*J\u000f\u0010!\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010*J\u000f\u00104\u001a\u00020\u001eH\u0001¢\u0006\u0004\b4\u0010*J\u000f\u00105\u001a\u00020\u001eH\u0001¢\u0006\u0004\b5\u0010*J\u000f\u00107\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010BR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010:R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010CR\u0017\u0010\u0019\u001a\u00020\u00188G¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\b?\u0010ER\u0017\u0010\u001a\u001a\u00020\u00188G¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\b@\u0010ER\u0017\u0010\u001b\u001a\u00020\u00188G¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\b\u001f\u0010ER\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR(\u0010Q\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010L8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b=\u0010PR&\u0010V\u001a\b\u0012\u0004\u0012\u00020$0R8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010U¨\u0006X"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/IlrdEventsRepository;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "url", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;", "persistentHttpRequest", "Lkotlin/time/Duration;", "sessionExp", "", "maxBatchSize", "uploadInterval", "sessionMaxLength", "Lcom/moloco/sdk/internal/services/I;", "timeProvider", "Landroidx/lifecycle/Lifecycle;", "processLifeycle", "Lcom/moloco/sdk/internal/services/d;", "advertisingIdService", "pubId", RemoteConfigConstants.RequestFieldKey.APP_ID, "Lcom/moloco/sdk/internal/services/w;", "dataStoreService", "Lcom/moloco/sdk/internal/ilrd/d;", "sessionInactiveScheduler", "sessionMaxLengthScheduler", "scheduledUploadScheduler", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;JIJJLcom/moloco/sdk/internal/services/I;Landroidx/lifecycle/Lifecycle;Lcom/moloco/sdk/internal/services/d;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/services/w;Lcom/moloco/sdk/internal/ilrd/d;Lcom/moloco/sdk/internal/ilrd/d;Lcom/moloco/sdk/internal/ilrd/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/moloco/sdk/internal/ilrd/c$a;", "ilrdData", "Lcom/moloco/sdk/IlrdRequest$ImpressionLevelRevenue;", "kotlin.jvm.PlatformType", "(Lcom/moloco/sdk/internal/ilrd/c$a;)Lcom/moloco/sdk/IlrdRequest$ImpressionLevelRevenue;", IronSourceConstants.EVENTS_DURATION, "(J)V", CampaignEx.JSON_KEY_AD_K, "()V", "b", "c", "i", "(Lcom/moloco/sdk/internal/ilrd/c$a;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", U3.i.t0, "(Landroidx/lifecycle/LifecycleOwner;)V", InneractiveMediationDefs.GENDER_MALE, com.mbridge.msdk.foundation.same.report.j.b, CmcdData.Factory.STREAM_TYPE_LIVE, "", "h", "()Z", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/lang/String;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;", "J", "e", "I", "f", "g", "Lcom/moloco/sdk/internal/services/I;", "Lcom/moloco/sdk/internal/services/d;", "Lcom/moloco/sdk/internal/services/w;", "Lcom/moloco/sdk/internal/ilrd/d;", "()Lcom/moloco/sdk/internal/ilrd/d;", C4761z5.q, "o", "Lkotlinx/coroutines/sync/Mutex;", "p", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lcom/moloco/sdk/internal/ilrd/a;", "value", CampaignEx.JSON_KEY_AD_Q, "Lcom/moloco/sdk/internal/ilrd/a;", "()Lcom/moloco/sdk/internal/ilrd/a;", "session", "", "r", "Ljava/util/List;", "()Ljava/util/List;", "events", CmcdData.Factory.STREAMING_FORMAT_SS, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes7.dex */
public final class IlrdEventsRepository implements DefaultLifecycleObserver {

    /* renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int t = 8;
    public static final String u = "IlrdEventsRepository";
    public static final String v = "ilrd_session_store";
    public static final String w = "ilrd_events_store";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final CoroutineScope scope;

    /* renamed from: b, reason: from kotlin metadata */
    public final String url;

    /* renamed from: c, reason: from kotlin metadata */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest;

    /* renamed from: d, reason: from kotlin metadata */
    public final long sessionExp;

    /* renamed from: e, reason: from kotlin metadata */
    public final int maxBatchSize;

    /* renamed from: f, reason: from kotlin metadata */
    public final long uploadInterval;

    /* renamed from: g, reason: from kotlin metadata */
    public final long sessionMaxLength;

    /* renamed from: h, reason: from kotlin metadata */
    public final I timeProvider;

    /* renamed from: i, reason: from kotlin metadata */
    public final InterfaceC4803d advertisingIdService;

    /* renamed from: j, reason: from kotlin metadata */
    public final String pubId;

    /* renamed from: k, reason: from kotlin metadata */
    public final String appId;

    /* renamed from: l, reason: from kotlin metadata */
    public final w dataStoreService;

    /* renamed from: m, reason: from kotlin metadata */
    public final com.moloco.sdk.internal.ilrd.d sessionInactiveScheduler;

    /* renamed from: n, reason: from kotlin metadata */
    public final com.moloco.sdk.internal.ilrd.d sessionMaxLengthScheduler;

    /* renamed from: o, reason: from kotlin metadata */
    public final com.moloco.sdk.internal.ilrd.d scheduledUploadScheduler;

    /* renamed from: p, reason: from kotlin metadata */
    public final Mutex mutex;

    /* renamed from: q, reason: from kotlin metadata */
    public com.moloco.sdk.internal.ilrd.a session;

    /* renamed from: r, reason: from kotlin metadata */
    public final List<IlrdRequest.ImpressionLevelRevenue> events;

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$1", f = "IlrdEventsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10474a;
        public final /* synthetic */ Lifecycle b;
        public final /* synthetic */ IlrdEventsRepository c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lifecycle lifecycle, IlrdEventsRepository ilrdEventsRepository, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = lifecycle;
            this.c = ilrdEventsRepository;
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
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10474a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.addObserver(this.c);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$2", f = "IlrdEventsRepository.kt", i = {0, 1}, l = {499, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10475a;
        public Object b;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IlrdEventsRepository.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            IlrdEventsRepository ilrdEventsRepository;
            Mutex mutex2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = IlrdEventsRepository.this.mutex;
                    ilrdEventsRepository = IlrdEventsRepository.this;
                    this.f10475a = mutex;
                    this.b = ilrdEventsRepository;
                    this.c = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) this.f10475a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit;
                        } catch (Throwable th) {
                            Mutex mutex3 = mutex2;
                            th = th;
                            mutex = mutex3;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    ilrdEventsRepository = (IlrdEventsRepository) this.b;
                    Mutex mutex4 = (Mutex) this.f10475a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                }
                this.f10475a = mutex;
                this.b = null;
                this.c = 2;
                if (ilrdEventsRepository.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return unit2;
            } catch (Throwable th2) {
                th = th2;
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* renamed from: com.moloco.sdk.internal.ilrd.IlrdEventsRepository$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ void b() {
        }

        public Companion() {
        }

        public final byte[] a(byte[] bArr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(gZIPOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                    return byteArray;
                } finally {
                }
            } finally {
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$onEvent$1", f = "IlrdEventsRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {499, 251, 259, 267}, m = "invokeSuspend", n = {"shouldSend", "$this$withLock_u24default$iv", "shouldSend", "$this$withLock_u24default$iv", "shouldSend", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10476a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ c.a g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c.a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IlrdEventsRepository.this.new d(this.g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x011f A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:15:0x0032, B:16:0x0119, B:18:0x011f, B:19:0x0121), top: B:14:0x0032 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:31:0x004a, B:32:0x00b0, B:34:0x00ed, B:35:0x00f3), top: B:30:0x004a }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0115 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            IlrdEventsRepository ilrdEventsRepository;
            Mutex mutex;
            c.a aVar;
            Mutex mutex2;
            IlrdEventsRepository ilrdEventsRepository2;
            Ref.BooleanRef booleanRef2;
            Mutex mutex3;
            IlrdEventsRepository ilrdEventsRepository3;
            Ref.BooleanRef booleanRef3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    booleanRef = new Ref.BooleanRef();
                    Mutex mutex4 = IlrdEventsRepository.this.mutex;
                    ilrdEventsRepository = IlrdEventsRepository.this;
                    c.a aVar2 = this.g;
                    this.f10476a = booleanRef;
                    this.b = mutex4;
                    this.c = ilrdEventsRepository;
                    this.d = aVar2;
                    this.e = 1;
                    if (mutex4.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex4;
                    aVar = aVar2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            ilrdEventsRepository3 = (IlrdEventsRepository) this.c;
                            mutex3 = (Mutex) this.b;
                            booleanRef3 = (Ref.BooleanRef) this.f10476a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                if (ilrdEventsRepository3.h()) {
                                    booleanRef3.element = true;
                                }
                                Unit unit = Unit.INSTANCE;
                                mutex3.unlock(null);
                                if (booleanRef3.element) {
                                    IlrdEventsRepository ilrdEventsRepository4 = IlrdEventsRepository.this;
                                    this.f10476a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.e = 4;
                                    if (ilrdEventsRepository4.b(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        aVar = (c.a) this.d;
                        ilrdEventsRepository2 = (IlrdEventsRepository) this.c;
                        mutex2 = (Mutex) this.b;
                        booleanRef2 = (Ref.BooleanRef) this.f10476a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            IlrdRequest.ImpressionLevelRevenue a2 = ilrdEventsRepository2.a(aVar);
                            List<IlrdRequest.ImpressionLevelRevenue> b = ilrdEventsRepository2.b();
                            Intrinsics.checkNotNull(a2);
                            b.add(a2);
                            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                            StringBuilder append = new StringBuilder("Event id ").append(a2.getEventId()).append(" added. Count: ").append(ilrdEventsRepository2.b().size()).append(", current events in session: ");
                            com.moloco.sdk.internal.ilrd.a session = ilrdEventsRepository2.getSession();
                            MolocoLogger.info$default(molocoLogger, IlrdEventsRepository.u, append.append(session == null ? session.b() : null).toString(), null, false, 12, null);
                            this.f10476a = booleanRef2;
                            this.b = mutex2;
                            this.c = ilrdEventsRepository2;
                            this.d = null;
                            this.e = 3;
                            if (ilrdEventsRepository2.c(this) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ilrdEventsRepository3 = ilrdEventsRepository2;
                            mutex3 = mutex2;
                            booleanRef3 = booleanRef2;
                            if (ilrdEventsRepository3.h()) {
                            }
                            Unit unit2 = Unit.INSTANCE;
                            mutex3.unlock(null);
                            if (booleanRef3.element) {
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex3 = mutex2;
                            mutex3.unlock(null);
                            throw th;
                        }
                    }
                    aVar = (c.a) this.d;
                    ilrdEventsRepository = (IlrdEventsRepository) this.c;
                    mutex = (Mutex) this.b;
                    booleanRef = (Ref.BooleanRef) this.f10476a;
                    ResultKt.throwOnFailure(obj);
                }
                ilrdEventsRepository.a();
                ilrdEventsRepository.j();
                com.moloco.sdk.internal.ilrd.a session2 = ilrdEventsRepository.getSession();
                if (session2 != null) {
                    session2.a(aVar);
                }
                this.f10476a = booleanRef;
                this.b = mutex;
                this.c = ilrdEventsRepository;
                this.d = aVar;
                this.e = 2;
                if (ilrdEventsRepository.d(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ilrdEventsRepository2 = ilrdEventsRepository;
                mutex2 = mutex;
                booleanRef2 = booleanRef;
                IlrdRequest.ImpressionLevelRevenue a22 = ilrdEventsRepository2.a(aVar);
                List<IlrdRequest.ImpressionLevelRevenue> b2 = ilrdEventsRepository2.b();
                Intrinsics.checkNotNull(a22);
                b2.add(a22);
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                StringBuilder append2 = new StringBuilder("Event id ").append(a22.getEventId()).append(" added. Count: ").append(ilrdEventsRepository2.b().size()).append(", current events in session: ");
                com.moloco.sdk.internal.ilrd.a session3 = ilrdEventsRepository2.getSession();
                MolocoLogger.info$default(molocoLogger2, IlrdEventsRepository.u, append2.append(session3 == null ? session3.b() : null).toString(), null, false, 12, null);
                this.f10476a = booleanRef2;
                this.b = mutex2;
                this.c = ilrdEventsRepository2;
                this.d = null;
                this.e = 3;
                if (ilrdEventsRepository2.c(this) != coroutine_suspended) {
                }
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
                mutex3 = mutex2;
                mutex3.unlock(null);
                throw th;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", i = {0, 1, 1, 2, 5, 5, 6}, l = {148, TextFieldImplKt.AnimationDuration, 153, 166, 176, 194, 205, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "restoreSavedSession", n = {"this", "this", "existingSession", "this", "this", "restoredSession", "this"}, s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10477a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return IlrdEventsRepository.this.a(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$restoreSavedSession$restoredSession$1", f = "IlrdEventsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.ilrd.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10478a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.ilrd.a> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IlrdEventsRepository.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10478a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new com.moloco.sdk.internal.ilrd.a(IlrdEventsRepository.this.timeProvider, this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleInactiveSessionExpiry$1", f = "IlrdEventsRepository.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10479a;

        public g(Continuation<? super g> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return IlrdEventsRepository.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10479a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.a session = IlrdEventsRepository.this.getSession();
                if (session != null) {
                    session.a();
                }
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f10479a = 1;
                if (ilrdEventsRepository.b(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleMaxSessionLength$1", f = "IlrdEventsRepository.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10480a;

        public h(Continuation<? super h> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return IlrdEventsRepository.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10480a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.a session = IlrdEventsRepository.this.getSession();
                if (session != null) {
                    session.a();
                }
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f10480a = 1;
                if (ilrdEventsRepository.b(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleUploadIntervalScheduler$1", f = "IlrdEventsRepository.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10481a;

        public i(Continuation<? super i> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((i) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return IlrdEventsRepository.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10481a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f10481a = 1;
                if (ilrdEventsRepository.b(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$sendEvents$1", f = "IlrdEventsRepository.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10482a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IlrdEventsRepository.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10482a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f10482a = 1;
                if (ilrdEventsRepository.b(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", i = {0, 0, 1, 1, 1}, l = {499, 437}, m = "sendEventsSuspending", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "compressed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10483a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return IlrdEventsRepository.this.b(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeEventsToPersistentStorage$2", f = "IlrdEventsRepository.kt", i = {}, l = {448, 455}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10484a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IlrdEventsRepository.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10484a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (IlrdEventsRepository.this.b().isEmpty()) {
                w wVar = IlrdEventsRepository.this.dataStoreService;
                this.f10484a = 1;
                if (wVar.a(IlrdEventsRepository.w, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            String encodeToString = Base64.encodeToString(IlrdRequest.ImpressionRevenueRequest.newBuilder().addAllEvents(IlrdEventsRepository.this.b()).build().toByteArray(), 2);
            w wVar2 = IlrdEventsRepository.this.dataStoreService;
            this.f10484a = 2;
            if (wVar2.a(IlrdEventsRepository.w, encodeToString, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeSessionToPersistentStorage$2", f = "IlrdEventsRepository.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10485a;
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.a b;
        public final /* synthetic */ IlrdEventsRepository c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.moloco.sdk.internal.ilrd.a aVar, IlrdEventsRepository ilrdEventsRepository, Continuation<? super m> continuation) {
            super(2, continuation);
            this.b = aVar;
            this.c = ilrdEventsRepository;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new m(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10485a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String f = this.b.f();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, IlrdEventsRepository.u, "Storing current session: " + f, null, false, 12, null);
                w wVar = this.c.dataStoreService;
                this.f10485a = 1;
                if (wVar.a(IlrdEventsRepository.v, f, this) == coroutine_suspended) {
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

    public /* synthetic */ IlrdEventsRepository(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, long j2, int i2, long j3, long j4, I i3, Lifecycle lifecycle, InterfaceC4803d interfaceC4803d, String str2, String str3, w wVar, com.moloco.sdk.internal.ilrd.d dVar, com.moloco.sdk.internal.ilrd.d dVar2, com.moloco.sdk.internal.ilrd.d dVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, iVar, j2, i2, j3, j4, i3, lifecycle, interfaceC4803d, str2, str3, wVar, dVar, dVar2, dVar3);
    }

    public static /* synthetic */ void c() {
    }

    /* renamed from: e, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.a getSession() {
        return this.session;
    }

    /* renamed from: f, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.d getSessionInactiveScheduler() {
        return this.sessionInactiveScheduler;
    }

    /* renamed from: g, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.d getSessionMaxLengthScheduler() {
        return this.sessionMaxLengthScheduler;
    }

    public final boolean h() {
        boolean z = this.events.size() >= this.maxBatchSize;
        if (z) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "batch size reached", null, false, 12, null);
        }
        return z;
    }

    public final synchronized void i() {
        a();
        j();
    }

    public final void j() {
        this.sessionInactiveScheduler.a(this.sessionExp, new g(null));
    }

    public final void k() {
        this.scheduledUploadScheduler.a(this.uploadInterval, new i(null));
    }

    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new j(null), 3, null);
    }

    public final void m() {
        com.moloco.sdk.internal.ilrd.a aVar = new com.moloco.sdk.internal.ilrd.a(this.timeProvider, null, 2, null);
        this.session = aVar;
        a(this.sessionMaxLength);
        k();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "New session started: sessionId=" + aVar.c() + ", maxBatch=" + this.maxBatchSize + ", uploadInterval=" + ((Object) Duration.m9466toStringimpl(this.uploadInterval)) + ", sessionExp=" + ((Object) Duration.m9466toStringimpl(this.sessionExp)) + ", maxLength=" + ((Object) Duration.m9466toStringimpl(this.sessionMaxLength)), null, false, 12, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "onPause called, sending events", null, false, 12, null);
        l();
    }

    public IlrdEventsRepository(CoroutineScope scope, String url, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, long j2, int i2, long j3, long j4, I timeProvider, Lifecycle processLifeycle, InterfaceC4803d advertisingIdService, String pubId, String appId, w dataStoreService, com.moloco.sdk.internal.ilrd.d sessionInactiveScheduler, com.moloco.sdk.internal.ilrd.d sessionMaxLengthScheduler, com.moloco.sdk.internal.ilrd.d scheduledUploadScheduler) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(processLifeycle, "processLifeycle");
        Intrinsics.checkNotNullParameter(advertisingIdService, "advertisingIdService");
        Intrinsics.checkNotNullParameter(pubId, "pubId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        Intrinsics.checkNotNullParameter(sessionInactiveScheduler, "sessionInactiveScheduler");
        Intrinsics.checkNotNullParameter(sessionMaxLengthScheduler, "sessionMaxLengthScheduler");
        Intrinsics.checkNotNullParameter(scheduledUploadScheduler, "scheduledUploadScheduler");
        this.scope = scope;
        this.url = url;
        this.persistentHttpRequest = persistentHttpRequest;
        this.sessionExp = j2;
        this.maxBatchSize = i2;
        this.uploadInterval = j3;
        this.sessionMaxLength = j4;
        this.timeProvider = timeProvider;
        this.advertisingIdService = advertisingIdService;
        this.pubId = pubId;
        this.appId = appId;
        this.dataStoreService = dataStoreService;
        this.sessionInactiveScheduler = sessionInactiveScheduler;
        this.sessionMaxLengthScheduler = sessionMaxLengthScheduler;
        this.scheduledUploadScheduler = scheduledUploadScheduler;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.events = new ArrayList();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "ILRD repository initialized - url=" + url + ", uploadInterval=" + ((Object) Duration.m9466toStringimpl(j3)) + ", maxBatchSize=" + i2 + ", sessionExpiry=" + ((Object) Duration.m9466toStringimpl(j2)) + ", maxSessionLength=" + ((Object) Duration.m9466toStringimpl(j4)), null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, com.moloco.sdk.internal.scheduling.b.a().getMainImmediate(), null, new a(processLifeycle, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(null), 3, null);
    }

    /* renamed from: d, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.d getScheduledUploadScheduler() {
        return this.scheduledUploadScheduler;
    }

    public final List<IlrdRequest.ImpressionLevelRevenue> b() {
        return this.events;
    }

    public final Object d(Continuation<? super Unit> continuation) {
        Object withContext;
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        return (aVar != null && (withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new m(aVar, this, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|82|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027c, code lost:
    
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.ilrd.IlrdEventsRepository.u, "Failed to restore persisted ILRD events", r0, false, 8, null);
        r0 = r4.dataStoreService;
        r2.f10477a = null;
        r2.b = null;
        r2.e = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0297, code lost:
    
        if (r0.a(com.moloco.sdk.internal.ilrd.IlrdEventsRepository.w, r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0299, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.moloco.sdk.internal.ilrd.IlrdEventsRepository, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation<? super Unit> continuation) {
        e eVar;
        ?? r4;
        IlrdEventsRepository ilrdEventsRepository;
        String str;
        long duration;
        com.moloco.sdk.internal.ilrd.a aVar;
        String str2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
                Object obj = eVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r4 = eVar.e;
                switch (r4) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        w wVar = this.dataStoreService;
                        eVar.f10477a = this;
                        eVar.e = 1;
                        obj = wVar.d(v, eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ilrdEventsRepository = this;
                        str = (String) obj;
                        if (str != null) {
                            return Unit.INSTANCE;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Existing session found: " + str, null, false, 12, null);
                        w wVar2 = ilrdEventsRepository.dataStoreService;
                        eVar.f10477a = ilrdEventsRepository;
                        eVar.b = str;
                        eVar.e = 2;
                        if (wVar2.a(v, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        f fVar = ilrdEventsRepository.new f(str, null);
                        eVar.f10477a = ilrdEventsRepository;
                        eVar.b = null;
                        eVar.e = 3;
                        obj = BuildersKt.withContext(coroutineContext, fVar, eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.internal.ilrd.a aVar2 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a2 = ilrdEventsRepository.timeProvider.a();
                        Duration.Companion companion = Duration.INSTANCE;
                        long d2 = a2 - aVar2.d();
                        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                        duration = DurationKt.toDuration(d2, durationUnit);
                        long i3 = aVar2.b().i();
                        if (Duration.m9425compareToLRDsOJo(duration, ilrdEventsRepository.sessionMaxLength) > 0) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Discarding restored session - exceeded maximum length.", null, false, 12, null);
                            w wVar3 = ilrdEventsRepository.dataStoreService;
                            eVar.f10477a = null;
                            eVar.e = 4;
                            if (wVar3.a(w, eVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (i3 > 0 && a2 - i3 > Duration.m9437getInWholeMillisecondsimpl(ilrdEventsRepository.sessionExp)) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Discarding restored session - exceeded inactivity timeout", null, false, 12, null);
                            w wVar4 = ilrdEventsRepository.dataStoreService;
                            eVar.f10477a = null;
                            eVar.e = 5;
                            if (wVar4.a(w, eVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "ILRD session restored successfully - sessionId=" + aVar2.c() + ", age=" + ((Object) Duration.m9466toStringimpl(DurationKt.toDuration(a2 - aVar2.d(), durationUnit))) + ", impressions=" + aVar2.b(), null, false, 12, null);
                        ilrdEventsRepository.session = aVar2;
                        ilrdEventsRepository.k();
                        ilrdEventsRepository.a(Duration.m9454minusLRDsOJo(ilrdEventsRepository.sessionMaxLength, duration));
                        w wVar5 = ilrdEventsRepository.dataStoreService;
                        eVar.f10477a = ilrdEventsRepository;
                        eVar.b = aVar2;
                        eVar.e = 6;
                        Object d3 = wVar5.d(w, eVar);
                        if (d3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = aVar2;
                        obj = d3;
                        str2 = (String) obj;
                        if (str2 != null) {
                            List<IlrdRequest.ImpressionLevelRevenue> eventsList = IlrdRequest.ImpressionRevenueRequest.parseFrom(Base64.decode(str2, 0)).getEventsList();
                            Intrinsics.checkNotNullExpressionValue(eventsList, "getEventsList(...)");
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : eventsList) {
                                if (Intrinsics.areEqual(((IlrdRequest.ImpressionLevelRevenue) obj2).getSessionId(), aVar.c())) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                ilrdEventsRepository.events.addAll(arrayList);
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Restored " + arrayList.size() + " pending ILRD events for sessionId=" + aVar.c(), null, false, 12, null);
                            } else {
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "No pending ILRD events matched restored sessionId=" + aVar.c() + "; clearing persisted events", null, false, 12, null);
                                w wVar6 = ilrdEventsRepository.dataStoreService;
                                eVar.f10477a = ilrdEventsRepository;
                                eVar.b = null;
                                eVar.e = 7;
                                if (wVar6.a(w, eVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ilrdEventsRepository = (IlrdEventsRepository) eVar.f10477a;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        if (str != null) {
                        }
                        break;
                    case 2:
                        String str3 = (String) eVar.b;
                        IlrdEventsRepository ilrdEventsRepository2 = (IlrdEventsRepository) eVar.f10477a;
                        ResultKt.throwOnFailure(obj);
                        str = str3;
                        ilrdEventsRepository = ilrdEventsRepository2;
                        CoroutineContext coroutineContext2 = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        f fVar2 = ilrdEventsRepository.new f(str, null);
                        eVar.f10477a = ilrdEventsRepository;
                        eVar.b = null;
                        eVar.e = 3;
                        obj = BuildersKt.withContext(coroutineContext2, fVar2, eVar);
                        if (obj == coroutine_suspended) {
                        }
                        com.moloco.sdk.internal.ilrd.a aVar22 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a22 = ilrdEventsRepository.timeProvider.a();
                        Duration.Companion companion2 = Duration.INSTANCE;
                        long d22 = a22 - aVar22.d();
                        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
                        duration = DurationKt.toDuration(d22, durationUnit2);
                        long i32 = aVar22.b().i();
                        if (Duration.m9425compareToLRDsOJo(duration, ilrdEventsRepository.sessionMaxLength) > 0) {
                        }
                        break;
                    case 3:
                        ilrdEventsRepository = (IlrdEventsRepository) eVar.f10477a;
                        ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.internal.ilrd.a aVar222 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a222 = ilrdEventsRepository.timeProvider.a();
                        Duration.Companion companion22 = Duration.INSTANCE;
                        long d222 = a222 - aVar222.d();
                        DurationUnit durationUnit22 = DurationUnit.MILLISECONDS;
                        duration = DurationKt.toDuration(d222, durationUnit22);
                        long i322 = aVar222.b().i();
                        if (Duration.m9425compareToLRDsOJo(duration, ilrdEventsRepository.sessionMaxLength) > 0) {
                        }
                        break;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        com.moloco.sdk.internal.ilrd.a aVar3 = (com.moloco.sdk.internal.ilrd.a) eVar.b;
                        IlrdEventsRepository ilrdEventsRepository3 = (IlrdEventsRepository) eVar.f10477a;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                        ilrdEventsRepository = ilrdEventsRepository3;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(continuation);
        Object obj3 = eVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = eVar.e;
        switch (r4) {
        }
    }

    public final void b(c.a ilrdData) {
        Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        BuildersKt.launch(this.scope, EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new d(ilrdData, null));
    }

    public final Object c(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new l(null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public /* synthetic */ IlrdEventsRepository(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, long j2, int i2, long j3, long j4, I i3, Lifecycle lifecycle, InterfaceC4803d interfaceC4803d, String str2, String str3, w wVar, com.moloco.sdk.internal.ilrd.d dVar, com.moloco.sdk.internal.ilrd.d dVar2, com.moloco.sdk.internal.ilrd.d dVar3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, iVar, j2, i2, j3, j4, i3, lifecycle, interfaceC4803d, str2, str3, wVar, (i4 & 8192) != 0 ? new com.moloco.sdk.internal.ilrd.d(coroutineScope, i3, "SessionInactiveScheduler") : dVar, (i4 & 16384) != 0 ? new com.moloco.sdk.internal.ilrd.d(coroutineScope, i3, "SessionMaxLengthScheduler") : dVar2, (i4 & 32768) != 0 ? new com.moloco.sdk.internal.ilrd.d(coroutineScope, i3, "UploadIntervalScheduler") : dVar3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:27:0x006a, B:29:0x0072, B:30:0x0085, B:32:0x00a2, B:34:0x00a8, B:35:0x00af), top: B:26:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:27:0x006a, B:29:0x0072, B:30:0x0085, B:32:0x00a2, B:34:0x00a8, B:35:0x00af), top: B:26:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation<? super Unit> continuation) {
        k kVar;
        int i2;
        Mutex mutex;
        IlrdEventsRepository ilrdEventsRepository;
        Mutex mutex2;
        Throwable th;
        byte[] a2;
        IlrdEventsRepository ilrdEventsRepository2;
        try {
            if (continuation instanceof k) {
                kVar = (k) continuation;
                int i3 = kVar.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    kVar.f = i3 - Integer.MIN_VALUE;
                    Object obj = kVar.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = kVar.f;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        k();
                        mutex = this.mutex;
                        kVar.f10483a = this;
                        kVar.b = mutex;
                        kVar.f = 1;
                        if (mutex.lock(null, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ilrdEventsRepository = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a2 = (byte[]) kVar.c;
                            mutex2 = (Mutex) kVar.b;
                            ilrdEventsRepository2 = (IlrdEventsRepository) kVar.f10483a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                if (a2 != null) {
                                    ilrdEventsRepository2.persistentHttpRequest.a(ilrdEventsRepository2.url, a2, ContentType.Application.INSTANCE.getProtoBuf(), "gzip");
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) kVar.b;
                        ilrdEventsRepository = (IlrdEventsRepository) kVar.f10483a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    if (!ilrdEventsRepository.events.isEmpty()) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Request for sendEvent came, but event list is empty. Returning", null, false, 12, null);
                        mutex2 = mutex;
                        ilrdEventsRepository2 = ilrdEventsRepository;
                        a2 = null;
                    } else {
                        IlrdRequest.ImpressionRevenueRequest.Builder newBuilder = IlrdRequest.ImpressionRevenueRequest.newBuilder();
                        newBuilder.setOs(U3.d);
                        newBuilder.setPublisherId(ilrdEventsRepository.pubId);
                        newBuilder.setPublisherAppId(ilrdEventsRepository.appId);
                        AbstractC4802c a3 = ilrdEventsRepository.advertisingIdService.a();
                        AbstractC4802c.a aVar = a3 instanceof AbstractC4802c.a ? (AbstractC4802c.a) a3 : null;
                        if (aVar != null) {
                            newBuilder.setDeviceId(aVar.b());
                        }
                        newBuilder.addAllEvents(ilrdEventsRepository.events);
                        IlrdRequest.ImpressionRevenueRequest build = newBuilder.build();
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Ilrd request created now sending it with " + build.getEventsList().size() + " events", null, false, 12, null);
                        Companion companion = INSTANCE;
                        byte[] byteArray = build.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                        a2 = companion.a(byteArray);
                        ilrdEventsRepository.events.clear();
                        w wVar = ilrdEventsRepository.dataStoreService;
                        kVar.f10483a = ilrdEventsRepository;
                        kVar.b = mutex;
                        kVar.c = a2;
                        kVar.f = 2;
                        if (wVar.a(w, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex;
                        ilrdEventsRepository2 = ilrdEventsRepository;
                    }
                    mutex2.unlock(null);
                    if (a2 != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            if (!ilrdEventsRepository.events.isEmpty()) {
            }
            mutex2.unlock(null);
            if (a2 != null) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        kVar = new k(continuation);
        Object obj2 = kVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.f;
        if (i2 != 0) {
        }
    }

    public final IlrdRequest.ImpressionLevelRevenue a(c.a ilrdData) {
        IlrdRequest.ImpressionLevelRevenue.Builder eventId = IlrdRequest.ImpressionLevelRevenue.newBuilder().setEventId(UUID.randomUUID().toString());
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        if (aVar != null) {
            eventId.setSessionId(aVar.c());
            Duration.Companion companion = Duration.INSTANCE;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Event created: sessionId=" + aVar.c() + ", sessionAge=" + ((Object) Duration.m9466toStringimpl(DurationKt.toDuration(this.timeProvider.a() - aVar.d(), DurationUnit.MILLISECONDS))), null, false, 12, null);
        }
        if (ilrdData instanceof c.a.b) {
            eventId.setMax(((c.a.b) ilrdData).b());
        } else {
            if (!(ilrdData instanceof c.a.C1475a)) {
                throw new NoWhenBranchMatchedException();
            }
            eventId.setLevelplay(((c.a.C1475a) ilrdData).b());
        }
        return eventId.build();
    }

    public final void a() {
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        if (aVar != null && !aVar.e()) {
            Duration.Companion companion = Duration.INSTANCE;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Session validation - age: " + ((Object) Duration.m9466toStringimpl(DurationKt.toDuration(this.timeProvider.a() - aVar.d(), DurationUnit.MILLISECONDS))) + ", limit: " + ((Object) Duration.m9466toStringimpl(this.sessionMaxLength)), null, false, 12, null);
            return;
        }
        m();
    }

    public final void a(long duration) {
        this.sessionMaxLengthScheduler.a(duration, new h(null));
    }
}
