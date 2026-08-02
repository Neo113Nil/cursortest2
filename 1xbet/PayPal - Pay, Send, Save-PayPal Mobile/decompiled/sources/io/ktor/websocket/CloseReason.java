package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lio/ktor/websocket/CloseReason;", "", "", "code", "", "message", "<init>", "(SLjava/lang/String;)V", "Lio/ktor/websocket/CloseReason$Codes;", "(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()S", "component2", "copy", "(SLjava/lang/String;)Lio/ktor/websocket/CloseReason;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "S", "getCode", "Ljava/lang/String;", "getMessage", "getKnownReason", "()Lio/ktor/websocket/CloseReason$Codes;", "knownReason", "Codes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CloseReason {
    private final short code;
    private final java.lang.String message;

    public CloseReason(short s, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.code = s;
        this.message = str;
    }

    public final short getCode() {
        return this.code;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseReason(io.ktor.websocket.CloseReason.Codes codes, java.lang.String str) {
        this(codes.getCode(), str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public final io.ktor.websocket.CloseReason.Codes getKnownReason() {
        return io.ktor.websocket.CloseReason.Codes.INSTANCE.byCode(this.code);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseReason(reason=");
        java.lang.Object knownReason = getKnownReason();
        if (knownReason == null) {
            knownReason = java.lang.Short.valueOf(this.code);
        }
        sb.append(knownReason);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes;", "", "", "p0", "<init>", "(Ljava/lang/String;IS)V", "code", "S", "getCode", "()S", "Companion", "NORMAL", "GOING_AWAY", "PROTOCOL_ERROR", "CANNOT_ACCEPT", "CLOSED_ABNORMALLY", "NOT_CONSISTENT", "VIOLATED_POLICY", "TOO_BIG", "NO_EXTENSION", "INTERNAL_ERROR", "SERVICE_RESTART", "TRY_AGAIN_LATER"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Codes {
        public static final io.ktor.websocket.CloseReason.Codes CANNOT_ACCEPT;

        @kotlin.Deprecated(message = "This code MUST NOT be set as a status code in a Close control frame by an endpoint")
        public static final io.ktor.websocket.CloseReason.Codes CLOSED_ABNORMALLY;
        private static final /* synthetic */ io.ktor.websocket.CloseReason.Codes[] Camera2StreamConfigurationMap;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final io.ktor.websocket.CloseReason.Codes.Companion INSTANCE;
        public static final io.ktor.websocket.CloseReason.Codes GOING_AWAY;
        public static final io.ktor.websocket.CloseReason.Codes INTERNAL_ERROR;
        public static final io.ktor.websocket.CloseReason.Codes NORMAL;
        public static final io.ktor.websocket.CloseReason.Codes NOT_CONSISTENT;
        public static final io.ktor.websocket.CloseReason.Codes NO_EXTENSION;
        public static final io.ktor.websocket.CloseReason.Codes PROTOCOL_ERROR;
        public static final io.ktor.websocket.CloseReason.Codes SERVICE_RESTART;
        public static final io.ktor.websocket.CloseReason.Codes TOO_BIG;
        public static final io.ktor.websocket.CloseReason.Codes TRY_AGAIN_LATER;
        public static final io.ktor.websocket.CloseReason.Codes UNEXPECTED_CONDITION;
        public static final io.ktor.websocket.CloseReason.Codes VIOLATED_POLICY;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final java.util.Map<java.lang.Short, io.ktor.websocket.CloseReason.Codes> getHighSpeedVideoFpsRangesFor;
        private final short code;

        private Codes(java.lang.String str, int i, short s) {
            this.code = s;
        }

        public final short getCode() {
            return this.code;
        }

        static {
            io.ktor.websocket.CloseReason.Codes codes = new io.ktor.websocket.CloseReason.Codes("NORMAL", 0, (short) 1000);
            NORMAL = codes;
            io.ktor.websocket.CloseReason.Codes codes2 = new io.ktor.websocket.CloseReason.Codes("GOING_AWAY", 1, (short) 1001);
            GOING_AWAY = codes2;
            io.ktor.websocket.CloseReason.Codes codes3 = new io.ktor.websocket.CloseReason.Codes("PROTOCOL_ERROR", 2, (short) 1002);
            PROTOCOL_ERROR = codes3;
            io.ktor.websocket.CloseReason.Codes codes4 = new io.ktor.websocket.CloseReason.Codes("CANNOT_ACCEPT", 3, (short) 1003);
            CANNOT_ACCEPT = codes4;
            io.ktor.websocket.CloseReason.Codes codes5 = new io.ktor.websocket.CloseReason.Codes("CLOSED_ABNORMALLY", 4, (short) 1006);
            CLOSED_ABNORMALLY = codes5;
            io.ktor.websocket.CloseReason.Codes codes6 = new io.ktor.websocket.CloseReason.Codes("NOT_CONSISTENT", 5, (short) 1007);
            NOT_CONSISTENT = codes6;
            io.ktor.websocket.CloseReason.Codes codes7 = new io.ktor.websocket.CloseReason.Codes("VIOLATED_POLICY", 6, (short) 1008);
            VIOLATED_POLICY = codes7;
            io.ktor.websocket.CloseReason.Codes codes8 = new io.ktor.websocket.CloseReason.Codes("TOO_BIG", 7, (short) 1009);
            TOO_BIG = codes8;
            io.ktor.websocket.CloseReason.Codes codes9 = new io.ktor.websocket.CloseReason.Codes("NO_EXTENSION", 8, (short) 1010);
            NO_EXTENSION = codes9;
            io.ktor.websocket.CloseReason.Codes codes10 = new io.ktor.websocket.CloseReason.Codes("INTERNAL_ERROR", 9, (short) 1011);
            INTERNAL_ERROR = codes10;
            io.ktor.websocket.CloseReason.Codes codes11 = new io.ktor.websocket.CloseReason.Codes("SERVICE_RESTART", 10, (short) 1012);
            SERVICE_RESTART = codes11;
            io.ktor.websocket.CloseReason.Codes codes12 = new io.ktor.websocket.CloseReason.Codes("TRY_AGAIN_LATER", 11, (short) 1013);
            TRY_AGAIN_LATER = codes12;
            io.ktor.websocket.CloseReason.Codes[] codesArr = {codes, codes2, codes3, codes4, codes5, codes6, codes7, codes8, codes9, codes10, codes11, codes12};
            Camera2StreamConfigurationMap = codesArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(codesArr);
            INSTANCE = new io.ktor.websocket.CloseReason.Codes.Companion(null);
            kotlin.enums.EnumEntries<io.ktor.websocket.CloseReason.Codes> entries = getEntries();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
            for (java.lang.Object obj : entries) {
                linkedHashMap.put(java.lang.Short.valueOf(((io.ktor.websocket.CloseReason.Codes) obj).code), obj);
            }
            getHighSpeedVideoFpsRangesFor = linkedHashMap;
            UNEXPECTED_CONDITION = INTERNAL_ERROR;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/websocket/CloseReason$Codes;", "byCode", "(S)Lio/ktor/websocket/CloseReason$Codes;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoSizes", "UNEXPECTED_CONDITION", "Lio/ktor/websocket/CloseReason$Codes;", "getUNEXPECTED_CONDITION$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use INTERNAL_ERROR instead.", replaceWith = @kotlin.ReplaceWith(expression = "INTERNAL_ERROR", imports = {"io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR"}))
            public static /* synthetic */ void getUNEXPECTED_CONDITION$annotations() {
            }

            private Companion() {
            }

            public final io.ktor.websocket.CloseReason.Codes byCode(short code) {
                return (io.ktor.websocket.CloseReason.Codes) io.ktor.websocket.CloseReason.Codes.getHighSpeedVideoFpsRangesFor.get(java.lang.Short.valueOf(code));
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static io.ktor.websocket.CloseReason.Codes valueOf(java.lang.String str) {
            return (io.ktor.websocket.CloseReason.Codes) java.lang.Enum.valueOf(io.ktor.websocket.CloseReason.Codes.class, str);
        }

        public static io.ktor.websocket.CloseReason.Codes[] values() {
            return (io.ktor.websocket.CloseReason.Codes[]) Camera2StreamConfigurationMap.clone();
        }

        public static kotlin.enums.EnumEntries<io.ktor.websocket.CloseReason.Codes> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public final int hashCode() {
        return (java.lang.Short.hashCode(this.code) * 31) + this.message.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.websocket.CloseReason)) {
            return false;
        }
        io.ktor.websocket.CloseReason closeReason = (io.ktor.websocket.CloseReason) other;
        return this.code == closeReason.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, closeReason.message);
    }

    public final io.ktor.websocket.CloseReason copy(short code, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new io.ktor.websocket.CloseReason(code, message);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final short getCode() {
        return this.code;
    }

    public static /* synthetic */ io.ktor.websocket.CloseReason copy$default(io.ktor.websocket.CloseReason closeReason, short s, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            s = closeReason.code;
        }
        if ((i & 2) != 0) {
            str = closeReason.message;
        }
        return closeReason.copy(s, str);
    }
}
