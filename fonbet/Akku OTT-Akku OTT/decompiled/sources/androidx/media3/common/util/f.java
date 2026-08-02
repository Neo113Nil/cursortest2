package androidx.media3.common.util;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import java.util.HashMap;
import kotlin.UInt;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Bundleable.Creator {
    public static int a(UInt uInt, int i) {
        return UInt.m1811constructorimpl(uInt.getData() + i);
    }

    public static void b(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        Format fromBundle;
        fromBundle = Format.fromBundle(bundle);
        return fromBundle;
    }
}
