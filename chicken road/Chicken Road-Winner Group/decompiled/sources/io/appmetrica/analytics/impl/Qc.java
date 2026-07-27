package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* loaded from: classes.dex */
public abstract class Qc {
    public abstract void a(int i3);

    public final synchronized void a(Context context) {
        try {
            int b3 = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (b3 != libraryApiLevel) {
                if (b3 < libraryApiLevel) {
                    SparseArray c3 = c();
                    while (true) {
                        b3++;
                        if (b3 > libraryApiLevel) {
                            break;
                        }
                        Pc pc = (Pc) c3.get(b3);
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
