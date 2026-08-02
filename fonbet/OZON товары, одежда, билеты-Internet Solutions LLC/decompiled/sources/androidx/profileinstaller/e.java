package androidx.profileinstaller;

/* loaded from: classes8.dex */
enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    e(long j11) {
        this.mValue = j11;
    }

    public final long a() {
        return this.mValue;
    }
}
