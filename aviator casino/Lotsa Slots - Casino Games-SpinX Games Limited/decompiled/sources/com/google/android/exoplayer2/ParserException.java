package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public class ParserException extends java.io.IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public static com.google.android.exoplayer2.ParserException createForMalformedDataOfUnknownType(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.exoplayer2.ParserException(str, th, true, 0);
    }

    public static com.google.android.exoplayer2.ParserException createForMalformedContainer(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.exoplayer2.ParserException(str, th, true, 1);
    }

    public static com.google.android.exoplayer2.ParserException createForMalformedManifest(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.exoplayer2.ParserException(str, th, true, 4);
    }

    public static com.google.android.exoplayer2.ParserException createForManifestWithUnsupportedFeature(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.exoplayer2.ParserException(str, th, false, 4);
    }

    public static com.google.android.exoplayer2.ParserException createForUnsupportedContainerFeature(java.lang.String str) {
        return new com.google.android.exoplayer2.ParserException(str, null, false, 1);
    }

    protected ParserException(java.lang.String str, java.lang.Throwable th, boolean z, int i) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }
}
