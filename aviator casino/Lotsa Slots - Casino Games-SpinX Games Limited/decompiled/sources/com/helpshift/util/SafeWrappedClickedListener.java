package com.helpshift.util;

/* loaded from: classes5.dex */
public class SafeWrappedClickedListener implements android.view.View.OnClickListener {
    private static final java.lang.String TAG = "SafeWrapClickListener";
    private final android.view.View.OnClickListener wrappedClickListener;

    public SafeWrappedClickedListener(android.view.View.OnClickListener onClickListener) {
        this.wrappedClickListener = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        try {
            this.wrappedClickListener.onClick(view);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error handling click", e);
        }
    }
}
