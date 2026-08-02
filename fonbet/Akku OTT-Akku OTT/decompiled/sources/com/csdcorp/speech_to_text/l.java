package com.csdcorp.speech_to_text;

import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import android.speech.SpeechRecognizer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class l implements RecognitionSupportCallback {
    public final /* synthetic */ b a;
    public final /* synthetic */ SpeechToTextPlugin b;
    public final /* synthetic */ Ref.ObjectRef<SpeechRecognizer> c;

    public l(b bVar, SpeechToTextPlugin speechToTextPlugin, Ref.ObjectRef objectRef) {
        this.a = bVar;
        this.b = speechToTextPlugin;
        this.c = objectRef;
    }

    public final void onError(int i) {
        this.b.getClass();
        SpeechRecognizer speechRecognizer = this.c.element;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
    }

    public final void onSupportResult(RecognitionSupport recognitionSupport) {
        List<String> supportedOnDeviceLanguages;
        Intrinsics.checkNotNullParameter(recognitionSupport, "recognitionSupport");
        c cVar = new c(this.a, this.b.k);
        supportedOnDeviceLanguages = recognitionSupport.getSupportedOnDeviceLanguages();
        cVar.b(supportedOnDeviceLanguages);
        SpeechRecognizer speechRecognizer = this.c.element;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
    }
}
