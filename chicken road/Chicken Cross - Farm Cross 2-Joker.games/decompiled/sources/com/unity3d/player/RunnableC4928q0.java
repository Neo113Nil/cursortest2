package com.unity3d.player;

import android.text.InputFilter;
import android.widget.EditText;

/* renamed from: com.unity3d.player.q0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4928q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11804a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC4928q0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i) {
        this.b = unityPlayerForActivityOrService;
        this.f11804a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4933t abstractC4933t;
        abstractC4933t = this.b.mSoftInput;
        if (abstractC4933t != null) {
            int i = this.f11804a;
            EditText editText = abstractC4933t.c;
            if (editText != null) {
                if (i > 0) {
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
                } else {
                    editText.setFilters(new InputFilter[0]);
                }
            }
        }
    }
}
