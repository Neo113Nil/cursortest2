package com.google.i18n.phonenumbers.metadata;

/* loaded from: classes9.dex */
public final class DefaultMetadataDependenciesProvider {
    private static final com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider INSTANCE = new com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider();
    private final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider alternateFormatsMetadataFileNameProvider;
    private final com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSource alternateFormatsMetadataSource;
    private final com.google.i18n.phonenumbers.MetadataLoader metadataLoader;
    private final com.google.i18n.phonenumbers.metadata.init.MetadataParser metadataParser;
    private final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider phoneNumberMetadataFileNameProvider;
    private final com.google.i18n.phonenumbers.metadata.source.MetadataSource phoneNumberMetadataSource;
    private final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider shortNumberMetadataFileNameProvider;
    private final com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource shortNumberMetadataSource;

    public static com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider getInstance() {
        return INSTANCE;
    }

    private DefaultMetadataDependenciesProvider() {
        com.google.i18n.phonenumbers.metadata.init.MetadataParser newLenientParser = com.google.i18n.phonenumbers.metadata.init.MetadataParser.newLenientParser();
        this.metadataParser = newLenientParser;
        com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader classPathResourceMetadataLoader = new com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader();
        this.metadataLoader = classPathResourceMetadataLoader;
        com.google.i18n.phonenumbers.metadata.source.MultiFileModeFileNameProvider multiFileModeFileNameProvider = new com.google.i18n.phonenumbers.metadata.source.MultiFileModeFileNameProvider("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto");
        this.phoneNumberMetadataFileNameProvider = multiFileModeFileNameProvider;
        this.phoneNumberMetadataSource = new com.google.i18n.phonenumbers.metadata.source.MetadataSourceImpl(multiFileModeFileNameProvider, classPathResourceMetadataLoader, newLenientParser);
        com.google.i18n.phonenumbers.metadata.source.MultiFileModeFileNameProvider multiFileModeFileNameProvider2 = new com.google.i18n.phonenumbers.metadata.source.MultiFileModeFileNameProvider("/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto");
        this.shortNumberMetadataFileNameProvider = multiFileModeFileNameProvider2;
        this.shortNumberMetadataSource = new com.google.i18n.phonenumbers.metadata.source.RegionMetadataSourceImpl(multiFileModeFileNameProvider2, classPathResourceMetadataLoader, newLenientParser);
        com.google.i18n.phonenumbers.metadata.source.MultiFileModeFileNameProvider multiFileModeFileNameProvider3 = new com.google.i18n.phonenumbers.metadata.source.MultiFileModeFileNameProvider("/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto");
        this.alternateFormatsMetadataFileNameProvider = multiFileModeFileNameProvider3;
        this.alternateFormatsMetadataSource = new com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSourceImpl(multiFileModeFileNameProvider3, classPathResourceMetadataLoader, newLenientParser);
    }

    public final com.google.i18n.phonenumbers.metadata.init.MetadataParser getMetadataParser() {
        return this.metadataParser;
    }

    public final com.google.i18n.phonenumbers.MetadataLoader getMetadataLoader() {
        return this.metadataLoader;
    }

    public final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider getPhoneNumberMetadataFileNameProvider() {
        return this.phoneNumberMetadataFileNameProvider;
    }

    public final com.google.i18n.phonenumbers.metadata.source.MetadataSource getPhoneNumberMetadataSource() {
        return this.phoneNumberMetadataSource;
    }

    public final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider getShortNumberMetadataFileNameProvider() {
        return this.shortNumberMetadataFileNameProvider;
    }

    public final com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource getShortNumberMetadataSource() {
        return this.shortNumberMetadataSource;
    }

    public final com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider getAlternateFormatsMetadataFileNameProvider() {
        return this.alternateFormatsMetadataFileNameProvider;
    }

    public final com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSource getAlternateFormatsMetadataSource() {
        return this.alternateFormatsMetadataSource;
    }

    public final java.lang.String getCarrierDataDirectory() {
        return "/com/google/i18n/phonenumbers/carrier/data/";
    }

    public final java.lang.String getGeocodingDataDirectory() {
        return "/com/google/i18n/phonenumbers/geocoding/data/";
    }
}
