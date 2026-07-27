package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class J1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P1 f6638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(P1 p1, Continuation continuation) {
        super(2, continuation);
        this.f6638a = p1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new J1(this.f6638a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new J1(this.f6638a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        P1 p1 = this.f6638a;
        if (p1.b.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Set entrySet = p1.b.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : entrySet) {
            if (((Number) ((Map.Entry) obj2).getValue()).intValue() > 0) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = ((C1) ((Map.Entry) next).getKey()).f6485a;
            Object obj3 = linkedHashMap.get(str);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(str, obj3);
            }
            ((List) obj3).add(next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List<Map.Entry> list = (List) entry.getValue();
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry entry2 : list) {
                Intrinsics.checkNotNull(entry2);
                Object key = entry2.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                Object value = entry2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
                jSONArray2.put(new JSONObject().put("format", ((C1) key).b).put("count", ((Integer) value).intValue()));
            }
            if (jSONArray2.length() > 0) {
                jSONArray.put(new JSONObject().put("nn", str2).put("formats", jSONArray2));
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }
}
