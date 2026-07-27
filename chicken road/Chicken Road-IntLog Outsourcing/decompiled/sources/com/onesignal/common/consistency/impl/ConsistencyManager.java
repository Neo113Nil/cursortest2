package com.onesignal.common.consistency.impl;

import D4.AbstractC0024y;
import D4.C0013m;
import D4.InterfaceC0012l;
import D4.g0;
import L4.a;
import L4.d;
import L4.e;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.models.ICondition;
import com.onesignal.common.consistency.models.IConsistencyKeyEnum;
import com.onesignal.common.consistency.models.IConsistencyManager;
import e5.g;
import f4.C0430g;
import f4.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.InterfaceC1218d;
import k4.InterfaceC1221g;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class ConsistencyManager implements IConsistencyManager {
    private final a mutex = e.a();
    private final Map<String, Map<IConsistencyKeyEnum, RywData>> indexedTokens = new LinkedHashMap();
    private final List<C0430g> conditions = new ArrayList();

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (C0430g c0430g : this.conditions) {
            ICondition iCondition = (ICondition) c0430g.f5668a;
            InterfaceC1221g interfaceC1221g = (InterfaceC0012l) c0430g.f5669b;
            if (iCondition.isMet(this.indexedTokens)) {
                RywData rywData = iCondition.getRywData(this.indexedTokens);
                if (!((g0) interfaceC1221g).I()) {
                    ((C0013m) interfaceC1221g).L(rywData);
                }
                arrayList.add(new C0430g(iCondition, interfaceC1221g));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [L4.a] */
    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(ICondition iCondition, InterfaceC1218d interfaceC1218d) {
        ConsistencyManager$getRywDataFromAwaitableCondition$1 consistencyManager$getRywDataFromAwaitableCondition$1;
        int i2;
        d dVar;
        ConsistencyManager consistencyManager;
        try {
            if (interfaceC1218d instanceof ConsistencyManager$getRywDataFromAwaitableCondition$1) {
                consistencyManager$getRywDataFromAwaitableCondition$1 = (ConsistencyManager$getRywDataFromAwaitableCondition$1) interfaceC1218d;
                int i3 = consistencyManager$getRywDataFromAwaitableCondition$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    consistencyManager$getRywDataFromAwaitableCondition$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = consistencyManager$getRywDataFromAwaitableCondition$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = consistencyManager$getRywDataFromAwaitableCondition$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        a aVar = this.mutex;
                        consistencyManager$getRywDataFromAwaitableCondition$1.L$0 = this;
                        consistencyManager$getRywDataFromAwaitableCondition$1.L$1 = iCondition;
                        consistencyManager$getRywDataFromAwaitableCondition$1.L$2 = aVar;
                        consistencyManager$getRywDataFromAwaitableCondition$1.label = 1;
                        dVar = (d) aVar;
                        if (dVar.c(consistencyManager$getRywDataFromAwaitableCondition$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        consistencyManager = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = (a) consistencyManager$getRywDataFromAwaitableCondition$1.L$2;
                        ICondition iCondition2 = (ICondition) consistencyManager$getRywDataFromAwaitableCondition$1.L$1;
                        consistencyManager = (ConsistencyManager) consistencyManager$getRywDataFromAwaitableCondition$1.L$0;
                        g.y(obj);
                        dVar = r5;
                        iCondition = iCondition2;
                    }
                    C0013m a6 = AbstractC0024y.a();
                    consistencyManager.conditions.add(new C0430g(iCondition, a6));
                    consistencyManager.checkConditionsAndComplete();
                    return a6;
                }
            }
            C0013m a62 = AbstractC0024y.a();
            consistencyManager.conditions.add(new C0430g(iCondition, a62));
            consistencyManager.checkConditionsAndComplete();
            return a62;
        } finally {
            dVar.e(null);
        }
        consistencyManager$getRywDataFromAwaitableCondition$1 = new ConsistencyManager$getRywDataFromAwaitableCondition$1(this, interfaceC1218d);
        Object obj2 = consistencyManager$getRywDataFromAwaitableCondition$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = consistencyManager$getRywDataFromAwaitableCondition$1.label;
        if (i2 != 0) {
        }
    }

    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    public Object resolveConditionsWithID(String str, InterfaceC1218d interfaceC1218d) {
        ArrayList arrayList = new ArrayList();
        for (C0430g c0430g : this.conditions) {
            ICondition iCondition = (ICondition) c0430g.f5668a;
            InterfaceC1221g interfaceC1221g = (InterfaceC0012l) c0430g.f5669b;
            if (i.a(iCondition.getId(), str) && !((g0) interfaceC1221g).I()) {
                ((C0013m) interfaceC1221g).L(null);
            }
            arrayList.add(new C0430g(iCondition, interfaceC1221g));
        }
        this.conditions.removeAll(arrayList);
        return v.f5689a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:12:0x0062, B:14:0x006a, B:15:0x0075), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [L4.a] */
    @Override // com.onesignal.common.consistency.models.IConsistencyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, IConsistencyKeyEnum iConsistencyKeyEnum, RywData rywData, InterfaceC1218d interfaceC1218d) {
        ConsistencyManager$setRywData$1 consistencyManager$setRywData$1;
        int i2;
        d dVar;
        ConsistencyManager consistencyManager;
        Map<IConsistencyKeyEnum, RywData> map;
        try {
            if (interfaceC1218d instanceof ConsistencyManager$setRywData$1) {
                consistencyManager$setRywData$1 = (ConsistencyManager$setRywData$1) interfaceC1218d;
                int i3 = consistencyManager$setRywData$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    consistencyManager$setRywData$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = consistencyManager$setRywData$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = consistencyManager$setRywData$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        a aVar = this.mutex;
                        consistencyManager$setRywData$1.L$0 = this;
                        consistencyManager$setRywData$1.L$1 = str;
                        consistencyManager$setRywData$1.L$2 = iConsistencyKeyEnum;
                        consistencyManager$setRywData$1.L$3 = rywData;
                        consistencyManager$setRywData$1.L$4 = aVar;
                        consistencyManager$setRywData$1.label = 1;
                        dVar = (d) aVar;
                        if (dVar.c(consistencyManager$setRywData$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        consistencyManager = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = (a) consistencyManager$setRywData$1.L$4;
                        rywData = (RywData) consistencyManager$setRywData$1.L$3;
                        iConsistencyKeyEnum = (IConsistencyKeyEnum) consistencyManager$setRywData$1.L$2;
                        String str2 = (String) consistencyManager$setRywData$1.L$1;
                        consistencyManager = (ConsistencyManager) consistencyManager$setRywData$1.L$0;
                        g.y(obj);
                        dVar = r5;
                        str = str2;
                    }
                    Map<String, Map<IConsistencyKeyEnum, RywData>> map2 = consistencyManager.indexedTokens;
                    map = map2.get(str);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                        map2.put(str, map);
                    }
                    map.put(iConsistencyKeyEnum, rywData);
                    consistencyManager.checkConditionsAndComplete();
                    dVar.e(null);
                    return v.f5689a;
                }
            }
            Map<String, Map<IConsistencyKeyEnum, RywData>> map22 = consistencyManager.indexedTokens;
            map = map22.get(str);
            if (map == null) {
            }
            map.put(iConsistencyKeyEnum, rywData);
            consistencyManager.checkConditionsAndComplete();
            dVar.e(null);
            return v.f5689a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        consistencyManager$setRywData$1 = new ConsistencyManager$setRywData$1(this, interfaceC1218d);
        Object obj2 = consistencyManager$setRywData$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = consistencyManager$setRywData$1.label;
        if (i2 != 0) {
        }
    }
}
