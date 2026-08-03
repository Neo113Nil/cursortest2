package io.ktor.client.statement;

/* compiled from: HttpResponse.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\b\u001a\u00020\u0007*\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000e\u0010\f\"\u001e\u0010\u0012\u001a\u00020\n*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0016\u001a\u00020\u0013*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "", "complete", "(Lio/ktor/client/statement/HttpResponse;)V", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "fallbackCharset", "", "bodyAsText", "(Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "bodyAsChannel", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "bodyAsBytes", "getContent", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/utils/io/ByteReadChannel;", "getContent$annotations", "content", "Lio/ktor/client/request/HttpRequest;", "getRequest", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/client/request/HttpRequest;", "request", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpResponseKt {
    @kotlin.Deprecated(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @kotlin.ReplaceWith(expression = "readRawBytes()", imports = {}))
    public static /* synthetic */ void getContent$annotations(io.ktor.client.statement.HttpResponse httpResponse) {
    }

    public static final io.ktor.utils.io.ByteReadChannel getContent(io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getRawContent();
    }

    public static final io.ktor.client.request.HttpRequest getRequest(io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getRequest();
    }

    public static final void complete(io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        kotlinx.coroutines.Job job = kotlinx.coroutines.JobKt.getJob(httpResponse.getCoroutineContext());
        kotlin.jvm.internal.Intrinsics.checkNotNull(job, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((kotlinx.coroutines.CompletableJob) job).complete();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object bodyAsText(io.ktor.client.statement.HttpResponse httpResponse, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        io.ktor.client.statement.HttpResponseKt$bodyAsText$1 httpResponseKt$bodyAsText$1;
        java.lang.Object obj;
        int i;
        kotlin.reflect.KType kType;
        java.nio.charset.CharsetDecoder charsetDecoder;
        if (continuation instanceof io.ktor.client.statement.HttpResponseKt$bodyAsText$1) {
            httpResponseKt$bodyAsText$1 = (io.ktor.client.statement.HttpResponseKt$bodyAsText$1) continuation;
            if ((httpResponseKt$bodyAsText$1.label & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsText$1.label -= Integer.MIN_VALUE;
                obj = httpResponseKt$bodyAsText$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpResponseKt$bodyAsText$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.nio.charset.Charset charset2 = io.ktor.http.HttpMessagePropertiesKt.charset(httpResponse);
                    if (charset2 != null) {
                        charset = charset2;
                    }
                    java.nio.charset.CharsetDecoder newDecoder = charset.newDecoder();
                    io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.io.Source.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(kotlinx.io.Source.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
                    httpResponseKt$bodyAsText$1.L$0 = newDecoder;
                    httpResponseKt$bodyAsText$1.label = 1;
                    obj = call.bodyNullable(typeInfo, httpResponseKt$bodyAsText$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    charsetDecoder = newDecoder;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charsetDecoder = (java.nio.charset.CharsetDecoder) httpResponseKt$bodyAsText$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(charsetDecoder);
                    return io.ktor.utils.io.charsets.EncodingKt.decode$default(charsetDecoder, (kotlinx.io.Source) obj, 0, 2, null);
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
            }
        }
        httpResponseKt$bodyAsText$1 = new io.ktor.client.statement.HttpResponseKt$bodyAsText$1(continuation);
        obj = httpResponseKt$bodyAsText$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpResponseKt$bodyAsText$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    public static /* synthetic */ java.lang.Object bodyAsText$default(io.ktor.client.statement.HttpResponse httpResponse, java.nio.charset.Charset charset, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
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
    public static final java.lang.Object bodyAsChannel(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannel> continuation) {
        io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1 httpResponseKt$bodyAsChannel$1;
        java.lang.Object obj;
        int i;
        kotlin.reflect.KType kType;
        if (continuation instanceof io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1) {
            httpResponseKt$bodyAsChannel$1 = (io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1) continuation;
            if ((httpResponseKt$bodyAsChannel$1.label & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsChannel$1.label -= Integer.MIN_VALUE;
                obj = httpResponseKt$bodyAsChannel$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpResponseKt$bodyAsChannel$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.utils.io.ByteReadChannel.class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.utils.io.ByteReadChannel.class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
                    httpResponseKt$bodyAsChannel$1.label = 1;
                    obj = call.bodyNullable(typeInfo, httpResponseKt$bodyAsChannel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return (io.ktor.utils.io.ByteReadChannel) obj;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
            }
        }
        httpResponseKt$bodyAsChannel$1 = new io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1(continuation);
        obj = httpResponseKt$bodyAsChannel$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
    public static final java.lang.Object bodyAsBytes(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1 httpResponseKt$bodyAsBytes$1;
        java.lang.Object obj;
        int i;
        kotlin.reflect.KType kType;
        if (continuation instanceof io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1) {
            httpResponseKt$bodyAsBytes$1 = (io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1) continuation;
            if ((httpResponseKt$bodyAsBytes$1.label & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsBytes$1.label -= Integer.MIN_VALUE;
                obj = httpResponseKt$bodyAsBytes$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpResponseKt$bodyAsBytes$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class);
                    try {
                        kType = kotlin.jvm.internal.Reflection.typeOf(byte[].class);
                    } catch (java.lang.Throwable unused) {
                        kType = null;
                    }
                    io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
                    httpResponseKt$bodyAsBytes$1.label = 1;
                    obj = call.bodyNullable(typeInfo, httpResponseKt$bodyAsBytes$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return (byte[]) obj;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
            }
        }
        httpResponseKt$bodyAsBytes$1 = new io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1(continuation);
        obj = httpResponseKt$bodyAsBytes$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpResponseKt$bodyAsBytes$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }
}
