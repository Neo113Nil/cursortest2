package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Sn {

    /* renamed from: a, reason: collision with root package name */
    public final In f6621a;

    /* renamed from: b, reason: collision with root package name */
    public final V f6622b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6623c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6624d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6625e;
    public final Map f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6626g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f6627h;

    public Sn(In in, V v3, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f6621a = in;
        this.f6622b = v3;
        this.f6623c = arrayList;
        this.f6624d = str;
        this.f6625e = str2;
        this.f = map;
        this.f6626g = str3;
        this.f6627h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        In in = this.f6621a;
        if (in != null) {
            for (Hl hl : in.f6128c) {
                sb.append("at " + hl.f6043a + "." + hl.f6047e + "(" + hl.f6044b + StringUtils.PROCESS_POSTFIX_DELIMITER + hl.f6045c + StringUtils.PROCESS_POSTFIX_DELIMITER + hl.f6046d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f6621a + IOUtils.LINE_SEPARATOR_UNIX + sb.toString() + '}';
    }
}
