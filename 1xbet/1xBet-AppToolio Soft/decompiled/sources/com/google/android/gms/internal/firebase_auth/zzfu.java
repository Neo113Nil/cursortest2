package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzfu implements Iterator<String> {
    private final /* synthetic */ zzfs zzvh;
    private Iterator<String> zzvi;

    zzfu(zzfs zzfsVar) {
        zzdq zzdqVar;
        this.zzvh = zzfsVar;
        zzdqVar = this.zzvh.zzvf;
        this.zzvi = zzdqVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzvi.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzvi.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
