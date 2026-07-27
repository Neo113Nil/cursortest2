package D;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.chicken.jump.road.pump.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: D.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0001b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f228c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f229a = f228c;

    /* renamed from: b, reason: collision with root package name */
    public final C0000a f230b = new C0000a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f229a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, E.i iVar) {
        this.f229a.onInitializeAccessibilityNodeInfo(view, iVar.f341a);
    }

    public boolean c(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i4 = 0; i4 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((E.d) list.get(i4)).f338a).getId() != i3; i4++) {
        }
        boolean performAccessibilityAction = this.f229a.performAccessibilityAction(view, i3, bundle);
        if (performAccessibilityAction || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i6 = 0; clickableSpanArr != null && i6 < clickableSpanArr.length; i6++) {
                if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
}
