package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.graphics.Color;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class PullToRefreshChannelDelegate extends ChannelDelegateImpl {
    private PullToRefreshLayout pullToRefreshView;

    public PullToRefreshChannelDelegate(PullToRefreshLayout pullToRefreshLayout, MethodChannel methodChannel) {
        super(methodChannel);
        this.pullToRefreshView = pullToRefreshLayout;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.pullToRefreshView = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        char c;
        String str = methodCall.method;
        str.getClass();
        switch (str.hashCode()) {
            case -1790841290:
                if (str.equals("setSlingshotDistance")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 154556713:
                if (str.equals("setRefreshing")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1235582893:
                if (str.equals("getDefaultSlingshotDistance")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1364071551:
                if (str.equals("setEnabled")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1389555745:
                if (str.equals("setColor")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743806995:
                if (str.equals("setBackgroundColor")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1807783361:
                if (str.equals("setDistanceToTriggerSync")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1849446385:
                if (str.equals("isRefreshing")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2105594551:
                if (str.equals("isEnabled")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (this.pullToRefreshView == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSlingshotDistance(((Integer) methodCall.argument("slingshotDistance")).intValue());
                    result.success(Boolean.TRUE);
                    break;
                }
            case 1:
                if (this.pullToRefreshView == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setRefreshing(((Boolean) methodCall.argument("refreshing")).booleanValue());
                    result.success(Boolean.TRUE);
                    break;
                }
            case 2:
                result.success(-1);
                break;
            case 3:
                if (this.pullToRefreshView == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    Boolean bool = (Boolean) methodCall.argument("enabled");
                    PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshView;
                    pullToRefreshLayout.settings.enabled = bool;
                    pullToRefreshLayout.setEnabled(bool.booleanValue());
                    result.success(Boolean.TRUE);
                    break;
                }
            case 4:
                if (this.pullToRefreshView == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setColorSchemeColors(Color.parseColor((String) methodCall.argument("color")));
                    result.success(Boolean.TRUE);
                    break;
                }
            case 5:
                if (this.pullToRefreshView == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor((String) methodCall.argument("color")));
                    result.success(Boolean.TRUE);
                    break;
                }
            case 6:
                if (this.pullToRefreshView == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setDistanceToTriggerSync(((Integer) methodCall.argument("distanceToTriggerSync")).intValue());
                    result.success(Boolean.TRUE);
                    break;
                }
            case 7:
                PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshView;
                result.success(Boolean.valueOf(pullToRefreshLayout2 != null && pullToRefreshLayout2.isRefreshing()));
                break;
            case '\b':
                if (this.pullToRefreshView == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSize(((Integer) methodCall.argument("size")).intValue());
                    result.success(Boolean.TRUE);
                    break;
                }
            case '\t':
                PullToRefreshLayout pullToRefreshLayout3 = this.pullToRefreshView;
                if (pullToRefreshLayout3 == null) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    result.success(Boolean.valueOf(pullToRefreshLayout3.isEnabled()));
                    break;
                }
            default:
                result.notImplemented();
                break;
        }
    }

    public void onRefresh() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onRefresh", new HashMap());
    }
}
