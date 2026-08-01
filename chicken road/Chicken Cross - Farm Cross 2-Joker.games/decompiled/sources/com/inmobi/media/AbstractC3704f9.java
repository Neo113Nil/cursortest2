package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3704f9 {
    public static HashMap a() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", AbstractC3942nk.a());
            C4229y1 c4229y1 = Mm.f6724a;
            Boolean bool = c4229y1 != null ? c4229y1.c : null;
            if (bool != null) {
                hashMap.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            hashMap.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            C4276zk.f7528a.getClass();
            HashMap hashMap2 = new HashMap();
            if (C4276zk.e && (str = C4276zk.d) != null) {
                hashMap2.put("u-s-id", str);
            }
            hashMap.putAll(hashMap2);
            return hashMap;
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("f9", "TAG");
            String str2 = "SDK encountered unexpected error in getting UID info; " + e.getMessage();
            return hashMap;
        }
    }
}
