package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonCreateFile.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCreateFile;", "Lcom/unity3d/ads/core/domain/CreateFile;", "<init>", "()V", "invoke", "Ljava/io/File;", "parent", "child", "", "pathname", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(File parent, String child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return new File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(String pathname) {
        Intrinsics.checkNotNullParameter(pathname, "pathname");
        return new File(pathname);
    }
}
