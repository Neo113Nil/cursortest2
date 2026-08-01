package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* renamed from: com.unity3d.player.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4938x extends EditText {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4933t f11813a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4938x(Context context, AbstractC4933t abstractC4933t) {
        super(context);
        this.f11813a = abstractC4933t;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                AbstractC4933t abstractC4933t = this.f11813a;
                abstractC4933t.a(abstractC4933t.a(), false);
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC4933t abstractC4933t2 = this.f11813a;
            abstractC4933t2.a(abstractC4933t2.a(), false);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        if (i == 6) {
            AbstractC4933t abstractC4933t = this.f11813a;
            abstractC4933t.a(abstractC4933t.a(), false);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.f11813a.b.reportSoftInputSelection(i, i2 - i);
    }
}
