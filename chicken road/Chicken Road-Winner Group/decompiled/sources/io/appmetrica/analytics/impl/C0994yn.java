package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0994yn {

    /* renamed from: a, reason: collision with root package name */
    public final String f8646a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8647b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8648c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8649d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f8650e;
    public final List f;

    public C0994yn(String str, int i3, long j3, String str2, Integer num, List list) {
        this.f8646a = str;
        this.f8647b = i3;
        this.f8648c = j3;
        this.f8649d = str2;
        this.f8650e = num;
        this.f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
