package androidx.glance.text;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u001e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/glance/text/TextDecoration;", "", "mask", "", "constructor-impl", "(I)I", "contains", "", "other", "contains-hcOHJN8", "(II)Z", "equals", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "plus", "decoration", "plus-YG9ZKLw", "(II)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class TextDecoration {
    private final int mask;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m1486constructorimpl(0);
    private static final int Underline = m1486constructorimpl(1);
    private static final int LineThrough = m1486constructorimpl(2);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/glance/text/TextDecoration$Companion;", "", "()V", "LineThrough", "Landroidx/glance/text/TextDecoration;", "getLineThrough-ObZ5V_A", "()I", "I", "None", "getNone-ObZ5V_A", "Underline", "getUnderline-ObZ5V_A", "combine", "decorations", "", "combine-6pcTslc", "(Ljava/util/List;)I", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/glance/text/TextDecoration$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1789#2,3:88\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/glance/text/TextDecoration$Companion\n*L\n47#1:88,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: combine-6pcTslc, reason: not valid java name */
        public final int m1494combine6pcTslc(List<TextDecoration> decorations) {
            Iterator<T> it = decorations.iterator();
            int i = 0;
            while (it.hasNext()) {
                i |= ((TextDecoration) it.next()).getMask();
            }
            return TextDecoration.m1486constructorimpl(i);
        }

        /* renamed from: getLineThrough-ObZ5V_A, reason: not valid java name */
        public final int m1495getLineThroughObZ5V_A() {
            return TextDecoration.LineThrough;
        }

        /* renamed from: getNone-ObZ5V_A, reason: not valid java name */
        public final int m1496getNoneObZ5V_A() {
            return TextDecoration.None;
        }

        /* renamed from: getUnderline-ObZ5V_A, reason: not valid java name */
        public final int m1497getUnderlineObZ5V_A() {
            return TextDecoration.Underline;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextDecoration(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDecoration m1485boximpl(int i) {
        return new TextDecoration(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1486constructorimpl(int i) {
        return i;
    }

    @Stable
    /* renamed from: contains-hcOHJN8, reason: not valid java name */
    public static final boolean m1487containshcOHJN8(int i, int i2) {
        return (i2 | i) == i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1488equalsimpl(int i, Object obj) {
        return (obj instanceof TextDecoration) && i == ((TextDecoration) obj).getMask();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1489equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1490hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @Stable
    /* renamed from: plus-YG9ZKLw, reason: not valid java name */
    public static final int m1491plusYG9ZKLw(int i, int i2) {
        return m1486constructorimpl(i | i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1492toStringimpl(int i) {
        String joinToString$default;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((Underline & i) != 0) {
            arrayList.add("Underline");
        }
        if ((i & LineThrough) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        StringBuilder sb = new StringBuilder("TextDecoration[");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        return t.b(']', joinToString$default, sb);
    }

    public boolean equals(Object obj) {
        return m1488equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m1490hashCodeimpl(this.mask);
    }

    public String toString() {
        return m1492toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getMask() {
        return this.mask;
    }
}
