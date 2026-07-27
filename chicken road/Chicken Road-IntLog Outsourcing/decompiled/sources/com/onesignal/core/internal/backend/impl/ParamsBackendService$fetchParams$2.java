package com.onesignal.core.internal.backend.impl;

import com.onesignal.core.internal.backend.InfluenceParamsObject;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ParamsBackendService$fetchParams$2 extends j implements InterfaceC1441l {
    final /* synthetic */ s $influenceParams;
    final /* synthetic */ ParamsBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParamsBackendService$fetchParams$2(s sVar, ParamsBackendService paramsBackendService) {
        super(1);
        this.$influenceParams = sVar;
        this.this$0 = paramsBackendService;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return v.f5689a;
    }

    public final void invoke(JSONObject it) {
        InfluenceParamsObject processOutcomeJson;
        i.e(it, "it");
        s sVar = this.$influenceParams;
        processOutcomeJson = this.this$0.processOutcomeJson(it);
        sVar.f10741a = processOutcomeJson;
    }
}
