package com.paypal.oslo.downloads.impl.util;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/impl/util/FileDeleter;", "", "", "path", "", "deleteIfExists", "(Ljava/lang/String;)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FileDeleter {
    boolean delete(java.lang.String path);

    boolean deleteIfExists(java.lang.String path);
}
