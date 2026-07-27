package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930wa {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8557a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8558b;

    public C0930wa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f8557a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f8557a.toString();
    }

    public C0930wa(boolean z3) {
        this.f8557a = new HashMap();
        this.f8558b = z3;
    }
}
