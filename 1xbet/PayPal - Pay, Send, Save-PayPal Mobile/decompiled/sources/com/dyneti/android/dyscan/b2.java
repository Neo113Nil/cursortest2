package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract class b2 {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c3, code lost:
    
        if (r8.equals(util.h.xy.cb.b.f1091) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String a(org.json.JSONObject jSONObject) {
        char c;
        java.lang.String str;
        java.lang.String optString = jSONObject.optString("scanId");
        if (optString.isEmpty()) {
            return "";
        }
        java.lang.String[][] strArr = {new java.lang.String[]{"cardBIN", "i"}, new java.lang.String[]{"lastFourDigits", "i"}, new java.lang.String[]{"buildVersion", lib.android.paypal.com.magnessdk.g.n2}, new java.lang.String[]{"timeTakenInMilliseconds", "i"}, new java.lang.String[]{"deviceModel", lib.android.paypal.com.magnessdk.g.n2}, new java.lang.String[]{"deviceName", lib.android.paypal.com.magnessdk.g.n2}, new java.lang.String[]{"hasName", util.h.xy.cb.b.f1091}, new java.lang.String[]{"hasLogo", util.h.xy.cb.b.f1091}, new java.lang.String[]{"hasSignature", util.h.xy.cb.b.f1091}, new java.lang.String[]{"batteryLevel", "d"}, new java.lang.String[]{"deviceTimestamp", "i"}, new java.lang.String[]{"uptime", "i"}, new java.lang.String[]{"processName", lib.android.paypal.com.magnessdk.g.n2}, new java.lang.String[]{"formatMismatch", util.h.xy.cb.b.f1091}, new java.lang.String[]{"numberMismatch", util.h.xy.cb.b.f1091}, new java.lang.String[]{"generatedImage", util.h.xy.cb.b.f1091}, new java.lang.String[]{"rateLimited", util.h.xy.cb.b.f1091}, new java.lang.String[]{"tamperedFeatures", util.h.xy.cb.b.f1091}, new java.lang.String[]{"fraudResultScore", "d"}, new java.lang.String[]{"fraudResultMedian", "d"}, new java.lang.String[]{"tapeScore", "d"}};
        java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.room.RoomMasterTable.DEFAULT_ID);
        for (int i = 0; i < 21; i++) {
            java.lang.String[] strArr2 = strArr[i];
            java.lang.String str2 = strArr2[0];
            java.lang.String str3 = strArr2[1];
            java.lang.Object opt = jSONObject.opt(str2);
            if (opt != null) {
                str3.hashCode();
                int hashCode = str3.hashCode();
                if (hashCode == 98) {
                    if (str3.equals(util.h.xy.cb.b.f1091)) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode == 100) {
                    if (str3.equals("d")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 105) {
                    if (hashCode == 115 && str3.equals(lib.android.paypal.com.magnessdk.g.n2)) {
                        c = 3;
                        if (c != 0) {
                            if ((opt instanceof java.lang.Boolean) && ((java.lang.Boolean) opt).booleanValue()) {
                                str = "on";
                            }
                            str = kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF;
                        } else if (c == 1) {
                            if (opt instanceof java.lang.Double) {
                                str = java.lang.String.format(java.util.Locale.US, "%.3f", opt);
                            }
                            str = "";
                        } else if (c != 2) {
                            if (c == 3 && (opt instanceof java.lang.String)) {
                                str = (java.lang.String) opt;
                            }
                            str = "";
                        } else {
                            if (opt instanceof java.lang.Number) {
                                str = opt.toString();
                            }
                            str = "";
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (str3.equals("i")) {
                        c = 2;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
            sb.append(str);
        }
        sb.append(42);
        java.util.UUID fromString = java.util.UUID.fromString(optString);
        byte[] bytes = sb.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bytes.length + 16);
        allocate.putLong(fromString.getMostSignificantBits());
        allocate.putLong(fromString.getLeastSignificantBits());
        allocate.put(bytes);
        return java.util.UUID.nameUUIDFromBytes(allocate.array()).toString().toLowerCase(java.util.Locale.US);
    }
}
