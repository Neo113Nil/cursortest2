package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class s implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11907a;
    public final /* synthetic */ t b;
    public final /* synthetic */ File c;
    public final /* synthetic */ String d;

    public s(String str, t tVar, File file, String str2) {
        this.f11907a = str;
        this.b = tVar;
        this.c = file;
        this.d = str2;
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(d progress, l downloadRequest) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(l downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        boolean z = u.f12190a;
        com.vungle.ads.internal.util.t.a("TemplateDownloadManager", com.iab.omid.library.vungle.internal.l.a("Template download started: ").append(this.f11907a).toString());
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(File file, l downloadRequest) {
        ReentrantLock reentrantLock;
        HashMap hashMap;
        boolean z;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        reentrantLock = this.b.c;
        t tVar = this.b;
        String str = this.f11907a;
        reentrantLock.lock();
        try {
            hashMap = tVar.i;
            List list = (List) hashMap.remove(str);
            if (list == null) {
                list = CollectionsKt.emptyList();
            } else {
                Intrinsics.checkNotNullExpressionValue(list, "inFlight.remove(url) ?: …(Result<File>) -> Unit>()");
            }
            z = tVar.e;
            Pair pair = TuplesKt.to(list, Boolean.valueOf(z));
            reentrantLock.unlock();
            List<Function1> list2 = (List) pair.component1();
            if (((Boolean) pair.component2()).booleanValue()) {
                this.c.delete();
                return;
            }
            File file2 = new File(this.d);
            if (this.c.renameTo(file2)) {
                boolean z2 = u.f12190a;
                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", com.iab.omid.library.vungle.internal.l.a("Template download succeeded: ").append(this.f11907a).toString());
                for (Function1 function1 : list2) {
                    Result.Companion companion = Result.INSTANCE;
                    function1.invoke(Result.m8078boximpl(Result.m8079constructorimpl(file2)));
                }
                return;
            }
            this.c.delete();
            if (file2.exists()) {
                boolean z3 = u.f12190a;
                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", com.iab.omid.library.vungle.internal.l.a("Template download succeeded: ").append(this.f11907a).toString());
                for (Function1 function12 : list2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    function12.invoke(Result.m8078boximpl(Result.m8079constructorimpl(file2)));
                }
                return;
            }
            boolean z4 = u.f12190a;
            com.vungle.ads.internal.util.t.b("TemplateDownloadManager", com.iab.omid.library.vungle.internal.l.a("Template download failed to promote: ").append(this.f11907a).toString());
            String str2 = this.f11907a;
            for (Function1 function13 : list2) {
                Result.Companion companion3 = Result.INSTANCE;
                function13.invoke(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(new Exception(com.iab.omid.library.vungle.d.a("Failed to promote template: ", str2))))));
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(c cVar, l downloadRequest) {
        ReentrantLock reentrantLock;
        HashMap hashMap;
        boolean z;
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        reentrantLock = this.b.c;
        t tVar = this.b;
        String str = this.f11907a;
        reentrantLock.lock();
        try {
            hashMap = tVar.i;
            List list = (List) hashMap.remove(str);
            if (list == null) {
                list = CollectionsKt.emptyList();
            } else {
                Intrinsics.checkNotNullExpressionValue(list, "inFlight.remove(url) ?: …(Result<File>) -> Unit>()");
            }
            z = tVar.e;
            Pair pair = TuplesKt.to(list, Boolean.valueOf(z));
            reentrantLock.unlock();
            List<Function1> list2 = (List) pair.component1();
            boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
            this.c.delete();
            if (booleanValue) {
                return;
            }
            Throwable a2 = cVar.a();
            if (a2 == null) {
                a2 = new Exception(com.iab.omid.library.vungle.internal.l.a("Template download failed: ").append(this.f11907a).toString());
            }
            boolean z2 = u.f12190a;
            com.vungle.ads.internal.util.t.b("TemplateDownloadManager", com.iab.omid.library.vungle.internal.l.a("Template download failed: ").append(this.f11907a).append(", error: ").append(a2.getMessage()).toString());
            for (Function1 function1 : list2) {
                Result.Companion companion = Result.INSTANCE;
                function1.invoke(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(a2))));
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
