package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Un {

    /* renamed from: a, reason: collision with root package name */
    public static final Un f6899a = new Un();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, C4227y c4227y, ArrayList arrayList, ContinuationImpl continuationImpl) {
        Tn tn;
        int i;
        C4279zn c4279zn;
        Fn e;
        C4279zn c4279zn2;
        if (continuationImpl instanceof Tn) {
            tn = (Tn) continuationImpl;
            int i2 = tn.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tn.d = i2 - Integer.MIN_VALUE;
                Object obj = tn.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tn.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    H h = c4227y.b;
                    c4279zn = new C4279zn(h);
                    Rn rn = new Rn(c4227y.b.f6590a.b.getVastVideo(), c4279zn, c4227y.f7489a.c);
                    try {
                        Map a2 = AbstractC4169vm.a(h);
                        C3829jm c3829jm = C3829jm.f7187a;
                        C3829jm.b("VastParseStart", a2, EnumC3944nm.f7271a);
                        tn.f6877a = c4279zn;
                    } catch (Fn e2) {
                        e = e2;
                    }
                    try {
                        tn.d = 1;
                        Object a3 = rn.a(str, arrayList, tn);
                        if (a3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = a3;
                        c4279zn2 = c4279zn;
                    } catch (Fn e3) {
                        e = e3;
                        short s = e.f6565a;
                        Map a4 = AbstractC4169vm.a(c4279zn.f7529a);
                        a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
                        C3829jm c3829jm2 = C3829jm.f7187a;
                        C3829jm.b("VastParseFailure", a4, EnumC3944nm.f7271a);
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4279zn2 = tn.f6877a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Fn e4) {
                        e = e4;
                        c4279zn = c4279zn2;
                        short s2 = e.f6565a;
                        Map a42 = AbstractC4169vm.a(c4279zn.f7529a);
                        a42.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s2));
                        C3829jm c3829jm22 = C3829jm.f7187a;
                        C3829jm.b("VastParseFailure", a42, EnumC3944nm.f7271a);
                        throw e;
                    }
                }
                Map a5 = AbstractC4169vm.a(c4279zn2.f7529a);
                C3829jm c3829jm3 = C3829jm.f7187a;
                C3829jm.b("VastParseSuccess", a5, EnumC3944nm.f7271a);
                return obj;
            }
        }
        tn = new Tn(this, continuationImpl);
        Object obj2 = tn.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tn.d;
        if (i != 0) {
        }
        Map a52 = AbstractC4169vm.a(c4279zn2.f7529a);
        C3829jm c3829jm32 = C3829jm.f7187a;
        C3829jm.b("VastParseSuccess", a52, EnumC3944nm.f7271a);
        return obj2;
    }
}
