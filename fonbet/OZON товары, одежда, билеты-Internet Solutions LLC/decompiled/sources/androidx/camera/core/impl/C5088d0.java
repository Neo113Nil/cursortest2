package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: androidx.camera.core.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5088d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f38278a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f38279b = new HashMap();

    @NonNull
    public static C a(@NonNull AbstractC5094g0 abstractC5094g0) {
        C c11;
        synchronized (f38278a) {
            c11 = (C) f38279b.get(abstractC5094g0);
        }
        return c11 == null ? C.f38110a : c11;
    }
}
