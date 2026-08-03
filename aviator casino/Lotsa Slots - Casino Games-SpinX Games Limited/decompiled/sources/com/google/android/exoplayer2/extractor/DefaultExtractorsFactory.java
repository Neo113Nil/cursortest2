package com.google.android.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class DefaultExtractorsFactory implements com.google.android.exoplayer2.extractor.ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader FLAC_EXTENSION_LOADER = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader(new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier() { // from class: com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final java.lang.reflect.Constructor getConstructor() {
            java.lang.reflect.Constructor flacExtractorConstructor;
            flacExtractorConstructor = com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.getFlacExtractorConstructor();
            return flacExtractorConstructor;
        }
    });
    private static final com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader MIDI_EXTENSION_LOADER = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader(new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier() { // from class: com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda1
        @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final java.lang.reflect.Constructor getConstructor() {
            java.lang.reflect.Constructor midiExtractorConstructor;
            midiExtractorConstructor = com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.getMidiExtractorConstructor();
            return midiExtractorConstructor;
        }
    });
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingAlwaysEnabled;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private int tsMode = 1;
    private int tsTimestampSearchBytes = 112800;

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean z) {
        this.constantBitrateSeekingEnabled = z;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setConstantBitrateSeekingAlwaysEnabled(boolean z) {
        this.constantBitrateSeekingAlwaysEnabled = z;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setAdtsExtractorFlags(int i) {
        this.adtsFlags = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setAmrExtractorFlags(int i) {
        this.amrFlags = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setFlacExtractorFlags(int i) {
        this.flacFlags = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setMatroskaExtractorFlags(int i) {
        this.matroskaFlags = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setMp4ExtractorFlags(int i) {
        this.mp4Flags = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int i) {
        this.fragmentedMp4Flags = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setMp3ExtractorFlags(int i) {
        this.mp3Flags = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setTsExtractorMode(int i) {
        this.tsMode = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setTsExtractorFlags(int i) {
        this.tsFlags = i;
        return this;
    }

    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setTsExtractorTimestampSearchBytes(int i) {
        this.tsTimestampSearchBytes = i;
        return this;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized com.google.android.exoplayer2.extractor.Extractor[] createExtractors() {
        return createExtractors(android.net.Uri.EMPTY, new java.util.HashMap());
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.util.ArrayList arrayList;
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        arrayList = new java.util.ArrayList(iArr.length);
        int inferFileTypeFromResponseHeaders = com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromResponseHeaders(map);
        if (inferFileTypeFromResponseHeaders != -1) {
            addExtractorsForFileType(inferFileTypeFromResponseHeaders, arrayList);
        }
        int inferFileTypeFromUri = com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromUri(uri);
        if (inferFileTypeFromUri != -1 && inferFileTypeFromUri != inferFileTypeFromResponseHeaders) {
            addExtractorsForFileType(inferFileTypeFromUri, arrayList);
        }
        for (int i : iArr) {
            if (i != inferFileTypeFromResponseHeaders && i != inferFileTypeFromUri) {
                addExtractorsForFileType(i, arrayList);
            }
        }
        return (com.google.android.exoplayer2.extractor.Extractor[]) arrayList.toArray(new com.google.android.exoplayer2.extractor.Extractor[arrayList.size()]);
    }

    private void addExtractorsForFileType(int i, java.util.List<com.google.android.exoplayer2.extractor.Extractor> list) {
        switch (i) {
            case 0:
                list.add(new com.google.android.exoplayer2.extractor.ts.Ac3Extractor());
                break;
            case 1:
                list.add(new com.google.android.exoplayer2.extractor.ts.Ac4Extractor());
                break;
            case 2:
                list.add(new com.google.android.exoplayer2.extractor.ts.AdtsExtractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.adtsFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 3:
                list.add(new com.google.android.exoplayer2.extractor.amr.AmrExtractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.amrFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 4:
                com.google.android.exoplayer2.extractor.Extractor extractor = FLAC_EXTENSION_LOADER.getExtractor(java.lang.Integer.valueOf(this.flacFlags));
                if (extractor != null) {
                    list.add(extractor);
                    break;
                } else {
                    list.add(new com.google.android.exoplayer2.extractor.flac.FlacExtractor(this.flacFlags));
                    break;
                }
            case 5:
                list.add(new com.google.android.exoplayer2.extractor.flv.FlvExtractor());
                break;
            case 6:
                list.add(new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor(this.matroskaFlags));
                break;
            case 7:
                list.add(new com.google.android.exoplayer2.extractor.mp3.Mp3Extractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.mp3Flags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 8:
                list.add(new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor(this.fragmentedMp4Flags));
                list.add(new com.google.android.exoplayer2.extractor.mp4.Mp4Extractor(this.mp4Flags));
                break;
            case 9:
                list.add(new com.google.android.exoplayer2.extractor.ogg.OggExtractor());
                break;
            case 10:
                list.add(new com.google.android.exoplayer2.extractor.ts.PsExtractor());
                break;
            case 11:
                list.add(new com.google.android.exoplayer2.extractor.ts.TsExtractor(this.tsMode, this.tsFlags, this.tsTimestampSearchBytes));
                break;
            case 12:
                list.add(new com.google.android.exoplayer2.extractor.wav.WavExtractor());
                break;
            case 14:
                list.add(new com.google.android.exoplayer2.extractor.jpeg.JpegExtractor());
                break;
            case 15:
                com.google.android.exoplayer2.extractor.Extractor extractor2 = MIDI_EXTENSION_LOADER.getExtractor(new java.lang.Object[0]);
                if (extractor2 != null) {
                    list.add(extractor2);
                    break;
                }
                break;
            case 16:
                list.add(new com.google.android.exoplayer2.extractor.avi.AviExtractor());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> getMidiExtractorConstructor() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
        return java.lang.Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(com.google.android.exoplayer2.extractor.Extractor.class).getConstructor(new java.lang.Class[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> getFlacExtractorConstructor() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]))) {
            return java.lang.Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(com.google.android.exoplayer2.extractor.Extractor.class).getConstructor(java.lang.Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ExtensionLoader {
        private final com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier constructorSupplier;
        private final java.util.concurrent.atomic.AtomicBoolean extensionLoaded = new java.util.concurrent.atomic.AtomicBoolean(false);
        private java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> extractorConstructor;

        public interface ConstructorSupplier {
            java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> getConstructor() throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException;
        }

        public ExtensionLoader(com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier constructorSupplier) {
            this.constructorSupplier = constructorSupplier;
        }

        public com.google.android.exoplayer2.extractor.Extractor getExtractor(java.lang.Object... objArr) {
            java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> maybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (maybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return maybeLoadExtractorConstructor.newInstance(objArr);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        private java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> maybeLoadExtractorConstructor() {
            synchronized (this.extensionLoaded) {
                if (this.extensionLoaded.get()) {
                    return this.extractorConstructor;
                }
                try {
                    return this.constructorSupplier.getConstructor();
                } catch (java.lang.ClassNotFoundException unused) {
                    this.extensionLoaded.set(true);
                    return this.extractorConstructor;
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }
}
