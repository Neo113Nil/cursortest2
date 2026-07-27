package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.view.View;

/* compiled from: AnimationSession.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private String f8904a = "";
    private g b;
    private Animator c;
    private View d;
    private i e;

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f8904a = str;
    }

    public i b() {
        return this.e;
    }

    public View c() {
        return this.d;
    }

    public void a(g gVar) {
        this.b = gVar;
    }

    public Animator a() {
        return this.c;
    }

    public void a(Animator animator) {
        this.c = animator;
    }

    public void a(View view) {
        this.d = view;
    }

    public void a(i iVar) {
        this.e = iVar;
    }
}
