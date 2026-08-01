package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class pf {

    /* renamed from: a, reason: collision with root package name */
    public tf f4960a;
    public final boolean b;
    public final long c;

    public float a(boolean z) {
        return 1.0f;
    }

    public abstract Object a(Context context, Continuation continuation);

    public void a(float f, boolean z) {
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract void a(b7 b7Var, r5 r5Var);

    public abstract void a(boolean z, Integer num, Integer num2, e4 e4Var);

    public Bitmap k() {
        return null;
    }

    public long l() {
        return this.c;
    }

    public boolean m() {
        return this.b;
    }

    public final tf n() {
        return this.f4960a;
    }

    public abstract View o();

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public final void a(tf tfVar) {
        this.f4960a = tfVar;
    }

    public static /* synthetic */ float a(pf pfVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mute");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return pfVar.a(z);
    }

    public static /* synthetic */ void a(pf pfVar, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unmute");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        pfVar.a(f, z);
    }

    public static /* synthetic */ void a(pf pfVar, boolean z, Integer num, Integer num2, e4 e4Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackClick");
        }
        if ((i & 8) != 0) {
            e4Var = null;
        }
        pfVar.a(z, num, num2, e4Var);
    }

    public static /* synthetic */ void a(pf pfVar, b7 b7Var, r5 r5Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEngagement");
        }
        if ((i & 2) != 0) {
            r5Var = null;
        }
        pfVar.a(b7Var, r5Var);
    }
}
