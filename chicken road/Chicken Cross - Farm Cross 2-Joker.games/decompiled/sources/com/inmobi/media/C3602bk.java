package com.inmobi.media;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3602bk implements Interceptor {
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc A[EDGE_INSN: B:102:0x01bc->B:71:0x01bc BREAK  A[LOOP:0: B:25:0x006a->B:45:0x01ac], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bc A[EDGE_INSN: B:70:0x01bc->B:71:0x01bc BREAK  A[LOOP:0: B:25:0x006a->B:45:0x01ac], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0156  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        String str;
        Request request;
        String str2;
        String str3;
        String str4;
        String message;
        int code;
        Interceptor.Chain chain2 = chain;
        Intrinsics.checkNotNullParameter(chain2, "chain");
        Request request2 = chain.request();
        Object tag = request2.tag();
        C3631ck c3631ck = tag instanceof C3631ck ? (C3631ck) tag : null;
        String str5 = "Proxy configuration error";
        str = "";
        boolean z = true;
        if (c3631ck == null) {
            Intrinsics.checkNotNull(request2);
            try {
                Response proceed = chain2.proceed(request2);
                Intrinsics.checkNotNullExpressionValue(proceed, "proceed(...)");
                return proceed;
            } catch (IllegalArgumentException e) {
                String message2 = e.getMessage();
                if (!StringsKt.contains((CharSequence) (message2 != null ? message2 : ""), (CharSequence) "port out of range", true)) {
                    throw e;
                }
                Lazy lazy = Ba.f6473a;
                Ba.a(new C3810j3(e));
                throw new IOException("Proxy configuration error", e);
            } catch (NoSuchElementException e2) {
                Lazy lazy2 = Ba.f6473a;
                Ba.a(new C3810j3(e2));
                throw new IOException("Connection pool error", e2);
            }
        }
        int i = c3631ck.f7052a;
        int i2 = i + 1;
        Response response = null;
        int i3 = 0;
        Throwable e3 = null;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (response != null) {
                try {
                    try {
                        try {
                            ResponseBody body = response.body();
                            if (body != null) {
                                body.close();
                            }
                        } catch (CancellationException e4) {
                            throw e4;
                        }
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        str4 = str5;
                        str3 = str;
                        message = e.getMessage();
                        if (StringsKt.contains((CharSequence) (message != null ? str3 : message), (CharSequence) "port out of range", true)) {
                            throw e;
                        }
                        Lazy lazy3 = Ba.f6473a;
                        Ba.a(new C3810j3(e));
                        throw new IOException(str4, e);
                    } catch (NoSuchElementException e6) {
                        e3 = e6;
                        str4 = str5;
                        str3 = str;
                        if (i3 != i) {
                            Lazy lazy4 = Ba.f6473a;
                            Ba.a(new C3810j3(e3));
                            if (e3 == null) {
                            }
                        } else {
                            request = request2;
                            long pow = (long) (Math.pow(1.0d, i3) * c3631ck.b);
                            if (pow > 0) {
                                try {
                                    Thread.sleep(pow);
                                } catch (InterruptedException e7) {
                                    Thread.currentThread().interrupt();
                                    throw new IOException("Retry delay interrupted", e7);
                                }
                            } else {
                                continue;
                            }
                            i3++;
                            chain2 = chain;
                            request2 = request;
                            str5 = str4;
                            str = str3;
                            z = true;
                        }
                    }
                } catch (IOException e8) {
                    e3 = e8;
                    request = request2;
                    str4 = str5;
                    str3 = str;
                    if (i3 == i) {
                        long pow2 = (long) (Math.pow(1.0d, i3) * c3631ck.b);
                        if (pow2 > 0) {
                            try {
                                Thread.sleep(pow2);
                            } catch (InterruptedException e9) {
                                Thread.currentThread().interrupt();
                                throw new IOException("Retry delay interrupted", e9);
                            }
                        } else {
                            continue;
                        }
                        i3++;
                        chain2 = chain;
                        request2 = request;
                        str5 = str4;
                        str = str3;
                        z = true;
                    } else if (e3 == null) {
                    }
                } catch (IllegalStateException e10) {
                    e3 = e10;
                    request = request2;
                    str2 = str5;
                    str3 = str;
                    if (i3 == i) {
                        str4 = str2;
                        long pow3 = (long) (Math.pow(1.0d, i3) * c3631ck.b);
                        if (pow3 > 0) {
                            try {
                                Thread.sleep(pow3);
                            } catch (InterruptedException e11) {
                                Thread.currentThread().interrupt();
                                throw new IOException("Retry delay interrupted", e11);
                            }
                        } else {
                            continue;
                        }
                        i3++;
                        chain2 = chain;
                        request2 = request;
                        str5 = str4;
                        str = str3;
                        z = true;
                    } else if (e3 == null) {
                    }
                }
            }
            response = chain2.proceed(request2);
            try {
                Intrinsics.checkNotNull(response);
                Intrinsics.checkNotNullParameter(response, "<this>");
                code = response.code();
            } catch (IOException e12) {
                e3 = e12;
                str4 = str5;
                str3 = str;
            } catch (IllegalStateException e13) {
                e3 = e13;
                str4 = str5;
                str3 = str;
            }
            if (400 > code || code >= 600 || !AbstractC4137uh.a(response) || i3 >= i) {
                break;
            }
            Throwable th = e3;
            str4 = str5;
            str3 = str;
            try {
                long pow4 = (long) (Math.pow(1.0d, i3) * c3631ck.b);
                if (pow4 > 0) {
                    try {
                        Thread.sleep(pow4);
                    } catch (InterruptedException e14) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Retry delay interrupted", e14);
                    }
                }
                request = request2;
                e3 = th;
            } catch (IOException e15) {
                e3 = e15;
                request = request2;
                if (i3 == i) {
                }
            } catch (IllegalArgumentException e16) {
                e = e16;
                message = e.getMessage();
                if (StringsKt.contains((CharSequence) (message != null ? str3 : message), (CharSequence) "port out of range", true)) {
                }
            } catch (IllegalStateException e17) {
                e3 = e17;
                request = request2;
                str2 = str4;
                if (i3 == i) {
                }
            } catch (NoSuchElementException e18) {
                e3 = e18;
                if (i3 != i) {
                }
            }
            i3++;
            chain2 = chain;
            request2 = request;
            str5 = str4;
            str = str3;
            z = true;
        }
        if (e3 == null) {
            throw new IOException("Retry policy exhausted", e3);
        }
        if (response != null) {
            return response;
        }
        throw new IOException("Retry policy exhausted");
    }
}
