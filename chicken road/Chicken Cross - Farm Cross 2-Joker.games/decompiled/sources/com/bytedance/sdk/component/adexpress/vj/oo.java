package com.bytedance.sdk.component.adexpress.vj;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.pcc.lo;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class oo {
    private WeakReference<lo> pcc;

    public oo(lo loVar) {
        this.pcc = new WeakReference<>(loVar);
    }

    public void pcc(lo loVar) {
        this.pcc = new WeakReference<>(loVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<lo> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().invokeMethod(str);
    }
}
