package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public interface PluginListener {
    boolean onActivityResult(int i, int i2, android.content.Intent intent);

    void onDestroy();

    void onPause();

    void onResume();
}
