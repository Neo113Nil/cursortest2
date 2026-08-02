package androidx.compose.foundation.text.contextmenu.data;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "", "", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "components", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuData {
    private final java.util.List<androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent> components;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.contextmenu.data.TextContextMenuData.Companion INSTANCE = new androidx.compose.foundation.text.contextmenu.data.TextContextMenuData.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.foundation.text.contextmenu.data.TextContextMenuData Empty = new androidx.compose.foundation.text.contextmenu.data.TextContextMenuData(kotlin.collections.CollectionsKt.emptyList());

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuData(java.util.List<? extends androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent> list) {
        this.components = list;
    }

    public final java.util.List<androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent> getComponents() {
        return this.components;
    }

    public final java.lang.String toString() {
        java.lang.String fastJoinToString$default = androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(this.components, "\n\t", "[\n\t", "\n]", 0, null, null, 56, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextContextMenuData(components=");
        sb.append(fastJoinToString$default);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "Empty", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "getEmpty", "()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.text.contextmenu.data.TextContextMenuData getEmpty() {
            return androidx.compose.foundation.text.contextmenu.data.TextContextMenuData.Empty;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
