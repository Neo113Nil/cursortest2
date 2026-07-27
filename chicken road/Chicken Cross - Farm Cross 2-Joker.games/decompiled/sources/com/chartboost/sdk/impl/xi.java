package com.chartboost.sdk.impl;

import com.google.common.net.HttpHeaders;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class xi {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f5084a;
    public final SSLSocketFactory b;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public static final a b = new a();

        public a() {
            super(1, URL.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String str) {
            return new URL(str);
        }
    }

    public static abstract class b extends Exception {

        public static final class a extends b {
            public static final a b = new a();

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                super("Empty or null URL", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.xi$b$b, reason: collision with other inner class name */
        public static final class C0225b extends b {
            public final int b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0225b(int i) {
                super("Failed with HTTP code " + i, null, 2, 0 == true ? 1 : 0);
                this.b = i;
            }
        }

        public static final class c extends b {
            public static final c b = new c();

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                super("Returned connection is null", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class d extends b {
            public static final d b = new d();

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                super("Too many redirects", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class e extends b {
            public final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String url, Throwable cause) {
                super("Uncontrolled error", cause, null);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.b = url;
            }

            public final String a() {
                return this.b;
            }

            @Override // com.chartboost.sdk.impl.xi.b, java.lang.Throwable
            public String toString() {
                String th;
                Throwable cause = getCause();
                return (cause == null || (th = cause.toString()) == null) ? "No cause" : th;
            }
        }

        public /* synthetic */ b(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }

        @Override // java.lang.Throwable
        public String toString() {
            String message = getMessage();
            return message == null ? "No message" : message;
        }

        public b(String str, Throwable th) {
            super(str, th);
        }

        public /* synthetic */ b(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th, null);
        }
    }

    public xi(Function1 urlFactory, SSLSocketFactory sslSocket) {
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        this.f5084a = urlFactory;
        this.b = sslSocket;
    }

    public static /* synthetic */ Object a(xi xiVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return xiVar.a(str, i);
    }

    public final boolean b(int i) {
        return i <= y8.d.b() && y8.c.b() <= i;
    }

    public final Object a(String str, int i) {
        URL url;
        HttpsURLConnection a2;
        Object a3;
        HttpsURLConnection httpsURLConnection = null;
        mb.a("Attempting to redirect url: " + str + ", limit: " + i, (Throwable) null, 2, (Object) null);
        if (str == null || str.length() == 0) {
            Object a4 = a(b.a.b);
            mb.e("Url is null or empty.", null, 2, null);
            return a4;
        }
        try {
            if (i < 0) {
                Object a5 = a(b.d.b);
                mb.e("Too many redirects for url: " + str, null, 2, null);
                return a5;
            }
            try {
                url = (URL) this.f5084a.invoke(str);
                a2 = a(url);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (a2 == null) {
                    a3 = a(b.c.b);
                    mb.e("Null connection for url: " + str, null, 2, null);
                } else if (b(a2.getResponseCode())) {
                    Result.Companion companion = Result.INSTANCE;
                    a3 = Result.m8079constructorimpl(str);
                    mb.a("Successfully fetched url: " + str, (Throwable) null, 2, (Object) null);
                } else if (a(a2.getResponseCode())) {
                    String headerField = a2.getHeaderField(HttpHeaders.LOCATION);
                    Intrinsics.checkNotNull(headerField);
                    if (StringsKt.startsWith$default(headerField, "/", false, 2, (Object) null)) {
                        headerField = url.getProtocol() + "://" + url.getHost() + headerField;
                    }
                    mb.a("Redirecting to: " + headerField, (Throwable) null, 2, (Object) null);
                    a3 = a(headerField, i - 1);
                } else {
                    a3 = a(new b.C0225b(a2.getResponseCode()));
                    mb.e("Failed with HTTP code " + a2.getResponseCode() + " for url: " + str, null, 2, null);
                }
                if (a2 != null) {
                    a2.disconnect();
                }
                return a3;
            } catch (Exception e2) {
                e = e2;
                httpsURLConnection = a2;
                mb.b("Cannot redirect " + str, e);
                Object a6 = a(new b.e(str, e));
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return a6;
            } catch (Throwable th) {
                th = th;
                httpsURLConnection = a2;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public /* synthetic */ xi(Function1 function1, SSLSocketFactory sSLSocketFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.b : function1, (i & 2) != 0 ? i3.f4801a.a() : sSLSocketFactory);
    }

    public final Object a(b bVar) {
        Result.Companion companion = Result.INSTANCE;
        return Result.m8079constructorimpl(ResultKt.createFailure(bVar));
    }

    public final boolean a(int i) {
        return i <= y8.f.b() && y8.e.b() <= i;
    }

    public final HttpsURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        HttpsURLConnection httpsURLConnection = openConnection instanceof HttpsURLConnection ? (HttpsURLConnection) openConnection : null;
        if (httpsURLConnection == null) {
            return null;
        }
        httpsURLConnection.setSSLSocketFactory(this.b);
        httpsURLConnection.setInstanceFollowRedirects(false);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        return httpsURLConnection;
    }
}
