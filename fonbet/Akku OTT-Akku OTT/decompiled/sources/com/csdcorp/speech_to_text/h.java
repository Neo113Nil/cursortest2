package com.csdcorp.speech_to_text;

import android.speech.SpeechRecognizer;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SpeechRecognizer speechRecognizer = ((SpeechToTextPlugin) this.b).r;
                if (speechRecognizer != null) {
                    speechRecognizer.stopListening();
                    break;
                }
                break;
            default:
                FlutterFirebaseMessagingPlugin.lambda$deleteToken$2((TaskCompletionSource) this.b);
                break;
        }
    }
}
