package com.facebook.internal;

/* compiled from: NativeAppCallAttachmentStore.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007J\b\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\n\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0007J$\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\n\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001bH\u0007J\u001e\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\bH\u0002J \u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/facebook/internal/NativeAppCallAttachmentStore;", "", "()V", "ATTACHMENTS_DIR_NAME", "", "TAG", "kotlin.jvm.PlatformType", "attachmentsDirectory", "Ljava/io/File;", "addAttachments", "", com.helpshift.HelpshiftEvent.DATA_ATTACHMENTS, "", "Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;", "cleanupAllAttachments", "cleanupAttachmentsForCall", "callId", "Ljava/util/UUID;", "createAttachment", "attachmentBitmap", "Landroid/graphics/Bitmap;", "attachmentUri", "Landroid/net/Uri;", "ensureAttachmentsDirectoryExists", "getAttachmentFile", "attachmentName", "createDirs", "", "getAttachmentsDirectory", "getAttachmentsDirectoryForCall", "create", "openAttachment", "processAttachmentBitmap", "bitmap", "outputFile", "processAttachmentFile", "imageUri", "isContentUri", "Attachment", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeAppCallAttachmentStore {
    public static final java.lang.String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
    public static final com.facebook.internal.NativeAppCallAttachmentStore INSTANCE = new com.facebook.internal.NativeAppCallAttachmentStore();
    private static final java.lang.String TAG = com.facebook.internal.NativeAppCallAttachmentStore.class.getName();
    private static java.io.File attachmentsDirectory;

    private NativeAppCallAttachmentStore() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.NativeAppCallAttachmentStore.Attachment createAttachment(java.util.UUID callId, android.graphics.Bitmap attachmentBitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachmentBitmap, "attachmentBitmap");
        return new com.facebook.internal.NativeAppCallAttachmentStore.Attachment(callId, attachmentBitmap, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.NativeAppCallAttachmentStore.Attachment createAttachment(java.util.UUID callId, android.net.Uri attachmentUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachmentUri, "attachmentUri");
        return new com.facebook.internal.NativeAppCallAttachmentStore.Attachment(callId, null, attachmentUri);
    }

    private final void processAttachmentBitmap(android.graphics.Bitmap bitmap, java.io.File outputFile) throws java.io.IOException {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(outputFile);
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.closeQuietly(fileOutputStream);
        }
    }

    private final void processAttachmentFile(android.net.Uri imageUri, boolean isContentUri, java.io.File outputFile) throws java.io.IOException {
        java.io.FileInputStream openInputStream;
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(outputFile);
        try {
            if (!isContentUri) {
                openInputStream = new java.io.FileInputStream(imageUri.getPath());
            } else {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                openInputStream = com.facebook.FacebookSdk.getApplicationContext().getContentResolver().openInputStream(imageUri);
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.copyAndCloseInputStream(openInputStream, fileOutputStream);
        } finally {
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.closeQuietly(fileOutputStream);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void addAttachments(java.util.Collection<com.facebook.internal.NativeAppCallAttachmentStore.Attachment> attachments) throws com.facebook.FacebookException {
        if (attachments == null || attachments.isEmpty()) {
            return;
        }
        if (attachmentsDirectory == null) {
            cleanupAllAttachments();
        }
        ensureAttachmentsDirectoryExists();
        java.util.ArrayList<java.io.File> arrayList = new java.util.ArrayList();
        try {
            for (com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment : attachments) {
                if (attachment.getShouldCreateFile()) {
                    com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = INSTANCE;
                    java.io.File attachmentFile = getAttachmentFile(attachment.getCallId(), attachment.getAttachmentName(), true);
                    if (attachmentFile != null) {
                        arrayList.add(attachmentFile);
                        if (attachment.getBitmap() != null) {
                            nativeAppCallAttachmentStore.processAttachmentBitmap(attachment.getBitmap(), attachmentFile);
                        } else if (attachment.getOriginalUri() != null) {
                            nativeAppCallAttachmentStore.processAttachmentFile(attachment.getOriginalUri(), attachment.getIsContentUri(), attachmentFile);
                        }
                    }
                }
            }
        } catch (java.io.IOException e) {
            android.util.Log.e(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Got unexpected exception:", e));
            for (java.io.File file : arrayList) {
                if (file != null) {
                    try {
                        file.delete();
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            throw new com.facebook.FacebookException(e);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void cleanupAttachmentsForCall(java.util.UUID callId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        java.io.File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, false);
        if (attachmentsDirectoryForCall == null) {
            return;
        }
        kotlin.io.FilesKt.deleteRecursively(attachmentsDirectoryForCall);
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File openAttachment(java.util.UUID callId, java.lang.String attachmentName) throws java.io.FileNotFoundException {
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(attachmentName) || callId == null) {
            throw new java.io.FileNotFoundException();
        }
        try {
            return getAttachmentFile(callId, attachmentName, false);
        } catch (java.io.IOException unused) {
            throw new java.io.FileNotFoundException();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized java.io.File getAttachmentsDirectory() {
        java.io.File file;
        synchronized (com.facebook.internal.NativeAppCallAttachmentStore.class) {
            if (attachmentsDirectory == null) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                attachmentsDirectory = new java.io.File(com.facebook.FacebookSdk.getApplicationContext().getCacheDir(), ATTACHMENTS_DIR_NAME);
            }
            file = attachmentsDirectory;
        }
        return file;
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File ensureAttachmentsDirectoryExists() {
        java.io.File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            attachmentsDirectory2.mkdirs();
        }
        return attachmentsDirectory2;
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File getAttachmentsDirectoryForCall(java.util.UUID callId, boolean create) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        if (attachmentsDirectory == null) {
            return null;
        }
        java.io.File file = new java.io.File(attachmentsDirectory, callId.toString());
        if (create && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File getAttachmentFile(java.util.UUID callId, java.lang.String attachmentName, boolean createDirs) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
        java.io.File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, createDirs);
        if (attachmentsDirectoryForCall == null) {
            return null;
        }
        try {
            return new java.io.File(attachmentsDirectoryForCall, java.net.URLEncoder.encode(attachmentName, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void cleanupAllAttachments() {
        java.io.File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 == null) {
            return;
        }
        kotlin.io.FilesKt.deleteRecursively(attachmentsDirectory2);
    }

    /* compiled from: NativeAppCallAttachmentStore.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;", "", "callId", "Ljava/util/UUID;", "bitmap", "Landroid/graphics/Bitmap;", "originalUri", "Landroid/net/Uri;", "(Ljava/util/UUID;Landroid/graphics/Bitmap;Landroid/net/Uri;)V", "attachmentName", "", "getAttachmentName", "()Ljava/lang/String;", "attachmentUrl", "getAttachmentUrl", "getBitmap", "()Landroid/graphics/Bitmap;", "getCallId", "()Ljava/util/UUID;", "isContentUri", "", "()Z", "setContentUri", "(Z)V", "getOriginalUri", "()Landroid/net/Uri;", "shouldCreateFile", "getShouldCreateFile", "setShouldCreateFile", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Attachment {
        private final java.lang.String attachmentName;
        private final java.lang.String attachmentUrl;
        private final android.graphics.Bitmap bitmap;
        private final java.util.UUID callId;
        private boolean isContentUri;
        private final android.net.Uri originalUri;
        private boolean shouldCreateFile;

        public Attachment(java.util.UUID callId, android.graphics.Bitmap bitmap, android.net.Uri uri) {
            java.lang.String attachmentUrl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
            this.callId = callId;
            this.bitmap = bitmap;
            this.originalUri = uri;
            if (uri != null) {
                java.lang.String scheme = uri.getScheme();
                if (kotlin.text.StringsKt.equals("content", scheme, true)) {
                    this.isContentUri = true;
                    java.lang.String authority = uri.getAuthority();
                    this.shouldCreateFile = (authority == null || kotlin.text.StringsKt.startsWith$default(authority, "media", false, 2, (java.lang.Object) null)) ? false : true;
                } else if (kotlin.text.StringsKt.equals("file", uri.getScheme(), true)) {
                    this.shouldCreateFile = true;
                } else {
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    if (!com.facebook.internal.Utility.isWebUri(uri)) {
                        throw new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Unsupported scheme for media Uri : ", scheme));
                    }
                }
            } else if (bitmap != null) {
                this.shouldCreateFile = true;
            } else {
                throw new com.facebook.FacebookException("Cannot share media without a bitmap or Uri set");
            }
            java.lang.String uuid = this.shouldCreateFile ? java.util.UUID.randomUUID().toString() : null;
            this.attachmentName = uuid;
            if (!this.shouldCreateFile) {
                attachmentUrl = java.lang.String.valueOf(uri);
            } else {
                com.facebook.FacebookContentProvider.Companion companion = com.facebook.FacebookContentProvider.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                attachmentUrl = companion.getAttachmentUrl(com.facebook.FacebookSdk.getApplicationId(), callId, uuid);
            }
            this.attachmentUrl = attachmentUrl;
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public final java.util.UUID getCallId() {
            return this.callId;
        }

        public final android.net.Uri getOriginalUri() {
            return this.originalUri;
        }

        public final java.lang.String getAttachmentUrl() {
            return this.attachmentUrl;
        }

        public final java.lang.String getAttachmentName() {
            return this.attachmentName;
        }

        /* renamed from: isContentUri, reason: from getter */
        public final boolean getIsContentUri() {
            return this.isContentUri;
        }

        public final void setContentUri(boolean z) {
            this.isContentUri = z;
        }

        public final boolean getShouldCreateFile() {
            return this.shouldCreateFile;
        }

        public final void setShouldCreateFile(boolean z) {
            this.shouldCreateFile = z;
        }
    }
}
