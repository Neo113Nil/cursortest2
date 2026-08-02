package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class f implements k<Drawable, Drawable> {
    @Override // com.bumptech.glide.load.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Drawable drawable, @NonNull i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    @Nullable
    public final x<Drawable> b(@NonNull Drawable drawable, int i, int i2, @NonNull i iVar) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new d(drawable2);
        }
        return null;
    }
}
