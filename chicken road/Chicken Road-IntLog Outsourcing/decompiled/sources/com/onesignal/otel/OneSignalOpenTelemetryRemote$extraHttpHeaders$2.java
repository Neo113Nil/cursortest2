package com.onesignal.otel;

import com.onesignal.core.internal.http.impl.HttpClientKt;
import f4.C0430g;
import g4.AbstractC0476u;
import java.util.Map;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalOpenTelemetryRemote$extraHttpHeaders$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalOpenTelemetryRemote this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalOpenTelemetryRemote$extraHttpHeaders$2(OneSignalOpenTelemetryRemote oneSignalOpenTelemetryRemote) {
        super(0);
        this.this$0 = oneSignalOpenTelemetryRemote;
    }

    @Override // t4.InterfaceC1430a
    public final Map<String, String> invoke() {
        IOtelPlatformProvider iOtelPlatformProvider;
        IOtelPlatformProvider iOtelPlatformProvider2;
        StringBuilder sb = new StringBuilder("onesignal/");
        iOtelPlatformProvider = this.this$0.platformProvider;
        sb.append(iOtelPlatformProvider.getSdkBase());
        sb.append('/');
        iOtelPlatformProvider2 = this.this$0.platformProvider;
        sb.append(iOtelPlatformProvider2.getSdkBaseVersion());
        return AbstractC0476u.X(new C0430g(HttpClientKt.HTTP_SDK_VERSION_HEADER_KEY, sb.toString()));
    }
}
