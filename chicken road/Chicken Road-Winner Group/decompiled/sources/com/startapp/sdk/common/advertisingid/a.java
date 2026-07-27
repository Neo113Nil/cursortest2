package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.k0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f3324a;

    public a(b bVar) {
        this.f3324a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        k0 k0Var;
        try {
            this.f3324a.f3328d.lock();
            try {
                b bVar2 = this.f3324a;
                AtomicReference atomicReference = bVar2.f;
                Context context = bVar2.f3325a;
                try {
                    try {
                        k0Var = b.a(context);
                    } catch (Throwable th) {
                        if (bVar2.a(128)) {
                            d9.a(th);
                        }
                        try {
                            try {
                                k0Var = b.b(context);
                            } catch (AdvertisingIdResolver$InternalException e3) {
                                bVar2.b(e3.infoEventFlags);
                                k0Var = k0.f3939d;
                                atomicReference.set(k0Var);
                                bVar = this.f3324a;
                                bVar.f3331h = 2;
                                this.f3324a.f3329e.signalAll();
                                this.f3324a.f3328d.unlock();
                            }
                        } catch (Throwable th2) {
                            if (bVar2.a(256)) {
                                d9.a(th2);
                            }
                            k0Var = k0.f3939d;
                            atomicReference.set(k0Var);
                            bVar = this.f3324a;
                            bVar.f3331h = 2;
                            this.f3324a.f3329e.signalAll();
                            this.f3324a.f3328d.unlock();
                        }
                        atomicReference.set(k0Var);
                        bVar = this.f3324a;
                        bVar.f3331h = 2;
                        this.f3324a.f3329e.signalAll();
                        this.f3324a.f3328d.unlock();
                    }
                } catch (AdvertisingIdResolver$InternalException e4) {
                    bVar2.b(e4.infoEventFlags);
                    k0Var = b.b(context);
                    atomicReference.set(k0Var);
                    bVar = this.f3324a;
                    bVar.f3331h = 2;
                    this.f3324a.f3329e.signalAll();
                    this.f3324a.f3328d.unlock();
                }
                atomicReference.set(k0Var);
                bVar = this.f3324a;
            } catch (Throwable th3) {
                try {
                    if (this.f3324a.a(64)) {
                        d9.a(th3);
                    }
                    bVar = this.f3324a;
                } catch (Throwable th4) {
                    this.f3324a.f3331h = 2;
                    this.f3324a.f3329e.signalAll();
                    this.f3324a.f3328d.unlock();
                    throw th4;
                }
            }
            bVar.f3331h = 2;
            this.f3324a.f3329e.signalAll();
            this.f3324a.f3328d.unlock();
        } catch (Throwable th5) {
            this.f3324a.f3331h = 2;
            if (this.f3324a.a(16384)) {
                d9.a(th5);
            }
        }
    }
}
