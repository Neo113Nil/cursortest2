package com.bumptech.glide.load.resource.file;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a implements k<File, File> {
    @Override // com.bumptech.glide.load.k
    public final /* bridge */ /* synthetic */ boolean a(@NonNull File file, @NonNull i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public final x<File> b(@NonNull File file, int i, int i2, @NonNull i iVar) throws IOException {
        return new b(file);
    }
}
