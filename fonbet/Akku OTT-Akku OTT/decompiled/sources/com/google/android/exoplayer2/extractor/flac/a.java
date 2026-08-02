package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiGeolocationPermissionsCallback;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements BinarySearchSeeker.SeekTimestampConverter, OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$applyActionCode$0((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$11((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            case 3:
                Messages.UrlLauncherApi.lambda$setUp$4((Messages.UrlLauncherApi) this.b, obj, reply);
                break;
            case 4:
                PigeonApiGeolocationPermissionsCallback.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiGeolocationPermissionsCallback) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return ((FlacStreamMetadata) this.b).getSampleNumber(j);
    }
}
