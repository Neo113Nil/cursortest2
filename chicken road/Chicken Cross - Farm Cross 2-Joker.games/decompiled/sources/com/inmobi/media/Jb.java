package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Jb extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6648a;
    public final /* synthetic */ Kb b;
    public final /* synthetic */ Ca c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jb(Kb kb, Ca ca, Continuation continuation) {
        super(1, continuation);
        this.b = kb;
        this.c = ca;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Jb(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Jb(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (com.inmobi.media.Kb.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (com.inmobi.media.Kb.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (com.inmobi.media.Kb.a(r6, r1, r5) == r0) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6648a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CrashConfig.ANRConfig anr = this.b.f6669a.getAnr();
            if (!AbstractC4143un.a(this.c)) {
                return Unit.INSTANCE;
            }
            if (this.c instanceof T1) {
                Y5.f6965a.getClass();
                if (Y5.t() && anr.getAppExitReason().getUseForReporting() && this.b.c.d.a()) {
                    Ca ca = this.c;
                    ca.getClass();
                    Intrinsics.checkNotNullParameter("ANREvent", "<set-?>");
                    ca.f6546a = "ANREvent";
                    Kb kb = this.b;
                    Ca ca2 = this.c;
                    this.f6648a = 1;
                }
            }
            if ((this.c instanceof C3892lq) && anr.getWatchdog().getUseForReporting() && this.b.c.c.a()) {
                Kb kb2 = this.b;
                Ca ca3 = this.c;
                this.f6648a = 2;
            } else {
                if (!(this.c instanceof C4124u5)) {
                    return Unit.INSTANCE;
                }
                if (this.b.f6669a.getCrashConfig().getEnabled() && this.b.c.f6509a.a()) {
                    Kb kb3 = this.b;
                    Ca ca4 = this.c;
                    this.f6648a = 3;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.a();
        return Unit.INSTANCE;
    }
}
