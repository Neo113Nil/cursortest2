package com.inmobi.media;

import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4147v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7425a;
    public long b;
    public Map c;
    public String d;
    public String e;
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public String j;
    public String k;

    public C4147v0(String mAdType) {
        Intrinsics.checkNotNullParameter(mAdType, "mAdType");
        this.f7425a = mAdType;
        this.b = Long.MIN_VALUE;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f = uuid;
        this.g = "";
        this.h = "";
        this.j = "activity";
    }

    public final C4201x0 a() {
        String str;
        boolean z;
        if (this.b == Long.MIN_VALUE) {
            throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
        }
        long j = this.b;
        Map map = this.c;
        if (map == null || (str = (String) map.get("tp")) == null) {
            str = "";
        }
        C4201x0 c4201x0 = new C4201x0(j, str, this.f7425a, this.e);
        c4201x0.d = this.d;
        c4201x0.c = this.c;
        String str2 = this.g;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        c4201x0.h = str2;
        String str3 = this.h;
        Intrinsics.checkNotNullParameter(str3, "<set-?>");
        c4201x0.i = str3;
        Map map2 = this.c;
        if (Intrinsics.areEqual(map2 != null ? (String) map2.get("ab-type") : null, "inline")) {
            if (CollectionsKt.contains(C4201x0.n, map2 != null ? (String) map2.get("tp") : null)) {
                String str4 = map2 != null ? (String) map2.get("ab-ad-slot") : null;
                if (str4 != null && str4.length() != 0) {
                    z = true;
                    c4201x0.j = z;
                    String str5 = this.j;
                    Intrinsics.checkNotNullParameter(str5, "<set-?>");
                    c4201x0.k = str5;
                    c4201x0.g = this.f;
                    c4201x0.l = this.i;
                    c4201x0.m = this.k;
                    return c4201x0;
                }
            }
        }
        z = false;
        c4201x0.j = z;
        String str52 = this.j;
        Intrinsics.checkNotNullParameter(str52, "<set-?>");
        c4201x0.k = str52;
        c4201x0.g = this.f;
        c4201x0.l = this.i;
        c4201x0.m = this.k;
        return c4201x0;
    }
}
