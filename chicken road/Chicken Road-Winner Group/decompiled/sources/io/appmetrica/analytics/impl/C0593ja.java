package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593ja {

    /* renamed from: a, reason: collision with root package name */
    public volatile Boolean f7612a;

    public final void a(Context context) {
        if (this.f7612a == null) {
            synchronized (this) {
                if (this.f7612a == null) {
                    boolean z3 = false;
                    try {
                        File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                        boolean exists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                        boolean exists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                        if (exists || exists2) {
                            z3 = true;
                        }
                    } catch (Throwable unused) {
                    }
                    this.f7612a = Boolean.valueOf(z3);
                }
            }
        }
    }
}
