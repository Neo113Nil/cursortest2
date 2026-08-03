package androidx.compose.ui.text.style;

/* compiled from: TextDecoration.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0013\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0086\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "mask", "", "(I)V", "getMask", "()I", "contains", "", "other", "equals", "hashCode", "plus", "decoration", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextDecoration {
    public static final int $stable = 0;
    private final int mask;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextDecoration.Companion INSTANCE = new androidx.compose.ui.text.style.TextDecoration.Companion(null);
    private static final androidx.compose.ui.text.style.TextDecoration None = new androidx.compose.ui.text.style.TextDecoration(0);
    private static final androidx.compose.ui.text.style.TextDecoration Underline = new androidx.compose.ui.text.style.TextDecoration(1);
    private static final androidx.compose.ui.text.style.TextDecoration LineThrough = new androidx.compose.ui.text.style.TextDecoration(2);

    public TextDecoration(int i) {
        this.mask = i;
    }

    public final int getMask() {
        return this.mask;
    }

    /* compiled from: TextDecoration.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "()V", "LineThrough", "Landroidx/compose/ui/text/style/TextDecoration;", "getLineThrough$annotations", "getLineThrough", "()Landroidx/compose/ui/text/style/TextDecoration;", "None", "getNone$annotations", "getNone", "Underline", "getUnderline$annotations", "getUnderline", "combine", "decorations", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getLineThrough$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public static /* synthetic */ void getUnderline$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.text.style.TextDecoration getNone() {
            return androidx.compose.ui.text.style.TextDecoration.None;
        }

        public final androidx.compose.ui.text.style.TextDecoration getUnderline() {
            return androidx.compose.ui.text.style.TextDecoration.Underline;
        }

        public final androidx.compose.ui.text.style.TextDecoration getLineThrough() {
            return androidx.compose.ui.text.style.TextDecoration.LineThrough;
        }

        public final androidx.compose.ui.text.style.TextDecoration combine(java.util.List<androidx.compose.ui.text.style.TextDecoration> decorations) {
            int i = 0;
            int size = decorations.size();
            for (int i2 = 0; i2 < size; i2++) {
                i = java.lang.Integer.valueOf(i.intValue() | decorations.get(i2).getMask());
            }
            return new androidx.compose.ui.text.style.TextDecoration(i.intValue());
        }
    }

    public final androidx.compose.ui.text.style.TextDecoration plus(androidx.compose.ui.text.style.TextDecoration decoration) {
        return new androidx.compose.ui.text.style.TextDecoration(decoration.mask | this.mask);
    }

    public final boolean contains(androidx.compose.ui.text.style.TextDecoration other) {
        int i = this.mask;
        return (other.mask | i) == i;
    }

    public java.lang.String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & LineThrough.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((java.lang.String) arrayList.get(0));
        }
        return "TextDecoration[" + androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.style.TextDecoration) && this.mask == ((androidx.compose.ui.text.style.TextDecoration) other).mask;
    }

    public int hashCode() {
        return this.mask;
    }
}
