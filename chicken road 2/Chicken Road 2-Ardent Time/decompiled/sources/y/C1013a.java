package y;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013a extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final y.C1014b f8452a;

    public C1013a(y.C1014b c1014b) {
        this.f8452a = c1014b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f8452a.f8454a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = this.f8452a.f8454a.getAccessibilityNodeProvider(view);
        z.C1042i c1042i = accessibilityNodeProvider != null ? new z.C1042i(accessibilityNodeProvider) : null;
        if (c1042i != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) c1042i.f8518a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f8452a.a(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.Object tag;
        java.lang.Object obj;
        java.lang.Object tag2;
        java.lang.Object obj2;
        int i2;
        int i3 = 1;
        z.C1041h c1041h = new z.C1041h(accessibilityNodeInfo);
        java.lang.reflect.Field field = y.x.f8478a;
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            tag = java.lang.Boolean.valueOf(y.AbstractC1031t.d(view));
        } else {
            tag = view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_screen_reader_focusable);
            if (!java.lang.Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) tag;
        int i5 = 0;
        boolean z2 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        if (i4 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z2);
        } else {
            android.os.Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z2 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (i4 >= 28) {
            obj = java.lang.Boolean.valueOf(y.AbstractC1031t.c(view));
        } else {
            java.lang.Object tag3 = view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_accessibility_heading);
            obj = java.lang.Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        boolean z3 = bool2 != null && bool2.booleanValue();
        if (i4 >= 28) {
            accessibilityNodeInfo.setHeading(z3);
        } else {
            android.os.Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z3 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        if (i4 >= 28) {
            tag2 = y.AbstractC1031t.b(view);
        } else {
            tag2 = view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_accessibility_pane_title);
            if (!java.lang.CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) tag2;
        if (i4 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i4 >= 30) {
            obj2 = y.AbstractC1033v.b(view);
        } else {
            java.lang.Object tag4 = view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_state_description);
            obj2 = java.lang.CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) obj2;
        if (i4 >= 30) {
            z.AbstractC1037d.c(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f8452a.b(view, c1041h);
        java.lang.CharSequence text = accessibilityNodeInfo.getText();
        if (i4 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                    if (((java.lang.ref.WeakReference) sparseArray.valueAt(i6)).get() == null) {
                        arrayList.add(java.lang.Integer.valueOf(i6));
                    }
                }
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    sparseArray.remove(((java.lang.Integer) arrayList.get(i7)).intValue());
                }
            }
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", com.watchfacestudio.huasi_urx110.R.id.accessibility_action_clickable_span);
                android.util.SparseArray sparseArray2 = (android.util.SparseArray) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new android.util.SparseArray();
                    view.setTag(com.watchfacestudio.huasi_urx110.R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i8 = 0;
                while (i8 < clickableSpanArr.length) {
                    android.text.style.ClickableSpan clickableSpan = clickableSpanArr[i8];
                    int i9 = i5;
                    while (true) {
                        if (i9 >= sparseArray2.size()) {
                            i2 = z.C1041h.f8516b;
                            z.C1041h.f8516b = i2 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((android.text.style.ClickableSpan) ((java.lang.ref.WeakReference) sparseArray2.valueAt(i9)).get())) {
                                i2 = sparseArray2.keyAt(i9);
                                break;
                            }
                            i9 += i3;
                        }
                    }
                    sparseArray2.put(i2, new java.lang.ref.WeakReference(clickableSpanArr[i8]));
                    android.text.style.ClickableSpan clickableSpan2 = clickableSpanArr[i8];
                    android.text.Spanned spanned = (android.text.Spanned) text;
                    c1041h.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(java.lang.Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c1041h.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(java.lang.Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c1041h.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(java.lang.Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c1041h.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(java.lang.Integer.valueOf(i2));
                    i3 = 1;
                    i8++;
                    i5 = 0;
                }
            }
        }
        java.util.List list = (java.util.List) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1041h.f8517a.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ((z.C1036c) list.get(i10)).f8514a);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f8452a.f8454a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f8452a.f8454a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i2, android.os.Bundle bundle) {
        return this.f8452a.c(view, i2, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View view, int i2) {
        this.f8452a.f8454a.sendAccessibilityEvent(view, i2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f8452a.f8454a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
