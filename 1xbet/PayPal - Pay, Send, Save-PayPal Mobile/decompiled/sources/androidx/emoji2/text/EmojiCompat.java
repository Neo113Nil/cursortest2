package androidx.emoji2.text;

/* loaded from: classes3.dex */
public class EmojiCompat {
    public static final java.lang.String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final java.lang.String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;
    private static volatile boolean getInputSizeshNQ4ISI;
    private static volatile androidx.emoji2.text.EmojiCompat getOutputFormats;
    final int[] Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizesFor;
    private final int getOutputMinFrameDuration;
    private final java.util.Set<androidx.emoji2.text.EmojiCompat.InitCallback> getOutputMinFrameDurationlomOqCM;
    private final androidx.emoji2.text.EmojiCompat.GlyphChecker getOutputSizeshNQ4ISI;
    private final androidx.emoji2.text.EmojiCompat.CompatInternal getOutputStallDuration;
    private final int getValidOutputFormatsForInputhNQ4ISI;
    private final androidx.emoji2.text.EmojiCompat.SpanFactory isOutputSupportedForhNQ4ISI;
    private static final java.lang.Object getInputFormats = new java.lang.Object();
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    private final java.util.concurrent.locks.ReadWriteLock getOutputStallDurationlomOqCM = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private volatile int getOutputSizes = 3;
    private final android.os.Handler unwrapAs = new android.os.Handler(android.os.Looper.getMainLooper());

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    /* loaded from: classes7.dex */
    public interface GlyphChecker {
        boolean hasGlyph(java.lang.CharSequence charSequence, int i, int i2, int i3);
    }

    public static abstract class InitCallback {
        public void onFailed(java.lang.Throwable th) {
        }

