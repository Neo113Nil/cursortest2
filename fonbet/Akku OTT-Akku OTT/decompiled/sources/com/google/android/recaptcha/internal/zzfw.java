package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;

/* loaded from: classes4.dex */
public final class zzfw {
    private final WebView zza;
    private final K zzb;

    public zzfw(WebView webView, K k) {
        this.zza = webView;
        this.zzb = k;
    }

    public final void zzb(String str, String... strArr) {
        C1082i.c(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
