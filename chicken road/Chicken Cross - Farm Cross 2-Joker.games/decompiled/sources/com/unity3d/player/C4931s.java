package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4931s implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4933t f11807a;

    public C4931s(AbstractC4933t abstractC4933t) {
        this.f11807a = abstractC4933t;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC4933t abstractC4933t = this.f11807a;
            abstractC4933t.a(abstractC4933t.a(), false);
        }
        return false;
    }
}
