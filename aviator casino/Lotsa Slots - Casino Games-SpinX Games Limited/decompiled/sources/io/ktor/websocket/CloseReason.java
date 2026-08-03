package io.ktor.websocket;

/* compiled from: CloseReason.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lio/ktor/websocket/CloseReason;", "", "", "code", "", "message", "<init>", "(SLjava/lang/String;)V", "Lio/ktor/websocket/CloseReason$Codes;", "(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()S", "component2", "copy", "(SLjava/lang/String;)Lio/ktor/websocket/CloseReason;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "getCode", "Ljava/lang/String;", "getMessage", "getKnownReason", "()Lio/ktor/websocket/CloseReason$Codes;", "knownReason", "Codes", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CloseReason {
    private final short code;
    private final java.lang.String message;

    public static /* synthetic */ io.ktor.websocket.CloseReason copy$default(io.ktor.websocket.CloseReason closeReason, short s, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            s = closeReason.code;
        }
        if ((i & 2) != 0) {
            str = closeReason.message;
        }
        return closeReason.copy(s, str);
    }

    /* renamed from: component1, reason: from getter */
    public final short getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final io.ktor.websocket.CloseReason copy(short code, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new io.ktor.websocket.CloseReason(code, message);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.websocket.CloseReason)) {
            return false;
        }
        io.ktor.websocket.CloseReason closeReason = (io.ktor.websocket.CloseReason) other;
        return this.code == closeReason.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, closeReason.message);
    }

    public int hashCode() {
        return (this.code * 31) + this.message.hashCode();
    }

    public CloseReason(short s, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.code = s;
        this.message = message;
    }

    public final short getCode() {
        return this.code;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseReason(io.ktor.websocket.CloseReason.Codes code, java.lang.String message) {
        this(code.getCode(), message);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
    }

    public final io.ktor.websocket.CloseReason.Codes getKnownReason() {
        return io.ktor.websocket.CloseReason.Codes.INSTANCE.byCode(this.code);
    }

    public java.lang.String toString() {
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
    /* compiled from: CloseReason.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes;", "", "", "code", "<init>", "(Ljava/lang/String;IS)V", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "getCode", "()S", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "NORMAL", "GOING_AWAY", "PROTOCOL_ERROR", "CANNOT_ACCEPT", "CLOSED_ABNORMALLY", "NOT_CONSISTENT", "VIOLATED_POLICY", "TOO_BIG", "NO_EXTENSION", "INTERNAL_ERROR", "SERVICE_RESTART", "TRY_AGAIN_LATER", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Codes {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ io.ktor.websocket.CloseReason.Codes[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final io.ktor.websocket.CloseReason.Codes.Companion INSTANCE;
        public static final io.ktor.websocket.CloseReason.Codes UNEXPECTED_CONDITION;
        private static final java.util.Map<java.lang.Short, io.ktor.websocket.CloseReason.Codes> byCodeMap;
        private final short code;
        public static final io.ktor.websocket.CloseReason.Codes NORMAL = new io.ktor.websocket.CloseReason.Codes("NORMAL", 0, 1000);
        public static final io.ktor.websocket.CloseReason.Codes GOING_AWAY = new io.ktor.websocket.CloseReason.Codes("GOING_AWAY", 1, 1001);
        public static final io.ktor.websocket.CloseReason.Codes PROTOCOL_ERROR = new io.ktor.websocket.CloseReason.Codes("PROTOCOL_ERROR", 2, 1002);
        public static final io.ktor.websocket.CloseReason.Codes CANNOT_ACCEPT = new io.ktor.websocket.CloseReason.Codes("CANNOT_ACCEPT", 3, 1003);

        @kotlin.Deprecated(message = "This code MUST NOT be set as a status code in a Close control frame by an endpoint")
        public static final io.ktor.websocket.CloseReason.Codes CLOSED_ABNORMALLY = new io.ktor.websocket.CloseReason.Codes("CLOSED_ABNORMALLY", 4, 1006);
        public static final io.ktor.websocket.CloseReason.Codes NOT_CONSISTENT = new io.ktor.websocket.CloseReason.Codes("NOT_CONSISTENT", 5, 1007);
        public static final io.ktor.websocket.CloseReason.Codes VIOLATED_POLICY = new io.ktor.websocket.CloseReason.Codes("VIOLATED_POLICY", 6, 1008);
        public static final io.ktor.websocket.CloseReason.Codes TOO_BIG = new io.ktor.websocket.CloseReason.Codes("TOO_BIG", 7, 1009);
        public static final io.ktor.websocket.CloseReason.Codes NO_EXTENSION = new io.ktor.websocket.CloseReason.Codes("NO_EXTENSION", 8, 1010);
        public static final io.ktor.websocket.CloseReason.Codes INTERNAL_ERROR = new io.ktor.websocket.CloseReason.Codes("INTERNAL_ERROR", 9, 1011);
        public static final io.ktor.websocket.CloseReason.Codes SERVICE_RESTART = new io.ktor.websocket.CloseReason.Codes("SERVICE_RESTART", 10, 1012);
        public static final io.ktor.websocket.CloseReason.Codes TRY_AGAIN_LATER = new io.ktor.websocket.CloseReason.Codes("TRY_AGAIN_LATER", 11, 1013);

        private static final /* synthetic */ io.ktor.websocket.CloseReason.Codes[] $values() {
            return new io.ktor.websocket.CloseReason.Codes[]{NORMAL, GOING_AWAY, PROTOCOL_ERROR, CANNOT_ACCEPT, CLOSED_ABNORMALLY, NOT_CONSISTENT, VIOLATED_POLICY, TOO_BIG, NO_EXTENSION, INTERNAL_ERROR, SERVICE_RESTART, TRY_AGAIN_LATER};
        }

        public static kotlin.enums.EnumEntries<io.ktor.websocket.CloseReason.Codes> getEntries() {
            return $ENTRIES;
        }

        private Codes(java.lang.String str, int i, short s) {
            this.code = s;
        }

        public final short getCode() {
            return this.code;
        }

        static {
            io.ktor.websocket.CloseReason.Codes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            INSTANCE = new io.ktor.websocket.CloseReason.Codes.Companion(null);
            kotlin.enums.EnumEntries<io.ktor.websocket.CloseReason.Codes> entries = getEntries();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
            for (java.lang.Object obj : entries) {
                linkedHashMap.put(java.lang.Short.valueOf(((io.ktor.websocket.CloseReason.Codes) obj).code), obj);
            }
            byCodeMap = linkedHashMap;
            UNEXPECTED_CONDITION = INTERNAL_ERROR;
        }

        /* compiled from: CloseReason.kt */
        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u0003¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/websocket/CloseReason$Codes;", "byCode", "(S)Lio/ktor/websocket/CloseReason$Codes;", "", "byCodeMap", "Ljava/util/Map;", "UNEXPECTED_CONDITION", "Lio/ktor/websocket/CloseReason$Codes;", "getUNEXPECTED_CONDITION$annotations", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use INTERNAL_ERROR instead.", replaceWith = @kotlin.ReplaceWith(expression = "INTERNAL_ERROR", imports = {"io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR"}))
            public static /* synthetic */ void getUNEXPECTED_CONDITION$annotations() {
            }

            private Companion() {
            }

            public final io.ktor.websocket.CloseReason.Codes byCode(short code) {
                return (io.ktor.websocket.CloseReason.Codes) io.ktor.websocket.CloseReason.Codes.byCodeMap.get(java.lang.Short.valueOf(code));
            }
        }

        public static io.ktor.websocket.CloseReason.Codes valueOf(java.lang.String str) {
            return (io.ktor.websocket.CloseReason.Codes) java.lang.Enum.valueOf(io.ktor.websocket.CloseReason.Codes.class, str);
        }

        public static io.ktor.websocket.CloseReason.Codes[] values() {
            return (io.ktor.websocket.CloseReason.Codes[]) $VALUES.clone();
        }
    }
}
