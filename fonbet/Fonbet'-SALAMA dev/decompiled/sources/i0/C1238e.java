package i0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.common.internal.w;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f13819a;

    /* renamed from: b, reason: collision with root package name */
    public final M4.e f13820b;

    public C1238e(KeyListener keyListener) {
        M4.e eVar = new M4.e();
        this.f13819a = keyListener;
        this.f13820b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f13819a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f13819a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean z4;
        this.f13820b.getClass();
        if (i7 != 67 ? i7 != 112 ? false : w.A(editable, keyEvent, true) : w.A(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z4 = true;
        } else {
            z4 = false;
        }
        return z4 || this.f13819a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f13819a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f13819a.onKeyUp(view, editable, i7, keyEvent);
    }
}
