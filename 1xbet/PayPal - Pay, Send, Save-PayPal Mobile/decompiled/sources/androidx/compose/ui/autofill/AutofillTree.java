package androidx.compose.ui.autofill;

@kotlin.Deprecated(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "", "plusAssign", "(Landroidx/compose/ui/autofill/AutofillNode;)V", "", "id", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "performAutofill", "(ILjava/lang/String;)Lkotlin/Unit;", "", "children", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutofillTree {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.Integer, androidx.compose.ui.autofill.AutofillNode> children = new java.util.LinkedHashMap();

    public final java.util.Map<java.lang.Integer, androidx.compose.ui.autofill.AutofillNode> getChildren() {
        return this.children;
    }

    public final void plusAssign(androidx.compose.ui.autofill.AutofillNode autofillNode) {
        this.children.put(java.lang.Integer.valueOf(autofillNode.getId()), autofillNode);
    }

    public final kotlin.Unit performAutofill(int id, java.lang.String value) {
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onFill;
        androidx.compose.ui.autofill.AutofillNode autofillNode = this.children.get(java.lang.Integer.valueOf(id));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(value);
        return kotlin.Unit.INSTANCE;
    }
}
