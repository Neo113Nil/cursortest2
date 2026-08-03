package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0847Le implements java.util.Comparator<java.io.File> {
    public C0847Le() {
    }

    private int A00(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compare(java.io.File file, java.io.File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}
