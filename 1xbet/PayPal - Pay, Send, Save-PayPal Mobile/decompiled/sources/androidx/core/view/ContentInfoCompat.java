package androidx.core.view;

/* loaded from: classes3.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    private final androidx.core.view.ContentInfoCompat.Compat getHighResolutionOutputSizeshNQ4ISI;

    interface BuilderCompat {
        androidx.core.view.ContentInfoCompat Camera2StreamConfigurationMap();

        void getHighResolutionOutputSizeshNQ4ISI(int i);

        void getHighResolutionOutputSizeshNQ4ISI(android.net.Uri uri);

        void getHighSpeedVideoFpsRangesFor(android.content.ClipData clipData);

        void getHighSpeedVideoSizes(int i);

        void getHighSpeedVideoSizes(android.os.Bundle bundle);
    }

    interface Compat {
        int Camera2StreamConfigurationMap();

        android.view.ContentInfo cd_();

        int getHighResolutionOutputSizeshNQ4ISI();

        android.net.Uri getHighSpeedVideoFpsRanges();

        android.content.ClipData getHighSpeedVideoFpsRangesFor();

        android.os.Bundle getHighSpeedVideoSizes();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i == 4) {
            return "SOURCE_AUTOFILL";
        }
        if (i == 5) {
            return "SOURCE_PROCESS_TEXT";
        }
        return java.lang.String.valueOf(i);
    }

    static java.lang.String getHighSpeedVideoSizes(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return java.lang.String.valueOf(i);
    }

    ContentInfoCompat(androidx.core.view.ContentInfoCompat.Compat compat) {
        this.getHighResolutionOutputSizeshNQ4ISI = compat;
    }

    public static androidx.core.view.ContentInfoCompat toContentInfoCompat(android.view.ContentInfo contentInfo) {
        return new androidx.core.view.ContentInfoCompat(new androidx.core.view.ContentInfoCompat.Compat31Impl(contentInfo));
    }

    public final android.view.ContentInfo toContentInfo() {
        return (android.view.ContentInfo) java.util.Objects.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.cd_());
    }

    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString();
    }

    public final android.content.ClipData getClip() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
    }

    public final int getSource() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
    }

    public final int getFlags() {
        return this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
    }

    public final android.net.Uri getLinkUri() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
    }

    public final android.os.Bundle getExtras() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
    }

    public final android.util.Pair<androidx.core.view.ContentInfoCompat, androidx.core.view.ContentInfoCompat> partition(androidx.core.util.Predicate<android.content.ClipData.Item> predicate) {
        android.content.ClipData highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor.getItemCount() == 1) {
            boolean test = predicate.test(highSpeedVideoFpsRangesFor.getItemAt(0));
            return android.util.Pair.create(test ? this : null, test ? null : this);
        }
        android.util.Pair<android.content.ClipData, android.content.ClipData> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, predicate);
        if (highSpeedVideoFpsRanges.first == null) {
            return android.util.Pair.create(null, this);
        }
        if (highSpeedVideoFpsRanges.second == null) {
            return android.util.Pair.create(this, null);
        }
        return android.util.Pair.create(new androidx.core.view.ContentInfoCompat.Builder(this).setClip((android.content.ClipData) highSpeedVideoFpsRanges.first).build(), new androidx.core.view.ContentInfoCompat.Builder(this).setClip((android.content.ClipData) highSpeedVideoFpsRanges.second).build());
    }

    static android.util.Pair<android.content.ClipData, android.content.ClipData> getHighSpeedVideoFpsRanges(android.content.ClipData clipData, androidx.core.util.Predicate<android.content.ClipData.Item> predicate) {
        java.util.ArrayList arrayList = null;
        java.util.ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            android.content.ClipData.Item itemAt = clipData.getItemAt(i);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return android.util.Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return android.util.Pair.create(clipData, null);
        }
        return android.util.Pair.create(getHighResolutionOutputSizeshNQ4ISI(clipData.getDescription(), arrayList), getHighResolutionOutputSizeshNQ4ISI(clipData.getDescription(), arrayList2));
    }

    static android.content.ClipData getHighResolutionOutputSizeshNQ4ISI(android.content.ClipDescription clipDescription, java.util.List<android.content.ClipData.Item> list) {
        android.content.ClipData clipData = new android.content.ClipData(new android.content.ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    public static android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> partition(android.view.ContentInfo contentInfo, java.util.function.Predicate<android.content.ClipData.Item> predicate) {
        return androidx.core.view.ContentInfoCompat.Api31Impl.ca_(contentInfo, predicate);
    }

    /* loaded from: classes7.dex */
    static final class Api31Impl {
        private Api31Impl() {
        }

        public static android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> ca_(android.view.ContentInfo contentInfo, final java.util.function.Predicate<android.content.ClipData.Item> predicate) {
            android.content.ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                android.view.ContentInfo contentInfo2 = test ? contentInfo : null;
                if (test) {
                    contentInfo = null;
                }
                return android.util.Pair.create(contentInfo2, contentInfo);
            }
            java.util.Objects.requireNonNull(predicate);
            android.util.Pair<android.content.ClipData, android.content.ClipData> highSpeedVideoFpsRanges = androidx.core.view.ContentInfoCompat.getHighSpeedVideoFpsRanges(clip, new androidx.core.util.Predicate() { // from class: androidx.core.view.ContentInfoCompat$Api31Impl$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return predicate.test((android.content.ClipData.Item) obj);
                }
            });
            if (highSpeedVideoFpsRanges.first == null) {
                return android.util.Pair.create(null, contentInfo);
            }
            if (highSpeedVideoFpsRanges.second == null) {
                return android.util.Pair.create(contentInfo, null);
            }
            return android.util.Pair.create(new android.view.ContentInfo.Builder(contentInfo).setClip((android.content.ClipData) highSpeedVideoFpsRanges.first).build(), new android.view.ContentInfo.Builder(contentInfo).setClip((android.content.ClipData) highSpeedVideoFpsRanges.second).build());
        }
    }

    static final class CompatImpl implements androidx.core.view.ContentInfoCompat.Compat {
        private final int Camera2StreamConfigurationMap;
        private final android.os.Bundle getHighResolutionOutputSizeshNQ4ISI;
        private final android.content.ClipData getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final android.net.Uri getHighSpeedVideoSizes;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final android.view.ContentInfo cd_() {
            return null;
        }

        CompatImpl(androidx.core.view.ContentInfoCompat.BuilderCompatImpl builderCompatImpl) {
            this.getHighSpeedVideoFpsRanges = (android.content.ClipData) androidx.core.util.Preconditions.checkNotNull(builderCompatImpl.getHighSpeedVideoFpsRangesFor);
            this.Camera2StreamConfigurationMap = androidx.core.util.Preconditions.checkArgumentInRange(builderCompatImpl.getHighSpeedVideoSizes, 0, 5, "source");
            this.getHighSpeedVideoFpsRangesFor = androidx.core.util.Preconditions.checkFlagsArgument(builderCompatImpl.Camera2StreamConfigurationMap, 1);
            this.getHighSpeedVideoSizes = builderCompatImpl.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = builderCompatImpl.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final android.content.ClipData getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int getHighResolutionOutputSizeshNQ4ISI() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final android.net.Uri getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final android.os.Bundle getHighSpeedVideoSizes() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String toString() {
            java.lang.String obj;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.getHighSpeedVideoFpsRanges.getDescription());
            sb.append(", source=");
            sb.append(androidx.core.view.ContentInfoCompat.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap));
            sb.append(", flags=");
            sb.append(androidx.core.view.ContentInfoCompat.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor));
            if (this.getHighSpeedVideoSizes == null) {
                obj = "";
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(", hasLinkUri(");
                sb2.append(this.getHighSpeedVideoSizes.toString().length());
                sb2.append(")");
                obj = sb2.toString();
            }
            sb.append(obj);
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    static final class Compat31Impl implements androidx.core.view.ContentInfoCompat.Compat {
        private final android.view.ContentInfo getHighSpeedVideoSizes;

        Compat31Impl(android.view.ContentInfo contentInfo) {
            this.getHighSpeedVideoSizes = (android.view.ContentInfo) androidx.core.util.Preconditions.checkNotNull(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final android.view.ContentInfo cd_() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final android.content.ClipData getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizes.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoSizes.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoSizes.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final android.net.Uri getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoSizes.getLinkUri();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final android.os.Bundle getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes.getExtras();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentInfoCompat{");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class Builder {
        private final androidx.core.view.ContentInfoCompat.BuilderCompat getHighSpeedVideoFpsRanges;

        public Builder(androidx.core.view.ContentInfoCompat contentInfoCompat) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.ContentInfoCompat.BuilderCompat31Impl(contentInfoCompat);
            } else {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.ContentInfoCompat.BuilderCompatImpl(contentInfoCompat);
            }
        }

        public Builder(android.content.ClipData clipData, int i) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.ContentInfoCompat.BuilderCompat31Impl(clipData, i);
            } else {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.ContentInfoCompat.BuilderCompatImpl(clipData, i);
            }
        }

        public final androidx.core.view.ContentInfoCompat.Builder setClip(android.content.ClipData clipData) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(clipData);
            return this;
        }

        public final androidx.core.view.ContentInfoCompat.Builder setSource(int i) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(i);
            return this;
        }

        public final androidx.core.view.ContentInfoCompat.Builder setFlags(int i) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(i);
            return this;
        }

        public final androidx.core.view.ContentInfoCompat.Builder setLinkUri(android.net.Uri uri) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(uri);
            return this;
        }

        public final androidx.core.view.ContentInfoCompat.Builder setExtras(android.os.Bundle bundle) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(bundle);
            return this;
        }

        public final androidx.core.view.ContentInfoCompat build() {
            return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
        }
    }

    static final class BuilderCompatImpl implements androidx.core.view.ContentInfoCompat.BuilderCompat {
        int Camera2StreamConfigurationMap;
        android.os.Bundle getHighResolutionOutputSizeshNQ4ISI;
        android.net.Uri getHighSpeedVideoFpsRanges;
        android.content.ClipData getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        BuilderCompatImpl(android.content.ClipData clipData, int i) {
            this.getHighSpeedVideoFpsRangesFor = clipData;
            this.getHighSpeedVideoSizes = i;
        }

        BuilderCompatImpl(androidx.core.view.ContentInfoCompat contentInfoCompat) {
            this.getHighSpeedVideoFpsRangesFor = contentInfoCompat.getClip();
            this.getHighSpeedVideoSizes = contentInfoCompat.getSource();
            this.Camera2StreamConfigurationMap = contentInfoCompat.getFlags();
            this.getHighSpeedVideoFpsRanges = contentInfoCompat.getLinkUri();
            this.getHighResolutionOutputSizeshNQ4ISI = contentInfoCompat.getExtras();
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighSpeedVideoFpsRangesFor(android.content.ClipData clipData) {
            this.getHighSpeedVideoFpsRangesFor = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighSpeedVideoSizes(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighResolutionOutputSizeshNQ4ISI(android.net.Uri uri) {
            this.getHighSpeedVideoFpsRanges = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighSpeedVideoSizes(android.os.Bundle bundle) {
            this.getHighResolutionOutputSizeshNQ4ISI = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final androidx.core.view.ContentInfoCompat Camera2StreamConfigurationMap() {
            return new androidx.core.view.ContentInfoCompat(new androidx.core.view.ContentInfoCompat.CompatImpl(this));
        }
    }

    static final class BuilderCompat31Impl implements androidx.core.view.ContentInfoCompat.BuilderCompat {
        private final android.view.ContentInfo.Builder getHighSpeedVideoSizes;

        BuilderCompat31Impl(android.content.ClipData clipData, int i) {
            this.getHighSpeedVideoSizes = new android.view.ContentInfo.Builder(clipData, i);
        }

        BuilderCompat31Impl(androidx.core.view.ContentInfoCompat contentInfoCompat) {
            this.getHighSpeedVideoSizes = new android.view.ContentInfo.Builder(contentInfoCompat.toContentInfo());
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighSpeedVideoFpsRangesFor(android.content.ClipData clipData) {
            this.getHighSpeedVideoSizes.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            this.getHighSpeedVideoSizes.setSource(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighSpeedVideoSizes(int i) {
            this.getHighSpeedVideoSizes.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighResolutionOutputSizeshNQ4ISI(android.net.Uri uri) {
            this.getHighSpeedVideoSizes.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void getHighSpeedVideoSizes(android.os.Bundle bundle) {
            this.getHighSpeedVideoSizes.setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final androidx.core.view.ContentInfoCompat Camera2StreamConfigurationMap() {
            return new androidx.core.view.ContentInfoCompat(new androidx.core.view.ContentInfoCompat.Compat31Impl(this.getHighSpeedVideoSizes.build()));
        }
    }
}
