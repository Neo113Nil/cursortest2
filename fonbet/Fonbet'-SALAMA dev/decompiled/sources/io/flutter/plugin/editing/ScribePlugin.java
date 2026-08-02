package io.flutter.plugin.editing;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import z5.C1828j;

/* loaded from: classes2.dex */
public class ScribePlugin {
    private final InputMethodManager mInputMethodManager;
    private final C1828j mScribeChannel;
    private View mView;

    public ScribePlugin(View view, InputMethodManager inputMethodManager, C1828j c1828j) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.mView = view;
        this.mInputMethodManager = inputMethodManager;
        this.mScribeChannel = c1828j;
        c1828j.f18494a = this;
    }

    public void destroy() {
        this.mScribeChannel.f18494a = null;
    }

    public boolean isFeatureAvailable() {
        return Build.VERSION.SDK_INT >= 34 && isStylusHandwritingAvailable();
    }

    public boolean isStylusHandwritingAvailable() {
        boolean isStylusHandwritingAvailable;
        isStylusHandwritingAvailable = this.mInputMethodManager.isStylusHandwritingAvailable();
        return isStylusHandwritingAvailable;
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
