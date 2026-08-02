package com.amplitude.core.utilities;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public static final a Companion = new a();
    public List<String> a;
    public Set<String> b;

    public static final class a {
    }

    public final void a(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        Set<String> set = this.b;
        set.add(log);
        while (set.size() > 10) {
            set.remove(CollectionsKt.first(set));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        Set<String> set = this.b;
        List<String> list = this.a;
        if (list != null) {
            Intrinsics.checkNotNull(list);
        }
        if (set.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> list2 = this.a;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            if (!list2.isEmpty()) {
                List<String> list3 = this.a;
                Intrinsics.checkNotNull(list3);
                linkedHashMap.put("malformed_events", list3);
            }
        }
        if (!set.isEmpty()) {
            linkedHashMap.put("error_logs", CollectionsKt.toList(set));
        }
        String valueOf = String.valueOf(v.c(linkedHashMap));
        List<String> list4 = this.a;
        if (list4 != null) {
            list4.clear();
        }
        set.clear();
        return valueOf;
    }
}
