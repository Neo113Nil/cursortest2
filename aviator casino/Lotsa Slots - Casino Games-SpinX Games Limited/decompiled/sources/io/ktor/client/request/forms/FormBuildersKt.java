package io.ktor.client.request.forms;

/* compiled from: formBuilders.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086H¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\u000b\u0010\u000f\u001a=\u0010\u0013\u001a\u00020\n*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086H¢\u0006\u0004\b\u0013\u0010\u0014\u001aE\u0010\u0013\u001a\u00020\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086H¢\u0006\u0004\b\u0013\u0010\u0015\u001aC\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086H¢\u0006\u0004\b\u0017\u0010\f\u001aK\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\u0017\u0010\u000f\u001a=\u0010\u0018\u001a\u00020\u0016*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0019\b\u0006\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086H¢\u0006\u0004\b\u0018\u0010\u0014\u001aE\u0010\u0018\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0019\b\u0006\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086H¢\u0006\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lio/ktor/client/HttpClient;", "Lio/ktor/http/Parameters;", "formParameters", "", "encodeInQuery", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/statement/HttpResponse;", "submitForm", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Parameters;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lio/ktor/http/Parameters;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lio/ktor/http/content/PartData;", "formData", "submitFormWithBinaryData", "(Lio/ktor/client/HttpClient;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpStatement;", "prepareForm", "prepareFormWithBinaryData", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormBuildersKt {
    public static /* synthetic */ java.lang.Object submitForm$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            parameters = io.ktor.http.Parameters.INSTANCE.getEmpty();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.forms.FormBuildersKt$submitForm$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        if (z) {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            io.ktor.client.request.forms.FormDataContent formDataContent = new io.ktor.client.request.forms.FormDataContent(parameters);
            kotlin.reflect.KType kType = null;
            if (formDataContent instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(formDataContent);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(formDataContent);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.FormDataContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.FormDataContent.class);
                } catch (java.lang.Throwable unused) {
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
            }
        }
        function1.invoke(httpRequestBuilder);
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object execute = httpStatement.execute(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return execute;
    }

    public static /* synthetic */ java.lang.Object submitForm$default(io.ktor.client.HttpClient httpClient, java.lang.String str, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            parameters = io.ktor.http.Parameters.INSTANCE.getEmpty();
        }
        io.ktor.http.Parameters parameters2 = parameters;
        boolean z2 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.forms.FormBuildersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit submitForm$lambda$1;
                    submitForm$lambda$1 = io.ktor.client.request.forms.FormBuildersKt.submitForm$lambda$1((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return submitForm$lambda$1;
                }
            };
        }
        return submitForm(httpClient, str, parameters2, z2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit submitForm$lambda$1(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object submitFormWithBinaryData$default(io.ktor.client.HttpClient httpClient, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.forms.FormBuildersKt$submitFormWithBinaryData$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        function1.invoke(httpRequestBuilder);
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object execute = httpStatement.execute(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return execute;
    }

    public static /* synthetic */ java.lang.Object submitFormWithBinaryData$default(io.ktor.client.HttpClient httpClient, java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.forms.FormBuildersKt$submitFormWithBinaryData$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object execute = httpStatement.execute(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return execute;
    }

    public static /* synthetic */ java.lang.Object prepareForm$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            parameters = io.ktor.http.Parameters.INSTANCE.getEmpty();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.forms.FormBuildersKt$prepareForm$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        if (z) {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            io.ktor.client.request.forms.FormDataContent formDataContent = new io.ktor.client.request.forms.FormDataContent(parameters);
            kotlin.reflect.KType kType = null;
            if (formDataContent instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(formDataContent);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(formDataContent);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.FormDataContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.FormDataContent.class);
                } catch (java.lang.Throwable unused) {
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
            }
        }
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object prepareForm$default(io.ktor.client.HttpClient httpClient, java.lang.String str, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            parameters = io.ktor.http.Parameters.INSTANCE.getEmpty();
        }
        io.ktor.http.Parameters parameters2 = parameters;
        boolean z2 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.forms.FormBuildersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit prepareForm$lambda$6;
                    prepareForm$lambda$6 = io.ktor.client.request.forms.FormBuildersKt.prepareForm$lambda$6((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return prepareForm$lambda$6;
                }
            };
        }
        return prepareForm(httpClient, str, parameters2, z2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit prepareForm$lambda$6(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object prepareFormWithBinaryData$default(io.ktor.client.HttpClient httpClient, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.forms.FormBuildersKt$prepareFormWithBinaryData$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object prepareFormWithBinaryData$default(io.ktor.client.HttpClient httpClient, java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.forms.FormBuildersKt$prepareFormWithBinaryData$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object submitForm(io.ktor.client.HttpClient httpClient, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        if (z) {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            io.ktor.client.request.forms.FormDataContent formDataContent = new io.ktor.client.request.forms.FormDataContent(parameters);
            kotlin.reflect.KType kType = null;
            if (formDataContent instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(formDataContent);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(formDataContent);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.FormDataContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.FormDataContent.class);
                } catch (java.lang.Throwable unused) {
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
            }
        }
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    private static final java.lang.Object submitForm$$forInline(io.ktor.client.HttpClient httpClient, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        if (z) {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            io.ktor.client.request.forms.FormDataContent formDataContent = new io.ktor.client.request.forms.FormDataContent(parameters);
            kotlin.reflect.KType kType = null;
            if (formDataContent instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(formDataContent);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(formDataContent);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.FormDataContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.FormDataContent.class);
                } catch (java.lang.Throwable unused) {
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
            }
        }
        function1.invoke(httpRequestBuilder);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object execute = httpStatement.execute(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return execute;
    }

    public static final java.lang.Object submitForm(io.ktor.client.HttpClient httpClient, java.lang.String str, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        if (z) {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            io.ktor.client.request.forms.FormDataContent formDataContent = new io.ktor.client.request.forms.FormDataContent(parameters);
            kotlin.reflect.KType kType = null;
            if (formDataContent instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(formDataContent);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(formDataContent);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.FormDataContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.FormDataContent.class);
                } catch (java.lang.Throwable unused) {
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
            }
        }
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object submitFormWithBinaryData(io.ktor.client.HttpClient httpClient, java.util.List<? extends io.ktor.http.content.PartData> list, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    private static final java.lang.Object submitFormWithBinaryData$$forInline(io.ktor.client.HttpClient httpClient, java.util.List<? extends io.ktor.http.content.PartData> list, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        function1.invoke(httpRequestBuilder);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object execute = httpStatement.execute(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return execute;
    }

    public static final java.lang.Object submitFormWithBinaryData(io.ktor.client.HttpClient httpClient, java.lang.String str, java.util.List<? extends io.ktor.http.content.PartData> list, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    private static final java.lang.Object submitFormWithBinaryData$$forInline(io.ktor.client.HttpClient httpClient, java.lang.String str, java.util.List<? extends io.ktor.http.content.PartData> list, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object execute = httpStatement.execute(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return execute;
    }

    public static final java.lang.Object prepareForm(io.ktor.client.HttpClient httpClient, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        if (z) {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            io.ktor.client.request.forms.FormDataContent formDataContent = new io.ktor.client.request.forms.FormDataContent(parameters);
            kotlin.reflect.KType kType = null;
            if (formDataContent instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(formDataContent);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(formDataContent);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.FormDataContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.FormDataContent.class);
                } catch (java.lang.Throwable unused) {
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
            }
        }
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final java.lang.Object prepareForm$$forInline(io.ktor.client.HttpClient httpClient, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        if (z) {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            io.ktor.client.request.forms.FormDataContent formDataContent = new io.ktor.client.request.forms.FormDataContent(parameters);
            kotlin.reflect.KType kType = null;
            if (formDataContent instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(formDataContent);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(formDataContent);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.FormDataContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.FormDataContent.class);
                } catch (java.lang.Throwable unused) {
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
            }
        }
        function1.invoke(httpRequestBuilder);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareForm(io.ktor.client.HttpClient httpClient, java.lang.String str, io.ktor.http.Parameters parameters, boolean z, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        if (z) {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
            io.ktor.client.request.forms.FormDataContent formDataContent = new io.ktor.client.request.forms.FormDataContent(parameters);
            kotlin.reflect.KType kType = null;
            if (formDataContent instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(formDataContent);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(formDataContent);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.FormDataContent.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.FormDataContent.class);
                } catch (java.lang.Throwable unused) {
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
            }
        }
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareFormWithBinaryData(io.ktor.client.HttpClient httpClient, java.util.List<? extends io.ktor.http.content.PartData> list, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final java.lang.Object prepareFormWithBinaryData$$forInline(io.ktor.client.HttpClient httpClient, java.util.List<? extends io.ktor.http.content.PartData> list, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        function1.invoke(httpRequestBuilder);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareFormWithBinaryData(io.ktor.client.HttpClient httpClient, java.lang.String str, java.util.List<? extends io.ktor.http.content.PartData> list, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final java.lang.Object prepareFormWithBinaryData$$forInline(io.ktor.client.HttpClient httpClient, java.lang.String str, java.util.List<? extends io.ktor.http.content.PartData> list, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent = new io.ktor.client.request.forms.MultiPartFormDataContent(list, null, null, 6, null);
        kotlin.reflect.KType kType = null;
        if (multiPartFormDataContent instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(multiPartFormDataContent);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            try {
                kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.forms.MultiPartFormDataContent.class);
            } catch (java.lang.Throwable unused) {
            }
            httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        }
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }
}
