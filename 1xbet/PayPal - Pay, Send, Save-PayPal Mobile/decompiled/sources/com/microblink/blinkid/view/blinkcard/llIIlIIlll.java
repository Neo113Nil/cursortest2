package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class llIIlIIlll implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.blinkcard.LabeledEditText IlIllIlIIl;
    public final /* synthetic */ android.view.View llIIlIlIIl;

    public llIIlIIlll(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText, android.view.View view) {
        this.IlIllIlIIl = labeledEditText;
        this.llIIlIlIIl = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.widget.AppCompatEditText appCompatEditText;
        androidx.appcompat.widget.AppCompatEditText appCompatEditText2;
        android.graphics.Rect rect = new android.graphics.Rect();
        appCompatEditText = this.IlIllIlIIl.getOutputMinFrameDuration;
        appCompatEditText.getHitRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.llIIlIlIIl.getHitRect(rect2);
        rect.top = rect2.top;
        rect.bottom = rect2.bottom;
        rect.left = rect2.left;
        rect.right = rect2.right;
        android.view.View view = this.llIIlIlIIl;
        appCompatEditText2 = this.IlIllIlIIl.getOutputMinFrameDuration;
        view.setTouchDelegate(new android.view.TouchDelegate(rect, appCompatEditText2));
    }
}
