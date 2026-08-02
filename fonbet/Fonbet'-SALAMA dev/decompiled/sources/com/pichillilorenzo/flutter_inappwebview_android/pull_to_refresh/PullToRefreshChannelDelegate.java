package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import A5.o;
import A5.r;
import A5.s;
import android.graphics.Color;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class PullToRefreshChannelDelegate extends ChannelDelegateImpl {
    private PullToRefreshLayout pullToRefreshView;

    public PullToRefreshChannelDelegate(PullToRefreshLayout pullToRefreshLayout, s sVar) {
        super(sVar);
        this.pullToRefreshView = pullToRefreshLayout;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.pullToRefreshView = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        char c3;
        String str = oVar.f676a;
        str.getClass();
        switch (str.hashCode()) {
            case -1790841290:
                if (str.equals("setSlingshotDistance")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 154556713:
                if (str.equals("setRefreshing")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 1235582893:
                if (str.equals("getDefaultSlingshotDistance")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 1364071551:
                if (str.equals("setEnabled")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1389555745:
                if (str.equals("setColor")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1743806995:
                if (str.equals("setBackgroundColor")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 1807783361:
                if (str.equals("setDistanceToTriggerSync")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 1849446385:
                if (str.equals("isRefreshing")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 2105594551:
                if (str.equals("isEnabled")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSlingshotDistance(((Integer) oVar.a("slingshotDistance")).intValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case 1:
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setRefreshing(((Boolean) oVar.a("refreshing")).booleanValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case 2:
                rVar.success(-1);
                break;
            case 3:
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    Boolean bool = (Boolean) oVar.a("enabled");
                    PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshView;
                    pullToRefreshLayout.settings.enabled = bool;
                    pullToRefreshLayout.setEnabled(bool.booleanValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case 4:
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setColorSchemeColors(Color.parseColor((String) oVar.a("color")));
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case 5:
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor((String) oVar.a("color")));
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case 6:
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setDistanceToTriggerSync(((Integer) oVar.a("distanceToTriggerSync")).intValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case 7:
                PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshView;
                rVar.success(Boolean.valueOf(pullToRefreshLayout2 != null && pullToRefreshLayout2.isRefreshing()));
                break;
            case '\b':
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSize(((Integer) oVar.a(RRWebVideoEvent.JsonKeys.SIZE)).intValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
            case '\t':
                PullToRefreshLayout pullToRefreshLayout3 = this.pullToRefreshView;
                if (pullToRefreshLayout3 == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    rVar.success(Boolean.valueOf(pullToRefreshLayout3.isEnabled()));
                    break;
                }
            default:
                rVar.notImplemented();
                break;
        }
    }

    public void onRefresh() {
        s channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onRefresh", new HashMap(), null);
    }
}
