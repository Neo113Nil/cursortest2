package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
