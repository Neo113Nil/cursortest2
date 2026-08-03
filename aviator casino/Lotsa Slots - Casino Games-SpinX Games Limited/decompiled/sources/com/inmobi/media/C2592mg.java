package com.inmobi.media;

/* renamed from: com.inmobi.media.mg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2592mg implements com.inmobi.media.InterfaceC2620ng {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.InterfaceC2513jg f5337a;
    public final com.inmobi.media.C2936zi b;
    public final java.lang.String c;
    public final java.util.concurrent.atomic.AtomicBoolean d;

    public C2592mg(com.inmobi.media.InterfaceC2513jg interfaceC2513jg, com.inmobi.media.C2936zi c2936zi) {
        this.f5337a = interfaceC2513jg;
        this.b = c2936zi;
        java.lang.String id = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "toString(...)");
        this.c = id;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.inmobi.media.J8 j8 = com.inmobi.media.C2331cg.b;
        if (j8 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "listener");
            j8.b.put(id, new java.lang.ref.WeakReference(this));
            java.util.Iterator it = j8.b.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                if (((java.lang.ref.WeakReference) ((java.util.Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        com.inmobi.media.C2768t5 c2768t5 = com.inmobi.media.C2331cg.c;
        if (c2768t5 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "listener");
            c2768t5.b.put(id, new java.lang.ref.WeakReference(this));
            java.util.Iterator it2 = c2768t5.b.entrySet().iterator();
            while (it2.hasNext()) {
                java.lang.Object next2 = it2.next();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                if (((java.lang.ref.WeakReference) ((java.util.Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(2:27|28)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|38|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        a(r8, (short) 2243);
        r10 = r8.f5337a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r10 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        r0 = com.inmobi.media.EnumC2347d6.f5154a;
        ((com.inmobi.media.C2568li) r10).a("", androidx.media3.common.PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, "Ping JSON is invalid", java.lang.System.currentTimeMillis(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        r9.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        a(r8, (short) 2244);
        r9.getMessage();
        r10 = com.inmobi.media.W9.f5027a;
        com.inmobi.media.AbstractC2665p9.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        a(r8, (short) 2245);
        r9.getMessage();
        r10 = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: NoClassDefFoundError -> 0x005a, Exception -> 0x006e, JSONException -> 0x007d, TRY_LEAVE, TryCatch #2 {JSONException -> 0x007d, Exception -> 0x006e, NoClassDefFoundError -> 0x005a, blocks: (B:11:0x0027, B:13:0x003e, B:15:0x0044, B:28:0x0036), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2566lg c2566lg;
        int i;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.C2566lg) {
            c2566lg = (com.inmobi.media.C2566lg) continuationImpl;
            int i2 = c2566lg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2566lg.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2566lg.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2566lg.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    it = a(str).iterator();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c2566lg.f5317a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    com.inmobi.media.Zf zf = (com.inmobi.media.Zf) it.next();
                    b(zf.e);
                    c2566lg.f5317a = it;
                    c2566lg.d = 1;
                    if (a(zf, c2566lg) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2566lg = new com.inmobi.media.C2566lg(this, continuationImpl);
        java.lang.Object obj2 = c2566lg.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2566lg.d;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void b(java.lang.String priority) {
        com.inmobi.media.C2936zi c2936zi = this.b;
        if (c2936zi != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
            java.util.Map a2 = c2936zi.a();
            a2.put("trigger", priority);
            com.inmobi.media.AbstractC2724rg.a("PingStarted", a2);
        }
    }

    public static java.lang.Object a(com.inmobi.media.Zf zf, com.inmobi.media.C2566lg c2566lg) {
        java.util.Objects.toString(zf);
        if (kotlin.jvm.internal.Intrinsics.areEqual(zf.e, com.adjust.sdk.Constants.HIGH)) {
            com.inmobi.media.J8 j8 = com.inmobi.media.C2331cg.b;
            if (j8 != null) {
                java.lang.Object b = j8.b(zf, c2566lg);
                if (b != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    b = kotlin.Unit.INSTANCE;
                }
                return b == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : kotlin.Unit.INSTANCE;
            }
        } else {
            com.inmobi.media.C2768t5 c2768t5 = com.inmobi.media.C2331cg.c;
            if (c2768t5 != null) {
                java.lang.Object a2 = c2768t5.a(zf, c2566lg);
                if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = kotlin.Unit.INSTANCE;
                }
                return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.inmobi.media.Zf] */
    public final java.util.List a(java.lang.String str) {
        org.json.JSONArray jSONArray = new org.json.JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            com.inmobi.media.InterfaceC2513jg interfaceC2513jg = this.f5337a;
            if (interfaceC2513jg != null) {
                com.inmobi.media.EnumC2347d6[] enumC2347d6Arr = com.inmobi.media.EnumC2347d6.f5154a;
                ((com.inmobi.media.C2568li) interfaceC2513jg).a("", androidx.media3.common.PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "Ping array is empty", java.lang.System.currentTimeMillis(), 0);
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                a(this, (short) 2254);
            } else {
                java.lang.String optString = optJSONObject.optString("id");
                if (optString != null && !kotlin.text.StringsKt.isBlank(optString)) {
                    java.lang.String optString2 = optJSONObject.optString("url");
                    if (a(optString, optString2)) {
                        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("headers");
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (optJSONObject2 != null) {
                            java.util.Iterator<java.lang.String> keys = optJSONObject2.keys();
                            while (keys.hasNext()) {
                                java.lang.String next = keys.next();
                                linkedHashMap.put(next, optJSONObject2.optString(next, ""));
                            }
                        }
                        boolean optBoolean = optJSONObject.optBoolean("allowRedirects", true);
                        java.lang.String optString3 = optJSONObject.optString("priority", com.adjust.sdk.Constants.NORMAL);
                        boolean optBoolean2 = optJSONObject.optBoolean("ackRequired", false);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(optString2);
                        java.lang.String str2 = optString3 == null ? com.adjust.sdk.Constants.NORMAL : optString3;
                        java.lang.String str3 = this.c;
                        com.inmobi.media.C2936zi c2936zi = this.b;
                        r7 = new com.inmobi.media.Zf(optString2, optString, linkedHashMap, optBoolean, str2, optBoolean2, 0, str3, java.lang.System.currentTimeMillis(), null, c2936zi != null ? c2936zi.f5594a : null);
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                    a(this, (short) 2255);
                    com.inmobi.media.InterfaceC2513jg interfaceC2513jg2 = this.f5337a;
                    if (interfaceC2513jg2 != null) {
                        com.inmobi.media.EnumC2347d6[] enumC2347d6Arr2 = com.inmobi.media.EnumC2347d6.f5154a;
                        ((com.inmobi.media.C2568li) interfaceC2513jg2).a(optString, -101, "Ping ID is missing", java.lang.System.currentTimeMillis(), 0);
                    }
                }
            }
            if (r7 != null) {
                arrayList.add(r7);
            }
        }
        return arrayList;
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        java.lang.String host;
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
            try {
                java.net.URI uri = new java.net.URI(str2);
                if ((kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), androidx.webkit.ProxyConfig.MATCH_HTTP) || kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), "https")) && (host = uri.getHost()) != null) {
                    if (!kotlin.text.StringsKt.isBlank(host)) {
                        return true;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            a(this, (short) 2256);
            com.inmobi.media.InterfaceC2513jg interfaceC2513jg = this.f5337a;
            if (interfaceC2513jg != null) {
                com.inmobi.media.EnumC2347d6[] enumC2347d6Arr = com.inmobi.media.EnumC2347d6.f5154a;
                ((com.inmobi.media.C2568li) interfaceC2513jg).a(str, androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "Ping url is invalid", java.lang.System.currentTimeMillis(), 0);
            }
            return false;
        }
        a(this, (short) 2252);
        com.inmobi.media.InterfaceC2513jg interfaceC2513jg2 = this.f5337a;
        if (interfaceC2513jg2 != null) {
            com.inmobi.media.EnumC2347d6[] enumC2347d6Arr2 = com.inmobi.media.EnumC2347d6.f5154a;
            ((com.inmobi.media.C2568li) interfaceC2513jg2).a(str, androidx.media3.common.PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "Ping URL is missing", java.lang.System.currentTimeMillis(), 0);
        }
        return false;
    }

    public final void a(com.inmobi.media.Zf ping, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.d.get()) {
            return;
        }
        java.lang.String str = ping.f5085a;
        java.lang.String str2 = ping.e;
        int i2 = ping.g;
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.adjust.sdk.Constants.HIGH, ping.e) && ping.f) {
            java.lang.String str3 = ping.b;
            com.inmobi.media.InterfaceC2513jg interfaceC2513jg = this.f5337a;
            if (interfaceC2513jg != null) {
                ((com.inmobi.media.C2568li) interfaceC2513jg).a(ping.b, i, null, j, ping.g);
            }
        }
        java.lang.String priority = ping.e;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - ping.i;
        com.inmobi.media.C2936zi c2936zi = this.b;
        if (c2936zi != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
            java.util.Map a2 = c2936zi.a();
            a2.put("trigger", priority);
            a2.put("latency", java.lang.Long.valueOf(currentTimeMillis));
            com.inmobi.media.AbstractC2724rg.a("PingSuccess", a2);
        }
    }

    public final void a(com.inmobi.media.Zf ping, int i, java.lang.String str, int i2, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.d.get()) {
            return;
        }
        java.lang.String str2 = ping.f5085a;
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.adjust.sdk.Constants.HIGH, ping.e) && ping.f && ping.g < 1) {
            java.lang.String str3 = ping.b;
            com.inmobi.media.InterfaceC2513jg interfaceC2513jg = this.f5337a;
            if (interfaceC2513jg != null) {
                ((com.inmobi.media.C2568li) interfaceC2513jg).a(ping.b, i, str, j, ping.g);
            }
        } else {
            java.lang.String str4 = ping.b;
            int i3 = ping.g;
            boolean z = ping.f;
            java.lang.String str5 = ping.e;
        }
        java.lang.String priority = ping.e;
        com.inmobi.media.C2936zi c2936zi = this.b;
        if (c2936zi != null) {
            if (priority == null) {
                priority = "unknown";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
            java.util.Map a2 = c2936zi.a();
            a2.put("errorCode", (short) 2247);
            a2.put("trigger", priority);
            a2.put("retryCount", java.lang.String.valueOf(i2));
            com.inmobi.media.AbstractC2724rg.a("PingFailed", a2);
        }
    }

    public static void a(com.inmobi.media.C2592mg c2592mg, short s) {
        com.inmobi.media.C2936zi c2936zi = c2592mg.b;
        if (c2936zi != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("unknown", "priority");
            java.util.Map a2 = c2936zi.a();
            a2.put("errorCode", java.lang.Short.valueOf(s));
            a2.put("trigger", "unknown");
            a2.put("retryCount", java.lang.String.valueOf(0));
            com.inmobi.media.AbstractC2724rg.a("PingFailed", a2);
        }
    }
}
