package androidx.collection;

import com.facebook.internal.C0715k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements C0715k.a {
    public static StringBuilder a(CharSequence charSequence, String str, CharSequence charSequence2, String str2, CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(charSequence2, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence3);
        return sb;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.f fVar = com.facebook.appevents.integrity.f.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.f.class)) {
                return;
            }
            try {
                com.facebook.appevents.integrity.f.a.a();
                if (com.facebook.appevents.integrity.f.c.isEmpty()) {
                    return;
                }
                com.facebook.appevents.integrity.f.b = true;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.integrity.f.class);
            }
        }
    }
}
