package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4219xi {
    public static final void a(final AbstractC4192wi abstractC4192wi) {
        Intrinsics.checkNotNullParameter(abstractC4192wi, "<this>");
        String str = abstractC4192wi instanceof C4053ri ? "BillingClientNotAvailable" : abstractC4192wi instanceof C4165vi ? "BillingClientNotCompatible" : null;
        if (str != null) {
            Eg.a(str, new Function0() { // from class: com.inmobi.media.xi$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC4219xi.b(AbstractC4192wi.this);
                }
            });
        } else {
            c(abstractC4192wi);
        }
    }

    public static final Unit b(AbstractC4192wi abstractC4192wi) {
        c(abstractC4192wi);
        return Unit.INSTANCE;
    }

    public static final void c(AbstractC4192wi abstractC4192wi) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (abstractC4192wi instanceof C4081si) {
            linkedHashMap.put("trigger", ((C4081si) abstractC4192wi).f7377a);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("BillingClientConnectionError", linkedHashMap, EnumC3944nm.f7271a);
            return;
        }
        if (abstractC4192wi instanceof C4109ti) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((C4109ti) abstractC4192wi).f7397a));
            C3829jm c3829jm2 = C3829jm.f7187a;
            C3829jm.b("IAPFetchFailed", linkedHashMap, EnumC3944nm.f7271a);
            return;
        }
        if (abstractC4192wi instanceof C4165vi) {
            String str = ((C4165vi) abstractC4192wi).f7440a;
            if (str != null) {
                linkedHashMap.put("trigger", str);
            }
            C3829jm c3829jm3 = C3829jm.f7187a;
            C3829jm.b("BillingClientNotCompatible", linkedHashMap, EnumC3944nm.f7271a);
            return;
        }
        if (abstractC4192wi instanceof C4053ri) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2230);
            C3829jm c3829jm4 = C3829jm.f7187a;
            C3829jm.b("BillingClientNotAvailable", linkedHashMap, EnumC3944nm.f7271a);
        } else {
            if (!(abstractC4192wi instanceof C4138ui)) {
                throw new NoWhenBranchMatchedException();
            }
            C3829jm c3829jm5 = C3829jm.f7187a;
            C3829jm.b("IAPFetchSuccess", linkedHashMap, EnumC3944nm.f7271a);
        }
    }
}
