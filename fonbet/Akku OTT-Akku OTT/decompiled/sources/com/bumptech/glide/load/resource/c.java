package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class c<T> implements m<T> {
    public static final c b = new c();

    @Override // com.bumptech.glide.load.m
    @NonNull
    public final x<T> a(@NonNull Context context, @NonNull x<T> xVar, int i, int i2) {
        return xVar;
    }

    @Override // com.bumptech.glide.load.g
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
