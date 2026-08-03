package com.inmobi.media;

/* renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2888xk {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2709r1 f5555a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public java.lang.String f;

    public C2888xk(com.inmobi.media.C2709r1 c2709r1, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String markupType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markupType, "markupType");
        this.f5555a = c2709r1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = markupType;
    }

    public final java.util.LinkedHashMap a() {
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.inmobi.media.C2709r1 c2709r1 = this.f5555a;
        if (c2709r1 != null) {
            linkedHashMap.put("adType", c2709r1.f5416a.m());
        }
        com.inmobi.media.C2709r1 c2709r12 = this.f5555a;
        if (c2709r12 != null) {
            linkedHashMap.put("plId", java.lang.Long.valueOf(c2709r12.f5416a.l.f5497a));
        }
        com.inmobi.media.C2709r1 c2709r13 = this.f5555a;
        if (c2709r13 != null && (str = c2709r13.f5416a.l.f) != null) {
            linkedHashMap.put("plType", str);
        }
        com.inmobi.media.C2709r1 c2709r14 = this.f5555a;
        java.lang.String str2 = null;
        if (c2709r14 != null) {
            com.inmobi.media.ads.network.common.model.AdSet s = c2709r14.f5416a.s();
            java.lang.Boolean valueOf = s != null ? java.lang.Boolean.valueOf(s.getIsRewarded()) : null;
            if (valueOf != null) {
                linkedHashMap.put("isRewarded", valueOf);
            }
        }
        java.lang.String str3 = this.c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        java.lang.String str4 = this.b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.e);
        java.lang.String str5 = this.f;
        if (str5 != null) {
            str2 = str5;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("triggerSource");
        }
        linkedHashMap.put("trigger", str2);
        com.inmobi.media.C2709r1 c2709r15 = this.f5555a;
        if (c2709r15 != null && c2709r15.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f5555a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        com.inmobi.media.C2913yk c2913yk;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.inmobi.media.C2709r1 c2709r1 = this.f5555a;
        if (c2709r1 == null || (c2913yk = c2709r1.b) == null || (atomicBoolean = c2913yk.f5575a) == null || !atomicBoolean.getAndSet(true)) {
            java.util.LinkedHashMap a2 = a();
            a2.put("networkType", com.inmobi.media.B5.g());
            a2.put("errorCode", (short) 2177);
            java.lang.String str = this.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("AdImpressionSuccessful", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
    }

    public final void c() {
        com.inmobi.media.C2913yk c2913yk;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.inmobi.media.C2709r1 c2709r1 = this.f5555a;
        if (c2709r1 == null || (c2913yk = c2709r1.b) == null || (atomicBoolean = c2913yk.f5575a) == null || !atomicBoolean.getAndSet(true)) {
            java.util.LinkedHashMap a2 = a();
            a2.put("networkType", com.inmobi.media.B5.g());
            a2.put("errorCode", (short) 0);
            java.lang.String str = this.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("AdImpressionSuccessful", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
    }
}
