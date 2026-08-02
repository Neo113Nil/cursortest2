package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes9.dex */
public final class RegionMetadataSourceImpl implements com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource {
    private final com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard<com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.String>> bootstrappingGuard;
    private final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider;

    public RegionMetadataSourceImpl(com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard<com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.String>> metadataBootstrappingGuard) {
        this.phoneMetadataFileNameProvider = phoneMetadataFileNameProvider;
        this.bootstrappingGuard = metadataBootstrappingGuard;
    }

    public RegionMetadataSourceImpl(com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, com.google.i18n.phonenumbers.MetadataLoader metadataLoader, com.google.i18n.phonenumbers.metadata.init.MetadataParser metadataParser) {
        this(phoneMetadataFileNameProvider, new com.google.i18n.phonenumbers.metadata.source.BlockingMetadataBootstrappingGuard(metadataLoader, metadataParser, com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.byRegionCode()));
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource
    public final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataForRegion(java.lang.String str) {
        if (!com.google.i18n.phonenumbers.internal.GeoEntityUtility.isGeoEntity(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" region code is a non-geo entity");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return this.bootstrappingGuard.getOrBootstrap(this.phoneMetadataFileNameProvider.getFor(str)).getMetadataBy(str);
    }
}
