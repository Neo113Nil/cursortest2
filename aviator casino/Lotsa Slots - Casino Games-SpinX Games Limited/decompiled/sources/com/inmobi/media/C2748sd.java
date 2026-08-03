package com.inmobi.media;

/* renamed from: com.inmobi.media.sd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2748sd {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5446a;
    public final com.inmobi.media.G b;
    public final boolean c;
    public final com.inmobi.media.C2457hb d;
    public final com.inmobi.media.Lc e;
    public final com.inmobi.media.InterfaceC2577m1 f;
    public final com.inmobi.media.InterfaceC2772t9 g;

    public C2748sd(android.content.Context context, com.inmobi.media.G adContext, boolean z, com.inmobi.media.C2457hb telemetryMetaData, com.inmobi.media.Lc adTelemetryHelper, com.inmobi.media.InterfaceC2577m1 adUnitCallback, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContext, "adContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryMetaData, "telemetryMetaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTelemetryHelper, "adTelemetryHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5446a = context;
        this.b = adContext;
        this.c = z;
        this.d = telemetryMetaData;
        this.e = adTelemetryHelper;
        this.f = adUnitCallback;
        this.g = interfaceC2772t9;
    }
}
