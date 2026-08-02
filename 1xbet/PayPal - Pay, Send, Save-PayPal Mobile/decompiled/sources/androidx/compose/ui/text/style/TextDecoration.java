package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "", com.daon.sdk.face.license.License.FEATURE_MASK, "<init>", "(I)V", "decoration", "plus", "(Landroidx/compose/ui/text/style/TextDecoration;)Landroidx/compose/ui/text/style/TextDecoration;", "other", "", "contains", "(Landroidx/compose/ui/text/style/TextDecoration;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getMask", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u00020\u00058\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u00020\u00058\u0007¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00058\u0007¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0016\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/style/TextDecoration;", "decorations", "combine", "(Ljava/util/List;)Landroidx/compose/ui/text/style/TextDecoration;", "", com.daon.sdk.face.license.License.FEATURE_MASK, "valueOf", "(I)Landroidx/compose/ui/text/style/TextDecoration;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/ui/text/style/TextDecoration;", "getNone", "()Landroidx/compose/ui/text/style/TextDecoration;", "getNone$annotations", "Underline", "getUnderline", "getUnderline$annotations", "LineThrough", "getLineThrough", "getLineThrough$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
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

        public final androidx.compose.ui.text.style.TextDecoration valueOf(int mask) {
            if ((mask | 3) != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The given mask=");
                sb.append(mask);
                sb.append(" is not recognized by TextDecoration.");
                androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            if (mask == 0) {
                return getNone();
            }
            if (mask == 1) {
                return getUnderline();
            }
            if (mask == 2) {
                return getLineThrough();
            }
            return new androidx.compose.ui.text.style.TextDecoration(mask);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final androidx.compose.ui.text.style.TextDecoration plus(androidx.compose.ui.text.style.TextDecoration decoration) {
        return new androidx.compose.ui.text.style.TextDecoration(decoration.mask | this.mask);
    }

    public final boolean contains(androidx.compose.ui.text.style.TextDecoration other) {
        int i = this.mask;
        return (other.mask | i) == i;
    }

    public final java.lang.String toString() {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TextDecoration.");
            sb.append((java.lang.String) arrayList.get(0));
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("TextDecoration[");
        sb2.append(androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null));
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.style.TextDecoration) && this.mask == ((androidx.compose.ui.text.style.TextDecoration) other).mask;
    }

    public final int hashCode() {
        return this.mask;
    }
}
