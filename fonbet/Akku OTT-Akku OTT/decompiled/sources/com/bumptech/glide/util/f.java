package com.bumptech.glide.util;

/* loaded from: classes3.dex */
public final class f implements g<Object> {
    public volatile Object a;
    public final /* synthetic */ g b;

    public f(g gVar) {
        this.b = gVar;
    }

    @Override // com.bumptech.glide.util.g
    public final Object get() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        Object obj = this.b.get();
                        l.c(obj, "Argument must not be null");
                        this.a = obj;
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
