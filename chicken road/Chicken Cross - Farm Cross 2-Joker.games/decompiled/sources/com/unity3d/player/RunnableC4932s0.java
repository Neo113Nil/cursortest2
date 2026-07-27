package com.unity3d.player;

import android.widget.EditText;

/* renamed from: com.unity3d.player.s0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4932s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11808a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UnityPlayerForActivityOrService c;

    public RunnableC4932s0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i, int i2) {
        this.c = unityPlayerForActivityOrService;
        this.f11808a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4933t abstractC4933t;
        int i;
        abstractC4933t = this.c.mSoftInput;
        if (abstractC4933t != null) {
            int i2 = this.f11808a;
            int i3 = this.b;
            EditText editText = abstractC4933t.c;
            if (editText == null || editText.getText().length() < (i = i3 + i2)) {
                return;
            }
            abstractC4933t.c.setSelection(i2, i);
        }
    }
}
