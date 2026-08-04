package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import A5.o;
import A5.r;
import A5.s;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;

/* JADX INFO: loaded from: classes2.dex */
public class PrintJobChannelDelegate extends ChannelDelegateImpl {
    private PrintJobController printJobController;

    public PrintJobChannelDelegate(PrintJobController printJobController, s sVar) {
        super(sVar);
        this.printJobController = printJobController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "cancel":
                PrintJobController printJobController = this.printJobController;
                if (printJobController == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController.cancel();
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "getInfo":
                PrintJobController printJobController2 = this.printJobController;
                if (printJobController2 == null) {
                    rVar.success(null);
                    break;
                } else {
                    PrintJobInfoExt info = printJobController2.getInfo();
                    rVar.success(info != null ? info.toMap() : null);
                    break;
                }
                break;
            case "restart":
                PrintJobController printJobController3 = this.printJobController;
                if (printJobController3 == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController3.restart();
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "dispose":
                PrintJobController printJobController4 = this.printJobController;
                if (printJobController4 == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    printJobController4.dispose();
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            default:
                rVar.notImplemented();
                break;
        }
    }
}
