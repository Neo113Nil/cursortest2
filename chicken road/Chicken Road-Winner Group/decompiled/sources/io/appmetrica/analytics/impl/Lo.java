package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final /* synthetic */ class Lo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6260e;

    public /* synthetic */ Lo(Object obj, String str, String str2, Object obj2, int i3) {
        this.f6256a = i3;
        this.f6259d = obj;
        this.f6257b = str;
        this.f6258c = str2;
        this.f6260e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6256a) {
            case 0:
                D0.a((D0) this.f6259d, this.f6257b, this.f6258c, (String) this.f6260e);
                break;
            default:
                J0.a((J0) this.f6259d, this.f6257b, this.f6258c, (PluginErrorDetails) this.f6260e);
                break;
        }
    }
}
