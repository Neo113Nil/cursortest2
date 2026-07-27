package com.unity3d.player.a;

import android.util.Log;

/* renamed from: com.unity3d.player.a.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC4890t {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f11775a = false;

    public static void Log(int i, String str) {
        if (f11775a) {
            return;
        }
        if (i == 6) {
            Log.e("Unity", str);
        }
        if (i == 5) {
            Log.w("Unity", str);
        }
    }
}
