package y3;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class l implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public C1568b f12418a;

    /* renamed from: b, reason: collision with root package name */
    public m f12419b;

    /* renamed from: c, reason: collision with root package name */
    public n f12420c;

    /* renamed from: d, reason: collision with root package name */
    public g f12421d;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        try {
            this.f12419b.R(this.f12418a, this.f12421d.e());
            this.f12420c.b(this.f12419b, obj, obj2, this.f12421d);
            this.f12419b.H();
        } catch (IOException e3) {
            throw new UncheckedIOException(e3);
        }
    }
}
