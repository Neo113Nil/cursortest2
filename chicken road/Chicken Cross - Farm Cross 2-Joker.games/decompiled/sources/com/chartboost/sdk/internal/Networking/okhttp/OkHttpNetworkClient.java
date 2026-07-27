package com.chartboost.sdk.internal.Networking.okhttp;

import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.ld;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.pd;
import com.chartboost.sdk.impl.td;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.io.Closeable;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000fB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0011J@\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u000f\u0010\u0015J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u000f\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/chartboost/sdk/internal/Networking/okhttp/OkHttpNetworkClient;", "Lcom/chartboost/sdk/impl/ld;", "", "connectTimeoutSecs", "writeTimeoutSecs", "readTimeoutSecs", "<init>", "(JJJ)V", "", "url", "jsonBody", "", "headers", "contentType", "Lcom/chartboost/sdk/impl/pd;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "method", "Lokhttp3/RequestBody;", "requestBody", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", k.M, "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OkHttpNetworkClient implements ld {
    public static volatile Interceptor customInterceptor;
    private final OkHttpClient okHttpClient;

    public static final class b extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return OkHttpNetworkClient.this.a(null, this);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String d;
        public final /* synthetic */ Map e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Map map, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.e = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OkHttpNetworkClient.this.new c(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            OkHttpNetworkClient okHttpNetworkClient = OkHttpNetworkClient.this;
            String str = this.d;
            Map map = this.e;
            this.b = 1;
            Object a2 = OkHttpNetworkClient.a(okHttpNetworkClient, str, map, "GET", null, this, 8, null);
            return a2 == coroutine_suspended ? coroutine_suspended : a2;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ OkHttpNetworkClient e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Map g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, OkHttpNetworkClient okHttpNetworkClient, String str3, Map map, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
            this.e = okHttpNetworkClient;
            this.f = str3;
            this.g = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            MediaType.Companion companion = MediaType.INSTANCE;
            String str = this.c;
            if (str == null) {
                str = "application/json; charset=utf-8";
            }
            RequestBody create = RequestBody.INSTANCE.create(this.d, companion.get(str));
            OkHttpNetworkClient okHttpNetworkClient = this.e;
            String str2 = this.f;
            Map map = this.g;
            this.b = 1;
            Object a2 = okHttpNetworkClient.a(str2, map, "POST", create, this);
            return a2 == coroutine_suspended ? coroutine_suspended : a2;
        }
    }

    public OkHttpNetworkClient(long j, long j2, long j3) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder readTimeout = builder.connectTimeout(j, timeUnit).writeTimeout(j2, timeUnit).readTimeout(j3, timeUnit);
        Interceptor interceptor = customInterceptor;
        if (interceptor != null) {
            mb.a("Adding custom networking interceptor: " + interceptor.getClass().getSimpleName(), (Throwable) null, 2, (Object) null);
            readTimeout.addInterceptor(interceptor);
        }
        this.okHttpClient = readTimeout.build();
    }

    @Override // com.chartboost.sdk.impl.ld
    public Object a(String str, String str2, Map map, String str3, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(str3, str2, this, str, map, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.ld
    public Object a(String str, Map map, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(str, map, null), continuation);
    }

    public static /* synthetic */ Object a(OkHttpNetworkClient okHttpNetworkClient, String str, Map map, String str2, RequestBody requestBody, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            requestBody = null;
        }
        return okHttpNetworkClient.a(str, map, str2, requestBody, continuation);
    }

    public final Object a(String str, Map map, String str2, RequestBody requestBody, Continuation continuation) {
        try {
            Request.Builder method = new Request.Builder().url(str).method(str2, requestBody);
            for (Map.Entry entry : map.entrySet()) {
                method.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            return a(method.build(), continuation);
        } catch (IllegalArgumentException e) {
            mb.a("Invalid URL: " + str, e);
            String message = e.getMessage();
            if (message == null) {
                message = "malformed URL";
            }
            return new pd(false, -1, null, new ChartboostError.Connectivity.Unknown("Invalid URL: " + message, e), null, 20, null);
        }
    }

    public /* synthetic */ OkHttpNetworkClient(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5L : j, (i & 2) != 0 ? 5L : j2, (i & 4) != 0 ? 5L : j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x008e, TryCatch #5 {all -> 0x008e, blocks: (B:14:0x0047, B:16:0x0055, B:18:0x005b, B:20:0x0061, B:22:0x006a, B:23:0x0071, B:25:0x0079, B:26:0x0086), top: B:13:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[Catch: all -> 0x008e, TryCatch #5 {all -> 0x008e, blocks: (B:14:0x0047, B:16:0x0055, B:18:0x005b, B:20:0x0061, B:22:0x006a, B:23:0x0071, B:25:0x0079, B:26:0x0086), top: B:13:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Request request, Continuation continuation) {
        b bVar;
        int i;
        String str;
        Closeable closeable;
        MediaType mediaType;
        Charset charset$default;
        try {
            try {
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
                            OkHttpClient okHttpClient = this.okHttpClient;
                            bVar.b = request;
                            bVar.e = 1;
                            obj = td.a(okHttpClient, request, bVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        closeable = (Closeable) obj;
                        Response response = (Response) closeable;
                        boolean isSuccessful = response.isSuccessful();
                        ResponseBody body = response.body();
                        pd pdVar = new pd(isSuccessful, response.code(), body == null ? body.bytes() : null, isSuccessful ? a.c.b(response.code()) : null, (body != null || (mediaType = body.get$contentType()) == null || (charset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) ? null : charset$default.name());
                        CloseableKt.closeFinally(closeable, null);
                        return pdVar;
                    }
                }
                Response response2 = (Response) closeable;
                boolean isSuccessful2 = response2.isSuccessful();
                ResponseBody body2 = response2.body();
                if (body2 != null) {
                }
                if (body2 == null) {
                }
                pd pdVar2 = new pd(isSuccessful2, response2.code(), body2 == null ? body2.bytes() : null, isSuccessful2 ? a.c.b(response2.code()) : null, (body2 != null || (mediaType = body2.get$contentType()) == null || (charset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) ? null : charset$default.name());
                CloseableKt.closeFinally(closeable, null);
                return pdVar2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(closeable, th);
                    throw th2;
                }
            }
            if (i != 0) {
            }
            closeable = (Closeable) obj;
        } catch (SocketTimeoutException e) {
            mb.a("SocketTimeoutException while making network request to " + request.url(), e);
            return new pd(false, -1, null, ChartboostError.Connectivity.TimedOut.INSTANCE, null, 20, null);
        } catch (UnknownHostException e2) {
            mb.a("UnknownHostException while making network request to " + request.url(), e2);
            String message = e2.getMessage();
            if (message == null || (str = "Unknown host: " + message) == null) {
                str = "Unknown host";
            }
            return new pd(false, -1, null, new ChartboostError.Connectivity.NetworkError(str, e2), null, 20, null);
        } catch (IOException e3) {
            mb.a("IOException while making network request to " + request.url(), e3);
            String message2 = e3.getMessage();
            if (message2 == null) {
                message2 = "Network error";
            }
            return new pd(false, -1, null, new ChartboostError.Connectivity.NetworkError(message2, e3), null, 20, null);
        } catch (Exception e4) {
            mb.a("Exception while making network request to " + request.url(), e4);
            String message3 = e4.getMessage();
            if (message3 == null) {
                message3 = "Unknown error";
            }
            return new pd(false, -1, null, new ChartboostError.Connectivity.Unknown(message3, e4), null, 20, null);
        }
        bVar = new b(continuation);
        Object obj2 = bVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
    }
}
