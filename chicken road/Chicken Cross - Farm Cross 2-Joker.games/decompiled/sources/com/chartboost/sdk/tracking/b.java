package com.chartboost.sdk.tracking;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.tracking.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends f {
    public static final a m = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(g name, String message) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(message, "message");
            return new b(name, message, null, null, null, 28, null);
        }

        public a() {
        }
    }

    public static final b a(g gVar, String str) {
        return m.a(gVar, str);
    }

    public /* synthetic */ b(g gVar, String str, String str2, String str3, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : mediation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g name, String message, String adType, String location, Mediation mediation) {
        super(name, message, adType, location, mediation, f.b.d, null, false, false, 0L, 0.0f, f.a.c, 1984, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
    }
}
