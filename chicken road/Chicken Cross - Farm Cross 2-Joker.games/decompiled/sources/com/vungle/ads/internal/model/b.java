package com.vungle.ads.internal.model;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11953a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Integer e;
    public a f;
    public String g;
    public long h;
    public long i;
    public long j;
    public Long k;
    public final Object l;
    public final AtomicBoolean m;

    public final String a() {
        return this.f11953a;
    }

    public final void b(long j) {
        this.h = j;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.g;
    }

    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f == bVar.f && this.h == bVar.h && this.d == bVar.d && Intrinsics.areEqual(this.f11953a, bVar.f11953a) && Intrinsics.areEqual(this.b, bVar.b) && this.i == bVar.i && Intrinsics.areEqual(this.e, bVar.e)) {
            return Intrinsics.areEqual(this.c, bVar.c);
        }
        return false;
    }

    public final Long f() {
        return this.k;
    }

    public final long g() {
        return this.j;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f11953a.hashCode() * 31)) * 31)) * 31)) * 31;
        long j = this.h;
        int hashCode2 = (Boolean.hashCode(this.d) + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.i;
        int i = (hashCode2 + ((int) ((j2 >>> 32) ^ j2))) * 31;
        Integer num = this.e;
        return i + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.f == a.DOWNLOAD_SUCCESS;
    }

    public final boolean j() {
        return Intrinsics.areEqual(this.f11953a, "vmURL");
    }

    public final boolean k() {
        return Intrinsics.areEqual(this.f11953a, "MAIN_IMAGE") || Intrinsics.areEqual(this.f11953a, "MAIN_VIDEO");
    }

    public final boolean l() {
        return Intrinsics.areEqual(this.f11953a, "MAIN_VIDEO");
    }

    public final boolean m() {
        return Intrinsics.areEqual(this.f11953a, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean n() {
        return this.d;
    }

    public final boolean o() {
        return this.m.get();
    }

    public final void p() {
        if (this.m.getAndSet(false)) {
            synchronized (this.l) {
                this.l.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0024, B:7:0x002a, B:16:0x001a, B:4:0x000b), top: B:3:0x000b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        Object m8079constructorimpl;
        Throwable m8082exceptionOrNullimpl;
        this.m.set(true);
        synchronized (this.l) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.l.wait();
                m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
            } finally {
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                if (m8082exceptionOrNullimpl != null) {
                }
            }
            m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
            if (m8082exceptionOrNullimpl != null) {
                boolean z = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a("AdAsset", "Interrupted while waiting for file download: " + this, m8082exceptionOrNullimpl);
            }
        }
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("AdAsset(adIdentifier=").append(this.f11953a).append(", serverPath=").append(this.b).append(", localPath=").append(this.c).append(", status=").append(this.f).append(", fileSize=").append(this.h).append(", contentLength=").append(this.i).append(", isRequired=").append(this.d).append(", percentage=").append(this.e).append(')').toString();
    }

    public final void a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f = aVar;
    }

    public final long b() {
        return this.i;
    }

    public final void c(long j) {
        this.j = j;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.g = str;
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void a(Long l) {
        this.k = l;
    }

    public /* synthetic */ b(String str, String str2) {
        this("vmURL", str, str2, true, null);
    }

    public b(String adIdentifier, String serverPath, String localPath, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(serverPath, "serverPath");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        this.f11953a = adIdentifier;
        this.b = serverPath;
        this.c = localPath;
        this.d = z;
        this.e = num;
        this.f = a.NEW;
        this.g = "application/octet-stream";
        this.l = new Object();
        this.m = new AtomicBoolean(false);
    }
}
