package com.amplitude.android.storage;

import android.content.SharedPreferences;
import com.amplitude.core.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public final com.amplitude.android.a a;
    public final i b;
    public final com.amplitude.id.a c;
    public final i d;
    public final ArrayList e;

    public d(com.amplitude.android.a amplitude, com.amplitude.android.h configuration) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = amplitude;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.b = a(configuration, "amplitude-disk-queue", "amplitude-android-" + configuration.a);
        this.d = a(configuration, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + configuration.a);
        File dir = configuration.b.getDir("amplitude-kotlin-" + configuration.e, 0);
        String str = configuration.e;
        String str2 = configuration.a;
        com.amplitude.id.b bVar = configuration.x;
        com.amplitude.common.a a = configuration.h.a(amplitude);
        String str3 = "amplitude-identity-" + configuration.e;
        Intrinsics.checkNotNull(dir);
        com.amplitude.id.d dVar = new com.amplitude.id.d(str, str2, bVar, dir, str3, a);
        arrayList.add(dir);
        this.c = new com.amplitude.id.a(dVar);
    }

    public final i a(com.amplitude.android.h hVar, String str, String str2) {
        File dir = hVar.b.getDir(str, 0);
        Intrinsics.checkNotNull(dir);
        this.e.add(dir);
        SharedPreferences sharedPreferences = hVar.b.getSharedPreferences(str2, 0);
        String str3 = hVar.a;
        com.amplitude.android.utilities.e eVar = hVar.h;
        com.amplitude.android.a aVar = this.a;
        com.amplitude.common.a a = eVar.a(aVar);
        Intrinsics.checkNotNull(sharedPreferences);
        return new i(str3, a, sharedPreferences, dir, aVar.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
    
        if (r6.a(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        c cVar;
        int i;
        d dVar;
        i iVar;
        d dVar2;
        Iterator it;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    com.amplitude.android.a aVar = this.a;
                    new com.amplitude.android.migration.i(this.c, aVar.h(), aVar.i()).a();
                    k j = aVar.j();
                    i iVar2 = j instanceof i ? (i) j : null;
                    if (iVar2 != null) {
                        com.amplitude.android.migration.e eVar = new com.amplitude.android.migration.e(this.b, iVar2, aVar.i());
                        cVar.a = this;
                        cVar.d = 1;
                    }
                    dVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar2 = cVar.a;
                        ResultKt.throwOnFailure(obj);
                        dVar = dVar2;
                        it = dVar.e.iterator();
                        while (it.hasNext()) {
                            File file = (File) it.next();
                            String[] list = file.list();
                            if (list != null && list.length == 0) {
                                file.delete();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    dVar = cVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                k g = dVar.a.g();
                iVar = g instanceof i ? (i) g : null;
                if (iVar != null) {
                    com.amplitude.android.migration.e eVar2 = new com.amplitude.android.migration.e(dVar.d, iVar, dVar.a.i());
                    cVar.a = dVar;
                    cVar.d = 2;
                    if (eVar2.a(cVar) != coroutine_suspended) {
                        dVar2 = dVar;
                        dVar = dVar2;
                    }
                    return coroutine_suspended;
                }
                it = dVar.e.iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        cVar = new c(this, continuationImpl);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
        k g2 = dVar.a.g();
        if (g2 instanceof i) {
        }
        if (iVar != null) {
        }
        it = dVar.e.iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
