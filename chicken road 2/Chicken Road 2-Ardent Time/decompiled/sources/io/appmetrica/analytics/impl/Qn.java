package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Qn {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Gn f4873a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.V f4874b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f4875c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f4876d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f4877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f4878f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f4879g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f4880h;

    public Qn(io.appmetrica.analytics.impl.Gn gn, io.appmetrica.analytics.impl.V v2, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.lang.Boolean bool) {
        this.f4873a = gn;
        this.f4874b = v2;
        this.f4875c = arrayList;
        this.f4876d = str;
        this.f4877e = str2;
        this.f4878f = map;
        this.f4879g = str3;
        this.f4880h = bool;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        io.appmetrica.analytics.impl.Gn gn = this.f4873a;
        if (gn != null) {
            for (io.appmetrica.analytics.impl.Dl dl : gn.f4355c) {
                sb.append("at " + dl.f4230a + "." + dl.f4234e + "(" + dl.f4231b + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f4232c + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f4233d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f4873a + "\n" + sb.toString() + '}';
    }
}
