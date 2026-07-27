package com.onesignal.debug.internal.crash;

import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.otel.android.AndroidOtelLogger;
import com.onesignal.debug.internal.logging.otel.android.OtelPlatformProviderKt;
import com.onesignal.otel.OtelFactory;
import com.onesignal.otel.crash.OtelCrashUploader;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalCrashUploaderWrapper$uploader$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalCrashUploaderWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalCrashUploaderWrapper$uploader$2(OneSignalCrashUploaderWrapper oneSignalCrashUploaderWrapper) {
        super(0);
        this.this$0 = oneSignalCrashUploaderWrapper;
    }

    @Override // t4.InterfaceC1430a
    public final OtelCrashUploader invoke() {
        IApplicationService iApplicationService;
        iApplicationService = this.this$0.applicationService;
        return OtelFactory.INSTANCE.createCrashUploader(OtelPlatformProviderKt.createAndroidOtelPlatformProvider(iApplicationService.getAppContext(), new OneSignalCrashUploaderWrapper$uploader$2$platformProvider$1(this.this$0)), new AndroidOtelLogger());
    }
}
