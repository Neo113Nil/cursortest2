package com.zettle.o11y.android.core.customtracker;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/o11y/android/core/customtracker/O11YCustomLogInterface;", "", "", "message", "", "addAction", "(Ljava/lang/String;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "addError", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface O11YCustomLogInterface {
    void addAction(java.lang.String message);

    void addError(java.lang.Throwable throwable);
}
