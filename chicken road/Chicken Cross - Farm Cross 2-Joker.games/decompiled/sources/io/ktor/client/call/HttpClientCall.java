package io.ktor.client.call;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.Te;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.request.DefaultHttpRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.statement.DefaultHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.content.NullBody;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.utils.io.ByteReadChannel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: HttpClientCall.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000 92\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0094@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R*\u0010\u001e\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001d8\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u00100\"\u0004\b!\u0010 R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00178\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\b2\u00103\"\u0004\b\u001c\u0010\u001bR\u001a\u00105\u001a\u0002048\u0014X\u0094D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lio/ktor/client/request/HttpResponseData;", "responseData", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestData;Lio/ktor/client/request/HttpResponseData;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getResponseContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "info", "", "bodyNullable", "(Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "body", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "Lio/ktor/client/statement/HttpResponse;", Te.n, "", "setResponse$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;)V", "setResponse", "Lio/ktor/client/request/HttpRequest;", "request", "setRequest$ktor_client_core", "(Lio/ktor/client/request/HttpRequest;)V", "setRequest", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "attributes", "value", "Lio/ktor/client/request/HttpRequest;", "getRequest", "()Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "", "allowDoubleReceive", "Z", "getAllowDoubleReceive", "()Z", k.M, "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class HttpClientCall implements CoroutineScope {
    private static final AttributeKey<Object> CustomResponse;
    private static final /* synthetic */ AtomicIntegerFieldUpdater received$FU;
    private final boolean allowDoubleReceive;
    private final HttpClient client;
    private volatile /* synthetic */ int received;
    protected HttpRequest request;
    protected HttpResponse response;

    protected Object getResponseContent(Continuation<? super ByteReadChannel> continuation) {
        return getResponseContent$suspendImpl(this, continuation);
    }

    public HttpClientCall(HttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
        this.received = 0;
    }

    public final HttpClient getClient() {
        return this.client;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return getResponse().getCoroutineContext();
    }

    public final Attributes getAttributes() {
        return getRequest().getAttributes();
    }

    public final HttpRequest getRequest() {
        HttpRequest httpRequest = this.request;
        if (httpRequest != null) {
            return httpRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    protected final void setRequest(HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<set-?>");
        this.request = httpRequest;
    }

    public final HttpResponse getResponse() {
        HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            return httpResponse;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Te.n);
        return null;
    }

    protected final void setResponse(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<set-?>");
        this.response = httpResponse;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClientCall(HttpClient client, HttpRequestData requestData, HttpResponseData responseData) {
        this(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        setRequest(new DefaultHttpRequest(this, requestData));
        setResponse(new DefaultHttpResponse(this, responseData));
        Attributes attributes = getAttributes();
        AttributeKey<Object> attributeKey = CustomResponse;
        attributes.remove(attributeKey);
        if (responseData.getBody() instanceof ByteReadChannel) {
            return;
        }
        getAttributes().put(attributeKey, responseData.getBody());
    }

    protected boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    static /* synthetic */ Object getResponseContent$suspendImpl(HttpClientCall httpClientCall, Continuation<? super ByteReadChannel> continuation) {
        return httpClientCall.getResponse().getRawContent();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:12:0x002d, B:13:0x00a5, B:17:0x00b7, B:20:0x00c2, B:21:0x00d7, B:28:0x003e, B:29:0x008f, B:33:0x0045, B:35:0x0053, B:37:0x0058, B:39:0x005e, B:41:0x0068, B:44:0x0072, B:45:0x0077, B:46:0x0078, B:48:0x0084), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bodyNullable(TypeInfo typeInfo, Continuation<Object> continuation) {
        HttpClientCall$bodyNullable$1 httpClientCall$bodyNullable$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Object response;
        try {
            if (continuation instanceof HttpClientCall$bodyNullable$1) {
                httpClientCall$bodyNullable$1 = (HttpClientCall$bodyNullable$1) continuation;
                if ((httpClientCall$bodyNullable$1.label & Integer.MIN_VALUE) != 0) {
                    httpClientCall$bodyNullable$1.label -= Integer.MIN_VALUE;
                    obj = httpClientCall$bodyNullable$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpClientCall$bodyNullable$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (TypeInfoJvmKt.instanceOf(getResponse(), typeInfo.getType())) {
                            return getResponse();
                        }
                        if (!getAllowDoubleReceive() && !DoubleReceivePluginKt.isSaved(getResponse()) && !received$FU.compareAndSet(this, 0, 1)) {
                            throw new DoubleReceiveException(this);
                        }
                        obj = getAttributes().getOrNull(CustomResponse);
                        if (obj == null) {
                            httpClientCall$bodyNullable$1.L$0 = typeInfo;
                            httpClientCall$bodyNullable$1.label = 1;
                            obj = getResponseContent(httpClientCall$bodyNullable$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            typeInfo = (TypeInfo) httpClientCall$bodyNullable$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            response = ((HttpResponseContainer) obj).getResponse();
                            if (Intrinsics.areEqual(response, NullBody.INSTANCE)) {
                                response = null;
                            }
                            if (response != null && !TypeInfoJvmKt.instanceOf(response, typeInfo.getType())) {
                                throw new NoTransformationFoundException(getResponse(), Reflection.getOrCreateKotlinClass(response.getClass()), typeInfo.getType());
                            }
                            return response;
                        }
                        typeInfo = (TypeInfo) httpClientCall$bodyNullable$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    HttpResponseContainer httpResponseContainer = new HttpResponseContainer(typeInfo, obj);
                    HttpResponsePipeline responsePipeline = this.client.getResponsePipeline();
                    httpClientCall$bodyNullable$1.L$0 = typeInfo;
                    httpClientCall$bodyNullable$1.label = 2;
                    obj = responsePipeline.execute(this, httpResponseContainer, httpClientCall$bodyNullable$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    response = ((HttpResponseContainer) obj).getResponse();
                    if (Intrinsics.areEqual(response, NullBody.INSTANCE)) {
                    }
                    if (response != null) {
                        throw new NoTransformationFoundException(getResponse(), Reflection.getOrCreateKotlinClass(response.getClass()), typeInfo.getType());
                    }
                    return response;
                }
            }
            if (i != 0) {
            }
            HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, obj);
            HttpResponsePipeline responsePipeline2 = this.client.getResponsePipeline();
            httpClientCall$bodyNullable$1.L$0 = typeInfo;
            httpClientCall$bodyNullable$1.label = 2;
            obj = responsePipeline2.execute(this, httpResponseContainer2, httpClientCall$bodyNullable$1);
            if (obj == coroutine_suspended) {
            }
            response = ((HttpResponseContainer) obj).getResponse();
            if (Intrinsics.areEqual(response, NullBody.INSTANCE)) {
            }
            if (response != null) {
            }
            return response;
        } catch (Throwable th) {
            CoroutineScopeKt.cancel(getResponse(), "Receive failed", th);
            throw th;
        }
        httpClientCall$bodyNullable$1 = new HttpClientCall$bodyNullable$1(this, continuation);
        obj = httpClientCall$bodyNullable$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClientCall$bodyNullable$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object body(TypeInfo typeInfo, Continuation<Object> continuation) {
        HttpClientCall$body$1 httpClientCall$body$1;
        int i;
        if (continuation instanceof HttpClientCall$body$1) {
            httpClientCall$body$1 = (HttpClientCall$body$1) continuation;
            if ((httpClientCall$body$1.label & Integer.MIN_VALUE) != 0) {
                httpClientCall$body$1.label -= Integer.MIN_VALUE;
                Object obj = httpClientCall$body$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpClientCall$body$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    httpClientCall$body$1.label = 1;
                    obj = bodyNullable(typeInfo, httpClientCall$body$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNull(obj);
                return obj;
            }
        }
        httpClientCall$body$1 = new HttpClientCall$body$1(this, continuation);
        Object obj2 = httpClientCall$body$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClientCall$body$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }

    public String toString() {
        return "HttpClientCall[" + getRequest().getUrl() + ", " + getResponse().getStatus() + AbstractJsonLexerKt.END_LIST;
    }

    public final void setResponse$ktor_client_core(HttpResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        setResponse(response);
    }

    public final void setRequest$ktor_client_core(HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        setRequest(request);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kType = null;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        try {
            kType = Reflection.typeOf(Object.class);
        } catch (Throwable unused) {
        }
        CustomResponse = new AttributeKey<>("CustomResponse", new TypeInfo(orCreateKotlinClass, kType));
        received$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");
    }
}
