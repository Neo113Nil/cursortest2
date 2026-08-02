package com.facebook;

import android.os.Handler;
import android.os.Looper;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.z;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class O implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O(z.b bVar, long j, long j2) {
        this.a = 0;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((z.e) ((z.b) obj)).b();
                break;
            case 1:
                com.tekartik.sqflite.d dVar = (com.tekartik.sqflite.d) obj;
                ArrayList arrayList = dVar.f;
                while (!arrayList.isEmpty() && dVar.l == null) {
                    ((com.tekartik.sqflite.operation.e) arrayList.get(0)).a.run();
                    arrayList.remove(0);
                }
            case 2:
                ((TaskCompletionSource) obj).setResult(null);
                break;
            default:
                net.nfet.flutter.printing.h hVar = (net.nfet.flutter.printing.h) obj;
                try {
                    boolean[] zArr = {true};
                    int i3 = PathInterpolatorCompat.MAX_NUM_POINTS;
                    while (zArr[0]) {
                        new Handler(Looper.getMainLooper()).post(new com.csdcorp.speech_to_text.i(5, hVar, zArr));
                        i3--;
                        if (i3 <= 0) {
                            throw new Exception("Timeout waiting for the job to finish");
                        }
                        if (zArr[0]) {
                            Thread.sleep(200L);
                        }
                    }
                } catch (Exception e) {
                    new Handler(Looper.getMainLooper()).post(new net.nfet.flutter.printing.f(i2, hVar, e));
                }
                hVar.c = null;
                break;
        }
    }

    public /* synthetic */ O(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
