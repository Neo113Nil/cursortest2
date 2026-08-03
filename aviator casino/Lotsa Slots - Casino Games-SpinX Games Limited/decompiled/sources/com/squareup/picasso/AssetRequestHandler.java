package com.squareup.picasso;

/* loaded from: classes5.dex */
class AssetRequestHandler extends com.squareup.picasso.RequestHandler {
    protected static final java.lang.String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private android.content.res.AssetManager assetManager;
    private final android.content.Context context;
    private final java.lang.Object lock = new java.lang.Object();

    AssetRequestHandler(android.content.Context context) {
        this.context = context;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request request) {
        android.net.Uri uri = request.uri;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException {
        if (this.assetManager == null) {
            synchronized (this.lock) {
                if (this.assetManager == null) {
                    this.assetManager = this.context.getAssets();
                }
            }
        }
        return new com.squareup.picasso.RequestHandler.Result(okio.Okio.source(this.assetManager.open(getFilePath(request))), com.squareup.picasso.Picasso.LoadedFrom.DISK);
    }

    static java.lang.String getFilePath(com.squareup.picasso.Request request) {
        return request.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }
}
