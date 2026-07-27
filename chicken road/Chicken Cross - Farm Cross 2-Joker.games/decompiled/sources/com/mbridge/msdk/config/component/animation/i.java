package com.mbridge.msdk.config.component.animation;

import android.view.View;

/* compiled from: ViewStateSnapshot.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private float f8906a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;

    public static i a(View view) {
        i iVar = new i();
        if (view == null) {
            return iVar;
        }
        iVar.f8906a = view.getTranslationX();
        iVar.b = view.getTranslationY();
        iVar.d = view.getScaleX();
        iVar.e = view.getScaleY();
        iVar.f = view.getRotation();
        iVar.g = view.getRotationX();
        iVar.h = view.getRotationY();
        iVar.i = view.getAlpha();
        iVar.c = view.getTranslationZ();
        return iVar;
    }

    public void b(View view) {
        if (view == null) {
            return;
        }
        view.setTranslationX(this.f8906a);
        view.setTranslationY(this.b);
        view.setScaleX(this.d);
        view.setScaleY(this.e);
        view.setRotation(this.f);
        view.setRotationX(this.g);
        view.setRotationY(this.h);
        view.setAlpha(this.i);
        view.setTranslationZ(this.c);
    }
}
