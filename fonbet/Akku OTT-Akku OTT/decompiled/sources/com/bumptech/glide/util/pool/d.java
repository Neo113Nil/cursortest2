package com.bumptech.glide.util.pool;

/* loaded from: classes3.dex */
public abstract class d {

    public static class a extends d {
        public volatile boolean a;

        public final void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
