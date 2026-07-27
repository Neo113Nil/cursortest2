package com.unity3d.player;

import android.widget.EditText;

/* renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4926p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11802a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC4926p0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, String str) {
        this.b = unityPlayerForActivityOrService;
        this.f11802a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4933t abstractC4933t;
        String str;
        EditText editText;
        abstractC4933t = this.b.mSoftInput;
        if (abstractC4933t == null || (str = this.f11802a) == null || (editText = abstractC4933t.c) == null) {
            return;
        }
        editText.setText(str);
        abstractC4933t.c.setSelection(str.length());
    }
}
