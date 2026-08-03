package androidx.emoji2.text;

/* loaded from: classes2.dex */
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final java.lang.String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";
    private final char[] mEmojiCharArray;
    private final androidx.emoji2.text.flatbuffer.MetadataList mMetadataList;
    private final androidx.emoji2.text.MetadataRepo.Node mRootNode = new androidx.emoji2.text.MetadataRepo.Node(1024);
    private final android.graphics.Typeface mTypeface;

    private MetadataRepo(android.graphics.Typeface typeface, androidx.emoji2.text.flatbuffer.MetadataList metadataList) {
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mEmojiCharArray = new char[metadataList.listLength() * 2];
        constructIndex(metadataList);
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface typeface) {
        try {
            androidx.core.os.TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new androidx.emoji2.text.MetadataRepo(typeface, new androidx.emoji2.text.flatbuffer.MetadataList());
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface typeface, java.io.InputStream inputStream) throws java.io.IOException {
        try {
            androidx.core.os.TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new androidx.emoji2.text.MetadataRepo(typeface, androidx.emoji2.text.MetadataListReader.read(inputStream));
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    public static androidx.emoji2.text.MetadataRepo create(android.graphics.Typeface typeface, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        try {
            androidx.core.os.TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new androidx.emoji2.text.MetadataRepo(typeface, androidx.emoji2.text.MetadataListReader.read(byteBuffer));
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    public static androidx.emoji2.text.MetadataRepo create(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        try {
            androidx.core.os.TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new androidx.emoji2.text.MetadataRepo(android.graphics.Typeface.createFromAsset(assetManager, str), androidx.emoji2.text.MetadataListReader.read(assetManager, str));
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    private void constructIndex(androidx.emoji2.text.flatbuffer.MetadataList metadataList) {
        int listLength = metadataList.listLength();
        for (int i = 0; i < listLength; i++) {
            androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer = new androidx.emoji2.text.TypefaceEmojiRasterizer(this, i);
            java.lang.Character.toChars(typefaceEmojiRasterizer.getId(), this.mEmojiCharArray, i * 2);
            put(typefaceEmojiRasterizer);
        }
    }

    android.graphics.Typeface getTypeface() {
        return this.mTypeface;
    }

    int getMetadataVersion() {
        return this.mMetadataList.version();
    }

    androidx.emoji2.text.MetadataRepo.Node getRootNode() {
        return this.mRootNode;
    }

    public char[] getEmojiCharArray() {
        return this.mEmojiCharArray;
    }

    public androidx.emoji2.text.flatbuffer.MetadataList getMetadataList() {
        return this.mMetadataList;
    }

    void put(androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        androidx.core.util.Preconditions.checkNotNull(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        androidx.core.util.Preconditions.checkArgument(typefaceEmojiRasterizer.getCodepointsLength() > 0, "invalid metadata codepoint length");
        this.mRootNode.put(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.getCodepointsLength() - 1);
    }

    static class Node {
        private final android.util.SparseArray<androidx.emoji2.text.MetadataRepo.Node> mChildren;
        private androidx.emoji2.text.TypefaceEmojiRasterizer mData;

        private Node() {
            this(1);
        }

        Node(int i) {
            this.mChildren = new android.util.SparseArray<>(i);
        }

        androidx.emoji2.text.MetadataRepo.Node get(int i) {
            android.util.SparseArray<androidx.emoji2.text.MetadataRepo.Node> sparseArray = this.mChildren;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        final androidx.emoji2.text.TypefaceEmojiRasterizer getData() {
            return this.mData;
        }

        void put(androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            androidx.emoji2.text.MetadataRepo.Node node = get(typefaceEmojiRasterizer.getCodepointAt(i));
            if (node == null) {
                node = new androidx.emoji2.text.MetadataRepo.Node();
                this.mChildren.put(typefaceEmojiRasterizer.getCodepointAt(i), node);
            }
            if (i2 > i) {
                node.put(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                node.mData = typefaceEmojiRasterizer;
            }
        }
    }
}
