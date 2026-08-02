package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class lIlIIIIlIl implements android.widget.TextView.OnEditorActionListener {
    public final /* synthetic */ com.microblink.blinkid.view.blinkcard.LabeledEditText llIIlIlIIl;

    public lIlIIIIlIl(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText) {
        this.llIIlIlIIl = labeledEditText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.AppCompatEditText appCompatEditText;
        androidx.appcompat.widget.AppCompatEditText appCompatEditText2;
        if (i != 6) {
            return false;
        }
        appCompatEditText = this.llIIlIlIIl.getOutputMinFrameDuration;
        appCompatEditText.clearFocus();
        ((android.view.View) this.llIIlIlIIl.getParent()).requestFocus();
        appCompatEditText2 = this.llIIlIlIIl.getOutputMinFrameDuration;
        com.microblink.blinkid.secured.lIlIIIIIll.llIIlIlIIl(appCompatEditText2);
        return false;
    }
}
