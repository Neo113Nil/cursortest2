package com.ironsource;

/* renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3123k1 implements com.ironsource.InterfaceC3266s1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3177n1 f6333a;
    private final com.ironsource.B7 b;
    private final com.ironsource.Ib<java.lang.Integer, java.lang.Integer> c;
    private final com.ironsource.InterfaceC3216p4 d;
    private java.util.List<com.ironsource.InterfaceC3213p1> e;

    public C3123k1(com.ironsource.InterfaceC3177n1 eventBaseData, com.ironsource.B7 eventsManager, com.ironsource.Ib<java.lang.Integer, java.lang.Integer> eventsMapper, com.ironsource.InterfaceC3216p4 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f6333a = eventBaseData;
        this.b = eventsManager;
        this.c = eventsMapper;
        this.d = currentTimeProvider;
        this.e = new java.util.ArrayList();
    }

    public final void a(java.util.List<com.ironsource.InterfaceC3213p1> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.e = list;
    }

    public final java.util.List<com.ironsource.InterfaceC3213p1> b() {
        return this.e;
    }

    private final org.json.JSONObject b(java.util.List<? extends com.ironsource.InterfaceC3213p1> list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<? extends com.ironsource.InterfaceC3213p1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new org.json.JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC3266s1
    public void a(int i, java.util.List<com.ironsource.InterfaceC3213p1> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            java.util.Iterator<T> it = this.f6333a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((com.ironsource.InterfaceC3213p1) it.next());
            }
            java.util.Iterator<com.ironsource.InterfaceC3213p1> it2 = this.e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.b.a(new com.ironsource.C3360x5(this.c.a(java.lang.Integer.valueOf(i)).intValue(), this.d.a(), b(arrayList)));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            java.lang.System.out.println((java.lang.Object) ("LogRemote | Exception: " + e.getMessage()));
        }
    }

    public /* synthetic */ C3123k1(com.ironsource.InterfaceC3177n1 interfaceC3177n1, com.ironsource.B7 b7, com.ironsource.Ib ib, com.ironsource.InterfaceC3216p4 interfaceC3216p4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3177n1, b7, ib, (i & 8) != 0 ? new com.ironsource.InterfaceC3216p4.a() : interfaceC3216p4);
    }

    @Override // com.ironsource.InterfaceC3266s1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC3266s1
    public void a(com.ironsource.InterfaceC3213p1... analyticsEventEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (com.ironsource.InterfaceC3213p1 interfaceC3213p1 : analyticsEventEntity) {
            this.e.add(interfaceC3213p1);
        }
    }
}
