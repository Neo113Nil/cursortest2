package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import A5.o;
import A5.r;
import A5.s;
import android.graphics.Color;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
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

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "setSlingshotDistance":
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSlingshotDistance(((Integer) oVar.a("slingshotDistance")).intValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "setRefreshing":
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setRefreshing(((Boolean) oVar.a("refreshing")).booleanValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "getDefaultSlingshotDistance":
                rVar.success(-1);
                break;
            case "setEnabled":
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
                break;
            case "setColor":
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setColorSchemeColors(Color.parseColor((String) oVar.a("color")));
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "setBackgroundColor":
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor((String) oVar.a("color")));
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "setDistanceToTriggerSync":
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setDistanceToTriggerSync(((Integer) oVar.a("distanceToTriggerSync")).intValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "isRefreshing":
                PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshView;
                rVar.success(Boolean.valueOf(pullToRefreshLayout2 != null && pullToRefreshLayout2.isRefreshing()));
                break;
            case "setSize":
                if (this.pullToRefreshView == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.pullToRefreshView.setSize(((Integer) oVar.a(RRWebVideoEvent.JsonKeys.SIZE)).intValue());
                    rVar.success(Boolean.TRUE);
                    break;
                }
                break;
            case "isEnabled":
                PullToRefreshLayout pullToRefreshLayout3 = this.pullToRefreshView;
                if (pullToRefreshLayout3 == null) {
                    rVar.success(Boolean.FALSE);
                    break;
                } else {
                    rVar.success(Boolean.valueOf(pullToRefreshLayout3.isEnabled()));
                    break;
                }
                break;
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
