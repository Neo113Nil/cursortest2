package com.google.common.net;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class HostAndPort implements java.io.Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final java.lang.String host;
    private final int port;

    private static boolean isValidPort(int i) {
        return i >= 0 && i <= 65535;
    }

    private HostAndPort(java.lang.String str, int i, boolean z) {
        this.host = str;
        this.port = i;
        this.hasBracketlessColons = z;
    }

    public final java.lang.String getHost() {
        return this.host;
    }

    public final boolean hasPort() {
        return this.port >= 0;
    }

    public final int getPort() {
        com.google.common.base.Preconditions.checkState(hasPort());
        return this.port;
    }

    public final int getPortOrDefault(int i) {
        return hasPort() ? this.port : i;
    }

    public static com.google.common.net.HostAndPort fromParts(java.lang.String str, int i) {
        com.google.common.base.Preconditions.checkArgument(isValidPort(i), "Port out of range: %s", i);
        com.google.common.net.HostAndPort fromString = fromString(str);
        com.google.common.base.Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", str);
        return new com.google.common.net.HostAndPort(fromString.host, i, fromString.hasBracketlessColons);
    }

    public static com.google.common.net.HostAndPort fromHost(java.lang.String str) {
        com.google.common.net.HostAndPort fromString = fromString(str);
        com.google.common.base.Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", str);
        return fromString;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.common.net.HostAndPort fromString(java.lang.String str) {
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        java.lang.String substring;
        java.lang.Integer num;
        com.google.common.base.Preconditions.checkNotNull(str);
        if (str.startsWith("[")) {
            java.lang.String[] hostAndPortFromBracketedHost = getHostAndPortFromBracketedHost(str);
            substring = hostAndPortFromBracketedHost[0];
            str3 = hostAndPortFromBracketedHost[1];
        } else {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int i = indexOf + 1;
                if (str.indexOf(58, i) == -1) {
                    substring = str.substring(0, indexOf);
                    str3 = str.substring(i);
                }
            }
            str2 = str;
            z = indexOf >= 0;
            str3 = null;
            if (!com.google.common.base.Strings.isNullOrEmpty(str3)) {
                num = -1;
            } else {
                java.lang.Integer tryParse = com.google.common.primitives.Ints.tryParse(str3);
                com.google.common.base.Preconditions.checkArgument(tryParse != null, "Unparseable port number: %s", str);
                com.google.common.base.Preconditions.checkArgument(isValidPort(tryParse.intValue()), "Port number out of range: %s", str);
                num = tryParse;
            }
            return new com.google.common.net.HostAndPort(str2, num.intValue(), z);
        }
        str2 = substring;
        z = false;
        if (!com.google.common.base.Strings.isNullOrEmpty(str3)) {
        }
        return new com.google.common.net.HostAndPort(str2, num.intValue(), z);
    }

    private static java.lang.String[] getHostAndPortFromBracketedHost(java.lang.String str) {
        com.google.common.base.Preconditions.checkArgument(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int indexOf = str.indexOf(58);
        int lastIndexOf = str.lastIndexOf(93);
        com.google.common.base.Preconditions.checkArgument(indexOf >= 0 && lastIndexOf > indexOf, "Invalid bracketed host/port: %s", str);
        java.lang.String substring = str.substring(1, lastIndexOf);
        int i = lastIndexOf + 1;
        if (i == str.length()) {
            return new java.lang.String[]{substring, ""};
        }
        com.google.common.base.Preconditions.checkArgument(str.charAt(i) == ':', "Only a colon may follow a close bracket: %s", str);
        int i2 = lastIndexOf + 2;
        for (int i3 = i2; i3 < str.length(); i3++) {
            com.google.common.base.Preconditions.checkArgument(java.lang.Character.isDigit(str.charAt(i3)), "Port must be numeric: %s", str);
        }
        return new java.lang.String[]{substring, str.substring(i2)};
    }

    public final com.google.common.net.HostAndPort withDefaultPort(int i) {
        com.google.common.base.Preconditions.checkArgument(isValidPort(i));
        return hasPort() ? this : new com.google.common.net.HostAndPort(this.host, i, this.hasBracketlessColons);
    }

    public final com.google.common.net.HostAndPort requireBracketsForIPv6() {
        com.google.common.base.Preconditions.checkArgument(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.common.net.HostAndPort)) {
            return false;
        }
        com.google.common.net.HostAndPort hostAndPort = (com.google.common.net.HostAndPort) obj;
        return java.util.Objects.equals(this.host, hostAndPort.host) && this.port == hostAndPort.port;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.host, java.lang.Integer.valueOf(this.port));
    }

    public final java.lang.String toString() {
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
