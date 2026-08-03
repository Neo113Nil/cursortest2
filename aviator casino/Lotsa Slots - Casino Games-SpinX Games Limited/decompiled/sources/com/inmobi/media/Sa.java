package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Sa implements com.inmobi.media.Rf {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.core.config.models.CrashConfig f4953a;
    public com.inmobi.media.C2662p6 b;
    public final com.inmobi.media.Y9 c;
    public final kotlin.jvm.functions.Function1 d;

    public Sa(com.inmobi.media.core.config.models.CrashConfig crashConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        this.f4953a = crashConfig;
        this.c = new com.inmobi.media.Y9(crashConfig);
        this.d = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Sa$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Sa.a(com.inmobi.media.Sa.this, (com.inmobi.media.J2) obj);
            }
        };
    }

    public static final kotlin.Unit a(com.inmobi.media.Sa sa, com.inmobi.media.J2 it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        int i = it.f4774a;
        if (i != 1 && i != 2) {
            switch (i) {
                case androidx.compose.material.TextFieldImplKt.AnimationDuration /* 150 */:
                case 151:
                case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 152 */:
                    java.util.Map map = it.c;
                    if (map != null && map.containsKey("data")) {
                        java.lang.Object obj = it.c.get("data");
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        com.inmobi.media.X9 incident = (com.inmobi.media.X9) obj;
                        sa.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incident, "incident");
                        com.inmobi.media.AbstractC2939zl.a(new com.inmobi.media.Ra(sa, incident, null));
                        break;
                    }
                    break;
            }
        } else {
            com.inmobi.media.C2662p6 c2662p6 = sa.b;
            if (c2662p6 != null) {
                c2662p6.f.set(false);
                c2662p6.g.set(true);
                kotlinx.coroutines.Job job = c2662p6.j;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                c2662p6.j = null;
                c2662p6.i = null;
            }
            sa.b = null;
            ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(sa.d);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0100, code lost:
    
        if (r13 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0102, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r13.a(r15, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r15 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        if (r15.a(r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.Sa sa, com.inmobi.media.X9 x9, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Na na;
        int i;
        com.inmobi.media.X9 x92;
        java.lang.String str;
        java.lang.Object a2;
        sa.getClass();
        if (continuationImpl instanceof com.inmobi.media.Na) {
            na = (com.inmobi.media.Na) continuationImpl;
            int i2 = na.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                na.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = na.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = na.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - (sa.f4953a.getEventTTL() * 1000);
                    com.inmobi.media.U9 u9 = (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue();
                    na.f4852a = x9;
                    na.d = 1;
                } else if (i == 1) {
                    x9 = na.f4852a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    x9 = na.f4852a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int intValue = (((java.lang.Number) obj).intValue() + 1) - sa.f4953a.getMaxEventsToPersist();
                    if (intValue > 0) {
                        com.inmobi.media.U9 u92 = (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue();
                        na.f4852a = x9;
                        na.d = 3;
                    }
                    x92 = x9;
                    com.inmobi.media.U9 u93 = (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue();
                    na.f4852a = null;
                    na.d = 4;
                    com.inmobi.media.C2613n9 c2613n9 = u93.b;
                    java.lang.String str2 = u93.f5234a;
                    x92.getClass();
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("eventId", x92.e);
                    contentValues.put("componentType", x92.f);
                    contentValues.put("eventType", x92.f5268a);
                    str = x92.b;
                    if (str == null) {
                    }
                    contentValues.put("payload", str);
                    contentValues.put("ts", java.lang.String.valueOf(x92.c));
                    a2 = c2613n9.a(str2, contentValues, 4, na);
                    if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    x92 = na.f4852a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.U9 u932 = (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue();
                    na.f4852a = null;
                    na.d = 4;
                    com.inmobi.media.C2613n9 c2613n92 = u932.b;
                    java.lang.String str22 = u932.f5234a;
                    x92.getClass();
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("eventId", x92.e);
                    contentValues2.put("componentType", x92.f);
                    contentValues2.put("eventType", x92.f5268a);
                    str = x92.b;
                    if (str == null) {
                        str = "";
                    }
                    contentValues2.put("payload", str);
                    contentValues2.put("ts", java.lang.String.valueOf(x92.c));
                    a2 = c2613n92.a(str22, contentValues2, 4, na);
                    if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = kotlin.Unit.INSTANCE;
                    }
                }
                com.inmobi.media.U9 u94 = (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue();
                na.f4852a = x9;
                na.d = 2;
                obj = u94.a(na);
            }
        }
        na = new com.inmobi.media.Na(sa, continuationImpl);
        java.lang.Object obj2 = na.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = na.d;
        if (i != 0) {
        }
        com.inmobi.media.U9 u942 = (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue();
        na.f4852a = x9;
        na.d = 2;
        obj2 = u942.a(na);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.Sa sa, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Qa qa;
        java.lang.Object obj;
        int i;
        sa.getClass();
        if (continuationImpl instanceof com.inmobi.media.Qa) {
            qa = (com.inmobi.media.Qa) continuationImpl;
            int i2 = qa.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qa.c = i2 - Integer.MIN_VALUE;
                obj = qa.f4914a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qa.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.U9 u9 = (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue();
                    qa.c = 1;
                    obj = u9.a(qa);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Number) obj).intValue() > 0) {
                    sa.a();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        qa = new com.inmobi.media.Qa(sa, continuationImpl);
        obj = qa.f4914a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qa.c;
        if (i != 0) {
        }
        if (((java.lang.Number) obj).intValue() > 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a() {
        com.inmobi.media.C2426g6 eventConfig = this.f4953a.getEventConfig();
        eventConfig.k = this.f4953a.getUrl();
        com.inmobi.media.C2662p6 c2662p6 = this.b;
        if (c2662p6 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
            c2662p6.i = eventConfig;
        } else {
            this.b = new com.inmobi.media.C2662p6(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, (com.inmobi.media.U9) com.inmobi.media.W9.f5027a.getValue(), this, this.f4953a.getEventConfig(), null);
        }
        com.inmobi.media.C2662p6 c2662p62 = this.b;
        if (c2662p62 != null) {
            c2662p62.a(false);
        }
    }

    @Override // com.inmobi.media.Rf
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        int a2;
        java.lang.Object runBlocking$default;
        java.lang.String str;
        com.inmobi.media.B5.f4614a.getClass();
        int n = com.inmobi.media.B5.n();
        int i = 1;
        if (n == 0) {
            a2 = this.f4953a.getMobileConfig().a();
        } else if (n != 1) {
            a2 = this.f4953a.getMobileConfig().a();
        } else {
            a2 = this.f4953a.getWifiConfig().a();
        }
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.Ma(a2, null), 1, null);
        java.util.List<com.inmobi.media.X9> list = (java.util.List) runBlocking$default;
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.coroutines.jvm.internal.Boxing.boxInt(((com.inmobi.media.X9) it.next()).d));
            }
            try {
                java.util.HashMap hashMap = new java.util.HashMap(com.inmobi.media.B5.f4614a.a(false));
                hashMap.put("im-accid", com.inmobi.media.Xi.c);
                hashMap.put("version", "2.0.0");
                hashMap.put("component", com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN);
                hashMap.put("mk-version", com.inmobi.media.Yi.a());
                hashMap.putAll(com.inmobi.media.A1.e);
                hashMap.put("tp", com.inmobi.media.Yi.b);
                java.lang.String str2 = com.inmobi.media.Yi.f5069a;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put("tpVer", str2);
                org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.inmobi.media.X9 x9 : list) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("eventId", x9.e);
                    jSONObject2.put("eventType", x9.f5268a);
                    java.lang.String str3 = x9.b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    int length = str3.length() - i;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 <= length) {
                        boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str3.charAt(!z ? i2 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i2++;
                        } else {
                            z = true;
                        }
                    }
                    if (str3.subSequence(i2, length + 1).toString().length() > 0) {
                        java.lang.String str4 = x9.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONObject2.put("crash_report", str4);
                    }
                    jSONObject2.put("ts", x9.c);
                    jSONArray.put(jSONObject2);
                    i = 1;
                }
                jSONObject.put(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, jSONArray);
                str = jSONObject.toString();
            } catch (org.json.JSONException unused) {
                str = null;
            }
            if (str != null) {
                return new com.inmobi.media.C2478i6(str, arrayList);
            }
        }
        return null;
    }
}
