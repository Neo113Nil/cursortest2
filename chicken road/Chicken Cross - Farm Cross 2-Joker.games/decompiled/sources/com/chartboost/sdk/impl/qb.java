package com.chartboost.sdk.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class qb {
    public static final a b = new a(null);
    public static final Regex c = new Regex("%25%25(CB_[A-Z0-9_]+)%25%25");

    /* renamed from: a, reason: collision with root package name */
    public final f2 f4973a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public qb(f2 base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f4973a = base64Wrapper;
    }

    public final String a(String str, jh eventData, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        if (str == null) {
            return null;
        }
        String replace = c.replace(str, "%%$1%%");
        String str2 = z2 ? "null" : "";
        String str3 = replace;
        for (Map.Entry entry : eventData.b().entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            String str6 = "%%" + str4 + "%%";
            if (str5 == null || str5.length() == 0) {
                str3 = StringsKt.replace$default(str3, str6, "", false, 4, (Object) null);
            } else if (Intrinsics.areEqual(str4, "CB_BASE64_ADM")) {
                str3 = StringsKt.replace$default(str3, str6, str5, false, 4, (Object) null);
            } else {
                String a2 = a(str5, z);
                str3 = StringsKt.replace$default(str3, str6, a2 == null ? "" : a2, false, 4, (Object) null);
            }
        }
        return new Regex("%%CB_[A-Z0-9_]+%%").replace(a(str3, eventData, str2), str2);
    }

    public /* synthetic */ qb(f2 f2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new f2() : f2Var);
    }

    public final String a(String str, jh jhVar, String str2) {
        String str3;
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "%%CB_LOG_CONTEXT%%", false, 2, (Object) null)) {
            return str;
        }
        String c2 = jhVar.c();
        if (c2 != null && c2.length() != 0) {
            String c3 = this.f4973a.c(c2);
            if (c3.length() != 0) {
                str3 = c3;
                return StringsKt.replace$default(str, "%%CB_LOG_CONTEXT%%", str3, false, 4, (Object) null);
            }
        }
        str3 = str2;
        return StringsKt.replace$default(str, "%%CB_LOG_CONTEXT%%", str3, false, 4, (Object) null);
    }

    public final String a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (!z) {
            return str;
        }
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            mb.b("Failed to URL encode macro value: " + str + ". Error: " + e.getMessage(), e);
            return str;
        }
    }
}
