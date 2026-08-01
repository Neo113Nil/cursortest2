package com.applovin.impl;

import android.os.Process;
import android.os.SystemClock;
import androidx.core.util.Consumer;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class g4 {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f4211a = new PriorityBlockingQueue();
    private final com.applovin.impl.sdk.l b;

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f4212a;
        private final com.applovin.impl.sdk.l b;

        private void a() {
            b((c) this.f4212a.take());
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x00ed A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #8 {all -> 0x018e, blocks: (B:55:0x00d5, B:57:0x00ed, B:72:0x012a), top: B:54:0x00d5 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void b(final c cVar) {
            Throwable th;
            HttpURLConnection httpURLConnection;
            byte[] bArr;
            long elapsedRealtime;
            long j;
            byte[] bArr2;
            byte[] bArr3;
            byte[] bArr4;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            int i = 0;
            try {
                httpURLConnection = a(cVar);
                try {
                    if (cVar.d != null && cVar.d.length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(cVar.d.length);
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(cVar.d);
                                outputStream.close();
                            } finally {
                            }
                        } catch (Throwable th2) {
                            HashMap hashMap = new HashMap();
                            CollectionUtils.putStringIfValid("details", "outputStream", hashMap);
                            CollectionUtils.putStringIfValid("url", cVar.f4213a, hashMap);
                            CollectionUtils.putStringIfValid(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.toString(0), hashMap);
                            this.b.E().a("NetworkCommunicationThread", "processRequest", th2, hashMap);
                            throw th2;
                        }
                    }
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                    i = httpURLConnection.getResponseCode();
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (i > 0) {
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            try {
                                bArr = s0.a(inputStream, this.b);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            HashMap hashMap2 = new HashMap();
                                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", hashMap2);
                                            CollectionUtils.putStringIfValid("url", cVar.f4213a, hashMap2);
                                            CollectionUtils.putStringIfValid(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.toString(i), hashMap2);
                                            this.b.E().a("NetworkCommunicationThread", "processRequest", th, hashMap2);
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                elapsedRealtime = SystemClock.elapsedRealtime();
                                                this.b.Q().a("NetworkCommunicationThread", th);
                                                this.b.Q();
                                                if (com.applovin.impl.sdk.p.a()) {
                                                    this.b.Q().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                                }
                                                if (httpURLConnection == null) {
                                                    try {
                                                        InputStream errorStream = httpURLConnection.getErrorStream();
                                                        try {
                                                            byte[] a2 = s0.a(errorStream, this.b);
                                                            if (errorStream != null) {
                                                                try {
                                                                    errorStream.close();
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    j = elapsedRealtime2;
                                                                    bArr2 = a2;
                                                                    this.b.Q().a("NetworkCommunicationThread", th);
                                                                    HashMap hashMap3 = new HashMap();
                                                                    CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap3);
                                                                    CollectionUtils.putStringIfValid("url", cVar.f4213a, hashMap3);
                                                                    CollectionUtils.putStringIfValid(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.toString(i), hashMap3);
                                                                    this.b.E().a("NetworkCommunicationThread", "processRequest", th, hashMap3);
                                                                    bArr3 = bArr2;
                                                                    bArr4 = bArr;
                                                                    elapsedRealtime2 = j;
                                                                    t7.a(httpURLConnection, this.b);
                                                                    final d a3 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                                                                    cVar.g.execute(new Runnable() { // from class: com.applovin.impl.g4$b$$ExternalSyntheticLambda0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            g4.b.a(g4.c.this, a3);
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                            bArr4 = bArr;
                                                            bArr3 = a2;
                                                        } catch (Throwable th6) {
                                                            j = elapsedRealtime2;
                                                            try {
                                                                if (errorStream == null) {
                                                                    throw th6;
                                                                }
                                                                try {
                                                                    errorStream.close();
                                                                    throw th6;
                                                                } catch (Throwable th7) {
                                                                    th6.addSuppressed(th7);
                                                                    throw th6;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                bArr2 = null;
                                                                this.b.Q().a("NetworkCommunicationThread", th);
                                                                HashMap hashMap32 = new HashMap();
                                                                CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap32);
                                                                CollectionUtils.putStringIfValid("url", cVar.f4213a, hashMap32);
                                                                CollectionUtils.putStringIfValid(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.toString(i), hashMap32);
                                                                this.b.E().a("NetworkCommunicationThread", "processRequest", th, hashMap32);
                                                                bArr3 = bArr2;
                                                                bArr4 = bArr;
                                                                elapsedRealtime2 = j;
                                                                t7.a(httpURLConnection, this.b);
                                                                final d a32 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                                                                cVar.g.execute(new Runnable() { // from class: com.applovin.impl.g4$b$$ExternalSyntheticLambda0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        g4.b.a(g4.c.this, a32);
                                                                    }
                                                                });
                                                            }
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        j = elapsedRealtime2;
                                                    }
                                                } else {
                                                    bArr4 = bArr;
                                                    bArr3 = null;
                                                }
                                                t7.a(httpURLConnection, this.b);
                                                final d a322 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                                                cVar.g.execute(new Runnable() { // from class: com.applovin.impl.g4$b$$ExternalSyntheticLambda0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        g4.b.a(g4.c.this, a322);
                                                    }
                                                });
                                            } catch (Throwable th10) {
                                                t7.a(httpURLConnection, this.b);
                                                throw th10;
                                            }
                                        }
                                    }
                                }
                                elapsedRealtime = elapsedRealtime3;
                                bArr4 = bArr;
                                bArr3 = null;
                            } finally {
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            bArr = null;
                        }
                    } else {
                        elapsedRealtime = elapsedRealtime3;
                        bArr3 = null;
                        bArr4 = null;
                    }
                    th = null;
                } catch (Throwable th12) {
                    th = th12;
                    bArr = null;
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    this.b.Q().a("NetworkCommunicationThread", th);
                    this.b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                    }
                    if (httpURLConnection == null) {
                    }
                    t7.a(httpURLConnection, this.b);
                    final d a3222 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                    cVar.g.execute(new Runnable() { // from class: com.applovin.impl.g4$b$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            g4.b.a(g4.c.this, a3222);
                        }
                    });
                }
            } catch (Throwable th13) {
                th = th13;
                httpURLConnection = null;
            }
            t7.a(httpURLConnection, this.b);
            final d a32222 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
            cVar.g.execute(new Runnable() { // from class: com.applovin.impl.g4$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    g4.b.a(g4.c.this, a32222);
                }
            });
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i, com.applovin.impl.sdk.l lVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (lVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f4212a = blockingQueue;
            this.b = lVar;
            setPriority(((Integer) lVar.a(c5.S)).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f4213a).openConnection();
            httpURLConnection.setRequestMethod(cVar.b);
            httpURLConnection.setConnectTimeout(cVar.e);
            httpURLConnection.setReadTimeout(cVar.e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.c.isEmpty()) {
                for (Map.Entry entry : cVar.c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {
        private static final AtomicInteger i = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f4213a;
        private final String b;
        private final Map c;
        private final byte[] d;
        private final int e;
        private final Consumer f;
        private final Executor g;
        private final int h;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f4214a;
            private String b;
            private Map c = new HashMap();
            private byte[] d;
            private int e;
            private Consumer f;
            private Executor g;

            public a a(String str) {
                this.f4214a = str;
                return this;
            }

            public a b(String str) {
                this.b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.d = bArr;
                return this;
            }

            public a a(int i) {
                this.e = i;
                return this;
            }

            public a a(Consumer consumer) {
                this.f = consumer;
                return this;
            }

            public a a(Executor executor) {
                this.g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.h - cVar.h;
        }

        private c(a aVar) {
            this.f4213a = aVar.f4214a;
            this.b = aVar.b;
            this.c = aVar.c != null ? aVar.c : Collections.emptyMap();
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = i.incrementAndGet();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f4215a;
        private final byte[] b;
        private final byte[] c;
        private final long d;
        private final Throwable e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f4216a;
            private byte[] b;
            private byte[] c;
            private long d;
            private Throwable e;

            public a a(int i) {
                this.f4216a = i;
                return this;
            }

            public a b(byte[] bArr) {
                this.c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.e = th;
                return this;
            }

            public a a(long j) {
                this.d = j;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f4215a;
        }

        public int c() {
            Throwable th = this.e;
            if (th == null) {
                return this.f4215a;
            }
            throw th;
        }

        public byte[] d() {
            Throwable th = this.e;
            if (th == null) {
                return this.b;
            }
            throw th;
        }

        public long e() {
            return this.d;
        }

        public byte[] f() {
            return this.c;
        }

        private d(a aVar) {
            this.f4215a = aVar.f4216a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }
    }

    public g4(com.applovin.impl.sdk.l lVar) {
        this.b = lVar;
    }

    public void a() {
        for (int i = 0; i < ((Integer) this.b.a(c5.R)).intValue(); i++) {
            new b(this.f4211a, i, this.b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f4211a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
