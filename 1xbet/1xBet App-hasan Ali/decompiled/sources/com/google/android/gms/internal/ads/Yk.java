package com.google.android.gms.internal.ads;

import T2.C0432j;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Yk extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public final C0432j f12353k;

    public Yk(Context context, View view, C0432j c0432j) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f12353k = c0432j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f12353k.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof InterfaceC0677Re)) {
                arrayList.add((InterfaceC0677Re) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((InterfaceC0677Re) arrayList.get(i5)).destroy();
        }
    }
}
