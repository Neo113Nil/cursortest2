package io.flutter.plugin.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.compose.runtime.C0211b;
import io.flutter.embedding.engine.systemchannels.SensitiveContentChannel;

/* loaded from: classes3.dex */
public class SensitiveContentPlugin implements SensitiveContentChannel.SensitiveContentMethodHandler {
    private Activity mFlutterActivity;
    private final int mFlutterViewId;
    private final SensitiveContentChannel mSensitiveContentChannel;

    public SensitiveContentPlugin(@NonNull int i, @NonNull Activity activity, @NonNull SensitiveContentChannel sensitiveContentChannel) {
        this.mFlutterActivity = activity;
        this.mFlutterViewId = i;
        this.mSensitiveContentChannel = sensitiveContentChannel;
        sensitiveContentChannel.setSensitiveContentMethodHandler(this);
    }

    private String getFlutterViewNotFoundErrorReason() {
        return C0211b.a(new StringBuilder("FlutterView with ID "), this.mFlutterViewId, "not found");
    }

    private String getNotSupportedErrorReason() {
        return "isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.";
    }

    public void destroy() {
        this.mSensitiveContentChannel.setSensitiveContentMethodHandler(null);
        this.mFlutterActivity = null;
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    @SuppressLint({"NewApi"})
    public int getContentSensitivity() {
        int contentSensitivity;
        if (!isSupported()) {
            return 2;
        }
        View findViewById = this.mFlutterActivity.findViewById(this.mFlutterViewId);
        if (findViewById == null) {
            throw new IllegalArgumentException(getFlutterViewNotFoundErrorReason());
        }
        contentSensitivity = findViewById.getContentSensitivity();
        return contentSensitivity;
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 35;
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    @SuppressLint({"NewApi"})
    public void setContentSensitivity(@NonNull int i) {
        int contentSensitivity;
        if (!isSupported()) {
            throw new IllegalStateException(getNotSupportedErrorReason());
        }
        View findViewById = this.mFlutterActivity.findViewById(this.mFlutterViewId);
        if (findViewById == null) {
            throw new IllegalArgumentException(getFlutterViewNotFoundErrorReason());
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i) {
            return;
        }
        findViewById.setContentSensitivity(i);
        findViewById.invalidate();
    }
}
