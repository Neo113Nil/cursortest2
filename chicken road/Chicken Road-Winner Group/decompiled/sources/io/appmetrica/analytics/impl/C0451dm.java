package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451dm extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f7164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7165b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f7166c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7167d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f7168e;

    public C0451dm(P3 p3) {
        this(p3.a().c(), p3.a().d(), p3.a().a(), p3.a().h(), p3.a().b());
    }

    public final boolean a(C0451dm c0451dm) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0451dm mergeFrom(C0451dm c0451dm) {
        return new C0451dm((String) WrapUtils.getOrDefaultNullable(this.f7164a, c0451dm.f7164a), (String) WrapUtils.getOrDefaultNullable(this.f7165b, c0451dm.f7165b), (Map) WrapUtils.getOrDefaultNullable(this.f7166c, c0451dm.f7166c), this.f7167d || c0451dm.f7167d, c0451dm.f7167d ? c0451dm.f7168e : this.f7168e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f7164a + "', installReferrerSource='" + this.f7165b + "', clientClids=" + this.f7166c + ", hasNewCustomHosts=" + this.f7167d + ", newCustomHosts=" + this.f7168e + '}';
    }

    public C0451dm(String str, String str2, Map<String, String> map, boolean z3, List<String> list) {
        this.f7164a = str;
        this.f7165b = str2;
        this.f7166c = map;
        this.f7167d = z3;
        this.f7168e = list;
    }

    public C0451dm() {
        this(null, null, null, false, null);
    }
}
