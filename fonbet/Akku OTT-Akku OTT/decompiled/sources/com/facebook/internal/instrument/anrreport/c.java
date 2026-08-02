package com.facebook.internal.instrument.anrreport;

import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        switch (this.a) {
            case 0:
                com.facebook.internal.instrument.c cVar = (com.facebook.internal.instrument.c) obj;
                com.facebook.internal.instrument.c data = (com.facebook.internal.instrument.c) obj2;
                if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
                    return 0;
                }
                try {
                    Intrinsics.checkNotNullExpressionValue(data, "o2");
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(data, "data");
                    Long l = cVar.g;
                    if (l == null) {
                        return -1;
                    }
                    long longValue = l.longValue();
                    Long l2 = data.g;
                    if (l2 != null) {
                        return Intrinsics.compare(l2.longValue(), longValue);
                    }
                    return 1;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, e.class);
                    return 0;
                }
            default:
                lambda$static$0 = DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
                return lambda$static$0;
        }
    }
}
