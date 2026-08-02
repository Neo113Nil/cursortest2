package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzev implements Iterator<String> {
    private Iterator<String> zzahp;
    private final /* synthetic */ zzeu zzahq;

    zzev(zzeu zzeuVar) {
        Bundle bundle;
        this.zzahq = zzeuVar;
        bundle = this.zzahq.zzaho;
        this.zzahp = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzahp.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzahp.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
