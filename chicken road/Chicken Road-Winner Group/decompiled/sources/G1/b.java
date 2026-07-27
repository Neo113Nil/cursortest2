package G1;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.app.Activity;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ GetTopicsRequest.Builder e() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse i(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic j(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager k(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback l(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void o() {
    }
}
