package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes.dex */
public final class L7 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f10323a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10324b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10325c;

    public L7(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10324b = linkedHashMap;
        this.f10325c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final I7 d() {
        P2.o.f4767B.f4776j.getClass();
        return new I7(SystemClock.elapsedRealtime(), null, null);
    }

    public final J7 a() {
        J7 j7;
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f10325c) {
            try {
                for (I7 i7 : this.f10323a) {
                    long j5 = i7.f9526a;
                    String str = i7.f9527b;
                    I7 i72 = i7.f9528c;
                    if (i72 != null && j5 > 0) {
                        long j6 = j5 - i72.f9526a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j6);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(i72.f9526a))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(i72.f9526a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                hashMap.put(Long.valueOf(i72.f9526a), new StringBuilder(str));
                            }
                        }
                    }
                }
                this.f10323a.clear();
                String str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long longValue = ((Long) entry.getKey()).longValue();
                        P2.o oVar = P2.o.f4767B;
                        oVar.f4776j.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        oVar.f4776j.getClass();
                        sb3.append(currentTimeMillis + (longValue - SystemClock.elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str2 = sb3.toString();
                }
                j7 = new J7(sb.toString(), str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7;
    }

    public final void b(String str, String str2) {
        G7 c5;
        if (TextUtils.isEmpty(str2) || (c5 = P2.o.f4767B.f4774g.c()) == null) {
            return;
        }
        synchronized (this.f10325c) {
            H7 h7 = (H7) ((HashMap) c5.f9172c).get(str);
            if (h7 == null) {
                h7 = H7.f9333b;
            }
            LinkedHashMap linkedHashMap = this.f10324b;
            linkedHashMap.put(str, h7.a((String) linkedHashMap.get(str), str2));
        }
    }

    public final void c(I7 i7, long j5, String... strArr) {
        synchronized (this.f10325c) {
            this.f10323a.add(new I7(j5, strArr[0], i7));
        }
    }
}
