package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import A5.s;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class InAppBrowserChannelDelegate extends ChannelDelegateImpl {
    public InAppBrowserChannelDelegate(s sVar) {
        super(sVar);
    }

    public void onBrowserCreated() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onBrowserCreated", new HashMap(), null);
    }

    public void onExit() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onExit", new HashMap(), null);
    }

    public void onMenuItemClicked(InAppBrowserMenuItem inAppBrowserMenuItem) {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(inAppBrowserMenuItem.getId()));
        channel.a("onMenuItemClicked", map, null);
    }
}
