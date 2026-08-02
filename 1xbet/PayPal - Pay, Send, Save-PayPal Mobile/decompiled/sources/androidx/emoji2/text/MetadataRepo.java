package androidx.emoji2.text;

/* loaded from: classes3.dex */
public final class MetadataRepo {
    private final char[] Camera2StreamConfigurationMap;
    final android.graphics.Typeface getHighSpeedVideoFpsRanges;
    final androidx.emoji2.text.MetadataRepo.Node getHighSpeedVideoFpsRangesFor = new androidx.emoji2.text.MetadataRepo.Node(1024);
    final androidx.emoji2.text.flatbuffer.MetadataList getHighSpeedVideoSizes;

    private MetadataRepo(android.graphics.Typeface typeface, androidx.emoji2.text.flatbuffer.MetadataList metadataList) {
        this.getHighSpeedVideoFpsRanges = typeface;
        this.getHighSpeedVideoSizes = metadataList;
        this.Camera2StreamConfigurationMap = new char[metadataList.listLength() * 2];
        int listLength = metadataList.listLength();
        for (int i = 0; i < listLength; i++) {
            androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer = new androidx.emoji2.text.TypefaceEmojiRasterizer(this, i);
            java.lang.Character.toChars(typefaceEmojiRasterizer.getId(), this.Camera2StreamConfigurationMap, i * 2);
            androidx.core.util.Preconditions.checkNotNull(typefaceEmojiRasterizer, "emoji metadata cannot be null");
            androidx.core.util.Preconditions.checkArgument(typefaceEmojiRasterizer.getCodepointsLength() > 0, "invalid metadata codepoint length");
            androidx.emoji2.text.MetadataRepo.Node node = this.getHighSpeedVideoFpsRangesFor;
            int codepointsLength = typefaceEmojiRasterizer.getCodepointsLength() - 1;
            int i2 = 0;
            while (true) {
                int codepointAt = typefaceEmojiRasterizer.getCodepointAt(i2);
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo.Node> sparseArray = node.getHighResolutionOutputSizeshNQ4ISI;
                androidx.emoji2.text.MetadataRepo.Node node2 = sparseArray == null ? null : sparseArray.get(codepointAt);
                if (node2 == null) {
                    node2 = new androidx.emoji2.text.MetadataRepo.Node();
                    node.getHighResolutionOutputSizeshNQ4ISI.put(typefaceEmojiRasterizer.getCodepointAt(i2), node2);
                }
                node = node2;
                i2 = codepointsLength > i2 ? i2 + 1 : i2;
            }
            node.getHighSpeedVideoFpsRanges = typefaceEmojiRasterizer;
        }
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface typeface) {
        try {
            androidx.core.os.TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new androidx.emoji2.text.MetadataRepo(typeface, new androidx.emoji2.text.flatbuffer.MetadataList());
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface typeface, java.io.InputStream inputStream) throws java.io.IOException {
        try {
            androidx.core.os.TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new androidx.emoji2.text.MetadataRepo(typeface, androidx.emoji2.text.MetadataListReader.getHighSpeedVideoSizes(inputStream));
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface typeface, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        try {
            androidx.core.os.TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new androidx.emoji2.text.MetadataRepo(typeface, androidx.emoji2.text.MetadataListReader.Camera2StreamConfigurationMap(byteBuffer));
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    public static androidx.emoji2.text.MetadataRepo create(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        try {
            androidx.core.os.TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new androidx.emoji2.text.MetadataRepo(android.graphics.Typeface.createFromAsset(assetManager, str), androidx.emoji2.text.MetadataListReader.Camera2StreamConfigurationMap(assetManager, str));
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    public final char[] getEmojiCharArray() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.emoji2.text.flatbuffer.MetadataList getMetadataList() {
        return this.getHighSpeedVideoSizes;
    }

    /* loaded from: classes7.dex */
    static class Node {
        final android.util.SparseArray<androidx.emoji2.text.MetadataRepo.Node> getHighResolutionOutputSizeshNQ4ISI;
        androidx.emoji2.text.TypefaceEmojiRasterizer getHighSpeedVideoFpsRanges;

        Node() {
            this(1);
        }

        Node(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.util.SparseArray<>(i);
        }
    }
}
