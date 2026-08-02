package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.l;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class d implements l<c> {
    @Override // com.bumptech.glide.load.l
    @NonNull
    public final com.bumptech.glide.load.c a(@NonNull com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.c.a;
    }

    @Override // com.bumptech.glide.load.d
    public final boolean encode(@NonNull Object obj, @NonNull File file, @NonNull com.bumptech.glide.load.i iVar) {
        try {
            com.bumptech.glide.util.a.d(((c) ((x) obj).get()).a.a.a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
