package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4785a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4786b;

    /* renamed from: c, reason: collision with root package name */
    public String f4787c;

    /* renamed from: d, reason: collision with root package name */
    public AdUnitConfig f4788d;

    /* renamed from: e, reason: collision with root package name */
    public String f4789e;
    public Point f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f4790g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f4791h;

    /* renamed from: i, reason: collision with root package name */
    public String f4792i;

    public z9(Context context, AdPreferences preferences, AdPreferences.Placement placement, ib httpClient, ib networkApiExecutor, ib eventTracer, ib motionProcessor) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(preferences, "preferences");
        kotlin.jvm.internal.j.e(placement, "placement");
        kotlin.jvm.internal.j.e(httpClient, "httpClient");
        kotlin.jvm.internal.j.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.j.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.j.e(motionProcessor, "motionProcessor");
        this.f4791h = 1;
    }
}
