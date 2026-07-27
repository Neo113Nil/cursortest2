package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925w5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8543a;

    /* renamed from: b, reason: collision with root package name */
    public final C0582j f8544b = C0878ua.k().b();

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f8545c = EnumSet.of(NetworkType.OFFLINE);

    /* renamed from: d, reason: collision with root package name */
    public final String f8546d = "connection based";

    public C0925w5(Context context) {
        this.f8543a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C0582j c0582j = this.f8544b;
        Context context = this.f8543a;
        c0582j.getClass();
        He he = Le.f6229a;
        return !this.f8545c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ke()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f8546d;
    }
}
