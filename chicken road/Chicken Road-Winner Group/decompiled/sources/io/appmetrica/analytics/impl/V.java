package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0994yn f6734a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6735b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6736c;

    public V(C0994yn c0994yn, ArrayList arrayList, String str) {
        this.f6734a = c0994yn;
        this.f6735b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f6736c = str;
    }
}
