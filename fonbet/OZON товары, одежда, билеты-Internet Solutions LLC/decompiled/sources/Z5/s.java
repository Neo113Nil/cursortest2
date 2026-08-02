package Z5;

import Z5.p;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class s<Model, Data> implements p<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f35549a;

    /* renamed from: b, reason: collision with root package name */
    private final x2.f<List<Throwable>> f35550b;

    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f35551a;

        /* renamed from: b, reason: collision with root package name */
        private final x2.f<List<Throwable>> f35552b;

        /* renamed from: c, reason: collision with root package name */
        private int f35553c;

        /* renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.i f35554d;

        /* renamed from: e, reason: collision with root package name */
        private d.a<? super Data> f35555e;

        /* renamed from: f, reason: collision with root package name */
        private List<Throwable> f35556f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f35557g;

        a(@NonNull ArrayList arrayList, @NonNull x2.f fVar) {
            this.f35552b = fVar;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f35551a = arrayList;
            this.f35553c = 0;
        }

        private void b() {
            if (this.f35557g) {
                return;
            }
            if (this.f35553c < this.f35551a.size() - 1) {
                this.f35553c++;
                loadData(this.f35554d, this.f35555e);
            } else {
                p6.k.b(this.f35556f);
                this.f35555e.onLoadFailed(new V5.q("Fetch failed", new ArrayList(this.f35556f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void a(Data data) {
            if (data != null) {
                this.f35555e.a(data);
            } else {
                b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f35557g = true;
            Iterator it = this.f35551a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
            List<Throwable> list = this.f35556f;
            if (list != null) {
                this.f35552b.b(list);
            }
            this.f35556f = null;
            Iterator it = this.f35551a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Data> getDataClass() {
            return ((com.bumptech.glide.load.data.d) this.f35551a.get(0)).getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return ((com.bumptech.glide.load.data.d) this.f35551a.get(0)).getDataSource();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super Data> aVar) {
            this.f35554d = iVar;
            this.f35555e = aVar;
            this.f35556f = this.f35552b.a();
            ((com.bumptech.glide.load.data.d) this.f35551a.get(this.f35553c)).loadData(iVar, this);
            if (this.f35557g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void onLoadFailed(@NonNull Exception exc) {
            List<Throwable> list = this.f35556f;
            p6.k.c(list, "Argument must not be null");
            list.add(exc);
            b();
        }
    }

    s(@NonNull ArrayList arrayList, @NonNull x2.f fVar) {
        this.f35549a = arrayList;
        this.f35550b = fVar;
    }

    @Override // Z5.p
    public final p.a<Data> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull T5.i iVar) {
        p.a<Data> buildLoadData;
        ArrayList arrayList = this.f35549a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        T5.f fVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            p pVar = (p) arrayList.get(i13);
            if (pVar.handles(model) && (buildLoadData = pVar.buildLoadData(model, i11, i12, iVar)) != null) {
                arrayList2.add(buildLoadData.f35544c);
                fVar = buildLoadData.f35542a;
            }
        }
        if (arrayList2.isEmpty() || fVar == null) {
            return null;
        }
        return new p.a<>(fVar, new a(arrayList2, this.f35550b));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Model model) {
        Iterator it = this.f35549a.iterator();
        while (it.hasNext()) {
            if (((p) it.next()).handles(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f35549a.toArray()) + '}';
    }
}
