package com.akku.ottapp;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import dev.fluttercommunity.workmanager.BackgroundWorker;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements OnFailureListener, ListenerSet.IterationFinishedEvent, CallbackToFutureAdapter.Resolver, OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ d(Object obj) {
        this.a = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        BackgroundWorker backgroundWorker = (BackgroundWorker) this.a;
        BackgroundWorker.Companion companion = BackgroundWorker.INSTANCE;
        Intrinsics.checkNotNullParameter(completer, "completer");
        backgroundWorker.f = completer;
        return null;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((SimpleBasePlayer) this.a).lambda$new$0((Player.Listener) obj, flagSet);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$signInAnonymously$4((GeneratedAndroidFirebaseAuth.Result) this.a, task);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        MethodChannel.Result result = (MethodChannel.Result) this.a;
        int i = MainActivity.e;
        Intrinsics.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "Failed to get integrity token";
        }
        result.error("INTEGRITY_ERROR", message, exception.toString());
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.lambda$setUp$2((GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi) this.a, obj, reply);
    }
}
