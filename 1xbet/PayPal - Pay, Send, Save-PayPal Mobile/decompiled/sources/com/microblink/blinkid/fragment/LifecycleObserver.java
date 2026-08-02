package com.microblink.blinkid.fragment;

/* loaded from: classes10.dex */
public interface LifecycleObserver {
    void onConfigurationChanged(android.content.res.Configuration configuration);

    void onCreate(android.os.Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(android.os.Bundle bundle);

    void onStart();

    void onStop();
}
