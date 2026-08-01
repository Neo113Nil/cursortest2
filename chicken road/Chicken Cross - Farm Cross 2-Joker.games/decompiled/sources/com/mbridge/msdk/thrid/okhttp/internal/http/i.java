package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.y;
import java.net.Proxy;

/* compiled from: RequestLine.java */
/* loaded from: classes6.dex */
public final class i {
    public static String a(y yVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.e());
        sb.append(' ');
        if (b(yVar, type)) {
            sb.append(yVar.g());
        } else {
            sb.append(a(yVar.g()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(y yVar, Proxy.Type type) {
        return !yVar.d() && type == Proxy.Type.HTTP;
    }

    public static String a(s sVar) {
        String c = sVar.c();
        String e = sVar.e();
        return e != null ? c + '?' + e : c;
    }
}
