package E;

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
import com.chickyneer.roadway.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0027b f597a;

    public C0026a(C0027b c0027b) {
        this.f597a = c0027b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f597a.f599a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f597a.f599a.getAccessibilityNodeProvider(view);
        B1.g gVar = accessibilityNodeProvider != null ? new B1.g(2, accessibilityNodeProvider) : null;
        if (gVar != null) {
            return (AccessibilityNodeProvider) gVar.f215b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f597a.a(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        Object tag2;
        Object obj2;
        int i2;
        int i3 = 1;
        F.i iVar = new F.i(accessibilityNodeInfo);
        Field field = G.f566a;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            tag = Boolean.valueOf(B.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i7 = 0;
        boolean z = (bool == null || !bool.booleanValue()) ? 0 : 1;
        if (i6 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (i6 >= 28) {
            obj = Boolean.valueOf(B.c(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z5 = bool2 != null && bool2.booleanValue();
        if (i6 >= 28) {
            accessibilityNodeInfo.setHeading(z5);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z5 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        if (i6 >= 28) {
            tag2 = B.b(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i6 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i6 >= 30) {
            obj2 = D.b(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            obj2 = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (i6 >= 30) {
            F.e.c(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f597a.b(view, iVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i6 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                    if (((WeakReference) sparseArray.valueAt(i8)).get() == null) {
                        arrayList.add(Integer.valueOf(i8));
                    }
                }
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    sparseArray.remove(((Integer) arrayList.get(i9)).intValue());
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
                int i10 = 0;
                while (i10 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i10];
                    int i11 = i7;
                    while (true) {
                        if (i11 >= sparseArray2.size()) {
                            i2 = F.i.f670b;
                            F.i.f670b = i2 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i11)).get())) {
                                i2 = sparseArray2.keyAt(i11);
                                break;
                            }
                            i11 += i3;
                        }
                    }
                    sparseArray2.put(i2, new WeakReference(clickableSpanArr[i10]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i10];
                    Spanned spanned = (Spanned) text;
                    iVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    iVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    iVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    iVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    i3 = 1;
                    i10++;
                    i7 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            iVar.f671a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((F.d) list.get(i12)).f668a);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f597a.f599a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f597a.f599a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.f597a.c(view, i2, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i2) {
        this.f597a.f599a.sendAccessibilityEvent(view, i2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f597a.f599a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
