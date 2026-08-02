package com.plaid.internal;

/* renamed from: com.plaid.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0647t3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0647t3.a f6575a;
    public final kotlinx.serialization.json.Json b;
    public java.lang.String c;

    /* renamed from: com.plaid.internal.t3$a */
    public interface a {
        void a(com.plaid.internal.C0447a1 c0447a1);

        void a(com.plaid.link.event.LinkEvent linkEvent, com.plaid.internal.I2 i2);

        void a(com.plaid.link.result.LinkExit linkExit);

        void a(com.plaid.link.result.LinkSuccess linkSuccess);

        void a(java.lang.String str, com.plaid.link.event.LinkEventMetadata linkEventMetadata);

        void a(java.util.LinkedHashMap linkedHashMap);

        void b(java.lang.String str);

        void c(java.lang.String str);
    }

    /* renamed from: com.plaid.internal.t3$b */
    public final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6576a;

        static {
            int[] iArr = new int[com.plaid.internal.EnumC0668v6.values().length];
            try {
                iArr[com.plaid.internal.EnumC0668v6.ENQUEUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.EnumC0668v6.ENQUEUE_AND_FLUSH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.EnumC0668v6.NO_ENQUEUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.plaid.internal.EnumC0668v6.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f6576a = iArr;
        }
    }

    public C0647t3(com.plaid.internal.C0647t3.a aVar, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.f6575a = aVar;
        this.b = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187 A[EDGE_INSN: B:85:0x0187->B:63:0x0187 BREAK  A[LOOP:1: B:57:0x0175->B:60:0x0183], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.String str) {
        int parseInt;
        int length;
        int i;
        com.plaid.internal.I2 i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i3 = 0;
        com.plaid.internal.EnumC0668v6 enumC0668v6 = null;
        if (!kotlin.text.StringsKt.startsWith$default(str, "plaidlink://", false, 2, (java.lang.Object) null)) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.C0452a6.a.a("external link: ".concat(java.lang.String.valueOf(str)), true);
            this.f6575a.c(str);
            return;
        }
        okhttp3.HttpUrl httpUrl = okhttp3.HttpUrl.INSTANCE.get(kotlin.text.StringsKt.replace$default(str, "plaidlink://", "https://", false, 4, (java.lang.Object) null));
        com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("plaidcallback ".concat(java.lang.String.valueOf(str)), true);
        java.lang.String host = httpUrl.host();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(host, "event")) {
            com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "Webview url intercepted: ".concat(java.lang.String.valueOf(host)));
        }
        java.util.Set<java.lang.String> queryParameterNames = httpUrl.queryParameterNames();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(queryParameterNames, 10)), 16));
        for (java.lang.Object obj : queryParameterNames) {
            java.lang.String queryParameter = httpUrl.queryParameter((java.lang.String) obj);
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap.put(obj, queryParameter);
        }
        java.lang.String str2 = (java.lang.String) linkedHashMap.get("link_session_id");
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(str2, this.c)) {
                this.f6575a.b(str2);
                this.c = str2;
            }
        }
        int hashCode = host.hashCode();
        if (hashCode != -579210487) {
            if (hashCode != 3127582) {
                if (hashCode != 96891546) {
                    if (hashCode == 2091030007 && host.equals("session_handoff")) {
                        com.plaid.internal.C0452a6.a aVar3 = com.plaid.internal.C0452a6.f5996a;
                        com.plaid.internal.C0452a6.a.a("Handoff to out of process", true);
                        this.f6575a.a(linkedHashMap);
                        return;
                    }
                } else if (host.equals("event")) {
                    java.lang.String str3 = (java.lang.String) linkedHashMap.get(com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_EVENT_NAME);
                    if (str3 == null) {
                        str3 = "null";
                    }
                    java.lang.String str4 = (java.lang.String) linkedHashMap.get("queue_behavior");
                    if (str4 == null) {
                        str4 = "null";
                    }
                    java.lang.String str5 = (java.lang.String) linkedHashMap.get("delay_ms");
                    java.lang.String str6 = str5 != null ? str5 : "null";
                    com.plaid.internal.C0452a6.a aVar4 = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Event name: ".concat(java.lang.String.valueOf(str3)), false);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("queue_behavior: ");
                    sb.append(str4);
                    sb.append(", delay_ms: ");
                    sb.append(str6);
                    com.plaid.internal.C0452a6.a.a(sb.toString(), true);
                    com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_EVENT_NAME, str3), kotlin.TuplesKt.to("queue_behavior", str4), kotlin.TuplesKt.to("delay_ms", str6)), "Received event: ".concat(java.lang.String.valueOf(str3)));
                    com.plaid.internal.C0452a6.a.a(httpUrl.toString(), true);
                    java.lang.String str7 = (java.lang.String) linkedHashMap.get("delay_ms");
                    try {
                        if (str7 != null) {
                            try {
                                parseInt = java.lang.Integer.parseInt(str7);
                            } catch (java.lang.NumberFormatException unused) {
                            }
                            com.plaid.internal.EnumC0668v6[] values = com.plaid.internal.EnumC0668v6.values();
                            length = values.length;
                            while (true) {
                                if (i3 < length) {
                                    break;
                                }
                                com.plaid.internal.EnumC0668v6 enumC0668v62 = values[i3];
                                if (kotlin.jvm.internal.Intrinsics.areEqual(enumC0668v62.getProtoString(), str4)) {
                                    enumC0668v6 = enumC0668v62;
                                    break;
                                }
                                i3++;
                            }
                            if (enumC0668v6 == null) {
                                enumC0668v6 = com.plaid.internal.EnumC0668v6.UNKNOWN;
                            }
                            i = com.plaid.internal.C0647t3.b.f6576a[enumC0668v6.ordinal()];
                            if (i != 1) {
                                i2 = com.plaid.internal.I2.b.f5808a;
                            } else if (i == 2) {
                                i2 = com.plaid.internal.I2.c.f5809a;
                            } else if (i == 3) {
                                i2 = com.plaid.internal.I2.d.f5810a;
                            } else {
                                if (i != 4) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                i2 = parseInt > 0 ? new com.plaid.internal.I2.a(parseInt) : com.plaid.internal.I2.d.f5810a;
                            }
                            com.plaid.internal.C0647t3.a aVar5 = this.f6575a;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "");
                            aVar5.a(com.plaid.link.event.LinkEvent.INSTANCE.fromMap$link_sdk_release(linkedHashMap), i2);
                            return;
                        }
                        com.plaid.internal.C0647t3.a aVar52 = this.f6575a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "");
                        aVar52.a(com.plaid.link.event.LinkEvent.INSTANCE.fromMap$link_sdk_release(linkedHashMap), i2);
                        return;
                    } catch (java.util.NoSuchElementException unused2) {
                        this.f6575a.a(new com.plaid.internal.C0447a1("Failed to parse event"));
                        return;
                    }
                    parseInt = 0;
                    com.plaid.internal.EnumC0668v6[] values2 = com.plaid.internal.EnumC0668v6.values();
                    length = values2.length;
                    while (true) {
                        if (i3 < length) {
                        }
                        i3++;
                    }
                    if (enumC0668v6 == null) {
                    }
                    i = com.plaid.internal.C0647t3.b.f6576a[enumC0668v6.ordinal()];
                    if (i != 1) {
                    }
                }
            } else if (host.equals(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT)) {
                com.plaid.internal.C0452a6.a aVar6 = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a(aVar6, "User status in flow: ", new java.lang.Object[]{com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.PREFIX_DATA.concat(java.lang.String.valueOf(linkedHashMap.get("status")))});
                com.plaid.internal.C0452a6.a.a(aVar6, "Link request ID: ", new java.lang.Object[]{com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.PREFIX_DATA.concat(java.lang.String.valueOf(linkedHashMap.get("request_id")))});
                try {
                    com.plaid.internal.C0647t3.a aVar7 = this.f6575a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "");
                    aVar7.a(com.plaid.link.result.LinkExit.INSTANCE.fromMap$link_sdk_release(linkedHashMap));
                    return;
                } catch (java.util.NoSuchElementException unused3) {
                    this.f6575a.a(new com.plaid.internal.C0447a1("Failed to parse exit"));
                    return;
                }
            }
        } else if (host.equals("connected")) {
            com.plaid.internal.C0452a6.a aVar8 = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.C0452a6.a.a("Institution id: ".concat(java.lang.String.valueOf(linkedHashMap.get("institution_id"))), true);
            com.plaid.internal.C0452a6.a.a("Institution name:  ".concat(java.lang.String.valueOf(linkedHashMap.get("institution_name"))), true);
            a(linkedHashMap);
            return;
        }
        com.plaid.internal.C0452a6.a aVar9 = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Link action detected: ".concat(java.lang.String.valueOf(host)), true);
        this.f6575a.a(host, com.plaid.link.event.LinkEventMetadata.INSTANCE.fromMap(linkedHashMap, this.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void a(java.util.LinkedHashMap linkedHashMap) {
        java.util.List list;
        ?? emptyList;
        java.lang.String str = (java.lang.String) linkedHashMap.get("accounts");
        if (str == null) {
            str = "";
        }
        try {
            try {
                kotlinx.serialization.json.Json json = this.b;
                com.plaid.internal.D1.b bVar = com.plaid.internal.D1.g;
                com.plaid.internal.D1.b.a();
                list = (java.util.List) json.decodeFromString(kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(com.plaid.internal.D1.a.f5767a), str);
            } catch (kotlinx.serialization.SerializationException unused) {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                java.lang.String a2 = com.plaid.internal.P4.a(str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse accounts data: ");
                sb.append(a2);
                com.plaid.internal.C0452a6.a.b(aVar, sb.toString());
                list = null;
            }
            if (list != null) {
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    emptyList.add(com.plaid.internal.L2.a((com.plaid.internal.D1) it.next()));
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            this.f6575a.a(com.plaid.internal.L2.a(linkedHashMap, (java.util.List) emptyList));
        } catch (java.util.NoSuchElementException unused2) {
            this.f6575a.a(new com.plaid.internal.C0447a1("Failed to parse success"));
        }
    }
}
