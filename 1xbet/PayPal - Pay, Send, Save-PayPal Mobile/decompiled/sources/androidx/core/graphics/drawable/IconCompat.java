package androidx.core.graphics.drawable;

/* loaded from: classes3.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    static final android.graphics.PorterDuff.Mode Camera2StreamConfigurationMap = android.graphics.PorterDuff.Mode.SRC_IN;
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    android.graphics.PorterDuff.Mode getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoSizes;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    public android.os.Parcelable mParcelable;
    public java.lang.String mString1;
    public android.content.res.ColorStateList mTintList;
    public java.lang.String mTintModeStr;
    public int mType;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.Context context, int i) {
        androidx.core.util.ObjectsCompat.requireNonNull(context);
        return createWithResource(context.getResources(), context.getPackageName(), i);
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.res.Resources resources, java.lang.String str, int i) {
        androidx.core.util.ObjectsCompat.requireNonNull(str);
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.mInt1 = i;
        if (resources != null) {
            try {
                iconCompat.getHighSpeedVideoSizes = resources.getResourceName(i);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.getHighSpeedVideoSizes = str;
        }
        iconCompat.mString1 = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithBitmap(android.graphics.Bitmap bitmap) {
        androidx.core.util.ObjectsCompat.requireNonNull(bitmap);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(1);
        iconCompat.getHighSpeedVideoSizes = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmap(android.graphics.Bitmap bitmap) {
        androidx.core.util.ObjectsCompat.requireNonNull(bitmap);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(5);
        iconCompat.getHighSpeedVideoSizes = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithData(byte[] bArr, int i, int i2) {
        androidx.core.util.ObjectsCompat.requireNonNull(bArr);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(3);
        iconCompat.getHighSpeedVideoSizes = bArr;
        iconCompat.mInt1 = i;
        iconCompat.mInt2 = i2;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(java.lang.String str) {
        androidx.core.util.ObjectsCompat.requireNonNull(str);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(4);
        iconCompat.getHighSpeedVideoSizes = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(android.net.Uri uri) {
        androidx.core.util.ObjectsCompat.requireNonNull(uri);
        return createWithContentUri(uri.toString());
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(java.lang.String str) {
        androidx.core.util.ObjectsCompat.requireNonNull(str);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(6);
        iconCompat.getHighSpeedVideoSizes = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(android.net.Uri uri) {
        androidx.core.util.ObjectsCompat.requireNonNull(uri);
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        this.mTintModeStr = null;
    }

    IconCompat(int i) {
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        this.mTintModeStr = null;
        this.mType = i;
    }

    public int getType() {
        int i = this.mType;
        return i == -1 ? androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes) : i;
    }

    public java.lang.String getResPackage() {
        int i = this.mType;
        if (i == -1) {
            return androidx.core.graphics.drawable.IconCompat.Api23Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
        }
        if (i != 2) {
            throw new java.lang.IllegalStateException("called getResPackage() on ".concat(java.lang.String.valueOf(this)));
        }
        java.lang.String str = this.mString1;
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.String) this.getHighSpeedVideoSizes).split(io.ktor.sse.ServerSentEventKt.COLON, -1)[0];
        }
        return this.mString1;
    }

    public int getResId() {
        int i = this.mType;
        if (i == -1) {
            return androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
        }
        if (i != 2) {
            throw new java.lang.IllegalStateException("called getResId() on ".concat(java.lang.String.valueOf(this)));
        }
        return this.mInt1;
    }

    public android.graphics.Bitmap getBitmap() {
        int i = this.mType;
        if (i == -1) {
            java.lang.Object obj = this.getHighSpeedVideoSizes;
            if (obj instanceof android.graphics.Bitmap) {
                return (android.graphics.Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (android.graphics.Bitmap) this.getHighSpeedVideoSizes;
        }
        if (i == 5) {
            return Camera2StreamConfigurationMap((android.graphics.Bitmap) this.getHighSpeedVideoSizes, true);
        }
        throw new java.lang.IllegalStateException("called getBitmap() on ".concat(java.lang.String.valueOf(this)));
    }

    public android.net.Uri getUri() {
        int i = this.mType;
        if (i == -1) {
            return androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        }
        if (i != 4 && i != 6) {
            throw new java.lang.IllegalStateException("called getUri() on ".concat(java.lang.String.valueOf(this)));
        }
        return android.net.Uri.parse((java.lang.String) this.getHighSpeedVideoSizes);
    }

    public androidx.core.graphics.drawable.IconCompat setTint(int i) {
        return setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    public androidx.core.graphics.drawable.IconCompat setTintList(android.content.res.ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public androidx.core.graphics.drawable.IconCompat setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.getHighResolutionOutputSizeshNQ4ISI = mode;
        return this;
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Icon toIcon() {
        return toIcon(null);
    }

    public android.graphics.drawable.Icon toIcon(android.content.Context context) {
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(this, context);
    }

    public void checkResource(android.content.Context context) {
        java.lang.Object obj;
        int identifier;
        if (this.mType != 2 || (obj = this.getHighSpeedVideoSizes) == null) {
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        if (str.contains(io.ktor.sse.ServerSentEventKt.COLON)) {
            java.lang.String str2 = str.split(io.ktor.sse.ServerSentEventKt.COLON, -1)[1];
            java.lang.String str3 = str2.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, -1)[0];
            java.lang.String str4 = str2.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, -1)[1];
            java.lang.String str5 = str.split(io.ktor.sse.ServerSentEventKt.COLON, -1)[0];
            if ("0_resource_name_obfuscated".equals(str4) || this.mInt1 == (identifier = getHighSpeedVideoFpsRanges(context, getResPackage()).getIdentifier(str4, str3, str5))) {
                return;
            }
            this.mInt1 = identifier;
        }
    }

    public android.graphics.drawable.Drawable loadDrawable(android.content.Context context) {
        checkResource(context);
        return toIcon(context).loadDrawable(context);
    }

    public java.io.InputStream getUriInputStream(android.content.Context context) {
        android.net.Uri uri = getUri();
        java.lang.String scheme = uri.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            return context.getContentResolver().openInputStream(uri);
        }
        try {
            return new java.io.FileInputStream(new java.io.File((java.lang.String) this.getHighSpeedVideoSizes));
        } catch (java.io.FileNotFoundException | java.lang.Exception unused) {
            return null;
        }
    }

    static android.content.res.Resources getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str) {
        if (com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME.equals(str)) {
            return android.content.res.Resources.getSystem();
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            new java.lang.Object[]{str};
            return null;
        }
    }

    public void addToShortcutIntent(android.content.Intent intent, android.graphics.drawable.Drawable drawable, android.content.Context context) {
        android.graphics.Bitmap bitmap;
        checkResource(context);
        int i = this.mType;
        if (i == 1) {
            bitmap = (android.graphics.Bitmap) this.getHighSpeedVideoSizes;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                android.content.Context createPackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(createPackageContext, this.mInt1));
                    return;
                }
                android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(createPackageContext, this.mInt1);
                if (drawable2.getIntrinsicWidth() > 0 && drawable2.getIntrinsicHeight() > 0) {
                    bitmap = android.graphics.Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                    drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    drawable2.draw(new android.graphics.Canvas(bitmap));
                }
                int launcherLargeIconSize = ((android.app.ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = android.graphics.Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, android.graphics.Bitmap.Config.ARGB_8888);
                drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                drawable2.draw(new android.graphics.Canvas(bitmap));
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't find package ");
                sb.append(this.getHighSpeedVideoSizes);
                throw new java.lang.IllegalArgumentException(sb.toString(), e);
            }
        } else if (i == 5) {
            bitmap = Camera2StreamConfigurationMap((android.graphics.Bitmap) this.getHighSpeedVideoSizes, true);
        } else {
            throw new java.lang.IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new android.graphics.Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        switch (this.mType) {
            case -1:
                bundle.putParcelable("obj", (android.os.Parcelable) this.getHighSpeedVideoSizes);
                break;
            case 0:
            default:
                throw new java.lang.IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (android.graphics.Bitmap) this.getHighSpeedVideoSizes);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (java.lang.String) this.getHighSpeedVideoSizes);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.getHighSpeedVideoSizes);
                break;
        }
        bundle.putInt("type", this.mType);
        bundle.putInt("int1", this.mInt1);
        bundle.putInt("int2", this.mInt2);
        bundle.putString("string1", this.mString1);
        android.content.res.ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = this.getHighResolutionOutputSizeshNQ4ISI;
        if (mode != Camera2StreamConfigurationMap) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public java.lang.String toString() {
        if (this.mType == -1) {
            return java.lang.String.valueOf(this.getHighSpeedVideoSizes);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        sb.append(getHighResolutionOutputSizeshNQ4ISI(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.getHighSpeedVideoSizes).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.getHighSpeedVideoSizes).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.mString1);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(getResId())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb.append(" off=");
                    sb.append(this.mInt2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.getHighSpeedVideoSizes);
                break;
        }
        if (this.mTintList != null) {
            sb.append(" tint=");
            sb.append(this.mTintList);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != Camera2StreamConfigurationMap) {
            sb.append(" mode=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        this.mTintModeStr = this.getHighResolutionOutputSizeshNQ4ISI.name();
        switch (this.mType) {
            case -1:
                if (z) {
                    throw new java.lang.IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.mParcelable = (android.os.Parcelable) this.getHighSpeedVideoSizes;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.getHighSpeedVideoSizes;
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.mData = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.mParcelable = (android.os.Parcelable) this.getHighSpeedVideoSizes;
                return;
            case 2:
                this.mData = ((java.lang.String) this.getHighSpeedVideoSizes).getBytes(java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16));
                return;
            case 3:
                this.mData = (byte[]) this.getHighSpeedVideoSizes;
                return;
            case 4:
            case 6:
                this.mData = this.getHighSpeedVideoSizes.toString().getBytes(java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16));
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.getHighResolutionOutputSizeshNQ4ISI = android.graphics.PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                android.os.Parcelable parcelable = this.mParcelable;
                if (parcelable != null) {
                    this.getHighSpeedVideoSizes = parcelable;
                    return;
                }
                throw new java.lang.IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = this.mParcelable;
                if (parcelable2 != null) {
                    this.getHighSpeedVideoSizes = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.getHighSpeedVideoSizes = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                java.lang.String str = new java.lang.String(this.mData, java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16));
                this.getHighSpeedVideoSizes = str;
                if (this.mType == 2 && this.mString1 == null) {
                    this.mString1 = str.split(io.ktor.sse.ServerSentEventKt.COLON, -1)[0];
                    return;
                }
                return;
            case 3:
                this.getHighSpeedVideoSizes = this.mData;
                return;
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static androidx.core.graphics.drawable.IconCompat createFromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt("type");
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(i);
        iconCompat.mInt1 = bundle.getInt("int1");
        iconCompat.mInt2 = bundle.getInt("int2");
        iconCompat.mString1 = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.mTintList = (android.content.res.ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.getHighResolutionOutputSizeshNQ4ISI = android.graphics.PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.getHighSpeedVideoSizes = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
            case 6:
                iconCompat.getHighSpeedVideoSizes = bundle.getString("obj");
                break;
            case 3:
                iconCompat.getHighSpeedVideoSizes = bundle.getByteArray("obj");
                break;
        }
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.content.Context context, android.graphics.drawable.Icon icon) {
        androidx.core.util.Preconditions.checkNotNull(icon);
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighSpeedVideoSizes(context, icon);
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.graphics.drawable.Icon icon) {
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(icon);
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIconOrNullIfZeroResId(android.graphics.drawable.Icon icon) {
        if (androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighSpeedVideoSizes(icon) == 2 && androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighSpeedVideoFpsRanges(icon) == 0) {
            return null;
        }
        return androidx.core.graphics.drawable.IconCompat.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(icon);
    }

    static android.graphics.Bitmap Camera2StreamConfigurationMap(android.graphics.Bitmap bitmap, boolean z) {
        int min = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(min, min, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getResPackage();
        }

        static int Camera2StreamConfigurationMap(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getType();
        }

        static int getHighSpeedVideoSizes(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getResId();
        }

        static android.net.Uri getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getUri();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.graphics.drawable.Icon getHighSpeedVideoFpsRanges(android.graphics.Bitmap bitmap) {
            return android.graphics.drawable.Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static android.graphics.drawable.Icon Camera2StreamConfigurationMap(android.net.Uri uri) {
            return android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static androidx.core.graphics.drawable.IconCompat getHighSpeedVideoSizes(android.content.Context context, android.graphics.drawable.Icon icon) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes(icon);
            if (highSpeedVideoSizes == 2) {
                java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(icon);
                try {
                    return androidx.core.graphics.drawable.IconCompat.createWithResource(androidx.core.graphics.drawable.IconCompat.getHighSpeedVideoFpsRanges(context, Camera2StreamConfigurationMap), Camera2StreamConfigurationMap, getHighSpeedVideoFpsRanges(icon));
                } catch (android.content.res.Resources.NotFoundException unused) {
                    throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (highSpeedVideoSizes == 4) {
                return androidx.core.graphics.drawable.IconCompat.createWithContentUri(getHighSpeedVideoFpsRangesFor(icon));
            }
            if (highSpeedVideoSizes == 6) {
                return androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(getHighSpeedVideoFpsRangesFor(icon));
            }
            androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(-1);
            iconCompat.getHighSpeedVideoSizes = icon;
            return iconCompat;
        }

        static int getHighSpeedVideoSizes(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.Api28Impl.Camera2StreamConfigurationMap(obj);
            }
            try {
                return ((java.lang.Integer) obj.getClass().getMethod("getType", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return -1;
            }
        }

        static java.lang.String Camera2StreamConfigurationMap(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.Api28Impl.getHighSpeedVideoFpsRangesFor(obj);
            }
            try {
                return (java.lang.String) obj.getClass().getMethod("getResPackage", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }

        static androidx.core.graphics.drawable.IconCompat getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            androidx.core.util.Preconditions.checkNotNull(obj);
            int highSpeedVideoSizes = getHighSpeedVideoSizes(obj);
            if (highSpeedVideoSizes == 2) {
                return androidx.core.graphics.drawable.IconCompat.createWithResource(null, Camera2StreamConfigurationMap(obj), getHighSpeedVideoFpsRanges(obj));
            }
            if (highSpeedVideoSizes == 4) {
                return androidx.core.graphics.drawable.IconCompat.createWithContentUri(getHighSpeedVideoFpsRangesFor(obj));
            }
            if (highSpeedVideoSizes == 6) {
                return androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmapContentUri(getHighSpeedVideoFpsRangesFor(obj));
            }
            androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(-1);
            iconCompat.getHighSpeedVideoSizes = obj;
            return iconCompat;
        }

        static int getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.Api28Impl.getHighSpeedVideoSizes(obj);
            }
            try {
                return ((java.lang.Integer) obj.getClass().getMethod("getResId", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return 0;
            }
        }

        static android.net.Uri getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.Api28Impl.getHighSpeedVideoFpsRanges(obj);
            }
            try {
                return (android.net.Uri) obj.getClass().getMethod("getUri", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }

        static android.graphics.drawable.Icon getHighResolutionOutputSizeshNQ4ISI(androidx.core.graphics.drawable.IconCompat iconCompat, android.content.Context context) {
            android.graphics.drawable.Icon createWithBitmap;
            switch (iconCompat.mType) {
                case -1:
                    return (android.graphics.drawable.Icon) iconCompat.getHighSpeedVideoSizes;
                case 0:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = android.graphics.drawable.Icon.createWithBitmap((android.graphics.Bitmap) iconCompat.getHighSpeedVideoSizes);
                    break;
                case 2:
                    createWithBitmap = android.graphics.drawable.Icon.createWithResource(iconCompat.getResPackage(), iconCompat.mInt1);
                    break;
                case 3:
                    createWithBitmap = android.graphics.drawable.Icon.createWithData((byte[]) iconCompat.getHighSpeedVideoSizes, iconCompat.mInt1, iconCompat.mInt2);
                    break;
                case 4:
                    createWithBitmap = android.graphics.drawable.Icon.createWithContentUri((java.lang.String) iconCompat.getHighSpeedVideoSizes);
                    break;
                case 5:
                    createWithBitmap = androidx.core.graphics.drawable.IconCompat.Api26Impl.getHighSpeedVideoFpsRanges((android.graphics.Bitmap) iconCompat.getHighSpeedVideoSizes);
                    break;
                case 6:
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        createWithBitmap = androidx.core.graphics.drawable.IconCompat.Api30Impl.Camera2StreamConfigurationMap(iconCompat.getUri());
                        break;
                    } else {
                        if (context == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Context is required to resolve the file uri of the icon: ");
                            sb.append(iconCompat.getUri());
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        java.io.InputStream uriInputStream = iconCompat.getUriInputStream(context);
                        if (uriInputStream == null) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot load adaptive icon from uri: ");
                            sb2.append(iconCompat.getUri());
                            throw new java.lang.IllegalStateException(sb2.toString());
                        }
                        createWithBitmap = androidx.core.graphics.drawable.IconCompat.Api26Impl.getHighSpeedVideoFpsRanges(android.graphics.BitmapFactory.decodeStream(uriInputStream));
                        break;
                    }
            }
            if (iconCompat.mTintList != null) {
                createWithBitmap.setTintList(iconCompat.mTintList);
            }
            if (iconCompat.getHighResolutionOutputSizeshNQ4ISI != androidx.core.graphics.drawable.IconCompat.Camera2StreamConfigurationMap) {
                createWithBitmap.setTintMode(iconCompat.getHighResolutionOutputSizeshNQ4ISI);
            }
            return createWithBitmap;
        }
    }
}
