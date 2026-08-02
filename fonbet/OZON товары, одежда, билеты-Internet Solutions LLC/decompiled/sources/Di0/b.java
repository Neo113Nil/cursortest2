package Di0;

import Sc.InterfaceC4008j;
import Sc.k;
import Tc.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import if0.C7071a;
import java.util.Set;
import jf0.AbstractC7421a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f6730a = k.b(g.f6737b);

    public static final class a extends Di0.a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f6731d;

        static {
            Intrinsics.checkNotNullParameter("main_screen_destination", AppMeasurementSdk.ConditionalUserProperty.NAME);
            f6731d = new a("main_screen_destination");
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1831965480;
        }

        @NotNull
        public final String toString() {
            return "MainDestination";
        }
    }

    /* renamed from: Di0.b$b, reason: collision with other inner class name */
    public static final class C0144b extends AbstractC7421a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0144b f6732b = new C0144b("debug_menu_tracker_graph");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0144b);
        }

        public final int hashCode() {
            return -964356131;
        }

        @NotNull
        public final String toString() {
            return "NavigationGraph";
        }
    }

    public static final class c extends Di0.a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final c f6733d;

        static {
            Intrinsics.checkNotNullParameter("performance_tracker_destination", AppMeasurementSdk.ConditionalUserProperty.NAME);
            f6733d = new c("performance_tracker_destination");
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -11012855;
        }

        @NotNull
        public final String toString() {
            return "PerformanceTrackerDestination";
        }
    }

    public static final class d extends Di0.a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final d f6734d;

        static {
            Intrinsics.checkNotNullParameter("performance_tracker_events_destination", AppMeasurementSdk.ConditionalUserProperty.NAME);
            f6734d = new d("performance_tracker_events_destination");
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -305899024;
        }

        @NotNull
        public final String toString() {
            return "PerformanceTrackerEventsDestination";
        }
    }

    public static final class e extends Di0.a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final e f6735d;

        static {
            Intrinsics.checkNotNullParameter("product_tracker_screen_destination", AppMeasurementSdk.ConditionalUserProperty.NAME);
            e eVar = new e("product_tracker_screen_destination");
            f6735d = eVar;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            C7071a c7071a = new C7071a();
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            eVar.d().add(c7071a);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 891984264;
        }

        @NotNull
        public final String toString() {
            return "ProductTrackerDestination";
        }
    }

    public static final class f extends Di0.a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final f f6736d;

        static {
            Intrinsics.checkNotNullParameter("product_tracker_events_screen_destination", AppMeasurementSdk.ConditionalUserProperty.NAME);
            f6736d = new f("product_tracker_events_screen_destination");
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1169988817;
        }

        @NotNull
        public final String toString() {
            return "ProductTrackerEventsDestination";
        }
    }

    static final class g extends AbstractC7737t implements Function0<Set<? extends C7071a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f6737b = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends C7071a> invoke() {
            j builder = new j();
            builder.addAll(e.f6735d.c());
            Intrinsics.checkNotNullParameter(builder, "builder");
            return builder.b();
        }
    }

    @NotNull
    public static Set a() {
        return (Set) f6730a.getValue();
    }
}
