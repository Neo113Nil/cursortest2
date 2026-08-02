package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes4.dex */
public final /* synthetic */ class V0 implements ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ V0(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$42((SimpleBasePlayer.State) this.a, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.lambda$setUp$1((GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi) this.a, obj, reply);
    }
}
