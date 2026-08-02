package com.paypal.oslo.feature.bnplacquisition.config;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "US", "DE", "AU", "FR", "CA", "GB", "ES", "IT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Country {
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country AU;
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country CA;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country DE;
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country ES;
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country FR;
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country GB;
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country IT;
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country UNKNOWN;
    public static final com.paypal.oslo.feature.bnplacquisition.config.Country US;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.config.Country[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private Country(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.config.Country country = new com.paypal.oslo.feature.bnplacquisition.config.Country("US", 0);
        US = country;
        com.paypal.oslo.feature.bnplacquisition.config.Country country2 = new com.paypal.oslo.feature.bnplacquisition.config.Country("DE", 1);
        DE = country2;
        com.paypal.oslo.feature.bnplacquisition.config.Country country3 = new com.paypal.oslo.feature.bnplacquisition.config.Country("AU", 2);
        AU = country3;
        com.paypal.oslo.feature.bnplacquisition.config.Country country4 = new com.paypal.oslo.feature.bnplacquisition.config.Country("FR", 3);
        FR = country4;
        com.paypal.oslo.feature.bnplacquisition.config.Country country5 = new com.paypal.oslo.feature.bnplacquisition.config.Country("CA", 4);
        CA = country5;
        com.paypal.oslo.feature.bnplacquisition.config.Country country6 = new com.paypal.oslo.feature.bnplacquisition.config.Country("GB", 5);
        GB = country6;
        com.paypal.oslo.feature.bnplacquisition.config.Country country7 = new com.paypal.oslo.feature.bnplacquisition.config.Country("ES", 6);
        ES = country7;
        com.paypal.oslo.feature.bnplacquisition.config.Country country8 = new com.paypal.oslo.feature.bnplacquisition.config.Country("IT", 7);
        IT = country8;
        com.paypal.oslo.feature.bnplacquisition.config.Country country9 = new com.paypal.oslo.feature.bnplacquisition.config.Country("UNKNOWN", 8);
        UNKNOWN = country9;
        com.paypal.oslo.feature.bnplacquisition.config.Country[] countryArr = {country, country2, country3, country4, country5, country6, country7, country8, country9};
        getHighResolutionOutputSizeshNQ4ISI = countryArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(countryArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.config.Country.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/config/Country$Companion;", "", "<init>", "()V", "", "code", "Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", "fromCode", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/config/Country;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.config.Country fromCode(java.lang.String code) {
            java.lang.String str;
            if (code != null) {
                str = code.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 2100) {
                    if (hashCode != 2142) {
                        if (hashCode != 2177) {
                            if (hashCode != 2222) {
                                if (hashCode != 2252) {
                                    if (hashCode != 2267) {
                                        if (hashCode != 2347) {
                                            if (hashCode == 2718 && str.equals("US")) {
                                                return com.paypal.oslo.feature.bnplacquisition.config.Country.US;
                                            }
                                        } else if (str.equals("IT")) {
                                            return com.paypal.oslo.feature.bnplacquisition.config.Country.IT;
                                        }
                                    } else if (str.equals("GB")) {
                                        return com.paypal.oslo.feature.bnplacquisition.config.Country.GB;
                                    }
                                } else if (str.equals("FR")) {
                                    return com.paypal.oslo.feature.bnplacquisition.config.Country.FR;
                                }
                            } else if (str.equals("ES")) {
                                return com.paypal.oslo.feature.bnplacquisition.config.Country.ES;
                            }
                        } else if (str.equals("DE")) {
                            return com.paypal.oslo.feature.bnplacquisition.config.Country.DE;
                        }
                    } else if (str.equals("CA")) {
                        return com.paypal.oslo.feature.bnplacquisition.config.Country.CA;
                    }
                } else if (str.equals("AU")) {
                    return com.paypal.oslo.feature.bnplacquisition.config.Country.AU;
                }
            }
            return com.paypal.oslo.feature.bnplacquisition.config.Country.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.Country[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.config.Country[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.Country valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.config.Country) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.config.Country.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.config.Country> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
