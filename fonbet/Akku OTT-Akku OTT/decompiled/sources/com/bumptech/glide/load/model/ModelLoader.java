package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.util.l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public interface ModelLoader<Model, Data> {

    public static class LoadData<Data> {
        public final List<g> alternateKeys;
        public final d<Data> fetcher;
        public final g sourceKey;

        public LoadData(@NonNull g gVar, @NonNull d<Data> dVar) {
            this(gVar, Collections.EMPTY_LIST, dVar);
        }

        public LoadData(@NonNull g gVar, @NonNull List<g> list, @NonNull d<Data> dVar) {
            l.c(gVar, "Argument must not be null");
            this.sourceKey = gVar;
            l.c(list, "Argument must not be null");
            this.alternateKeys = list;
            l.c(dVar, "Argument must not be null");
            this.fetcher = dVar;
        }
    }

    @Nullable
    LoadData<Data> buildLoadData(@NonNull Model model, int i, int i2, @NonNull i iVar);

    boolean handles(@NonNull Model model);
}
