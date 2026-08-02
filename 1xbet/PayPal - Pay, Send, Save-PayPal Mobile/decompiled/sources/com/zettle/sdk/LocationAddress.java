package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019BC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/LocationAddress;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "addressLine1", "Ljava/lang/String;", "getAddressLine1", "()Ljava/lang/String;", "addressLine2", "getAddressLine2", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "getCity", "countryCode", "getCountryCode", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "getPostalCode", "state", "getState", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LocationAddress {
    public static final int ADDRESS_LINE_MAX_LENGTH = 300;
    public static final int CITY_MAX_LENGTH = 300;
    public static final int COUNTRY_CODE_LENGTH = 2;
    public static final int POSTAL_CODE_MAX_LENGTH = 60;
    public static final int STATE_MAX_LENGTH = 300;
    private final java.lang.String addressLine1;
    private final java.lang.String addressLine2;
    private final java.lang.String city;
    private final java.lang.String countryCode;
    private final java.lang.String postalCode;
    private final java.lang.String state;

    private LocationAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.countryCode = str;
        this.addressLine1 = str2;
        this.addressLine2 = str3;
        this.postalCode = str4;
        this.city = str5;
        this.state = str6;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getAddressLine1() {
        return this.addressLine1;
    }

    public final java.lang.String getAddressLine2() {
        return this.addressLine2;
    }

    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    public final java.lang.String getCity() {
        return this.city;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0007R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/LocationAddress$Builder;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addressLine1", "(Ljava/lang/String;)Lcom/zettle/sdk/LocationAddress$Builder;", "addressLine2", "Lcom/zettle/sdk/LocationAddress;", "build", "()Lcom/zettle/sdk/LocationAddress;", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "countryCode", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "state", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private java.lang.String getInputSizeshNQ4ISI;

        public final com.zettle.sdk.LocationAddress.Builder countryCode(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (value.length() != 2) {
                int length = value.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("countryCode must be exactly 2 characters (ISO 3166-1). Got: '");
                sb.append(value);
                sb.append("' (");
                sb.append(length);
                sb.append(" chars)");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.getHighSpeedVideoFpsRanges = value;
            return this;
        }

        public final com.zettle.sdk.LocationAddress.Builder addressLine1(java.lang.String value) {
            if (value != null && value.length() > 300) {
                int length = value.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("addressLine1 exceeds max length of 300 characters. Got: ");
                sb.append(length);
                sb.append(" chars");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = value;
            return this;
        }

        public final com.zettle.sdk.LocationAddress.Builder addressLine2(java.lang.String value) {
            if (value != null && value.length() > 300) {
                int length = value.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("addressLine2 exceeds max length of 300 characters. Got: ");
                sb.append(length);
                sb.append(" chars");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.Camera2StreamConfigurationMap = value;
            return this;
        }

        public final com.zettle.sdk.LocationAddress.Builder postalCode(java.lang.String value) {
            if (value != null && value.length() > 60) {
                int length = value.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("postalCode exceeds max length of 60 characters. Got: ");
                sb.append(length);
                sb.append(" chars");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.getHighSpeedVideoSizes = value;
            return this;
        }

        public final com.zettle.sdk.LocationAddress.Builder city(java.lang.String value) {
            if (value != null && value.length() > 300) {
                int length = value.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("city exceeds max length of 300 characters. Got: ");
                sb.append(length);
                sb.append(" chars");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.getHighSpeedVideoFpsRangesFor = value;
            return this;
        }

        public final com.zettle.sdk.LocationAddress.Builder state(java.lang.String value) {
            if (value != null && value.length() > 300) {
                int length = value.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("state exceeds max length of 300 characters. Got: ");
                sb.append(length);
                sb.append(" chars");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.getInputSizeshNQ4ISI = value;
            return this;
        }

        public final com.zettle.sdk.LocationAddress build() {
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("countryCode is required. Use countryCode(String) to set it.".toString());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            return new com.zettle.sdk.LocationAddress(str, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, null);
        }
    }

    public /* synthetic */ LocationAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6);
    }
}
