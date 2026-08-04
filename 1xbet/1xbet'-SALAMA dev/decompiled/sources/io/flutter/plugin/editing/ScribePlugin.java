package io.flutter.plugin.editing;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p174z5.j;

/* JADX INFO: loaded from: classes2.dex */
public class ScribePlugin {
    private final InputMethodManager mInputMethodManager;
    private final j mScribeChannel;
    private View mView;

    public ScribePlugin(View view, InputMethodManager inputMethodManager, j jVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.mView = view;
        this.mInputMethodManager = inputMethodManager;
        this.mScribeChannel = jVar;
        jVar.f18500a = this;
    }

    public void destroy() {
        this.mScribeChannel.f18500a = null;
    }

    public boolean isFeatureAvailable() {
        return Build.VERSION.SDK_INT >= 34 && isStylusHandwritingAvailable();
    }

    public boolean isStylusHandwritingAvailable() {
        return this.mInputMethodManager.isStylusHandwritingAvailable();
    }

    public void setView(View view) {
        if (view == this.mView) {
            return;
        }
        this.mView = view;
    }

    public void startStylusHandwriting() {
        this.mInputMethodManager.startStylusHandwriting(this.mView);
    }
}
