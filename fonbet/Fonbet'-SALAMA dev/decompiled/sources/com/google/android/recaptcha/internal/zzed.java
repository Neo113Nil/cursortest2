package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import android.webkit.WebView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzed {
    private final WebView zza;
    private final C zzb;

    public zzed(WebView webView, C c3) {
        this.zza = webView;
        this.zzb = c3;
    }

    public final void zzb(String str, String... strArr) {
        E.p(this.zzb, new zzec((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
