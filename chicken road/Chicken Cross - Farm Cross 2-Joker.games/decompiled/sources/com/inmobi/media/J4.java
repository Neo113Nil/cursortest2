package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class J4 {

    /* renamed from: a, reason: collision with root package name */
    public final L4 f6641a;
    public final K4 b;

    public J4(L4 configManagerState, K4 configManagerDI) {
        Intrinsics.checkNotNullParameter(configManagerState, "configManagerState");
        Intrinsics.checkNotNullParameter(configManagerDI, "configManagerDI");
        this.f6641a = configManagerState;
        this.b = configManagerDI;
    }

    public final Config a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String a2 = U4.a(clazz);
        Config config = (Config) this.f6641a.b.get(a2);
        if (config == null) {
            String str = a2 + " config is null";
            String[] strArr = S4.f6841a;
            for (int i = 0; i < 5; i++) {
                String str2 = strArr[i];
                if (this.f6641a.b.get(str2) == null) {
                    this.f6641a.b.put(str2, N5.a(str2));
                }
            }
            config = (Config) this.f6641a.b.get(a2);
            BuildersKt__Builders_commonKt.launch$default(this.b.f6663a, null, null, new G4(this, null), 3, null);
        }
        Intrinsics.checkNotNull(config, "null cannot be cast to non-null type T of com.inmobi.media.core.config.manager.ConfigManager.getConfig");
        return config;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        H4 h4;
        int i;
        int i2;
        if (continuationImpl instanceof H4) {
            h4 = (H4) continuationImpl;
            int i3 = h4.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h4.c = i3 - Integer.MIN_VALUE;
                Object obj = h4.f6595a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h4.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f6641a.f6687a.getAndSet(true)) {
                        return Unit.INSTANCE;
                    }
                    h4.c = 1;
                    if (a(h4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String[] strArr = S4.f6841a;
                for (i2 = 0; i2 < 5; i2++) {
                    String str = strArr[i2];
                    if (this.f6641a.b.get(str) == null) {
                        this.f6641a.b.put(str, N5.a(str));
                    }
                }
                BuildersKt__Builders_commonKt.launch$default(this.b.f6663a, null, null, new I4(this, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        h4 = new H4(this, continuationImpl);
        Object obj2 = h4.f6595a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h4.c;
        if (i != 0) {
        }
        String[] strArr2 = S4.f6841a;
        while (i2 < 5) {
        }
        BuildersKt__Builders_commonKt.launch$default(this.b.f6663a, null, null, new I4(this, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[LOOP:0: B:11:0x004d->B:13:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        E4 e4;
        int i;
        if (continuationImpl instanceof E4) {
            e4 = (E4) continuationImpl;
            int i2 = e4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e4.c = i2 - Integer.MIN_VALUE;
                Object obj = e4.f6527a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = e4.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    B4 b4 = (B4) this.b.b.getValue();
                    e4.c = 1;
                    obj = b4.a(e4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                for (Config config : (Iterable) obj) {
                    String str = "Fetched config from DB: " + config.getType();
                    this.f6641a.b.put(config.getType(), config);
                }
                return Unit.INSTANCE;
            }
        }
        e4 = new E4(this, continuationImpl);
        Object obj2 = e4.f6527a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = e4.c;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
