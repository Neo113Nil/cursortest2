package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import i1.AbstractC0336f;
import i1.C0337g;
import i1.C0341k;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ng {

    /* renamed from: a, reason: collision with root package name */
    public static String f4110a;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f4111b = new AtomicBoolean(true);

    public static void a(M0.a aVar) {
        f4110a = aVar.f963a;
    }

    public static String a(Context context) {
        if (f4111b.getAndSet(false)) {
            try {
                C0341k t3 = new V1.b(context).t();
                t3.f5023b.d(new C0337g(AbstractC0336f.f5012a, new A0.r(7)));
                t3.g();
            } catch (GooglePlayServicesMissingManifestValueException | NoClassDefFoundError unused) {
            }
        }
        return f4110a;
    }
}
