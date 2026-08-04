package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0913a f14215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f14216b;

    public u(Context context, C0913a c0913a, View view) {
        super(context);
        this.f14215a = c0913a;
        this.f14216b = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.k kVar = this.f14215a.f14143a;
        if (kVar == null) {
            return false;
        }
        return kVar.a(this.f14216b, view, accessibilityEvent);
    }
}
