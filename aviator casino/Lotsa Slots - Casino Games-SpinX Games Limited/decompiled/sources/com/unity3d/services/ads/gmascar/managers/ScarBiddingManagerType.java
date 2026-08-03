package com.unity3d.services.ads.gmascar.managers;

/* loaded from: classes5.dex */
public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");

    private final java.lang.String name;

    ScarBiddingManagerType(java.lang.String str) {
        this.name = str;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public static com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType fromName(java.lang.String str) {
        int hashCode = str.hashCode();
        if (hashCode == 99470) {
            str.equals("dis");
        } else if (hashCode == 100171 && str.equals("eag")) {
            return EAGER;
        }
        return DISABLED;
    }

    private static class Constants {
        private static final java.lang.String DIS = "dis";
        private static final java.lang.String EAG = "eag";

        private Constants() {
        }
    }
}
