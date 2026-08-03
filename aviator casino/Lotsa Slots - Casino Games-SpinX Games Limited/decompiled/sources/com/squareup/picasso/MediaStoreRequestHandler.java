package com.squareup.picasso;

/* loaded from: classes5.dex */
class MediaStoreRequestHandler extends com.squareup.picasso.ContentStreamRequestHandler {
    private static final java.lang.String[] CONTENT_ORIENTATION = {"orientation"};

    MediaStoreRequestHandler(android.content.Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request request) {
        android.net.Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException {
        android.graphics.Bitmap thumbnail;
        android.content.ContentResolver contentResolver = this.context.getContentResolver();
        int exifOrientation = getExifOrientation(contentResolver, request.uri);
        java.lang.String type = contentResolver.getType(request.uri);
        boolean z = type != null && type.startsWith("video/");
        if (request.hasSize()) {
            com.squareup.picasso.MediaStoreRequestHandler.PicassoKind picassoKind = getPicassoKind(request.targetWidth, request.targetHeight);
            if (!z && picassoKind == com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL) {
                return new com.squareup.picasso.RequestHandler.Result(null, okio.Okio.source(getInputStream(request)), com.squareup.picasso.Picasso.LoadedFrom.DISK, exifOrientation);
            }
            long parseId = android.content.ContentUris.parseId(request.uri);
            android.graphics.BitmapFactory.Options createBitmapOptions = createBitmapOptions(request);
            createBitmapOptions.inJustDecodeBounds = true;
            calculateInSampleSize(request.targetWidth, request.targetHeight, picassoKind.width, picassoKind.height, createBitmapOptions, request);
            if (z) {
                thumbnail = android.provider.MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, picassoKind == com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL ? 1 : picassoKind.androidKind, createBitmapOptions);
            } else {
                thumbnail = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, picassoKind.androidKind, createBitmapOptions);
            }
            if (thumbnail != null) {
                return new com.squareup.picasso.RequestHandler.Result(thumbnail, null, com.squareup.picasso.Picasso.LoadedFrom.DISK, exifOrientation);
            }
        }
        return new com.squareup.picasso.RequestHandler.Result(null, okio.Okio.source(getInputStream(request)), com.squareup.picasso.Picasso.LoadedFrom.DISK, exifOrientation);
    }

    static com.squareup.picasso.MediaStoreRequestHandler.PicassoKind getPicassoKind(int i, int i2) {
        if (i <= com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO.width && i2 <= com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO.height) {
            return com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO;
        }
        if (i <= com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI.width && i2 <= com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI.height) {
            return com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI;
        }
        return com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int getExifOrientation(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        android.database.Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, CONTENT_ORIENTATION, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i = cursor.getInt(0);
                if (cursor != null) {
                    cursor.close();
                }
                return i;
            }
            return 0;
        } catch (java.lang.RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }
}
