package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.view.View;
import io.flutter.plugin.platform.f;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface PlatformWebView extends f {
    @Override // io.flutter.plugin.platform.f
    /* synthetic */ void dispose();

    @Override // io.flutter.plugin.platform.f
    /* synthetic */ View getView();

    void makeInitialLoad(HashMap<String, Object> map);

    @Override // io.flutter.plugin.platform.f
    /* bridge */ /* synthetic */ default void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.f
    /* bridge */ /* synthetic */ default void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.f
    /* bridge */ /* synthetic */ default void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.f
    /* bridge */ /* synthetic */ default void onInputConnectionUnlocked() {
    }
}
