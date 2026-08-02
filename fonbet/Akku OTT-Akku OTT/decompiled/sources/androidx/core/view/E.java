package androidx.core.view;

import android.speech.SpeechRecognizer;
import com.csdcorp.speech_to_text.SpeechToTextPlugin;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ E(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((Function0) this.b).invoke();
                break;
            case 1:
                SpeechRecognizer speechRecognizer = ((SpeechToTextPlugin) this.b).r;
                if (speechRecognizer != null) {
                    speechRecognizer.cancel();
                    break;
                }
                break;
            case 2:
                com.facebook.appevents.w reason = (com.facebook.appevents.w) this.b;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.j.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(reason, "$reason");
                        com.facebook.appevents.j.d(reason);
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.j.class);
                        return;
                    }
                }
                break;
            default:
                ((com.odehbros.flutter_file_downloader.downloader.d) this.b).f.b("File size is Zero!");
                break;
        }
    }
}
