package androidx.core.provider;

/* loaded from: classes3.dex */
class CalleeHandler {
    private CalleeHandler() {
    }

    static android.os.Handler getHighSpeedVideoSizes() {
        if (android.os.Looper.myLooper() == null) {
            return new android.os.Handler(android.os.Looper.getMainLooper());
        }
        return new android.os.Handler();
    }
}
