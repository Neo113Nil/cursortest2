package org.betup.ui;

/* loaded from: classes2.dex */
public interface BackPressedController {

    public interface BackPressedListener {
        boolean onBackPressed();
    }

    void pressBack();

    void removeListener();

    void setOnBackPressedListener(BackPressedListener listener);
}
