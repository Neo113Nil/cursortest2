package com.pichillilorenzo.flutter_inappwebview_android.types;

import R0.d;
import R0.p;
import S0.B;
import S0.s;
import S0.w;
import S0.x;
import android.webkit.WebResourceError;
import e1.k;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes2.dex */
public class WebResourceErrorExt {
    private String description;
    private int type;

    public WebResourceErrorExt(int i7, String str) {
        this.type = i7;
        this.description = str;
    }

    public static WebResourceErrorExt fromWebResourceError(WebResourceError webResourceError) {
        return new WebResourceErrorExt(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceErrorExt webResourceErrorExt = (WebResourceErrorExt) obj;
        if (this.type != webResourceErrorExt.type) {
            return false;
        }
        return this.description.equals(webResourceErrorExt.description);
    }

    public String getDescription() {
        return this.description;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.type * 31);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setType(int i7) {
        this.type = i7;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType()));
        hashMap.put("description", getDescription());
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebResourceErrorExt{type=");
        sb.append(this.type);
        sb.append(", description='");
        return k.i(sb, this.description, "'}");
    }

    public static WebResourceErrorExt fromWebResourceError(p pVar) {
        int i7;
        String str;
        if (d.a("WEB_RESOURCE_ERROR_GET_CODE")) {
            s sVar = (s) pVar;
            sVar.getClass();
            w.f6299o.getClass();
            if (sVar.f6263a == null) {
                B b7 = x.f6311a;
                sVar.f6263a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) b7.f6229b).convertWebResourceError(Proxy.getInvocationHandler(sVar.f6264b));
            }
            i7 = sVar.f6263a.getErrorCode();
        } else {
            i7 = -1;
        }
        if (d.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
            s sVar2 = (s) pVar;
            sVar2.getClass();
            w.f6298n.getClass();
            if (sVar2.f6263a == null) {
                B b8 = x.f6311a;
                sVar2.f6263a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) b8.f6229b).convertWebResourceError(Proxy.getInvocationHandler(sVar2.f6264b));
            }
            str = sVar2.f6263a.getDescription().toString();
        } else {
            str = "";
        }
        return new WebResourceErrorExt(i7, str);
    }
}
