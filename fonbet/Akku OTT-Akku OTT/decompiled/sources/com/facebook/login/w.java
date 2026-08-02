package com.facebook.login;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.F;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class w extends Lambda implements Function1<ActivityResult, Unit> {
    public final /* synthetic */ v a;
    public final /* synthetic */ FragmentActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, FragmentActivity fragmentActivity) {
        super(1);
        this.a = vVar;
        this.b = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResult activityResult) {
        ActivityResult result = activityResult;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            u e = this.a.e();
            u.Companion.getClass();
            com.facebook.w wVar = com.facebook.w.a;
            F.f();
            e.s(com.facebook.w.k, result.getResultCode(), result.getData());
        } else {
            this.b.finish();
        }
        return Unit.INSTANCE;
    }
}
