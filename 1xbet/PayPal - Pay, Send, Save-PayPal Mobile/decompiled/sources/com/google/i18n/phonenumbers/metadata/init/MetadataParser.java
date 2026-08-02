package com.google.i18n.phonenumbers.metadata.init;

/* loaded from: classes9.dex */
public final class MetadataParser {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.i18n.phonenumbers.metadata.init.MetadataParser.class.getName());
    private final boolean strictMode;

    public static com.google.i18n.phonenumbers.metadata.init.MetadataParser newLenientParser() {
        return new com.google.i18n.phonenumbers.metadata.init.MetadataParser(false);
    }

    public static com.google.i18n.phonenumbers.metadata.init.MetadataParser newStrictParser() {
        return new com.google.i18n.phonenumbers.metadata.init.MetadataParser(true);
    }

    private MetadataParser(boolean z) {
        this.strictMode = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Collection<com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata> parse(java.io.InputStream inputStream) {
        java.io.ObjectInputStream objectInputStream;
        java.lang.Throwable th;
        if (inputStream == null) {
            return handleNullSource();
        }
        java.io.ObjectInputStream objectInputStream2 = null;
        try {
            objectInputStream = new java.io.ObjectInputStream(inputStream);
        } catch (java.io.IOException e) {
            e = e;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (objectInputStream2 != null) {
            }
            throw th;
        }
        try {
            com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection phoneMetadataCollection = new com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection();
            phoneMetadataCollection.readExternal(objectInputStream);
            if (phoneMetadataCollection.getMetadataList().isEmpty()) {
                throw new java.lang.IllegalStateException("Empty metadata");
            }
            java.util.List<com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata> metadataList = phoneMetadataCollection.getMetadataList();
            close(objectInputStream);
            return metadataList;
        } catch (java.io.IOException e2) {
            e = e2;
            objectInputStream2 = objectInputStream;
            try {
                throw new java.lang.IllegalStateException("Unable to parse metadata file", e);
            } catch (java.lang.Throwable th3) {
                objectInputStream = objectInputStream2;
                th = th3;
                java.io.ObjectInputStream objectInputStream3 = objectInputStream;
                th = th;
                objectInputStream2 = objectInputStream3;
                if (objectInputStream2 != null) {
                    close(objectInputStream2);
                } else {
                    close(inputStream);
                }
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            java.io.ObjectInputStream objectInputStream32 = objectInputStream;
            th = th;
            objectInputStream2 = objectInputStream32;
            if (objectInputStream2 != null) {
            }
            throw th;
        }
    }

    private java.util.List<com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata> handleNullSource() {
        if (this.strictMode) {
            throw new java.lang.IllegalArgumentException("Source cannot be null");
        }
        return java.util.Collections.emptyList();
    }

    private void close(java.io.InputStream inputStream) {
        try {
            inputStream.close();
        } catch (java.io.IOException e) {
            logger.log(java.util.logging.Level.WARNING, "Error closing input stream (ignored)", (java.lang.Throwable) e);
        }
    }
}
