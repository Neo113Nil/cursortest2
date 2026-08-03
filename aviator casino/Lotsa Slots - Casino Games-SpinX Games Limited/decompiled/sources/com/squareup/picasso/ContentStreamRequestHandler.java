package com.squareup.picasso;

/* loaded from: classes5.dex */
class ContentStreamRequestHandler extends com.squareup.picasso.RequestHandler {
    final android.content.Context context;

    ContentStreamRequestHandler(android.content.Context context) {
        this.context = context;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request request) {
        return "content".equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException {
        return new com.squareup.picasso.RequestHandler.Result(okio.Okio.source(getInputStream(request)), com.squareup.picasso.Picasso.LoadedFrom.DISK);
    }

    java.io.InputStream getInputStream(com.squareup.picasso.Request request) throws java.io.FileNotFoundException {
        return this.context.getContentResolver().openInputStream(request.uri);
    }
}
