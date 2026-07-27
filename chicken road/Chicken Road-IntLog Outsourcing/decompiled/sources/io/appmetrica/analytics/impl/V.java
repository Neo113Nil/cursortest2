package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C1143yn f7607a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7608b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7609c;

    public V(C1143yn c1143yn, ArrayList arrayList, String str) {
        this.f7607a = c1143yn;
        this.f7608b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f7609c = str;
    }
}
