package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import A1.J0;
import A5.o;
import A5.r;
import A5.s;
import R0.d;
import R0.k;
import R0.m;
import S0.C0431b;
import S0.w;
import S0.y;
import android.webkit.TracingController;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager, s sVar) {
        super(sVar);
        this.tracingControllerManager = tracingControllerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        boolean zIsTracing;
        FileOutputStream fileOutputStream;
        boolean zStop;
        TracingControllerManager.init();
        m mVar = TracingControllerManager.tracingController;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "isTracing":
                if (mVar == null) {
                    rVar.success(Boolean.FALSE);
                    return;
                }
                S0.o oVar2 = (S0.o) mVar;
                C0431b c0431b = w.f6267A;
                if (c0431b.a()) {
                    if (oVar2.f6254a == null) {
                        oVar2.f6254a = TracingController.getInstance();
                    }
                    zIsTracing = oVar2.f6254a.isTracing();
                } else {
                    if (!c0431b.b()) {
                        throw w.a();
                    }
                    if (oVar2.f6255b == null) {
                        oVar2.f6255b = y.f6312a.getTracingController();
                    }
                    zIsTracing = oVar2.f6255b.isTracing();
                }
                rVar.success(Boolean.valueOf(zIsTracing));
                return;
            case "stop":
                if (mVar == null || !d.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    rVar.success(Boolean.FALSE);
                    return;
                }
                String str2 = (String) oVar.a("filePath");
                if (str2 != null) {
                    try {
                        fileOutputStream = new FileOutputStream(str2);
                    } catch (FileNotFoundException e7) {
                        e7.printStackTrace();
                        rVar.success(Boolean.FALSE);
                        return;
                    }
                } else {
                    fileOutputStream = null;
                }
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                S0.o oVar3 = (S0.o) mVar;
                C0431b c0431b2 = w.f6267A;
                if (c0431b2.a()) {
                    if (oVar3.f6254a == null) {
                        oVar3.f6254a = TracingController.getInstance();
                    }
                    zStop = oVar3.f6254a.stop(fileOutputStream, executorServiceNewSingleThreadExecutor);
                } else {
                    if (!c0431b2.b()) {
                        throw w.a();
                    }
                    if (oVar3.f6255b == null) {
                        oVar3.f6255b = y.f6312a.getTracingController();
                    }
                    zStop = oVar3.f6255b.stop(fileOutputStream, executorServiceNewSingleThreadExecutor);
                }
                rVar.success(Boolean.valueOf(zStop));
                return;
            case "start":
                if (mVar == null || !d.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    rVar.success(Boolean.FALSE);
                    return;
                }
                Map<String, Object> map = (Map) oVar.a("settings");
                TracingSettings tracingSettings = new TracingSettings();
                tracingSettings.parse2(map);
                k kVarBuildTracingConfig = TracingControllerManager.buildTracingConfig(tracingSettings);
                S0.o oVar4 = (S0.o) mVar;
                if (kVarBuildTracingConfig == null) {
                    throw new IllegalArgumentException("Tracing config must be non null");
                }
                C0431b c0431b3 = w.f6267A;
                boolean zA = c0431b3.a();
                ArrayList arrayList = kVarBuildTracingConfig.f5859b;
                int i7 = kVarBuildTracingConfig.f5860c;
                int i8 = kVarBuildTracingConfig.f5858a;
                if (zA) {
                    if (oVar4.f6254a == null) {
                        oVar4.f6254a = TracingController.getInstance();
                    }
                    oVar4.f6254a.start(J0.p().addCategories(i8).addCategories(arrayList).setTracingMode(i7).build());
                } else {
                    if (!c0431b3.b()) {
                        throw w.a();
                    }
                    if (oVar4.f6255b == null) {
                        oVar4.f6255b = y.f6312a.getTracingController();
                    }
                    oVar4.f6255b.start(i8, arrayList, i7);
                }
                rVar.success(Boolean.TRUE);
                return;
            default:
                rVar.notImplemented();
                return;
        }
    }
}
