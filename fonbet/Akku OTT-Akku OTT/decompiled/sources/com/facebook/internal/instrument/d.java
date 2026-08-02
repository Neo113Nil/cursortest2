package com.facebook.internal.instrument;

import android.os.Bundle;
import com.facebook.C;
import com.facebook.D;
import com.facebook.S;
import com.facebook.internal.C0715k;
import com.facebook.internal.E;
import com.facebook.internal.F;
import com.facebook.internal.instrument.c;
import com.facebook.internal.instrument.crashreport.c;
import com.facebook.w;
import com.facebook.z;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.text.Cue;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements C0715k.a, Bundleable.Creator, Id3Decoder.FramePredicate {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        File[] listFiles;
        if (z) {
            synchronized (com.facebook.internal.instrument.crashreport.c.Companion) {
                try {
                    w wVar = w.a;
                    if (S.c()) {
                        c.a.a();
                    }
                    if (com.facebook.internal.instrument.crashreport.c.b == null) {
                        com.facebook.internal.instrument.crashreport.c cVar = new com.facebook.internal.instrument.crashreport.c(Thread.getDefaultUncaughtExceptionHandler());
                        com.facebook.internal.instrument.crashreport.c.b = cVar;
                        Thread.setDefaultUncaughtExceptionHandler(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (C0715k.b(C0715k.b.CrashShield)) {
                b.a = true;
                if (S.c() && !E.x()) {
                    File b = j.b();
                    if (b == null) {
                        listFiles = new File[0];
                    } else {
                        listFiles = b.listFiles(new i());
                        if (listFiles == null) {
                            listFiles = new File[0];
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file : listFiles) {
                        final c c = c.a.c(file);
                        if (c.a()) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("crash_shield", c.toString());
                                z.c cVar2 = z.Companion;
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{w.b()}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                                z.b bVar = new z.b() { // from class: com.facebook.internal.instrument.a
                                    @Override // com.facebook.z.b
                                    public final void a(com.facebook.E response) {
                                        JSONObject jSONObject2;
                                        c instrumentData = c.this;
                                        Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
                                        Intrinsics.checkNotNullParameter(response, "response");
                                        try {
                                            if (response.c == null && (jSONObject2 = response.d) != null && jSONObject2.getBoolean(FirebaseAnalytics.Param.SUCCESS)) {
                                                j.a(instrumentData.a);
                                            }
                                        } catch (JSONException unused) {
                                        }
                                    }
                                };
                                cVar2.getClass();
                                arrayList.add(z.c.h(null, format, jSONObject, bVar));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        D requests = new D(arrayList);
                        z.Companion.getClass();
                        Intrinsics.checkNotNullParameter(requests, "requests");
                        F.d(requests);
                        new C(requests).executeOnExecutor(w.c(), new Void[0]);
                    }
                }
                com.facebook.internal.instrument.crashshield.a.b = true;
            }
            if (C0715k.b(C0715k.b.ThreadCheck)) {
                int i = com.facebook.internal.instrument.threadcheck.a.a;
            }
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        boolean lambda$static$0;
        lambda$static$0 = Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
        return lambda$static$0;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        AudioAttributes lambda$static$0;
        Cue fromBundle;
        switch (this.a) {
            case 1:
                lambda$static$0 = AudioAttributes.lambda$static$0(bundle);
                return lambda$static$0;
            default:
                fromBundle = Cue.fromBundle(bundle);
                return fromBundle;
        }
    }
}
