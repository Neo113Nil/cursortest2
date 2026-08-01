package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ـ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0601 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f1574;

    public C0601(C0449 c0449) {
        this.f1574 = c0449;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r3.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("XmGtV7+l\n", "HyX4GfbxHnc=\n")) != false) goto L33;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f1574;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0449.getClass();
        switch (str.hashCode()) {
            case -1810696374:
                if (str.equals(StringFog.decrypt("6wRiR3QUAuPi\n", "p00kAjdNQa8=\n"))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1166291365:
                if (str.equals(StringFog.decrypt("B2FSzv/7AA==\n", "VDUdnL68Rd0=\n"))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -276710660:
                if (str.equals(StringFog.decrypt("ylOjhG8Yi0XFX7U=\n", "nBrnwSBIxwQ=\n"))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -54373961:
                if (str.equals(StringFog.decrypt("h/HhXQT+IpaS9/tK\n", "xL6vE0G9dt8=\n"))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 63879010:
                if (str.equals(StringFog.decrypt("XfOSndY=\n", "HrLR1ZO6sqg=\n"))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1167718561:
                if (str.equals(StringFog.decrypt("tRjvFCLJZD2j\n", "90qgVWaKJW4=\n"))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1813675631:
                if (str.equals(StringFog.decrypt("2wtrgRuqng==\n", "iU461F75ylk=\n"))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1815350732:
                if (str.equals(StringFog.decrypt("O1slatbtKw==\n", "aR52JZq7buM=\n"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1926303783:
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return WebViewEventCategory.ADUNIT;
            case 1:
                return WebViewEventCategory.VIDEOPLAYER;
            case 2:
                return WebViewEventCategory.REQUEST;
            case 3:
                return WebViewEventCategory.RESOLVE;
            case 4:
                return WebViewEventCategory.CACHE;
            case 5:
                return WebViewEventCategory.CONNECTIVITY;
            case 6:
                return WebViewEventCategory.STORAGE;
            case 7:
                return WebViewEventCategory.BROADCAST;
            case '\b':
                return WebViewEventCategory.LIFECYCLE;
            default:
                return null;
        }
    }
}
