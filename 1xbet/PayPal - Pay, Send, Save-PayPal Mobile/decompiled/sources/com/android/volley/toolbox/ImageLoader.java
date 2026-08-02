package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class ImageLoader {
    private final com.android.volley.toolbox.ImageLoader.ImageCache getHighSpeedVideoFpsRanges;
    private java.lang.Runnable getInputSizeshNQ4ISI;
    private final com.android.volley.RequestQueue getOutputMinFrameDuration;
    private int getHighSpeedVideoFpsRangesFor = 100;
    private final java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader.BatchedImageRequest> getHighSpeedVideoSizes = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, com.android.volley.toolbox.ImageLoader.BatchedImageRequest> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap<>();
    private final android.os.Handler Camera2StreamConfigurationMap = new android.os.Handler(android.os.Looper.getMainLooper());

    public interface ImageCache {
        android.graphics.Bitmap getBitmap(java.lang.String str);

        void putBitmap(java.lang.String str, android.graphics.Bitmap bitmap);
    }

    public interface ImageListener extends com.android.volley.Response.ErrorListener {
        void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer, boolean z);
    }

    static /* synthetic */ java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI(com.android.volley.toolbox.ImageLoader imageLoader) {
        imageLoader.getInputSizeshNQ4ISI = null;
        return null;
    }

    public ImageLoader(com.android.volley.RequestQueue requestQueue, com.android.volley.toolbox.ImageLoader.ImageCache imageCache) {
        this.getOutputMinFrameDuration = requestQueue;
        this.getHighSpeedVideoFpsRanges = imageCache;
    }

    public static com.android.volley.toolbox.ImageLoader.ImageListener getImageListener(final android.widget.ImageView imageView, final int i, final int i2) {
        return new com.android.volley.toolbox.ImageLoader.ImageListener() { // from class: com.android.volley.toolbox.ImageLoader.1
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(com.android.volley.VolleyError volleyError) {
                int i3 = i2;
                if (i3 != 0) {
                    imageView.setImageResource(i3);
                }
            }

            @Override // com.android.volley.toolbox.ImageLoader.ImageListener
            public void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer, boolean z) {
                if (imageContainer.getBitmap() != null) {
                    imageView.setImageBitmap(imageContainer.getBitmap());
                    return;
                }
                int i3 = i;
                if (i3 != 0) {
                    imageView.setImageResource(i3);
                }
            }
        };
    }

    public boolean isCached(java.lang.String str, int i, int i2) {
        return isCached(str, i, i2, android.widget.ImageView.ScaleType.CENTER_INSIDE);
    }

    public boolean isCached(java.lang.String str, int i, int i2, android.widget.ImageView.ScaleType scaleType) {
        com.android.volley.toolbox.Threads.getHighSpeedVideoFpsRangesFor();
        return this.getHighSpeedVideoFpsRanges.getBitmap(getHighSpeedVideoSizes(str, i, i2, scaleType)) != null;
    }

    public com.android.volley.toolbox.ImageLoader.ImageContainer get(java.lang.String str, com.android.volley.toolbox.ImageLoader.ImageListener imageListener) {
        return get(str, imageListener, 0, 0);
    }

    public com.android.volley.toolbox.ImageLoader.ImageContainer get(java.lang.String str, com.android.volley.toolbox.ImageLoader.ImageListener imageListener, int i, int i2) {
        return get(str, imageListener, i, i2, android.widget.ImageView.ScaleType.CENTER_INSIDE);
    }

    public com.android.volley.toolbox.ImageLoader.ImageContainer get(java.lang.String str, com.android.volley.toolbox.ImageLoader.ImageListener imageListener, int i, int i2, android.widget.ImageView.ScaleType scaleType) {
        com.android.volley.toolbox.Threads.getHighSpeedVideoFpsRangesFor();
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(str, i, i2, scaleType);
        android.graphics.Bitmap bitmap = this.getHighSpeedVideoFpsRanges.getBitmap(highSpeedVideoSizes);
        if (bitmap != null) {
            com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer = new com.android.volley.toolbox.ImageLoader.ImageContainer(bitmap, str, null, null);
            imageListener.onResponse(imageContainer, true);
            return imageContainer;
        }
        com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer2 = new com.android.volley.toolbox.ImageLoader.ImageContainer(null, str, highSpeedVideoSizes, imageListener);
        imageListener.onResponse(imageContainer2, true);
        com.android.volley.toolbox.ImageLoader.BatchedImageRequest batchedImageRequest = this.getHighSpeedVideoSizes.get(highSpeedVideoSizes);
        if (batchedImageRequest == null) {
            batchedImageRequest = this.getHighResolutionOutputSizeshNQ4ISI.get(highSpeedVideoSizes);
        }
        if (batchedImageRequest == null) {
            com.android.volley.Request<android.graphics.Bitmap> makeImageRequest = makeImageRequest(str, i, i2, scaleType, highSpeedVideoSizes);
            this.getOutputMinFrameDuration.add(makeImageRequest);
            this.getHighSpeedVideoSizes.put(highSpeedVideoSizes, new com.android.volley.toolbox.ImageLoader.BatchedImageRequest(makeImageRequest, imageContainer2));
            return imageContainer2;
        }
        batchedImageRequest.Camera2StreamConfigurationMap.add(imageContainer2);
        return imageContainer2;
    }

    protected com.android.volley.Request<android.graphics.Bitmap> makeImageRequest(java.lang.String str, int i, int i2, android.widget.ImageView.ScaleType scaleType, final java.lang.String str2) {
        return new com.android.volley.toolbox.ImageRequest(str, new com.android.volley.Response.Listener<android.graphics.Bitmap>() { // from class: com.android.volley.toolbox.ImageLoader.2
            @Override // com.android.volley.Response.Listener
            public /* synthetic */ void onResponse(android.graphics.Bitmap bitmap) {
                com.android.volley.toolbox.ImageLoader.this.onGetImageSuccess(str2, bitmap);
            }
        }, i, i2, scaleType, android.graphics.Bitmap.Config.RGB_565, new com.android.volley.Response.ErrorListener() { // from class: com.android.volley.toolbox.ImageLoader.3
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(com.android.volley.VolleyError volleyError) {
                com.android.volley.toolbox.ImageLoader.this.onGetImageError(str2, volleyError);
            }
        });
    }

    public void setBatchedResponseDelay(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    protected void onGetImageSuccess(java.lang.String str, android.graphics.Bitmap bitmap) {
        this.getHighSpeedVideoFpsRanges.putBitmap(str, bitmap);
        com.android.volley.toolbox.ImageLoader.BatchedImageRequest remove = this.getHighSpeedVideoSizes.remove(str);
        if (remove != null) {
            remove.getHighResolutionOutputSizeshNQ4ISI = bitmap;
            getHighSpeedVideoFpsRangesFor(str, remove);
        }
    }

    protected void onGetImageError(java.lang.String str, com.android.volley.VolleyError volleyError) {
        com.android.volley.toolbox.ImageLoader.BatchedImageRequest remove = this.getHighSpeedVideoSizes.remove(str);
        if (remove != null) {
            remove.getHighSpeedVideoFpsRangesFor = volleyError;
            getHighSpeedVideoFpsRangesFor(str, remove);
        }
    }

    public class ImageContainer {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final com.android.volley.toolbox.ImageLoader.ImageListener getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private android.graphics.Bitmap getHighSpeedVideoSizes;

        public ImageContainer(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, com.android.volley.toolbox.ImageLoader.ImageListener imageListener) {
            this.getHighSpeedVideoSizes = bitmap;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighSpeedVideoFpsRanges = imageListener;
        }

        public void cancelRequest() {
            com.android.volley.toolbox.Threads.getHighSpeedVideoFpsRangesFor();
            if (this.getHighSpeedVideoFpsRanges != null) {
                com.android.volley.toolbox.ImageLoader.BatchedImageRequest batchedImageRequest = (com.android.volley.toolbox.ImageLoader.BatchedImageRequest) com.android.volley.toolbox.ImageLoader.this.getHighSpeedVideoSizes.get(this.getHighSpeedVideoFpsRangesFor);
                if (batchedImageRequest == null) {
                    com.android.volley.toolbox.ImageLoader.BatchedImageRequest batchedImageRequest2 = (com.android.volley.toolbox.ImageLoader.BatchedImageRequest) com.android.volley.toolbox.ImageLoader.this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor);
                    if (batchedImageRequest2 != null) {
                        batchedImageRequest2.getHighResolutionOutputSizeshNQ4ISI(this);
                        if (batchedImageRequest2.Camera2StreamConfigurationMap.size() == 0) {
                            com.android.volley.toolbox.ImageLoader.this.getHighResolutionOutputSizeshNQ4ISI.remove(this.getHighSpeedVideoFpsRangesFor);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (batchedImageRequest.getHighResolutionOutputSizeshNQ4ISI(this)) {
                    com.android.volley.toolbox.ImageLoader.this.getHighSpeedVideoSizes.remove(this.getHighSpeedVideoFpsRangesFor);
                }
            }
        }

        public android.graphics.Bitmap getBitmap() {
            return this.getHighSpeedVideoSizes;
        }

        public java.lang.String getRequestUrl() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    static class BatchedImageRequest {
        final java.util.List<com.android.volley.toolbox.ImageLoader.ImageContainer> Camera2StreamConfigurationMap;
        private android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI;
        private final com.android.volley.Request<?> getHighSpeedVideoFpsRanges;
        com.android.volley.VolleyError getHighSpeedVideoFpsRangesFor;

        public BatchedImageRequest(com.android.volley.Request<?> request, com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.Camera2StreamConfigurationMap = arrayList;
            this.getHighSpeedVideoFpsRanges = request;
            arrayList.add(imageContainer);
        }

        public final boolean getHighResolutionOutputSizeshNQ4ISI(com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer) {
            this.Camera2StreamConfigurationMap.remove(imageContainer);
            if (this.Camera2StreamConfigurationMap.size() != 0) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges.cancel();
            return true;
        }
    }

    private void getHighSpeedVideoFpsRangesFor(java.lang.String str, com.android.volley.toolbox.ImageLoader.BatchedImageRequest batchedImageRequest) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(str, batchedImageRequest);
        if (this.getInputSizeshNQ4ISI == null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.android.volley.toolbox.ImageLoader.4
                @Override // java.lang.Runnable
                public void run() {
                    for (com.android.volley.toolbox.ImageLoader.BatchedImageRequest batchedImageRequest2 : com.android.volley.toolbox.ImageLoader.this.getHighResolutionOutputSizeshNQ4ISI.values()) {
                        for (com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer : batchedImageRequest2.Camera2StreamConfigurationMap) {
                            if (imageContainer.getHighSpeedVideoFpsRanges != null) {
                                if (batchedImageRequest2.getHighSpeedVideoFpsRangesFor == null) {
                                    imageContainer.getHighSpeedVideoSizes = batchedImageRequest2.getHighResolutionOutputSizeshNQ4ISI;
                                    imageContainer.getHighSpeedVideoFpsRanges.onResponse(imageContainer, false);
                                } else {
                                    imageContainer.getHighSpeedVideoFpsRanges.onErrorResponse(batchedImageRequest2.getHighSpeedVideoFpsRangesFor);
                                }
                            }
                        }
                    }
                    com.android.volley.toolbox.ImageLoader.this.getHighResolutionOutputSizeshNQ4ISI.clear();
                    com.android.volley.toolbox.ImageLoader.getHighResolutionOutputSizeshNQ4ISI(com.android.volley.toolbox.ImageLoader.this);
                }
            };
            this.getInputSizeshNQ4ISI = runnable;
            this.Camera2StreamConfigurationMap.postDelayed(runnable, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str, int i, int i2, android.widget.ImageView.ScaleType scaleType) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }
}
