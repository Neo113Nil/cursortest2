package androidx.media3.muxer;

/* loaded from: classes7.dex */
public final class MuxerUtil {
    public static final long UNSIGNED_INT_MAX_VALUE = 4294967295L;

    private MuxerUtil() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r0.modificationTimestampSeconds <= 4294967295L) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0.typeIndicator != 23) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isMetadataSupported(androidx.media3.common.Metadata.Entry entry) {
        if (!(entry instanceof androidx.media3.container.Mp4OrientationData) && !(entry instanceof androidx.media3.container.Mp4LocationData)) {
            if (entry instanceof androidx.media3.container.Mp4TimestampData) {
                androidx.media3.container.Mp4TimestampData mp4TimestampData = (androidx.media3.container.Mp4TimestampData) entry;
                if (mp4TimestampData.creationTimestampSeconds <= 4294967295L) {
                }
            }
            if (entry instanceof androidx.media3.container.MdtaMetadataEntry) {
                androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntry = (androidx.media3.container.MdtaMetadataEntry) entry;
                if (mdtaMetadataEntry.typeIndicator != 1) {
                }
            }
            if (!(entry instanceof androidx.media3.container.XmpData)) {
                return false;
            }
        }
        return true;
    }

    public static androidx.media3.muxer.BufferInfo getMuxerBufferInfoFromMediaCodecBufferInfo(android.media.MediaCodec.BufferInfo bufferInfo) {
        com.google.common.base.Preconditions.checkNotNull(bufferInfo);
        return new androidx.media3.muxer.BufferInfo(bufferInfo.presentationTimeUs, bufferInfo.size, androidx.media3.common.util.Util.getBufferFlagsFromMediaCodecFlags(bufferInfo.flags));
    }

    public static void createMotionPhotoFromJpegImageAndBmffVideo(java.io.FileInputStream fileInputStream, long j, java.io.FileInputStream fileInputStream2, java.lang.String str, java.nio.channels.WritableByteChannel writableByteChannel) throws java.io.IOException {
        short s;
        com.google.common.base.Preconditions.checkArgument(str.equals(androidx.media3.common.MimeTypes.VIDEO_MP4) || str.equals(androidx.media3.common.MimeTypes.VIDEO_QUICK_TIME), "Only MP4 and QUICKTIME container mime types supported");
        java.nio.channels.FileChannel channel = fileInputStream.getChannel();
        java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
        java.nio.channels.FileChannel channel2 = fileInputStream2.getChannel();
        long size = channel2.size();
        map.mark();
        com.google.common.base.Preconditions.checkArgument(map.getShort() == -40, "SOI marker not found");
        int position = map.position();
        while (map.remaining() > 2 && (s = map.getShort()) != -38 && s != -39) {
            int i = map.getShort() - 2;
            if (s == -32 || s == -31) {
                position = map.position() + i;
            }
            map.position(map.position() + i);
        }
        map.reset();
        int position2 = map.position();
        int limit = map.limit();
        map.limit(position);
        writableByteChannel.write(map);
        map.position(position2);
        map.limit(limit);
        byte[] utf8Bytes = androidx.media3.common.util.Util.getUtf8Bytes(java.lang.String.format(java.util.Locale.US, "<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 5.1.0-jc003\">\n  <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n    <rdf:Description rdf:about=\"\"\n        xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\"\n        xmlns:Container=\"http://ns.google.com/photos/1.0/container/\"\n        xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\"\n      GCamera:MotionPhoto=\"1\"\n      GCamera:MotionPhotoVersion=\"1\"\n      GCamera:MotionPhotoPresentationTimestampUs=\"%d\">\n        <Container:Directory>\n          <rdf:Seq>\n            <rdf:li rdf:parseType=\"Resource\">\n              <Container:Item\n                Item:Mime=\"%s\"\n                Item:Semantic=\"Primary\"\n                Item:Length=\"0\"\n                Item:Padding=\"0\"/>\n            </rdf:li>\n            <rdf:li rdf:parseType=\"Resource\">\n              <Container:Item\n                Item:Mime=\"%s\"\n                Item:Semantic=\"MotionPhoto\"\n                Item:Length=\"%d\"\n                Item:Padding=\"0\"/>\n            </rdf:li>\n          </rdf:Seq>\n        </Container:Directory>\n      </rdf:Description>\n    </rdf:RDF>\n  </x:xmpmeta>\n", java.lang.Long.valueOf(j), "image/jpeg", str, java.lang.Long.valueOf(size)));
        short length = (short) (utf8Bytes.length + 31);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(length + 2);
        allocateDirect.putShort((short) -31);
        allocateDirect.putShort(length);
        allocateDirect.put(androidx.media3.common.util.Util.getUtf8Bytes("http://ns.adobe.com/xap/1.0/\u0000"));
        allocateDirect.put(utf8Bytes);
        allocateDirect.flip();
        writableByteChannel.write(allocateDirect);
        map.position(position);
        writableByteChannel.write(map);
        channel2.transferTo(0L, channel2.size(), writableByteChannel);
    }

    static boolean Camera2StreamConfigurationMap(androidx.media3.common.Format format) {
        if ((format.roleFlags & 32768) > 0) {
            return format.auxiliaryTrackType == 1 || format.auxiliaryTrackType == 2 || format.auxiliaryTrackType == 3 || format.auxiliaryTrackType == 4;
        }
        return false;
    }

    static androidx.media3.container.MdtaMetadataEntry getHighResolutionOutputSizeshNQ4ISI(long j) {
        return new androidx.media3.container.MdtaMetadataEntry(androidx.media3.container.MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_OFFSET, com.google.common.primitives.Longs.toByteArray(j), 78);
    }

    static androidx.media3.container.MdtaMetadataEntry getHighSpeedVideoFpsRanges(long j) {
        return new androidx.media3.container.MdtaMetadataEntry(androidx.media3.container.MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_LENGTH, com.google.common.primitives.Longs.toByteArray(j), 78);
    }

    static void getHighSpeedVideoFpsRanges(androidx.media3.muxer.MetadataCollector metadataCollector, androidx.media3.container.Mp4TimestampData mp4TimestampData, boolean z, java.util.List<androidx.media3.muxer.Track> list) {
        int i;
        metadataCollector.getHighSpeedVideoFpsRanges(mp4TimestampData);
        metadataCollector.getHighSpeedVideoFpsRanges(new androidx.media3.container.MdtaMetadataEntry(androidx.media3.container.MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_INTERLEAVED, new byte[]{z ? (byte) 1 : (byte) 0}, 75));
        int size = list.size();
        byte[] bArr = new byte[size + 2];
        bArr[0] = 1;
        bArr[1] = (byte) size;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.media3.muxer.Track track = list.get(i2);
            int i3 = track.getHighResolutionOutputSizeshNQ4ISI.auxiliaryTrackType;
            if (i3 != 1) {
                i = 2;
                if (i3 == 2) {
                    i = 1;
                } else if (i3 == 3) {
                    continue;
                } else {
                    if (i3 != 4) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported auxiliary track type ");
                        sb.append(track.getHighResolutionOutputSizeshNQ4ISI.auxiliaryTrackType);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    i = 3;
                }
            } else {
                i = 0;
            }
            bArr[i2 + 2] = (byte) i;
        }
        metadataCollector.getHighSpeedVideoFpsRanges(new androidx.media3.container.MdtaMetadataEntry(androidx.media3.container.MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP, bArr, 0));
    }
}
