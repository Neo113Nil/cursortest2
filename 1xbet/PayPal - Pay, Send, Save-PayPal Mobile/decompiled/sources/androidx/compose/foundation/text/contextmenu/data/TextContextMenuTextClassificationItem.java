package androidx.compose.foundation.text.contextmenu.data;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuTextClassificationItem;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "", "key", "Landroid/view/textclassifier/TextClassification;", "textClassification", "", "index", "<init>", "(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/textclassifier/TextClassification;", "getTextClassification", "()Landroid/view/textclassifier/TextClassification;", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuTextClassificationItem extends androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent {
    public static final int $stable = 8;
    private final int index;
    private final android.view.textclassifier.TextClassification textClassification;

    public TextContextMenuTextClassificationItem(java.lang.Object obj, android.view.textclassifier.TextClassification textClassification, int i) {
        super(obj);
        this.textClassification = textClassification;
        this.index = i;
    }

    public final android.view.textclassifier.TextClassification getTextClassification() {
        return this.textClassification;
    }

    public final int getIndex() {
        return this.index;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(getKey());
        sb.append(", textClassification=");
        sb.append(this.textClassification);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(')');
        return sb.toString();
    }
}
