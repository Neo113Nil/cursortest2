package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public class Volley {
    public static com.android.volley.RequestQueue newRequestQueue(android.content.Context context, com.android.volley.toolbox.BaseHttpStack baseHttpStack) {
        com.android.volley.toolbox.BasicNetwork basicNetwork;
        if (baseHttpStack == null) {
            basicNetwork = new com.android.volley.toolbox.BasicNetwork((com.android.volley.toolbox.BaseHttpStack) new com.android.volley.toolbox.HurlStack());
        } else {
            basicNetwork = new com.android.volley.toolbox.BasicNetwork(baseHttpStack);
        }
        return getHighSpeedVideoSizes(context, basicNetwork);
    }

    @java.lang.Deprecated
    public static com.android.volley.RequestQueue newRequestQueue(android.content.Context context, com.android.volley.toolbox.HttpStack httpStack) {
        if (httpStack == null) {
            return newRequestQueue(context, (com.android.volley.toolbox.BaseHttpStack) null);
        }
        return getHighSpeedVideoSizes(context, new com.android.volley.toolbox.BasicNetwork(httpStack));
    }

    private static com.android.volley.RequestQueue getHighSpeedVideoSizes(android.content.Context context, com.android.volley.Network network) {
        final android.content.Context applicationContext = context.getApplicationContext();
        com.android.volley.RequestQueue requestQueue = new com.android.volley.RequestQueue(new com.android.volley.toolbox.DiskBasedCache(new com.android.volley.toolbox.DiskBasedCache.FileSupplier() { // from class: com.android.volley.toolbox.Volley.1
            private java.io.File getHighSpeedVideoSizes = null;

            @Override // com.android.volley.toolbox.DiskBasedCache.FileSupplier
            public java.io.File get() {
                if (this.getHighSpeedVideoSizes == null) {
                    this.getHighSpeedVideoSizes = new java.io.File(applicationContext.getCacheDir(), "volley");
                }
                return this.getHighSpeedVideoSizes;
            }
        }), network);
        requestQueue.start();
        return requestQueue;
    }

    public static com.android.volley.RequestQueue newRequestQueue(android.content.Context context) {
        return newRequestQueue(context, (com.android.volley.toolbox.BaseHttpStack) null);
    }
}
