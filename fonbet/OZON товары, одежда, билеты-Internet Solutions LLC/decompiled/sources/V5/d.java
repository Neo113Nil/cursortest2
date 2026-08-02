package V5;

import V5.g;
import Z5.p;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
final class d implements g, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final List<T5.f> f28124a;

    /* renamed from: b, reason: collision with root package name */
    private final h<?> f28125b;

    /* renamed from: c, reason: collision with root package name */
    private final g.a f28126c;

    /* renamed from: d, reason: collision with root package name */
    private int f28127d = -1;

    /* renamed from: e, reason: collision with root package name */
    private T5.f f28128e;

    /* renamed from: f, reason: collision with root package name */
    private List<Z5.p<File, ?>> f28129f;

    /* renamed from: g, reason: collision with root package name */
    private int f28130g;

    /* renamed from: h, reason: collision with root package name */
    private volatile p.a<?> f28131h;

    /* renamed from: i, reason: collision with root package name */
    private File f28132i;

    d(List<T5.f> list, h<?> hVar, g.a aVar) {
        this.f28124a = list;
        this.f28125b = hVar;
        this.f28126c = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void a(Object obj) {
        this.f28126c.c(this.f28128e, obj, this.f28131h.f35544c, T5.a.DATA_DISK_CACHE, this.f28128e);
    }

    @Override // V5.g
    public final boolean b() {
        while (true) {
            List<Z5.p<File, ?>> list = this.f28129f;
            boolean z11 = false;
            if (list != null && this.f28130g < list.size()) {
                this.f28131h = null;
                while (!z11 && this.f28130g < this.f28129f.size()) {
                    List<Z5.p<File, ?>> list2 = this.f28129f;
                    int i11 = this.f28130g;
                    this.f28130g = i11 + 1;
                    this.f28131h = list2.get(i11).buildLoadData(this.f28132i, this.f28125b.t(), this.f28125b.f(), this.f28125b.k());
                    if (this.f28131h != null && this.f28125b.h(this.f28131h.f35544c.getDataClass()) != null) {
                        this.f28131h.f35544c.loadData(this.f28125b.l(), this);
                        z11 = true;
                    }
                }
                return z11;
            }
            int i12 = this.f28127d + 1;
            this.f28127d = i12;
            if (i12 >= this.f28124a.size()) {
                return false;
            }
            T5.f fVar = this.f28124a.get(this.f28127d);
            File a11 = this.f28125b.d().a(new e(fVar, this.f28125b.p()));
            this.f28132i = a11;
            if (a11 != null) {
                this.f28128e = fVar;
                this.f28129f = this.f28125b.j(a11);
                this.f28130g = 0;
            }
        }
    }

    @Override // V5.g
    public final void cancel() {
        p.a<?> aVar = this.f28131h;
        if (aVar != null) {
            aVar.f35544c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void onLoadFailed(@NonNull Exception exc) {
        this.f28126c.a(this.f28128e, exc, this.f28131h.f35544c, T5.a.DATA_DISK_CACHE);
    }
}
