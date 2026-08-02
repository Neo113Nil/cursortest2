package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0088\u0001\u0017\u0092\u0001\u00020\u0010"}, d2 = {"Lio/ktor/utils/io/LineEndingMode;", "", "other", "", "contains-lTjpP64", "(II)Z", "contains", "plus-1Ter-O4", "(II)I", "plus", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Companion", "mode"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes17.dex */
public final class LineEndingMode {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.utils.io.LineEndingMode.Companion INSTANCE = new io.ktor.utils.io.LineEndingMode.Companion(null);
    private static final int CR = 1;
    private static final int LF = 2;
    private static final int CRLF = 4;
    private static final int Any = 7;
    private static final java.util.List<io.ktor.utils.io.LineEndingMode> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new io.ktor.utils.io.LineEndingMode[]{m23412boximpl(1), m23412boximpl(2), m23412boximpl(4)});

    /* renamed from: contains-lTjpP64, reason: not valid java name */
    public static final boolean m23413containslTjpP64(int i, int i2) {
        return (i2 | i) == i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23415equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: plus-1Ter-O4, reason: not valid java name */
    public static final int m23417plus1TerO4(int i, int i2) {
        return i | i2;
    }

    private /* synthetic */ LineEndingMode(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final java.lang.String toString() {
        return m23418toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23418toStringimpl(int i) {
        if (m23415equalsimpl0(i, CR)) {
            return "CR";
        }
        if (m23415equalsimpl0(i, LF)) {
            return "LF";
        }
        if (m23415equalsimpl0(i, CRLF)) {
            return "CRLF";
        }
        java.util.List<io.ktor.utils.io.LineEndingMode> list = Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (m23413containslTjpP64(i, ((io.ktor.utils.io.LineEndingMode) obj).getGetHighSpeedVideoFpsRangesFor())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/utils/io/LineEndingMode$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/LineEndingMode;", "CR", com.visa.cbp.getEncExpo.warmup, "getCR-f0jXZW8", "()I", "LF", "getLF-f0jXZW8", "CRLF", "getCRLF-f0jXZW8", "Any", "getAny-f0jXZW8", "", "Camera2StreamConfigurationMap", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCR-f0jXZW8, reason: not valid java name */
        public final int m23421getCRf0jXZW8() {
            return io.ktor.utils.io.LineEndingMode.CR;
        }

        /* renamed from: getLF-f0jXZW8, reason: not valid java name */
        public final int m23423getLFf0jXZW8() {
            return io.ktor.utils.io.LineEndingMode.LF;
        }

        /* renamed from: getCRLF-f0jXZW8, reason: not valid java name */
        public final int m23422getCRLFf0jXZW8() {
            return io.ktor.utils.io.LineEndingMode.CRLF;
        }

        /* renamed from: getAny-f0jXZW8, reason: not valid java name */
        public final int m23420getAnyf0jXZW8() {
            return io.ktor.utils.io.LineEndingMode.Any;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m23416hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m23414equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23416hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23414equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof io.ktor.utils.io.LineEndingMode) && i == ((io.ktor.utils.io.LineEndingMode) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ io.ktor.utils.io.LineEndingMode m23412boximpl(int i) {
        return new io.ktor.utils.io.LineEndingMode(i);
    }
}
