package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.vungle.ads.internal.executor.a f11908a;
    public final PathProvider b;
    public final ReentrantLock c;
    public final AtomicBoolean d;
    public volatile boolean e;
    public final LinkedHashSet f;
    public volatile i g;
    public volatile i h;
    public final HashMap i;

    public t(com.vungle.ads.internal.executor.a executors, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.f11908a = executors;
        this.b = pathProvider;
        this.c = new ReentrantLock();
        this.d = new AtomicBoolean(false);
        this.f = new LinkedHashSet();
        this.i = new HashMap();
    }

    public static String a(String url) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.INSTANCE;
            String path = new URI(url).getPath();
            Intrinsics.checkNotNullExpressionValue(path, "URI(url).path");
            List split$default = StringsKt.split$default((CharSequence) StringsKt.trim(path, FileSystemKt.UnixPathSeparator), new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null);
            m8079constructorimpl = Result.m8079constructorimpl(split$default.size() >= 2 ? CollectionsKt.joinToString$default(CollectionsKt.takeLast(split$default, 2), "_", null, null, 0, null, null, 62, null) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8085isFailureimpl(m8079constructorimpl) ? null : m8079constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Map vmTemplates) {
        String str;
        File file;
        String dirCanonical;
        Intrinsics.checkNotNullParameter(vmTemplates, "vmTemplates");
        if (vmTemplates.isEmpty() || this.e) {
            return;
        }
        File vmDir = this.b.getVmDir();
        try {
            str = vmDir.getCanonicalPath();
        } catch (IOException unused) {
            str = null;
        }
        Iterator it = CollectionsKt.take(CollectionsKt.sortedWith(vmTemplates.entrySet(), new q()), 10).iterator();
        while (it.hasNext()) {
            String url = (String) ((Map.Entry) it.next()).getKey();
            if (this.e) {
                return;
            }
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(vmDir, "vmDir");
            String a2 = a(url);
            if (a2 != null) {
                file = new File(vmDir, a2);
                if (str == null) {
                    try {
                        dirCanonical = vmDir.getCanonicalPath();
                    } catch (IOException e) {
                        boolean z = u.f12190a;
                        com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Failed to resolve canonical path for template: " + a2 + ", error: " + e.getMessage());
                    }
                } else {
                    dirCanonical = str;
                }
                String canonicalPath = file.getCanonicalPath();
                Intrinsics.checkNotNullExpressionValue(canonicalPath, "file.canonicalPath");
                Intrinsics.checkNotNullExpressionValue(dirCanonical, "dirCanonical");
                if (!StringsKt.startsWith$default(canonicalPath, dirCanonical, false, 2, (Object) null)) {
                    boolean z2 = u.f12190a;
                    com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Template file path escapes vmDir: " + a2);
                }
                if (file == null) {
                    boolean z3 = u.f12190a;
                    com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Pre-downloading template: " + url);
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "templateFile.absolutePath");
                    a(url, absolutePath, k.LOWEST, new o(this), new r(url));
                }
            }
            file = null;
            if (file == null) {
            }
        }
    }

    public final void a(Set fileNames) {
        Intrinsics.checkNotNullParameter(fileNames, "fileNames");
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.f.addAll(fileNames);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void a(t tVar, String url, String localPath, com.vungle.ads.internal.load.d callback) {
        k priority = k.CRITICAL;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        tVar.a(url, localPath, priority, new p(tVar), callback);
    }

    public final void a(String str, String str2, k kVar, Function0 function0, Function1 function1) {
        boolean z;
        ReentrantLock reentrantLock;
        boolean z2 = u.f12190a;
        com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Requesting template: " + str);
        if (this.e) {
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(new Exception("TemplateDownloadManager is stopped")))));
            return;
        }
        File file = new File(str2);
        String fileName = file.getName();
        this.c.lock();
        try {
            boolean z3 = true;
            boolean z4 = false;
            if (this.e) {
                z = false;
            } else {
                LinkedHashSet linkedHashSet = this.f;
                Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
                linkedHashSet.add(fileName);
                if (file.exists()) {
                    z = false;
                    z4 = true;
                } else {
                    List list = (List) this.i.get(str);
                    if (list != null) {
                        list.add(function1);
                        z = false;
                    } else {
                        this.i.put(str, CollectionsKt.mutableListOf(function1));
                        z = true;
                        z3 = false;
                    }
                }
                z3 = z;
            }
            if (z3) {
                Result.Companion companion2 = Result.INSTANCE;
                function1.invoke(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(new Exception("TemplateDownloadManager is stopped")))));
                return;
            }
            if (z4) {
                AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.VM_TEMPLATE_CACHE_HIT, 1L, null, str, 4);
                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Template cache hit: " + str);
                Result.Companion companion3 = Result.INSTANCE;
                function1.invoke(Result.m8078boximpl(Result.m8079constructorimpl(file)));
                return;
            }
            if (z) {
                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Starting template download: " + str);
                i iVar = (i) function0.invoke();
                if (iVar == null) {
                    reentrantLock = this.c;
                    reentrantLock.lock();
                    try {
                        List list2 = (List) this.i.remove(str);
                        if (list2 == null) {
                            list2 = CollectionsKt.emptyList();
                        } else {
                            Intrinsics.checkNotNullExpressionValue(list2, "inFlight.remove(url) ?: …(Result<File>) -> Unit>()");
                        }
                        Pair pair = TuplesKt.to(list2, Boolean.valueOf(this.e));
                        reentrantLock.unlock();
                        List list3 = (List) pair.component1();
                        Result.Companion companion4 = Result.INSTANCE;
                        Object m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(new Exception("TemplateDownloadManager is stopped")));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(Result.m8078boximpl(m8079constructorimpl));
                        }
                        return;
                    } finally {
                    }
                }
                File file2 = new File(com.iab.omid.library.vungle.d.a(str2, ".tmp"));
                try {
                    String absolutePath = file2.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "tmpFile.absolutePath");
                    iVar.a(new l(kVar, new com.vungle.ads.internal.model.b(str, absolutePath)), new s(str, this, file2, str2));
                } catch (Exception e) {
                    reentrantLock = this.c;
                    reentrantLock.lock();
                    try {
                        List list4 = (List) this.i.remove(str);
                        if (list4 == null) {
                            list4 = CollectionsKt.emptyList();
                        } else {
                            Intrinsics.checkNotNullExpressionValue(list4, "inFlight.remove(url) ?: …(Result<File>) -> Unit>()");
                        }
                        Pair pair2 = TuplesKt.to(list4, Boolean.valueOf(this.e));
                        reentrantLock.unlock();
                        List list5 = (List) pair2.component1();
                        boolean booleanValue = ((Boolean) pair2.component2()).booleanValue();
                        boolean z5 = u.f12190a;
                        com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Failed to start template download: " + str + ", error: " + e.getMessage());
                        if (booleanValue) {
                            return;
                        }
                        Result.Companion companion5 = Result.INSTANCE;
                        Object m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(e));
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            ((Function1) it2.next()).invoke(Result.m8078boximpl(m8079constructorimpl2));
                        }
                    } finally {
                    }
                }
            }
        } finally {
        }
    }

    public final void a(Map map) {
        if (map == null || map.isEmpty() || this.e) {
            return;
        }
        if (!this.d.compareAndSet(false, true)) {
            boolean z = u.f12190a;
            com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Initial template cleanup already performed this session, skipping");
            return;
        }
        File[] listFiles = this.b.getVmDir().listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.e) {
                return;
            }
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "file.name");
            if (StringsKt.endsWith$default(name, ".html", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) name, '_', false, 2, (Object) null) && file.isFile()) {
                ReentrantLock reentrantLock = this.c;
                reentrantLock.lock();
                try {
                    if (!this.f.contains(file.getName())) {
                        try {
                            if (file.delete()) {
                                boolean z2 = u.f12190a;
                                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Removed expired template: " + file.getName());
                            } else {
                                boolean z3 = u.f12190a;
                                com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Failed to delete expired template: " + file.getName());
                            }
                        } catch (Exception e) {
                            boolean z4 = u.f12190a;
                            com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Error deleting expired template: " + file.getName() + ", error: " + e.getMessage());
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    public final void a() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            i iVar = this.g;
            if (iVar != null) {
                iVar.a();
            }
            i iVar2 = this.h;
            if (iVar2 != null) {
                iVar2.a();
            }
            this.g = null;
            this.h = null;
            Collection values = this.i.values();
            Intrinsics.checkNotNullExpressionValue(values, "inFlight.values");
            List flatten = CollectionsKt.flatten(values);
            this.i.clear();
            this.f.clear();
            this.e = true;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Result.Companion companion = Result.INSTANCE;
            Object m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(new Exception("TemplateDownloadManager is stopped")));
            Iterator it = flatten.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Result.m8078boximpl(m8079constructorimpl));
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
