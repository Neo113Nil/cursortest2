package io.ktor.utils.io;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.U3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LineEndingMode.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Lio/ktor/utils/io/LineEndingMode;", "", "", U3.a.t, "constructor-impl", "(I)I", "other", "", "contains-lTjpP64", "(II)Z", "contains", "plus-1Ter-O4", "(II)I", "plus", "", "toString-impl", "(I)Ljava/lang/String;", InAppPurchaseConstants.METHOD_TO_STRING, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", k.M, "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes7.dex */
public final class LineEndingMode {
    private static final int Any;
    private static final int CR;
    private static final int CRLF;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int LF;
    private static final List<LineEndingMode> values;
    private final int mode;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineEndingMode m8051boximpl(int i) {
        return new LineEndingMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m8052constructorimpl(int i) {
        return i;
    }

    /* renamed from: contains-lTjpP64, reason: not valid java name */
    public static final boolean m8053containslTjpP64(int i, int i2) {
        return (i2 | i) == i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8054equalsimpl(int i, Object obj) {
        return (obj instanceof LineEndingMode) && i == ((LineEndingMode) obj).getMode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8055equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8056hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object other) {
        return m8054equalsimpl(this.mode, other);
    }

    public int hashCode() {
        return m8056hashCodeimpl(this.mode);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getMode() {
        return this.mode;
    }

    private /* synthetic */ LineEndingMode(int i) {
        this.mode = i;
    }

    /* renamed from: plus-1Ter-O4, reason: not valid java name */
    public static final int m8057plus1TerO4(int i, int i2) {
        return m8052constructorimpl(i | i2);
    }

    public String toString() {
        return m8058toStringimpl(this.mode);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8058toStringimpl(int i) {
        if (m8055equalsimpl0(i, CR)) {
            return "CR";
        }
        if (m8055equalsimpl0(i, LF)) {
            return "LF";
        }
        if (m8055equalsimpl0(i, CRLF)) {
            return "CRLF";
        }
        List<LineEndingMode> list = values;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m8053containslTjpP64(i, ((LineEndingMode) obj).getMode())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    /* compiled from: LineEndingMode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/utils/io/LineEndingMode$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/LineEndingMode;", "CR", "I", "getCR-f0jXZW8", "()I", "LF", "getLF-f0jXZW8", "CRLF", "getCRLF-f0jXZW8", "Any", "getAny-f0jXZW8", "", "values", "Ljava/util/List;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getCR-f0jXZW8, reason: not valid java name */
        public final int m8061getCRf0jXZW8() {
            return LineEndingMode.CR;
        }

        /* renamed from: getLF-f0jXZW8, reason: not valid java name */
        public final int m8063getLFf0jXZW8() {
            return LineEndingMode.LF;
        }

        /* renamed from: getCRLF-f0jXZW8, reason: not valid java name */
        public final int m8062getCRLFf0jXZW8() {
            return LineEndingMode.CRLF;
        }

        /* renamed from: getAny-f0jXZW8, reason: not valid java name */
        public final int m8060getAnyf0jXZW8() {
            return LineEndingMode.Any;
        }
    }

    static {
        int m8052constructorimpl = m8052constructorimpl(1);
        CR = m8052constructorimpl;
        int m8052constructorimpl2 = m8052constructorimpl(2);
        LF = m8052constructorimpl2;
        int m8052constructorimpl3 = m8052constructorimpl(4);
        CRLF = m8052constructorimpl3;
        Any = m8052constructorimpl(7);
        values = CollectionsKt.listOf((Object[]) new LineEndingMode[]{m8051boximpl(m8052constructorimpl), m8051boximpl(m8052constructorimpl2), m8051boximpl(m8052constructorimpl3)});
    }
}
