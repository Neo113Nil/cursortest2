package Pe0;

import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.style.layers.SymbolLayer;
import org.maplibre.android.style.sources.GeoJsonSource;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final AtomicLong f22410c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f22411a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f22412b;

    public o() {
        long incrementAndGet = f22410c.incrementAndGet();
        this.f22411a = V.e.b(new Object[]{Long.valueOf(incrementAndGet)}, 1, "maplibre-android-symbol-layer-%s", "format(...)");
        this.f22412b = V.e.b(new Object[]{Long.valueOf(incrementAndGet)}, 1, "maplibre-android-symbol-source-%s", "format(...)");
    }

    @NotNull
    public final SymbolLayer a() {
        return new SymbolLayer(this.f22411a, this.f22412b);
    }

    @NotNull
    public final String b() {
        return this.f22411a;
    }

    @NotNull
    public final GeoJsonSource c(org.maplibre.android.style.sources.a aVar) {
        return new GeoJsonSource(this.f22412b, aVar);
    }

    @NotNull
    public final String d() {
        return this.f22412b;
    }
}
