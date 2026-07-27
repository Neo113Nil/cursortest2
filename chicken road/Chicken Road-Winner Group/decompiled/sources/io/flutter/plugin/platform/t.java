package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class t extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C1045a f9325a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9326b;

    public t(Context context, C1045a c1045a, View view) {
        super(context);
        this.f9325a = c1045a;
        this.f9326b = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.i iVar = this.f9325a.f9249a;
        if (iVar == null) {
            return false;
        }
        return iVar.a(this.f9326b, view, accessibilityEvent);
    }
}
