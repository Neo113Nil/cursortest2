package com.facebook;

/* compiled from: FacebookContentProvider.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0002JK\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u001cJ9\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u001e¨\u0006 "}, d2 = {"Lcom/facebook/FacebookContentProvider;", "Landroid/content/ContentProvider;", "()V", "delete", "", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "", "strings", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "contentValues", "Landroid/content/ContentValues;", "onCreate", "", "openFile", "Landroid/os/ParcelFileDescriptor;", com.ironsource.X3.a.t, "parseCallIdAndAttachmentName", "Landroid/util/Pair;", "Ljava/util/UUID;", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "strings2", "s2", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookContentProvider extends android.content.ContentProvider {
    private static final java.lang.String ATTACHMENT_URL_BASE = "content://com.facebook.app.FacebookContentProvider";
    private static final java.lang.String INVALID_FILE_NAME = "..";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.FacebookContentProvider.Companion INSTANCE = new com.facebook.FacebookContentProvider.Companion(null);
    private static final java.lang.String TAG = com.facebook.FacebookContentProvider.class.getName();

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAttachmentUrl(java.lang.String str, java.util.UUID uuid, java.lang.String str2) {
        return INSTANCE.getAttachmentUrl(str, uuid, str2);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String s, java.lang.String[] strings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strings, java.lang.String s, java.lang.String[] strings2, java.lang.String s2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String s, java.lang.String[] strings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        android.util.Pair<java.util.UUID, java.lang.String> parseCallIdAndAttachmentName = parseCallIdAndAttachmentName(uri);
        if (parseCallIdAndAttachmentName == null) {
            throw new java.io.FileNotFoundException();
        }
        try {
            com.facebook.internal.NativeAppCallAttachmentStore nativeAppCallAttachmentStore = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE;
            java.io.File openAttachment = com.facebook.internal.NativeAppCallAttachmentStore.openAttachment((java.util.UUID) parseCallIdAndAttachmentName.first, (java.lang.String) parseCallIdAndAttachmentName.second);
            if (openAttachment == null) {
                throw new java.io.FileNotFoundException();
            }
            return android.os.ParcelFileDescriptor.open(openAttachment, 268435456);
        } catch (java.io.FileNotFoundException e) {
            android.util.Log.e(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Got unexpected exception:", e));
            throw e;
        }
    }

    private final android.util.Pair<java.util.UUID, java.lang.String> parseCallIdAndAttachmentName(android.net.Uri uri) {
        try {
            java.lang.String path = uri.getPath();
            if (path == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            java.lang.String substring = path.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            java.lang.Object[] array = kotlin.text.StringsKt.split$default((java.lang.CharSequence) substring, new java.lang.String[]{com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
            if (array != null) {
                java.lang.String[] strArr = (java.lang.String[]) array;
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[1];
                if (INVALID_FILE_NAME.contentEquals(str) || INVALID_FILE_NAME.contentEquals(str2)) {
                    throw new java.lang.Exception();
                }
                return new android.util.Pair<>(java.util.UUID.fromString(str), str2);
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* compiled from: FacebookContentProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/FacebookContentProvider$Companion;", "", "()V", "ATTACHMENT_URL_BASE", "", "INVALID_FILE_NAME", "TAG", "kotlin.jvm.PlatformType", "getAttachmentUrl", "applicationId", "callId", "Ljava/util/UUID;", "attachmentName", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getAttachmentUrl(java.lang.String applicationId, java.util.UUID callId, java.lang.String attachmentName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callId, "callId");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("%s%s/%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookContentProvider.ATTACHMENT_URL_BASE, applicationId, callId.toString(), attachmentName}, 4));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }
    }
}
