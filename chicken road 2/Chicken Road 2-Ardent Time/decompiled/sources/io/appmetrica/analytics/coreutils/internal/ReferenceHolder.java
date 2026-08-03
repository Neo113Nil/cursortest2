package io.appmetrica.analytics.coreutils.internal;

/* loaded from: classes.dex */
public final class ReferenceHolder {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.LinkedHashSet f3731a = new java.util.LinkedHashSet();

    public final java.util.Set<java.lang.Object> peekReferences() {
        return i1.AbstractC0190i.b0(this.f3731a);
    }

    public final void removeReference(java.lang.Object obj) {
        this.f3731a.remove(obj);
    }

    public final void storeReference(java.lang.Object obj) {
        this.f3731a.add(obj);
    }
}
