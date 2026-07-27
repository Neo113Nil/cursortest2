package com.onesignal.core.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ParamsBackendService$processOutcomeJson$3 extends j implements InterfaceC1441l {
    final /* synthetic */ s $isUnattributedEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParamsBackendService$processOutcomeJson$3(s sVar) {
        super(1);
        this.$isUnattributedEnabled = sVar;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return v.f5689a;
    }

    public final void invoke(JSONObject it) {
        i.e(it, "it");
        this.$isUnattributedEnabled.f10741a = JSONObjectExtensionsKt.safeBool(it, "enabled");
    }
}
