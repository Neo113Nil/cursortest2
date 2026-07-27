package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Sc implements InterfaceC0865tn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6592a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f6593b;

    /* renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f6594c;

    /* renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f6595d;

    public Sc(Context context) {
        this.f6592a = context;
        this.f6593b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C0878ua.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f6594c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f6595d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0865tn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Rc a() {
        Rc rc;
        try {
            rc = (Rc) this.f6595d.getData();
            if (rc != null) {
                if (this.f6595d.shouldUpdateData()) {
                }
            }
            rc = new Rc(this.f6593b.hasNecessaryPermissions(this.f6592a) ? this.f6594c.getNetworkType() : CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
            this.f6595d.setData(rc);
        } catch (Throwable th) {
            throw th;
        }
        return rc;
    }
}
