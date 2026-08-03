package com.inmobi.media;

/* loaded from: classes5.dex */
public final class B4 {

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.Interceptor[] f4613a;
    public final okhttp3.OkHttpClient b;
    public final long c;

    public B4(okhttp3.Interceptor[] interceptorArr, okhttp3.Interceptor[] interceptorArr2, okhttp3.Dispatcher dispatcher, com.inmobi.media.Gk timeoutConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f4613a = interceptorArr2;
        this.c = timeoutConfig.c;
        okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
        if (interceptorArr != null) {
            for (okhttp3.Interceptor interceptor : interceptorArr) {
                builder.addInterceptor(interceptor);
            }
        }
        okhttp3.Interceptor[] interceptorArr3 = this.f4613a;
        if (interceptorArr3 != null) {
            for (okhttp3.Interceptor interceptor2 : interceptorArr3) {
                builder.addNetworkInterceptor(interceptor2);
            }
        }
        builder.addInterceptor(new com.inmobi.media.Mi());
        builder.addNetworkInterceptor(new com.inmobi.media.C2405fc());
        builder.protocols(kotlin.collections.CollectionsKt.mutableListOf(okhttp3.Protocol.HTTP_2, okhttp3.Protocol.HTTP_1_1));
        builder.retryOnConnectionFailure(false);
        builder.dispatcher(dispatcher);
        long j = timeoutConfig.f4729a;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        builder.connectTimeout(j, timeUnit);
        builder.readTimeout(timeoutConfig.b, timeUnit);
        okhttp3.OkHttpClient build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.b = build;
    }

