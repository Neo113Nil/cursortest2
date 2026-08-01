package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandleDebugSettings.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "", "<init>", "()V", "invoke", "", "debugSettings", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HandleDebugSettings {
    public final void invoke(NativeConfigurationOuterClass.DebugSettings debugSettings) {
        Intrinsics.checkNotNullParameter(debugSettings, "debugSettings");
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
