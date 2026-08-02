package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes9.dex */
public final class SingleFileModeFileNameProvider implements com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider {
    private final java.lang.String phoneMetadataFileName;

    public SingleFileModeFileNameProvider(java.lang.String str) {
        this.phoneMetadataFileName = str;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider
    public final java.lang.String getFor(java.lang.Object obj) {
        return this.phoneMetadataFileName;
    }
}