    public static kotlin.Pair a(com.inmobi.media.Ue ue) {
        okhttp3.RequestBody c2897y4;
        java.util.Set keySet;
        okhttp3.HttpUrl parse = okhttp3.HttpUrl.parse(ue.c());
        if (parse == null) {
            ue.c();
            return new kotlin.Pair(null, new com.inmobi.media.C2399f6(ue.c(), com.inmobi.media.EnumC2372e6.s));
        }
        okhttp3.Request.Builder url = new okhttp3.Request.Builder().url(parse);
        java.util.Map a2 = ue.a();
        if (a2 != null) {
            for (java.util.Map.Entry entry : a2.entrySet()) {
                url.addHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        java.util.Map a3 = ue.a();
        if (a3 != null && (keySet = a3.keySet()) != null && !keySet.isEmpty()) {
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) it.next(), com.google.common.net.HttpHeaders.USER_AGENT)) {
                    break;
                }
            }
        }
        url.addHeader(com.google.common.net.HttpHeaders.USER_AGENT, com.inmobi.media.Xi.c());
        com.inmobi.media.Ni b = ue.b();
        if (b != null) {
            url.tag(b);
        }
        if (ue instanceof com.inmobi.media.Re) {
            url.get();
        } else if (ue instanceof com.inmobi.media.Te) {
            try {
                com.inmobi.media.Hi hi = ((com.inmobi.media.Te) ue).d;
                if (hi == null) {
                    c2897y4 = okhttp3.RequestBody.create((okhttp3.MediaType) null, new byte[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(c2897y4);
                } else {
                    c2897y4 = new com.inmobi.media.C2897y4(hi);
                }
                url.post(c2897y4);
            } catch (java.io.FileNotFoundException e) {
                java.util.Objects.toString(e.getStackTrace());
                return new kotlin.Pair(url.build(), new com.inmobi.media.C2399f6(((com.inmobi.media.Te) ue).f4976a, com.inmobi.media.EnumC2372e6.m));
            } catch (java.io.IOException e2) {
                java.util.Objects.toString(e2.getStackTrace());
                return new kotlin.Pair(url.build(), new com.inmobi.media.C2399f6(((com.inmobi.media.Te) ue).f4976a, com.inmobi.media.EnumC2372e6.e));
            } catch (java.lang.Exception e3) {
                java.util.Objects.toString(e3.getStackTrace());
                return new kotlin.Pair(url.build(), new com.inmobi.media.C2399f6(((com.inmobi.media.Te) ue).f4976a, com.inmobi.media.EnumC2372e6.d));
            }
        } else {
            if (!(ue instanceof com.inmobi.media.Se)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            url.head();
        }
        return new kotlin.Pair(url.build(), null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(17:(2:3|(18:5|6|7|(1:(3:10|11|12)(2:97|98))(7:99|100|101|102|103|104|(1:106)(1:107))|13|15|16|(1:45)|22|(1:24)(1:44)|25|(1:29)|30|(1:32)(1:43)|33|(2:41|42)(1:37)|38|39))|15|16|(1:18)|45|22|(0)(0)|25|(2:27|29)|30|(0)(0)|33|(1:35)|41|42|38|39)|136|6|7|(0)(0)|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0032, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0044, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[Catch: all -> 0x0112, Exception -> 0x0114, IOException -> 0x0116, NoSuchElementException -> 0x0118, SocketTimeoutException -> 0x011a, MalformedURLException -> 0x011c, CancellationException -> 0x011e, TimeoutCancellationException -> 0x0120, TryCatch #7 {MalformedURLException -> 0x011c, SocketTimeoutException -> 0x011a, IOException -> 0x0116, NoSuchElementException -> 0x0118, TimeoutCancellationException -> 0x0120, CancellationException -> 0x011e, Exception -> 0x0114, all -> 0x0112, blocks: (B:16:0x0077, B:18:0x0081, B:20:0x0087, B:22:0x008f, B:24:0x009f, B:25:0x00a5, B:27:0x00ab, B:29:0x00b1, B:30:0x00b5, B:33:0x00c8, B:37:0x00e2, B:41:0x00f1, B:45:0x008d), top: B:15:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(okhttp3.OkHttpClient okHttpClient, okhttp3.Request request, java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2922z4 c2922z4;
        int i;
        okhttp3.Response response;
        java.lang.String str2;
        java.lang.String str3;
        long millis;
        com.inmobi.media.A4 a4;
        okhttp3.Response response2;
        okhttp3.Response response3;
        okhttp3.Response response4;
        okhttp3.Response response5;
        okhttp3.Response response6;
        okhttp3.Response response7;
        okhttp3.Response response8;
        int code;
        okhttp3.ResponseBody body;
        okhttp3.ResponseBody body2;
        java.lang.String str4;
        int code2;
        java.lang.Object we;
        okhttp3.MediaType mediaType;
        okio.BufferedSource source;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2922z4) {
                c2922z4 = (com.inmobi.media.C2922z4) continuationImpl;
                int i2 = c2922z4.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2922z4.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2922z4.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2922z4.d;
                    response = null;
                    str4 = null;
                    str4 = null;
                    response7 = null;
                    response6 = null;
                    response5 = null;
                    response4 = null;
                    response3 = null;
                    response2 = null;
                    response7 = null;
                    response6 = null;
                    response5 = null;
                    response4 = null;
                    response3 = null;
                    response2 = null;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(this.c);
                            a4 = new com.inmobi.media.A4(okHttpClient, request, null);
                            str2 = str;
                        } catch (java.net.MalformedURLException e) {
                            e = e;
                            str2 = str;
                        } catch (java.net.SocketTimeoutException e2) {
                            e = e2;
                            str2 = str;
                        } catch (java.io.IOException e3) {
                            e = e3;
                            str2 = str;
                        } catch (java.util.NoSuchElementException e4) {
                            e = e4;
                            str2 = str;
                        } catch (kotlinx.coroutines.TimeoutCancellationException e5) {
                            e = e5;
                            str2 = str;
                        } catch (java.lang.Exception e6) {
                            e = e6;
                            str2 = str;
                        }
                        try {
                            c2922z4.f5582a = str2;
                            c2922z4.d = 1;
                            obj = kotlinx.coroutines.TimeoutKt.withTimeout(millis, a4, c2922z4);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str3 = str2;
                        } catch (java.net.MalformedURLException e7) {
                            e = e7;
                            str3 = str2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f6 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.p);
                            if (response7 != null) {
                            }
                            return c2399f6;
                        } catch (java.net.SocketTimeoutException e8) {
                            e = e8;
                            str3 = str2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f62 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.t);
                            if (response6 != null) {
                            }
                            return c2399f62;
                        } catch (java.io.IOException e9) {
                            e = e9;
                            str3 = str2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f63 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.e);
                            if (response5 != null) {
                            }
                            return c2399f63;
                        } catch (java.util.NoSuchElementException e10) {
                            e = e10;
                            str3 = str2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f64 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.q);
                            if (response4 != null) {
                            }
                            return c2399f64;
                        } catch (kotlinx.coroutines.TimeoutCancellationException e11) {
                            e = e11;
                            str3 = str2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f65 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.r);
                            if (response3 != null) {
                            }
                            return c2399f65;
                        } catch (java.lang.Exception e12) {
                            e = e12;
                            str3 = str2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f66 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.d);
                            if (response2 != null) {
                            }
                            return c2399f66;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = c2922z4.f5582a;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.net.MalformedURLException e13) {
                            e = e13;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f67 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.p);
                            if (response7 != null) {
                                response7.close();
                            }
                            return c2399f67;
                        } catch (java.net.SocketTimeoutException e14) {
                            e = e14;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f622 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.t);
                            if (response6 != null) {
                                response6.close();
                            }
                            return c2399f622;
                        } catch (java.io.IOException e15) {
                            e = e15;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f632 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.e);
                            if (response5 != null) {
                                response5.close();
                            }
                            return c2399f632;
                        } catch (java.util.NoSuchElementException e16) {
                            e = e16;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f642 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.q);
                            if (response4 != null) {
                                response4.close();
                            }
                            return c2399f642;
                        } catch (kotlinx.coroutines.TimeoutCancellationException e17) {
                            e = e17;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f652 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.r);
                            if (response3 != null) {
                                response3.close();
                            }
                            return c2399f652;
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
                            com.inmobi.media.C2399f6 c2399f662 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.d);
                            if (response2 != null) {
                                response2.close();
                            }
                            return c2399f662;
                        }
                    }
                    response8 = (okhttp3.Response) obj;
                    code = response8.code();
                    body = response8.body();
                    if (body != null || (source = body.getSource()) == null || (r4 = source.readByteString()) == null) {
                        okio.ByteString byteString = okio.ByteString.EMPTY;
                    }
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap = response8.headers().toMultimap();
                    okhttp3.ResponseBody body3 = response8.body();
                    long contentLength = body3 == null ? body3.getContentLength() : 0L;
                    body2 = response8.body();
                    if (body2 != null && (mediaType = body2.get$contentType()) != null) {
                        str4 = mediaType.getMediaType();
                    }
                    long receivedResponseAtMillis = response8.receivedResponseAtMillis() - response8.sentRequestAtMillis();
                    long j = receivedResponseAtMillis >= 0 ? 0L : receivedResponseAtMillis;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(multimap);
                    com.inmobi.media.Qe qe = new com.inmobi.media.Qe(j, multimap, (int) contentLength, str4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response8, "<this>");
                    code2 = response8.code();
                    if (400 <= code2 || code2 >= 600) {
                        we = new com.inmobi.media.We(str3, code, byteString, qe);
                    } else {
                        com.inmobi.media.EnumC2372e6.b.getClass();
                        we = new com.inmobi.media.C2399f6(str3, com.inmobi.media.C2320c6.a(code));
                    }
                    response8.close();
                    return we;
                }
            }
            code = response8.code();
            body = response8.body();
            if (body != null) {
            }
            okio.ByteString byteString2 = okio.ByteString.EMPTY;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> multimap2 = response8.headers().toMultimap();
            okhttp3.ResponseBody body32 = response8.body();
            if (body32 == null) {
            }
            body2 = response8.body();
            if (body2 != null) {
                str4 = mediaType.getMediaType();
            }
            long receivedResponseAtMillis2 = response8.receivedResponseAtMillis() - response8.sentRequestAtMillis();
            if (receivedResponseAtMillis2 >= 0) {
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(multimap2);
            com.inmobi.media.Qe qe2 = new com.inmobi.media.Qe(j, multimap2, (int) contentLength, str4);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response8, "<this>");
            code2 = response8.code();
            if (400 <= code2) {
            }
            we = new com.inmobi.media.We(str3, code, byteString2, qe2);
            response8.close();
            return we;
        } catch (java.net.MalformedURLException e19) {
            e = e19;
            response7 = response8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
            com.inmobi.media.C2399f6 c2399f672 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.p);
            if (response7 != null) {
            }
            return c2399f672;
        } catch (java.net.SocketTimeoutException e20) {
            e = e20;
            response6 = response8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
            com.inmobi.media.C2399f6 c2399f6222 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.t);
            if (response6 != null) {
            }
            return c2399f6222;
        } catch (java.io.IOException e21) {
            e = e21;
            response5 = response8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
            com.inmobi.media.C2399f6 c2399f6322 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.e);
            if (response5 != null) {
            }
            return c2399f6322;
        } catch (java.util.NoSuchElementException e22) {
            e = e22;
            response4 = response8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
            com.inmobi.media.C2399f6 c2399f6422 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.q);
            if (response4 != null) {
            }
            return c2399f6422;
        } catch (kotlinx.coroutines.TimeoutCancellationException e23) {
            e = e23;
            response3 = response8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
            com.inmobi.media.C2399f6 c2399f6522 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.r);
            if (response3 != null) {
            }
            return c2399f6522;
        } catch (java.util.concurrent.CancellationException e24) {
            e = e24;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
            throw e;
        } catch (java.lang.Exception e25) {
            e = e25;
            response2 = response8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.util.Arrays.toString(e.getStackTrace()), "toString(...)");
            com.inmobi.media.C2399f6 c2399f6622 = new com.inmobi.media.C2399f6(str3, com.inmobi.media.EnumC2372e6.d);
            if (response2 != null) {
            }
            return c2399f6622;
        } catch (java.lang.Throwable th) {
            th = th;
            response = response8;
            if (response != null) {
                response.close();
            }
            throw th;
        }
        c2922z4 = new com.inmobi.media.C2922z4(this, continuationImpl);
        java.lang.Object obj2 = c2922z4.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2922z4.d;
        response = null;
        str4 = null;
        str4 = null;
        response7 = null;
        response6 = null;
        response5 = null;
        response4 = null;
        response3 = null;
        response2 = null;
        response7 = null;
        response6 = null;
        response5 = null;
        response4 = null;
        response3 = null;
        response2 = null;
        if (i != 0) {
        }
        response8 = (okhttp3.Response) obj2;
    }

    public final java.lang.Object a(com.inmobi.media.Ue ue, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        okhttp3.OkHttpClient okHttpClient = this.b;
        kotlin.Pair a2 = a(ue);
        okhttp3.Request request = (okhttp3.Request) a2.component1();
        com.inmobi.media.C2399f6 c2399f6 = (com.inmobi.media.C2399f6) a2.component2();
        if (c2399f6 != null || request == null) {
            return c2399f6 != null ? c2399f6 : new com.inmobi.media.C2399f6(ue.c(), com.inmobi.media.EnumC2372e6.d);
        }
        return a(okHttpClient, request, ue.c(), continuationImpl);
    }
}
