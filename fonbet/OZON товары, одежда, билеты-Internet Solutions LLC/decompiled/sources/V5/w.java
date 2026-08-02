package V5;

import V5.g;
import Z5.p;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class w implements g, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f28299a;

    /* renamed from: b, reason: collision with root package name */
    private final h<?> f28300b;

    /* renamed from: c, reason: collision with root package name */
    private int f28301c;

    /* renamed from: d, reason: collision with root package name */
    private int f28302d = -1;

    /* renamed from: e, reason: collision with root package name */
    private T5.f f28303e;

    /* renamed from: f, reason: collision with root package name */
    private List<Z5.p<File, ?>> f28304f;

    /* renamed from: g, reason: collision with root package name */
    private int f28305g;

    /* renamed from: h, reason: collision with root package name */
    private volatile p.a<?> f28306h;

    /* renamed from: i, reason: collision with root package name */
    private File f28307i;

    /* renamed from: j, reason: collision with root package name */
    private x f28308j;

    w(h<?> hVar, g.a aVar) {
        this.f28300b = hVar;
        this.f28299a = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void a(Object obj) {
        this.f28299a.c(this.f28303e, obj, this.f28306h.f35544c, T5.a.RESOURCE_DISK_CACHE, this.f28308j);
    }

    @Override // V5.g
    public final boolean b() {
        ArrayList c11 = this.f28300b.c();
        boolean z11 = false;
        if (!c11.isEmpty()) {
            List<Class<?>> m11 = this.f28300b.m();
            if (!m11.isEmpty()) {
                while (true) {
                    List<Z5.p<File, ?>> list = this.f28304f;
                    if (list != null && this.f28305g < list.size()) {
                        this.f28306h = null;
                        while (!z11 && this.f28305g < this.f28304f.size()) {
                            List<Z5.p<File, ?>> list2 = this.f28304f;
                            int i11 = this.f28305g;
                            this.f28305g = i11 + 1;
                            this.f28306h = list2.get(i11).buildLoadData(this.f28307i, this.f28300b.t(), this.f28300b.f(), this.f28300b.k());
                            if (this.f28306h != null && this.f28300b.h(this.f28306h.f35544c.getDataClass()) != null) {
                                this.f28306h.f35544c.loadData(this.f28300b.l(), this);
                                z11 = true;
                            }
                        }
                        return z11;
                    }
                    int i12 = this.f28302d + 1;
                    this.f28302d = i12;
                    if (i12 >= m11.size()) {
                        int i13 = this.f28301c + 1;
                        this.f28301c = i13;
                        if (i13 >= c11.size()) {
                            break;
                        }
                        this.f28302d = 0;
                    }
                    T5.f fVar = (T5.f) c11.get(this.f28301c);
                    Class<?> cls = m11.get(this.f28302d);
                    this.f28308j = new x(this.f28300b.b(), fVar, this.f28300b.p(), this.f28300b.t(), this.f28300b.f(), this.f28300b.s(cls), cls, this.f28300b.k());
                    File a11 = this.f28300b.d().a(this.f28308j);
                    this.f28307i = a11;
                    if (a11 != null) {
                        this.f28303e = fVar;
                        this.f28304f = this.f28300b.j(a11);
                        this.f28305g = 0;
                    }
                }
            } else if (!File.class.equals(this.f28300b.r())) {
                throw new IllegalStateException("Failed to find any load path from " + this.f28300b.i() + " to " + this.f28300b.r());
            }
        }
        return false;
    }

    @Override // V5.g
    public final void cancel() {
        p.a<?> aVar = this.f28306h;
        if (aVar != null) {
            aVar.f35544c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void onLoadFailed(@NonNull Exception exc) {
        this.f28299a.a(this.f28308j, exc, this.f28306h.f35544c, T5.a.RESOURCE_DISK_CACHE);
    }
}
