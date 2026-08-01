package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.lk;
import com.chartboost.sdk.impl.ok;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class nk implements ok.a, lk {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f4898a;
    public final ak b;
    public final f3 c;
    public final k8 d;
    public final nh e;
    public final ScheduledExecutorService f;
    public final Queue g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public AtomicInteger k;
    public final Runnable l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b = new a("CAN_NOT_DOWNLOAD", 0);
        public static final a c = new a("CREATE_ASSET_AND_DOWNLOAD", 1);
        public static final a d = new a("BRING_TO_FRONT_QUEUE_AND_DOWNLOAD", 2);
        public static final /* synthetic */ a[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            a[] a2 = a();
            e = a2;
            f = EnumEntriesKt.enumEntries(a2);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{b, c, d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4899a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4899a = iArr;
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((wj) obj).a()), Long.valueOf(((wj) obj2).a()));
        }
    }

    public nk(e3 networkRequestService, ak policy, f3 f3Var, k8 k8Var, nh tempHelper, ScheduledExecutorService backgroundExecutor) {
        Intrinsics.checkNotNullParameter(networkRequestService, "networkRequestService");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(tempHelper, "tempHelper");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.f4898a = networkRequestService;
        this.b = policy;
        this.c = f3Var;
        this.d = k8Var;
        this.e = tempHelper;
        this.f = backgroundExecutor;
        this.g = new ConcurrentLinkedQueue();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new AtomicInteger(1);
        this.l = new Runnable() { // from class: com.chartboost.sdk.impl.nk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                nk.a(nk.this);
            }
        };
    }

    @Override // com.chartboost.sdk.impl.lk
    public void a(Context context) {
        File[] c2;
        Intrinsics.checkNotNullParameter(context, "context");
        k8 k8Var = this.d;
        if (k8Var == null || (c2 = k8Var.c()) == null) {
            return;
        }
        int length = c2.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            File file = c2[i];
            if (file.exists()) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.contains$default(name, ".tmp", z, 2, (Object) null)) {
                    k8Var.a(file);
                    return;
                }
            }
            ak akVar = this.b;
            Intrinsics.checkNotNull(file);
            if (akVar.a(file)) {
                k8Var.a(file);
            } else {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                this.j.put(file.getName(), new wj("", name2, file, k8Var.b(), file.lastModified(), null, file.length(), 32, null));
            }
            i++;
            z = false;
        }
    }

    @Override // com.chartboost.sdk.impl.lk
    public boolean b(String videoFilename) {
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        wj a2 = a(videoFilename);
        return (a2 != null && f(a2)) || (a2 != null && e(a2));
    }

    public final boolean c() {
        f3 f3Var = this.c;
        return (f3Var != null ? f3Var.e() : false) && !this.b.g() && this.h.isEmpty();
    }

    public final wj d(String str) {
        Object obj;
        if (str == null) {
            obj = this.g.poll();
        } else {
            wj wjVar = null;
            for (wj wjVar2 : this.g) {
                if (Intrinsics.areEqual(wjVar2.d(), str)) {
                    wjVar = wjVar2;
                }
            }
            obj = wjVar;
        }
        wj wjVar3 = (wj) obj;
        if (wjVar3 != null) {
            c(wjVar3);
        }
        return wjVar3;
    }

    public final boolean e(wj wjVar) {
        k8 k8Var;
        if (wjVar == null || wjVar.e() == null || (k8Var = this.d) == null) {
            return false;
        }
        return k8Var.c(wjVar.e());
    }

    public final boolean f(wj wjVar) {
        return this.e.b(wjVar.b(), wjVar.d());
    }

    public boolean g(wj wjVar) {
        if (wjVar == null || !e(wjVar)) {
            return false;
        }
        File e = wjVar.e();
        String d = wjVar.d();
        k8 k8Var = this.d;
        if (k8Var == null || !k8Var.a(e)) {
            return false;
        }
        this.j.remove(d);
        return true;
    }

    public final void h(wj wjVar) {
        mb.a("startDownloadNow: " + wjVar.g(), (Throwable) null, 2, (Object) null);
        if (b(wjVar.d())) {
            jg.a("File already downloaded or downloading: " + wjVar.d());
            String g = wjVar.g();
            t0 t0Var = (t0) this.i.remove(g);
            if (t0Var != null) {
                t0Var.a(g);
                return;
            }
            return;
        }
        jg.a("Start downloading " + wjVar.g());
        this.b.a();
        this.h.add(wjVar.g());
        f3 f3Var = this.c;
        File e = wjVar.e();
        Intrinsics.checkNotNull(e);
        this.f4898a.a(new ok(f3Var, e, wjVar.g(), this, ue.e, this.f4898a.a()));
    }

    public final void c(wj wjVar) {
        if (jg.f4829a.d()) {
            File file = new File(wjVar.f());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final void c(String str) {
        for (wj wjVar : new LinkedList(this.g)) {
            if (wjVar != null && Intrinsics.areEqual(wjVar.g(), str)) {
                this.g.remove(wjVar);
            }
        }
    }

    public final boolean b() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return false;
        }
        return this.b.b(k8Var.b(k8Var.b()));
    }

    public final void b(wj wjVar) {
        if (jg.f4829a.d()) {
            File file = new File(wjVar.f());
            try {
                file.createNewFile();
                file.setLastModified(hh.a());
            } catch (IOException e) {
                mb.b("Error while creating queue empty file: " + e, (Throwable) null, 2, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean b(String str, String str2) {
        if (this.g.size() <= 0) {
            return false;
        }
        for (wj wjVar : this.g) {
            if (Intrinsics.areEqual(wjVar.g(), str) && Intrinsics.areEqual(wjVar.d(), str2)) {
                return true;
            }
        }
        return false;
    }

    public final File d(wj wjVar) {
        return this.e.a(wjVar.b(), wjVar.d());
    }

    @Override // com.chartboost.sdk.impl.lk
    public synchronized void a(String url, String filename, boolean z, t0 t0Var) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        mb.a("downloadVideoFile: " + url, (Throwable) null, 2, (Object) null);
        k8 k8Var = this.d;
        File b2 = k8Var != null ? k8Var.b() : null;
        k8 k8Var2 = this.d;
        int i = b.f4899a[a(url, filename, z, t0Var, b(filename), k8Var2 != null ? k8Var2.a(b2, filename) : null).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    lk.a.a(this, filename, 0, true, 2, null);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            a(url, filename, new File(b2, filename), b2);
            if (!z) {
                filename = null;
            }
            a(filename, this.k.get(), z);
        }
    }

    public final a a(String str, String str2, boolean z, t0 t0Var, boolean z2, File file) {
        if (z) {
            if (z2) {
                if (this.i.containsKey(str)) {
                    mb.a("Already downloading for show operation: " + str2, (Throwable) null, 2, (Object) null);
                    jg.a("Already downloading for show operation: " + str2);
                    a(str, str2, file != null ? file.length() : 0L, t0Var);
                    return a.b;
                }
                if (t0Var != null) {
                    mb.a("Register callback for show operation: " + str2, (Throwable) null, 2, (Object) null);
                    jg.a("Register callback for show operation: " + str2);
                    a(str, str2, file != null ? file.length() : 0L, t0Var);
                    return a.b;
                }
            } else {
                mb.a("Not downloading for show operation: " + str2, (Throwable) null, 2, (Object) null);
                if (t0Var != null) {
                    wj wjVar = (wj) this.j.get(str2);
                    if (Intrinsics.areEqual(wjVar != null ? wjVar.d() : null, str2) || this.i.containsKey(str)) {
                        this.i.put(str, t0Var);
                        return a.d;
                    }
                }
            }
            if (t0Var != null) {
                mb.a("Register callback for show operation: " + str2, (Throwable) null, 2, (Object) null);
                jg.a("Register callback for show operation: " + str2);
                this.i.put(str, t0Var);
            }
        } else if (b(str, str2) || z2) {
            mb.a("Already queued or downloading for cache operation: " + str2, (Throwable) null, 2, (Object) null);
            jg.a("Already queued or downloading for cache operation: " + str2);
            return a.b;
        }
        return a.c;
    }

    @Override // com.chartboost.sdk.impl.lk
    public void a(String str, int i, boolean z) {
        mb.a("startDownloadIfPossible: " + str, (Throwable) null, 2, (Object) null);
        if (this.g.size() > 0) {
            if (!z && !c()) {
                jg.a("Can't cache next video at the moment");
                this.f.schedule(this.l, i * 5000, TimeUnit.MILLISECONDS);
                return;
            }
            wj d = d(str);
            if (d != null) {
                h(d);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.lk
    public wj a(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return (wj) this.j.get(filename);
    }

    @Override // com.chartboost.sdk.impl.lk
    public int a(wj wjVar) {
        if (wjVar == null) {
            return 0;
        }
        if (e(wjVar)) {
            return 5;
        }
        File d = d(wjVar);
        long length = d != null ? d.length() : 0L;
        if (wjVar.c() == 0) {
            return 0;
        }
        return zf.a(length / wjVar.c());
    }

    public final void a() {
        if (b()) {
            Collection values = this.j.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Iterator it = CollectionsKt.sortedWith(values, new c()).iterator();
            while (it.hasNext()) {
                g((wj) it.next());
                if (!b()) {
                    return;
                }
            }
        }
    }

    public final void a(String str, String str2, File file, File file2) {
        File d;
        k8 k8Var = this.d;
        wj wjVar = new wj(str, str2, file, file2, 0L, ((k8Var == null || (d = k8Var.d()) == null) ? null : d.getAbsolutePath()) + File.separator + str2, 0L, 80, null);
        file.setLastModified(wjVar.a());
        b(wjVar);
        this.j.putIfAbsent(str2, wjVar);
        this.g.offer(wjVar);
    }

    @Override // com.chartboost.sdk.impl.ok.a
    public void a(String url, String videoFileName, long j, t0 t0Var) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        mb.a("tempFileIsReady: " + videoFileName, (Throwable) null, 2, (Object) null);
        wj a2 = a(videoFileName);
        if (j > 0 && a2 != null) {
            a2.a(j);
        }
        if (a2 != null) {
            this.j.remove(videoFileName);
        }
        if (t0Var == null) {
            t0Var = (t0) this.i.get(url);
        }
        if (t0Var != null) {
            t0Var.a(url);
        }
    }

    @Override // com.chartboost.sdk.impl.ok.a
    public void a(String uri, String videoFileName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        mb.a("onSuccess: " + uri, (Throwable) null, 2, (Object) null);
        jg.a("Video downloaded success " + uri);
        a();
        this.h.remove(uri);
        this.i.remove(uri);
        this.k = new AtomicInteger(1);
        c(uri);
        a((String) null, this.k.get(), false);
    }

    @Override // com.chartboost.sdk.impl.ok.a
    public void a(String uri, String videoFileName, CBError cBError) {
        String str;
        File e;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        mb.a("onError: " + uri, (Throwable) null, 2, (Object) null);
        if (cBError == null || (str = cBError.getErrorDesc()) == null) {
            str = "Unknown error";
        }
        wj a2 = a(videoFileName);
        if (a2 != null && (e = a2.e()) != null) {
            e.delete();
        }
        if (cBError == null || cBError.getType() != CBError.Internal.INTERNET_UNAVAILABLE) {
            c(uri);
            t0 t0Var = (t0) this.i.get(uri);
            if (t0Var != null) {
                t0Var.a(uri);
            } else {
                mb.b("Missing callback on error", (Throwable) null, 2, (Object) null);
            }
        } else if (a2 != null) {
            this.g.add(a2);
            b(a2);
        }
        this.i.remove(uri);
        this.j.remove(videoFileName);
        a((String) null, this.k.get(), false);
        mb.b("Video download failed: " + uri + " with error " + str, (Throwable) null, 2, (Object) null);
        jg.a("Video downloaded failed " + uri + " with error " + str);
        this.h.remove(uri);
    }

    public static final void a(nk nkVar) {
        nkVar.a((String) null, nkVar.k.incrementAndGet(), false);
    }
}
