package com.inmobi.media;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Y4 {

    /* renamed from: a, reason: collision with root package name */
    public final Interceptor[] f6964a;
    public final OkHttpClient b;
    public final long c;

    public Y4(Interceptor[] interceptorArr, Interceptor[] interceptorArr2, Dispatcher dispatcher, Cm timeoutConfig) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f6964a = interceptorArr2;
        this.c = timeoutConfig.c;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (interceptorArr != null) {
            for (Interceptor interceptor : interceptorArr) {
                builder.addInterceptor(interceptor);
            }
        }
        Interceptor[] interceptorArr3 = this.f6964a;
        if (interceptorArr3 != null) {
            for (Interceptor interceptor2 : interceptorArr3) {
                builder.addNetworkInterceptor(interceptor2);
            }
        }
        builder.addInterceptor(new C3602bk());
        builder.addNetworkInterceptor(new Xc());
        builder.protocols(CollectionsKt.mutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1));
        builder.retryOnConnectionFailure(false);
        builder.dispatcher(dispatcher);
        long j = timeoutConfig.f6499a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j, timeUnit);
        builder.readTimeout(timeoutConfig.b, timeUnit);
        OkHttpClient build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.b = build;
    }

    public static Pair a(Nf nf) {
        RequestBody v4;
        Set keySet;
        HttpUrl parse = HttpUrl.parse(nf.c());
        if (parse == null) {
            String str = "Invalid URL: " + nf.c();
            return new Pair(null, new C6(nf.c(), B6.s));
        }
        Request.Builder url = new Request.Builder().url(parse);
        Map a2 = nf.a();
        if (a2 != null) {
            for (Map.Entry entry : a2.entrySet()) {
                url.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map a3 = nf.a();
        if (a3 != null && (keySet = a3.keySet()) != null && !keySet.isEmpty()) {
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), "User-Agent")) {
                    break;
                }
            }
        }
        url.addHeader("User-Agent", AbstractC3914mk.b());
        C3631ck b = nf.b();
        if (b != null) {
            url.tag(b);
        }
        if (nf instanceof Kf) {
            url.get();
        } else if (nf instanceof Mf) {
            try {
                Wj wj = ((Mf) nf).d;
                if (wj == null) {
                    v4 = RequestBody.create((MediaType) null, new byte[0]);
                    Intrinsics.checkNotNull(v4);
                } else {
                    v4 = new V4(wj);
                }
                url.post(v4);
            } catch (FileNotFoundException e) {
                String str2 = "File not found. " + e.getStackTrace();
                return new Pair(url.build(), new C6(((Mf) nf).f6718a, B6.m));
            } catch (IOException e2) {
                String str3 = "IO Exception " + e2.getStackTrace();
                return new Pair(url.build(), new C6(((Mf) nf).f6718a, B6.e));
            } catch (Exception e3) {
                String str4 = "Exception " + e3.getStackTrace();
                return new Pair(url.build(), new C6(((Mf) nf).f6718a, B6.d));
            }
        } else {
            if (!(nf instanceof Lf)) {
                throw new NoWhenBranchMatchedException();
            }
            url.head();
        }
        return new Pair(url.build(), null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(9:(2:3|(21:5|6|7|(1:(4:10|11|12|13)(2:136|137))(10:138|139|140|141|142|143|144|145|146|(1:148))|14|56|57|(1:103)|63|(1:65)(1:102)|66|(1:70)|71|(1:73)(1:101)|74|75|76|77|(2:87|88)(3:81|82|83)|84|85))|75|76|77|(1:79)|87|88|84|85)|178|6|7|(0)(0)|14|56|57|(1:59)|103|63|(0)(0)|66|(2:68|70)|71|(0)(0)|74|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(12:(9:(2:3|(21:5|6|7|(1:(4:10|11|12|13)(2:136|137))(10:138|139|140|141|142|143|144|145|146|(1:148))|14|56|57|(1:103)|63|(1:65)(1:102)|66|(1:70)|71|(1:73)(1:101)|74|75|76|77|(2:87|88)(3:81|82|83)|84|85))|75|76|77|(1:79)|87|88|84|85)|56|57|(1:59)|103|63|(0)(0)|66|(2:68|70)|71|(0)(0)|74)|178|6|7|(0)(0)|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x013f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x013d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0139, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x013b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0143, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0141, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0042, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x024b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x005e, code lost:
    
        r9 = "toString(...)";
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc A[Catch: all -> 0x0135, Exception -> 0x0137, IOException -> 0x0139, NoSuchElementException -> 0x013b, SocketTimeoutException -> 0x013d, MalformedURLException -> 0x013f, CancellationException -> 0x0141, TimeoutCancellationException -> 0x0143, TryCatch #37 {Exception -> 0x0137, all -> 0x0135, blocks: (B:57:0x0094, B:59:0x009e, B:61:0x00a4, B:63:0x00ac, B:65:0x00bc, B:66:0x00c2, B:68:0x00c8, B:70:0x00ce, B:71:0x00d2, B:74:0x00e9, B:76:0x00f3, B:81:0x0104, B:82:0x0108, B:83:0x010f, B:87:0x0113, B:103:0x00aa), top: B:56:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OkHttpClient okHttpClient, Request request, String str, ContinuationImpl continuationImpl) {
        W4 w4;
        int i;
        Response response;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Response response2;
        Response response3;
        Response response4;
        Response response5;
        Response response6;
        Response response7;
        Response response8;
        int code;
        ResponseBody body;
        ByteString byteString;
        ResponseBody body2;
        String str9;
        Jf jf;
        int code2;
        Object pf;
        MediaType mediaType;
        BufferedSource source;
        try {
            try {
                if (continuationImpl instanceof W4) {
                    w4 = (W4) continuationImpl;
                    int i2 = w4.d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        w4.d = i2 - Integer.MIN_VALUE;
                        Object obj = w4.b;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = w4.d;
                        response = null;
                        str9 = null;
                        str9 = null;
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
                        response7 = null;
                        response6 = null;
                        response5 = null;
                        response4 = null;
                        response3 = null;
                        response2 = null;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            try {
                                str3 = "toString(...)";
                                try {
                                    try {
                                        long millis = TimeUnit.SECONDS.toMillis(this.c);
                                        X4 x4 = new X4(okHttpClient, request, null);
                                        str2 = str;
                                        try {
                                            w4.f6923a = str2;
                                            w4.d = 1;
                                            obj = TimeoutKt.withTimeout(millis, x4, w4);
                                            if (obj == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } catch (MalformedURLException e) {
                                            e = e;
                                            str8 = str3;
                                            String arrays = Arrays.toString(e.getStackTrace());
                                            Intrinsics.checkNotNullExpressionValue(arrays, str8);
                                            String str10 = "Malformed URL " + arrays;
                                            C6 c6 = new C6(str2, B6.p);
                                            if (response7 != null) {
                                                response7.close();
                                            }
                                            return c6;
                                        } catch (SocketTimeoutException e2) {
                                            e = e2;
                                            str7 = str3;
                                            String arrays2 = Arrays.toString(e.getStackTrace());
                                            Intrinsics.checkNotNullExpressionValue(arrays2, str7);
                                            String str11 = "Socket timeout during request execution " + arrays2;
                                            C6 c62 = new C6(str2, B6.t);
                                            if (response6 != null) {
                                                response6.close();
                                            }
                                            return c62;
                                        } catch (IOException e3) {
                                            e = e3;
                                            str6 = str3;
                                            String arrays3 = Arrays.toString(e.getStackTrace());
                                            Intrinsics.checkNotNullExpressionValue(arrays3, str6);
                                            String str12 = "Network IO error " + arrays3;
                                            C6 c63 = new C6(str2, B6.e);
                                            if (response5 != null) {
                                                response5.close();
                                            }
                                            return c63;
                                        } catch (NoSuchElementException e4) {
                                            e = e4;
                                            str5 = str3;
                                            String arrays4 = Arrays.toString(e.getStackTrace());
                                            Intrinsics.checkNotNullExpressionValue(arrays4, str5);
                                            String str13 = "No routes available during request execution " + arrays4;
                                            C6 c64 = new C6(str2, B6.q);
                                            if (response4 != null) {
                                                response4.close();
                                            }
                                            return c64;
                                        } catch (TimeoutCancellationException e5) {
                                            e = e5;
                                            str4 = str3;
                                            String arrays5 = Arrays.toString(e.getStackTrace());
                                            Intrinsics.checkNotNullExpressionValue(arrays5, str4);
                                            String str14 = "Coroutine timeout during request execution " + arrays5;
                                            C6 c65 = new C6(str2, B6.r);
                                            if (response3 != null) {
                                                response3.close();
                                            }
                                            return c65;
                                        } catch (Exception e6) {
                                            e = e6;
                                            String arrays6 = Arrays.toString(e.getStackTrace());
                                            Intrinsics.checkNotNullExpressionValue(arrays6, str3);
                                            String str15 = "Unknown error during request execution " + arrays6;
                                            C6 c66 = new C6(str2, B6.d);
                                            if (response2 != null) {
                                            }
                                            return c66;
                                        }
                                    } catch (CancellationException e7) {
                                        e = e7;
                                        String str16 = str3;
                                        String arrays7 = Arrays.toString(e.getStackTrace());
                                        Intrinsics.checkNotNullExpressionValue(arrays7, str16);
                                        String str17 = "CancellationException " + arrays7;
                                        throw e;
                                    }
                                } catch (MalformedURLException e8) {
                                    e = e8;
                                    str2 = str;
                                    str8 = str3;
                                    String arrays8 = Arrays.toString(e.getStackTrace());
                                    Intrinsics.checkNotNullExpressionValue(arrays8, str8);
                                    String str102 = "Malformed URL " + arrays8;
                                    C6 c67 = new C6(str2, B6.p);
                                    if (response7 != null) {
                                    }
                                    return c67;
                                } catch (SocketTimeoutException e9) {
                                    e = e9;
                                    str2 = str;
                                    str7 = str3;
                                    String arrays22 = Arrays.toString(e.getStackTrace());
                                    Intrinsics.checkNotNullExpressionValue(arrays22, str7);
                                    String str112 = "Socket timeout during request execution " + arrays22;
                                    C6 c622 = new C6(str2, B6.t);
                                    if (response6 != null) {
                                    }
                                    return c622;
                                } catch (IOException e10) {
                                    e = e10;
                                    str2 = str;
                                    str6 = str3;
                                    String arrays32 = Arrays.toString(e.getStackTrace());
                                    Intrinsics.checkNotNullExpressionValue(arrays32, str6);
                                    String str122 = "Network IO error " + arrays32;
                                    C6 c632 = new C6(str2, B6.e);
                                    if (response5 != null) {
                                    }
                                    return c632;
                                } catch (NoSuchElementException e11) {
                                    e = e11;
                                    str2 = str;
                                    str5 = str3;
                                    String arrays42 = Arrays.toString(e.getStackTrace());
                                    Intrinsics.checkNotNullExpressionValue(arrays42, str5);
                                    String str132 = "No routes available during request execution " + arrays42;
                                    C6 c642 = new C6(str2, B6.q);
                                    if (response4 != null) {
                                    }
                                    return c642;
                                } catch (TimeoutCancellationException e12) {
                                    e = e12;
                                    str2 = str;
                                    str4 = str3;
                                    String arrays52 = Arrays.toString(e.getStackTrace());
                                    Intrinsics.checkNotNullExpressionValue(arrays52, str4);
                                    String str142 = "Coroutine timeout during request execution " + arrays52;
                                    C6 c652 = new C6(str2, B6.r);
                                    if (response3 != null) {
                                    }
                                    return c652;
                                } catch (Exception e13) {
                                    e = e13;
                                    str2 = str;
                                    String arrays62 = Arrays.toString(e.getStackTrace());
                                    Intrinsics.checkNotNullExpressionValue(arrays62, str3);
                                    String str152 = "Unknown error during request execution " + arrays62;
                                    C6 c662 = new C6(str2, B6.d);
                                    if (response2 != null) {
                                    }
                                    return c662;
                                }
                            } catch (MalformedURLException e14) {
                                e = e14;
                                str2 = str;
                                str8 = "toString(...)";
                                String arrays82 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays82, str8);
                                String str1022 = "Malformed URL " + arrays82;
                                C6 c672 = new C6(str2, B6.p);
                                if (response7 != null) {
                                }
                                return c672;
                            } catch (SocketTimeoutException e15) {
                                e = e15;
                                str2 = str;
                                str7 = "toString(...)";
                                String arrays222 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays222, str7);
                                String str1122 = "Socket timeout during request execution " + arrays222;
                                C6 c6222 = new C6(str2, B6.t);
                                if (response6 != null) {
                                }
                                return c6222;
                            } catch (IOException e16) {
                                e = e16;
                                str2 = str;
                                str6 = "toString(...)";
                                String arrays322 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays322, str6);
                                String str1222 = "Network IO error " + arrays322;
                                C6 c6322 = new C6(str2, B6.e);
                                if (response5 != null) {
                                }
                                return c6322;
                            } catch (NoSuchElementException e17) {
                                e = e17;
                                str2 = str;
                                str5 = "toString(...)";
                                String arrays422 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays422, str5);
                                String str1322 = "No routes available during request execution " + arrays422;
                                C6 c6422 = new C6(str2, B6.q);
                                if (response4 != null) {
                                }
                                return c6422;
                            } catch (TimeoutCancellationException e18) {
                                e = e18;
                                str2 = str;
                                str4 = "toString(...)";
                                String arrays522 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays522, str4);
                                String str1422 = "Coroutine timeout during request execution " + arrays522;
                                C6 c6522 = new C6(str2, B6.r);
                                if (response3 != null) {
                                }
                                return c6522;
                            } catch (Exception e19) {
                                e = e19;
                                str2 = str;
                                str3 = "toString(...)";
                                String arrays622 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays622, str3);
                                String str1522 = "Unknown error during request execution " + arrays622;
                                C6 c6622 = new C6(str2, B6.d);
                                if (response2 != null) {
                                }
                                return c6622;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str18 = w4.f6923a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                str2 = str18;
                                str3 = "toString(...)";
                            } catch (MalformedURLException e20) {
                                e = e20;
                                str2 = str18;
                                str8 = "toString(...)";
                                String arrays822 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays822, str8);
                                String str10222 = "Malformed URL " + arrays822;
                                C6 c6722 = new C6(str2, B6.p);
                                if (response7 != null) {
                                }
                                return c6722;
                            } catch (SocketTimeoutException e21) {
                                e = e21;
                                str2 = str18;
                                str7 = "toString(...)";
                                String arrays2222 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays2222, str7);
                                String str11222 = "Socket timeout during request execution " + arrays2222;
                                C6 c62222 = new C6(str2, B6.t);
                                if (response6 != null) {
                                }
                                return c62222;
                            } catch (IOException e22) {
                                e = e22;
                                str2 = str18;
                                str6 = "toString(...)";
                                String arrays3222 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays3222, str6);
                                String str12222 = "Network IO error " + arrays3222;
                                C6 c63222 = new C6(str2, B6.e);
                                if (response5 != null) {
                                }
                                return c63222;
                            } catch (NoSuchElementException e23) {
                                e = e23;
                                str2 = str18;
                                str5 = "toString(...)";
                                String arrays4222 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays4222, str5);
                                String str13222 = "No routes available during request execution " + arrays4222;
                                C6 c64222 = new C6(str2, B6.q);
                                if (response4 != null) {
                                }
                                return c64222;
                            } catch (TimeoutCancellationException e24) {
                                e = e24;
                                str2 = str18;
                                str4 = "toString(...)";
                                String arrays5222 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays5222, str4);
                                String str14222 = "Coroutine timeout during request execution " + arrays5222;
                                C6 c65222 = new C6(str2, B6.r);
                                if (response3 != null) {
                                }
                                return c65222;
                            } catch (Exception e25) {
                                e = e25;
                                str2 = str18;
                                str3 = "toString(...)";
                                String arrays6222 = Arrays.toString(e.getStackTrace());
                                Intrinsics.checkNotNullExpressionValue(arrays6222, str3);
                                String str15222 = "Unknown error during request execution " + arrays6222;
                                C6 c66222 = new C6(str2, B6.d);
                                if (response2 != null) {
                                }
                                return c66222;
                            }
                        }
                        response8 = (Response) obj;
                        code = response8.code();
                        body = response8.body();
                        if (body != null || (source = body.getSource()) == null || (byteString = source.readByteString()) == null) {
                            byteString = ByteString.EMPTY;
                        }
                        Map<String, List<String>> multimap = response8.headers().toMultimap();
                        ResponseBody body3 = response8.body();
                        long contentLength = body3 == null ? body3.getContentLength() : 0L;
                        body2 = response8.body();
                        if (body2 != null && (mediaType = body2.get$contentType()) != null) {
                            str9 = mediaType.getMediaType();
                        }
                        String str19 = str9;
                        long receivedResponseAtMillis = response8.receivedResponseAtMillis() - response8.sentRequestAtMillis();
                        long j = receivedResponseAtMillis >= 0 ? 0L : receivedResponseAtMillis;
                        Intrinsics.checkNotNull(multimap);
                        jf = new Jf(j, multimap, (int) contentLength, str19);
                        Intrinsics.checkNotNullParameter(response8, "<this>");
                        code2 = response8.code();
                        if (400 <= code2 || code2 >= 600) {
                            pf = new Pf(str2, code, byteString, jf);
                        } else {
                            B6.b.getClass();
                            pf = new C6(str2, C4262z6.a(code));
                        }
                        response8.close();
                        return pf;
                    }
                }
                Intrinsics.checkNotNullParameter(response8, "<this>");
                code2 = response8.code();
                if (400 <= code2) {
                }
                pf = new Pf(str2, code, byteString, jf);
                response8.close();
                return pf;
            } catch (MalformedURLException e26) {
                e = e26;
                response7 = response8;
                str8 = str3;
                String arrays8222 = Arrays.toString(e.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(arrays8222, str8);
                String str102222 = "Malformed URL " + arrays8222;
                C6 c67222 = new C6(str2, B6.p);
                if (response7 != null) {
                }
                return c67222;
            } catch (SocketTimeoutException e27) {
                e = e27;
                response6 = response8;
                str7 = str3;
                String arrays22222 = Arrays.toString(e.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(arrays22222, str7);
                String str112222 = "Socket timeout during request execution " + arrays22222;
                C6 c622222 = new C6(str2, B6.t);
                if (response6 != null) {
                }
                return c622222;
            } catch (IOException e28) {
                e = e28;
                response5 = response8;
                str6 = str3;
                String arrays32222 = Arrays.toString(e.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(arrays32222, str6);
                String str122222 = "Network IO error " + arrays32222;
                C6 c632222 = new C6(str2, B6.e);
                if (response5 != null) {
                }
                return c632222;
            } catch (NoSuchElementException e29) {
                e = e29;
                response4 = response8;
                str5 = str3;
                String arrays42222 = Arrays.toString(e.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(arrays42222, str5);
                String str132222 = "No routes available during request execution " + arrays42222;
                C6 c642222 = new C6(str2, B6.q);
                if (response4 != null) {
                }
                return c642222;
            } catch (TimeoutCancellationException e30) {
                e = e30;
                response3 = response8;
                str4 = str3;
                String arrays52222 = Arrays.toString(e.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(arrays52222, str4);
                String str142222 = "Coroutine timeout during request execution " + arrays52222;
                C6 c652222 = new C6(str2, B6.r);
                if (response3 != null) {
                }
                return c652222;
            } catch (CancellationException e31) {
                e = e31;
                String str162 = str3;
                String arrays72 = Arrays.toString(e.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(arrays72, str162);
                String str172 = "CancellationException " + arrays72;
                throw e;
            }
            code = response8.code();
            body = response8.body();
            if (body != null) {
            }
            byteString = ByteString.EMPTY;
            Map<String, List<String>> multimap2 = response8.headers().toMultimap();
            ResponseBody body32 = response8.body();
            if (body32 == null) {
            }
            body2 = response8.body();
            if (body2 != null) {
                str9 = mediaType.getMediaType();
            }
            String str192 = str9;
            long receivedResponseAtMillis2 = response8.receivedResponseAtMillis() - response8.sentRequestAtMillis();
            if (receivedResponseAtMillis2 >= 0) {
            }
            Intrinsics.checkNotNull(multimap2);
            jf = new Jf(j, multimap2, (int) contentLength, str192);
        } catch (Exception e32) {
            e = e32;
            response2 = response8;
            String arrays62222 = Arrays.toString(e.getStackTrace());
            Intrinsics.checkNotNullExpressionValue(arrays62222, str3);
            String str152222 = "Unknown error during request execution " + arrays62222;
            C6 c662222 = new C6(str2, B6.d);
            if (response2 != null) {
                response2.close();
            }
            return c662222;
        } catch (Throwable th) {
            th = th;
            response = response8;
            if (response != null) {
                response.close();
            }
            throw th;
        }
        w4 = new W4(this, continuationImpl);
        Object obj2 = w4.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w4.d;
        response = null;
        str9 = null;
        str9 = null;
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
        response7 = null;
        response6 = null;
        response5 = null;
        response4 = null;
        response3 = null;
        response2 = null;
        if (i != 0) {
        }
        response8 = (Response) obj2;
    }

    public final Object a(Nf nf, ContinuationImpl continuationImpl) {
        OkHttpClient okHttpClient = this.b;
        Pair a2 = a(nf);
        Request request = (Request) a2.component1();
        C6 c6 = (C6) a2.component2();
        if (c6 != null || request == null) {
            return c6 != null ? c6 : new C6(nf.c(), B6.d);
        }
        return a(okHttpClient, request, nf.c(), continuationImpl);
    }
}
