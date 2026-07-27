package com.startapp.sdk.internal;

import android.content.res.AssetManager;
import com.startapp.sdk.ads.video.vast.VASTResource$CreativeType;
import com.startapp.sdk.ads.video.vast.VASTResource$Type;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cj {
    public static final List f = Arrays.asList("image/jpeg", "image/png", "image/bmp", "image/gif");

    /* renamed from: g, reason: collision with root package name */
    public static final List f3560g = Collections.singletonList("application/x-javascript");

    /* renamed from: a, reason: collision with root package name */
    public final String f3561a;

    /* renamed from: b, reason: collision with root package name */
    public final VASTResource$Type f3562b;

    /* renamed from: c, reason: collision with root package name */
    public final VASTResource$CreativeType f3563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3564d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3565e;

    public cj(String str, VASTResource$Type vASTResource$Type, VASTResource$CreativeType vASTResource$CreativeType, int i3, int i4) {
        this.f3561a = str;
        this.f3562b = vASTResource$Type;
        this.f3563c = vASTResource$CreativeType;
        this.f3564d = i3;
        this.f3565e = i4;
    }

    public static cj a(yi yiVar, VASTResource$Type vASTResource$Type, int i3, int i4) {
        VASTResource$CreativeType vASTResource$CreativeType = VASTResource$CreativeType.NONE;
        int ordinal = vASTResource$Type.ordinal();
        if (ordinal != 0) {
            String f3 = ordinal != 1 ? ordinal != 2 ? null : yiVar.f("IFrameResource") : yiVar.f("HTMLResource");
            if (f3 == null) {
                return null;
            }
            return new cj(f3, vASTResource$Type, vASTResource$CreativeType, i3, i4);
        }
        String c3 = yiVar.c();
        String f4 = yiVar.f("StaticResource");
        if (f4 == null) {
            return null;
        }
        List list = f;
        String str = (list.contains(c3) || f3560g.contains(c3)) ? f4 : null;
        if (str == null) {
            return null;
        }
        return new cj(str, VASTResource$Type.STATIC_RESOURCE, list.contains(c3) ? VASTResource$CreativeType.IMAGE : VASTResource$CreativeType.JAVASCRIPT, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj != null && cj.class == obj.getClass()) {
            cj cjVar = (cj) obj;
            if (this.f3564d == cjVar.f3564d && this.f3565e == cjVar.f3565e && si.a((Object) this.f3561a, (Object) cjVar.f3561a) && this.f3562b == cjVar.f3562b && this.f3563c == cjVar.f3563c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f3561a, this.f3562b, this.f3563c, Integer.valueOf(this.f3564d), Integer.valueOf(this.f3565e)};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    public final String a(AssetManager assetManager, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f3564d);
            jSONObject.put("height", this.f3565e);
            jSONObject.put("resource", str);
            str2 = jSONObject.toString();
        } catch (JSONException e3) {
            d9.a(e3);
            str2 = null;
        }
        HashMap hashMap = new HashMap(1);
        if (str2 != null) {
            hashMap.put("'%%_start_io_vast_data_placeholder_%%'", str2);
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open("io_start_sdk_vast_endcard_smart.html")));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!hashMap.isEmpty()) {
                        Iterator it = hashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            int indexOf = readLine.indexOf(str3);
                            if (indexOf >= 0) {
                                sb.append(readLine.substring(0, indexOf));
                                sb.append(str4);
                                sb.append(readLine.substring(indexOf + str3.length()));
                                sb.append(System.lineSeparator());
                                it.remove();
                                break;
                            }
                        }
                    }
                    sb.append(readLine);
                    sb.append(System.lineSeparator());
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th) {
            d9.a(th);
        }
        return sb.toString();
    }
}
