package androidx.core.graphics;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.integrity.d;
import com.facebook.internal.C0715k;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import com.google.android.gms.internal.play_billing.zzgr;
import kotlin.jvm.internal.InlineMarker;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements C0715k.a {
    public static int a(int i, int i2, int i3) {
        return zzgr.zzz(i) + i2 + i3;
    }

    public static String c(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static void d(int i, Canvas canvas, int i2, int i3) {
        InlineMarker.finallyStart(i);
        canvas.restoreToCount(i2);
        InlineMarker.finallyEnd(i3);
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            d dVar = d.a;
            if (com.facebook.internal.instrument.crashshield.a.b(d.class)) {
                return;
            }
            try {
                d dVar2 = d.a;
                dVar2.getClass();
                if (!com.facebook.internal.instrument.crashshield.a.b(dVar2)) {
                    try {
                        n k = p.k(w.b(), false);
                        if (k != null) {
                            d.c = k.n;
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, dVar2);
                    }
                }
                if (d.c != null) {
                    d.b = true;
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, d.class);
            }
        }
    }
}
