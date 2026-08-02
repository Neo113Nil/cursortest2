package Z5;

import Z5.p;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;

/* loaded from: classes.dex */
public final class y<Model> implements p<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    private static final y<?> f35578a = new y<>();

    public static class a<Model> implements q<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        private static final a<?> f35579a = new a<>();

        public static <T> a<T> a() {
            return (a<T>) f35579a;
        }

        @Override // Z5.q
        @NonNull
        public final p<Model, Model> build(t tVar) {
            return y.a();
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a, reason: collision with root package name */
        private final Model f35580a;

        b(Model model) {
            this.f35580a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Model> getDataClass() {
            return (Class<Model>) this.f35580a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return T5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super Model> aVar) {
            aVar.a(this.f35580a);
        }
    }

    public static <T> y<T> a() {
        return (y<T>) f35578a;
    }

    @Override // Z5.p
    public final p.a<Model> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull T5.i iVar) {
        return new p.a<>(new o6.d(model), new b(model));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Model model) {
        return true;
    }
}
