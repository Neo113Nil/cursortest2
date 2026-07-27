package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* loaded from: classes.dex */
public abstract class Qc {
    public abstract void a(int i2);

    public final synchronized void a(Context context) {
        try {
            int b6 = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (b6 != libraryApiLevel) {
                if (b6 < libraryApiLevel) {
                    SparseArray c2 = c();
                    while (true) {
                        b6++;
                        if (b6 > libraryApiLevel) {
                            break;
                        }
                        Pc pc = (Pc) c2.get(b6);
                        if (pc != null) {
                            pc.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