        public void onInitialized() {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    /* loaded from: classes7.dex */
    public interface MetadataRepoLoader {
        void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    /* loaded from: classes7.dex */
    public static abstract class MetadataRepoLoaderCallback {
        public abstract void onFailed(java.lang.Throwable th);

        public abstract void onLoaded(androidx.emoji2.text.MetadataRepo metadataRepo);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    /* loaded from: classes7.dex */
    public interface SpanFactory {
        androidx.emoji2.text.EmojiSpan createSpan(androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    private EmojiCompat(androidx.emoji2.text.EmojiCompat.Config config) {
        this.getHighSpeedVideoFpsRangesFor = config.getOutputMinFrameDuration;
        this.getHighResolutionOutputSizeshNQ4ISI = config.getInputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = config.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = config.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = config.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = config.getOutputFormats;
        this.getValidOutputFormatsForInputhNQ4ISI = config.getInputFormats;
        this.getOutputSizeshNQ4ISI = config.getHighSpeedVideoSizes;
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet();
        this.getOutputMinFrameDurationlomOqCM = arraySet;
        androidx.emoji2.text.EmojiCompat.SpanFactory spanFactory = config.getHighSpeedVideoSizesFor;
        this.isOutputSupportedForhNQ4ISI = spanFactory == null ? new androidx.emoji2.text.EmojiCompat.DefaultSpanFactory() : spanFactory;
        if (config.getHighSpeedVideoFpsRangesFor != null && !config.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            arraySet.addAll(config.getHighSpeedVideoFpsRangesFor);
        }
        this.getOutputStallDuration = new androidx.emoji2.text.EmojiCompat.CompatInternal19(this);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public static androidx.emoji2.text.EmojiCompat init(android.content.Context context) {
        return init(context, null);
    }

    public static androidx.emoji2.text.EmojiCompat init(android.content.Context context, androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory) {
        androidx.emoji2.text.EmojiCompat emojiCompat;
        if (getInputSizeshNQ4ISI) {
            return getOutputFormats;
        }
        if (defaultEmojiCompatConfigFactory == null) {
            defaultEmojiCompatConfigFactory = new androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
        }
        androidx.emoji2.text.EmojiCompat.Config create = defaultEmojiCompatConfigFactory.create(context);
        synchronized (getHighSpeedVideoSizes) {
            if (!getInputSizeshNQ4ISI) {
                if (create != null) {
                    init(create);
                }
                getInputSizeshNQ4ISI = true;
            }
            emojiCompat = getOutputFormats;
        }
        return emojiCompat;
    }

    public static androidx.emoji2.text.EmojiCompat init(androidx.emoji2.text.EmojiCompat.Config config) {
        androidx.emoji2.text.EmojiCompat emojiCompat;
        androidx.emoji2.text.EmojiCompat emojiCompat2 = getOutputFormats;
        if (emojiCompat2 != null) {
            return emojiCompat2;
        }
        synchronized (getInputFormats) {
            emojiCompat = getOutputFormats;
            if (emojiCompat == null) {
                emojiCompat = new androidx.emoji2.text.EmojiCompat(config);
                getOutputFormats = emojiCompat;
            }
        }
        return emojiCompat;
    }

    public static boolean isConfigured() {
        return getOutputFormats != null;
    }

    public static androidx.emoji2.text.EmojiCompat reset(androidx.emoji2.text.EmojiCompat.Config config) {
        androidx.emoji2.text.EmojiCompat emojiCompat;
        synchronized (getInputFormats) {
            emojiCompat = new androidx.emoji2.text.EmojiCompat(config);
            getOutputFormats = emojiCompat;
        }
        return emojiCompat;
    }

    public static androidx.emoji2.text.EmojiCompat reset(androidx.emoji2.text.EmojiCompat emojiCompat) {
        androidx.emoji2.text.EmojiCompat emojiCompat2;
        synchronized (getInputFormats) {
            getOutputFormats = emojiCompat;
            emojiCompat2 = getOutputFormats;
        }
        return emojiCompat2;
    }

    public static void skipDefaultConfigurationLookup(boolean z) {
        synchronized (getHighSpeedVideoSizes) {
            getInputSizeshNQ4ISI = z;
        }
    }

    public static androidx.emoji2.text.EmojiCompat get() {
        androidx.emoji2.text.EmojiCompat emojiCompat;
        synchronized (getInputFormats) {
            emojiCompat = getOutputFormats;
            androidx.core.util.Preconditions.checkState(emojiCompat != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    public void load() {
        androidx.core.util.Preconditions.checkState(this.getValidOutputFormatsForInputhNQ4ISI == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (getHighSpeedVideoFpsRanges()) {
            return;
        }
        this.getOutputStallDurationlomOqCM.writeLock().lock();
        try {
            if (this.getOutputSizes == 0) {
                return;
            }
            this.getOutputSizes = 0;
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
            this.getOutputStallDuration.Camera2StreamConfigurationMap();
        } finally {
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        this.getOutputStallDurationlomOqCM.writeLock().lock();
        try {
            if (this.getValidOutputFormatsForInputhNQ4ISI == 0) {
                this.getOutputSizes = 0;
            }
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
            if (getLoadState() == 0) {
                this.getOutputStallDuration.Camera2StreamConfigurationMap();
            }
        } catch (java.lang.Throwable th) {
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
            throw th;
        }
    }

    void getHighSpeedVideoSizes() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getOutputStallDurationlomOqCM.writeLock().lock();
        try {
            this.getOutputSizes = 1;
            arrayList.addAll(this.getOutputMinFrameDurationlomOqCM);
            this.getOutputMinFrameDurationlomOqCM.clear();
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
            this.unwrapAs.post(new androidx.emoji2.text.EmojiCompat.ListenerDispatcher(arrayList, this.getOutputSizes));
        } catch (java.lang.Throwable th) {
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
            throw th;
        }
    }

    void getHighSpeedVideoSizes(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getOutputStallDurationlomOqCM.writeLock().lock();
        try {
            this.getOutputSizes = 2;
            arrayList.addAll(this.getOutputMinFrameDurationlomOqCM);
            this.getOutputMinFrameDurationlomOqCM.clear();
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
            this.unwrapAs.post(new androidx.emoji2.text.EmojiCompat.ListenerDispatcher(arrayList, this.getOutputSizes, th));
        } catch (java.lang.Throwable th2) {
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
            throw th2;
        }
    }

    public void registerInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback initCallback) {
        androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.getOutputStallDurationlomOqCM.writeLock().lock();
        try {
            if (this.getOutputSizes != 1 && this.getOutputSizes != 2) {
                this.getOutputMinFrameDurationlomOqCM.add(initCallback);
            }
            this.unwrapAs.post(new androidx.emoji2.text.EmojiCompat.ListenerDispatcher(initCallback, this.getOutputSizes));
        } finally {
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
        }
    }

    public void unregisterInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback initCallback) {
        androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.getOutputStallDurationlomOqCM.writeLock().lock();
        try {
            this.getOutputMinFrameDurationlomOqCM.remove(initCallback);
        } finally {
            this.getOutputStallDurationlomOqCM.writeLock().unlock();
        }
    }

    public int getLoadState() {
        this.getOutputStallDurationlomOqCM.readLock().lock();
        try {
            return this.getOutputSizes;
        } finally {
            this.getOutputStallDurationlomOqCM.readLock().unlock();
        }
    }

    private boolean getHighSpeedVideoFpsRanges() {
        return getLoadState() == 1;
    }

    public boolean isEmojiSpanIndicatorEnabled() {
        return this.getHighSpeedVideoSizesFor;
    }

    public int getEmojiSpanIndicatorColor() {
        return this.getOutputMinFrameDuration;
    }

    public int getEmojiStart(java.lang.CharSequence charSequence, int i) {
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges(), "Not initialized yet");
        androidx.core.util.Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(charSequence, i);
    }

    public int getEmojiEnd(java.lang.CharSequence charSequence, int i) {
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges(), "Not initialized yet");
        androidx.core.util.Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.getOutputStallDuration.Camera2StreamConfigurationMap(charSequence, i);
    }

    public static boolean handleOnKeyDown(android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return androidx.emoji2.text.EmojiProcessor.getHighSpeedVideoSizes(editable, i, keyEvent);
    }

    public static boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
        return androidx.emoji2.text.EmojiProcessor.getHighSpeedVideoSizes(inputConnection, editable, i, i2, z);
    }

    @java.lang.Deprecated
    public boolean hasEmojiGlyph(java.lang.CharSequence charSequence) {
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges(), "Not initialized yet");
        androidx.core.util.Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(charSequence);
    }

    @java.lang.Deprecated
    public boolean hasEmojiGlyph(java.lang.CharSequence charSequence, int i) {
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges(), "Not initialized yet");
        androidx.core.util.Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.getOutputStallDuration.getHighSpeedVideoSizes(charSequence, i);
    }

    public int getEmojiMatch(java.lang.CharSequence charSequence, int i) {
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges(), "Not initialized yet");
        androidx.core.util.Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.getOutputStallDuration.getHighSpeedVideoFpsRanges(charSequence, i);
    }

    public java.lang.CharSequence process(java.lang.CharSequence charSequence) {
        return process(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2) {
        return process(charSequence, i, i2, Integer.MAX_VALUE);
    }

    public java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        return process(charSequence, i, i2, i3, 0);
    }

    public java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges(), "Not initialized yet");
        androidx.core.util.Preconditions.checkArgumentNonnegative(i, "start cannot be negative");
        androidx.core.util.Preconditions.checkArgumentNonnegative(i2, "end cannot be negative");
        androidx.core.util.Preconditions.checkArgumentNonnegative(i3, "maxEmojiCount cannot be negative");
        androidx.core.util.Preconditions.checkArgument(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.Preconditions.checkArgument(i <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.Preconditions.checkArgument(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.getHighSpeedVideoFpsRangesFor : false;
        } else {
            z = true;
        }
        return this.getOutputStallDuration.Camera2StreamConfigurationMap(charSequence, i, i2, i3, z);
    }

    public java.lang.String getAssetSignature() {
        androidx.core.util.Preconditions.checkState(getHighSpeedVideoFpsRanges(), "Not initialized yet");
        return this.getOutputStallDuration.getHighSpeedVideoSizes();
    }

    public void updateEditorInfo(android.view.inputmethod.EditorInfo editorInfo) {
        if (!getHighSpeedVideoFpsRanges() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        this.getOutputStallDuration.getHighSpeedVideoFpsRanges(editorInfo);
    }

    /* loaded from: classes7.dex */
    public static class DefaultSpanFactory implements androidx.emoji2.text.EmojiCompat.SpanFactory {
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public androidx.emoji2.text.EmojiSpan createSpan(androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new androidx.emoji2.text.TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class Config {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        int[] getHighSpeedVideoFpsRanges;
        java.util.Set<androidx.emoji2.text.EmojiCompat.InitCallback> getHighSpeedVideoFpsRangesFor;
        androidx.emoji2.text.EmojiCompat.SpanFactory getHighSpeedVideoSizesFor;
        boolean getInputSizeshNQ4ISI;
        final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader getOutputFormats;
        boolean getOutputMinFrameDuration;
        int Camera2StreamConfigurationMap = -16711936;
        int getInputFormats = 0;
        androidx.emoji2.text.EmojiCompat.GlyphChecker getHighSpeedVideoSizes = new androidx.emoji2.text.DefaultGlyphChecker();

        protected Config(androidx.emoji2.text.EmojiCompat.MetadataRepoLoader metadataRepoLoader) {
            androidx.core.util.Preconditions.checkNotNull(metadataRepoLoader, "metadataLoader cannot be null.");
            this.getOutputFormats = metadataRepoLoader;
        }

        public androidx.emoji2.text.EmojiCompat.Config registerInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback initCallback) {
            androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new androidx.collection.ArraySet();
            }
            this.getHighSpeedVideoFpsRangesFor.add(initCallback);
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config unregisterInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback initCallback) {
            androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            java.util.Set<androidx.emoji2.text.EmojiCompat.InitCallback> set = this.getHighSpeedVideoFpsRangesFor;
            if (set != null) {
                set.remove(initCallback);
            }
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setReplaceAll(boolean z) {
            this.getOutputMinFrameDuration = z;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setUseEmojiAsDefaultStyle(boolean z) {
            return setUseEmojiAsDefaultStyle(z, null);
        }

        public androidx.emoji2.text.EmojiCompat.Config setUseEmojiAsDefaultStyle(boolean z, java.util.List<java.lang.Integer> list) {
            this.getInputSizeshNQ4ISI = z;
            if (z && list != null) {
                this.getHighSpeedVideoFpsRanges = new int[list.size()];
                java.util.Iterator<java.lang.Integer> it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    this.getHighSpeedVideoFpsRanges[i] = it.next().intValue();
                    i++;
                }
                java.util.Arrays.sort(this.getHighSpeedVideoFpsRanges);
                return this;
            }
            this.getHighSpeedVideoFpsRanges = null;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setEmojiSpanIndicatorEnabled(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setEmojiSpanIndicatorColor(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setMetadataLoadStrategy(int i) {
            this.getInputFormats = i;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setSpanFactory(androidx.emoji2.text.EmojiCompat.SpanFactory spanFactory) {
            this.getHighSpeedVideoSizesFor = spanFactory;
            return this;
        }

        public androidx.emoji2.text.EmojiCompat.Config setGlyphChecker(androidx.emoji2.text.EmojiCompat.GlyphChecker glyphChecker) {
            androidx.core.util.Preconditions.checkNotNull(glyphChecker, "GlyphChecker cannot be null");
            this.getHighSpeedVideoSizes = glyphChecker;
            return this;
        }

        protected final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader getMetadataRepoLoader() {
            return this.getOutputFormats;
        }
    }

    static class ListenerDispatcher implements java.lang.Runnable {
        private final java.lang.Throwable Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<androidx.emoji2.text.EmojiCompat.InitCallback> getHighSpeedVideoFpsRangesFor;

        ListenerDispatcher(androidx.emoji2.text.EmojiCompat.InitCallback initCallback, int i) {
            this(java.util.Arrays.asList((androidx.emoji2.text.EmojiCompat.InitCallback) androidx.core.util.Preconditions.checkNotNull(initCallback, "initCallback cannot be null")), i, null);
        }

        ListenerDispatcher(java.util.Collection<androidx.emoji2.text.EmojiCompat.InitCallback> collection, int i) {
            this(collection, i, null);
        }

        ListenerDispatcher(java.util.Collection<androidx.emoji2.text.EmojiCompat.InitCallback> collection, int i, java.lang.Throwable th) {
            androidx.core.util.Preconditions.checkNotNull(collection, "initCallbacks cannot be null");
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(collection);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.Camera2StreamConfigurationMap = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.getHighSpeedVideoFpsRangesFor.size();
            int i = 0;
            if (this.getHighResolutionOutputSizeshNQ4ISI != 1) {
                while (i < size) {
                    this.getHighSpeedVideoFpsRangesFor.get(i).onFailed(this.Camera2StreamConfigurationMap);
                    i++;
                }
            } else {
                while (i < size) {
                    this.getHighSpeedVideoFpsRangesFor.get(i).onInitialized();
                    i++;
                }
            }
        }
    }

    static class CompatInternal {
        final androidx.emoji2.text.EmojiCompat getHighSpeedVideoFpsRangesFor;

        int Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i) {
            return -1;
        }

        java.lang.CharSequence Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
            return false;
        }

        public int getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i) {
            return 0;
        }

        void getHighSpeedVideoFpsRanges(android.view.inputmethod.EditorInfo editorInfo) {
        }

        int getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence, int i) {
            return -1;
        }

        boolean getHighSpeedVideoSizes(java.lang.CharSequence charSequence, int i) {
            return false;
        }

        CompatInternal(androidx.emoji2.text.EmojiCompat emojiCompat) {
            this.getHighSpeedVideoFpsRangesFor = emojiCompat;
        }

        void Camera2StreamConfigurationMap() {
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
        }

        java.lang.String getHighSpeedVideoSizes() {
            return "";
        }
    }

    /* loaded from: classes7.dex */
    static final class CompatInternal19 extends androidx.emoji2.text.EmojiCompat.CompatInternal {
        private volatile androidx.emoji2.text.MetadataRepo getHighResolutionOutputSizeshNQ4ISI;
        private volatile androidx.emoji2.text.EmojiProcessor getHighSpeedVideoFpsRanges;

        CompatInternal19(androidx.emoji2.text.EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        final void Camera2StreamConfigurationMap() {
            try {
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges.load(new androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompat.CompatInternal19.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onLoaded(androidx.emoji2.text.MetadataRepo metadataRepo) {
                        androidx.emoji2.text.EmojiCompat.CompatInternal19.this.getHighSpeedVideoFpsRangesFor(metadataRepo);
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onFailed(java.lang.Throwable th) {
                        androidx.emoji2.text.EmojiCompat.CompatInternal19.this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(th);
                    }
                });
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(th);
            }
        }

        final void getHighSpeedVideoFpsRangesFor(androidx.emoji2.text.MetadataRepo metadataRepo) {
            if (metadataRepo == null) {
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(new java.lang.IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = metadataRepo;
            this.getHighSpeedVideoFpsRanges = new androidx.emoji2.text.EmojiProcessor(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap, androidx.emoji2.text.EmojiExclusions.getHighSpeedVideoFpsRanges());
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
            androidx.emoji2.text.EmojiProcessor emojiProcessor = this.getHighSpeedVideoFpsRanges;
            return emojiProcessor.Camera2StreamConfigurationMap(charSequence, emojiProcessor.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.version()) == 1;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        final boolean getHighSpeedVideoSizes(java.lang.CharSequence charSequence, int i) {
            return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(charSequence, i) == 1;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        public final int getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i) {
            return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(charSequence, i);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        final int getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence, int i) {
            androidx.emoji2.text.EmojiProcessor emojiProcessor = this.getHighSpeedVideoFpsRanges;
            if (i < 0 || i >= charSequence.length()) {
                return -1;
            }
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                androidx.emoji2.text.EmojiSpan[] emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) spanned.getSpans(i, i + 1, androidx.emoji2.text.EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanStart(emojiSpanArr[0]);
                }
            }
            return ((androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback) emojiProcessor.getHighResolutionOutputSizeshNQ4ISI(charSequence, java.lang.Math.max(0, i - 16), java.lang.Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback(i))).getHighSpeedVideoSizes;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        final int Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i) {
            androidx.emoji2.text.EmojiProcessor emojiProcessor = this.getHighSpeedVideoFpsRanges;
            if (i < 0 || i >= charSequence.length()) {
                return -1;
            }
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                androidx.emoji2.text.EmojiSpan[] emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) spanned.getSpans(i, i + 1, androidx.emoji2.text.EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanEnd(emojiSpanArr[0]);
                }
            }
            return ((androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback) emojiProcessor.getHighResolutionOutputSizeshNQ4ISI(charSequence, java.lang.Math.max(0, i - 16), java.lang.Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback(i))).getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        final java.lang.CharSequence Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        final void getHighSpeedVideoFpsRanges(android.view.inputmethod.EditorInfo editorInfo) {
            editorInfo.extras.putInt(androidx.emoji2.text.EmojiCompat.EDITOR_INFO_METAVERSION_KEY, this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.version());
            editorInfo.extras.putBoolean(androidx.emoji2.text.EmojiCompat.EDITOR_INFO_REPLACE_ALL_KEY, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        final java.lang.String getHighSpeedVideoSizes() {
            java.lang.String sourceSha = this.getHighResolutionOutputSizeshNQ4ISI.getMetadataList().sourceSha();
            return sourceSha == null ? "" : sourceSha;
        }
    }
}
