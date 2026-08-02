package P;

import A1.x0;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: P.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0346b f5043a;

    public C0345a(C0346b c0346b) {
        this.f5043a = c0346b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5043a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f5043a.f5047a.getAccessibilityNodeProvider(view);
        x0 x0Var = accessibilityNodeProvider != null ? new x0(accessibilityNodeProvider, 8) : null;
        if (x0Var != null) {
            return (AccessibilityNodeProvider) x0Var.f613b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5043a.b(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        Object obj;
        int i7;
        int i8 = 1;
        Q.h hVar = new Q.h(accessibilityNodeInfo);
        WeakHashMap weakHashMap = U.f5037a;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(M.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i9 = 0;
        boolean z4 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z4);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z4 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(M.c(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z7 = bool2 != null && bool2.booleanValue();
        if (i10 >= 28) {
            accessibilityNodeInfo.setHeading(z7);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z7 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        if (i10 >= 28) {
            tag3 = M.b(view);
        } else {
            tag3 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i10 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            obj = O.b(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            obj = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence2 = (CharSequence) obj;
        if (i10 >= 30) {
            Q.d.c(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f5043a.c(view, hVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i10 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    if (((WeakReference) sparseArray.valueAt(i11)).get() == null) {
                        arrayList.add(Integer.valueOf(i11));
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    sparseArray.remove(((Integer) arrayList.get(i12)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i13 = 0;
                while (i13 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i13];
                    int i14 = i9;
                    while (true) {
                        if (i14 >= sparseArray2.size()) {
                            i7 = Q.h.f5734b;
                            Q.h.f5734b = i7 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i14)).get())) {
                                i7 = sparseArray2.keyAt(i14);
                                break;
                            }
                            i14 += i8;
                        }
                    }
                    sparseArray2.put(i7, new WeakReference(clickableSpanArr[i13]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i13];
                    Spanned spanned = (Spanned) text;
                    hVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    hVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    hVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    hVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i7));
                    i8 = 1;
                    i13++;
                    i9 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            hVar.f5735a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((Q.c) list.get(i15)).f5732a);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5043a.f5047a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5043a.d(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        return this.f5043a.e(view, i7, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i7) {
        this.f5043a.f5047a.sendAccessibilityEvent(view, i7);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f5043a.f5047a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
