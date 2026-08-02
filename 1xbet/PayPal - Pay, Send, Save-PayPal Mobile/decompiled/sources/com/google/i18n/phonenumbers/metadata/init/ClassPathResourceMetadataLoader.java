package com.google.i18n.phonenumbers.metadata.init;

/* loaded from: classes9.dex */
public final class ClassPathResourceMetadataLoader implements com.google.i18n.phonenumbers.MetadataLoader {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader.class.getName());

    @Override // com.google.i18n.phonenumbers.MetadataLoader
    public final java.io.InputStream loadMetadata(java.lang.String str) {
        java.io.InputStream resourceAsStream = com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            logger.log(java.util.logging.Level.WARNING, java.lang.String.format("File %s not found", str));
        }
        return resourceAsStream;
    }
}
