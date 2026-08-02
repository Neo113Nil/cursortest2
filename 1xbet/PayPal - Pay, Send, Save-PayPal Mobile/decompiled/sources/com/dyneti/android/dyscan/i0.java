package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract class i0 {
    public static java.nio.MappedByteBuffer a(java.io.FileInputStream fileInputStream, android.content.res.AssetFileDescriptor assetFileDescriptor) {
        try {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            channel.size();
            java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
            channel.close();
            assetFileDescriptor.close();
            return map;
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
