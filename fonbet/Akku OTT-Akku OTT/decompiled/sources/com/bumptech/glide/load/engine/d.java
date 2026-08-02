package com.bumptech.glide.load.engine;

/* loaded from: classes3.dex */
public final class d extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public d(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
