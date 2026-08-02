package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public class e<V extends View> extends CoordinatorLayout.Behavior<V> {
    public f a;
    public int b;

    public e() {
        this.b = 0;
    }

    public final int a() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.d;
        }
        return 0;
    }

    public int b() {
        return a();
    }

    public void c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        c(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new f(v);
        }
        f fVar = this.a;
        View view = fVar.a;
        fVar.b = view.getTop();
        fVar.c = view.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        f fVar2 = this.a;
        if (fVar2.d != i2) {
            fVar2.d = i2;
            fVar2.a();
        }
        this.b = 0;
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
