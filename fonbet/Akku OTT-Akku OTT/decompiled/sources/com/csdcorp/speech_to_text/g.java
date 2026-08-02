package com.csdcorp.speech_to_text;

import android.speech.SpeechRecognizer;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SpeechToTextPlugin speechToTextPlugin = (SpeechToTextPlugin) this.b;
                SpeechRecognizer speechRecognizer = speechToTextPlugin.r;
                if (speechRecognizer != null) {
                    speechRecognizer.startListening(speechToTextPlugin.s);
                    break;
                }
                break;
            case 1:
                ((com.google.android.material.textfield.g) this.b).t(true);
                break;
            default:
                ((com.odehbros.flutter_file_downloader.downloader.d) this.b).f.b("Download canceled or failed due to network issues");
                break;
        }
    }
}
