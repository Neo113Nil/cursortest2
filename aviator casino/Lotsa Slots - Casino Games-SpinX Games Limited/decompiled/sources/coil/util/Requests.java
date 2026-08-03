package coil.util;

/* compiled from: Requests.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u000b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\f\u001a\u00020\r*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"DEFAULT_REQUEST_OPTIONS", "Lcoil/request/DefaultRequestOptions;", "getDEFAULT_REQUEST_OPTIONS", "()Lcoil/request/DefaultRequestOptions;", "getDrawableCompat", "Landroid/graphics/drawable/Drawable;", "Lcoil/request/ImageRequest;", "drawable", "resId", "", com.unity3d.ads.BuildConfig.FLAVOR, "(Lcoil/request/ImageRequest;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "allowInexactSize", "", "getAllowInexactSize", "(Lcoil/request/ImageRequest;)Z", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: coil.util.-Requests, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Requests {
    private static final coil.request.DefaultRequestOptions DEFAULT_REQUEST_OPTIONS = new coil.request.DefaultRequestOptions(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, androidx.compose.ui.layout.LayoutKt.LargeDimension, null);

    /* compiled from: Requests.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: coil.util.-Requests$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[coil.size.Precision.values().length];
            try {
                iArr[coil.size.Precision.EXACT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[coil.size.Precision.INEXACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[coil.size.Precision.AUTOMATIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final coil.request.DefaultRequestOptions getDEFAULT_REQUEST_OPTIONS() {
        return DEFAULT_REQUEST_OPTIONS;
    }

    public static final android.graphics.drawable.Drawable getDrawableCompat(coil.request.ImageRequest imageRequest, android.graphics.drawable.Drawable drawable, java.lang.Integer num, android.graphics.drawable.Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return coil.util.Contexts.getDrawableCompat(imageRequest.getContext(), num.intValue());
    }

    public static final boolean getAllowInexactSize(coil.request.ImageRequest imageRequest) {
        int i = coil.util.Requests.WhenMappings.$EnumSwitchMapping$0[imageRequest.getPrecision().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if ((imageRequest.getDefined().getSizeResolver() != null || !(imageRequest.getSizeResolver() instanceof coil.size.DisplaySizeResolver)) && (!(imageRequest.getTarget() instanceof coil.target.ViewTarget) || !(imageRequest.getSizeResolver() instanceof coil.size.ViewSizeResolver) || !(((coil.target.ViewTarget) imageRequest.getTarget()).getView() instanceof android.widget.ImageView) || ((coil.target.ViewTarget) imageRequest.getTarget()).getView() != ((coil.size.ViewSizeResolver) imageRequest.getSizeResolver()).getView())) {
                return false;
            }
        }
        return true;
    }
}
