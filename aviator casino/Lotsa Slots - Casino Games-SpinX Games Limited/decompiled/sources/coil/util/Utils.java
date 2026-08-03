package coil.util;

/* compiled from: Utils.kt */
@kotlin.Metadata(d1 = {"\u0000\u009a\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0000\u001a\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0006*\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u000e\u00108\u001a\u000205*\u0004\u0018\u000105H\u0000\u001a\u000e\u00108\u001a\u000209*\u0004\u0018\u000109H\u0000\u001a\u000e\u00108\u001a\u00020:*\u0004\u0018\u00010:H\u0000\u001a\b\u0010;\u001a\u00020\u0012H\u0000\u001a\u001f\u0010@\u001a\u0004\u0018\u0001HA\"\u0004\b\u0000\u0010A*\b\u0012\u0004\u0012\u0002HA0BH\u0000¢\u0006\u0002\u0010C\u001a\u0019\u0010D\u001a\u0004\u0018\u00010E*\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0080\n\u001a+\u0010N\u001a\u00020O*\u00020O2\u001c\u0010P\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030R\u0012\b\u0012\u0006\u0012\u0002\b\u00030S\u0018\u00010QH\u0080\b\u001a\u0017\u0010N\u001a\u00020O*\u00020O2\b\u0010T\u001a\u0004\u0018\u00010UH\u0080\b\u001a\u0014\u0010V\u001a\u00020\u000b*\u00020\u00062\u0006\u0010W\u001a\u00020\u000bH\u0000\u001a\f\u0010X\u001a\u00020\u0015*\u00020YH\u0000\u001a\f\u0010e\u001a\u00020\u0012*\u00020\u000bH\u0000\u001a#\u0010f\u001a\u00020\u000b*\u00020g2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000b0iH\u0080\b\u001a#\u0010j\u001a\u00020\u000b*\u00020g2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000b0iH\u0080\b\u001a\u0014\u0010k\u001a\u00020\u000b*\u00020l2\u0006\u0010\u0017\u001a\u00020\u0018H\u0000\u001a\b\u0010m\u001a\u00020nH\u0000\u001a\u0010\u0010p\u001a\u00020\u00122\u0006\u0010q\u001a\u00020 H\u0000\u001a\u0014\u0010r\u001a\u00020s*\u00020s2\u0006\u0010t\u001a\u00020\u0006H\u0000\u001a\f\u0010u\u001a\u00020v*\u00020wH\u0000\u001a\u0010\u0010{\u001a\u00020y2\u0006\u0010|\u001a\u00020KH\u0000\u001a\u0018\u0010~\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020K2\u0006\u0010\u007f\u001a\u00020yH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u000b*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0018*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u0006*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0018\u0010#\u001a\u00020\u000b*\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0080\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/\"\u0016\u00100\u001a\u0004\u0018\u000101X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103\"\u0014\u00104\u001a\u000205X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107\"\u0019\u0010<\u001a\u00020\u000b*\u00020=8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\"\u0018\u0010I\u001a\u00020J*\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\"\u000e\u0010Z\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010[\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\\\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010]\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010^\u001a\u00020\u0012*\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010`\"\u0018\u0010a\u001a\u00020b*\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\"\u000e\u0010o\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010x\u001a\u00020yX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010z\u001a\u00020yX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010}\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0080\u0001"}, d2 = {"requestManager", "Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View;", "getRequestManager", "(Landroid/view/View;)Lcoil/request/ViewTargetRequestManager;", "emoji", "", "Lcoil/decode/DataSource;", "getEmoji", "(Lcoil/decode/DataSource;)Ljava/lang/String;", "width", "", "Landroid/graphics/drawable/Drawable;", "getWidth", "(Landroid/graphics/drawable/Drawable;)I", "height", "getHeight", "isVector", "", "(Landroid/graphics/drawable/Drawable;)Z", "closeQuietly", "", "Ljava/io/Closeable;", "scale", "Lcoil/size/Scale;", "Landroid/widget/ImageView;", "getScale", "(Landroid/widget/ImageView;)Lcoil/size/Scale;", "getMimeTypeFromUrl", "Landroid/webkit/MimeTypeMap;", "url", "firstPathSegment", "Landroid/net/Uri;", "getFirstPathSegment", "(Landroid/net/Uri;)Ljava/lang/String;", "nightMode", "Landroid/content/res/Configuration;", "getNightMode", "(Landroid/content/res/Configuration;)I", "VALID_TRANSFORMATION_CONFIGS", "", "Landroid/graphics/Bitmap$Config;", "getVALID_TRANSFORMATION_CONFIGS", "()[Landroid/graphics/Bitmap$Config;", "[Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "getDEFAULT_BITMAP_CONFIG", "()Landroid/graphics/Bitmap$Config;", "NULL_COLOR_SPACE", "Landroid/graphics/ColorSpace;", "getNULL_COLOR_SPACE", "()Landroid/graphics/ColorSpace;", "EMPTY_HEADERS", "Lokhttp3/Headers;", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "orEmpty", "Lcoil/request/Tags;", "Lcoil/request/Parameters;", "isMainThread", "identityHashCode", "", "getIdentityHashCode", "(Ljava/lang/Object;)I", "getCompletedOrNull", "T", "Lkotlinx/coroutines/Deferred;", "(Lkotlinx/coroutines/Deferred;)Ljava/lang/Object;", "get", "Lcoil/memory/MemoryCache$Value;", "Lcoil/memory/MemoryCache;", com.ironsource.X3.i.W, "Lcoil/memory/MemoryCache$Key;", "safeCacheDir", "Ljava/io/File;", "Landroid/content/Context;", "getSafeCacheDir", "(Landroid/content/Context;)Ljava/io/File;", "addFirst", "Lcoil/ComponentRegistry$Builder;", "pair", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "factory", "Lcoil/decode/Decoder$Factory;", "toNonNegativeInt", "defaultValue", "abortQuietly", "Lcoil/disk/DiskCache$Editor;", "MIME_TYPE_JPEG", "MIME_TYPE_WEBP", "MIME_TYPE_HEIC", "MIME_TYPE_HEIF", "isPlaceholderCached", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;)Z", "eventListener", "Lcoil/EventListener;", "getEventListener", "(Lcoil/intercept/Interceptor$Chain;)Lcoil/EventListener;", "isMinOrMax", "widthPx", "Lcoil/size/Size;", "original", "Lkotlin/Function0;", "heightPx", "toPx", "Lcoil/size/Dimension;", "unsupported", "", "ASSET_FILE_PATH_ROOT", "isAssetUri", com.facebook.share.internal.ShareConstants.MEDIA_URI, "addUnsafeNonAscii", "Lokhttp3/Headers$Builder;", "line", "requireBody", "Lokhttp3/ResponseBody;", "Lokhttp3/Response;", "STANDARD_MEMORY_MULTIPLIER", "", "LOW_MEMORY_MULTIPLIER", "defaultMemoryCacheSizePercent", "context", "DEFAULT_MEMORY_CLASS_MEGABYTES", "calculateMemoryCacheSize", "percent", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: coil.util.-Utils, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Utils {
    public static final java.lang.String ASSET_FILE_PATH_ROOT = "android_asset";
    private static final android.graphics.Bitmap.Config DEFAULT_BITMAP_CONFIG;
    private static final int DEFAULT_MEMORY_CLASS_MEGABYTES = 256;
    private static final okhttp3.Headers EMPTY_HEADERS;
    private static final double LOW_MEMORY_MULTIPLIER = 0.15d;
    public static final java.lang.String MIME_TYPE_HEIC = "image/heic";
    public static final java.lang.String MIME_TYPE_HEIF = "image/heif";
    public static final java.lang.String MIME_TYPE_JPEG = "image/jpeg";
    public static final java.lang.String MIME_TYPE_WEBP = "image/webp";
    private static final android.graphics.ColorSpace NULL_COLOR_SPACE = null;
    private static final double STANDARD_MEMORY_MULTIPLIER = 0.2d;
    private static final android.graphics.Bitmap.Config[] VALID_TRANSFORMATION_CONFIGS;

    /* compiled from: Utils.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: coil.util.-Utils$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[coil.decode.DataSource.values().length];
            try {
                iArr[coil.decode.DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[coil.decode.DataSource.MEMORY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[coil.decode.DataSource.DISK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[coil.decode.DataSource.NETWORK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[android.widget.ImageView.ScaleType.values().length];
            try {
                iArr2[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[coil.size.Scale.values().length];
            try {
                iArr3[coil.size.Scale.FILL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[coil.size.Scale.FIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final boolean isMinOrMax(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final coil.request.ViewTargetRequestManager getRequestManager(android.view.View view) {
        java.lang.Object tag = view.getTag(coil.base.R.id.coil_request_manager);
        coil.request.ViewTargetRequestManager viewTargetRequestManager = tag instanceof coil.request.ViewTargetRequestManager ? (coil.request.ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager == null) {
            synchronized (view) {
                java.lang.Object tag2 = view.getTag(coil.base.R.id.coil_request_manager);
                coil.request.ViewTargetRequestManager viewTargetRequestManager2 = tag2 instanceof coil.request.ViewTargetRequestManager ? (coil.request.ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager2 != null) {
                    viewTargetRequestManager = viewTargetRequestManager2;
                } else {
                    viewTargetRequestManager = new coil.request.ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(coil.base.R.id.coil_request_manager, viewTargetRequestManager);
                }
            }
        }
        return viewTargetRequestManager;
    }

    public static final java.lang.String getEmoji(coil.decode.DataSource dataSource) {
        int i = coil.util.Utils.WhenMappings.$EnumSwitchMapping$0[dataSource.ordinal()];
        if (i == 1 || i == 2) {
            return coil.util.Emoji.BRAIN;
        }
        if (i == 3) {
            return coil.util.Emoji.FLOPPY;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return coil.util.Emoji.CLOUD;
    }

    public static final int getWidth(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap bitmap;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final int getHeight(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap bitmap;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final boolean isVector(android.graphics.drawable.Drawable drawable) {
        return (drawable instanceof android.graphics.drawable.VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat);
    }

    public static final void closeQuietly(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    public static final coil.size.Scale getScale(android.widget.ImageView imageView) {
        android.widget.ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : coil.util.Utils.WhenMappings.$EnumSwitchMapping$1[scaleType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return coil.size.Scale.FIT;
        }
        return coil.size.Scale.FILL;
    }

    public static final java.lang.String getMimeTypeFromUrl(android.webkit.MimeTypeMap mimeTypeMap, java.lang.String str) {
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(kotlin.text.StringsKt.substringAfterLast(kotlin.text.StringsKt.substringAfterLast$default(kotlin.text.StringsKt.substringBeforeLast$default(kotlin.text.StringsKt.substringBeforeLast$default(str, '#', (java.lang.String) null, 2, (java.lang.Object) null), '?', (java.lang.String) null, 2, (java.lang.Object) null), kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null), '.', ""));
    }

    public static final java.lang.String getFirstPathSegment(android.net.Uri uri) {
        return (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) uri.getPathSegments());
    }

    public static final int getNightMode(android.content.res.Configuration configuration) {
        return configuration.uiMode & 48;
    }

    static {
        android.graphics.Bitmap.Config[] configArr;
        android.graphics.Bitmap.Config config;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            configArr = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888, android.graphics.Bitmap.Config.RGBA_F16};
        } else {
            configArr = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888};
        }
        VALID_TRANSFORMATION_CONFIGS = configArr;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            config = android.graphics.Bitmap.Config.HARDWARE;
        } else {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        DEFAULT_BITMAP_CONFIG = config;
        EMPTY_HEADERS = new okhttp3.Headers.Builder().build();
    }

    public static final android.graphics.Bitmap.Config[] getVALID_TRANSFORMATION_CONFIGS() {
        return VALID_TRANSFORMATION_CONFIGS;
    }

    public static final android.graphics.Bitmap.Config getDEFAULT_BITMAP_CONFIG() {
        return DEFAULT_BITMAP_CONFIG;
    }

    public static final android.graphics.ColorSpace getNULL_COLOR_SPACE() {
        return NULL_COLOR_SPACE;
    }

    public static final okhttp3.Headers getEMPTY_HEADERS() {
        return EMPTY_HEADERS;
    }

    public static final okhttp3.Headers orEmpty(okhttp3.Headers headers) {
        return headers == null ? EMPTY_HEADERS : headers;
    }

    public static final coil.request.Tags orEmpty(coil.request.Tags tags) {
        return tags == null ? coil.request.Tags.EMPTY : tags;
    }

    public static final coil.request.Parameters orEmpty(coil.request.Parameters parameters) {
        return parameters == null ? coil.request.Parameters.EMPTY : parameters;
    }

    public static final boolean isMainThread() {
        return kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
    }

    public static final int getIdentityHashCode(java.lang.Object obj) {
        return java.lang.System.identityHashCode(obj);
    }

    public static final <T> T getCompletedOrNull(kotlinx.coroutines.Deferred<? extends T> deferred) {
        try {
            return deferred.getCompleted();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final coil.memory.MemoryCache.Value get(coil.memory.MemoryCache memoryCache, coil.memory.MemoryCache.Key key) {
        if (key != null) {
            return memoryCache.get(key);
        }
        return null;
    }

    public static final java.io.File getSafeCacheDir(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new java.lang.IllegalStateException("cacheDir == null".toString());
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final coil.ComponentRegistry.Builder addFirst(coil.ComponentRegistry.Builder builder, kotlin.Pair<? extends coil.fetch.Fetcher.Factory<?>, ? extends java.lang.Class<?>> pair) {
        if (pair != 0) {
            builder.getFetcherFactories$coil_base_release().add(0, pair);
        }
        return builder;
    }

    public static final coil.ComponentRegistry.Builder addFirst(coil.ComponentRegistry.Builder builder, coil.decode.Decoder.Factory factory) {
        if (factory != null) {
            builder.getDecoderFactories$coil_base_release().add(0, factory);
        }
        return builder;
    }

    public static final int toNonNegativeInt(java.lang.String str, int i) {
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(str);
        if (longOrNull == null) {
            return i;
        }
        long longValue = longOrNull.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final void abortQuietly(coil.disk.DiskCache.Editor editor) {
        try {
            editor.abort();
        } catch (java.lang.Exception unused) {
        }
    }

    public static final boolean isPlaceholderCached(coil.intercept.Interceptor.Chain chain) {
        return (chain instanceof coil.intercept.RealInterceptorChain) && ((coil.intercept.RealInterceptorChain) chain).getIsPlaceholderCached();
    }

    public static final coil.EventListener getEventListener(coil.intercept.Interceptor.Chain chain) {
        return chain instanceof coil.intercept.RealInterceptorChain ? ((coil.intercept.RealInterceptorChain) chain).getEventListener() : coil.EventListener.NONE;
    }

    public static final int widthPx(coil.size.Size size, coil.size.Scale scale, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        return coil.size.Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getWidth(), scale);
    }

    public static final int heightPx(coil.size.Size size, coil.size.Scale scale, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        return coil.size.Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getHeight(), scale);
    }

    public static final java.lang.Void unsupported() {
        throw new java.lang.IllegalStateException("Unsupported".toString());
    }

    public static final boolean isAssetUri(android.net.Uri uri) {
        return kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), "file") && kotlin.jvm.internal.Intrinsics.areEqual(getFirstPathSegment(uri), ASSET_FILE_PATH_ROOT);
    }

    public static final okhttp3.Headers.Builder addUnsafeNonAscii(okhttp3.Headers.Builder builder, java.lang.String str) {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            throw new java.lang.IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        java.lang.String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) substring).toString();
        java.lang.String substring2 = str.substring(indexOf$default + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        builder.addUnsafeNonAscii(obj, substring2);
        return builder;
    }

    public static final okhttp3.ResponseBody requireBody(okhttp3.Response response) {
        okhttp3.ResponseBody body = response.body();
        if (body != null) {
            return body;
        }
        throw new java.lang.IllegalStateException("response body == null".toString());
    }

    public static final int toPx(coil.size.Dimension dimension, coil.size.Scale scale) {
        if (dimension instanceof coil.size.Dimension.Pixels) {
            return ((coil.size.Dimension.Pixels) dimension).px;
        }
        int i = coil.util.Utils.WhenMappings.$EnumSwitchMapping$2[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final double defaultMemoryCacheSizePercent(android.content.Context context) {
        try {
            java.lang.Object systemService = androidx.core.content.ContextCompat.getSystemService(context, android.app.ActivityManager.class);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService);
            return ((android.app.ActivityManager) systemService).isLowRamDevice() ? LOW_MEMORY_MULTIPLIER : STANDARD_MEMORY_MULTIPLIER;
        } catch (java.lang.Exception unused) {
            return STANDARD_MEMORY_MULTIPLIER;
        }
    }

    public static final int calculateMemoryCacheSize(android.content.Context context, double d) {
        int i;
        try {
            java.lang.Object systemService = androidx.core.content.ContextCompat.getSystemService(context, android.app.ActivityManager.class);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService);
            android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
            i = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (java.lang.Exception unused) {
            i = 256;
        }
        double d2 = 1024;
        return (int) (d * i * d2 * d2);
    }
}
