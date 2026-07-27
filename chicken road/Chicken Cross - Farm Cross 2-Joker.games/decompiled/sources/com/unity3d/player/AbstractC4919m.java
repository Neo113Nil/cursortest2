package com.unity3d.player;

import android.view.inputmethod.InputMethodSubtype;

/* renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC4919m {
    public static String a(InputMethodSubtype inputMethodSubtype) {
        if (PlatformSupport.NOUGAT_SUPPORT) {
            return inputMethodSubtype.getLanguageTag();
        }
        return inputMethodSubtype.getLocale();
    }
}
