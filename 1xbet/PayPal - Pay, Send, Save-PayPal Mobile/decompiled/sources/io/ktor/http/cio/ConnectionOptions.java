package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lio/ktor/http/cio/ConnectionOptions;", "", "", "close", "keepAlive", "upgrade", "", "", "extraOptions", "<init>", "(ZZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getClose", "()Z", "getKeepAlive", "getUpgrade", "Ljava/util/List;", "getExtraOptions", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionOptions {
    private static final io.ktor.http.cio.internals.AsciiCharTree<kotlin.Pair<java.lang.String, io.ktor.http.cio.ConnectionOptions>> Camera2StreamConfigurationMap;
    private static final io.ktor.http.cio.ConnectionOptions Close;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.cio.ConnectionOptions.Companion INSTANCE = new io.ktor.http.cio.ConnectionOptions.Companion(null);
    private static final io.ktor.http.cio.ConnectionOptions KeepAlive;
    private static final io.ktor.http.cio.ConnectionOptions Upgrade;
    private final boolean close;
    private final java.util.List<java.lang.String> extraOptions;
    private final boolean keepAlive;
    private final boolean upgrade;

    public ConnectionOptions(boolean z, boolean z2, boolean z3, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.close = z;
        this.keepAlive = z2;
        this.upgrade = z3;
        this.extraOptions = list;
    }

    public final boolean getClose() {
        return this.close;
    }

    public final boolean getKeepAlive() {
        return this.keepAlive;
    }

    public final boolean getUpgrade() {
        return this.upgrade;
    }

    public /* synthetic */ ConnectionOptions(boolean z, boolean z2, boolean z3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<java.lang.String> getExtraOptions() {
        return this.extraOptions;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00120\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/http/cio/ConnectionOptions$Companion;", "", "<init>", "()V", "", "connection", "Lio/ktor/http/cio/ConnectionOptions;", "parse", "(Ljava/lang/CharSequence;)Lio/ktor/http/cio/ConnectionOptions;", com.knotapi.knot.utilities.Constants.META_CLOSE, "Lio/ktor/http/cio/ConnectionOptions;", "getClose", "()Lio/ktor/http/cio/ConnectionOptions;", "KeepAlive", "getKeepAlive", com.google.common.net.HttpHeaders.UPGRADE, "getUpgrade", "Lio/ktor/http/cio/internals/AsciiCharTree;", "Lkotlin/Pair;", "", "Camera2StreamConfigurationMap", "Lio/ktor/http/cio/internals/AsciiCharTree;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: $r8$lambda$HMB-IPU9LUFuShG15vlKSY9ENgE, reason: not valid java name */
        public static /* synthetic */ boolean m23361$r8$lambda$HMBIPU9LUFuShG15vlKSY9ENgE(char c, int i) {
            return false;
        }

        /* renamed from: $r8$lambda$Swr1iZkBoP-OsBA69ZgkhFGRSFA, reason: not valid java name */
        public static /* synthetic */ boolean m23362$r8$lambda$Swr1iZkBoPOsBA69ZgkhFGRSFA(char c, int i) {
            return false;
        }

        private Companion() {
        }

        public final io.ktor.http.cio.ConnectionOptions getClose() {
            return io.ktor.http.cio.ConnectionOptions.Close;
        }

        public final io.ktor.http.cio.ConnectionOptions getKeepAlive() {
            return io.ktor.http.cio.ConnectionOptions.KeepAlive;
        }

        public final io.ktor.http.cio.ConnectionOptions getUpgrade() {
            return io.ktor.http.cio.ConnectionOptions.Upgrade;
        }

        public final io.ktor.http.cio.ConnectionOptions parse(java.lang.CharSequence connection) {
            int i;
            int i2;
            io.ktor.http.cio.ConnectionOptions connectionOptions = null;
            if (connection == null) {
                return null;
            }
            java.util.List search$default = io.ktor.http.cio.internals.AsciiCharTree.search$default(io.ktor.http.cio.ConnectionOptions.Camera2StreamConfigurationMap, connection, 0, 0, true, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.ConnectionOptions$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(io.ktor.http.cio.ConnectionOptions.Companion.m23361$r8$lambda$HMBIPU9LUFuShG15vlKSY9ENgE(((java.lang.Character) obj).charValue(), ((java.lang.Integer) obj2).intValue()));
                }
            }, 6, null);
            if (search$default.size() == 1) {
                return (io.ktor.http.cio.ConnectionOptions) ((kotlin.Pair) search$default.get(0)).getSecond();
            }
            int length = connection.length();
            int i3 = 0;
            int i4 = 0;
            java.util.ArrayList arrayList = null;
            while (i3 < length) {
                while (true) {
                    char charAt = connection.charAt(i3);
                    if (charAt != ' ' && charAt != ',') {
                        i = i3;
                        i2 = i;
                        break;
                    }
                    i3++;
                    if (i3 >= length) {
                        i = i3;
                        i2 = i4;
                        break;
                    }
                }
                while (i < length) {
                    char charAt2 = connection.charAt(i);
                    if (charAt2 == ' ' || charAt2 == ',') {
                        break;
                    }
                    i++;
                }
                kotlin.Pair pair = (kotlin.Pair) kotlin.collections.CollectionsKt.singleOrNull(io.ktor.http.cio.ConnectionOptions.Camera2StreamConfigurationMap.search(connection, i2, i, true, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.ConnectionOptions$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(io.ktor.http.cio.ConnectionOptions.Companion.m23362$r8$lambda$Swr1iZkBoPOsBA69ZgkhFGRSFA(((java.lang.Character) obj).charValue(), ((java.lang.Integer) obj2).intValue()));
                    }
                }));
                if (pair == null) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(connection.subSequence(i2, i).toString());
                } else if (connectionOptions == null) {
                    connectionOptions = (io.ktor.http.cio.ConnectionOptions) pair.getSecond();
                } else {
                    connectionOptions = new io.ktor.http.cio.ConnectionOptions(connectionOptions.getClose() || ((io.ktor.http.cio.ConnectionOptions) pair.getSecond()).getClose(), connectionOptions.getKeepAlive() || ((io.ktor.http.cio.ConnectionOptions) pair.getSecond()).getKeepAlive(), connectionOptions.getUpgrade() || ((io.ktor.http.cio.ConnectionOptions) pair.getSecond()).getUpgrade(), kotlin.collections.CollectionsKt.emptyList());
                }
                i3 = i;
                i4 = i2;
            }
            if (connectionOptions == null) {
                connectionOptions = getKeepAlive();
            }
            return arrayList == null ? connectionOptions : new io.ktor.http.cio.ConnectionOptions(connectionOptions.getClose(), connectionOptions.getKeepAlive(), connectionOptions.getUpgrade(), arrayList);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        boolean z = false;
        java.util.List list = null;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        io.ktor.http.cio.ConnectionOptions connectionOptions = new io.ktor.http.cio.ConnectionOptions(true, z, false, list, 14, defaultConstructorMarker);
        Close = connectionOptions;
        io.ktor.http.cio.ConnectionOptions connectionOptions2 = new io.ktor.http.cio.ConnectionOptions(false, true, false, null, 13, null);
        KeepAlive = connectionOptions2;
        io.ktor.http.cio.ConnectionOptions connectionOptions3 = new io.ktor.http.cio.ConnectionOptions(false, z, true, list, 11, defaultConstructorMarker);
        Upgrade = connectionOptions3;
        Camera2StreamConfigurationMap = io.ktor.http.cio.internals.AsciiCharTree.INSTANCE.build(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to("close", connectionOptions), kotlin.TuplesKt.to("keep-alive", connectionOptions2), kotlin.TuplesKt.to("upgrade", connectionOptions3)}), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.ConnectionOptions$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(io.ktor.http.cio.ConnectionOptions.$r8$lambda$Vh_VJ_mlqkazEiU5zE_I3FwZObc((kotlin.Pair) obj));
            }
        }, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.ConnectionOptions$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Character.valueOf(io.ktor.http.cio.ConnectionOptions.$r8$lambda$ko1Hyb6LKV8FH1ipZYT6bMiApy0((kotlin.Pair) obj, ((java.lang.Integer) obj2).intValue()));
            }
        });
    }

    public final java.lang.String toString() {
        if (this.extraOptions.isEmpty()) {
            boolean z = this.close;
            return (!z || this.keepAlive || this.upgrade) ? (z || !this.keepAlive || this.upgrade) ? (!z && this.keepAlive && this.upgrade) ? "keep-alive, Upgrade" : getHighSpeedVideoFpsRanges() : "keep-alive" : "close";
        }
        return getHighSpeedVideoFpsRanges();
    }

    private final java.lang.String getHighSpeedVideoFpsRanges() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.extraOptions.size() + 3);
        if (this.close) {
            arrayList.add("close");
        }
        if (this.keepAlive) {
            arrayList.add("keep-alive");
        }
        if (this.upgrade) {
            arrayList.add(com.google.common.net.HttpHeaders.UPGRADE);
        }
        if (!this.extraOptions.isEmpty()) {
            arrayList.addAll(this.extraOptions);
        }
        kotlin.collections.CollectionsKt.joinTo(arrayList, sb, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        io.ktor.http.cio.ConnectionOptions connectionOptions = (io.ktor.http.cio.ConnectionOptions) other;
        return this.close == connectionOptions.close && this.keepAlive == connectionOptions.keepAlive && this.upgrade == connectionOptions.upgrade && kotlin.jvm.internal.Intrinsics.areEqual(this.extraOptions, connectionOptions.extraOptions);
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.close);
        return (((((hashCode * 31) + java.lang.Boolean.hashCode(this.keepAlive)) * 31) + java.lang.Boolean.hashCode(this.upgrade)) * 31) + this.extraOptions.hashCode();
    }

    public static /* synthetic */ int $r8$lambda$Vh_VJ_mlqkazEiU5zE_I3FwZObc(kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        return ((java.lang.String) pair.getFirst()).length();
    }

    public static /* synthetic */ char $r8$lambda$ko1Hyb6LKV8FH1ipZYT6bMiApy0(kotlin.Pair pair, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        return ((java.lang.String) pair.getFirst()).charAt(i);
    }

    public ConnectionOptions() {
        this(false, false, false, null, 15, null);
    }
}
