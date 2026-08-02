package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "Landroidx/compose/ui/unit/TextUnit;", "firstLine", "restLine", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-NB67dxo", "(JJ)Landroidx/compose/ui/text/style/TextIndent;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getFirstLine-XSAIIZE", "()J", "getRestLine-XSAIIZE", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextIndent {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextIndent.Companion INSTANCE = new androidx.compose.ui.text.style.TextIndent.Companion(null);
    private static final androidx.compose.ui.text.style.TextIndent None = new androidx.compose.ui.text.style.TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    private TextIndent(long j, long j2) {
        this.firstLine = j;
        this.restLine = j2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/TextIndent;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/ui/text/style/TextIndent;", "getNone", "()Landroidx/compose/ui/text/style/TextIndent;", "getNone$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.text.style.TextIndent getNone() {
            return androidx.compose.ui.text.style.TextIndent.None;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TextIndent(long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.unit.TextUnitKt.getSp(0) : j, (i & 2) != 0 ? androidx.compose.ui.unit.TextUnitKt.getSp(0) : j2, null);
    }

    /* renamed from: getFirstLine-XSAIIZE, reason: not valid java name and from getter */
    public final long getFirstLine() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE, reason: not valid java name and from getter */
    public final long getRestLine() {
        return this.restLine;
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.style.TextIndent m8471copyNB67dxo$default(androidx.compose.ui.text.style.TextIndent textIndent, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = textIndent.firstLine;
        }
        if ((i & 2) != 0) {
            j2 = textIndent.restLine;
        }
        return textIndent.m8472copyNB67dxo(j, j2);
    }

    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final androidx.compose.ui.text.style.TextIndent m8472copyNB67dxo(long firstLine, long restLine) {
        return new androidx.compose.ui.text.style.TextIndent(firstLine, restLine, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.style.TextIndent)) {
            return false;
        }
        androidx.compose.ui.text.style.TextIndent textIndent = (androidx.compose.ui.text.style.TextIndent) other;
        return androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.firstLine, textIndent.firstLine) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.restLine, textIndent.restLine);
    }

    public final int hashCode() {
        return (androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.firstLine) * 31) + androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.restLine);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextIndent(firstLine=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(this.firstLine));
        sb.append(", restLine=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(this.restLine));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TextIndent(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
