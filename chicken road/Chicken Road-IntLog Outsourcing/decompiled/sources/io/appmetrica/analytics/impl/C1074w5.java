package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074w5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9500a;

    /* renamed from: b, reason: collision with root package name */
    public final C0731j f9501b = C1027ua.k().b();

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f9502c = EnumSet.of(NetworkType.OFFLINE);

    /* renamed from: d, reason: collision with root package name */
    public final String f9503d = "connection based";

    public C1074w5(Context context) {
        this.f9500a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C0731j c0731j = this.f9501b;
        Context context = this.f9500a;
        c0731j.getClass();
        He he = Le.f7085a;
        return !this.f9502c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ke()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f9503d;
    }
}
