package com.pichillilorenzo.flutter_inappwebview_android.types;

import A5.o;
import A5.r;
import A5.s;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelDelegateImpl implements IChannelDelegate {
    private s channel;

    public ChannelDelegateImpl(s sVar) {
        this.channel = sVar;
        sVar.b(this);
    }

    public void dispose() {
        s sVar = this.channel;
        if (sVar != null) {
            sVar.b(null);
            this.channel = null;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate
    public s getChannel() {
        return this.channel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
    }
}
