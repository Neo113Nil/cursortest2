package com.google.common.net;

@com.google.common.net.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class InetAddresses {
    private static final int IPV4_PART_COUNT = 4;
    private static final char IPV6_DELIMITER = ':';
    private static final int IPV6_PART_COUNT = 8;
    private static final char IPV4_DELIMITER = '.';
    private static final com.google.common.base.CharMatcher IPV4_DELIMITER_MATCHER = com.google.common.base.CharMatcher.is(IPV4_DELIMITER);
    private static final com.google.common.base.CharMatcher IPV6_DELIMITER_MATCHER = com.google.common.base.CharMatcher.is(':');
    private static final java.net.Inet4Address LOOPBACK4 = (java.net.Inet4Address) forString("127.0.0.1");
    private static final java.net.Inet4Address ANY4 = (java.net.Inet4Address) forString("0.0.0.0");

    private InetAddresses() {
    }

    private static java.net.Inet4Address getInet4Address(byte[] bytes) {
        com.google.common.base.Preconditions.checkArgument(bytes.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bytes.length);
        return (java.net.Inet4Address) bytesToInetAddress(bytes);
    }

    public static java.net.InetAddress forString(java.lang.String ipString) {
        byte[] ipStringToBytes = ipStringToBytes(ipString);
        if (ipStringToBytes != null) {
            return bytesToInetAddress(ipStringToBytes);
        }
        throw formatIllegalArgumentException("'%s' is not an IP string literal.", ipString);
    }

    public static boolean isInetAddress(java.lang.String ipString) {
        return ipStringToBytes(ipString) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        if (r3 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r9 = convertDottedQuadToHex(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if (r1 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        return textToNumericFormatV6(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r2 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r1 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0051, code lost:
    
        return textToNumericFormatV4(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        return null;
     */
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] ipStringToBytes(java.lang.String ipStringParam) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i >= ipStringParam.length()) {
                i = -1;
                break;
            }
            char charAt = ipStringParam.charAt(i);
            if (charAt == '.') {
                z = true;
            } else if (charAt == ':') {
                if (z) {
                    return null;
                }
                z2 = true;
            } else {
                if (charAt == '%') {
                    break;
                }
                if (java.lang.Character.digit(charAt, 16) == -1) {
                    return null;
                }
            }
            i++;
        }
    }

    @javax.annotation.CheckForNull
    private static byte[] textToNumericFormatV4(java.lang.String ipString) {
        if (IPV4_DELIMITER_MATCHER.countIn(ipString) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int indexOf = ipString.indexOf(46, i);
            if (indexOf == -1) {
                indexOf = ipString.length();
            }
            try {
                bArr[i2] = parseOctet(ipString, i, indexOf);
                i = indexOf + 1;
            } catch (java.lang.NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @javax.annotation.CheckForNull
    private static byte[] textToNumericFormatV6(java.lang.String ipString) {
        int countIn = IPV6_DELIMITER_MATCHER.countIn(ipString);
        if (countIn >= 2 && countIn <= 8) {
            int i = 1;
            int i2 = countIn + 1;
            int i3 = 8 - i2;
            boolean z = false;
            for (int i4 = 0; i4 < ipString.length() - 1; i4++) {
                if (ipString.charAt(i4) == ':' && ipString.charAt(i4 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    int i5 = i3 + 1;
                    if (i4 == 0) {
                        i5 = i3 + 2;
                    }
                    if (i4 == ipString.length() - 2) {
                        i5++;
                    }
                    i3 = i5;
                    z = true;
                }
            }
            if (ipString.charAt(0) == ':' && ipString.charAt(1) != ':') {
                return null;
            }
            if (ipString.charAt(ipString.length() - 1) == ':' && ipString.charAt(ipString.length() - 2) != ':') {
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
                if (ipString.charAt(0) != ':') {
                    i = 0;
                }
                while (i < ipString.length()) {
                    int indexOf = ipString.indexOf(58, i);
                    if (indexOf == -1) {
                        indexOf = ipString.length();
                    }
                    if (ipString.charAt(i) == ':') {
                        for (int i6 = 0; i6 < i3; i6++) {
                            allocate.putShort((short) 0);
                        }
                    } else {
                        allocate.putShort(parseHextet(ipString, i, indexOf));
                    }
                    i = indexOf + 1;
                }
                return allocate.array();
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    @javax.annotation.CheckForNull
    private static java.lang.String convertDottedQuadToHex(java.lang.String ipString) {
        int lastIndexOf = ipString.lastIndexOf(58) + 1;
        java.lang.String substring = ipString.substring(0, lastIndexOf);
        byte[] textToNumericFormatV4 = textToNumericFormatV4(ipString.substring(lastIndexOf));
        if (textToNumericFormatV4 == null) {
            return null;
        }
        return substring + java.lang.Integer.toHexString(((textToNumericFormatV4[0] & 255) << 8) | (textToNumericFormatV4[1] & 255)) + ":" + java.lang.Integer.toHexString((textToNumericFormatV4[3] & 255) | ((textToNumericFormatV4[2] & 255) << 8));
    }

    private static byte parseOctet(java.lang.String ipString, int start, int end) {
        int i = end - start;
        if (i <= 0 || i > 3) {
            throw new java.lang.NumberFormatException();
        }
        if (i > 1 && ipString.charAt(start) == '0') {
            throw new java.lang.NumberFormatException();
        }
        int i2 = 0;
        while (start < end) {
            int i3 = i2 * 10;
            int digit = java.lang.Character.digit(ipString.charAt(start), 10);
            if (digit < 0) {
                throw new java.lang.NumberFormatException();
            }
            i2 = i3 + digit;
            start++;
        }
        if (i2 <= 255) {
            return (byte) i2;
        }
        throw new java.lang.NumberFormatException();
    }

    private static short parseHextet(java.lang.String ipString, int start, int end) {
        int i = end - start;
        if (i <= 0 || i > 4) {
            throw new java.lang.NumberFormatException();
        }
        int i2 = 0;
        while (start < end) {
            i2 = (i2 << 4) | java.lang.Character.digit(ipString.charAt(start), 16);
            start++;
        }
        return (short) i2;
    }

    private static java.net.InetAddress bytesToInetAddress(byte[] addr) {
        try {
            return java.net.InetAddress.getByAddress(addr);
        } catch (java.net.UnknownHostException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static java.lang.String toAddrString(java.net.InetAddress ip) {
        com.google.common.base.Preconditions.checkNotNull(ip);
        if (ip instanceof java.net.Inet4Address) {
            return (java.lang.String) java.util.Objects.requireNonNull(ip.getHostAddress());
        }
        com.google.common.base.Preconditions.checkArgument(ip instanceof java.net.Inet6Address);
        byte[] address = ip.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i * 2;
            iArr[i] = com.google.common.primitives.Ints.fromBytes((byte) 0, (byte) 0, address[i2], address[i2 + 1]);
        }
        compressLongestRunOfZeroes(iArr);
        return hextetsToIPv6String(iArr);
    }

    private static void compressLongestRunOfZeroes(int[] hextets) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < hextets.length + 1; i4++) {
            if (i4 >= hextets.length || hextets[i4] != 0) {
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
            java.util.Arrays.fill(hextets, i2, i + i2, -1);
        }
    }

    private static java.lang.String hextetsToIPv6String(int[] hextets) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
        int i = 0;
        boolean z = false;
        while (i < hextets.length) {
            boolean z2 = hextets[i] >= 0;
            if (z2) {
                if (z) {
                    sb.append(':');
                }
                sb.append(java.lang.Integer.toHexString(hextets[i]));
            } else if (i == 0 || z) {
                sb.append("::");
            }
            i++;
            z = z2;
        }
        return sb.toString();
    }

    public static java.lang.String toUriString(java.net.InetAddress ip) {
        if (ip instanceof java.net.Inet6Address) {
            return com.ironsource.X3.j.d + toAddrString(ip) + com.ironsource.X3.j.e;
        }
        return toAddrString(ip);
    }

    public static java.net.InetAddress forUriString(java.lang.String hostAddr) {
        java.net.InetAddress forUriStringNoThrow = forUriStringNoThrow(hostAddr);
        if (forUriStringNoThrow != null) {
            return forUriStringNoThrow;
        }
        throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", hostAddr);
    }

    @javax.annotation.CheckForNull
    private static java.net.InetAddress forUriStringNoThrow(java.lang.String hostAddr) {
        int i;
        com.google.common.base.Preconditions.checkNotNull(hostAddr);
        if (hostAddr.startsWith(com.ironsource.X3.j.d) && hostAddr.endsWith(com.ironsource.X3.j.e)) {
            hostAddr = hostAddr.substring(1, hostAddr.length() - 1);
            i = 16;
        } else {
            i = 4;
        }
        byte[] ipStringToBytes = ipStringToBytes(hostAddr);
        if (ipStringToBytes == null || ipStringToBytes.length != i) {
            return null;
        }
        return bytesToInetAddress(ipStringToBytes);
    }

    public static boolean isUriInetAddress(java.lang.String ipString) {
        return forUriStringNoThrow(ipString) != null;
    }

    public static boolean isCompatIPv4Address(java.net.Inet6Address ip) {
        byte b;
        if (!ip.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b = address[15]) == 0 || b == 1)) ? false : true;
    }

    public static java.net.Inet4Address getCompatIPv4Address(java.net.Inet6Address ip) {
        com.google.common.base.Preconditions.checkArgument(isCompatIPv4Address(ip), "Address '%s' is not IPv4-compatible.", toAddrString(ip));
        return getInet4Address(java.util.Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static boolean is6to4Address(java.net.Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static java.net.Inet4Address get6to4IPv4Address(java.net.Inet6Address ip) {
        com.google.common.base.Preconditions.checkArgument(is6to4Address(ip), "Address '%s' is not a 6to4 address.", toAddrString(ip));
        return getInet4Address(java.util.Arrays.copyOfRange(ip.getAddress(), 2, 6));
    }

    public static final class TeredoInfo {
        private final java.net.Inet4Address client;
        private final int flags;
        private final int port;
        private final java.net.Inet4Address server;

        public TeredoInfo(@javax.annotation.CheckForNull java.net.Inet4Address server, @javax.annotation.CheckForNull java.net.Inet4Address client, int port, int flags) {
            com.google.common.base.Preconditions.checkArgument(port >= 0 && port <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", port);
            com.google.common.base.Preconditions.checkArgument(flags >= 0 && flags <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", flags);
            this.server = (java.net.Inet4Address) com.google.common.base.MoreObjects.firstNonNull(server, com.google.common.net.InetAddresses.ANY4);
            this.client = (java.net.Inet4Address) com.google.common.base.MoreObjects.firstNonNull(client, com.google.common.net.InetAddresses.ANY4);
            this.port = port;
            this.flags = flags;
        }

        public java.net.Inet4Address getServer() {
            return this.server;
        }

        public java.net.Inet4Address getClient() {
            return this.client;
        }

        public int getPort() {
            return this.port;
        }

        public int getFlags() {
            return this.flags;
        }
    }

    public static boolean isTeredoAddress(java.net.Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static com.google.common.net.InetAddresses.TeredoInfo getTeredoInfo(java.net.Inet6Address ip) {
        com.google.common.base.Preconditions.checkArgument(isTeredoAddress(ip), "Address '%s' is not a Teredo address.", toAddrString(ip));
        byte[] address = ip.getAddress();
        java.net.Inet4Address inet4Address = getInet4Address(java.util.Arrays.copyOfRange(address, 4, 8));
        int readShort = com.google.common.io.ByteStreams.newDataInput(address, 8).readShort() & kotlin.UShort.MAX_VALUE;
        int i = 65535 & (~com.google.common.io.ByteStreams.newDataInput(address, 10).readShort());
        byte[] copyOfRange = java.util.Arrays.copyOfRange(address, 12, 16);
        for (int i2 = 0; i2 < copyOfRange.length; i2++) {
            copyOfRange[i2] = (byte) (~copyOfRange[i2]);
        }
        return new com.google.common.net.InetAddresses.TeredoInfo(inet4Address, getInet4Address(copyOfRange), i, readShort);
    }

    public static boolean isIsatapAddress(java.net.Inet6Address ip) {
        if (isTeredoAddress(ip)) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static java.net.Inet4Address getIsatapIPv4Address(java.net.Inet6Address ip) {
        com.google.common.base.Preconditions.checkArgument(isIsatapAddress(ip), "Address '%s' is not an ISATAP address.", toAddrString(ip));
        return getInet4Address(java.util.Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static boolean hasEmbeddedIPv4ClientAddress(java.net.Inet6Address ip) {
        return isCompatIPv4Address(ip) || is6to4Address(ip) || isTeredoAddress(ip);
    }

    public static java.net.Inet4Address getEmbeddedIPv4ClientAddress(java.net.Inet6Address ip) {
        if (isCompatIPv4Address(ip)) {
            return getCompatIPv4Address(ip);
        }
        if (is6to4Address(ip)) {
            return get6to4IPv4Address(ip);
        }
        if (isTeredoAddress(ip)) {
            return getTeredoInfo(ip).getClient();
        }
        throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(ip));
    }

    public static boolean isMappedIPv4Address(java.lang.String ipString) {
        byte[] ipStringToBytes = ipStringToBytes(ipString);
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

    public static java.net.Inet4Address getCoercedIPv4Address(java.net.InetAddress ip) {
        boolean z;
        long j;
        if (ip instanceof java.net.Inet4Address) {
            return (java.net.Inet4Address) ip;
        }
        byte[] address = ip.getAddress();
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
        java.net.Inet6Address inet6Address = (java.net.Inet6Address) ip;
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

    public static int coerceToInteger(java.net.InetAddress ip) {
        return com.google.common.io.ByteStreams.newDataInput(getCoercedIPv4Address(ip).getAddress()).readInt();
    }

    public static java.math.BigInteger toBigInteger(java.net.InetAddress address) {
        return new java.math.BigInteger(1, address.getAddress());
    }

    public static java.net.Inet4Address fromInteger(int address) {
        return getInet4Address(com.google.common.primitives.Ints.toByteArray(address));
    }

    public static java.net.Inet4Address fromIPv4BigInteger(java.math.BigInteger address) {
        return (java.net.Inet4Address) fromBigInteger(address, false);
    }

    public static java.net.Inet6Address fromIPv6BigInteger(java.math.BigInteger address) {
        return (java.net.Inet6Address) fromBigInteger(address, true);
    }

    private static java.net.InetAddress fromBigInteger(java.math.BigInteger address, boolean isIpv6) {
        com.google.common.base.Preconditions.checkArgument(address.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i = isIpv6 ? 16 : 4;
        byte[] byteArray = address.toByteArray();
        byte[] bArr = new byte[i];
        int max = java.lang.Math.max(0, byteArray.length - i);
        int length = byteArray.length - max;
        int i2 = i - length;
        for (int i3 = 0; i3 < max; i3++) {
            if (byteArray[i3] != 0) {
                throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", java.lang.Integer.valueOf(i), address);
            }
        }
        java.lang.System.arraycopy(byteArray, max, bArr, i2, length);
        try {
            return java.net.InetAddress.getByAddress(bArr);
        } catch (java.net.UnknownHostException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static java.net.InetAddress fromLittleEndianByteArray(byte[] addr) throws java.net.UnknownHostException {
        byte[] bArr = new byte[addr.length];
        for (int i = 0; i < addr.length; i++) {
            bArr[i] = addr[(addr.length - i) - 1];
        }
        return java.net.InetAddress.getByAddress(bArr);
    }

    public static java.net.InetAddress decrement(java.net.InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (length >= 0 && address2[length] == 0) {
            address2[length] = -1;
            length--;
        }
        com.google.common.base.Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] - 1);
        return bytesToInetAddress(address2);
    }

    public static java.net.InetAddress increment(java.net.InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (true) {
            if (length < 0 || address2[length] != -1) {
                break;
            }
            address2[length] = 0;
            length--;
        }
        com.google.common.base.Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] + 1);
        return bytesToInetAddress(address2);
    }

    public static boolean isMaximum(java.net.InetAddress address) {
        for (byte b : address.getAddress()) {
            if (b != -1) {
                return false;
            }
        }
        return true;
    }

    private static java.lang.IllegalArgumentException formatIllegalArgumentException(java.lang.String format, java.lang.Object... args) {
        return new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ROOT, format, args));
    }
}
