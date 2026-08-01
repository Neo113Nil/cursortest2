package sg.bigo.ads.L0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class f extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f12409a;
    public boolean b;
    public e c;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12409a = 3000;
        this.b = false;
    }

    public final synchronized void a(boolean z) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.f12408a = true;
            this.c = null;
        }
        if (z) {
            e eVar2 = new e(this);
            this.c = eVar2;
            postDelayed(eVar2, this.f12409a);
        }
    }

    public int getFlipInterval() {
        return this.f12409a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(int i) {
        this.f12409a = i;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        a(true);
    }
}
