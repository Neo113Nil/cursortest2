package org.slf4j;

/* loaded from: classes6.dex */
public class MDC {
    private static final java.lang.String MDC_APAPTER_CANNOT_BE_NULL_MESSAGE = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA";
    static final java.lang.String NO_STATIC_MDC_BINDER_URL = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    static final java.lang.String NULL_MDCA_URL = "http://www.slf4j.org/codes.html#null_MDCA";
    static org.slf4j.spi.MDCAdapter mdcAdapter;

    public static class MDCCloseable implements java.io.Closeable {
        private final java.lang.String key;

        private MDCCloseable(java.lang.String str) {
            this.key = str;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            org.slf4j.MDC.remove(this.key);
        }
    }

    private MDC() {
    }

    static {
        org.slf4j.spi.SLF4JServiceProvider provider = org.slf4j.LoggerFactory.getProvider();
        if (provider != null) {
            mdcAdapter = provider.getMDCAdapter();
            return;
        }
        org.slf4j.helpers.Util.report("Failed to find provider.");
        org.slf4j.helpers.Util.report("Defaulting to no-operation MDCAdapter implementation.");
        mdcAdapter = new org.slf4j.helpers.NOPMDCAdapter();
    }

    public static void put(java.lang.String str, java.lang.String str2) throws java.lang.IllegalArgumentException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key parameter cannot be null");
        }
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        mDCAdapter.put(str, str2);
    }

    public static org.slf4j.MDC.MDCCloseable putCloseable(java.lang.String str, java.lang.String str2) throws java.lang.IllegalArgumentException {
        put(str, str2);
        return new org.slf4j.MDC.MDCCloseable(str);
    }

    public static java.lang.String get(java.lang.String str) throws java.lang.IllegalArgumentException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key parameter cannot be null");
        }
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        return mDCAdapter.get(str);
    }

    public static void remove(java.lang.String str) throws java.lang.IllegalArgumentException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key parameter cannot be null");
        }
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        mDCAdapter.remove(str);
    }

    public static void clear() {
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        mDCAdapter.clear();
    }

    public static java.util.Map<java.lang.String, java.lang.String> getCopyOfContextMap() {
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        return mDCAdapter.getCopyOfContextMap();
    }

    public static void setContextMap(java.util.Map<java.lang.String, java.lang.String> map) {
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        mDCAdapter.setContextMap(map);
    }

    public static org.slf4j.spi.MDCAdapter getMDCAdapter() {
        return mdcAdapter;
    }

    public static void pushByKey(java.lang.String str, java.lang.String str2) {
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        mDCAdapter.pushByKey(str, str2);
    }

    public static java.lang.String popByKey(java.lang.String str) {
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        return mDCAdapter.popByKey(str);
    }

    public java.util.Deque<java.lang.String> getCopyOfDequeByKey(java.lang.String str) {
        org.slf4j.spi.MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new java.lang.IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        return mDCAdapter.getCopyOfDequeByKey(str);
    }
}
