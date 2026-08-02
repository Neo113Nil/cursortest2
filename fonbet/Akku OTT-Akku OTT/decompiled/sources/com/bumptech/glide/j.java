package com.bumptech.glide;

import androidx.tracing.Trace;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j implements com.bumptech.glide.util.g<i> {
    public boolean a;
    public final /* synthetic */ b b;
    public final /* synthetic */ ArrayList c;

    public j(b bVar, ArrayList arrayList, com.bumptech.glide.module.a aVar) {
        this.b = bVar;
        this.c = arrayList;
    }

    @Override // com.bumptech.glide.util.g
    public final i get() {
        if (this.a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.a = true;
        try {
            return k.a(this.b, this.c);
        } finally {
            this.a = false;
            Trace.endSection();
        }
    }
}
