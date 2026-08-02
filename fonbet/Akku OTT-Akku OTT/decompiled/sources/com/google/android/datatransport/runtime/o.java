package com.google.android.datatransport.runtime;

import java.util.Set;

/* loaded from: classes.dex */
public final class o implements com.google.android.datatransport.i {
    public final Set<com.google.android.datatransport.c> a;
    public final d b;
    public final q c;

    public o(Set set, d dVar, q qVar) {
        this.a = set;
        this.b = dVar;
        this.c = qVar;
    }

    @Override // com.google.android.datatransport.i
    public final p a(String str, com.google.android.datatransport.c cVar, com.google.android.datatransport.g gVar) {
        Set<com.google.android.datatransport.c> set = this.a;
        if (set.contains(cVar)) {
            return new p(this.b, str, cVar, gVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
