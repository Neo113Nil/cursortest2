package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y7 implements x7 {

    /* renamed from: a, reason: collision with root package name */
    public final File f5087a;
    public final File b;
    public final File c;

    public y7(Context context, File precacheDirectory, File precacheQueueDirectory, File precachingInternalDirectory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(precacheDirectory, "precacheDirectory");
        Intrinsics.checkNotNullParameter(precacheQueueDirectory, "precacheQueueDirectory");
        Intrinsics.checkNotNullParameter(precachingInternalDirectory, "precachingInternalDirectory");
        this.f5087a = precacheDirectory;
        this.b = precacheQueueDirectory;
        this.c = precachingInternalDirectory;
    }

    @Override // com.chartboost.sdk.impl.x7
    public File a() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.x7
    public File b() {
        return this.c;
    }

    @Override // com.chartboost.sdk.impl.x7
    public File c() {
        return this.f5087a;
    }

    @Override // com.chartboost.sdk.impl.x7
    public File a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new File(c(), id);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ y7(Context context, File file, File file2, File file3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, file, (i & 4) != 0 ? f6.c(context) : file2, (i & 8) != 0 ? new File(file, "exoplayer-cache") : file3);
        file = (i & 2) != 0 ? f6.b(context) : file;
    }
}
