package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public class URIUtils {
    private static final byte[] Camera2StreamConfigurationMap = {-17, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -67};
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRangesFor = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.bootstrap.instrumentation.api.URIUtils.class);

    private URIUtils() {
    }

    public static java.lang.String decode(java.lang.String str) {
        return decode(str, false);
    }

    public static java.lang.String decode(java.lang.String str, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        if (str.indexOf(37) < 0 && (!z || str.indexOf(43) < 0)) {
            return str;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length + 2);
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                int i2 = i + 2;
                if (i2 < length) {
                    int digit = java.lang.Character.digit(str.charAt(i + 1), 16);
                    int digit2 = java.lang.Character.digit(str.charAt(i2), 16);
                    if ((digit | digit2) < 0) {
                        byte[] bArr = Camera2StreamConfigurationMap;
                        allocate.put(bArr[0]);
                        allocate.put(bArr[1]);
                        allocate.put(bArr[2]);
                    } else {
                        allocate.put((byte) ((digit << 4) + digit2));
                    }
                    i = i2;
                } else {
                    byte[] bArr2 = Camera2StreamConfigurationMap;
                    allocate.put(bArr2[0]);
                    allocate.put(bArr2[1]);
                    allocate.put(bArr2[2]);
                    i = length;
                }
            } else {
                if (z && charAt == '+') {
                    charAt = ' ';
                }
                allocate.put((byte) charAt);
            }
            i++;
        }
        allocate.flip();
        return new java.lang.String(allocate.array(), 0, allocate.limit(), java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.net.URI safeParse(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return java.net.URI.create(str);
        } catch (java.lang.IllegalArgumentException e) {
            getHighSpeedVideoFpsRangesFor.debug("Unable to parse request uri {}", str, e);
            return null;
        }
    }

    public static abstract class LazyUrl implements java.lang.CharSequence, com.datadog.android.trace.internal.compat.function.Supplier<java.lang.String> {
        protected java.lang.String lazy;

        public abstract java.lang.String path();

        protected LazyUrl(java.lang.String str) {
            this.lazy = str;
        }

        @Override // java.lang.CharSequence
        public java.lang.String toString() {
            java.lang.String str = this.lazy;
            if (str != null) {
                return str;
            }
            java.lang.String str2 = get();
            this.lazy = str2;
            return str2;
        }

        @Override // java.lang.CharSequence
        public int length() {
            return toString().length();
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            return toString().charAt(i);
        }

        @Override // java.lang.CharSequence
        public java.lang.CharSequence subSequence(int i, int i2) {
            return toString().subSequence(i, i2);
        }

        public int hashCode() {
            return toString().hashCode();
        }
    }
}
