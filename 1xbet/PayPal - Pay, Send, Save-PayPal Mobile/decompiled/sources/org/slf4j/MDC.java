package org.slf4j;

/* loaded from: classes18.dex */
public class MDC {
    static org.slf4j.spi.MDCAdapter getHighSpeedVideoFpsRangesFor;

    public static class MDCCloseable implements java.io.Closeable {
        private final java.lang.String Camera2StreamConfigurationMap;

        /* synthetic */ MDCCloseable(java.lang.String str, byte b) {
            this(str);
        }

        private MDCCloseable(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            org.slf4j.MDC.remove(this.Camera2StreamConfigurationMap);
        }
    }

    private MDC() {
    }

    public static void put(java.lang.String str, java.lang.String str2) throws java.lang.IllegalArgumentException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key parameter cannot be null");
        }
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().put(str, str2);
    }

    public static org.slf4j.MDC.MDCCloseable putCloseable(java.lang.String str, java.lang.String str2) throws java.lang.IllegalArgumentException {
        put(str, str2);
        return new org.slf4j.MDC.MDCCloseable(str, (byte) 0);
    }

    public static java.lang.String get(java.lang.String str) throws java.lang.IllegalArgumentException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key parameter cannot be null");
        }
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return getMDCAdapter().get(str);
    }

    public static void remove(java.lang.String str) throws java.lang.IllegalArgumentException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key parameter cannot be null");
        }
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().remove(str);
    }

    public static void clear() {
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().clear();
    }

    public static java.util.Map<java.lang.String, java.lang.String> getCopyOfContextMap() {
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return getMDCAdapter().getCopyOfContextMap();
    }

    public static void setContextMap(java.util.Map<java.lang.String, java.lang.String> map) {
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().setContextMap(map);
    }

    public static org.slf4j.spi.MDCAdapter getMDCAdapter() {
        org.slf4j.spi.MDCAdapter nOPMDCAdapter;
        if (getHighSpeedVideoFpsRangesFor == null) {
            org.slf4j.spi.SLF4JServiceProvider Camera2StreamConfigurationMap = org.slf4j.LoggerFactory.Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap != null) {
                nOPMDCAdapter = Camera2StreamConfigurationMap.getMDCAdapter();
                if (Camera2StreamConfigurationMap instanceof org.slf4j.helpers.SubstituteServiceProvider) {
                    org.slf4j.helpers.Reporter.info("Temporary mdcAdapter given by SubstituteServiceProvider.");
                    org.slf4j.helpers.Reporter.info("This mdcAdapter will be replaced after backend initialization has completed.");
                }
            } else {
                org.slf4j.helpers.Reporter.error("Failed to find provider.");
                org.slf4j.helpers.Reporter.error("Defaulting to no-operation MDCAdapter implementation.");
                nOPMDCAdapter = new org.slf4j.helpers.NOPMDCAdapter();
            }
            getHighSpeedVideoFpsRangesFor = nOPMDCAdapter;
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    static void getHighResolutionOutputSizeshNQ4ISI(org.slf4j.spi.MDCAdapter mDCAdapter) {
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getHighSpeedVideoFpsRangesFor = mDCAdapter;
    }

    public static void pushByKey(java.lang.String str, java.lang.String str2) {
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        getMDCAdapter().pushByKey(str, str2);
    }

    public static java.lang.String popByKey(java.lang.String str) {
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return getMDCAdapter().popByKey(str);
    }

    public java.util.Deque<java.lang.String> getCopyOfDequeByKey(java.lang.String str) {
        if (getMDCAdapter() == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return getMDCAdapter().getCopyOfDequeByKey(str);
    }
}
