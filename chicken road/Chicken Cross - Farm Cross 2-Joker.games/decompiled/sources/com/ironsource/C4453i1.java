package com.ironsource;

import com.ironsource.InterfaceC4527m4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4453i1 implements InterfaceC4596q1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4506l1 f8234a;
    private final InterfaceC4745y7 b;
    private final Hb<Integer, Integer> c;
    private final InterfaceC4527m4 d;
    private List<InterfaceC4542n1> e;

    public C4453i1(InterfaceC4506l1 eventBaseData, InterfaceC4745y7 eventsManager, Hb<Integer, Integer> eventsMapper, InterfaceC4527m4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f8234a = eventBaseData;
        this.b = eventsManager;
        this.c = eventsMapper;
        this.d = currentTimeProvider;
        this.e = new ArrayList();
    }

    public final void a(List<InterfaceC4542n1> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.e = list;
    }

    public final List<InterfaceC4542n1> b() {
        return this.e;
    }

    private final JSONObject b(List<? extends InterfaceC4542n1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC4542n1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC4596q1
    public void a(int i, List<InterfaceC4542n1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            Iterator<T> it = this.f8234a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC4542n1) it.next());
            }
            Iterator<InterfaceC4542n1> it2 = this.e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.b.a(new C4689v5(this.c.a(Integer.valueOf(i)).intValue(), this.d.a(), b(arrayList)));
        } catch (Exception e) {
            C4491k4.d().a(e);
            System.out.println((Object) ("LogRemote | Exception: " + e.getMessage()));
        }
    }

    public /* synthetic */ C4453i1(InterfaceC4506l1 interfaceC4506l1, InterfaceC4745y7 interfaceC4745y7, Hb hb, InterfaceC4527m4 interfaceC4527m4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4506l1, interfaceC4745y7, hb, (i & 8) != 0 ? new InterfaceC4527m4.a() : interfaceC4527m4);
    }

    @Override // com.ironsource.InterfaceC4596q1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC4596q1
    public void a(InterfaceC4542n1... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC4542n1 interfaceC4542n1 : analyticsEventEntity) {
            this.e.add(interfaceC4542n1);
        }
    }
}
