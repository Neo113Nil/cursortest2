package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public abstract class as extends com.google.android.play.integrity.internal.ao implements java.util.Set {

    /* renamed from: a, reason: collision with root package name */
    @javax.annotation.CheckForNull
    private transient com.google.android.play.integrity.internal.ar f3849a;

    as() {
    }

    public static com.google.android.play.integrity.internal.as h() {
        return com.google.android.play.integrity.internal.au.f3851a;
    }

    @Override // com.google.android.play.integrity.internal.ao
    /* renamed from: d */
    public abstract com.google.android.play.integrity.internal.av iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.integrity.internal.as) {
            ((com.google.android.play.integrity.internal.as) obj).i();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    public final com.google.android.play.integrity.internal.ar f() {
        com.google.android.play.integrity.internal.ar arVar = this.f3849a;
        if (arVar != null) {
            return arVar;
        }
        com.google.android.play.integrity.internal.ar g = g();
        this.f3849a = g;
        return g;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        java.util.Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    boolean i() {
        throw null;
    }

    com.google.android.play.integrity.internal.ar g() {
        throw null;
    }
}
