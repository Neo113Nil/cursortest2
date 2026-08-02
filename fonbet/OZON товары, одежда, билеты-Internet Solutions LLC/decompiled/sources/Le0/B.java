package Le0;

import Ae.C0;
import Ae.C2399j;
import Ae.C2417s0;
import Ae.E0;
import Sc.r;
import ie0.C7064a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.data.model.VectorData;
import te0.C9867b;
import xe.B0;
import xe.C10727i;
import xe.H0;

/* loaded from: classes3.dex */
public final class B extends Ie0.a {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final w f16859f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f16860g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private we0.y f16861h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C0 f16862i;

    /* renamed from: j, reason: collision with root package name */
    private B0 f16863j;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16864a;

        static {
            int[] iArr = new int[we0.y.values().length];
            try {
                iArr[we0.y.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[we0.y.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16864a = iArr;
        }
    }

    public B(@NotNull w mapView, @NotNull MapLibreMap mapLibreMap) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        this.f16859f = mapView;
        this.f16860g = mapLibreMap;
        this.f16861h = we0.y.LIGHT;
        this.f16862i = E0.b(0, 0, null, 7);
        this.f16863j = C2399j.C(new C2417s0(C2399j.e(new F(mapLibreMap, null)), C2399j.e(new J(mapView, null)), new A(this, null)), d());
    }

    @Override // Ie0.c
    @NotNull
    public final we0.y a() {
        return this.f16861h;
    }

    @Override // Ie0.c
    public final void b(@NotNull we0.y nv2) {
        Object a11;
        GeoProviderConfig g10;
        Object obj;
        Intrinsics.checkNotNullParameter(nv2, "nv");
        if (nv2 == this.f16861h) {
            return;
        }
        try {
            r.Companion companion = Sc.r.INSTANCE;
            C7064a.f66281a.getClass();
            g10 = C7064a.g();
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (g10 == null) {
            throw new IllegalStateException("GeoProvider is null");
        }
        VectorData parseVector = g10.parseVector();
        if (parseVector == null) {
            throw new IllegalStateException("VectorData is null");
        }
        if (!parseVector.isSupportThemes()) {
            throw new IllegalStateException("Themes not supported");
        }
        Map<String, String> styleUrls = parseVector.getStyleUrls();
        String str = "light";
        if (styleUrls != null) {
            int i11 = a.f16864a[nv2.ordinal()];
            if (i11 == 1) {
                obj = "light";
            } else {
                if (i11 != 2) {
                    throw new Sc.o();
                }
                obj = "dark";
            }
            String str2 = styleUrls.get(obj);
            if (str2 != null) {
                a11 = new Sc.v(g10, parseVector, str2);
                Sc.v vVar = (Sc.v) (a11 instanceof r.b ? null : a11);
                if (vVar != null) {
                    C10727i.c(d(), null, null, new I(this, (String) vVar.d(), (VectorData) vVar.b(), (GeoProviderConfig) vVar.a(), nv2, null), 3);
                    return;
                }
                C9867b c9867b = C9867b.f99466a;
                C9867b.g("Failed switch theme - " + nv2 + " case: " + Sc.r.b(a11) + ", Logger.LogLevel.ERROR", null, 6);
                C10727i.c(d(), null, null, new G(this, null), 3);
                return;
            }
        }
        int i12 = a.f16864a[nv2.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                throw new Sc.o();
            }
            str = "dark";
        }
        throw new IllegalStateException("Style URL not found for theme: ".concat(str).toString());
    }

    @Override // Ie0.a
    public final void g() {
        B0 b02 = this.f16863j;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        super.g();
    }
}
