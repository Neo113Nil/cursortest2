package com.csdcorp.speech_to_text;

import android.print.PrintJob;
import com.facebook.appevents.C0689a;
import com.facebook.appevents.C0692d;
import com.facebook.appevents.C0693e;
import com.facebook.appevents.E;
import com.facebook.appevents.l;
import com.facebook.appevents.p;
import com.facebook.appevents.w;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.common.util.concurrent.u;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.odehbros.flutter_file_downloader.downloader.g;
import io.flutter.plugin.common.MethodChannel;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SpeechToTextPlugin speechToTextPlugin = (SpeechToTextPlugin) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                MethodChannel methodChannel = speechToTextPlugin.b;
                if (methodChannel != null) {
                    methodChannel.invokeMethod("notifyError", jSONObject.toString());
                    return;
                }
                return;
            case 1:
                C0689a accessTokenAppIdPair = (C0689a) this.b;
                C0692d appEvent = (C0692d) this.c;
                if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.j.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "$accessTokenAppId");
                    Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
                    C0693e c0693e = com.facebook.appevents.j.c;
                    synchronized (c0693e) {
                        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
                        E d = c0693e.d(accessTokenAppIdPair);
                        if (d != null) {
                            d.a(appEvent);
                        }
                    }
                    com.facebook.appevents.l.Companion.getClass();
                    p.Companion.getClass();
                    if (p.a.c() != l.b.b && com.facebook.appevents.j.c.c() > com.facebook.appevents.j.b) {
                        com.facebook.appevents.j.d(w.c);
                        return;
                    } else {
                        if (com.facebook.appevents.j.e == null) {
                            com.facebook.appevents.j.e = com.facebook.appevents.j.d.schedule(com.facebook.appevents.j.f, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.j.class);
                    return;
                }
            case 2:
                ((SimpleBasePlayer) this.b).lambda$updateStateForPendingOperation$61((u) this.c);
                return;
            case 3:
                ((UserMetadata) this.b).lambda$updateRolloutsState$1((List) this.c);
                return;
            case 4:
                g.a aVar = (g.a) this.b;
                String str = (String) this.c;
                com.odehbros.flutter_file_downloader.d dVar = com.odehbros.flutter_file_downloader.downloader.g.this.f;
                dVar.c(Calendar.getInstance().getTimeInMillis());
                dVar.e(str, 0.0d);
                return;
            default:
                net.nfet.flutter.printing.h hVar = (net.nfet.flutter.printing.h) this.b;
                boolean[] zArr = (boolean[]) this.c;
                net.nfet.flutter.printing.b bVar = hVar.b;
                PrintJob printJob = hVar.c;
                int state = printJob == null ? 6 : printJob.getInfo().getState();
                if (state == 5) {
                    bVar.a(hVar, true, null);
                    zArr[0] = false;
                    return;
                } else if (state == 7) {
                    bVar.a(hVar, false, null);
                    zArr[0] = false;
                    return;
                } else {
                    if (state == 6) {
                        bVar.a(hVar, false, "Unable to print");
                        zArr[0] = false;
                        return;
                    }
                    return;
                }
        }
    }
}
