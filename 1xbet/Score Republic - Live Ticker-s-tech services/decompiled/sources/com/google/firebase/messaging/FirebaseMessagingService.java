package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C0615qe;
import p000.RunnableC0886xq;
import p000.an0;
import p000.f71;
import p000.fn0;
import p000.hr0;
import p000.j22;
import p000.nk1;
import p000.nu1;
import p000.qc1;
import p000.v92;
import p000.w31;
import p000.z01;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends Service {

    /* JADX INFO: renamed from: p */
    public static final ArrayDeque f1395p = new ArrayDeque(10);

    /* JADX INFO: renamed from: j */
    public final ExecutorService f1396j;

    /* JADX INFO: renamed from: k */
    public nk1 f1397k;

    /* JADX INFO: renamed from: l */
    public final Object f1398l;

    /* JADX INFO: renamed from: m */
    public int f1399m;

    /* JADX INFO: renamed from: n */
    public int f1400n;

    /* JADX INFO: renamed from: o */
    public w31 f1401o;

    public FirebaseMessagingService() {
        hr0 hr0Var = new hr0("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), hr0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1396j = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f1398l = new Object();
        this.f1400n = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1015a(Intent intent) {
        if (intent != null) {
            j22.m2795d(intent);
        }
        synchronized (this.f1398l) {
            try {
                int i = this.f1400n - 1;
                this.f1400n = i;
                if (i == 0) {
                    stopSelfResult(this.f1399m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x010c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX INFO: renamed from: b */
    public final void m1016b(Intent intent) {
        String stringExtra;
        Bundle extras;
        an0 an0Var;
        ExecutorService executorServiceNewSingleThreadExecutor;
        String stringExtra2;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                mo1018d(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra3 = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra = intent.getStringExtra("message_type");
            if (stringExtra == null) {
                stringExtra = "gcm";
            }
            switch (stringExtra) {
                case -2062414158:
                    if (stringExtra.equals("deleted_messages")) {
                    }
                    break;
                case 102161:
                    if (stringExtra.equals("gcm")) {
                    }
                    break;
                case 814694033:
                    if (stringExtra.equals("send_error")) {
                    }
                    break;
                case 814800675:
                    if (stringExtra.equals("send_event")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                Method dump skipped, instruction units count: 474
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.m1016b(android.content.Intent):void");
        }

        @Override // android.app.Service
        public final synchronized IBinder onBind(Intent intent) {
            try {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "Service received bind request");
                }
                if (this.f1397k == null) {
                    this.f1397k = new nk1(new nu1(20, this));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f1397k;
        }

        @Override // android.app.Service
        public final void onDestroy() {
            this.f1396j.shutdown();
            super.onDestroy();
        }

        @Override // android.app.Service
        public final int onStartCommand(Intent intent, int i, int i2) {
            synchronized (this.f1398l) {
                this.f1399m = i2;
                this.f1400n++;
            }
            Intent intent2 = (Intent) ((ArrayDeque) f71.m1647o().f2337n).poll();
            if (intent2 == null) {
                m1015a(intent);
                return 2;
            }
            qc1 qc1Var = new qc1();
            this.f1396j.execute(new RunnableC0886xq(this, intent2, qc1Var, 3));
            v92 v92Var = qc1Var.f6465a;
            if (v92Var.m5132h()) {
                m1015a(intent);
                return 2;
            }
            v92Var.m5125a(new fn0(), new C0615qe(4, this, intent));
            return 3;
        }

        /* JADX INFO: renamed from: c */
        public void mo1017c(z01 z01Var) {
        }

        /* JADX INFO: renamed from: d */
        public void mo1018d(String str) {
        }
    }
