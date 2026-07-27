package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626kh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f7703a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7704b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7705c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7706d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7707e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7708g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7709h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f7710i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7711j;

    public C0626kh(C0898v4 c0898v4) {
        this(c0898v4.f8473a, c0898v4.f8474b, c0898v4.f8476d, c0898v4.f8477e, c0898v4.f, c0898v4.f8478g, c0898v4.f8479h, c0898v4.f8480i, c0898v4.f8481j, c0898v4.f8482k);
    }

    public static C0626kh a() {
        return new C0626kh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0626kh mergeFrom(C0898v4 c0898v4) {
        return new C0626kh((String) WrapUtils.getOrDefaultNullable(c0898v4.f8473a, this.f7703a), (Boolean) WrapUtils.getOrDefaultNullable(c0898v4.f8474b, Boolean.valueOf(this.f7704b)), (Boolean) WrapUtils.getOrDefaultNullable(c0898v4.f8476d, Boolean.valueOf(this.f7705c)), (Integer) WrapUtils.getOrDefaultNullable(c0898v4.f8477e, Integer.valueOf(this.f7706d)), (Integer) WrapUtils.getOrDefaultNullable(c0898v4.f, Integer.valueOf(this.f7707e)), (Integer) WrapUtils.getOrDefaultNullable(c0898v4.f8478g, Integer.valueOf(this.f)), (Boolean) WrapUtils.getOrDefaultNullable(c0898v4.f8479h, Boolean.valueOf(this.f7708g)), (Boolean) WrapUtils.getOrDefaultNullable(c0898v4.f8480i, Boolean.valueOf(this.f7709h)), (Map) WrapUtils.getOrDefaultNullable(c0898v4.f8481j, this.f7710i), (Integer) WrapUtils.getOrDefaultNullable(c0898v4.f8482k, Integer.valueOf(this.f7711j)));
    }

    public C0626kh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f7703a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f7704b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f7705c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f7706d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f7707e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f7708g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f7709h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f7710i = map;
        this.f7711j = ((Integer) WrapUtils.getOrDefault(num4, Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT))).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C0898v4 c0898v4) {
        Map<String, String> map;
        String str;
        Boolean bool = c0898v4.f8474b;
        if (bool != null && this.f7704b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c0898v4.f8476d;
        if (bool2 != null && this.f7705c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c0898v4.f8477e;
        if (num != null && this.f7706d != num.intValue()) {
            return false;
        }
        Integer num2 = c0898v4.f;
        if (num2 != null && this.f7707e != num2.intValue()) {
            return false;
        }
        Integer num3 = c0898v4.f8478g;
        if (num3 != null && this.f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c0898v4.f8479h;
        if (bool3 != null && this.f7708g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c0898v4.f8480i;
        if (bool4 != null && this.f7709h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c0898v4.f8473a;
        if (str2 != null && ((str = this.f7703a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c0898v4.f8481j;
        if (map2 != null && ((map = this.f7710i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c0898v4.f8482k;
        return num4 == null || this.f7711j == num4.intValue();
    }
}
