package com.razorpay;

/* loaded from: classes4.dex */
class CoreConfig extends BaseConfig {
    private static BaseConfig l$1_I$l$;

    private CoreConfig() {
    }

    public static BaseConfig getInstance() {
        if (l$1_I$l$ == null) {
            l$1_I$l$ = new CoreConfig();
        }
        return l$1_I$l$;
    }

    public static void setInstance(BaseConfig baseConfig) {
        l$1_I$l$ = baseConfig;
    }
}
