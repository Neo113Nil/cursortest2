package io.appmetrica.analytics.coreutils.internal;

import e2.AbstractC0292g;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ReferenceHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f5414a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return AbstractC0292g.h0(this.f5414a);
    }

    public final void removeReference(Object obj) {
        this.f5414a.remove(obj);
    }

    public final void storeReference(Object obj) {
        this.f5414a.add(obj);
    }
}
