package com.unity3d.player;

import android.content.Context;
import android.widget.EditText;

/* loaded from: classes7.dex */
public final class A extends AbstractC4933t {
    public DialogC4936v h;

    @Override // com.unity3d.player.AbstractC4933t
    public final void a(boolean z) {
        this.d = z;
        this.h.a(z);
    }

    public A(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }

    @Override // com.unity3d.player.AbstractC4933t
    public final void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        DialogC4936v dialogC4936v = new DialogC4936v(this.f11809a, this.b);
        this.h = dialogC4936v;
        dialogC4936v.a(this, z5, z6);
        this.h.setOnDismissListener(new com.unity3d.player.a.G(this));
        this.e = z6;
        setupTextInput(str, i, z, z2, z3, z4, str2, i2);
        a(z5);
        this.b.getFrameLayout().getViewTreeObserver().addOnGlobalLayoutListener(new com.unity3d.player.a.H(this));
        this.c.requestFocus();
        this.h.setOnCancelListener(new com.unity3d.player.a.I(this));
    }

    public void reportSoftInputArea() {
        if (this.h.isShowing()) {
            this.b.reportSoftInputArea(this.h.a());
        }
    }

    @Override // com.unity3d.player.AbstractC4933t
    public final void d() {
        this.h.show();
    }

    @Override // com.unity3d.player.AbstractC4933t
    public final void b() {
        this.h.dismiss();
    }

    @Override // com.unity3d.player.AbstractC4933t
    public EditText createEditText(AbstractC4933t abstractC4933t) {
        return new C4940z(this, this.f11809a, abstractC4933t);
    }
}
