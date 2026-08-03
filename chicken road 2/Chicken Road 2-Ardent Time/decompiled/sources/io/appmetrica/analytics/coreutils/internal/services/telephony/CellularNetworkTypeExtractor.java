package io.appmetrica.analytics.coreutils.internal.services.telephony;

/* loaded from: classes.dex */
public final class CellularNetworkTypeExtractor {
    public static final io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.Companion Companion = new io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.Companion(null);
    public static final java.lang.String UNKNOWN_NETWORK_TYPE_VALUE = "unknown";

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f3791a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable f3792b;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        private Companion() {
        }
    }

    @io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
    @android.annotation.TargetApi(24)
    public static final class a implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable<android.telephony.TelephonyManager, java.lang.Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Integer apply(android.telephony.TelephonyManager telephonyManager) {
            return java.lang.Integer.valueOf(telephonyManager.getDataNetworkType());
        }
    }

    @io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
    public static final class b implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable<android.telephony.TelephonyManager, java.lang.Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Integer apply(android.telephony.TelephonyManager telephonyManager) {
            return java.lang.Integer.valueOf(telephonyManager.getNetworkType());
        }
    }

    public CellularNetworkTypeExtractor(android.content.Context context) {
        this.f3791a = context;
        this.f3792b = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(24) ? new io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.a() : new io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.b();
    }

    public final android.content.Context getContext() {
        return this.f3791a;
    }

    public final java.lang.String getNetworkType() {
        return io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeConverter.convert((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(this.f3791a, "phone", "Extracting cellular networkType", "TelephonyManager", this.f3792b));
    }
}
