package io.ktor.utils.io;

/* compiled from: LineEndingMode.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Lio/ktor/utils/io/LineEndingMode;", "", "", com.ironsource.X3.a.t, "constructor-impl", "(I)I", "other", "", "contains-lTjpP64", "(II)Z", "contains", "plus-1Ter-O4", "(II)I", "plus", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class LineEndingMode {
    private static final int Any;
    private static final int CR;
    private static final int CRLF;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.utils.io.LineEndingMode.Companion INSTANCE = new io.ktor.utils.io.LineEndingMode.Companion(null);
    private static final int LF;
    private static final java.util.List<io.ktor.utils.io.LineEndingMode> values;
    private final int mode;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ io.ktor.utils.io.LineEndingMode m10770boximpl(int i) {
        return new io.ktor.utils.io.LineEndingMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10771constructorimpl(int i) {
        return i;
    }

    /* renamed from: contains-lTjpP64, reason: not valid java name */
    public static final boolean m10772containslTjpP64(int i, int i2) {
        return (i2 | i) == i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10773equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof io.ktor.utils.io.LineEndingMode) && i == ((io.ktor.utils.io.LineEndingMode) obj).getMode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10774equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10775hashCodeimpl(int i) {
        return i;
    }

    public boolean equals(java.lang.Object other) {
        return m10773equalsimpl(this.mode, other);
    }

    public int hashCode() {
        return m10775hashCodeimpl(this.mode);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getMode() {
        return this.mode;
    }

    private /* synthetic */ LineEndingMode(int i) {
        this.mode = i;
    }

    /* renamed from: plus-1Ter-O4, reason: not valid java name */
    public static final int m10776plus1TerO4(int i, int i2) {
        return m10771constructorimpl(i | i2);
    }

    public java.lang.String toString() {
        return m10777toStringimpl(this.mode);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m10777toStringimpl(int i) {
        if (m10774equalsimpl0(i, CR)) {
            return "CR";
        }
        if (m10774equalsimpl0(i, LF)) {
            return "LF";
        }
        if (m10774equalsimpl0(i, CRLF)) {
            return "CRLF";
        }
        java.util.List<io.ktor.utils.io.LineEndingMode> list = values;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (m10772containslTjpP64(i, ((io.ktor.utils.io.LineEndingMode) obj).getMode())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    /* compiled from: LineEndingMode.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/utils/io/LineEndingMode$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/LineEndingMode;", "CR", "I", "getCR-f0jXZW8", "()I", "LF", "getLF-f0jXZW8", "CRLF", "getCRLF-f0jXZW8", "Any", "getAny-f0jXZW8", "", "values", "Ljava/util/List;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getCR-f0jXZW8, reason: not valid java name */
        public final int m10780getCRf0jXZW8() {
            return io.ktor.utils.io.LineEndingMode.CR;
        }

        /* renamed from: getLF-f0jXZW8, reason: not valid java name */
        public final int m10782getLFf0jXZW8() {
            return io.ktor.utils.io.LineEndingMode.LF;
        }

        /* renamed from: getCRLF-f0jXZW8, reason: not valid java name */
        public final int m10781getCRLFf0jXZW8() {
            return io.ktor.utils.io.LineEndingMode.CRLF;
        }

        /* renamed from: getAny-f0jXZW8, reason: not valid java name */
        public final int m10779getAnyf0jXZW8() {
            return io.ktor.utils.io.LineEndingMode.Any;
        }
    }

    static {
        int m10771constructorimpl = m10771constructorimpl(1);
        CR = m10771constructorimpl;
        int m10771constructorimpl2 = m10771constructorimpl(2);
        LF = m10771constructorimpl2;
        int m10771constructorimpl3 = m10771constructorimpl(4);
        CRLF = m10771constructorimpl3;
        Any = m10771constructorimpl(7);
        values = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new io.ktor.utils.io.LineEndingMode[]{m10770boximpl(m10771constructorimpl), m10770boximpl(m10771constructorimpl2), m10770boximpl(m10771constructorimpl3)});
    }
}
