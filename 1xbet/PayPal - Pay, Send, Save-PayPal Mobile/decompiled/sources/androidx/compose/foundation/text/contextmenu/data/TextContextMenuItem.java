package androidx.compose.foundation.text.contextmenu.data;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuItem;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "", "key", "", "label", "", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "", "Lkotlin/ExtensionFunctionType;", "onClick", "<init>", "(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getLabel", com.visa.cbp.getEncExpo.warmup, "getLeadingIcon", "()I", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuItem extends androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent {
    public static final int $stable = 8;
    private final java.lang.String label;
    private final int leadingIcon;
    private final kotlin.jvm.functions.Function1<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, kotlin.Unit> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuItem(java.lang.Object obj, java.lang.String str, int i, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, kotlin.Unit> function1) {
        super(obj);
        this.label = str;
        this.leadingIcon = i;
        this.onClick = function1;
    }

    public /* synthetic */ TextContextMenuItem(java.lang.Object obj, java.lang.String str, int i, kotlin.jvm.functions.Function1 function1, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, (i2 & 4) != 0 ? 0 : i, function1);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final int getLeadingIcon() {
        return this.leadingIcon;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextContextMenuItem(key=");
        sb.append(getKey());
        sb.append(", label=\"");
        sb.append(this.label);
        sb.append("\", leadingIcon=");
        sb.append(this.leadingIcon);
        sb.append(')');
        return sb.toString();
    }
}
