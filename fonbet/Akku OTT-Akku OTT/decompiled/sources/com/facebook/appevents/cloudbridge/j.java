package com.facebook.appevents.cloudbridge;

import com.facebook.internal.E;
import com.facebook.w;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class j extends Lambda implements Function2<String, Integer, Unit> {
    public final /* synthetic */ List<Map<String, Object>> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.a = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        i iVar = new i(0, num, this.a);
        E e = E.a;
        try {
            w.c().execute(iVar);
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
