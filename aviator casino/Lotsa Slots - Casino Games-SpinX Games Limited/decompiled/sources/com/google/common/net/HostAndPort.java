package com.google.common.net;

@com.google.errorprone.annotations.Immutable
@com.google.common.net.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class HostAndPort implements java.io.Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final java.lang.String host;
    private final int port;

    private static boolean isValidPort(int port) {
        return port >= 0 && port <= 65535;
    }

    private HostAndPort(java.lang.String host, int port, boolean hasBracketlessColons) {
        this.host = host;
        this.port = port;
        this.hasBracketlessColons = hasBracketlessColons;
    }

    public java.lang.String getHost() {
        return this.host;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int getPort() {
        com.google.common.base.Preconditions.checkState(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int defaultPort) {
        return hasPort() ? this.port : defaultPort;
    }

    public static com.google.common.net.HostAndPort fromParts(java.lang.String host, int port) {
        com.google.common.base.Preconditions.checkArgument(isValidPort(port), "Port out of range: %s", port);
        com.google.common.net.HostAndPort fromString = fromString(host);
        com.google.common.base.Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", host);
        return new com.google.common.net.HostAndPort(fromString.host, port, fromString.hasBracketlessColons);
    }

    public static com.google.common.net.HostAndPort fromHost(java.lang.String host) {
        com.google.common.net.HostAndPort fromString = fromString(host);
        com.google.common.base.Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", host);
        return fromString;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.common.net.HostAndPort fromString(java.lang.String hostPortString) {
        java.lang.String str;
        boolean z;
        java.lang.String str2;
        java.lang.String substring;
        com.google.common.base.Preconditions.checkNotNull(hostPortString);
        int i = -1;
        if (hostPortString.startsWith(com.ironsource.X3.j.d)) {
            java.lang.String[] hostAndPortFromBracketedHost = getHostAndPortFromBracketedHost(hostPortString);
            substring = hostAndPortFromBracketedHost[0];
            str2 = hostAndPortFromBracketedHost[1];
        } else {
            int indexOf = hostPortString.indexOf(58);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (hostPortString.indexOf(58, i2) == -1) {
                    substring = hostPortString.substring(0, indexOf);
                    str2 = hostPortString.substring(i2);
                }
            }
            str = hostPortString;
            z = indexOf >= 0;
            str2 = null;
            if (!com.google.common.base.Strings.isNullOrEmpty(str2)) {
                com.google.common.base.Preconditions.checkArgument(!str2.startsWith(org.slf4j.Marker.ANY_NON_NULL_MARKER) && com.google.common.base.CharMatcher.ascii().matchesAllOf(str2), "Unparseable port number: %s", hostPortString);
                try {
                    i = java.lang.Integer.parseInt(str2);
                    com.google.common.base.Preconditions.checkArgument(isValidPort(i), "Port number out of range: %s", hostPortString);
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.lang.IllegalArgumentException("Unparseable port number: " + hostPortString);
                }
            }
            return new com.google.common.net.HostAndPort(str, i, z);
        }
        str = substring;
        z = false;
        if (!com.google.common.base.Strings.isNullOrEmpty(str2)) {
        }
        return new com.google.common.net.HostAndPort(str, i, z);
    }

    private static java.lang.String[] getHostAndPortFromBracketedHost(java.lang.String hostPortString) {
        com.google.common.base.Preconditions.checkArgument(hostPortString.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", hostPortString);
        int indexOf = hostPortString.indexOf(58);
        int lastIndexOf = hostPortString.lastIndexOf(93);
        com.google.common.base.Preconditions.checkArgument(indexOf > -1 && lastIndexOf > indexOf, "Invalid bracketed host/port: %s", hostPortString);
        java.lang.String substring = hostPortString.substring(1, lastIndexOf);
        int i = lastIndexOf + 1;
        if (i == hostPortString.length()) {
            return new java.lang.String[]{substring, ""};
        }
        com.google.common.base.Preconditions.checkArgument(hostPortString.charAt(i) == ':', "Only a colon may follow a close bracket: %s", hostPortString);
        int i2 = lastIndexOf + 2;
        for (int i3 = i2; i3 < hostPortString.length(); i3++) {
            com.google.common.base.Preconditions.checkArgument(java.lang.Character.isDigit(hostPortString.charAt(i3)), "Port must be numeric: %s", hostPortString);
        }
        return new java.lang.String[]{substring, hostPortString.substring(i2)};
    }

    public com.google.common.net.HostAndPort withDefaultPort(int defaultPort) {
        com.google.common.base.Preconditions.checkArgument(isValidPort(defaultPort));
        return hasPort() ? this : new com.google.common.net.HostAndPort(this.host, defaultPort, this.hasBracketlessColons);
    }

    public com.google.common.net.HostAndPort requireBracketsForIPv6() {
        com.google.common.base.Preconditions.checkArgument(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.common.net.HostAndPort)) {
            return false;
        }
        com.google.common.net.HostAndPort hostAndPort = (com.google.common.net.HostAndPort) other;
        return com.google.common.base.Objects.equal(this.host, hostAndPort.host) && this.port == hostAndPort.port;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.host, java.lang.Integer.valueOf(this.port));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.host);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(this.port);
        }
        return sb.toString();
    }
}
