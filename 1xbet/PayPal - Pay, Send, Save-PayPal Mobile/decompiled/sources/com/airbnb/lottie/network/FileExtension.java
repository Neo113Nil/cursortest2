package com.airbnb.lottie.network;

/* loaded from: classes7.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final java.lang.String extension;

    FileExtension(java.lang.String str) {
        this.extension = str;
    }

    public final java.lang.String tempExtension() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".temp");
        sb.append(this.extension);
        return sb.toString();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.extension;
    }
}
