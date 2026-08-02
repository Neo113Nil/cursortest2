package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import A5.o;
import A5.r;
import A5.s;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import java.util.HashMap;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
    private FindInteractionController findInteractionController;

    public FindInteractionChannelDelegate(FindInteractionController findInteractionController, s sVar) {
        super(sVar);
        this.findInteractionController = findInteractionController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }

    public void onFindResultReceived(int i7, int i8, boolean z4) {
        FindInteractionController findInteractionController;
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        if (z4 && (findInteractionController = this.findInteractionController) != null && findInteractionController.webView != null) {
            findInteractionController.activeFindSession = new FindSession(i8, i7);
        }
        HashMap hashMap = new HashMap();
        AbstractC1663a.k(i7, hashMap, "activeMatchOrdinal", i8, "numberOfMatches");
        hashMap.put("isDoneCounting", Boolean.valueOf(z4));
        channel.a("onFindResultReceived", hashMap, null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        FindSession findSession;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "getSearchText":
                FindInteractionController findInteractionController = this.findInteractionController;
                if (findInteractionController == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    rVar.success(findInteractionController.searchText);
                    break;
                }
            case "findAll":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findAll((String) oVar.a("find"));
                }
                rVar.success(Boolean.TRUE);
                break;
            case "findNext":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findNext(((Boolean) oVar.a("forward")).booleanValue());
                }
                rVar.success(Boolean.TRUE);
                break;
            case "setSearchText":
                FindInteractionController findInteractionController2 = this.findInteractionController;
                if (findInteractionController2 == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    findInteractionController2.searchText = (String) oVar.a("searchText");
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case "clearMatches":
                FindInteractionController findInteractionController3 = this.findInteractionController;
                if (findInteractionController3 != null) {
                    findInteractionController3.clearMatches();
                }
                rVar.success(Boolean.TRUE);
                break;
            case "getActiveFindSession":
                FindInteractionController findInteractionController4 = this.findInteractionController;
                if (findInteractionController4 != null && (findSession = findInteractionController4.activeFindSession) != null) {
                    rVar.success(findSession.toMap());
                    break;
                } else {
                    rVar.success(null);
                    break;
                }
                break;
            default:
                rVar.notImplemented();
                break;
        }
    }
}
