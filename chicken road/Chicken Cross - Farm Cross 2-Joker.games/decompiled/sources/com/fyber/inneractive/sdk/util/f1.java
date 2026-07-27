package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class f1 {
    public static String a(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(z ? "?" : U3.j.c);
            sb.append((String) entry.getKey());
            sb.append(U3.j.b);
            sb.append(Uri.encode((String) entry.getValue()));
            z = false;
        }
        return sb.toString();
    }
}
