package com.facetec.sdk;

/* loaded from: classes8.dex */
class m {
    private static /* synthetic */ boolean b = true;
    private static com.facetec.sdk.ms c;

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f3638a;
    private final java.util.concurrent.Semaphore e = new java.util.concurrent.Semaphore(1);

    m(android.content.Context context) {
        this.f3638a = context.getApplicationContext();
    }

    private static com.facetec.sdk.ms e() {
        com.facetec.sdk.ms msVar;
        synchronized (com.facetec.sdk.m.class) {
            if (c == null) {
                com.facetec.sdk.ms.a aVar = new com.facetec.sdk.ms.a();
                aVar.u = com.facetec.sdk.nh.c(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, 60L, java.util.concurrent.TimeUnit.SECONDS);
                aVar.C = com.facetec.sdk.nh.c(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, 60L, java.util.concurrent.TimeUnit.SECONDS);
                aVar.A = com.facetec.sdk.nh.c(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, 60L, java.util.concurrent.TimeUnit.SECONDS);
                c = aVar.b();
            }
            msVar = c;
        }
        return msVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(android.content.Context context, com.facetec.sdk.ao aoVar) {
        android.os.Process.setThreadPriority(19);
        com.facetec.sdk.t.b(context, aoVar, true, com.facetec.sdk.bw.c.FRONT, com.facetec.sdk.cn.b);
        this.e.release();
    }

    final void c(com.facetec.sdk.FaceTecSessionResult faceTecSessionResult, java.lang.String str) {
        synchronized (this) {
            if (com.facetec.sdk.bj.c()) {
                com.facetec.sdk.ay.a();
                com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
                epVar.a("faceScan", faceTecSessionResult.getFaceScanBase64());
                epVar.a("auditTrailImage", faceTecSessionResult.getAuditTrailCompressedBase64()[0]);
                epVar.a("lowQualityAuditTrailImage", faceTecSessionResult.getLowQualityAuditTrailCompressedBase64()[0]);
                if (com.facetec.sdk.t.a()) {
                    e().d(new com.facetec.sdk.mx.a().e("https://api.facetec.com/api/v3.1/biometrics/liveness-3d").b("Content-Type", "application/json").b("X-Device-Key", str).b("User-Agent", com.facetec.sdk.FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId())).b("X-User-Agent", com.facetec.sdk.FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId())).b("x-on-device-retry", "true").a(com.facetec.sdk.my.c(com.facetec.sdk.mr.d("application/json; charset=utf-8"), epVar.toString())).c()).a(new com.facetec.sdk.mg() { // from class: com.facetec.sdk.m.5
                        @Override // com.facetec.sdk.mg
                        public final void c(java.io.IOException iOException) {
                        }

                        @Override // com.facetec.sdk.mg
                        public final void d(com.facetec.sdk.mw mwVar) {
                        }
                    });
                }
            }
        }
    }

    private static java.util.ArrayList<java.lang.String> a(com.facetec.sdk.t.b bVar, boolean z) {
        boolean l = com.facetec.sdk.cq.l();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add(com.facetec.sdk.as.f3399a);
        com.facetec.sdk.cm cmVar = com.facetec.sdk.cm.ZOOM_FAR;
        if (z) {
            cmVar = com.facetec.sdk.cq.j();
        }
        if (cmVar == com.facetec.sdk.cm.PROCESSING_COMPLETE_SUCCESS) {
            arrayList.add(com.facetec.sdk.as.b);
        } else if (cmVar == com.facetec.sdk.cm.PROCESSING_COMPLETE_RETRY) {
            arrayList.add(com.facetec.sdk.as.c);
        } else if (bVar == com.facetec.sdk.t.b.USER_CANCELLED) {
            arrayList.add(com.facetec.sdk.as.e);
            arrayList.add(com.facetec.sdk.t.e);
        } else if (bVar == com.facetec.sdk.t.b.SESSION_CONTEXT_SWITCH) {
            arrayList.add(com.facetec.sdk.as.i);
            arrayList.add(com.facetec.sdk.t.e);
        } else if (bVar == com.facetec.sdk.t.b.PRE_SESSION_PHASE_1_TIMEOUT) {
            arrayList.add(com.facetec.sdk.as.s);
            arrayList.add(com.facetec.sdk.t.e);
        } else if (bVar == com.facetec.sdk.t.b.PRE_SESSION_PHASE_2_TIMEOUT) {
            arrayList.add(com.facetec.sdk.as.p);
            arrayList.add(com.facetec.sdk.t.e);
        } else if (bVar == com.facetec.sdk.t.b.SESSION_TIMEOUT) {
            arrayList.add(com.facetec.sdk.as.h);
            arrayList.add(com.facetec.sdk.t.e);
        } else if (bVar == com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL) {
            arrayList.add(com.facetec.sdk.as.b);
        } else {
            arrayList.add(com.facetec.sdk.as.c);
        }
        if (l) {
            arrayList.add(com.facetec.sdk.as.g);
            return arrayList;
        }
        arrayList.add(com.facetec.sdk.as.f);
        return arrayList;
    }

    final void d(final java.lang.String str, final com.facetec.sdk.t.b bVar) {
        final com.facetec.sdk.ao h;
        synchronized (this) {
            if (com.facetec.sdk.bj.c()) {
                com.facetec.sdk.ay.a();
                final java.util.ArrayList<java.lang.String> a2 = a(bVar, true);
                if (bVar != com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL) {
                    java.util.Iterator<java.lang.String> it = a2.iterator();
                    while (it.hasNext()) {
                        com.facetec.sdk.cq.G(it.next());
                    }
                }
                if (com.facetec.sdk.t.a()) {
                    com.facetec.sdk.t.a(this.f3638a, bVar);
                    try {
                        this.e.acquire();
                        com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.m$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.m.this.b(bVar, a2, str);
                            }
                        });
                    } catch (java.lang.InterruptedException e) {
                        com.facetec.sdk.n.b(e);
                    }
                    final android.content.Context context = this.f3638a;
                    com.facetec.sdk.ay.a();
                    if (!com.facetec.sdk.bj.c() || bVar == com.facetec.sdk.t.b.WAYPOINT_UPLOAD) {
                        return;
                    }
                    try {
                        try {
                            if (com.facetec.sdk.ai.a(context).booleanValue()) {
                                h = com.facetec.sdk.ai.e;
                            } else {
                                h = com.facetec.sdk.ai.h();
                            }
                            this.e.acquire();
                            com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.m$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.m.this.d(context, h);
                                }
                            });
                        } catch (java.lang.InterruptedException e2) {
                            com.facetec.sdk.n.b(e2);
                        }
                    } catch (com.facetec.sdk.ak e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.facetec.sdk.t.b bVar, java.util.ArrayList arrayList, java.lang.String str) {
        if (bVar != com.facetec.sdk.t.b.USER_CANCELLED) {
            android.os.Process.setThreadPriority(19);
        }
        com.facetec.sdk.t.d(this.f3638a, arrayList, "", com.facetec.sdk.p.FACE_SCAN, str, "", false);
        this.e.release();
    }

    final void a(final com.facetec.sdk.t.b bVar, final java.lang.String str, final java.lang.String str2, boolean z, final boolean z2) {
        synchronized (this) {
            try {
                if (com.facetec.sdk.bj.c()) {
                    com.facetec.sdk.ay.a();
                    final com.facetec.sdk.p pVar = z ? com.facetec.sdk.p.ID_SCAN_ONLY : com.facetec.sdk.p.ID_SCAN_MATCH;
                    final java.util.ArrayList<java.lang.String> a2 = a(bVar, false);
                    if (bVar != com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL) {
                        java.util.Iterator<java.lang.String> it = a2.iterator();
                        while (it.hasNext()) {
                            com.facetec.sdk.cq.G(it.next());
                        }
                    }
                    if (com.facetec.sdk.t.a()) {
                        com.facetec.sdk.t.a(this.f3638a, bVar);
                        try {
                            this.e.acquire();
                            com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.m$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.m.this.c(bVar, a2, pVar, str, str2, z2);
                                }
                            });
                        } catch (java.lang.InterruptedException e) {
                            com.facetec.sdk.n.b(e);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.facetec.sdk.t.b bVar, java.util.ArrayList arrayList, com.facetec.sdk.p pVar, java.lang.String str, java.lang.String str2, boolean z) {
        if (bVar != com.facetec.sdk.t.b.USER_CANCELLED) {
            android.os.Process.setThreadPriority(19);
        }
        com.facetec.sdk.t.d(this.f3638a, arrayList, "", pVar, str, str2, z);
        this.e.release();
    }

    final void c() {
        if (!b && java.lang.Thread.currentThread().equals(android.os.Looper.getMainLooper().getThread())) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.Semaphore semaphore = this.e;
        if (semaphore != null) {
            try {
                if (semaphore.tryAcquire(5L, java.util.concurrent.TimeUnit.SECONDS)) {
                    this.e.release();
                }
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
