package com.amplitude.android;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.T;

@SourceDebugExtension({"SMAP\nAmplitude.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Amplitude.kt\ncom/amplitude/android/Amplitude\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1747#2,3:186\n1#3:189\n*S KotlinDebug\n*F\n+ 1 Amplitude.kt\ncom/amplitude/android/Amplitude\n*L\n64#1:186,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a extends com.amplitude.core.b {
    public static final C0034a Companion = new C0034a();
    public c q;
    public com.amplitude.android.utilities.c r;

    /* renamed from: com.amplitude.android.a$a, reason: collision with other inner class name */
    public static final class C0034a {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object n(a aVar, com.amplitude.id.d configuration, ContinuationImpl continuationImpl) {
        b bVar;
        int i;
        Object obj;
        com.amplitude.id.e eVar;
        if (continuationImpl instanceof b) {
            bVar = (b) continuationImpl;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    com.amplitude.android.migration.k kVar = new com.amplitude.android.migration.k(aVar);
                    bVar.a = aVar;
                    bVar.b = configuration;
                    bVar.e = 1;
                    int i3 = kVar.d;
                    com.amplitude.android.storage.j[] jVarArr = com.amplitude.android.storage.j.a;
                    if (i3 < 3) {
                        kVar.c.c("Migrating storage to version 3");
                        obj = kVar.a(bVar);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        aVar.i().c("Storage already at version 3");
                        obj = Unit.INSTANCE;
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    configuration = bVar.b;
                    aVar = bVar.a;
                    ResultKt.throwOnFailure(obj2);
                }
                aVar.getClass();
                Intrinsics.checkNotNullParameter(configuration, "identityConfiguration");
                com.amplitude.id.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                synchronized (com.amplitude.id.e.b) {
                    try {
                        LinkedHashMap linkedHashMap = com.amplitude.id.e.c;
                        String str = configuration.a;
                        Object obj3 = linkedHashMap.get(str);
                        if (obj3 == null) {
                            obj3 = new com.amplitude.id.e(configuration);
                            linkedHashMap.put(str, obj3);
                        }
                        eVar = (com.amplitude.id.e) obj3;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar.l = eVar;
                com.amplitude.core.utilities.b listener = new com.amplitude.core.utilities.b(aVar.b);
                com.amplitude.id.g gVar = aVar.f().a;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                synchronized (gVar.d) {
                    gVar.e.add(listener);
                }
                if (aVar.f().a.f) {
                    listener.c(aVar.f().a.a(), com.amplitude.id.i.a);
                }
                Boolean bool = aVar.a.z;
                com.amplitude.android.plugins.e.Companion.getClass();
                if (!Intrinsics.areEqual(bool, (Object) null)) {
                    aVar.a(new com.amplitude.android.plugins.e());
                }
                c cVar = new c(aVar);
                aVar.q = cVar;
                aVar.a(cVar);
                aVar.a(new com.amplitude.core.platform.plugins.b());
                com.amplitude.android.utilities.c cVar2 = aVar.r;
                if (cVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityLifecycleCallbacks");
                    cVar2 = null;
                }
                aVar.a(new com.amplitude.android.plugins.d(cVar2));
                aVar.a(new com.amplitude.android.plugins.a());
                aVar.a(new com.amplitude.android.plugins.b());
                aVar.a(new com.amplitude.core.platform.plugins.a());
                com.amplitude.core.platform.m mVar = aVar.g;
                Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type com.amplitude.android.Timeline");
                x xVar = (x) mVar;
                com.amplitude.core.b c = xVar.c();
                C1082i.c(c.c, c.f, null, new u(c, xVar, null), 2);
                return Unit.INSTANCE;
            }
        }
        bVar = new b(aVar, continuationImpl);
        Object obj22 = bVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(configuration, "identityConfiguration");
        com.amplitude.id.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        synchronized (com.amplitude.id.e.b) {
        }
    }

    @Override // com.amplitude.core.b
    public final T b() {
        this.r = new com.amplitude.android.utilities.c();
        return super.b();
    }

    @Override // com.amplitude.core.b
    public final Object c(com.amplitude.id.d dVar, com.amplitude.core.a aVar) {
        return n(this, dVar, aVar);
    }

    @Override // com.amplitude.core.b
    public final com.amplitude.id.d d() {
        h configuration = this.a;
        Intrinsics.checkNotNull(configuration, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        String str = configuration.e;
        String str2 = configuration.a;
        com.amplitude.id.b bVar = configuration.x;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new com.amplitude.id.d(str, str2, bVar, configuration.a(), "identity", configuration.h.a(this));
    }
}
