package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/TextUtil;", "", "<init>", "()V", "Landroid/view/View;", "root", "", "Landroid/widget/TextView;", "getTextViews$workflow_release", "(Landroid/view/View;)Ljava/util/List;", "textView", "", "content", "", "setHtmlText", "(Landroid/widget/TextView;Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextUtil {
    public static final com.miteksystems.misnap.workflow.util.TextUtil INSTANCE = new com.miteksystems.misnap.workflow.util.TextUtil();

    public final /* synthetic */ java.util.List getTextViews$workflow_release(android.view.View root) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(root, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (root instanceof android.widget.TextView) {
            arrayList.add(root);
            return arrayList;
        }
        if (root instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) root;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
                arrayList.addAll(getTextViews$workflow_release(childAt));
            }
        }
        return arrayList;
    }

    @kotlin.jvm.JvmStatic
    public static final void setHtmlText(android.widget.TextView textView, java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        textView.setText(android.text.Html.fromHtml(content, 0));
    }

    private TextUtil() {
    }
}
