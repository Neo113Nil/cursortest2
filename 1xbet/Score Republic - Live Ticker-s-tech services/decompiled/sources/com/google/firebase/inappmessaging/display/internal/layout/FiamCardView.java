package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import p000.AbstractC0284hf;
import p000.C0312i6;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class FiamCardView extends AbstractC0284hf {

    /* JADX INFO: renamed from: p */
    public C0312i6 f1370p;

    public FiamCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean boolM2541k = this.f1370p.m2541k(keyEvent);
        return boolM2541k != null ? boolM2541k.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f1370p = new C0312i6(13, this, onClickListener);
    }
}
