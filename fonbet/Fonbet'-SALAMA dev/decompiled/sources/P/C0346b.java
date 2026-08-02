package P;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0346b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f5046c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f5047a;

    /* renamed from: b, reason: collision with root package name */
    public final C0345a f5048b;

    public C0346b() {
        this(f5046c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5047a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f5047a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, Q.h hVar) {
        this.f5047a.onInitializeAccessibilityNodeInfo(view, hVar.f5735a);
    }

    public boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5047a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean e(View view, int i7, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z4 = false;
        for (int i8 = 0; i8 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((Q.c) list.get(i8)).f5732a).getId() != i7; i8++) {
        }
        boolean performAccessibilityAction = this.f5047a.performAccessibilityAction(view, i7, bundle);
        if (performAccessibilityAction || i7 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i10 = 0;
            while (true) {
                if (clickableSpanArr == null || i10 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i10])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i10++;
            }
        }
        return z4;
    }

    public C0346b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5047a = accessibilityDelegate;
        this.f5048b = new C0345a(this);
    }
}
