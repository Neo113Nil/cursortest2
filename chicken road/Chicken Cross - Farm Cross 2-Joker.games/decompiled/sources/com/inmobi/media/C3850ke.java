package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ke, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3850ke {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7202a;
    public final H b;
    public final boolean c;
    public final Zb d;
    public final Dd e;
    public final InterfaceC3951o1 f;
    public final Y9 g;

    public C3850ke(Context context, H adContext, boolean z, Zb telemetryMetaData, Dd adTelemetryHelper, InterfaceC3951o1 adUnitCallback, Y9 y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        Intrinsics.checkNotNullParameter(telemetryMetaData, "telemetryMetaData");
        Intrinsics.checkNotNullParameter(adTelemetryHelper, "adTelemetryHelper");
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f7202a = context;
        this.b = adContext;
        this.c = z;
        this.d = telemetryMetaData;
        this.e = adTelemetryHelper;
        this.f = adUnitCallback;
        this.g = y9;
    }
}
