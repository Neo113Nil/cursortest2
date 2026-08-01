package com.chartboost.sdk.tracking;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.tracking.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends f {
    public static final C0232a m = new C0232a(null);

    /* renamed from: com.chartboost.sdk.tracking.a$a, reason: collision with other inner class name */
    public static final class C0232a {
        public /* synthetic */ C0232a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(g name, String message, String adType, String location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(location, "location");
            return new a(name, message, adType, location, null, null, 48, null);
        }

        public C0232a() {
        }

        public final a a(g name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new a(name, message, null, null, null, null, 60, null);
        }
    }

    public static final a a(g gVar, String str) {
        return m.a(gVar, str);
    }

    public static final a a(g gVar, String str, String str2, String str3) {
        return m.a(gVar, str, str2, str3);
    }

    public /* synthetic */ a(g gVar, String str, String str2, String str3, Mediation mediation, TrackAd trackAd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation, (i & 32) != 0 ? new TrackAd(null, null, null, null, null, null, null, null, 255, null) : trackAd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g name, String message, String adType, String location, Mediation mediation, TrackAd trackAd) {
        super(name, message, adType, location, mediation, f.b.c, trackAd, false, false, 0L, 0.0f, f.a.c, 1920, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(trackAd, "trackAd");
    }
}
