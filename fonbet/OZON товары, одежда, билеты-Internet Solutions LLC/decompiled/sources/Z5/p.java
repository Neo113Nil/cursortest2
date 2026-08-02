package Z5;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface p<Model, Data> {

    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final T5.f f35542a;

        /* renamed from: b, reason: collision with root package name */
        public final List<T5.f> f35543b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f35544c;

        public a() {
            throw null;
        }

        public a(@NonNull T5.f fVar, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            List<T5.f> list = Collections.EMPTY_LIST;
            p6.k.c(fVar, "Argument must not be null");
            this.f35542a = fVar;
            p6.k.c(list, "Argument must not be null");
            this.f35543b = list;
            p6.k.c(dVar, "Argument must not be null");
            this.f35544c = dVar;
        }
    }

    a<Data> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull T5.i iVar);

    boolean handles(@NonNull Model model);
}
