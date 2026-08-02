package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes9.dex */
final class CompositeMetadataContainer implements com.google.i18n.phonenumbers.metadata.source.MetadataContainer {
    private final com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.Integer> metadataByCountryCode = com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.byCountryCallingCode();
    private final com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.String> metadataByRegionCode = com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.byRegionCode();

    CompositeMetadataContainer() {
    }

    final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataBy(java.lang.String str) {
        return this.metadataByRegionCode.getMetadataBy(str);
    }

    final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataBy(int i) {
        return this.metadataByCountryCode.getMetadataBy(java.lang.Integer.valueOf(i));
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MetadataContainer
    public final void accept(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata) {
        if (com.google.i18n.phonenumbers.internal.GeoEntityUtility.isGeoEntity(this.metadataByRegionCode.getKeyProvider().getKeyOf(phoneMetadata))) {
            this.metadataByRegionCode.accept(phoneMetadata);
        } else {
            this.metadataByCountryCode.accept(phoneMetadata);
        }
    }
}
