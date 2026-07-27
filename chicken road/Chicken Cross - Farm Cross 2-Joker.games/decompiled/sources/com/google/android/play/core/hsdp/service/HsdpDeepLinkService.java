package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public interface HsdpDeepLinkService {
    public static final String SDK_VERSION = "2.0.0";

    /* compiled from: com.google.android.play:hsdp@@2.0.1 */
    public interface AffordanceListener {
        void onError(String str);

        void onStop();
    }

    /* compiled from: com.google.android.play:hsdp@@2.0.1 */
    public interface HsdpDeepLinkServiceListener {
        void onAffordanceEnded();

        void onAffordanceStarted();

        void onDeepLinkStarted();

        void onDismissed(Bundle bundle);

        void onError(Bundle bundle);

        void onShown(Bundle bundle);
    }

    /* compiled from: com.google.android.play:hsdp@@2.0.1 */
    public interface HsdpPrewarmListener {
        void onCompleted(Bundle bundle);

        void onError(Bundle bundle);
    }

    void detach();

    void dismiss(String str);

    void endSession(String str);

    void open(String str, String str2, HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener);

    void open(String str, String str2, HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map<String, String> map);

    void open(String str, String str2, HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map<String, String> map, boolean z);

    void prewarm(List<HsdpPrewarmRequest> list, HsdpPrewarmListener hsdpPrewarmListener);

    void stopAffordance(String str, AffordanceListener affordanceListener);
}
