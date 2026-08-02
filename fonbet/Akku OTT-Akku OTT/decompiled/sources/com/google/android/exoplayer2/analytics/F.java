package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;

/* loaded from: classes4.dex */
public final /* synthetic */ class F implements ListenerSet.Event, OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ F(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmSessionReleased((AnalyticsListener.EventTime) this.b);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$createUserWithEmailAndPassword$3((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$8((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            case 3:
                Messages.UrlLauncherApi.lambda$setUp$1((Messages.UrlLauncherApi) this.b, obj, reply);
                break;
            case 4:
                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiFlutterAssetManager) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$14$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }
}
