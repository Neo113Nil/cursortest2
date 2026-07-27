package io.appmetrica.analytics.coreutils.internal;

import g4.AbstractC0465j;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ReferenceHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f6234a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return AbstractC0465j.X0(this.f6234a);
    }

    public final void removeReference(Object obj) {
        this.f6234a.remove(obj);
    }

    public final void storeReference(Object obj) {
        this.f6234a.add(obj);
    }
}
