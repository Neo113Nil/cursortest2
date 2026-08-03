package y;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1014b {

    /* renamed from: c, reason: collision with root package name */
    public static final android.view.View.AccessibilityDelegate f8453c = new android.view.View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View.AccessibilityDelegate f8454a = f8453c;

    /* renamed from: b, reason: collision with root package name */
    public final y.C1013a f8455b = new y.C1013a(this);

    public void a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f8454a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(android.view.View view, z.C1041h c1041h) {
        this.f8454a.onInitializeAccessibilityNodeInfo(view, c1041h.f8517a);
    }

    public boolean c(android.view.View view, int i2, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        android.text.style.ClickableSpan clickableSpan;
        java.util.List list = (java.util.List) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < list.size() && ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ((z.C1036c) list.get(i3)).f8514a).getId() != i2; i3++) {
        }
        boolean performAccessibilityAction = this.f8454a.performAccessibilityAction(view, i2, bundle);
        if (performAccessibilityAction || i2 != com.watchfacestudio.huasi_urx110.R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (android.text.style.ClickableSpan) weakReference.get()) != null) {
            java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        return z2;
    }
}
