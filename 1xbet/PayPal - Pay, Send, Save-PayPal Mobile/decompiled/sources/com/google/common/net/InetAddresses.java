package com.google.common.net;

/* loaded from: classes4.dex */
public final class InetAddresses {
    private static final char IPV4_DELIMITER = '.';
    private static final int IPV4_PART_COUNT = 4;
    private static final char IPV6_DELIMITER = ':';
    private static final int IPV6_PART_COUNT = 8;
    private static final com.google.common.base.CharMatcher IPV4_DELIMITER_MATCHER = com.google.common.base.CharMatcher.is('.');
    private static final com.google.common.base.CharMatcher IPV6_DELIMITER_MATCHER = com.google.common.base.CharMatcher.is(':');
    private static final java.net.Inet4Address LOOPBACK4 = (java.net.Inet4Address) forString("127.0.0.1");
    private static final java.net.Inet4Address ANY4 = (java.net.Inet4Address) forString("0.0.0.0");

    private InetAddresses() {
    }

    private static java.net.Inet4Address getInet4Address(byte[] bArr) {
        com.google.common.base.Preconditions.checkArgument(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (java.net.Inet4Address) bytesToInetAddress(bArr, null);
    }

    public static java.net.InetAddress forString(java.lang.String str) {
        com.google.common.net.InetAddresses.Scope scope = new com.google.common.net.InetAddresses.Scope();
        byte[] ipStringToBytes = ipStringToBytes(str, scope);
        if (ipStringToBytes == null) {
            throw formatIllegalArgumentException("'%s' is not an IP string literal.", str);
        }
        return bytesToInetAddress(ipStringToBytes, scope.scope);
    }

    public static boolean isInetAddress(java.lang.String str) {
        return ipStringToBytes(str, null) != null;
    }

    static final class Scope {
        private java.lang.String scope;

        private Scope() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
    
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r2 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        r9 = convertDottedQuadToHex(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r9 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        if (r1 == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
    
        if (r10 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0040, code lost:
    
        r10.scope = r9.substring(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        return textToNumericFormatV6(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        if (r2 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        if (r1 == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        return textToNumericFormatV4(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] ipStringToBytes(java.lang.String str, com.google.common.net.InetAddresses.Scope scope) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i >= str.length()) {
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt != '.') {
                if (charAt != ':') {
                    if (charAt == '%') {
                        break;
                    }
                    if (java.lang.Character.digit(charAt, 16) == -1) {
                        return null;
                    }
                } else {
                    if (z) {
                        return null;
                    }
                    z2 = true;
                }
            } else {
                z = true;
            }
            i++;
        }
    }

    private static byte[] textToNumericFormatV4(java.lang.String str) {
        if (IPV4_DELIMITER_MATCHER.countIn(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i2] = parseOctet(str, i, indexOf);
                i = indexOf + 1;
            } catch (java.lang.NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    private static byte[] textToNumericFormatV6(java.lang.String str) {
        int countIn = IPV6_DELIMITER_MATCHER.countIn(str);
        if (countIn >= 2 && countIn <= 8) {
            int i = 1;
            int i2 = countIn + 1;
            int i3 = 8 - i2;
            boolean z = false;
            for (int i4 = 0; i4 < str.length() - 1; i4++) {
                if (str.charAt(i4) == ':' && str.charAt(i4 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    int i5 = i3 + 1;
                    if (i4 == 0) {
                        i5 = i3 + 2;
                    }
                    if (i4 == str.length() - 2) {
                        i5++;
                    }
                    i3 = i5;
                    z = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z && i3 <= 0) {
                return null;
            }
            if (!z && i2 != 8) {
                return null;
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i = 0;
                }
                while (i < str.length()) {
                    int indexOf = str.indexOf(58, i);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    if (str.charAt(i) == ':') {
                        for (int i6 = 0; i6 < i3; i6++) {
                            allocate.putShort((short) 0);
                        }
                    } else {
                        allocate.putShort(parseHextet(str, i, indexOf));
                    }
                    i = indexOf + 1;
                }
                return allocate.array();
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    private static java.lang.String convertDottedQuadToHex(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        java.lang.String substring = str.substring(0, lastIndexOf);
        byte[] textToNumericFormatV4 = textToNumericFormatV4(str.substring(lastIndexOf));
        if (textToNumericFormatV4 == null) {
            return null;
        }
        java.lang.String hexString = java.lang.Integer.toHexString(((textToNumericFormatV4[0] & 255) << 8) | (textToNumericFormatV4[1] & 255));
        java.lang.String hexString2 = java.lang.Integer.toHexString((textToNumericFormatV4[3] & 255) | ((textToNumericFormatV4[2] & 255) << 8));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(hexString);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(hexString2);
        return sb.toString();
    }

    private static byte parseOctet(java.lang.String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 0 || i3 > 3) {
            throw new java.lang.NumberFormatException();
        }
        if (i3 > 1 && str.charAt(i) == '0') {
            throw new java.lang.NumberFormatException();
        }
        int i4 = 0;
        while (i < i2) {
            int digit = java.lang.Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new java.lang.NumberFormatException();
            }
            i4 = (i4 * 10) + digit;
            i++;
        }
        if (i4 <= 255) {
            return (byte) i4;
        }
        throw new java.lang.NumberFormatException();
    }

    private static int tryParseDecimal(java.lang.String str, int i, int i2) {
        int digit;
        int i3 = 0;
        while (i < i2) {
            if (i3 > 214748364 || (digit = java.lang.Character.digit(str.charAt(i), 10)) < 0) {
                return -1;
            }
            i3 = (i3 * 10) + digit;
            i++;
        }
        return i3;
    }

    private static short parseHextet(java.lang.String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 0 || i3 > 4) {
            throw new java.lang.NumberFormatException();
        }
        int i4 = 0;
        while (i < i2) {
            i4 = (i4 << 4) | java.lang.Character.digit(str.charAt(i), 16);
            i++;
        }
        return (short) i4;
    }

    private static java.net.InetAddress bytesToInetAddress(byte[] bArr, java.lang.String str) {
        try {
            java.net.InetAddress byAddress = java.net.InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            com.google.common.base.Preconditions.checkArgument(byAddress instanceof java.net.Inet6Address, "Unexpected state, scope should only appear for ipv6");
            java.net.Inet6Address inet6Address = (java.net.Inet6Address) byAddress;
            int tryParseDecimal = tryParseDecimal(str, 0, str.length());
            if (tryParseDecimal != -1) {
                return java.net.Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), tryParseDecimal);
            }
            try {
                java.net.NetworkInterface byName = java.net.NetworkInterface.getByName(str);
                if (byName == null) {
                    throw formatIllegalArgumentException("No such interface: '%s'", str);
                }
                return java.net.Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
            } catch (java.net.SocketException | java.net.UnknownHostException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No such interface: ");
                sb.append(str);
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        } catch (java.net.UnknownHostException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public static java.lang.String toAddrString(java.net.InetAddress inetAddress) {
        com.google.common.base.Preconditions.checkNotNull(inetAddress);
        if (inetAddress instanceof java.net.Inet4Address) {
            return (java.lang.String) java.util.Objects.requireNonNull(inetAddress.getHostAddress());
        }
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i * 2;
            iArr[i] = com.google.common.primitives.Ints.fromBytes((byte) 0, (byte) 0, address[i2], address[i2 + 1]);
        }
        compressLongestRunOfZeroes(iArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(hextetsToIPv6String(iArr));
        sb.append(scopeWithDelimiter((java.net.Inet6Address) inetAddress));
        return sb.toString();
    }

    private static java.lang.String scopeWithDelimiter(java.net.Inet6Address inet6Address) {
        java.net.NetworkInterface scopedInterface = inet6Address.getScopedInterface();
        if (scopedInterface != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
            sb.append(scopedInterface.getName());
            return sb.toString();
        }
        int scopeId = inet6Address.getScopeId();
        if (scopeId != 0) {
            return "%".concat(java.lang.String.valueOf(scopeId));
        }
        return "";
    }

    private static void compressLongestRunOfZeroes(int[] iArr) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < iArr.length + 1; i4++) {
            if (i4 >= iArr.length || iArr[i4] != 0) {
                if (i3 >= 0) {
                    int i5 = i4 - i3;
                    if (i5 > i) {
                        i2 = i3;
                        i = i5;
                    }
                    i3 = -1;
                }
            } else if (i3 < 0) {
                i3 = i4;
            }
        }
        if (i >= 2) {
            java.util.Arrays.fill(iArr, i2, i + i2, -1);
        }
    }

    private static java.lang.String hextetsToIPv6String(int[] iArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
        int i = 0;
        boolean z = false;
        while (i < iArr.length) {
            boolean z2 = iArr[i] >= 0;
            if (z2) {
                if (z) {
                    sb.append(':');
                }
                sb.append(java.lang.Integer.toHexString(iArr[i]));
            } else if (i == 0 || z) {
                sb.append("::");
            }
            i++;
            z = z2;
        }
        return sb.toString();
    }

    public static java.lang.String toUriString(java.net.InetAddress inetAddress) {
        if (inetAddress instanceof java.net.Inet6Address) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(toAddrString(inetAddress));
            sb.append("]");
            return sb.toString();
        }
        return toAddrString(inetAddress);
    }

    public static java.net.InetAddress forUriString(java.lang.String str) {
        java.net.InetAddress forUriStringOrNull = forUriStringOrNull(str, true);
        if (forUriStringOrNull != null) {
            return forUriStringOrNull;
        }
        throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static java.net.InetAddress forUriStringOrNull(java.lang.String str, boolean z) {
        int i;
        com.google.common.net.InetAddresses.Scope scope;
        com.google.common.base.Preconditions.checkNotNull(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i = 16;
        } else {
            i = 4;
        }
        java.lang.Object[] objArr = 0;
        if (z) {
            scope = new com.google.common.net.InetAddresses.Scope();
        } else {
            scope = null;
        }
        byte[] ipStringToBytes = ipStringToBytes(str, scope);
        if (ipStringToBytes == null || ipStringToBytes.length != i) {
            return null;
        }
        return bytesToInetAddress(ipStringToBytes, scope != null ? scope.scope : null);
    }

    public static boolean isUriInetAddress(java.lang.String str) {
        return forUriStringOrNull(str, false) != null;
    }

    public static boolean isCompatIPv4Address(java.net.Inet6Address inet6Address) {
        byte b;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b = address[15]) == 0 || b == 1)) ? false : true;
    }

    public static java.net.Inet4Address getCompatIPv4Address(java.net.Inet6Address inet6Address) {
        com.google.common.base.Preconditions.checkArgument(isCompatIPv4Address(inet6Address), "Address '%s' is not IPv4-compatible.", toAddrString(inet6Address));
        return getInet4Address(java.util.Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static boolean is6to4Address(java.net.Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static java.net.Inet4Address get6to4IPv4Address(java.net.Inet6Address inet6Address) {
        com.google.common.base.Preconditions.checkArgument(is6to4Address(inet6Address), "Address '%s' is not a 6to4 address.", toAddrString(inet6Address));
        return getInet4Address(java.util.Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    /* loaded from: classes9.dex */
    public static final class TeredoInfo {
        private final java.net.Inet4Address client;
        private final int flags;
        private final int port;
        private final java.net.Inet4Address server;

        public TeredoInfo(java.net.Inet4Address inet4Address, java.net.Inet4Address inet4Address2, int i, int i2) {
            com.google.common.base.Preconditions.checkArgument(i >= 0 && i <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", i);
            com.google.common.base.Preconditions.checkArgument(i2 >= 0 && i2 <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", i2);
            this.server = (java.net.Inet4Address) com.google.common.base.MoreObjects.firstNonNull(inet4Address, com.google.common.net.InetAddresses.ANY4);
            this.client = (java.net.Inet4Address) com.google.common.base.MoreObjects.firstNonNull(inet4Address2, com.google.common.net.InetAddresses.ANY4);
            this.port = i;
            this.flags = i2;
        }

        public final java.net.Inet4Address getServer() {
            return this.server;
        }

        public final java.net.Inet4Address getClient() {
            return this.client;
        }

        public final int getPort() {
            return this.port;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public static boolean isTeredoAddress(java.net.Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static com.google.common.net.InetAddresses.TeredoInfo getTeredoInfo(java.net.Inet6Address inet6Address) {
        com.google.common.base.Preconditions.checkArgument(isTeredoAddress(inet6Address), "Address '%s' is not a Teredo address.", toAddrString(inet6Address));
        byte[] address = inet6Address.getAddress();
        java.net.Inet4Address inet4Address = getInet4Address(java.util.Arrays.copyOfRange(address, 4, 8));
        short readShort = com.google.common.io.ByteStreams.newDataInput(address, 8).readShort();
        short readShort2 = com.google.common.io.ByteStreams.newDataInput(address, 10).readShort();
        byte[] copyOfRange = java.util.Arrays.copyOfRange(address, 12, 16);
        for (int i = 0; i < copyOfRange.length; i++) {
            copyOfRange[i] = (byte) (~copyOfRange[i]);
        }
        return new com.google.common.net.InetAddresses.TeredoInfo(inet4Address, getInet4Address(copyOfRange), (~readShort2) & 65535, readShort & kotlin.UShort.MAX_VALUE);
    }

    public static boolean isIsatapAddress(java.net.Inet6Address inet6Address) {
        if (isTeredoAddress(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static java.net.Inet4Address getIsatapIPv4Address(java.net.Inet6Address inet6Address) {
        com.google.common.base.Preconditions.checkArgument(isIsatapAddress(inet6Address), "Address '%s' is not an ISATAP address.", toAddrString(inet6Address));
        return getInet4Address(java.util.Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static boolean hasEmbeddedIPv4ClientAddress(java.net.Inet6Address inet6Address) {
        return isCompatIPv4Address(inet6Address) || is6to4Address(inet6Address) || isTeredoAddress(inet6Address);
    }

    public static java.net.Inet4Address getEmbeddedIPv4ClientAddress(java.net.Inet6Address inet6Address) {
        if (isCompatIPv4Address(inet6Address)) {
            return getCompatIPv4Address(inet6Address);
        }
        if (is6to4Address(inet6Address)) {
            return get6to4IPv4Address(inet6Address);
        }
        if (isTeredoAddress(inet6Address)) {
            return getTeredoInfo(inet6Address).getClient();
        }
        throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(inet6Address));
    }

    public static boolean isMappedIPv4Address(java.lang.String str) {
        byte[] ipStringToBytes = ipStringToBytes(str, null);
        if (ipStringToBytes == null || ipStringToBytes.length != 16) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= 10) {
                for (int i2 = 10; i2 < 12; i2++) {
                    if (ipStringToBytes[i2] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (ipStringToBytes[i] != 0) {
                return false;
            }
            i++;
        }
    }

    public static java.net.Inet4Address getCoercedIPv4Address(java.net.InetAddress inetAddress) {
        boolean z;
        long j;
        if (inetAddress instanceof java.net.Inet4Address) {
            return (java.net.Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i = 0;
        while (true) {
            if (i >= 15) {
                z = true;
                break;
            }
            if (address[i] != 0) {
                z = false;
                break;
            }
            i++;
        }
        if (z && address[15] == 1) {
            return LOOPBACK4;
        }
        if (z && address[15] == 0) {
            return ANY4;
        }
        java.net.Inet6Address inet6Address = (java.net.Inet6Address) inetAddress;
        if (hasEmbeddedIPv4ClientAddress(inet6Address)) {
            j = getEmbeddedIPv4ClientAddress(inet6Address).hashCode();
        } else {
            j = java.nio.ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong();
        }
        int asInt = com.google.common.hash.Hashing.murmur3_32_fixed().hashLong(j).asInt() | (-536870912);
        if (asInt == -1) {
            asInt = -2;
        }
        return getInet4Address(com.google.common.primitives.Ints.toByteArray(asInt));
    }

    public static int coerceToInteger(java.net.InetAddress inetAddress) {
        return com.google.common.io.ByteStreams.newDataInput(getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    public static java.math.BigInteger toBigInteger(java.net.InetAddress inetAddress) {
        return new java.math.BigInteger(1, inetAddress.getAddress());
    }

    public static java.net.Inet4Address fromInteger(int i) {
        return getInet4Address(com.google.common.primitives.Ints.toByteArray(i));
    }

    public static java.net.Inet4Address fromIPv4BigInteger(java.math.BigInteger bigInteger) {
        return (java.net.Inet4Address) fromBigInteger(bigInteger, false);
    }

    public static java.net.Inet6Address fromIPv6BigInteger(java.math.BigInteger bigInteger) {
        return (java.net.Inet6Address) fromBigInteger(bigInteger, true);
    }

    private static java.net.InetAddress fromBigInteger(java.math.BigInteger bigInteger, boolean z) {
        com.google.common.base.Preconditions.checkArgument(bigInteger.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i = z ? 16 : 4;
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i];
        int max = java.lang.Math.max(0, byteArray.length - i);
        int length = byteArray.length - max;
        for (int i2 = 0; i2 < max; i2++) {
            if (byteArray[i2] != 0) {
                throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", java.lang.Integer.valueOf(i), bigInteger);
            }
        }
        java.lang.System.arraycopy(byteArray, max, bArr, i - length, length);
        try {
            return java.net.InetAddress.getByAddress(bArr);
        } catch (java.net.UnknownHostException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static java.net.InetAddress fromLittleEndianByteArray(byte[] bArr) throws java.net.UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return java.net.InetAddress.getByAddress(bArr2);
    }

    public static java.net.InetAddress decrement(java.net.InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        com.google.common.base.Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return bytesToInetAddress(address, null);
    }

    public static java.net.InetAddress increment(java.net.InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        com.google.common.base.Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return bytesToInetAddress(address, null);
    }

    public static boolean isMaximum(java.net.InetAddress inetAddress) {
        for (byte b : inetAddress.getAddress()) {
            if (b != -1) {
                return false;
            }
        }
        return true;
    }

    private static java.lang.IllegalArgumentException formatIllegalArgumentException(java.lang.String str, java.lang.Object... objArr) {
        return new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ROOT, str, objArr));
    }
}
