package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.unity3d.player.a.C4894x;
import com.unity3d.player.a.C4895y;

/* renamed from: com.unity3d.player.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4940z extends EditText {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4933t f11816a;
    public final /* synthetic */ A b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4940z(A a2, Context context, AbstractC4933t abstractC4933t) {
        super(context);
        this.b = a2;
        this.f11816a = abstractC4933t;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C4895y c4895y;
        C4894x c4894x;
        Runnable runnable;
        if (i == 4) {
            if (keyEvent.getAction() == 1 && (c4895y = this.b.h.e) != null && (c4894x = c4895y.f11779a) != null && (runnable = c4894x.f11778a) != null) {
                runnable.run();
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC4933t abstractC4933t = this.f11816a;
            abstractC4933t.a(abstractC4933t.a(), false);
            return true;
        }
        if (i == 111 && keyEvent.getAction() == 0) {
            AbstractC4933t abstractC4933t2 = this.f11816a;
            abstractC4933t2.a(abstractC4933t2.a(), true);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            this.f11816a.e();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.f11816a.b.reportSoftInputSelection(i, i2 - i);
    }
}
