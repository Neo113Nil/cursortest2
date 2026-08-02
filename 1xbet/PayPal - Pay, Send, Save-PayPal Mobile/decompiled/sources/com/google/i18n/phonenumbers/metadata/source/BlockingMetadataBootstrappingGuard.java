package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes9.dex */
final class BlockingMetadataBootstrappingGuard<T extends com.google.i18n.phonenumbers.metadata.source.MetadataContainer> implements com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard<T> {
    private final java.util.Map<java.lang.String, java.lang.String> loadedFiles = new java.util.concurrent.ConcurrentHashMap();
    private final T metadataContainer;
    private final com.google.i18n.phonenumbers.MetadataLoader metadataLoader;
    private final com.google.i18n.phonenumbers.metadata.init.MetadataParser metadataParser;

    BlockingMetadataBootstrappingGuard(com.google.i18n.phonenumbers.MetadataLoader metadataLoader, com.google.i18n.phonenumbers.metadata.init.MetadataParser metadataParser, T t) {
        this.metadataLoader = metadataLoader;
        this.metadataParser = metadataParser;
        this.metadataContainer = t;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard
    public final T getOrBootstrap(java.lang.String str) {
        if (!this.loadedFiles.containsKey(str)) {
            bootstrapMetadata(str);
        }
        return this.metadataContainer;
    }

    private void bootstrapMetadata(java.lang.String str) {
        synchronized (this) {
            if (this.loadedFiles.containsKey(str)) {
                return;
            }
            java.util.Iterator<com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata> it = read(str).iterator();
            while (it.hasNext()) {
                this.metadataContainer.accept(it.next());
            }
            this.loadedFiles.put(str, str);
        }
    }

    private java.util.Collection<com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata> read(java.lang.String str) {
        try {
            return this.metadataParser.parse(this.metadataLoader.loadMetadata(str));
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e) {
            throw new java.lang.IllegalStateException("Failed to read file ".concat(java.lang.String.valueOf(str)), e);
        }
    }
}
