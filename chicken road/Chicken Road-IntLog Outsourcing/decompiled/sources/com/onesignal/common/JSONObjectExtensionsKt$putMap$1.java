package com.onesignal.common;

import f4.v;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class JSONObjectExtensionsKt$putMap$1 extends j implements InterfaceC1441l {
    final /* synthetic */ Map<String, Object> $map;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONObjectExtensionsKt$putMap$1(Map<String, ? extends Object> map) {
        super(1);
        this.$map = map;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return v.f5689a;
    }

    public final void invoke(JSONObject it) {
        i.e(it, "it");
        JSONObjectExtensionsKt.putMap(it, this.$map);
    }
}
