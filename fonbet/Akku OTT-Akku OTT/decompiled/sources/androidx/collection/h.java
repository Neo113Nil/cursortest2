package androidx.collection;

import android.net.Uri;
import com.facebook.appevents.integrity.i;
import com.facebook.internal.C0715k;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.source.hls.HlsExtractorFactory;
import com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor;
import com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzln;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPluginException;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements C0715k.a, HlsExtractorFactory {
    public static int a(int i, int i2, int i3) {
        return zzln.zzA(i) + i2 + i3;
    }

    public static StringBuilder c(String str, int i, int i2, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void d(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.i iVar = com.facebook.appevents.integrity.i.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.i.class)) {
                return;
            }
            try {
                com.facebook.appevents.integrity.i.c = true;
                com.facebook.appevents.integrity.i iVar2 = com.facebook.appevents.integrity.i.a;
                iVar2.getClass();
                if (com.facebook.internal.instrument.crashshield.a.b(iVar2)) {
                    return;
                }
                try {
                    n k = p.k(w.b(), false);
                    i.b bVar = null;
                    String str = k != null ? k.u : null;
                    if (str != null && str.length() != 0) {
                        bVar = iVar2.b(str);
                    }
                    com.facebook.appevents.integrity.i.d = bVar;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, iVar2);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.integrity.i.class);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
        HlsMediaChunkExtractor lambda$static$0;
        lambda$static$0 = MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
        return lambda$static$0;
    }
}
