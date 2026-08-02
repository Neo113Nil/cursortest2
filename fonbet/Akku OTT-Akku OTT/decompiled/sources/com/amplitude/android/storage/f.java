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
public final class f {
    public final com.amplitude.android.a a;
    public final i b;
    public final com.amplitude.id.a c;
    public final i d;
    public final ArrayList e;

    public f(com.amplitude.android.a amplitude, com.amplitude.android.h configuration) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = amplitude;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.b = a(configuration, "amplitude-disk-queue", "amplitude-android-" + configuration.e);
        this.d = a(configuration, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + configuration.e);
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
        String str3 = hVar.e;
        com.amplitude.android.utilities.e eVar = hVar.h;
        com.amplitude.android.a aVar = this.a;
        com.amplitude.common.a a = eVar.a(aVar);
        Intrinsics.checkNotNull(sharedPreferences);
        return new i(str3, a, sharedPreferences, dir, aVar.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
    
        if (r6.a(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        e eVar;
        int i;
        f fVar;
        i iVar;
        f fVar2;
        Iterator it;
        if (continuationImpl instanceof e) {
            eVar = (e) continuationImpl;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
                Object obj = eVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    com.amplitude.android.a aVar = this.a;
                    new com.amplitude.android.migration.i(this.c, aVar.h(), aVar.i()).a();
                    if (!Intrinsics.areEqual(aVar.a.e, "$default_instance")) {
                        fVar = this;
                        it = fVar.e.iterator();
                        while (it.hasNext()) {
                        }
                        return Unit.INSTANCE;
                    }
                    k j = aVar.j();
                    i iVar2 = j instanceof i ? (i) j : null;
                    if (iVar2 != null) {
                        com.amplitude.android.migration.e eVar2 = new com.amplitude.android.migration.e(this.b, iVar2, aVar.i());
                        eVar.a = this;
                        eVar.d = 1;
                    }
                    fVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fVar2 = eVar.a;
                        ResultKt.throwOnFailure(obj);
                        fVar = fVar2;
                        it = fVar.e.iterator();
                        while (it.hasNext()) {
                            File file = (File) it.next();
                            String[] list = file.list();
                            if (list != null && list.length == 0) {
                                file.delete();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    fVar = eVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                k g = fVar.a.g();
                iVar = g instanceof i ? (i) g : null;
                if (iVar != null) {
                    com.amplitude.android.migration.e eVar3 = new com.amplitude.android.migration.e(fVar.d, iVar, fVar.a.i());
                    eVar.a = fVar;
                    eVar.d = 2;
                    if (eVar3.a(eVar) != coroutine_suspended) {
                        fVar2 = fVar;
                        fVar = fVar2;
                    }
                    return coroutine_suspended;
                }
                it = fVar.e.iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        eVar = new e(this, continuationImpl);
        Object obj2 = eVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.d;
        if (i != 0) {
        }
        k g2 = fVar.a.g();
        if (g2 instanceof i) {
        }
        if (iVar != null) {
        }
        it = fVar.e.iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
