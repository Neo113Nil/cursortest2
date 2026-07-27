package io.ktor.client.statement;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.charsets.EncodingKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.io.Source;

/* compiled from: HttpResponse.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\b\u001a\u00020\u0007*\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000e\u0010\f\"\u001e\u0010\u0012\u001a\u00020\n*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0016\u001a\u00020\u0013*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "", CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "(Lio/ktor/client/statement/HttpResponse;)V", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "fallbackCharset", "", "bodyAsText", "(Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "bodyAsChannel", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "bodyAsBytes", "getContent", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/utils/io/ByteReadChannel;", "getContent$annotations", "content", "Lio/ktor/client/request/HttpRequest;", "getRequest", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/client/request/HttpRequest;", "request", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpResponseKt {
    @Deprecated(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @ReplaceWith(expression = "readRawBytes()", imports = {}))
    public static /* synthetic */ void getContent$annotations(HttpResponse httpResponse) {
    }

    public static final ByteReadChannel getContent(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getRawContent();
    }

    public static final HttpRequest getRequest(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getRequest();
    }

    public static final void complete(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        Job job = JobKt.getJob(httpResponse.getCoroutineContext());
        Intrinsics.checkNotNull(job, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((CompletableJob) job).complete();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bodyAsText(HttpResponse httpResponse, Charset charset, Continuation<? super String> continuation) {
        HttpResponseKt$bodyAsText$1 httpResponseKt$bodyAsText$1;
        Object obj;
        int i;
        KType kType;
        CharsetDecoder charsetDecoder;
        if (continuation instanceof HttpResponseKt$bodyAsText$1) {
            httpResponseKt$bodyAsText$1 = (HttpResponseKt$bodyAsText$1) continuation;
            if ((httpResponseKt$bodyAsText$1.label & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsText$1.label -= Integer.MIN_VALUE;
                obj = httpResponseKt$bodyAsText$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpResponseKt$bodyAsText$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Charset charset2 = HttpMessagePropertiesKt.charset(httpResponse);
                    if (charset2 != null) {
                        charset = charset2;
                    }
                    CharsetDecoder newDecoder = charset.newDecoder();
                    HttpClientCall call = httpResponse.getCall();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
                    try {
                        kType = Reflection.typeOf(Source.class);
                    } catch (Throwable unused) {
                        kType = null;
                    }
                    TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
                    httpResponseKt$bodyAsText$1.L$0 = newDecoder;
                    httpResponseKt$bodyAsText$1.label = 1;
                    obj = call.bodyNullable(typeInfo, httpResponseKt$bodyAsText$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    charsetDecoder = newDecoder;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charsetDecoder = (CharsetDecoder) httpResponseKt$bodyAsText$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    Intrinsics.checkNotNull(charsetDecoder);
                    return EncodingKt.decode$default(charsetDecoder, (Source) obj, 0, 2, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
            }
        }
        httpResponseKt$bodyAsText$1 = new HttpResponseKt$bodyAsText$1(continuation);
        obj = httpResponseKt$bodyAsText$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpResponseKt$bodyAsText$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    public static /* synthetic */ Object bodyAsText$default(HttpResponse httpResponse, Charset charset, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return bodyAsText(httpResponse, charset, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bodyAsChannel(HttpResponse httpResponse, Continuation<? super ByteReadChannel> continuation) {
        HttpResponseKt$bodyAsChannel$1 httpResponseKt$bodyAsChannel$1;
        Object obj;
        int i;
        KType kType;
        if (continuation instanceof HttpResponseKt$bodyAsChannel$1) {
            httpResponseKt$bodyAsChannel$1 = (HttpResponseKt$bodyAsChannel$1) continuation;
            if ((httpResponseKt$bodyAsChannel$1.label & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsChannel$1.label -= Integer.MIN_VALUE;
                obj = httpResponseKt$bodyAsChannel$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpResponseKt$bodyAsChannel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpClientCall call = httpResponse.getCall();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ByteReadChannel.class);
                    try {
                        kType = Reflection.typeOf(ByteReadChannel.class);
                    } catch (Throwable unused) {
                        kType = null;
                    }
                    TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
                    httpResponseKt$bodyAsChannel$1.label = 1;
                    obj = call.bodyNullable(typeInfo, httpResponseKt$bodyAsChannel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return (ByteReadChannel) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
            }
        }
        httpResponseKt$bodyAsChannel$1 = new HttpResponseKt$bodyAsChannel$1(continuation);
        obj = httpResponseKt$bodyAsChannel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpResponseKt$bodyAsChannel$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bodyAsBytes(HttpResponse httpResponse, Continuation<? super byte[]> continuation) {
        HttpResponseKt$bodyAsBytes$1 httpResponseKt$bodyAsBytes$1;
        Object obj;
        int i;
        KType kType;
        if (continuation instanceof HttpResponseKt$bodyAsBytes$1) {
            httpResponseKt$bodyAsBytes$1 = (HttpResponseKt$bodyAsBytes$1) continuation;
            if ((httpResponseKt$bodyAsBytes$1.label & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsBytes$1.label -= Integer.MIN_VALUE;
                obj = httpResponseKt$bodyAsBytes$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpResponseKt$bodyAsBytes$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpClientCall call = httpResponse.getCall();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
                    try {
                        kType = Reflection.typeOf(byte[].class);
                    } catch (Throwable unused) {
                        kType = null;
                    }
                    TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
                    httpResponseKt$bodyAsBytes$1.label = 1;
                    obj = call.bodyNullable(typeInfo, httpResponseKt$bodyAsBytes$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return (byte[]) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
            }
        }
        httpResponseKt$bodyAsBytes$1 = new HttpResponseKt$bodyAsBytes$1(continuation);
        obj = httpResponseKt$bodyAsBytes$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpResponseKt$bodyAsBytes$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }
}
