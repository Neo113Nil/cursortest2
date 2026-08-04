package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f12068c = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12069a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12070b = new Object();

    public final void a(s sVar) {
        synchronized (this.f12070b) {
            try {
                String string = sVar.d().toString();
                WeakReference weakReference = (WeakReference) this.f12069a.get(string);
                s sVar2 = weakReference != null ? (s) weakReference.get() : null;
                if (sVar2 == null || sVar2 == sVar) {
                    this.f12069a.remove(string);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
