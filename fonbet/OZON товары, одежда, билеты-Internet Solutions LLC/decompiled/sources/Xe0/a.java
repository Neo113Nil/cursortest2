package Xe0;

import Sc.k;
import Sc.n;
import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.DummyLocationManager;
import com.yandex.mapkit.location.Location;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.C9867b;
import we0.p;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final MapKit f34419a = MapKitFactory.getInstance();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f34420b = k.a(n.NONE, new C0621a());

    /* renamed from: c, reason: collision with root package name */
    private boolean f34421c;

    /* renamed from: Xe0.a$a, reason: collision with other inner class name */
    static final class C0621a extends AbstractC7737t implements Function0<DummyLocationManager> {
        C0621a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DummyLocationManager invoke() {
            return a.this.f34419a.createDummyLocationManager();
        }
    }

    public final void b() {
        this.f34419a.resetLocationManagerToDefault();
        this.f34421c = false;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Sc.j, java.lang.Object] */
    public final void c(@NotNull p location, long j11) {
        Intrinsics.checkNotNullParameter(location, "location");
        C9867b c9867b = C9867b.f99466a;
        C9867b.g("YandexDummyLocationManager: setting new point - " + location.e(), null, 6);
        boolean z11 = this.f34421c;
        ?? r42 = this.f34420b;
        if (!z11) {
            this.f34419a.setLocationManager((DummyLocationManager) r42.getValue());
            this.f34421c = true;
        }
        ((DummyLocationManager) r42.getValue()).setLocation(new Location(new Point(location.e().getLatitude(), location.e().getLongitude()), location.b() != null ? Double.valueOf(r1.floatValue()) : null, location.c(), null, location.d() != null ? Double.valueOf(r1.floatValue()) : null, location.f() != null ? Double.valueOf(r1.floatValue()) : null, null, System.currentTimeMillis(), System.currentTimeMillis() - j11));
    }
}
