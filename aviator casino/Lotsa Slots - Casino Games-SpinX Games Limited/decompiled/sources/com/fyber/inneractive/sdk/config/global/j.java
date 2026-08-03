package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class j implements com.fyber.inneractive.sdk.config.global.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3607a;
    public final boolean b;

    public j(boolean z, java.lang.String str) {
        this.f3607a = str;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    @Override // com.fyber.inneractive.sdk.config.global.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.fyber.inneractive.sdk.config.global.e eVar) {
        boolean z;
        boolean z2;
        if (android.text.TextUtils.isEmpty(this.f3607a)) {
            return false;
        }
        java.lang.String version = com.fyber.inneractive.sdk.external.InneractiveAdManager.getVersion();
        com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApply - running version: %s", "j", version);
        com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApply - filter version: %s", "j", this.f3607a);
        java.lang.String[] split = version.split("\\.", 4);
        java.lang.String[] split2 = this.f3607a.split("\\.", 4);
        java.lang.String str = split2[split2.length - 1];
        if (str.equals("*")) {
            for (int i = 0; i < split2.length - 1; i++) {
                if (split.length < i) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApplyByAsterix - running version is shorter than filter. applying", "j");
                } else if (!split[i].equals(split2[i])) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApplyByAsterix - running version does not comply with filter. applying", "j");
                }
                z2 = true;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", "j");
            z2 = false;
            com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApply - * version match: %b", "j", java.lang.Boolean.valueOf(!z2));
            return z2 ? this.b : !this.b;
        }
        if (!str.equals(org.slf4j.Marker.ANY_NON_NULL_MARKER)) {
            boolean equalsIgnoreCase = this.f3607a.equalsIgnoreCase(version);
            boolean z3 = !equalsIgnoreCase;
            com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApply - exact version match: %b", "j", java.lang.Boolean.valueOf(equalsIgnoreCase));
            return z3 ? this.b : !this.b;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= split2.length - 1) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", "j");
                break;
            }
            if (split.length < i2) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApplyByPlus - running version is shorter than filter. applying", "j");
                break;
            }
            try {
                int intValue = java.lang.Integer.valueOf(split2[i2]).intValue();
                int intValue2 = java.lang.Integer.valueOf(split[i2]).intValue();
                if (intValue2 > intValue) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApplyByPlus - running version is greater than the filter's version. no filter needed", "j");
                    break;
                }
                if (intValue2 < intValue) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApplyByPlus - running version is lower than the filter's version. applying filter ", "j");
                    break;
                }
                i2++;
            } catch (java.lang.NumberFormatException e) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApplyByPlus - Error in version string! Not a number. %s", "j", e.getMessage());
            }
        }
        z = false;
        com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApply - + version match: %b", "j", java.lang.Boolean.valueOf(!z));
        return !z ? this.b : !this.b;
        z = true;
        com.fyber.inneractive.sdk.util.IAlog.a("%s: shouldApply - + version match: %b", "j", java.lang.Boolean.valueOf(!z));
        if (!z) {
        }
    }

    public final java.lang.String toString() {
        return "sdk - " + this.f3607a + " include: " + this.b;
    }
}
