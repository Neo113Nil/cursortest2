package androidx.collection;

import androidx.compose.runtime.snapshots.SnapshotStateMapKt;
import com.facebook.internal.C0715k;
import com.google.android.datatransport.j;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements C0715k.a, j {
    public static String c(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static KotlinNothingValueException d() {
        SnapshotStateMapKt.unsupported();
        return new KotlinNothingValueException();
    }

    @Override // com.google.android.datatransport.j
    public void a(Exception exc) {
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.restrictivedatafilter.a aVar = com.facebook.appevents.restrictivedatafilter.a.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.restrictivedatafilter.a.class)) {
                return;
            }
            try {
                com.facebook.appevents.restrictivedatafilter.a.b = true;
                com.facebook.appevents.restrictivedatafilter.a.a.b();
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.restrictivedatafilter.a.class);
            }
        }
    }
}
