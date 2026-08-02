package androidx.media3.common;

/* loaded from: classes7.dex */
public final class Metadata {
    private final androidx.media3.common.Metadata.Entry[] getHighResolutionOutputSizeshNQ4ISI;
    public final long presentationTimeUs;

    public interface Entry {
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default androidx.media3.common.Format getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        }
    }

    public Metadata(androidx.media3.common.Metadata.Entry... entryArr) {
        this(androidx.media3.common.C.TIME_UNSET, entryArr);
    }

    public Metadata(long j, androidx.media3.common.Metadata.Entry... entryArr) {
        this.presentationTimeUs = j;
        this.getHighResolutionOutputSizeshNQ4ISI = entryArr;
    }

    public Metadata(java.util.List<? extends androidx.media3.common.Metadata.Entry> list) {
        this((androidx.media3.common.Metadata.Entry[]) list.toArray(new androidx.media3.common.Metadata.Entry[0]));
    }

    public Metadata(long j, java.util.List<? extends androidx.media3.common.Metadata.Entry> list) {
        this(j, (androidx.media3.common.Metadata.Entry[]) list.toArray(new androidx.media3.common.Metadata.Entry[0]));
    }

    public final int length() {
        return this.getHighResolutionOutputSizeshNQ4ISI.length;
    }

    public final androidx.media3.common.Metadata.Entry get(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI[i];
    }

    public final <T extends androidx.media3.common.Metadata.Entry> T getFirstEntryOfType(java.lang.Class<T> cls) {
        return (T) getFirstMatchingEntry(cls, com.google.common.base.Predicates.alwaysTrue());
    }

    public final <T extends androidx.media3.common.Metadata.Entry> T getFirstMatchingEntry(java.lang.Class<T> cls, com.google.common.base.Predicate<T> predicate) {
        for (androidx.media3.common.Metadata.Entry entry : this.getHighResolutionOutputSizeshNQ4ISI) {
            T t = (T) Camera2StreamConfigurationMap(entry, cls, predicate);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final <T extends androidx.media3.common.Metadata.Entry> com.google.common.collect.ImmutableList<T> getEntriesOfType(java.lang.Class<T> cls) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (androidx.media3.common.Metadata.Entry entry : this.getHighResolutionOutputSizeshNQ4ISI) {
            if (cls.isAssignableFrom(entry.getClass())) {
                builder.add((com.google.common.collect.ImmutableList.Builder) cls.cast(entry));
            }
        }
        return builder.build();
    }

    public final <T extends androidx.media3.common.Metadata.Entry> com.google.common.collect.ImmutableList<T> getMatchingEntries(java.lang.Class<T> cls, com.google.common.base.Predicate<T> predicate) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (androidx.media3.common.Metadata.Entry entry : this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.media3.common.Metadata.Entry Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(entry, cls, predicate);
            if (Camera2StreamConfigurationMap != null) {
                builder.add((com.google.common.collect.ImmutableList.Builder) Camera2StreamConfigurationMap);
            }
        }
        return builder.build();
    }

    private static <T extends androidx.media3.common.Metadata.Entry> T Camera2StreamConfigurationMap(androidx.media3.common.Metadata.Entry entry, java.lang.Class<T> cls, com.google.common.base.Predicate<T> predicate) {
        if (!cls.isAssignableFrom(entry.getClass())) {
            return null;
        }
        T cast = cls.cast(entry);
        if (predicate.apply(cast)) {
            return cast;
        }
        return null;
    }

    public final androidx.media3.common.Metadata copyWithAppendedEntriesFrom(androidx.media3.common.Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final androidx.media3.common.Metadata copyWithAppendedEntries(androidx.media3.common.Metadata.Entry... entryArr) {
        return entryArr.length == 0 ? this : new androidx.media3.common.Metadata(this.presentationTimeUs, (androidx.media3.common.Metadata.Entry[]) androidx.media3.common.util.Util.nullSafeArrayConcatenation(this.getHighResolutionOutputSizeshNQ4ISI, entryArr));
    }

    public final androidx.media3.common.Metadata copyWithPresentationTimeUs(long j) {
        return this.presentationTimeUs == j ? this : new androidx.media3.common.Metadata(j, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.Metadata metadata = (androidx.media3.common.Metadata) obj;
        return java.util.Arrays.equals(this.getHighResolutionOutputSizeshNQ4ISI, metadata.getHighResolutionOutputSizeshNQ4ISI) && this.presentationTimeUs == metadata.presentationTimeUs;
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI) * 31) + com.google.common.primitives.Longs.hashCode(this.presentationTimeUs);
    }

    public final java.lang.String toString() {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("entries=");
        sb.append(java.util.Arrays.toString(this.getHighResolutionOutputSizeshNQ4ISI));
        if (this.presentationTimeUs == androidx.media3.common.C.TIME_UNSET) {
            obj = "";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(", presentationTimeUs=");
            sb2.append(this.presentationTimeUs);
            obj = sb2.toString();
        }
        sb.append(obj);
        return sb.toString();
    }
}
