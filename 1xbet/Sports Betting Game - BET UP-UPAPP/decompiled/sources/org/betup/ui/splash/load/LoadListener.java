package org.betup.ui.splash.load;

/* loaded from: classes4.dex */
public interface LoadListener {
    void displayPlayServicesError();

    void loadCompleted();

    void loadInetError();

    void loadProgress(int progress, String text);
}
