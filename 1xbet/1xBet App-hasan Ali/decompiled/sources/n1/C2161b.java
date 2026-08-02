package n1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import game.betting133.sports1xbet.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import k0.C2023c;
import o1.C2216c;
import o1.C2218e;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2161b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f18413c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f18414a;

    /* renamed from: b, reason: collision with root package name */
    public final C2160a f18415b;

    public C2161b() {
        this(f18413c);
    }

    public C2023c a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f18414a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C2023c(7, accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f18414a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, C2218e c2218e) {
        this.f18414a.onInitializeAccessibilityNodeInfo(view, c2218e.f18616a);
    }

    public boolean d(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i5 = 0; i5 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C2216c) list.get(i5)).f18613a).getId() != i; i5++) {
        }
        boolean performAccessibilityAction = this.f18414a.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i7 = 0; clickableSpanArr != null && i7 < clickableSpanArr.length; i7++) {
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public C2161b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f18414a = accessibilityDelegate;
        this.f18415b = new C2160a(this);
    }
}
