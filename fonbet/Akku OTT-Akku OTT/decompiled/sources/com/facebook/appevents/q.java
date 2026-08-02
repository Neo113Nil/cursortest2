package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.C0715k;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.offline.StreamKey;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements C0715k.a, Bundleable.Creator {
    public static int a(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    public static Object c(short[] sArr, int i, Function1 function1) {
        return function1.invoke(UShort.m1991boximpl(UShortArray.m2055getMh2AYeg(sArr, i)));
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.aam.b bVar = com.facebook.appevents.aam.b.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.aam.b.class)) {
                return;
            }
            try {
                try {
                    com.facebook.w.c().execute(new com.facebook.appevents.aam.a());
                } catch (Exception unused) {
                    com.facebook.internal.E e = com.facebook.internal.E.a;
                    com.facebook.w wVar = com.facebook.w.a;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.aam.b.class);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        return StreamKey.fromBundle(bundle);
    }
}
