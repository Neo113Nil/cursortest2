package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a7\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\f\u0010\n\u001a7\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\r\u0010\n\u001a7\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u000e\u0010\n\u001a7\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u000f\u0010\n\u001a7\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0010\u0010\n\u001a7\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0011\u0010\n\u001a7\u0010\u0012\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0012\u0010\n\u001a7\u0010\u0013\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0013\u0010\n\u001a7\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0014\u0010\n\u001a7\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0015\u0010\n\u001a7\u0010\u0016\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0016\u0010\n\u001a7\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0017\u0010\n\u001a7\u0010\u0018\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086H¢\u0006\u0004\b\u0018\u0010\n\u001a\u0019\u0010\u0002\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0019"}, d2 = {"Lio/ktor/client/HttpClient;", "Lio/ktor/http/Url;", "url", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/statement/HttpResponse;", "get", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpStatement;", "prepareGet", "post", "preparePost", "put", "preparePut", "patch", "preparePatch", "options", "prepareOptions", "head", "prepareHead", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "prepareDelete", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/Url;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuildersWithUrlKt {
    public static /* synthetic */ java.lang.Object get$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$get$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object prepareGet$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$prepareGet$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object post$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$post$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object preparePost$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$preparePost$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object put$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$put$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object preparePut$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$preparePut$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object patch$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$patch$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object preparePatch$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$preparePatch$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object options$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$options$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object prepareOptions$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$prepareOptions$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object head$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$head$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object prepareHead$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$prepareHead$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object delete$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$delete$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object prepareDelete$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersWithUrlKt$prepareDelete$2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final void url(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
    }

    public static final java.lang.Object get(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareGet(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object post(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object preparePost(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object put(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object preparePut(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object patch(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object preparePatch(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object options(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareOptions(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object head(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareHead(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object delete(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareDelete(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }
}
