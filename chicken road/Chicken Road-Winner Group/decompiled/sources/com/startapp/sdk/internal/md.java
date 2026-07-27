package com.startapp.sdk.internal;

import com.startapp.sdk.common.SDKException;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class md extends se {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4057b;

    public md(Set set) {
        super(set);
        this.f4057b = new LinkedHashMap();
    }

    @Override // com.startapp.sdk.internal.se
    public final void a(String str, Object obj, boolean z3, boolean z4) {
        if (this.f4337a.contains(str)) {
            return;
        }
        try {
            String b3 = obj instanceof re ? ((re) obj).b() : obj != null ? obj.toString() : null;
            if (b3 == null) {
                if (z3) {
                    throw new SDKException(str);
                }
            } else {
                if (z4) {
                    b3 = URLEncoder.encode(b3, CharEncoding.UTF_8);
                }
                this.f4057b.put(str, b3);
            }
        } catch (UnsupportedEncodingException e3) {
            if (z3) {
                throw new SDKException(str, e3);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        for (Map.Entry entry : this.f4057b.entrySet()) {
            if (entry.getValue() instanceof String) {
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                sb.append('&');
            } else if (entry.getValue() instanceof Set) {
                for (Object obj : (Set) entry.getValue()) {
                    if (obj instanceof String) {
                        sb.append((String) entry.getKey());
                        sb.append('=');
                        sb.append(obj);
                        sb.append('&');
                    }
                }
            }
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString().replace("+", "%20");
    }

    @Override // com.startapp.sdk.internal.se
    public final void a(String str, Set set) {
        if (this.f4337a.contains(str) || set == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(URLEncoder.encode((String) it.next(), CharEncoding.UTF_8));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f4057b.put(str, hashSet);
    }
}
