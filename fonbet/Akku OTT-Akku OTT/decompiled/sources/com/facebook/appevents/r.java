package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.C0715k;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import java.util.HashSet;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements C0715k.a, Bundleable.Creator {
    public static int a(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static Object c(byte[] bArr, int i, Function1 function1) {
        return function1.invoke(UByte.m1728boximpl(UByteArray.m1792getw2LRezQ(bArr, i)));
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        HashSet<String> hashSet;
        if (z) {
            com.facebook.appevents.integrity.a aVar = com.facebook.appevents.integrity.a.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.a.class)) {
                return;
            }
            try {
                if (com.facebook.appevents.integrity.a.b) {
                    return;
                }
                com.facebook.appevents.integrity.a aVar2 = com.facebook.appevents.integrity.a.a;
                aVar2.getClass();
                if (!com.facebook.internal.instrument.crashshield.a.b(aVar2)) {
                    try {
                        com.facebook.internal.n k = com.facebook.internal.p.k(com.facebook.w.b(), false);
                        if (k != null) {
                            JSONArray jSONArray = k.t;
                            HashSet<String> hashSet2 = null;
                            try {
                                if (!com.facebook.internal.instrument.crashshield.a.b(aVar2)) {
                                    try {
                                        hashSet = com.facebook.internal.E.e(jSONArray);
                                        if (hashSet == null) {
                                            hashSet = new HashSet<>();
                                        }
                                    } catch (Exception unused) {
                                        hashSet = new HashSet<>();
                                    }
                                    hashSet2 = hashSet;
                                }
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, aVar2);
                            }
                            com.facebook.appevents.integrity.a.c = hashSet2;
                        }
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, aVar2);
                    }
                }
                com.facebook.appevents.integrity.a.b = !com.facebook.appevents.integrity.a.c.isEmpty();
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.a.a(th3, com.facebook.appevents.integrity.a.class);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        MediaItem.SubtitleConfiguration fromBundle;
        fromBundle = MediaItem.SubtitleConfiguration.fromBundle(bundle);
        return fromBundle;
    }
}
