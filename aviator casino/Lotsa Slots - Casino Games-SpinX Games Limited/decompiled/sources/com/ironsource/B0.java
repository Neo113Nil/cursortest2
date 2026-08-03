package com.ironsource;

/* loaded from: classes5.dex */
public class B0 {
    public static int a(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int b(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return 1021;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return 1020;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return 1019;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            return 1018;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int c(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int d(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return 1027;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int e(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return 1024;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int f(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL || aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int g(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return 1022;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int h(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_SHOW_EXCEPTION;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_EXCEPTION;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }
}
