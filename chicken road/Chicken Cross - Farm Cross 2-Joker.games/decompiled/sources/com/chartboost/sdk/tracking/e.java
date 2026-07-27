package com.chartboost.sdk.tracking;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.tracking.f;
import com.chartboost.sdk.tracking.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends f {
    public static final a m = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public final boolean n() {
        g f = f();
        return f == g.a.e || f == g.a.f || f == g.i.d || f == g.i.e;
    }

    public /* synthetic */ e(g gVar, String str, String str2, String str3, Mediation mediation, TrackAd trackAd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation, (i & 32) != 0 ? new TrackAd(null, null, null, null, null, null, null, null, 255, null) : trackAd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g name, String message, String adType, String location, Mediation mediation, TrackAd trackAd) {
        super(name, message, adType, location, mediation, f.b.b, trackAd, false, false, 0L, 0.0f, f.a.b, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
        if (n()) {
            a(f.a.c);
            a(true);
        }
    }
}
