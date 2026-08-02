package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/PlatformSpanStyle;", "", "<init>", "()V", "other", "merge", "(Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/PlatformSpanStyle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformSpanStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.PlatformSpanStyle.Companion INSTANCE = new androidx.compose.ui.text.PlatformSpanStyle.Companion(null);
    private static final androidx.compose.ui.text.PlatformSpanStyle Default = new androidx.compose.ui.text.PlatformSpanStyle();

    public final androidx.compose.ui.text.PlatformSpanStyle merge(androidx.compose.ui.text.PlatformSpanStyle other) {
        return this;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/PlatformSpanStyle$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/PlatformSpanStyle;", "Default", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformSpanStyle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.PlatformSpanStyle getDefault() {
            return androidx.compose.ui.text.PlatformSpanStyle.Default;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean equals(java.lang.Object other) {
        return this == other || (other instanceof androidx.compose.ui.text.PlatformSpanStyle);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final java.lang.String toString() {
        return "PlatformSpanStyle()";
    }
}
