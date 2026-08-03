package com.squareup.picasso;

/* loaded from: classes5.dex */
class FileRequestHandler extends com.squareup.picasso.ContentStreamRequestHandler {
    FileRequestHandler(android.content.Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request request) {
        return "file".equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException {
        return new com.squareup.picasso.RequestHandler.Result(null, okio.Okio.source(getInputStream(request)), com.squareup.picasso.Picasso.LoadedFrom.DISK, getFileExifRotation(request.uri));
    }

    static int getFileExifRotation(android.net.Uri uri) throws java.io.IOException {
        return new androidx.exifinterface.media.ExifInterface(uri.getPath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
    }
}
