package com.squareup.picasso;

/* loaded from: classes5.dex */
class ContactsPhotoRequestHandler extends com.squareup.picasso.RequestHandler {
    private static final int ID_CONTACT = 3;
    private static final int ID_DISPLAY_PHOTO = 4;
    private static final int ID_LOOKUP = 1;
    private static final int ID_THUMBNAIL = 2;
    private static final android.content.UriMatcher matcher;
    private final android.content.Context context;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        matcher = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    ContactsPhotoRequestHandler(android.content.Context context) {
        this.context = context;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request request) {
        android.net.Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && android.provider.ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && matcher.match(request.uri) != -1;
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException {
        java.io.InputStream inputStream = getInputStream(request);
        if (inputStream == null) {
            return null;
        }
        return new com.squareup.picasso.RequestHandler.Result(okio.Okio.source(inputStream), com.squareup.picasso.Picasso.LoadedFrom.DISK);
    }

    private java.io.InputStream getInputStream(com.squareup.picasso.Request request) throws java.io.IOException {
        android.content.ContentResolver contentResolver = this.context.getContentResolver();
        android.net.Uri uri = request.uri;
        int match = matcher.match(uri);
        if (match == 1) {
            uri = android.provider.ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uri == null) {
                return null;
            }
        } else {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new java.lang.IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
