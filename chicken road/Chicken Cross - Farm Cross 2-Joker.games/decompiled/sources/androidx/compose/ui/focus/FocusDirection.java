package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FocusTraversal.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", InAppPurchaseConstants.METHOD_TO_STRING, "", "toString-impl", "(I)Ljava/lang/String;", k.M, "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Next = m1326constructorimpl(1);
    private static final int Previous = m1326constructorimpl(2);
    private static final int Left = m1326constructorimpl(3);
    private static final int Right = m1326constructorimpl(4);
    private static final int Up = m1326constructorimpl(5);
    private static final int Down = m1326constructorimpl(6);
    private static final int In = m1326constructorimpl(7);
    private static final int Out = m1326constructorimpl(8);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m1325boximpl(int i) {
        return new FocusDirection(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1326constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1327equalsimpl(int i, Object obj) {
        return (obj instanceof FocusDirection) && i == ((FocusDirection) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1328equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1329hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m1327equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1329hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    private /* synthetic */ FocusDirection(int i) {
        this.value = i;
    }

    public String toString() {
        return m1330toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1330toStringimpl(int i) {
        if (m1328equalsimpl0(i, Next)) {
            return "Next";
        }
        if (m1328equalsimpl0(i, Previous)) {
            return "Previous";
        }
        if (m1328equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m1328equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m1328equalsimpl0(i, Up)) {
            return "Up";
        }
        if (m1328equalsimpl0(i, Down)) {
            return "Down";
        }
        if (m1328equalsimpl0(i, In)) {
            return "In";
        }
        if (m1328equalsimpl0(i, Out)) {
            return "Out";
        }
        return "Invalid FocusDirection";
    }

    /* compiled from: FocusTraversal.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R'\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "()V", "Down", "Landroidx/compose/ui/focus/FocusDirection;", "getDown-dhqQ-8s", "()I", "I", "In", "getIn-dhqQ-8s$annotations", "getIn-dhqQ-8s", "Left", "getLeft-dhqQ-8s", "Next", "getNext-dhqQ-8s", "Out", "getOut-dhqQ-8s$annotations", "getOut-dhqQ-8s", "Previous", "getPrevious-dhqQ-8s", "Right", "getRight-dhqQ-8s", "Up", "getUp-dhqQ-8s", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        /* renamed from: getIn-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m1332getIndhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getOut-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m1333getOutdhqQ8s$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m1337getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m1339getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m1336getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m1340getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m1341getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m1334getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getIn-dhqQ-8s, reason: not valid java name */
        public final int m1335getIndhqQ8s() {
            return FocusDirection.In;
        }

        /* renamed from: getOut-dhqQ-8s, reason: not valid java name */
        public final int m1338getOutdhqQ8s() {
            return FocusDirection.Out;
        }
    }
}
