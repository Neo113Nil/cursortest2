package com.bumptech.glide.load.resource.file;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.x;
import com.bumptech.glide.util.l;
import java.io.File;

/* loaded from: classes3.dex */
public final class b implements x<File> {
    public final File a;

    public b(File file) {
        l.c(file, "Argument must not be null");
        this.a = file;
    }

    @Override // com.bumptech.glide.load.engine.x
    public final int a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Class<File> c() {
        return this.a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final File get() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.x
    public final void recycle() {
    }
}
