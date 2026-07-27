package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412c9 extends AbstractC0438d9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7099a;

    public C0412c9(List<Object> list) {
        this.f7099a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f7099a;
    }
}
