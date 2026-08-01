package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.RootConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class Ri implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ti f6830a;
    public final /* synthetic */ FlowCollector b;
    public final /* synthetic */ Ref.ObjectRef c;

    public Ri(Ti ti, FlowCollector flowCollector, Ref.ObjectRef objectRef) {
        this.f6830a = ti;
        this.b = flowCollector;
        this.c = objectRef;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011f, code lost:
    
        if (r1.emit(r12, r0) != r8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        if (r12 == r8) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v24, types: [T, java.util.ArrayList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Q4 q4, Continuation continuation) {
        Qi qi;
        int i;
        Object obj;
        Config config;
        Context context;
        if (continuation instanceof Qi) {
            qi = (Qi) continuation;
            int i2 = qi.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qi.d = i2 - Integer.MIN_VALUE;
                Object obj2 = qi.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qi.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!(q4 instanceof R4)) {
                        if (!(q4 instanceof C4)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                    Ti ti = this.f6830a;
                    R4 r4 = (R4) q4;
                    qi.f6806a = q4;
                    qi.d = 1;
                    int i3 = r4.f6818a;
                    if (i3 == 200) {
                        B4 b4 = ti.f6874a;
                        Config config2 = r4.b;
                        S9 s9 = b4.f6468a;
                        Intrinsics.checkNotNullParameter(config2, "<this>");
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("config_value", config2.toJson().toString());
                        contentValues.put("config_type", config2.getType());
                        contentValues.put("update_ts", Long.valueOf(config2.getLastUpdateTimeStamp()));
                        obj = s9.a("config_db", contentValues, 5, qi);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else if (i3 == 304) {
                        B4 b42 = ti.f6874a;
                        String type = r4.b.getType();
                        long lastUpdateTimeStamp = r4.b.getLastUpdateTimeStamp();
                        b42.getClass();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("update_ts", Boxing.boxLong(lastUpdateTimeStamp));
                        obj = S9.a(b42.f6468a, "config_db", contentValues2, "config_type=?", new String[]{type}, qi, 16);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        obj = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q4 = qi.f6806a;
                        ResultKt.throwOnFailure(obj2);
                        if (((R4) q4).b instanceof RootConfig) {
                            this.c.element = Ti.a(this.f6830a);
                        }
                        return Unit.INSTANCE;
                    }
                    q4 = qi.f6806a;
                    ResultKt.throwOnFailure(obj2);
                }
                R4 r42 = (R4) q4;
                config = r42.b;
                context = AbstractC3914mk.f7252a;
                if (context != null && (config instanceof RootConfig)) {
                    RootConfig rootConfig = (RootConfig) config;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(rootConfig, "rootConfig");
                    AbstractC4140uk.a(context, rootConfig.getPreInit(), rootConfig.getAccountIdResetEnabled());
                }
                FlowCollector flowCollector = this.b;
                Config config3 = r42.b;
                qi.f6806a = q4;
                qi.d = 2;
            }
        }
        qi = new Qi(this, continuation);
        Object obj22 = qi.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qi.d;
        if (i != 0) {
        }
        R4 r422 = (R4) q4;
        config = r422.b;
        context = AbstractC3914mk.f7252a;
        if (context != null) {
            RootConfig rootConfig2 = (RootConfig) config;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rootConfig2, "rootConfig");
            AbstractC4140uk.a(context, rootConfig2.getPreInit(), rootConfig2.getAccountIdResetEnabled());
        }
        FlowCollector flowCollector2 = this.b;
        Config config32 = r422.b;
        qi.f6806a = q4;
        qi.d = 2;
    }
}
