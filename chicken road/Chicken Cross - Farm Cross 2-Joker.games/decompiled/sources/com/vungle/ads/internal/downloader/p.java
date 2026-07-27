package com.vungle.ads.internal.downloader;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class p extends FunctionReferenceImpl implements Function0 {
    public p(Object obj) {
        super(0, obj, t.class, "getOrCreateDownloader", "getOrCreateDownloader()Lcom/vungle/ads/internal/downloader/AssetDownloader;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        i iVar;
        t tVar = (t) this.receiver;
        i iVar2 = tVar.g;
        if (iVar2 != null) {
            return iVar2;
        }
        ReentrantLock reentrantLock = tVar.c;
        reentrantLock.lock();
        try {
            if (tVar.e) {
                iVar = null;
            } else {
                i iVar3 = tVar.g;
                if (iVar3 == null) {
                    iVar3 = new i(((com.vungle.ads.internal.executor.d) tVar.f11908a).f, tVar.b);
                    tVar.g = iVar3;
                }
                iVar = iVar3;
            }
            reentrantLock.unlock();
            return iVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
