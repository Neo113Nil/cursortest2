package com.airbnb.lottie.manager;

/* loaded from: classes7.dex */
public class ImageAssetManager {
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private com.airbnb.lottie.ImageAssetDelegate Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighSpeedVideoSizes;

    public ImageAssetManager(android.graphics.drawable.Drawable.Callback callback, java.lang.String str, com.airbnb.lottie.ImageAssetDelegate imageAssetDelegate, java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> map) {
        if (!android.text.TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            this.getHighSpeedVideoFpsRanges = sb.toString();
        } else {
            this.getHighSpeedVideoFpsRanges = str;
        }
        this.getHighSpeedVideoFpsRangesFor = map;
        setDelegate(imageAssetDelegate);
        if (!(callback instanceof android.view.View)) {
            this.getHighSpeedVideoSizes = null;
        } else {
            this.getHighSpeedVideoSizes = ((android.view.View) callback).getContext().getApplicationContext();
        }
    }

    public void setDelegate(com.airbnb.lottie.ImageAssetDelegate imageAssetDelegate) {
        this.Camera2StreamConfigurationMap = imageAssetDelegate;
    }

    public android.graphics.Bitmap updateBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.airbnb.lottie.LottieImageAsset lottieImageAsset = this.getHighSpeedVideoFpsRangesFor.get(str);
            android.graphics.Bitmap bitmap2 = lottieImageAsset.getBitmap();
            lottieImageAsset.setBitmap(null);
            return bitmap2;
        }
        android.graphics.Bitmap bitmap3 = this.getHighSpeedVideoFpsRangesFor.get(str).getBitmap();
        getHighSpeedVideoSizes(str, bitmap);
        return bitmap3;
    }

    public com.airbnb.lottie.LottieImageAsset getImageAssetById(java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.get(str);
    }

    public android.graphics.Bitmap bitmapForId(java.lang.String str) {
        com.airbnb.lottie.LottieImageAsset lottieImageAsset = this.getHighSpeedVideoFpsRangesFor.get(str);
        if (lottieImageAsset == null) {
            return null;
        }
        android.graphics.Bitmap bitmap = lottieImageAsset.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        com.airbnb.lottie.ImageAssetDelegate imageAssetDelegate = this.Camera2StreamConfigurationMap;
        if (imageAssetDelegate != null) {
            android.graphics.Bitmap fetchBitmap = imageAssetDelegate.fetchBitmap(lottieImageAsset);
            if (fetchBitmap != null) {
                getHighSpeedVideoSizes(str, fetchBitmap);
            }
            return fetchBitmap;
        }
        android.content.Context context = this.getHighSpeedVideoSizes;
        if (context == null) {
            return null;
        }
        java.lang.String fileName = lottieImageAsset.getFileName();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] decode = android.util.Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                try {
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    if (decodeByteArray == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Decoded image `");
                        sb.append(str);
                        sb.append("` is null.");
                        com.airbnb.lottie.utils.Logger.warning(sb.toString());
                        return null;
                    }
                    return getHighSpeedVideoSizes(str, com.airbnb.lottie.utils.Utils.resizeBitmapIfNeeded(decodeByteArray, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                } catch (java.lang.IllegalArgumentException e) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to decode image `");
                    sb2.append(str);
                    sb2.append("`.");
                    com.airbnb.lottie.utils.Logger.warning(sb2.toString(), e);
                    return null;
                }
            } catch (java.lang.IllegalArgumentException e2) {
                com.airbnb.lottie.utils.Logger.warning("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (android.text.TextUtils.isEmpty(this.getHighSpeedVideoFpsRanges)) {
                throw new java.lang.IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            android.content.res.AssetManager assets = context.getAssets();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(this.getHighSpeedVideoFpsRanges);
            sb3.append(fileName);
            try {
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(assets.open(sb3.toString()), null, options);
                if (decodeStream == null) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Decoded image `");
                    sb4.append(str);
                    sb4.append("` is null.");
                    com.airbnb.lottie.utils.Logger.warning(sb4.toString());
                    return null;
                }
                return getHighSpeedVideoSizes(str, com.airbnb.lottie.utils.Utils.resizeBitmapIfNeeded(decodeStream, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
            } catch (java.lang.IllegalArgumentException e3) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Unable to decode image `");
                sb5.append(str);
                sb5.append("`.");
                com.airbnb.lottie.utils.Logger.warning(sb5.toString(), e3);
                return null;
            }
        } catch (java.io.IOException e4) {
            com.airbnb.lottie.utils.Logger.warning("Unable to open asset.", e4);
            return null;
        }
    }

    public boolean hasSameContext(android.content.Context context) {
        if (context == null) {
            return this.getHighSpeedVideoSizes == null;
        }
        if (this.getHighSpeedVideoSizes instanceof android.app.Application) {
            context = context.getApplicationContext();
        }
        return context == this.getHighSpeedVideoSizes;
    }

    private android.graphics.Bitmap getHighSpeedVideoSizes(java.lang.String str, android.graphics.Bitmap bitmap) {
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRangesFor.get(str).setBitmap(bitmap);
        }
        return bitmap;
    }
}
