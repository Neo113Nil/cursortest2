package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.content.Context;
import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class CellularNetworkTypeExtractor {
    public static final Companion Companion = new Companion(null);
    public static final String UNKNOWN_NETWORK_TYPE_VALUE = "unknown";

    /* renamed from: a, reason: collision with root package name */
    private final Context f6294a;

    /* renamed from: b, reason: collision with root package name */
    private final FunctionWithThrowable f6295b;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class a implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getDataNetworkType());
        }
    }

    public static final class b implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getNetworkType());
        }
    }

    public CellularNetworkTypeExtractor(Context context) {
        this.f6294a = context;
        this.f6295b = AndroidUtils.isApiAchieved(24) ? new a() : new b();
    }

    public final Context getContext() {
        return this.f6294a;
    }

    public final String getNetworkType() {
        return CellularNetworkTypeConverter.convert((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f6294a, "phone", "Extracting cellular networkType", "TelephonyManager", this.f6295b));
    }
}
