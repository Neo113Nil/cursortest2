package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u000fR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004"}, d2 = {"Lcom/miteksystems/misnap/core/FrameImage;", "", "", "getFormat", "()I", "format", "getHeight", "height", "", "Lcom/miteksystems/misnap/core/FrameImage$Plane;", "getPlanes", "()[Lcom/miteksystems/misnap/core/FrameImage$Plane;", "planes", "getWidth", "width", "Plane"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface FrameImage {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/miteksystems/misnap/core/FrameImage$Plane;", "", "Ljava/nio/ByteBuffer;", "getByteBuffer", "()Ljava/nio/ByteBuffer;", "byteBuffer", "", "getPixelStride", "()I", "pixelStride", "getRowStride", "rowStride"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Plane {
        java.nio.ByteBuffer getByteBuffer();

        int getPixelStride();

        int getRowStride();
    }

    int getFormat();

    int getHeight();

    com.miteksystems.misnap.core.FrameImage.Plane[] getPlanes();

    int getWidth();
}
