package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes9.dex */
public final class MetadataSourceImpl implements com.google.i18n.phonenumbers.metadata.source.MetadataSource {
    private final com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard<com.google.i18n.phonenumbers.metadata.source.CompositeMetadataContainer> bootstrappingGuard;
    private final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider;

    public MetadataSourceImpl(com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard<com.google.i18n.phonenumbers.metadata.source.CompositeMetadataContainer> metadataBootstrappingGuard) {
        this.phoneMetadataFileNameProvider = phoneMetadataFileNameProvider;
        this.bootstrappingGuard = metadataBootstrappingGuard;
    }

    public MetadataSourceImpl(com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, com.google.i18n.phonenumbers.MetadataLoader metadataLoader, com.google.i18n.phonenumbers.metadata.init.MetadataParser metadataParser) {
        this(phoneMetadataFileNameProvider, new com.google.i18n.phonenumbers.metadata.source.BlockingMetadataBootstrappingGuard(metadataLoader, metadataParser, new com.google.i18n.phonenumbers.metadata.source.CompositeMetadataContainer()));
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.NonGeographicalEntityMetadataSource
    public final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i) {
        if (com.google.i18n.phonenumbers.internal.GeoEntityUtility.isGeoEntity(i)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(" calling code belongs to a geo entity");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return this.bootstrappingGuard.getOrBootstrap(this.phoneMetadataFileNameProvider.getFor(java.lang.Integer.valueOf(i))).getMetadataBy(i);
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
