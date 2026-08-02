package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.C0715k;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements C0715k.a, Bundleable.Creator, Id3Decoder.FramePredicate {
    public static Object a(zzbk zzbkVar, int i, List list, int i2) {
        zzh.zza(zzbkVar.name(), i, list);
        return list.get(i2);
    }

    public static void c(AndroidWebKitError androidWebKitError, Function1 function1) {
        function1.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(androidWebKitError))));
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.iap.s sVar = com.facebook.appevents.iap.s.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.iap.s.class)) {
                return;
            }
            try {
                if (!com.facebook.appevents.internal.k.c()) {
                    com.facebook.appevents.iap.r.g();
                } else {
                    com.facebook.appevents.iap.s.e.set(true);
                    com.facebook.appevents.iap.s.d();
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.iap.s.class);
            }
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        boolean lambda$static$1;
        lambda$static$1 = Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
        return lambda$static$1;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        MediaMetadata fromBundle;
        fromBundle = MediaMetadata.fromBundle(bundle);
        return fromBundle;
    }
}
