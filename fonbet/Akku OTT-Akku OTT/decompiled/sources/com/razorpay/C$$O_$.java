package com.razorpay;

import android.app.Activity;

/* renamed from: com.razorpay.$$O_$, reason: invalid class name */
/* loaded from: classes4.dex */
class C$$O_$ {
    public static String versionKey = "magic_version";
    private String O$$$__o0Oo;
    Activity activity;

    public C$$O_$(Activity activity) {
        this.activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O$$$__o0Oo(final String str) {
        Owl.get(_Oo_O_$.getInstance().getMagicJsUrl(), new Callback() { // from class: com.razorpay.$$O_$.2
            @Override // com.razorpay.Callback
            public void run(ResponseObject responseObject) {
                String decryptFile;
                if (responseObject.getResponseResult() == null || (decryptFile = BaseUtils.decryptFile(responseObject.getResponseResult())) == null) {
                    return;
                }
                if (BaseUtils.storeFileInInternal(C$$O_$.this.activity, BaseUtils.getVersionedAssetName(str, _Oo_O_$.getInstance().getMagicJsFileName()), responseObject.getResponseResult())) {
                    C$$O_$.this.O$$$__o0Oo = decryptFile;
                    BaseUtils.updateLocalVersion(C$$O_$.this.activity, C$$O_$.versionKey, str);
                }
            }
        });
    }

    public void checkForUpdates() {
        Owl.get(_Oo_O_$.getInstance().getMagicVersionUrl(), new Callback() { // from class: com.razorpay.$$O_$.1
            @Override // com.razorpay.Callback
            public void run(ResponseObject responseObject) {
                if (responseObject.getResponseResult() == null) {
                    return;
                }
                try {
                    String versionFromJsonString = BaseUtils.getVersionFromJsonString(responseObject.getResponseResult(), C$$O_$.versionKey);
                    if (BaseUtils.getLocalVersion(C$$O_$.this.activity, C$$O_$.versionKey).equals(versionFromJsonString)) {
                        return;
                    }
                    C$$O_$.this.O$$$__o0Oo(versionFromJsonString);
                } catch (Exception unused) {
                    AnalyticsUtil.reportError(getClass().getName(), "S1", "Could not extract version from server json");
                }
            }
        });
    }

    public String getMagicJs() {
        if (this.O$$$__o0Oo == null) {
            if (BaseUtils.getLocalVersion(this.activity, versionKey).equals(BaseUtils.getVersionFromJsonString(BaseConfig.getVersionJSON(), versionKey))) {
                this.O$$$__o0Oo = BaseConfig.getMagicJs();
            } else {
                try {
                    this.O$$$__o0Oo = BaseUtils.getFileFromInternal(this.activity, _Oo_O_$.getInstance().getMagicJsFileName(), versionKey);
                } catch (Exception unused) {
                    this.O$$$__o0Oo = BaseConfig.getMagicJs();
                }
            }
        }
        return this.O$$$__o0Oo;
    }
}
