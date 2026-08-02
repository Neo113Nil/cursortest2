package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes9.dex */
final class MapBackedMetadataContainer<T> implements com.google.i18n.phonenumbers.metadata.source.MetadataContainer {
    private final com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider<T> keyProvider;
    private final java.util.concurrent.ConcurrentMap<T, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata> metadataMap = new java.util.concurrent.ConcurrentHashMap();

    interface KeyProvider<T> {
        T getKeyOf(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata);
    }

    static com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.String> byRegionCode() {
        return new com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<>(new com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider<java.lang.String>() { // from class: com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.1
            @Override // com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider
            public java.lang.String getKeyOf(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata) {
                return phoneMetadata.getId();
            }
        });
    }

    static com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.Integer> byCountryCallingCode() {
        return new com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<>(new com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider<java.lang.Integer>() { // from class: com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider
            public java.lang.Integer getKeyOf(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata) {
                return java.lang.Integer.valueOf(phoneMetadata.getCountryCode());
            }
        });
    }

    private MapBackedMetadataContainer(com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider<T> keyProvider) {
        this.keyProvider = keyProvider;
    }

    final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataBy(T t) {
        if (t != null) {
            return this.metadataMap.get(t);
        }
        return null;
    }

    final com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider<T> getKeyProvider() {
        return this.keyProvider;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MetadataContainer
    public final void accept(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata) {
        this.metadataMap.put(this.keyProvider.getKeyOf(phoneMetadata), phoneMetadata);
    }
}
