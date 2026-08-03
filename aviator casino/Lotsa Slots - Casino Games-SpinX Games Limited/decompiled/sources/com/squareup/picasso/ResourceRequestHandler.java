package com.squareup.picasso;

/* loaded from: classes5.dex */
class ResourceRequestHandler extends com.squareup.picasso.RequestHandler {
    private final android.content.Context context;

    ResourceRequestHandler(android.content.Context context) {
        this.context = context;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request request) {
        if (request.resourceId != 0) {
            return true;
        }
        return "android.resource".equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException {
        android.content.res.Resources resources = com.squareup.picasso.Utils.getResources(this.context, request);
        return new com.squareup.picasso.RequestHandler.Result(decodeResource(resources, com.squareup.picasso.Utils.getResourceId(resources, request), request), com.squareup.picasso.Picasso.LoadedFrom.DISK);
    }

    private static android.graphics.Bitmap decodeResource(android.content.res.Resources resources, int i, com.squareup.picasso.Request request) {
        android.graphics.BitmapFactory.Options createBitmapOptions = createBitmapOptions(request);
        if (requiresInSampleSize(createBitmapOptions)) {
            android.graphics.BitmapFactory.decodeResource(resources, i, createBitmapOptions);
            calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
        }
        return android.graphics.BitmapFactory.decodeResource(resources, i, createBitmapOptions);
    }
}
