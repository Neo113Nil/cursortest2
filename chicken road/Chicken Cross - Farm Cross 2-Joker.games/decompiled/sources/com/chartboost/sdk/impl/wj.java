package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wj {

    /* renamed from: a, reason: collision with root package name */
    public final String f5063a;
    public final String b;
    public final File c;
    public final File d;
    public final long e;
    public final String f;
    public long g;

    public wj(String url, String filename, File file, File file2, long j, String queueFilePath, long j2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(queueFilePath, "queueFilePath");
        this.f5063a = url;
        this.b = filename;
        this.c = file;
        this.d = file2;
        this.e = j;
        this.f = queueFilePath;
        this.g = j2;
    }

    public final long a() {
        return this.e;
    }

    public final File b() {
        return this.d;
    }

    public final long c() {
        return this.g;
    }

    public final String d() {
        return this.b;
    }

    public final File e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj)) {
            return false;
        }
        wj wjVar = (wj) obj;
        return Intrinsics.areEqual(this.f5063a, wjVar.f5063a) && Intrinsics.areEqual(this.b, wjVar.b) && Intrinsics.areEqual(this.c, wjVar.c) && Intrinsics.areEqual(this.d, wjVar.d) && this.e == wjVar.e && Intrinsics.areEqual(this.f, wjVar.f) && this.g == wjVar.g;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.f5063a;
    }

    public int hashCode() {
        int hashCode = ((this.f5063a.hashCode() * 31) + this.b.hashCode()) * 31;
        File file = this.c;
        int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
        File file2 = this.d;
        return ((((((hashCode2 + (file2 != null ? file2.hashCode() : 0)) * 31) + Long.hashCode(this.e)) * 31) + this.f.hashCode()) * 31) + Long.hashCode(this.g);
    }

    public String toString() {
        return "VideoAsset(url=" + this.f5063a + ", filename=" + this.b + ", localFile=" + this.c + ", directory=" + this.d + ", creationDate=" + this.e + ", queueFilePath=" + this.f + ", expectedFileSize=" + this.g + ")";
    }

    public final void a(long j) {
        this.g = j;
    }

    public /* synthetic */ wj(String str, String str2, File file, File file2, long j, String str3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, file, file2, (i & 16) != 0 ? hh.a() : j, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? 0L : j2);
    }
}
