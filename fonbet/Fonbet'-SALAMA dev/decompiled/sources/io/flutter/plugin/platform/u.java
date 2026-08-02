package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class u extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C1294a f14209a;

    /* renamed from: b, reason: collision with root package name */
    public final View f14210b;

    public u(Context context, C1294a c1294a, View view) {
        super(context);
        this.f14209a = c1294a;
        this.f14210b = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.k kVar = this.f14209a.f14137a;
        if (kVar == null) {
            return false;
        }
        return kVar.a(this.f14210b, view, accessibilityEvent);
    }
}
