package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1786xb extends C0709Wb {

    /* renamed from: o, reason: collision with root package name */
    public final Map f16293o;

    /* renamed from: p, reason: collision with root package name */
    public final Activity f16294p;

    /* renamed from: q, reason: collision with root package name */
    public final String f16295q;

    /* renamed from: r, reason: collision with root package name */
    public final long f16296r;

    /* renamed from: s, reason: collision with root package name */
    public final long f16297s;

    /* renamed from: t, reason: collision with root package name */
    public final String f16298t;

    /* renamed from: u, reason: collision with root package name */
    public final String f16299u;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1786xb(InterfaceC0677Re interfaceC0677Re, Map map) {
        super(9, interfaceC0677Re, "createCalendarEvent");
        long parseLong;
        String str;
        this.f16293o = map;
        this.f16294p = interfaceC0677Re.e();
        this.f16295q = A("description");
        this.f16298t = A("summary");
        String str2 = (String) map.get("start_ticks");
        long j5 = -1;
        if (str2 != null) {
            try {
                parseLong = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
            }
            this.f16296r = parseLong;
            str = (String) this.f16293o.get("end_ticks");
            if (str != null) {
                try {
                    j5 = Long.parseLong(str);
                } catch (NumberFormatException unused2) {
                }
            }
            this.f16297s = j5;
            this.f16299u = A("location");
        }
        parseLong = -1;
        this.f16296r = parseLong;
        str = (String) this.f16293o.get("end_ticks");
        if (str != null) {
        }
        this.f16297s = j5;
        this.f16299u = A("location");
    }

    public final String A(String str) {
        Map map = this.f16293o;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
