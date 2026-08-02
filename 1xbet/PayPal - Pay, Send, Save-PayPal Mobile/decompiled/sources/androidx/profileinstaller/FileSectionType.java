package androidx.profileinstaller;

/* loaded from: classes7.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    final long getInputSizeshNQ4ISI;

    FileSectionType(long j) {
        this.getInputSizeshNQ4ISI = j;
    }
}
