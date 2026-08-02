package androidx.collection;

import com.facebook.internal.C0715k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements C0715k.a {
    public static StringBuilder a(CharSequence charSequence, String str, Function1 function1, String str2, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.integrity.g gVar = com.facebook.appevents.integrity.g.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.g.class)) {
                return;
            }
            try {
                com.facebook.appevents.integrity.g.a.a();
                if (com.facebook.appevents.integrity.g.c.isEmpty() && com.facebook.appevents.integrity.g.d.isEmpty()) {
                    com.facebook.appevents.integrity.g.b = false;
                } else {
                    com.facebook.appevents.integrity.g.b = true;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.integrity.g.class);
            }
        }
    }
}
