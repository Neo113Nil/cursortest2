package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes9.dex */
public final class FormattingMetadataSourceImpl implements com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSource {
    private final com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard<com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.Integer>> bootstrappingGuard;
    private final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider;

    public FormattingMetadataSourceImpl(com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard<com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer<java.lang.Integer>> metadataBootstrappingGuard) {
        this.phoneMetadataFileNameProvider = phoneMetadataFileNameProvider;
        this.bootstrappingGuard = metadataBootstrappingGuard;
    }

    public FormattingMetadataSourceImpl(com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, com.google.i18n.phonenumbers.MetadataLoader metadataLoader, com.google.i18n.phonenumbers.metadata.init.MetadataParser metadataParser) {
        this(phoneMetadataFileNameProvider, new com.google.i18n.phonenumbers.metadata.source.BlockingMetadataBootstrappingGuard(metadataLoader, metadataParser, com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.byCountryCallingCode()));
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSource
    public final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getFormattingMetadataForCountryCallingCode(int i) {
        return this.bootstrappingGuard.getOrBootstrap(this.phoneMetadataFileNameProvider.getFor(java.lang.Integer.valueOf(i))).getMetadataBy(java.lang.Integer.valueOf(i));
    }
}
