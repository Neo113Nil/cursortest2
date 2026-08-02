package Db0;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.common.ActivityLifecycleCallback$waitFirstStartedActivity$2", f = "ActivityLifecycleCallback.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Activity>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Activity f6302d;

    /* renamed from: e, reason: collision with root package name */
    int f6303e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f6304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f6304f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f6304f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Activity> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0028 -> B:5:0x002b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
            int r1 = r3.f6303e
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            android.app.Activity r1 = r3.f6302d
            Sc.s.b(r4)
            goto L2b
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            Sc.s.b(r4)
        L1a:
            Db0.f r4 = r3.f6304f
            android.app.Activity r1 = r4.d()
            r3.f6302d = r1
            r3.f6303e = r2
            java.lang.Object r4 = xe.l1.a(r3)
            if (r4 != r0) goto L2b
            return r0
        L2b:
            if (r1 == 0) goto L1a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Db0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
